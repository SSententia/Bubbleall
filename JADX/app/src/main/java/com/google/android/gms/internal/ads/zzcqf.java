package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcqf implements zzdwr {
    private final Context zza;
    private final zzbqm zzb;
    private final zzcqu zzc;
    private final zzcqf zzd = this;
    private final zzgln<zzdwr> zze;
    private final zzgln<zzbqm> zzf;
    private final zzgln<zzdwm> zzg;
    private final zzgln<zzdwo> zzh;

    /* synthetic */ zzcqf(zzcqu zzcquVar, Context context, zzbqm zzbqmVar, zzcql zzcqlVar) {
        this.zzc = zzcquVar;
        this.zza = context;
        this.zzb = zzbqmVar;
        zzgla zzglaVarZza = zzglb.zza(this);
        this.zze = zzglaVarZza;
        zzgla zzglaVarZza2 = zzglb.zza(zzbqmVar);
        this.zzf = zzglaVarZza2;
        zzdwn zzdwnVar = new zzdwn(zzglaVarZza2);
        this.zzg = zzdwnVar;
        this.zzh = zzgkz.zza(new zzdwp(zzglaVarZza, zzdwnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdwr
    public final zzdwo zzc() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdwr
    public final zzdwi zzd() {
        return new zzcqc(this.zzc, this.zzd, null);
    }
}
