package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfqt<V, X extends Throwable> extends zzfqv<V, X, zzfrk<? super X, ? extends V>, zzfsm<? extends V>> {
    zzfqt(zzfsm<? extends V> zzfsmVar, Class<X> cls, zzfrk<? super X, ? extends V> zzfrkVar) {
        super(zzfsmVar, cls, zzfrkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfqv
    final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzr((zzfsm) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqv
    final /* bridge */ /* synthetic */ Object zzb(Object obj, Throwable th) throws Exception {
        zzfrk zzfrkVar = (zzfrk) obj;
        zzfsm zzfsmVarZza = zzfrkVar.zza(th);
        zzflx.zzd(zzfsmVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfrkVar);
        return zzfsmVarZza;
    }
}
