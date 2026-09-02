package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcqc implements zzdwi {
    private final zzcqu zza;
    private final zzcqf zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcqc(zzcqu zzcquVar, zzcqf zzcqfVar, zzcql zzcqlVar) {
        this.zza = zzcquVar;
        this.zzb = zzcqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwi
    public final zzdwj zza() {
        zzgli.zzc(this.zzc, Long.class);
        zzgli.zzc(this.zzd, String.class);
        return new zzcqd(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdwi
    public final /* bridge */ /* synthetic */ zzdwi zzb(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdwi
    public final /* bridge */ /* synthetic */ zzdwi zzc(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }
}
