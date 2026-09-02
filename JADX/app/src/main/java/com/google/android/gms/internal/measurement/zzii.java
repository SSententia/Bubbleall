package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzii extends zzik {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzii() {
        super(null);
    }

    /* synthetic */ zzii(zzih zzihVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    final void zza(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzkf.zzn(obj, j);
        if (list instanceof zzig) {
            objUnmodifiableList = ((zzig) list).zzi();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzjd) && (list instanceof zzhy)) {
                zzhy zzhyVar = (zzhy) list;
                if (zzhyVar.zza()) {
                    zzhyVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzkf.zzo(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    final <E> void zzb(Object obj, Object obj2, long j) {
        List list;
        List list2;
        List listZze;
        List list3 = (List) zzkf.zzn(obj2, j);
        int size = list3.size();
        List list4 = (List) zzkf.zzn(obj, j);
        if (list4.isEmpty()) {
            if (list4 instanceof zzig) {
                listZze = new zzif(size);
            } else {
                listZze = ((list4 instanceof zzjd) && (list4 instanceof zzhy)) ? ((zzhy) list4).zze(size) : new ArrayList(size);
            }
            zzkf.zzo(obj, j, listZze);
            list2 = listZze;
        } else {
            if (zza.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                zzkf.zzo(obj, j, arrayList);
                list = arrayList;
            } else if (list4 instanceof zzka) {
                zzif zzifVar = new zzif(list4.size() + size);
                zzifVar.addAll(zzifVar.size(), (zzka) list4);
                zzkf.zzo(obj, j, zzifVar);
                list = zzifVar;
            } else if ((list4 instanceof zzjd) && (list4 instanceof zzhy)) {
                zzhy zzhyVar = (zzhy) list4;
                if (!zzhyVar.zza()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    zzhy<E> zzhyVarZze = zzhyVar.zze(list4.size() + size);
                    zzkf.zzo(obj, j, zzhyVarZze);
                    list2 = zzhyVarZze;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        zzkf.zzo(obj, j, list3);
    }
}
