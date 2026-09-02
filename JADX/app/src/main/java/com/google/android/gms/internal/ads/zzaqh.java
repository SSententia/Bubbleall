package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaqh {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzc(int i) {
        int i2 = 0;
        while (i2 < 8) {
            long j = zza[i2] & ((long) i);
            i2++;
            if (j != 0) {
                return i2;
            }
        }
        return -1;
    }

    public static long zzd(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~zza[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public final void zza() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final long zze(zzapn zzapnVar, boolean z, boolean z2, int i) throws InterruptedException, IOException {
        if (this.zzc == 0) {
            if (!zzapnVar.zzb(this.zzb, 0, 1, z)) {
                return -1L;
            }
            int iZzc = zzc(this.zzb[0] & UByte.MAX_VALUE);
            this.zzd = iZzc;
            if (iZzc == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i2 = this.zzd;
        if (i2 > i) {
            this.zzc = 0;
            return -2L;
        }
        if (i2 != 1) {
            zzapnVar.zzb(this.zzb, 1, i2 - 1, false);
        }
        this.zzc = 0;
        return zzd(this.zzb, this.zzd, z2);
    }
}
