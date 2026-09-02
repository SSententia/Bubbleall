package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzgja {
    zzgja() {
    }

    static final String zzd(ByteBuffer byteBuffer, int i, int i2) throws zzggm {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!zzgiz.zza(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (zzgiz.zza(b2)) {
                cArr[i5] = (char) b2;
                i5++;
                i = i6;
                while (i < i3) {
                    byte b3 = byteBuffer.get(i);
                    if (!zzgiz.zza(b3)) {
                        break;
                    }
                    i++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else if (zzgiz.zzb(b2)) {
                if (i6 >= i3) {
                    throw zzggm.zzl();
                }
                i += 2;
                zzgiz.zzd(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (zzgiz.zzc(b2)) {
                if (i6 >= i3 - 1) {
                    throw zzggm.zzl();
                }
                int i7 = i + 2;
                i += 3;
                zzgiz.zze(b2, byteBuffer.get(i6), byteBuffer.get(i7), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw zzggm.zzl();
                }
                int i8 = i + 2;
                int i9 = i + 3;
                i += 4;
                zzgiz.zzf(b2, byteBuffer.get(i6), byteBuffer.get(i8), byteBuffer.get(i9), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    final boolean zza(byte[] bArr, int i, int i2) {
        return zzb(0, bArr, i, i2) == 0;
    }

    abstract int zzb(int i, byte[] bArr, int i2, int i3);

    abstract String zzc(byte[] bArr, int i, int i2) throws zzggm;
}
