package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcpy implements zzewm {
    private final Context zza;
    private final zzbdl zzb;
    private final String zzc;
    private final zzcqu zzd;
    private final zzcpy zze = this;
    private final zzgln<Context> zzf;
    private final zzgln<zzbdl> zzg;
    private final zzgln<zzeli> zzh;
    private final zzgln<zzelm> zzi;
    private final zzgln<zzewj> zzj;

    /* synthetic */ zzcpy(zzcqu zzcquVar, Context context, String str, zzbdl zzbdlVar, zzcql zzcqlVar) {
        this.zzd = zzcquVar;
        this.zza = context;
        this.zzb = zzbdlVar;
        this.zzc = str;
        zzgla zzglaVarZza = zzglb.zza(context);
        this.zzf = zzglaVarZza;
        zzgla zzglaVarZza2 = zzglb.zza(zzbdlVar);
        this.zzg = zzglaVarZza2;
        zzgln<zzeli> zzglnVarZza = zzgkz.zza(new zzelj(zzcquVar.zzo));
        this.zzh = zzglnVarZza;
        zzgln<zzelm> zzglnVarZza2 = zzgkz.zza(zzelo.zza());
        this.zzi = zzglnVarZza2;
        this.zzj = zzgkz.zza(new zzewk(zzglaVarZza, zzcquVar.zzp, zzglaVarZza2, zzcquVar.zzN, zzglnVarZza, zzglnVarZza2, zzfat.zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzewm
    public final zzeko zza() {
        return new zzeko(this.zza, this.zzb, this.zzc, this.zzj.zzb(), this.zzh.zzb());
    }
}
