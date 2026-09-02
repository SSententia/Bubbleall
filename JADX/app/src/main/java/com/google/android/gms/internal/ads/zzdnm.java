package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnm implements zzgla<zzdnl> {
    private final zzgln<com.google.android.gms.ads.internal.util.zzg> zza;
    private final zzgln<zzfar> zzb;
    private final zzgln<zzdmr> zzc;
    private final zzgln<zzdmm> zzd;
    private final zzgln<zzdnw> zze;
    private final zzgln<zzdoe> zzf;
    private final zzgln<Executor> zzg;
    private final zzgln<Executor> zzh;
    private final zzgln<zzdmj> zzi;

    public zzdnm(zzgln<com.google.android.gms.ads.internal.util.zzg> zzglnVar, zzgln<zzfar> zzglnVar2, zzgln<zzdmr> zzglnVar3, zzgln<zzdmm> zzglnVar4, zzgln<zzdnw> zzglnVar5, zzgln<zzdoe> zzglnVar6, zzgln<Executor> zzglnVar7, zzgln<Executor> zzglnVar8, zzgln<zzdmj> zzglnVar9) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
        this.zze = zzglnVar5;
        this.zzf = zzglnVar6;
        this.zzg = zzglnVar7;
        this.zzh = zzglnVar8;
        this.zzi = zzglnVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdnl zzb() {
        com.google.android.gms.ads.internal.util.zzg zzgVarZzb = ((zzfbu) this.zza).zzb();
        zzfar zzfarVarZza = ((zzdat) this.zzb).zza();
        zzdmr zzdmrVarZzb = this.zzc.zzb();
        zzdmm zzdmmVarZza = ((zzdne) this.zzd).zza();
        zzdnw zzdnwVarZzb = this.zze.zzb();
        zzdoe zzdoeVarZzb = this.zzf.zzb();
        Executor executorZzb = this.zzg.zzb();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzdnl(zzgVarZzb, zzfarVarZza, zzdmrVarZzb, zzdmmVarZza, zzdnwVarZzb, zzdoeVarZzb, executorZzb, zzfsnVar, this.zzi.zzb());
    }
}
