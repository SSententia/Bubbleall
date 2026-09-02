package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvy {
    public final int zza;
    public final byte[] zzb;
    public final Map<String, String> zzc;
    public final List<zzvu> zzd;
    public final boolean zze;

    private zzvy(int i, byte[] bArr, Map<String, String> map, List<zzvu> list, boolean z, long j) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = map;
        this.zzd = list == null ? null : Collections.unmodifiableList(list);
        this.zze = z;
    }

    private static List<zzvu> zza(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new zzvu(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public zzvy(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, zza(map), z, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzvy(int i, byte[] bArr, boolean z, long j, List<zzvu> list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (zzvu zzvuVar : list) {
                treeMap.put(zzvuVar.zza(), zzvuVar.zzb());
            }
        }
        this(i, bArr, treeMap, list, z, j);
    }

    @Deprecated
    public zzvy(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, zza(map), false, 0L);
    }
}
