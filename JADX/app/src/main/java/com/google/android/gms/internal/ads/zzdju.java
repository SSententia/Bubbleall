package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdju implements zzgla<Set<zzdih<zzdbc>>> {
    private final zzdjm zza;
    private final zzgln<zzdac> zzb;

    public zzdju(zzdjm zzdjmVar, zzgln<zzdac> zzglnVar) {
        this.zza = zzdjmVar;
        this.zzb = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set<zzdih<zzdbc>> setZze = this.zza.zze(this.zzb.zzb());
        zzgli.zzb(setZze);
        return setZze;
    }
}
