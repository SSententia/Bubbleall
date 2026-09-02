package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzpq {
    protected final zzox zza;

    protected zzpq(zzox zzoxVar) {
        this.zza = zzoxVar;
    }

    protected abstract boolean zza(zzamf zzamfVar) throws zzaha;

    protected abstract boolean zzb(zzamf zzamfVar, long j) throws zzaha;

    public final boolean zzf(zzamf zzamfVar, long j) throws zzaha {
        return zza(zzamfVar) && zzb(zzamfVar, j);
    }
}
