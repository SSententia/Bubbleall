package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbhn implements InitializationStatus {
    private final zzbhs zza;

    zzbhn(zzbhs zzbhsVar) {
        this.zza = zzbhsVar;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        zzbhs zzbhsVar = this.zza;
        HashMap map = new HashMap();
        map.put("com.google.android.gms.ads.MobileAds", new zzbho(zzbhsVar));
        return map;
    }
}
