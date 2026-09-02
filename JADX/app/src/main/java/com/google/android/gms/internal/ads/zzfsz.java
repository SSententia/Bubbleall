package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfsz extends zzfsl<zzfsm> {
    final /* synthetic */ zzftb zza;
    private final zzfrj zzb;

    zzfsz(zzftb zzftbVar, zzfrj zzfrjVar) {
        this.zza = zzftbVar;
        zzfrjVar.getClass();
        this.zzb = zzfrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final /* bridge */ /* synthetic */ zzfsm zza() throws Exception {
        zzfsm zzfsmVarZza = this.zzb.zza();
        zzflx.zzd(zzfsmVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zzfsmVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final /* bridge */ /* synthetic */ void zzf(zzfsm zzfsmVar) {
        this.zza.zzr(zzfsmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final void zzg(Throwable th) {
        this.zza.zzq(th);
    }
}
