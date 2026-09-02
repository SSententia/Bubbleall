package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfed {
    public static final <O> zzfej<O> zza(zzfsm<O> zzfsmVar, Object obj, zzfek zzfekVar) {
        return new zzfej<>(zzfekVar, obj, zzfek.zza, Collections.emptyList(), zzfsmVar);
    }

    public static final <O> zzfej<O> zzb(Callable<O> callable, Object obj, zzfek zzfekVar) {
        return zzc(callable, zzfekVar.zzb, obj, zzfekVar);
    }

    public static final <O> zzfej<O> zzc(Callable<O> callable, zzfsn zzfsnVar, Object obj, zzfek zzfekVar) {
        return new zzfej<>(zzfekVar, obj, zzfek.zza, Collections.emptyList(), zzfsnVar.zzb(callable));
    }

    public static final zzfej zzd(final zzfdx zzfdxVar, zzfsn zzfsnVar, Object obj, zzfek zzfekVar) {
        return zzc(new Callable(zzfdxVar) { // from class: com.google.android.gms.internal.ads.zzfec
            private final zzfdx zza;

            {
                this.zza = zzfdxVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zza();
                return null;
            }
        }, zzfsnVar, obj, zzfekVar);
    }
}
