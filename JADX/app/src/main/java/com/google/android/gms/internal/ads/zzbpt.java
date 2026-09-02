package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbpt implements zzbpr<zzcml> {
    private final zzbpu zza;

    public zzbpt(zzbpu zzbpuVar, byte[] bArr) {
        this.zza = zzbpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        zzcml zzcmlVar2 = zzcmlVar;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Fail to parse float", e);
        }
        this.zza.zza(zEquals);
        this.zza.zzb(zEquals2, f);
        zzcmlVar2.zzaD(zEquals);
    }
}
