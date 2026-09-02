package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcqk implements zzeyf {
    private final zzcqu zza;
    private final zzcqk zzb = this;
    private final zzgln<Context> zzc;
    private final zzgln<zzbdl> zzd;
    private final zzgln<String> zze;
    private final zzgln<zzeli> zzf;
    private final zzgln<zzezc> zzg;
    private final zzgln<zzeyc> zzh;
    private final zzgln<zzelq> zzi;

    /* synthetic */ zzcqk(zzcqu zzcquVar, Context context, String str, zzbdl zzbdlVar, zzcql zzcqlVar) {
        this.zza = zzcquVar;
        zzgla zzglaVarZza = zzglb.zza(context);
        this.zzc = zzglaVarZza;
        zzgla zzglaVarZza2 = zzglb.zza(zzbdlVar);
        this.zzd = zzglaVarZza2;
        zzgla zzglaVarZza3 = zzglb.zza(str);
        this.zze = zzglaVarZza3;
        zzgln<zzeli> zzglnVarZza = zzgkz.zza(new zzelj(zzcquVar.zzo));
        this.zzf = zzglnVarZza;
        zzgln<zzezc> zzglnVarZza2 = zzgkz.zza(new zzezd(zzcquVar.zzas));
        this.zzg = zzglnVarZza2;
        zzgln<zzeyc> zzglnVarZza3 = zzgkz.zza(new zzeyd(zzglaVarZza, zzcquVar.zzp, zzcquVar.zzN, zzglnVarZza, zzglnVarZza2, zzfat.zza()));
        this.zzh = zzglnVarZza3;
        this.zzi = zzgkz.zza(new zzelr(zzglaVarZza, zzglaVarZza2, zzglaVarZza3, zzglnVarZza3, zzglnVarZza, zzglnVarZza2));
    }

    @Override // com.google.android.gms.internal.ads.zzeyf
    public final zzelq zza() {
        return this.zzi.zzb();
    }
}
