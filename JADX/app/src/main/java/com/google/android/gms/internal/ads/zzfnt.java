package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfnt {
    static Object zza(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            return i <= 65536 ? new short[i] : new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    static int zzb(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & UByte.MAX_VALUE;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    static void zzc(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    static int zzd(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    static int zze(@CheckForNull Object obj, @CheckForNull Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int iZzb = zzfob.zzb(obj);
        int i2 = iZzb & i;
        int iZzb2 = zzb(obj3, i2);
        if (iZzb2 != 0) {
            int i3 = ~i;
            int i4 = iZzb & i3;
            int i5 = -1;
            while (true) {
                int i6 = iZzb2 - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) != i4 || !zzflt.zza(obj, objArr[i6]) || (objArr2 != null && !zzflt.zza(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    iZzb2 = i8;
                } else {
                    int i9 = i7 & i;
                    if (i5 == -1) {
                        zzc(obj3, i2, i9);
                    } else {
                        iArr[i5] = (i9 & i) | (iArr[i5] & i3);
                    }
                    return i6;
                }
            }
        }
        return -1;
    }
}
