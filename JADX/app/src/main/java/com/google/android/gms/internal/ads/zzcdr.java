package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcdr implements zzfrz<Void> {
    final /* synthetic */ zzfsm zza;

    zzcdr(zzcds zzcdsVar, zzfsm zzfsmVar) {
        this.zza = zzfsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzcds.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(Void r2) {
        zzcds.zzc.remove(this.zza);
    }
}
