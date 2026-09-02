package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdus implements zzgla<zzdur> {
    private final zzgln<zzazb> zza;
    private final zzgln<Map<zzfem, zzduq>> zzb;

    public zzdus(zzgln<zzazb> zzglnVar, zzgln<Map<zzfem, zzduq>> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdur zzb() {
        return new zzdur(this.zza.zzb(), ((zzgle) this.zzb).zzb());
    }
}
