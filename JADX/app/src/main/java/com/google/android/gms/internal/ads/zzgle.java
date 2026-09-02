package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgle<K, V> extends zzgkw<K, V, V> {
    private static final zzgln<Map<Object, Object>> zza = zzglb.zza(Collections.emptyMap());

    /* synthetic */ zzgle(Map map, zzglc zzglcVar) {
        super(map);
    }

    public static <K, V> zzgld<K, V> zzc(int i) {
        return new zzgld<>(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map<K, V> zzb() {
        LinkedHashMap linkedHashMapZzc = zzgkx.zzc(zza().size());
        for (Map.Entry<K, zzgln<V>> entry : zza().entrySet()) {
            linkedHashMapZzc.put(entry.getKey(), entry.getValue().zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapZzc);
    }
}
