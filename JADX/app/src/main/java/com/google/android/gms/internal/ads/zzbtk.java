package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbtk implements zzchp<zzbtt> {
    final /* synthetic */ zzbtm zza;

    zzbtk(zzbtm zzbtmVar) {
        this.zza = zzbtmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchp
    public final /* bridge */ /* synthetic */ void zza(zzbtt zzbttVar) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb.zzb();
    }
}
