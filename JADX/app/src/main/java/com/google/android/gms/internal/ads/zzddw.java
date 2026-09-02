package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzddw implements zzgla<zzddv> {
    private final zzgln<Set<zzdih<zzddx>>> zza;

    public zzddw(zzgln<Set<zzdih<zzddx>>> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzddv zzb() {
        return new zzddv(((zzgll) this.zza).zzb());
    }
}
