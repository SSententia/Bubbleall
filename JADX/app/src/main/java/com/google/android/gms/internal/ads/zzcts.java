package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcts implements zzgla<zzctl> {
    private final zzgln<zzavz> zza;
    private final zzgln<zzbup> zzb;
    private final zzgln<Executor> zzc;

    public zzcts(zzgln<zzavz> zzglnVar, zzgln<zzbup> zzglnVar2, zzgln<Executor> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzavz zzavzVarZzb = this.zza.zzb();
        zzbup zzbupVarZzb = this.zzb.zzb();
        zzfsn zzfsnVarZza = zzfdg.zza();
        zzgli.zzb(zzfsnVarZza);
        return new zzctl(zzavzVarZzb.zzd(), zzbupVarZzb, zzfsnVarZza);
    }
}
