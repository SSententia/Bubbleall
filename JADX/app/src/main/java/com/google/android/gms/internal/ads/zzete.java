package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzete implements zzgla<zzetc> {
    private final zzgln<zzcfw> zza;
    private final zzgln<Integer> zzb;
    private final zzgln<Context> zzc;
    private final zzgln<zzcge> zzd;
    private final zzgln<ScheduledExecutorService> zze;
    private final zzgln<Executor> zzf;
    private final zzgln<String> zzg;

    public zzete(zzgln<zzcfw> zzglnVar, zzgln<Integer> zzglnVar2, zzgln<Context> zzglnVar3, zzgln<zzcge> zzglnVar4, zzgln<ScheduledExecutorService> zzglnVar5, zzgln<Executor> zzglnVar6, zzgln<String> zzglnVar7) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
        this.zze = zzglnVar5;
        this.zzf = zzglnVar6;
        this.zzg = zzglnVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcfw zzcfwVar = new zzcfw();
        int iIntValue = ((zzetz) this.zzb).zzb().intValue();
        Context contextZza = ((zzcoo) this.zzc).zza();
        zzcge zzcgeVarZzb = this.zzd.zzb();
        ScheduledExecutorService scheduledExecutorServiceZzb = this.zze.zzb();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzetc(zzcfwVar, iIntValue, contextZza, zzcgeVarZzb, scheduledExecutorServiceZzb, zzfsnVar, ((zzety) this.zzg).zza(), null);
    }
}
