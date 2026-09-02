package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgkv<K, V, V2> {
    final LinkedHashMap<K, zzgln<V>> zza;

    zzgkv(int i) {
        this.zza = zzgkx.zzc(i);
    }

    final zzgkv<K, V, V2> zza(K k, zzgln<V> zzglnVar) {
        LinkedHashMap<K, zzgln<V>> linkedHashMap = this.zza;
        zzgli.zza(k, "key");
        zzgli.zza(zzglnVar, "provider");
        linkedHashMap.put(k, zzglnVar);
        return this;
    }
}
