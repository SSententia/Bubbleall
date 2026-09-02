package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqj {
    private final zzamf zza = new zzamf(8);
    private int zzb;

    private final long zzb(zznv zznvVar) throws IOException {
        zznp zznpVar = (zznp) zznvVar;
        int i = 0;
        zznpVar.zzh(this.zza.zzi(), 0, 1, false);
        int i2 = this.zza.zzi()[0] & UByte.MAX_VALUE;
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
        zznpVar.zzh(this.zza.zzi(), 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.zza.zzi()[i] & UByte.MAX_VALUE) + (i5 << 8);
        }
        this.zzb += i4 + 1;
        return i5;
    }

    public final boolean zza(zznv zznvVar) throws IOException {
        long jZzo = zznvVar.zzo();
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (jZzo != -1 && jZzo <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = jZzo;
        }
        int i = (int) j;
        zznp zznpVar = (zznp) zznvVar;
        zznpVar.zzh(this.zza.zzi(), 0, 4, false);
        long jZzt = this.zza.zzt();
        this.zzb = 4;
        while (jZzt != 440786851) {
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zznpVar.zzh(this.zza.zzi(), 0, 1, false);
            jZzt = ((jZzt << 8) & (-256)) | ((long) (this.zza.zzi()[0] & UByte.MAX_VALUE));
        }
        long jZzb = zzb(zznvVar);
        long j2 = this.zzb;
        if (jZzb != Long.MIN_VALUE && (jZzo == -1 || j2 + jZzb < jZzo)) {
            while (true) {
                long j3 = this.zzb;
                long j4 = j2 + jZzb;
                if (j3 < j4) {
                    if (zzb(zznvVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jZzb2 = zzb(zznvVar);
                    if (jZzb2 < 0) {
                        return false;
                    }
                    if (jZzb2 != 0) {
                        int i3 = (int) jZzb2;
                        zznpVar.zzj(i3, false);
                        this.zzb += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }
}
