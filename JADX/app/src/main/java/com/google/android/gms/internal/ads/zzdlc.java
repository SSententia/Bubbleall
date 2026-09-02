package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlc implements zzgla<Set<String>> {
    private final zzgln<zzdmx> zza;

    public zzdlc(zzgln<zzdmx> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdkz) this.zza).zza().zzd() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzgli.zzb(setSingleton);
        return setSingleton;
    }
}
