package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzik {
    private static final zzik zza;
    private static final zzik zzb;

    static {
        zzih zzihVar = null;
        zza = new zzii(zzihVar);
        zzb = new zzij(zzihVar);
    }

    /* synthetic */ zzik(zzih zzihVar) {
    }

    static zzik zzc() {
        return zza;
    }

    static zzik zzd() {
        return zzb;
    }

    abstract void zza(Object obj, long j);

    abstract <L> void zzb(Object obj, Object obj2, long j);
}
