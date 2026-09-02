package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zza extends LinkedHashMap<String, Pair<Long, String>> {
    final /* synthetic */ zzb zza;

    zza(zzb zzbVar) {
        this.zza = zzbVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry<String, Pair<Long, String>> entry) {
        return size() > this.zza.zza;
    }
}
