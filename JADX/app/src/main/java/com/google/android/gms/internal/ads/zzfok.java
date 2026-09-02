package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfok<K, V> extends zzfop<K, V> {
    public final zzfok<K, V> zza(K k, V... vArr) {
        List listAsList = Arrays.asList(vArr);
        Collection collection = this.zza.get(k);
        if (collection != null) {
            for (Object obj : listAsList) {
                zzfni.zza(k, obj);
                collection.add(obj);
            }
        } else {
            Iterator it = listAsList.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    Object next = it.next();
                    zzfni.zza(k, next);
                    arrayList.add(next);
                }
                this.zza.put(k, arrayList);
            }
        }
        return this;
    }

    public final zzfol<K, V> zzb() {
        Set<Map.Entry<K, Collection<V>>> setEntrySet = this.zza.entrySet();
        if (setEntrySet.isEmpty()) {
            return zzfnz.zza;
        }
        zzfom zzfomVar = new zzfom(setEntrySet.size());
        int size = 0;
        for (Map.Entry<K, Collection<V>> entry : setEntrySet) {
            K key = entry.getKey();
            zzfoj zzfojVarZzp = zzfoj.zzp(entry.getValue());
            if (!zzfojVarZzp.isEmpty()) {
                zzfomVar.zza(key, zzfojVarZzp);
                size += zzfojVarZzp.size();
            }
        }
        return new zzfol<>(zzfomVar.zzc(), size);
    }
}
