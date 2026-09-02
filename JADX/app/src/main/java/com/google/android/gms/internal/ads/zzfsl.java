package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfsl<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable zza = new zzfsj(null);
    private static final Runnable zzb = new zzfsj(null);

    zzfsl() {
    }

    private final void zzb(Thread thread) {
        Runnable runnable = get();
        zzfsi zzfsiVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzfsi)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzfsiVar = (zzfsi) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzfsiVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        T tZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z = !zzd();
            if (z) {
                try {
                    tZza = zza();
                } catch (Throwable th) {
                    if (!compareAndSet(threadCurrentThread, zza)) {
                        zzb(threadCurrentThread);
                    }
                    zzg(th);
                    return;
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzb(threadCurrentThread);
            }
            if (z) {
                zzf(tZza);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = get();
        if (runnable == zza) {
            string = "running=[DONE]";
        } else if (runnable instanceof zzfsi) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strZzc = zzc();
        StringBuilder sb2 = new StringBuilder(string.length() + 2 + String.valueOf(strZzc).length());
        sb2.append(string);
        sb2.append(", ");
        sb2.append(strZzc);
        return sb2.toString();
    }

    abstract T zza() throws Exception;

    abstract String zzc();

    abstract boolean zzd();

    abstract void zzf(T t);

    abstract void zzg(Throwable th);

    final void zzh() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            zzfsi zzfsiVar = new zzfsi(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzfsiVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (getAndSet(zza) == zzb) {
                    }
                } finally {
                    if (getAndSet(zza) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }
}
