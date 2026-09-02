package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfra<I, O, F, T> extends zzfrt<O> implements Runnable {
    public static final /* synthetic */ int zzc = 0;

    @CheckForNull
    zzfsm<? extends I> zza;

    @CheckForNull
    F zzb;

    zzfra(zzfsm<? extends I> zzfsmVar, F f) {
        zzfsmVar.getClass();
        this.zza = zzfsmVar;
        f.getClass();
        this.zzb = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzfsm<? extends I> zzfsmVar = this.zza;
        F f = this.zzb;
        if ((isCancelled() | (zzfsmVar == null)) || (f == null)) {
            return;
        }
        this.zza = null;
        if (zzfsmVar.isCancelled()) {
            zzr(zzfsmVar);
            return;
        }
        try {
            try {
                Object objZzb = zzb(f, zzfsd.zzq(zzfsmVar));
                this.zzb = null;
                zza(objZzb);
            } catch (Throwable th) {
                try {
                    zzq(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzq(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            zzq(e2);
        } catch (ExecutionException e3) {
            zzq(e3.getCause());
        }
    }

    abstract void zza(T t);

    abstract T zzb(F f, I i) throws Exception;

    @Override // com.google.android.gms.internal.ads.zzfqw
    @CheckForNull
    protected final String zzc() {
        String string;
        zzfsm<? extends I> zzfsmVar = this.zza;
        F f = this.zzb;
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
        if (f == null) {
            if (strZzc != null) {
                return strZzc.length() != 0 ? string.concat(strZzc) : new String(string);
            }
            return null;
        }
        String string3 = f.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 11 + string3.length());
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(string3);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    protected final void zzd() {
        zzv(this.zza);
        this.zza = null;
        this.zzb = null;
    }
}
