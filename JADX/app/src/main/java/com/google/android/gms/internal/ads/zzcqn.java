package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcqn implements zzezt {
    private final zzcqu zza;
    private final zzcqn zzb = this;
    private final zzgln<Context> zzc;
    private final zzgln<zzexo<zzdsb, zzdrw>> zzd;
    private final zzgln<zzezc> zze;
    private final zzgln<zzfam> zzf;
    private final zzgln<zzezm> zzg;
    private final zzgln<zzezw> zzh;
    private final zzgln<String> zzi;
    private final zzgln<zzezq> zzj;

    /* synthetic */ zzcqn(zzcqu zzcquVar, Context context, String str, zzcql zzcqlVar) {
        this.zza = zzcquVar;
        zzgla zzglaVarZza = zzglb.zza(context);
        this.zzc = zzglaVarZza;
        zzext zzextVar = new zzext(zzglaVarZza, zzcquVar.zzas, zzcquVar.zzat);
        this.zzd = zzextVar;
        zzgln<zzezc> zzglnVarZza = zzgkz.zza(new zzezd(zzcquVar.zzas));
        this.zze = zzglnVarZza;
        zzgln<zzfam> zzglnVarZza2 = zzgkz.zza(zzfao.zza());
        this.zzf = zzglnVarZza2;
        zzgln<zzezm> zzglnVarZza3 = zzgkz.zza(new zzezn(zzglaVarZza, zzcquVar.zzp, zzcquVar.zzN, zzextVar, zzglnVarZza, zzfat.zza(), zzglnVarZza2));
        this.zzg = zzglnVarZza3;
        this.zzh = zzgkz.zza(new zzezx(zzglnVarZza3, zzglnVarZza, zzglnVarZza2));
        zzgla zzglaVarZzc = zzglb.zzc(str);
        this.zzi = zzglaVarZzc;
        this.zzj = zzgkz.zza(new zzezr(zzglaVarZzc, zzglnVarZza3, zzglaVarZza, zzglnVarZza, zzglnVarZza2));
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final zzezw zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final zzezq zzb() {
        return this.zzj.zzb();
    }
}
