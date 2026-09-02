package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcor implements zzgla<Set<zzdih<zzdhv>>> {
    private final zzgln<zzecc> zza;
    private final zzgln<Executor> zzb;

    public zzcor(zzgln<zzecc> zzglnVar, zzgln<Executor> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003b  */
    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setEmptySet;
        zzecc zzeccVarZzb = this.zza.zzb();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbr)).booleanValue()) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
                setEmptySet = Collections.singleton(new zzdih(zzeccVarZzb, zzfsnVar));
            } else {
                setEmptySet = Collections.emptySet();
            }
        } else {
            setEmptySet = Collections.emptySet();
        }
        zzgli.zzb(setEmptySet);
        return setEmptySet;
    }
}
