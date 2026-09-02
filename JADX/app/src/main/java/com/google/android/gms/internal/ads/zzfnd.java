package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfnd<K, V> extends zzfng<K, V> implements Serializable {
    private transient Map<K, Collection<V>> zza;
    private transient int zzb;

    protected zzfnd(Map<K, Collection<V>> map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.zza = map;
    }

    static /* synthetic */ void zzm(zzfnd zzfndVar, Object obj) {
        Collection<V> collectionRemove;
        Map<K, Collection<V>> map = zzfndVar.zza;
        map.getClass();
        try {
            collectionRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collectionRemove = null;
        }
        Collection<V> collection = collectionRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfndVar.zzb -= size;
        }
    }

    <E> Collection<E> zza(Collection<E> collection) {
        throw null;
    }

    Collection<V> zzb(K k, Collection<V> collection) {
        throw null;
    }

    abstract Collection<V> zzc();

    @Override // com.google.android.gms.internal.ads.zzfpj
    public final int zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfng, com.google.android.gms.internal.ads.zzfpj
    public final boolean zzh(K k, V v) {
        Collection<V> collection = this.zza.get(k);
        if (collection != null) {
            if (!collection.add(v)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection<V> collectionZzc = zzc();
        if (!collectionZzc.add(v)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(k, collectionZzc);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    public final void zzi() {
        Iterator<Collection<V>> it = this.zza.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    final List<V> zzj(K k, List<V> list, @CheckForNull zzfna zzfnaVar) {
        return list instanceof RandomAccess ? new zzfmw(this, k, list, zzfnaVar) : new zzfnc(this, k, list, zzfnaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    Set<K> zzk() {
        throw null;
    }

    final Set<K> zzl() {
        Map<K, Collection<V>> map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfmv(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new zzfmy(this, (SortedMap) map) : new zzfmt(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    final Collection<V> zzn() {
        return new zzfnf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    final Iterator<V> zzo() {
        return new zzfmn(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    Map<K, Collection<V>> zzp() {
        throw null;
    }

    final Map<K, Collection<V>> zzq() {
        Map<K, Collection<V>> map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfmu(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new zzfmx(this, (SortedMap) map) : new zzfmq(this, map);
    }
}
