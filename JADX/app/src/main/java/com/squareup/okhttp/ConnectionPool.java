package com.squareup.okhttp;

import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionPool {
    private static final long DEFAULT_KEEP_ALIVE_DURATION_MS = 300000;
    private static final ConnectionPool systemDefault;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;
    private final LinkedList<Connection> connections = new LinkedList<>();
    private Executor executor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
    private final Runnable connectionsCleanupRunnable = new Runnable() { // from class: com.squareup.okhttp.ConnectionPool.1
        @Override // java.lang.Runnable
        public void run() {
            ConnectionPool.this.runCleanupUntilPoolIsEmpty();
        }
    };

    static {
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long j = property2 != null ? Long.parseLong(property2) : 300000L;
        if (property != null && !Boolean.parseBoolean(property)) {
            systemDefault = new ConnectionPool(0, j);
        } else if (property3 != null) {
            systemDefault = new ConnectionPool(Integer.parseInt(property3), j);
        } else {
            systemDefault = new ConnectionPool(5, j);
        }
    }

    public ConnectionPool(int i, long j) {
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = j * 1000000;
    }

    public static ConnectionPool getDefault() {
        return systemDefault;
    }

    public synchronized int getConnectionCount() {
        return this.connections.size();
    }

    @Deprecated
    public synchronized int getSpdyConnectionCount() {
        return getMultiplexedConnectionCount();
    }

    public synchronized int getMultiplexedConnectionCount() {
        int i;
        Iterator<Connection> it = this.connections.iterator();
        i = 0;
        while (it.hasNext()) {
            if (it.next().isFramed()) {
                i++;
            }
        }
        return i;
    }

    public synchronized int getHttpConnectionCount() {
        return this.connections.size() - getMultiplexedConnectionCount();
    }

    public synchronized Connection get(Address address) {
        Connection connectionPrevious;
        LinkedList<Connection> linkedList = this.connections;
        ListIterator<Connection> listIterator = linkedList.listIterator(linkedList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                connectionPrevious = null;
                break;
            }
            connectionPrevious = listIterator.previous();
            if (connectionPrevious.getRoute().getAddress().equals(address) && connectionPrevious.isAlive() && System.nanoTime() - connectionPrevious.getIdleStartTimeNs() < this.keepAliveDurationNs) {
                listIterator.remove();
                if (connectionPrevious.isFramed()) {
                    break;
                }
                try {
                    Platform.get().tagSocket(connectionPrevious.getSocket());
                    break;
                } catch (SocketException e) {
                    Util.closeQuietly(connectionPrevious.getSocket());
                    Platform.get().logW("Unable to tagSocket(): " + e);
                }
            }
        }
        if (connectionPrevious != null && connectionPrevious.isFramed()) {
            this.connections.addFirst(connectionPrevious);
        }
        return connectionPrevious;
    }

    void recycle(Connection connection) {
        if (!connection.isFramed() && connection.clearOwner()) {
            if (!connection.isAlive()) {
                Util.closeQuietly(connection.getSocket());
                return;
            }
            try {
                Platform.get().untagSocket(connection.getSocket());
                synchronized (this) {
                    addConnection(connection);
                    connection.incrementRecycleCount();
                    connection.resetIdleStartTime();
                }
            } catch (SocketException e) {
                Platform.get().logW("Unable to untagSocket(): " + e);
                Util.closeQuietly(connection.getSocket());
            }
        }
    }

    private void addConnection(Connection connection) {
        boolean zIsEmpty = this.connections.isEmpty();
        this.connections.addFirst(connection);
        if (zIsEmpty) {
            this.executor.execute(this.connectionsCleanupRunnable);
        } else {
            notifyAll();
        }
    }

    void share(Connection connection) {
        if (!connection.isFramed()) {
            throw new IllegalArgumentException();
        }
        if (connection.isAlive()) {
            synchronized (this) {
                addConnection(connection);
            }
        }
    }

    public void evictAll() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.connections);
            this.connections.clear();
            notifyAll();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Util.closeQuietly(((Connection) arrayList.get(i)).getSocket());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runCleanupUntilPoolIsEmpty() {
        while (performCleanup()) {
        }
    }

    boolean performCleanup() {
        synchronized (this) {
            if (this.connections.isEmpty()) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            long jNanoTime = System.nanoTime();
            long jMin = this.keepAliveDurationNs;
            LinkedList<Connection> linkedList = this.connections;
            ListIterator<Connection> listIterator = linkedList.listIterator(linkedList.size());
            int i = 0;
            while (listIterator.hasPrevious()) {
                Connection connectionPrevious = listIterator.previous();
                long idleStartTimeNs = (connectionPrevious.getIdleStartTimeNs() + this.keepAliveDurationNs) - jNanoTime;
                if (idleStartTimeNs <= 0 || !connectionPrevious.isAlive()) {
                    listIterator.remove();
                    arrayList.add(connectionPrevious);
                } else if (connectionPrevious.isIdle()) {
                    i++;
                    jMin = Math.min(jMin, idleStartTimeNs);
                }
            }
            LinkedList<Connection> linkedList2 = this.connections;
            ListIterator<Connection> listIterator2 = linkedList2.listIterator(linkedList2.size());
            while (listIterator2.hasPrevious() && i > this.maxIdleConnections) {
                Connection connectionPrevious2 = listIterator2.previous();
                if (connectionPrevious2.isIdle()) {
                    arrayList.add(connectionPrevious2);
                    listIterator2.remove();
                    i--;
                }
            }
            if (arrayList.isEmpty()) {
                try {
                    long j = jMin / 1000000;
                    Long.signum(j);
                    wait(j, (int) (jMin - (1000000 * j)));
                    return true;
                } catch (InterruptedException unused) {
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Util.closeQuietly(((Connection) arrayList.get(i2)).getSocket());
            }
            return true;
        }
    }

    void replaceCleanupExecutorForTests(Executor executor) {
        this.executor = executor;
    }

    synchronized List<Connection> getConnections() {
        return new ArrayList(this.connections);
    }
}
