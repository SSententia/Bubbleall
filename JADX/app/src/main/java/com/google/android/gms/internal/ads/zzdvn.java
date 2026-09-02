package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzdvn extends zzdvp {
    private final zzffk zzf;

    public zzdvn(Executor executor, zzcgy zzcgyVar, zzffk zzffkVar, zzffm zzffmVar) {
        super(executor, zzcgyVar, zzffmVar);
        this.zzf = zzffkVar;
        zzffkVar.zza(this.zzb);
    }

    public final Map<String, String> zza() {
        return new HashMap(this.zzb);
    }
}
