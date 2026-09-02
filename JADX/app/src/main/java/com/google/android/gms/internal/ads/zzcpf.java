package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcpf implements zzgla<zzcbu> {
    private final zzgln<Context> zza;

    public zzcpf(zzgln<Context> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcbu zzb() {
        Context contextZza = ((zzcoo) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzp().zza(contextZza, zzcgz.zza()).zza("google.afma.request.getAdDictionary", zzbud.zza, zzbud.zza);
        return new zzcbt(contextZza, com.google.android.gms.ads.internal.zzt.zzp().zza(contextZza, zzcgz.zza()).zza("google.afma.sdkConstants.getSdkConstants", zzbud.zza, zzbud.zza));
    }
}
