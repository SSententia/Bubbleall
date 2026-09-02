package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlh implements zzgla<zzcxj<zzcvh>> {
    private final zzgln<zzcoj> zza;
    private final zzgln<zzdam> zzb;
    private final zzgln<zzdgp> zzc;
    private final zzgln<zzdkw> zzd;
    private final zzgln<zzddr> zze;

    public zzdlh(zzgln<zzcoj> zzglnVar, zzgln<zzdam> zzglnVar2, zzgln<zzdgp> zzglnVar3, zzgln<zzdkw> zzglnVar4, zzgln<zzddr> zzglnVar5) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
        this.zze = zzglnVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcoj zzcojVarZzb = this.zza.zzb();
        zzdam zzdamVarZza = ((zzdau) this.zzb).zza();
        zzdgp zzdgpVarZza = ((zzdhi) this.zzc).zza();
        zzdkw zzdkwVarZza = ((zzdky) this.zzd).zza();
        zzddr zzddrVarZzb = ((zzcvg) this.zze).zzb();
        zzcwd zzcwdVarZzk = zzcojVarZzb.zzk();
        zzcwdVarZzk.zzi(zzdamVarZza.zzh());
        zzcwdVarZzk.zzj(zzdgpVarZza);
        zzcwdVarZzk.zzb(zzdkwVarZza);
        zzcwdVarZzk.zze(new zzejq(null));
        zzcwdVarZzk.zzd(new zzcxa(zzddrVarZzb));
        zzcwdVarZzk.zzc(new zzcve(null));
        zzcxj<zzcvh> zzcxjVarZzZ = zzcwdVarZzk.zza().zzZ();
        zzgli.zzb(zzcxjVarZzZ);
        return zzcxjVarZzZ;
    }
}
