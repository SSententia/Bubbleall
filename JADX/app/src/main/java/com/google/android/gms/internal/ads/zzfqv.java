package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfqv<V, X extends Throwable, F, T> extends zzfrt<V> implements Runnable {

    @CheckForNull
    zzfsm<? extends V> zza;

    @CheckForNull
    Class<X> zzb;

    @CheckForNull
    F zzc;

    zzfqv(zzfsm<? extends V> zzfsmVar, Class<X> cls, F f) {
        zzfsmVar.getClass();
        this.zza = zzfsmVar;
        this.zzb = cls;
        f.getClass();
        this.zzc = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objZzq;
        zzfsm<? extends V> zzfsmVar = this.zza;
        Class<X> cls = this.zzb;
        F f = this.zzc;
        if (((f == null) || ((zzfsmVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r3 = (Class<X>) null;
        this.zza = null;
        try {
            th = zzfsmVar instanceof zzfte ? ((zzfte) zzfsmVar).zzu() : null;
            objZzq = th == null ? zzfsd.zzq(zzfsmVar) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(zzfsmVar.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 35 + String.valueOf(strValueOf2).length());
                sb.append("Future type ");
                sb.append(strValueOf);
                sb.append(" threw ");
                sb.append(strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            zzp(objZzq);
            return;
        }
        if (!cls.isInstance(th)) {
            zzr(zzfsmVar);
            return;
        }
        try {
            Object objZzb = zzb(f, th);
            this.zzb = null;
            this.zzc = null;
            zza(objZzb);
        } catch (Throwable th2) {
            try {
                zzq(th2);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    abstract void zza(T t);

    abstract T zzb(F f, X x) throws Exception;

    @Override // com.google.android.gms.internal.ads.zzfqw
    @CheckForNull
    protected final String zzc() {
        String string;
        zzfsm<? extends V> zzfsmVar = this.zza;
        Class<X> cls = this.zzb;
        F f = this.zzc;
        String strZzc = super.zzc();
        if (zzfsmVar != null) {
            String string2 = zzfsmVar.toString();
            StringBuilder sb = new StringBuilder(string2.length() + 16);
            sb.append("inputFuture=[");
            sb.append(string2);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (cls == null || f == null) {
            if (strZzc != null) {
                return strZzc.length() != 0 ? string.concat(strZzc) : new String(string);
            }
            return null;
        }
        String string3 = cls.toString();
        String string4 = f.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 29 + string3.length() + string4.length());
        sb2.append(string);
        sb2.append("exceptionType=[");
        sb2.append(string3);
        sb2.append("], fallback=[");
        sb2.append(string4);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    protected final void zzd() {
        zzv(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
