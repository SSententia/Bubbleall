package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpi extends zznl {
    public zzpi(zzoh zzohVar, int i, long j, long j2) {
        long j3;
        zzni zzniVarZzb = zzpf.zzb(zzohVar);
        zzpg zzpgVar = new zzpg(zzohVar, i, null);
        long jZza = zzohVar.zza();
        long j4 = zzohVar.zzj;
        int i2 = zzohVar.zzd;
        if (i2 > 0) {
            j3 = ((((long) i2) + ((long) zzohVar.zzc)) / 2) + 1;
        } else {
            int i3 = zzohVar.zza;
            int i4 = zzohVar.zzb;
            long j5 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i3 == i4 && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * ((long) zzohVar.zzg)) * ((long) zzohVar.zzh)) / 8) + 64;
        }
        super(zzniVarZzb, zzpgVar, jZza, 0L, j4, j, j2, j3, Math.max(6, zzohVar.zzc));
    }
}
