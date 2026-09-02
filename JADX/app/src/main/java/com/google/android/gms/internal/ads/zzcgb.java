package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcgb extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcge zza;

    zzcgb(zzcge zzcgeVar) {
        this.zza = zzcgeVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzbjo zzbjoVar = new zzbjo(this.zza.zze, this.zza.zzf.zza);
        synchronized (this.zza.zza) {
            try {
                com.google.android.gms.ads.internal.zzt.zzl();
                zzbjr.zza(this.zza.zzg, zzbjoVar);
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Cannot config CSI reporter.", e);
            }
        }
    }
}
