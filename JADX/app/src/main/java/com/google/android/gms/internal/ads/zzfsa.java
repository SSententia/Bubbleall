package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfsa<V> implements Runnable {
    final Future<V> zza;
    final zzfrz<? super V> zzb;

    zzfsa(Future<V> future, zzfrz<? super V> zzfrzVar) {
        this.zza = future;
        this.zzb = zzfrzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Future<V> future = this.zza;
        if ((future instanceof zzfte) && (thZza = zzftf.zza((zzfte) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzfsd.zzq(this.zza));
        } catch (Error e) {
            e = e;
            this.zzb.zza(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.zzb.zza(e);
        } catch (ExecutionException e3) {
            this.zzb.zza(e3.getCause());
        }
    }

    public final String toString() {
        zzflr zzflrVarZza = zzfls.zza(this);
        zzflrVarZza.zza(this.zzb);
        return zzflrVarZza.toString();
    }
}
