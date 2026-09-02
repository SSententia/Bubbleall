package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdtz implements zzgla<Set<zzdih<zzfet>>> {
    private final zzgln<Executor> zza;
    private final zzgln<zzdur> zzb;

    public zzdtz(zzgln<Executor> zzglnVar, zzgln<zzdur> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        Set setSingleton = ((Boolean) zzbet.zzc().zzc(zzbjl.zzdo)).booleanValue() ? Collections.singleton(new zzdih(((zzdus) this.zzb).zzb(), zzfsnVar)) : Collections.emptySet();
        zzgli.zzb(setSingleton);
        return setSingleton;
    }
}
