package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfph<K, V> extends AbstractMap<K, V> {

    @CheckForNull
    private transient Set<Map.Entry<K, V>> zza;

    @CheckForNull
    private transient Set<K> zzb;

    @CheckForNull
    private transient Collection<V> zzc;

    zzfph() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.zza;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setZza = zza();
        this.zza = setZza;
        return setZza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.zzb;
        if (set != null) {
            return set;
        }
        Set<K> setZzh = zzh();
        this.zzb = setZzh;
        return setZzh;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.zzc;
        if (collection != null) {
            return collection;
        }
        zzfpg zzfpgVar = new zzfpg(this);
        this.zzc = zzfpgVar;
        return zzfpgVar;
    }

    abstract Set<Map.Entry<K, V>> zza();

    Set<K> zzh() {
        return new zzfpf(this);
    }
}
