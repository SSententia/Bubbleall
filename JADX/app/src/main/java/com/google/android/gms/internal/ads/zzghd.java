package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzghd {
    zzghd() {
    }

    public static final int zza(int i, Object obj, Object obj2) {
        zzghc zzghcVar = (zzghc) obj;
        if (zzghcVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzghcVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzghc) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzghc zzghcVarZzc = (zzghc) obj;
        zzghc zzghcVar = (zzghc) obj2;
        if (!zzghcVar.isEmpty()) {
            if (!zzghcVarZzc.zze()) {
                zzghcVarZzc = zzghcVarZzc.zzc();
            }
            zzghcVarZzc.zzb(zzghcVar);
        }
        return zzghcVarZzc;
    }
}
