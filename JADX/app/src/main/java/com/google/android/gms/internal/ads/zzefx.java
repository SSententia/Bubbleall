package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefx implements zzgla<zzefw> {
    private final zzgln<zzcwe> zza;
    private final zzgln<zzefd> zzb;
    private final zzgln<zzdbe> zzc;
    private final zzgln<ScheduledExecutorService> zzd;
    private final zzgln<zzfsn> zze;

    public zzefx(zzgln<zzcwe> zzglnVar, zzgln<zzefd> zzglnVar2, zzgln<zzdbe> zzglnVar3, zzgln<ScheduledExecutorService> zzglnVar4, zzgln<zzfsn> zzglnVar5) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
        this.zze = zzglnVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzefw zzb() {
        zzcwe zzcweVarZzb = this.zza.zzb();
        zzefd zzefdVarZzb = ((zzefe) this.zzb).zzb();
        zzdbe zzdbeVarZzb = this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorServiceZzb = this.zzd.zzb();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzefw(zzcweVarZzb, zzefdVarZzb, zzdbeVarZzb, scheduledExecutorServiceZzb, zzfsnVar);
    }
}
