package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgfm {
    static final zzgfm zza = new zzgfm(true);
    private static volatile boolean zzb = false;
    private static volatile zzgfm zzc;
    private static volatile zzgfm zzd;
    private final Map<zzgfl, zzgfy<?, ?>> zze;

    zzgfm() {
        this.zze = new HashMap();
    }

    public static zzgfm zza() {
        zzgfm zzgfmVar = zzc;
        if (zzgfmVar == null) {
            synchronized (zzgfm.class) {
                zzgfmVar = zzc;
                if (zzgfmVar == null) {
                    zzgfmVar = zza;
                    zzc = zzgfmVar;
                }
            }
        }
        return zzgfmVar;
    }

    public final <ContainingType extends zzghi> zzgfy<ContainingType, ?> zzc(ContainingType containingtype, int i) {
        return (zzgfy) this.zze.get(new zzgfl(containingtype, i));
    }

    zzgfm(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgfm zzb() {
        zzgfm zzgfmVar = zzd;
        if (zzgfmVar != null) {
            return zzgfmVar;
        }
        synchronized (zzgfm.class) {
            zzgfm zzgfmVar2 = zzd;
            if (zzgfmVar2 != null) {
                return zzgfmVar2;
            }
            zzgfm zzgfmVarZzb = zzgfu.zzb(zzgfm.class);
            zzd = zzgfmVarZzb;
            return zzgfmVarZzb;
        }
    }
}
