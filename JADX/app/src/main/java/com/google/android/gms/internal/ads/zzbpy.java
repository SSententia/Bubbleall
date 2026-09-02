package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbpy implements zzbpr<zzcml> {
    static final Map<String, Integer> zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbyj zzc;
    private final zzbyq zzd;

    public zzbpy(com.google.android.gms.ads.internal.zzb zzbVar, zzbyj zzbyjVar, zzbyq zzbyqVar) {
        this.zzb = zzbVar;
        this.zzc = zzbyjVar;
        this.zzd = zzbyqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        zzcml zzcmlVar2 = zzcmlVar;
        int iIntValue = zza.get((String) map.get("a")).intValue();
        int iZzh = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                if (!this.zzb.zzb()) {
                    this.zzb.zzc(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zza(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbym(zzcmlVar2, map).zzb();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbyh(zzcmlVar2, map).zzb();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (iIntValue != 7) {
                        com.google.android.gms.ads.internal.util.zze.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcmlVar2 == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            iZzh = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            iZzh = z ? -1 : com.google.android.gms.ads.internal.zzt.zze().zzh();
        }
        zzcmlVar2.zzal(iZzh);
    }
}
