package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcqd implements zzdwj {
    private final Long zza;
    private final String zzb;
    private final zzcqu zzc;
    private final zzcqf zzd;
    private final zzcqd zze = this;

    /* synthetic */ zzcqd(zzcqu zzcquVar, zzcqf zzcqfVar, Long l, String str, zzcql zzcqlVar) {
        this.zzc = zzcquVar;
        this.zzd = zzcqfVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdwj
    public final zzdwt zza() {
        return zzdwu.zza(this.zza.longValue(), this.zzd.zza, zzdwn.zzc(this.zzd.zzb), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdwj
    public final zzdwx zzb() {
        return zzdwy.zza(this.zza.longValue(), this.zzd.zza, zzdwn.zzc(this.zzd.zzb), this.zzc, this.zzb);
    }
}
