package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzgkw<K, V, V2> implements zzgla<Map<K, V2>> {
    private final Map<K, zzgln<V>> zza;

    zzgkw(Map<K, zzgln<V>> map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    final Map<K, zzgln<V>> zza() {
        return this.zza;
    }
}
