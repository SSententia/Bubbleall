package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfng<K, V> implements zzfpj<K, V> {

    @CheckForNull
    private transient Set<K> zza;

    @CheckForNull
    private transient Collection<V> zzb;

    @CheckForNull
    private transient Map<K, Collection<V>> zzc;

    zzfng() {
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfpj) {
            return zzu().equals(((zzfpj) obj).zzu());
        }
        return false;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    public boolean zzh(K k, V v) {
        throw null;
    }

    abstract Set<K> zzk();

    abstract Collection<V> zzn();

    Iterator<V> zzo() {
        throw null;
    }

    abstract Map<K, Collection<V>> zzp();

    public boolean zzr(@CheckForNull Object obj) {
        Iterator<Collection<V>> it = zzu().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Set<K> zzs() {
        Set<K> set = this.zza;
        if (set != null) {
            return set;
        }
        Set<K> setZzk = zzk();
        this.zza = setZzk;
        return setZzk;
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    public Collection<V> zzt() {
        Collection<V> collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionZzn = zzn();
        this.zzb = collectionZzn;
        return collectionZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    public Map<K, Collection<V>> zzu() {
        Map<K, Collection<V>> map = this.zzc;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapZzp = zzp();
        this.zzc = mapZzp;
        return mapZzp;
    }
}
