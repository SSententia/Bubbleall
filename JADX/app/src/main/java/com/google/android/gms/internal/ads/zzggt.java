package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzggt extends zzggw {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzggt() {
        super(null);
    }

    /* synthetic */ zzggt(zzggv zzggvVar) {
        super(null);
    }

    private static <L> List<L> zzf(Object obj, long j, int i) {
        Object obj2;
        List<L> listZze;
        List<L> list = (List) zzgiy.zzn(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzggs) {
                listZze = new zzggr(i);
            } else {
                listZze = ((list instanceof zzghp) && (list instanceof zzggj)) ? ((zzggj) list).zze(i) : new ArrayList<>(i);
            }
            zzgiy.zzo(obj, j, listZze);
            return listZze;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzgiy.zzo(obj, j, arrayList);
            obj2 = arrayList;
        } else {
            if (!(list instanceof zzgit)) {
                if (!(list instanceof zzghp) || !(list instanceof zzggj)) {
                    return list;
                }
                zzggj zzggjVar = (zzggj) list;
                if (zzggjVar.zza()) {
                    return list;
                }
                zzggj zzggjVarZze = zzggjVar.zze(list.size() + i);
                zzgiy.zzo(obj, j, zzggjVarZze);
                return zzggjVarZze;
            }
            zzggr zzggrVar = new zzggr(list.size() + i);
            zzggrVar.addAll(zzggrVar.size(), (zzgit) list);
            zzgiy.zzo(obj, j, zzggrVar);
            obj2 = zzggrVar;
        }
        return (List<L>) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzggw
    final <L> List<L> zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzggw
    final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzgiy.zzn(obj, j);
        if (list instanceof zzggs) {
            objUnmodifiableList = ((zzggs) list).zzi();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzghp) && (list instanceof zzggj)) {
                zzggj zzggjVar = (zzggj) list;
                if (zzggjVar.zza()) {
                    zzggjVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzgiy.zzo(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzggw
    final <E> void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzgiy.zzn(obj2, j);
        List listZzf = zzf(obj, j, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzgiy.zzo(obj, j, list);
    }
}
