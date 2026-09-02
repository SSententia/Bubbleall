package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznd {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    public static zznc zza(zzame zzameVar) {
        int i;
        int i2;
        int iZzh;
        int iZzh2 = zzameVar.zzh(16);
        int iZzh3 = zzameVar.zzh(16);
        if (iZzh3 == 65535) {
            iZzh3 = zzameVar.zzh(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iZzh3 + i;
        if (iZzh2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int iZzh4 = zzameVar.zzh(2);
        int i5 = 0;
        if (iZzh4 == 3) {
            int i6 = 0;
            while (true) {
                iZzh = i6 + zzameVar.zzh(2);
                if (!zzameVar.zzg()) {
                    break;
                }
                i6 = (iZzh + 1) << 2;
            }
            iZzh4 = iZzh + 3;
        }
        int i7 = iZzh4;
        int iZzh5 = zzameVar.zzh(10);
        if (zzameVar.zzg() && zzameVar.zzh(3) > 0) {
            zzameVar.zzf(2);
        }
        int i8 = true != zzameVar.zzg() ? 44100 : 48000;
        int iZzh6 = zzameVar.zzh(4);
        if (i8 == 44100 && iZzh6 == 13) {
            i2 = zzb[13];
        } else {
            if (i8 == 48000 && iZzh6 < 14) {
                i5 = zzb[iZzh6];
                int i9 = iZzh5 % 5;
                if (i9 == 1) {
                    if (iZzh6 != 3 || iZzh6 == 8) {
                        i5++;
                    }
                } else if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4 && (iZzh6 == 3 || iZzh6 == 8 || iZzh6 == 11)) {
                            i5++;
                        }
                    } else if (iZzh6 != 3) {
                        i5++;
                    } else {
                        i5++;
                    }
                } else if (iZzh6 == 8 || iZzh6 == 11) {
                    i5++;
                }
            }
            i2 = i5;
        }
        return new zznc(i7, 2, i8, i4, i2, null);
    }

    public static void zzb(int i, zzamf zzamfVar) {
        zzamfVar.zza(7);
        byte[] bArrZzi = zzamfVar.zzi();
        bArrZzi[0] = -84;
        bArrZzi[1] = 64;
        bArrZzi[2] = -1;
        bArrZzi[3] = -1;
        bArrZzi[4] = (byte) ((i >> 16) & 255);
        bArrZzi[5] = (byte) ((i >> 8) & 255);
        bArrZzi[6] = (byte) (i & 255);
    }
}
