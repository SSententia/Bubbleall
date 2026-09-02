package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzfmm<K, V> extends zzfnd<K, V> implements zzfoy<K, V> {
    protected zzfmm(Map<K, Collection<V>> map) {
        super(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfnd
    final <E> Collection<E> zza(Collection<E> collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    final Collection<V> zzb(K k, Collection<V> collection) {
        return zzj(k, (List) collection, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
