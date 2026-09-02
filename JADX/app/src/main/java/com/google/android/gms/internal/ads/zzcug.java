package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcug implements zzgla<Set<zzdih<zzdcq>>> {
    private final zzcue zza;
    private final zzgln<zzcwy> zzb;

    public zzcug(zzcue zzcueVar, zzgln<zzcwy> zzglnVar) {
        this.zza = zzcueVar;
        this.zzb = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdih(this.zzb.zzb(), zzchg.zzf));
        zzgli.zzb(setSingleton);
        return setSingleton;
    }
}
