package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfqo {
    private static final OutputStream zza = new zzfqn();

    private static byte[] zzb(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArrRemove = queue.remove();
            int iMin = Math.min(i2, bArrRemove.length);
            System.arraycopy(bArrRemove, 0, bArr, i - i2, iMin);
            i2 -= iMin;
        }
        return bArr;
    }

    public static byte[] zza(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin = Math.min(i, 2147483639 - i2);
            byte[] bArr = new byte[iMin];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin) {
                int i4 = inputStream.read(bArr, i3, iMin - i3);
                if (i4 == -1) {
                    return zzb(arrayDeque, i2);
                }
                i3 += i4;
                i2 += i4;
            }
            long j = i;
            long j2 = j + j;
            if (j2 > 2147483647L) {
                i = Integer.MAX_VALUE;
            } else {
                i = j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
            }
        }
        if (inputStream.read() == -1) {
            return zzb(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
