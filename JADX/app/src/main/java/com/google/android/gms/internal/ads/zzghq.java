package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzghq {
    private static final zzghq zza = new zzghq();
    private final ConcurrentMap<Class<?>, zzghz<?>> zzc = new ConcurrentHashMap();
    private final zzgia zzb = new zzgha();

    private zzghq() {
    }

    public static zzghq zza() {
        return zza;
    }

    public final <T> zzghz<T> zzb(Class<T> cls) {
        zzggk.zzb(cls, "messageType");
        zzghz<T> zzghzVarZza = (zzghz) this.zzc.get(cls);
        if (zzghzVarZza == null) {
            zzghzVarZza = this.zzb.zza(cls);
            zzggk.zzb(cls, "messageType");
            zzggk.zzb(zzghzVarZza, "schema");
            zzghz<T> zzghzVar = (zzghz) this.zzc.putIfAbsent(cls, zzghzVarZza);
            if (zzghzVar != null) {
                return zzghzVar;
            }
        }
        return zzghzVarZza;
    }
}
