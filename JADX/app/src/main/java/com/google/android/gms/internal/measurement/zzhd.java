package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhd {
    static final zzhd zza = new zzhd(true);
    private static volatile boolean zzb = false;
    private static volatile zzhd zzc;
    private static volatile zzhd zzd;
    private final Map<zzhc, zzhp<?, ?>> zze;

    zzhd() {
        this.zze = new HashMap();
    }

    public static zzhd zza() {
        zzhd zzhdVar = zzc;
        if (zzhdVar == null) {
            synchronized (zzhd.class) {
                zzhdVar = zzc;
                if (zzhdVar == null) {
                    zzhdVar = zza;
                    zzc = zzhdVar;
                }
            }
        }
        return zzhdVar;
    }

    public final <ContainingType extends zziw> zzhp<ContainingType, ?> zzc(ContainingType containingtype, int i) {
        return (zzhp) this.zze.get(new zzhc(containingtype, i));
    }

    zzhd(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzhd zzb() {
        zzhd zzhdVar = zzd;
        if (zzhdVar != null) {
            return zzhdVar;
        }
        synchronized (zzhd.class) {
            zzhd zzhdVar2 = zzd;
            if (zzhdVar2 != null) {
                return zzhdVar2;
            }
            zzhd zzhdVarZzb = zzhl.zzb(zzhd.class);
            zzd = zzhdVarZzb;
            return zzhdVarZzb;
        }
    }
}
