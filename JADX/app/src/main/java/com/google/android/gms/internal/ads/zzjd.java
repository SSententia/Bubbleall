package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzjd {
    private final zzaku zza = zzaku.zza;

    protected final zzje zza(zzq zzqVar, int[] iArr, int i, zzki zzkiVar, zzfoj<zzjc> zzfojVar) {
        return new zzje(zzqVar, iArr, 0, zzkiVar, WorkRequest.MIN_BACKOFF_MILLIS, 25000L, 25000L, 0.7f, 0.75f, zzfojVar, this.zza);
    }
}
