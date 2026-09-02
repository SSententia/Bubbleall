package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzczp implements zzgla<zzdih<zzbcv>> {
    private final zzgln<zzdut> zza;
    private final zzgln<Executor> zzb;
    private final zzgln<zzeby> zzc;

    public zzczp(zzgln<zzdut> zzglnVar, zzgln<Executor> zzglnVar2, zzgln<zzeby> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdut zzdutVarZzb = this.zza.zzb();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return ((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue() ? new zzdih(this.zzc.zzb(), zzfsnVar) : new zzdih(zzdutVarZzb, zzfsnVar);
    }
}
