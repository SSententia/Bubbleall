package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbb implements zzgla<zzdba> {
    private final zzgln<Set<zzdih<zzbcv>>> zza;

    public zzdbb(zzgln<Set<zzdih<zzbcv>>> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdba(((zzgll) this.zza).zzb());
    }
}
