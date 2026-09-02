package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfev implements zzgla<zzfer> {
    private final zzgln<Set<zzdih<zzfet>>> zza;

    public zzfev(zzgln<Set<zzdih<zzfet>>> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfer zzb() {
        return new zzfer(((zzgll) this.zza).zzb());
    }
}
