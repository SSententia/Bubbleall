package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdct implements zzgla<zzdcs> {
    private final zzgln<Set<zzdih<zzdcu>>> zza;

    public zzdct(zzgln<Set<zzdih<zzdcu>>> zzglnVar) {
        this.zza = zzglnVar;
    }

    public static zzdcs zzc(Set<zzdih<zzdcu>> set) {
        return new zzdcs(set);
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdcs zzb() {
        return new zzdcs(((zzgll) this.zza).zzb());
    }
}
