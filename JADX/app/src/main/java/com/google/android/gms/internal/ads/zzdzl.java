package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzl implements zzgla<zzdzk> {
    private final zzgln<ScheduledExecutorService> zza;
    private final zzgln<zzfsn> zzb;
    private final zzgln<zzeac> zzc;
    private final zzgln<zzebq> zzd;

    public zzdzl(zzgln<ScheduledExecutorService> zzglnVar, zzgln<zzfsn> zzglnVar2, zzgln<zzeac> zzglnVar3, zzgln<zzebq> zzglnVar4) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdzk zzb() {
        ScheduledExecutorService scheduledExecutorServiceZzb = this.zza.zzb();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzdzk(scheduledExecutorServiceZzb, zzfsnVar, ((zzead) this.zzc).zzb(), zzgkz.zzc(this.zzd));
    }
}
