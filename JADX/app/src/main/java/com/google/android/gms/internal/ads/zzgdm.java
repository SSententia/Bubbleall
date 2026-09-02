package com.google.android.gms.internal.ads;

import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgdm {
    static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzc = zzc(bArr, 0, 0);
        long jZzc2 = zzc(bArr, 3, 2) & 67108611;
        long jZzc3 = zzc(bArr, 6, 4) & 67092735;
        long jZzc4 = zzc(bArr, 9, 6) & 66076671;
        long jZzc5 = zzc(bArr, 12, 8) & 1048575;
        long j = jZzc2 * 5;
        long j2 = jZzc3 * 5;
        long j3 = jZzc4 * 5;
        long j4 = jZzc5 * 5;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        int i2 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 >= length) {
                long j10 = j5 + (j6 >> 26);
                long j11 = j10 & 67108863;
                long j12 = j7 + (j10 >> 26);
                long j13 = j12 & 67108863;
                long j14 = j8 + (j12 >> 26);
                long j15 = j14 & 67108863;
                long j16 = j9 + ((j14 >> 26) * 5);
                long j17 = j16 & 67108863;
                long j18 = (j6 & 67108863) + (j16 >> 26);
                long j19 = j17 + 5;
                long j20 = (j19 >> 26) + j18;
                long j21 = j11 + (j20 >> 26);
                long j22 = j13 + (j21 >> 26);
                long j23 = (j15 + (j22 >> 26)) - 67108864;
                long j24 = j23 >> 63;
                long j25 = ~j24;
                long j26 = (j18 & j24) | (j20 & 67108863 & j25);
                long j27 = (j11 & j24) | (j21 & 67108863 & j25);
                long j28 = (j13 & j24) | (j22 & 67108863 & j25);
                long jZzb = (((j17 & j24) | (j19 & 67108863 & j25) | (j26 << 26)) & 4294967295L) + zzb(bArr, 16);
                long jZzb2 = (((j26 >> 6) | (j27 << 20)) & 4294967295L) + zzb(bArr, 20) + (jZzb >> 32);
                long jZzb3 = (((j27 >> 12) | (j28 << 14)) & 4294967295L) + zzb(bArr, 24) + (jZzb2 >> 32);
                long jZzb4 = zzb(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzb & 4294967295L, 0);
                zzd(bArr4, jZzb2 & 4294967295L, 4);
                zzd(bArr4, jZzb3 & 4294967295L, 8);
                zzd(bArr4, ((((((j23 & j25) | (j15 & j24)) << 8) | (j28 >> 18)) & 4294967295L) + jZzb4 + (jZzb3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i, (byte) 0);
            }
            long jZzc6 = j9 + zzc(bArr3, 0, 0);
            long jZzc7 = j6 + zzc(bArr3, 3, 2);
            long jZzc8 = j5 + zzc(bArr3, 6, 4);
            long jZzc9 = j7 + zzc(bArr3, 9, 6);
            long jZzc10 = j8 + (zzc(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j29 = (jZzc6 * jZzc) + (jZzc7 * j4) + (jZzc8 * j3) + (jZzc9 * j2) + (jZzc10 * j);
            long j30 = (jZzc6 * jZzc2) + (jZzc7 * jZzc) + (jZzc8 * j4) + (jZzc9 * j3) + (jZzc10 * j2) + (j29 >> 26);
            long j31 = (jZzc6 * jZzc3) + (jZzc7 * jZzc2) + (jZzc8 * jZzc) + (jZzc9 * j4) + (jZzc10 * j3) + (j30 >> 26);
            long j32 = (jZzc6 * jZzc4) + (jZzc7 * jZzc3) + (jZzc8 * jZzc2) + (jZzc9 * jZzc) + (jZzc10 * j4) + (j31 >> 26);
            long j33 = (jZzc6 * jZzc5) + (jZzc7 * jZzc4) + (jZzc8 * jZzc3) + (jZzc9 * jZzc2) + (jZzc10 * jZzc) + (j32 >> 26);
            j8 = j33 & 67108863;
            long j34 = (j29 & 67108863) + ((j33 >> 26) * 5);
            j9 = j34 & 67108863;
            j6 = (j30 & 67108863) + (j34 >> 26);
            i2 += 16;
            j7 = j32 & 67108863;
            j5 = j31 & 67108863;
            i = 17;
        }
    }

    private static long zzb(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16))) & 4294967295L;
    }

    private static long zzc(byte[] bArr, int i, int i2) {
        return (zzb(bArr, i) >> i2) & 67108863;
    }

    private static void zzd(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }
}
