package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzje {
    private static final zzje zza = new zzje();
    private final ConcurrentMap<Class<?>, zzjh<?>> zzc = new ConcurrentHashMap();
    private final zzji zzb = new zzio();

    private zzje() {
    }

    public static zzje zza() {
        return zza;
    }

    public final <T> zzjh<T> zzb(Class<T> cls) {
        zzhz.zzb(cls, "messageType");
        zzjh<T> zzjhVarZza = (zzjh) this.zzc.get(cls);
        if (zzjhVarZza == null) {
            zzjhVarZza = this.zzb.zza(cls);
            zzhz.zzb(cls, "messageType");
            zzhz.zzb(zzjhVarZza, "schema");
            zzjh<T> zzjhVar = (zzjh) this.zzc.putIfAbsent(cls, zzjhVarZza);
            if (zzjhVar != null) {
                return zzjhVar;
            }
        }
        return zzjhVarZza;
    }
}
