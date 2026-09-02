package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgjb extends zzgja {
    zzgjb() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzgja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzb(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgjb.zzb(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgja
    final String zzc(byte[] bArr, int i, int i2) throws zzggm {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!zzgiz.zza(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (zzgiz.zza(b2)) {
                cArr[i4] = (char) b2;
                i4++;
                i = i5;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (!zzgiz.zza(b3)) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) b3;
                    i4++;
                }
            } else if (zzgiz.zzb(b2)) {
                if (i5 >= i3) {
                    throw zzggm.zzl();
                }
                i += 2;
                zzgiz.zzd(b2, bArr[i5], cArr, i4);
                i4++;
            } else if (zzgiz.zzc(b2)) {
                if (i5 >= i3 - 1) {
                    throw zzggm.zzl();
                }
                int i6 = i + 2;
                i += 3;
                zzgiz.zze(b2, bArr[i5], bArr[i6], cArr, i4);
                i4++;
            } else {
                if (i5 >= i3 - 2) {
                    throw zzggm.zzl();
                }
                int i7 = i + 2;
                int i8 = i + 3;
                i += 4;
                zzgiz.zzf(b2, bArr[i5], bArr[i7], bArr[i8], cArr, i4);
                i4 += 2;
            }
        }
        return new String(cArr, 0, i4);
    }
}
