package androidx.media2.session;

import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class SequencedFutureManager implements Closeable {
    private static final boolean DEBUG = false;
    private static final String TAG = "SequencedFutureManager";
    private int mNextSequenceNumber;
    private final Object mLock = new Object();
    private ArrayMap<Integer, SequencedFuture<?>> mSeqToFutureMap = new ArrayMap<>();

    SequencedFutureManager() {
    }

    public int obtainNextSequenceNumber() {
        int i;
        synchronized (this.mLock) {
            i = this.mNextSequenceNumber;
            this.mNextSequenceNumber = i + 1;
        }
        return i;
    }

    public <T> SequencedFuture<T> createSequencedFuture(T t) {
        SequencedFuture<T> sequencedFutureCreate;
        synchronized (this.mLock) {
            int iObtainNextSequenceNumber = obtainNextSequenceNumber();
            sequencedFutureCreate = SequencedFuture.create(iObtainNextSequenceNumber, t);
            this.mSeqToFutureMap.put(Integer.valueOf(iObtainNextSequenceNumber), sequencedFutureCreate);
        }
        return sequencedFutureCreate;
    }

    public <T> void setFutureResult(int i, T t) {
        synchronized (this.mLock) {
            SequencedFuture<?> sequencedFutureRemove = this.mSeqToFutureMap.remove(Integer.valueOf(i));
            if (sequencedFutureRemove != null) {
                if (t == null || sequencedFutureRemove.getResultWhenClosed().getClass() == t.getClass()) {
                    sequencedFutureRemove.set(t);
                } else {
                    Log.w(TAG, "Type mismatch, expected " + sequencedFutureRemove.getResultWhenClosed().getClass() + ", but was " + t.getClass());
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mSeqToFutureMap.values());
            this.mSeqToFutureMap.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SequencedFuture) it.next()).setWithTheValueOfResultWhenClosed();
        }
    }

    static final class SequencedFuture<T> extends AbstractResolvableFuture<T> {
        private final T mResultWhenClosed;
        private final int mSequenceNumber;

        static <T> SequencedFuture<T> create(int i, T t) {
            return new SequencedFuture<>(i, t);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture
        public boolean set(T t) {
            return super.set(t);
        }

        void setWithTheValueOfResultWhenClosed() {
            set(this.mResultWhenClosed);
        }

        public int getSequenceNumber() {
            return this.mSequenceNumber;
        }

        public T getResultWhenClosed() {
            return this.mResultWhenClosed;
        }

        private SequencedFuture(int i, T t) {
            this.mSequenceNumber = i;
            this.mResultWhenClosed = t;
        }
    }
}
