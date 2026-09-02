package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzesc<T> implements zzgla<zzesb<T>> {
    private final zzgln<Executor> zza;
    private final zzgln<Set<zzery<? extends zzerx<T>>>> zzb;

    public zzesc(zzgln<Executor> zzglnVar, zzgln<Set<zzery<? extends zzerx<T>>>> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzesb<T> zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzesb<>(zzfsnVar, ((zzgll) this.zzb).zzb());
    }
}
