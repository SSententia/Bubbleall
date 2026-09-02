package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcpt implements zzeuy {
    private final zzcqu zza;
    private final zzcpt zzb = this;
    private final zzgln<Context> zzc;
    private final zzgln<String> zzd;
    private final zzgln<zzexo<zzcuk, zzcuq>> zze;
    private final zzgln<zzevv> zzf;
    private final zzgln<zzeup> zzg;
    private final zzgln<zzeuv> zzh;
    private final zzgln<zzexo<zzcuv, zzcva>> zzi;
    private final zzgln<zzevx> zzj;
    private final zzgln<zzewd> zzk;

    /* synthetic */ zzcpt(zzcqu zzcquVar, Context context, String str, zzcql zzcqlVar) {
        this.zza = zzcquVar;
        zzgla zzglaVarZza = zzglb.zza(context);
        this.zzc = zzglaVarZza;
        zzgla zzglaVarZza2 = zzglb.zza(str);
        this.zzd = zzglaVarZza2;
        zzexs zzexsVar = new zzexs(zzglaVarZza, zzcquVar.zzas, zzcquVar.zzat);
        this.zze = zzexsVar;
        zzgln<zzevv> zzglnVarZza = zzgkz.zza(new zzevw(zzcquVar.zzas));
        this.zzf = zzglnVarZza;
        zzgln<zzeup> zzglnVarZza2 = zzgkz.zza(new zzeuq(zzglaVarZza, zzcquVar.zzp, zzcquVar.zzN, zzexsVar, zzglnVarZza, zzfat.zza()));
        this.zzg = zzglnVarZza2;
        this.zzh = zzgkz.zza(new zzeuw(zzcquVar.zzN, zzglaVarZza, zzglaVarZza2, zzglnVarZza2, zzglnVarZza, zzcquVar.zzi));
        zzexr zzexrVar = new zzexr(zzglaVarZza, zzcquVar.zzas, zzcquVar.zzat);
        this.zzi = zzexrVar;
        zzgln<zzevx> zzglnVarZza3 = zzgkz.zza(new zzevy(zzglaVarZza, zzcquVar.zzp, zzcquVar.zzN, zzexrVar, zzglnVarZza, zzfat.zza()));
        this.zzj = zzglnVarZza3;
        this.zzk = zzgkz.zza(new zzewe(zzcquVar.zzN, zzglaVarZza, zzglaVarZza2, zzglnVarZza3, zzglnVarZza));
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final zzeuv zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final zzewd zzb() {
        return this.zzk.zzb();
    }
}
