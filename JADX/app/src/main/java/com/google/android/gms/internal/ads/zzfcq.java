package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfcq {
    private final HashMap<zzfcg, zzfcp<?, ?>> zza = new HashMap<>();

    public final <R extends zzdal<AdT>, AdT extends zzcxg> zzfcp<R, AdT> zza(zzfcg zzfcgVar, Context context, zzfby zzfbyVar, zzfcw<R, AdT> zzfcwVar) {
        zzfcp<R, AdT> zzfcpVar = (zzfcp) this.zza.get(zzfcgVar);
        if (zzfcpVar != null) {
            return zzfcpVar;
        }
        zzfcd zzfcdVar = new zzfcd(zzfcj.zza(zzfcgVar, context));
        zzfcp<R, AdT> zzfcpVar2 = new zzfcp<>(zzfcdVar, new zzfcy(zzfcdVar, zzfbyVar, zzfcwVar));
        this.zza.put(zzfcgVar, zzfcpVar2);
        return zzfcpVar2;
    }
}
