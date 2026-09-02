package com.squareup.okhttp;

import com.squareup.okhttp.internal.ConnectionSpecSelector;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.FramedConnection;
import com.squareup.okhttp.internal.http.FramedTransport;
import com.squareup.okhttp.internal.http.HttpConnection;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpTransport;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.Transport;
import com.squareup.okhttp.internal.tls.OkHostnameVerifier;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Source;

/* JADX INFO: loaded from: classes2.dex */
public final class Connection {
    private FramedConnection framedConnection;
    private Handshake handshake;
    private HttpConnection httpConnection;
    private long idleStartTimeNs;
    private Object owner;
    private final ConnectionPool pool;
    private int recycleCount;
    private final Route route;
    private Socket socket;
    private boolean connected = false;
    private Protocol protocol = Protocol.HTTP_1_1;

    public Connection(ConnectionPool connectionPool, Route route) {
        this.pool = connectionPool;
        this.route = route;
    }

    Object getOwner() {
        Object obj;
        synchronized (this.pool) {
            obj = this.owner;
        }
        return obj;
    }

    void setOwner(Object obj) {
        if (isFramed()) {
            return;
        }
        synchronized (this.pool) {
            if (this.owner != null) {
                throw new IllegalStateException("Connection already has an owner!");
            }
            this.owner = obj;
        }
    }

    boolean clearOwner() {
        synchronized (this.pool) {
            if (this.owner == null) {
                return false;
            }
            this.owner = null;
            return true;
        }
    }

    void closeIfOwnedBy(Object obj) throws IOException {
        if (isFramed()) {
            throw new IllegalStateException();
        }
        synchronized (this.pool) {
            if (this.owner != obj) {
                return;
            }
            this.owner = null;
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
            }
        }
    }

    void connect(int i, int i2, int i3, Request request, List<ConnectionSpec> list, boolean z) throws Throwable {
        if (this.connected) {
            throw new IllegalStateException("already connected");
        }
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(list);
        Proxy proxy = this.route.getProxy();
        Address address = this.route.getAddress();
        if (this.route.address.getSslSocketFactory() == null && !list.contains(ConnectionSpec.CLEARTEXT)) {
            throw new RouteException(new UnknownServiceException("CLEARTEXT communication not supported: " + list));
        }
        RouteException routeException = null;
        while (!this.connected) {
            try {
                this.socket = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? address.getSocketFactory().createSocket() : new Socket(proxy);
                connectSocket(i, i2, i3, request, connectionSpecSelector);
                this.connected = true;
            } catch (IOException e) {
                Util.closeQuietly(this.socket);
                this.socket = null;
                if (routeException == null) {
                    routeException = new RouteException(e);
                } else {
                    routeException.addConnectException(e);
                }
                if (z) {
                    if (!connectionSpecSelector.connectionFailed(e)) {
                        throw routeException;
                    }
                } else {
                    throw routeException;
                }
            }
        }
    }

    private void connectSocket(int i, int i2, int i3, Request request, ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        this.socket.setSoTimeout(i2);
        Platform.get().connectSocket(this.socket, this.route.getSocketAddress(), i);
        if (this.route.address.getSslSocketFactory() != null) {
            connectTls(i2, i3, request, connectionSpecSelector);
        }
        if (this.protocol == Protocol.SPDY_3 || this.protocol == Protocol.HTTP_2) {
            this.socket.setSoTimeout(0);
            FramedConnection framedConnectionBuild = new FramedConnection.Builder(this.route.address.uriHost, true, this.socket).protocol(this.protocol).build();
            this.framedConnection = framedConnectionBuild;
            framedConnectionBuild.sendConnectionPreface();
            return;
        }
        this.httpConnection = new HttpConnection(this.pool, this, this.socket);
    }

    private void connectTls(int i, int i2, Request request, ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        if (this.route.requiresTunnel()) {
            createTunnel(i, i2, request);
        }
        Address address = this.route.getAddress();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) address.getSslSocketFactory().createSocket(this.socket, address.getUriHost(), address.getUriPort(), true);
                try {
                    ConnectionSpec connectionSpecConfigureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                    if (connectionSpecConfigureSecureSocket.supportsTlsExtensions()) {
                        Platform.get().configureTlsExtensions(sSLSocket2, address.getUriHost(), address.getProtocols());
                    }
                    sSLSocket2.startHandshake();
                    Handshake handshake = Handshake.get(sSLSocket2.getSession());
                    if (!address.getHostnameVerifier().verify(address.getUriHost(), sSLSocket2.getSession())) {
                        X509Certificate x509Certificate = (X509Certificate) handshake.peerCertificates().get(0);
                        throw new SSLPeerUnverifiedException("Hostname " + address.getUriHost() + " not verified:\n    certificate: " + CertificatePinner.pin(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + OkHostnameVerifier.allSubjectAltNames(x509Certificate));
                    }
                    address.getCertificatePinner().check(address.getUriHost(), handshake.peerCertificates());
                    String selectedProtocol = connectionSpecConfigureSecureSocket.supportsTlsExtensions() ? Platform.get().getSelectedProtocol(sSLSocket2) : null;
                    this.protocol = selectedProtocol != null ? Protocol.get(selectedProtocol) : Protocol.HTTP_1_1;
                    this.handshake = handshake;
                    this.socket = sSLSocket2;
                    if (sSLSocket2 != null) {
                        Platform.get().afterHandshake(sSLSocket2);
                    }
                } catch (AssertionError e) {
                    e = e;
                    if (!Util.isAndroidGetsocknameError(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        Platform.get().afterHandshake(sSLSocket);
                    }
                    Util.closeQuietly((Socket) sSLSocket);
                    throw th;
                }
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void createTunnel(int i, int i2, Request request) throws IOException {
        Request requestCreateTunnelRequest = createTunnelRequest(request);
        HttpConnection httpConnection = new HttpConnection(this.pool, this, this.socket);
        httpConnection.setTimeouts(i, i2);
        HttpUrl httpUrl = requestCreateTunnelRequest.httpUrl();
        String str = "CONNECT " + httpUrl.host() + ":" + httpUrl.port() + " HTTP/1.1";
        do {
            httpConnection.writeRequest(requestCreateTunnelRequest.headers(), str);
            httpConnection.flush();
            Response responseBuild = httpConnection.readResponse().request(requestCreateTunnelRequest).build();
            long jContentLength = OkHeaders.contentLength(responseBuild);
            if (jContentLength == -1) {
                jContentLength = 0;
            }
            Source sourceNewFixedLengthSource = httpConnection.newFixedLengthSource(jContentLength);
            Util.skipAll(sourceNewFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            sourceNewFixedLengthSource.close();
            int iCode = responseBuild.code();
            if (iCode == 200) {
                if (httpConnection.bufferSize() > 0) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                return;
            } else if (iCode == 407) {
                requestCreateTunnelRequest = OkHeaders.processAuthHeader(this.route.getAddress().getAuthenticator(), responseBuild, this.route.getProxy());
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + responseBuild.code());
            }
        } while (requestCreateTunnelRequest != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    private Request createTunnelRequest(Request request) throws IOException {
        HttpUrl httpUrlBuild = new HttpUrl.Builder().scheme("https").host(request.httpUrl().host()).port(request.httpUrl().port()).build();
        Request.Builder builderHeader = new Request.Builder().url(httpUrlBuild).header("Host", Util.hostHeader(httpUrlBuild)).header("Proxy-Connection", "Keep-Alive");
        String strHeader = request.header("User-Agent");
        if (strHeader != null) {
            builderHeader.header("User-Agent", strHeader);
        }
        String strHeader2 = request.header("Proxy-Authorization");
        if (strHeader2 != null) {
            builderHeader.header("Proxy-Authorization", strHeader2);
        }
        return builderHeader.build();
    }

    void connectAndSetOwner(OkHttpClient okHttpClient, Object obj, Request request) throws Throwable {
        setOwner(obj);
        if (!isConnected()) {
            connect(okHttpClient.getConnectTimeout(), okHttpClient.getReadTimeout(), okHttpClient.getWriteTimeout(), request, this.route.address.getConnectionSpecs(), okHttpClient.getRetryOnConnectionFailure());
            if (isFramed()) {
                okHttpClient.getConnectionPool().share(this);
            }
            okHttpClient.routeDatabase().connected(getRoute());
        }
        setTimeouts(okHttpClient.getReadTimeout(), okHttpClient.getWriteTimeout());
    }

    boolean isConnected() {
        return this.connected;
    }

    public Route getRoute() {
        return this.route;
    }

    public Socket getSocket() {
        return this.socket;
    }

    BufferedSource rawSource() {
        HttpConnection httpConnection = this.httpConnection;
        if (httpConnection == null) {
            throw new UnsupportedOperationException();
        }
        return httpConnection.rawSource();
    }

    BufferedSink rawSink() {
        HttpConnection httpConnection = this.httpConnection;
        if (httpConnection == null) {
            throw new UnsupportedOperationException();
        }
        return httpConnection.rawSink();
    }

    boolean isAlive() {
        return (this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) ? false : true;
    }

    boolean isReadable() {
        HttpConnection httpConnection = this.httpConnection;
        if (httpConnection != null) {
            return httpConnection.isReadable();
        }
        return true;
    }

    void resetIdleStartTime() {
        if (this.framedConnection != null) {
            throw new IllegalStateException("framedConnection != null");
        }
        this.idleStartTimeNs = System.nanoTime();
    }

    boolean isIdle() {
        FramedConnection framedConnection = this.framedConnection;
        return framedConnection == null || framedConnection.isIdle();
    }

    long getIdleStartTimeNs() {
        FramedConnection framedConnection = this.framedConnection;
        return framedConnection == null ? this.idleStartTimeNs : framedConnection.getIdleStartTimeNs();
    }

    public Handshake getHandshake() {
        return this.handshake;
    }

    Transport newTransport(HttpEngine httpEngine) throws IOException {
        return this.framedConnection != null ? new FramedTransport(httpEngine, this.framedConnection) : new HttpTransport(httpEngine, this.httpConnection);
    }

    boolean isFramed() {
        return this.framedConnection != null;
    }

    public Protocol getProtocol() {
        return this.protocol;
    }

    void setProtocol(Protocol protocol) {
        if (protocol == null) {
            throw new IllegalArgumentException("protocol == null");
        }
        this.protocol = protocol;
    }

    void setTimeouts(int i, int i2) throws RouteException {
        if (!this.connected) {
            throw new IllegalStateException("setTimeouts - not connected");
        }
        if (this.httpConnection != null) {
            try {
                this.socket.setSoTimeout(i);
                this.httpConnection.setTimeouts(i, i2);
            } catch (IOException e) {
                throw new RouteException(e);
            }
        }
    }

    void incrementRecycleCount() {
        this.recycleCount++;
    }

    int recycleCount() {
        return this.recycleCount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.route.address.uriHost);
        sb.append(":");
        sb.append(this.route.address.uriPort);
        sb.append(", proxy=");
        sb.append(this.route.proxy);
        sb.append(" hostAddress=");
        sb.append(this.route.inetSocketAddress.getAddress().getHostAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        sb.append(handshake != null ? handshake.cipherSuite() : "none");
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }
}
