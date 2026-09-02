package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzggw {
    private static final zzggw zza;
    private static final zzggw zzb;

    static {
        zzggv zzggvVar = null;
        zza = new zzggt(zzggvVar);
        zzb = new zzggu(zzggvVar);
    }

    /* synthetic */ zzggw(zzggv zzggvVar) {
    }

    static zzggw zzd() {
        return zza;
    }

    static zzggw zze() {
        return zzb;
    }

    abstract <L> List<L> zza(Object obj, long j);

    abstract void zzb(Object obj, long j);

    abstract <L> void zzc(Object obj, Object obj2, long j);
}
