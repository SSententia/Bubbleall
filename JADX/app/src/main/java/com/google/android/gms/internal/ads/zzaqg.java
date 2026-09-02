package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaqg {
    private final zzaux zza = new zzaux(8);
    private int zzb;

    private final long zzb(zzapn zzapnVar) throws InterruptedException, IOException {
        int i = 0;
        zzapnVar.zze(this.zza.zza, 0, 1, false);
        int i2 = this.zza.zza[0] & UByte.MAX_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        zzapnVar.zze(this.zza.zza, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.zza.zza[i] & UByte.MAX_VALUE) + (i5 << 8);
        }
        this.zzb += i4 + 1;
        return i5;
    }

    public final boolean zza(zzapn zzapnVar) throws InterruptedException, IOException {
        long jZzi = zzapnVar.zzi();
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (jZzi != -1 && jZzi <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = jZzi;
        }
        int i = (int) j;
        zzapnVar.zze(this.zza.zza, 0, 4, false);
        long jZzp = this.zza.zzp();
        this.zzb = 4;
        while (jZzp != 440786851) {
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzapnVar.zze(this.zza.zza, 0, 1, false);
            jZzp = ((jZzp << 8) & (-256)) | ((long) (this.zza.zza[0] & UByte.MAX_VALUE));
        }
        long jZzb = zzb(zzapnVar);
        long j2 = this.zzb;
        if (jZzb != Long.MIN_VALUE && (jZzi == -1 || j2 + jZzb < jZzi)) {
            while (true) {
                long j3 = this.zzb;
                long j4 = j2 + jZzb;
                if (j3 < j4) {
                    if (zzb(zzapnVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jZzb2 = zzb(zzapnVar);
                    if (jZzb2 < 0) {
                        return false;
                    }
                    if (jZzb2 != 0) {
                        zzapnVar.zzf((int) jZzb2, false);
                        this.zzb = (int) (((long) this.zzb) + jZzb2);
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }
}
