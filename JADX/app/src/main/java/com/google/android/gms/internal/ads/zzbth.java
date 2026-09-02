package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbth implements zzchp<zzbsn> {
    final /* synthetic */ zzbtr zza;
    final /* synthetic */ zzbts zzb;

    zzbth(zzbts zzbtsVar, zzbtr zzbtrVar) {
        this.zzb = zzbtsVar;
        this.zza = zzbtrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchp
    public final /* bridge */ /* synthetic */ void zza(zzbsn zzbsnVar) {
        synchronized (this.zzb.zza) {
            this.zzb.zzh = 0;
            if (this.zzb.zzg != null && this.zza != this.zzb.zzg) {
                com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzb.zzg.zzc();
            }
            this.zzb.zzg = this.zza;
        }
    }
}
