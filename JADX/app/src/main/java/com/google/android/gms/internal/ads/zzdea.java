package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdea implements zzgla<zzddz> {
    private final zzgln<Set<zzdih<zzdeb>>> zza;

    public zzdea(zzgln<Set<zzdih<zzdeb>>> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzddz zzb() {
        return new zzddz(((zzgll) this.zza).zzb());
    }
}
