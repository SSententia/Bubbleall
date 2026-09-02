package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcsb implements zzgla<zzcsa> {
    private final zzgln<Map<String, zzcsd>> zza;
    private final zzgln<Map<String, zzcsc>> zzb;

    public zzcsb(zzgln<Map<String, zzcsd>> zzglnVar, zzgln<Map<String, zzcsc>> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcsa zzb() {
        return new zzcsa(((zzgle) this.zza).zzb(), ((zzgle) this.zzb).zzb());
    }
}
