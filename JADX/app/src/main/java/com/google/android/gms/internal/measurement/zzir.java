package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzir {
    zzir() {
    }

    public static final int zza(int i, Object obj, Object obj2) {
        zziq zziqVar = (zziq) obj;
        if (zziqVar.isEmpty()) {
            return 0;
        }
        Iterator it = zziqVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zziq zziqVarZzc = (zziq) obj;
        zziq zziqVar = (zziq) obj2;
        if (!zziqVar.isEmpty()) {
            if (!zziqVarZzc.zze()) {
                zziqVarZzc = zziqVarZzc.zzc();
            }
            zziqVarZzc.zzb(zziqVar);
        }
        return zziqVarZzc;
    }
}
