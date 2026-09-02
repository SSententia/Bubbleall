package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfea {
    final /* synthetic */ zzfek zza;
    private final Object zzb;
    private final List<zzfsm<?>> zzc;

    /* synthetic */ zzfea(zzfek zzfekVar, Object obj, List list, zzfeb zzfebVar) {
        this.zza = zzfekVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final <O> zzfej<O> zza(Callable<O> callable) {
        zzfsb zzfsbVarZzo = zzfsd.zzo(this.zzc);
        zzfsm zzfsmVarZza = zzfsbVarZzo.zza(zzfdz.zza, zzchg.zzf);
        zzfek zzfekVar = this.zza;
        return new zzfej<>(zzfekVar, this.zzb, zzfsmVarZza, this.zzc, zzfsbVarZzo.zza(callable, zzfekVar.zzb));
    }
}
