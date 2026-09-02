package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcte implements zzfrz<String> {
    final /* synthetic */ String zza;
    final /* synthetic */ zzctf zzb;

    zzcte(zzctf zzctfVar, String str) {
        this.zzb = zzctfVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        this.zzb.zzh.zza(this.zzb.zzg.zzb(this.zzb.zze, this.zzb.zzf, false, this.zza, null, this.zzb.zzf.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(String str) {
        this.zzb.zzh.zza(this.zzb.zzg.zzb(this.zzb.zze, this.zzb.zzf, false, this.zza, str, this.zzb.zzf.zzd));
    }
}
