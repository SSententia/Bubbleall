package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffd implements zzgla<zzffc> {
    private final zzgln<zzffi> zza;
    private final zzgln<zzffp> zzb;
    private final zzgln<ScheduledExecutorService> zzc;

    public zzffd(zzgln<zzffi> zzglnVar, zzgln<zzffp> zzglnVar2, zzgln<ScheduledExecutorService> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgku zzgkuVarZzc = zzgkz.zzc(this.zza);
        zzgku zzgkuVarZzc2 = zzgkz.zzc(this.zzb);
        Object zzfffVar = ((Boolean) zzbet.zzc().zzc(zzbjl.zzgj)).booleanValue() ? new zzfff((zzffc) zzgkuVarZzc.zzb(), this.zzc.zzb()) : (zzffc) zzgkuVarZzc2.zzb();
        zzgli.zzb(zzfffVar);
        return zzfffVar;
    }
}
