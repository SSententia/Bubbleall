package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfqy<I, O> extends zzfra<I, O, zzfrk<? super I, ? extends O>, zzfsm<? extends O>> {
    zzfqy(zzfsm<? extends I> zzfsmVar, zzfrk<? super I, ? extends O> zzfrkVar) {
        super(zzfsmVar, zzfrkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzr((zzfsm) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    final /* bridge */ /* synthetic */ Object zzb(Object obj, Object obj2) throws Exception {
        zzfrk zzfrkVar = (zzfrk) obj;
        zzfsm<O> zzfsmVarZza = zzfrkVar.zza(obj2);
        zzflx.zzd(zzfsmVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfrkVar);
        return zzfsmVarZza;
    }
}
