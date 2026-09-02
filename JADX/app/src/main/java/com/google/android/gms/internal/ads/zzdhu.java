package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdhu implements zzgla<zzdht> {
    private final zzgln<Set<zzdih<zzdhv>>> zza;

    public zzdhu(zzgln<Set<zzdih<zzdhv>>> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdht zzb() {
        return new zzdht(((zzgll) this.zza).zzb());
    }
}
