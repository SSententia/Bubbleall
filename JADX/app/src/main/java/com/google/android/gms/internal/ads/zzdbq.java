package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbq implements zzgla<zzdbo> {
    private final zzgln<Set<zzdih<zzdbs>>> zza;

    public zzdbq(zzgln<Set<zzdih<zzdbs>>> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdbo zzb() {
        return new zzdbo(((zzgll) this.zza).zzb());
    }
}
