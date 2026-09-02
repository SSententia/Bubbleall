package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzalw {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    if (iArr.length <= i4) {
                        int length = iArr.length;
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = zzd[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i9 + 2;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x011f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0123  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:73:0x0129  */
    /* JADX WARN: Code duplicated, block: B:90:0x0185  */
    /* JADX WARN: Code duplicated, block: B:95:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x009d A[SYNTHETIC] */
    public static zzalv zzb(byte[] bArr, int i, int i2) {
        int iZzf;
        int i3;
        boolean zZzd;
        int i4;
        int i5;
        int i6;
        int iZzg;
        int i7;
        int i8;
        int iZzf2;
        boolean z;
        boolean zZzd2;
        int i9;
        int i10;
        int i11;
        float f;
        int i12;
        zzamg zzamgVar = new zzamg(bArr, i, i2);
        zzamgVar.zzc(8);
        int iZze = zzamgVar.zze(8);
        int iZze2 = zzamgVar.zze(8);
        int iZze3 = zzamgVar.zze(8);
        int iZzf3 = zzamgVar.zzf();
        int i13 = 1;
        if (iZze == 100 || iZze == 110 || iZze == 122 || iZze == 244 || iZze == 44 || iZze == 83 || iZze == 86 || iZze == 118 || iZze == 128) {
            iZzf = zzamgVar.zzf();
            if (iZzf == 3) {
                zZzd = zzamgVar.zzd();
                i3 = 3;
            } else {
                i3 = iZzf;
                zZzd = false;
            }
            zzamgVar.zzf();
            zzamgVar.zzf();
            zzamgVar.zzb();
            if (zzamgVar.zzd()) {
                if (i3 != 3) {
                    i4 = 8;
                } else {
                    i4 = 12;
                }
                for (i5 = 0; i5 < i4; i5++) {
                    if (!zzamgVar.zzd()) {
                        if (i5 < 6) {
                            i6 = 16;
                        } else {
                            i6 = 64;
                        }
                        iZzg = 8;
                        i7 = 8;
                        for (i8 = 0; i8 < i6; i8++) {
                            if (iZzg != 0) {
                                iZzg = ((i7 + zzamgVar.zzg()) + 256) % 256;
                            }
                            if (iZzg != 0) {
                                i7 = iZzg;
                            }
                        }
                    }
                }
            }
        } else if (iZze == 138) {
            iZze = 138;
            iZzf = zzamgVar.zzf();
            if (iZzf == 3) {
                zZzd = zzamgVar.zzd();
                i3 = 3;
            } else {
                i3 = iZzf;
                zZzd = false;
            }
            zzamgVar.zzf();
            zzamgVar.zzf();
            zzamgVar.zzb();
            if (zzamgVar.zzd()) {
                if (i3 != 3) {
                    i4 = 8;
                } else {
                    i4 = 12;
                }
                while (i5 < i4) {
                    if (!zzamgVar.zzd()) {
                        if (i5 < 6) {
                            i6 = 16;
                        } else {
                            i6 = 64;
                        }
                        iZzg = 8;
                        i7 = 8;
                        while (i8 < i6) {
                            if (iZzg != 0) {
                                iZzg = ((i7 + zzamgVar.zzg()) + 256) % 256;
                            }
                            if (iZzg != 0) {
                                i7 = iZzg;
                            }
                        }
                    }
                }
            }
        } else {
            iZzf = 1;
            zZzd = false;
        }
        int iZzf4 = zzamgVar.zzf() + 4;
        int iZzf5 = zzamgVar.zzf();
        if (iZzf5 != 0) {
            if (iZzf5 == 1) {
                boolean zZzd3 = zzamgVar.zzd();
                zzamgVar.zzg();
                zzamgVar.zzg();
                long jZzf = zzamgVar.zzf();
                iZze = iZze;
                for (int i14 = 0; i14 < jZzf; i14++) {
                    zzamgVar.zzf();
                }
                z = zZzd3;
                iZzf5 = 1;
                iZzf2 = 0;
            } else {
                iZzf2 = 0;
            }
            zzamgVar.zzf();
            zzamgVar.zzb();
            int iZzf6 = zzamgVar.zzf() + 1;
            int iZzf7 = zzamgVar.zzf();
            zZzd2 = zzamgVar.zzd();
            i9 = 2 - (zZzd2 ? 1 : 0);
            int i15 = (iZzf7 + 1) * i9;
            if (!zZzd2) {
                zzamgVar.zzb();
            }
            zzamgVar.zzb();
            i10 = iZzf6 * 16;
            i11 = i15 * 16;
            if (zzamgVar.zzd()) {
                int iZzf8 = zzamgVar.zzf();
                int iZzf9 = zzamgVar.zzf();
                int iZzf10 = zzamgVar.zzf();
                int iZzf11 = zzamgVar.zzf();
                if (iZzf != 0) {
                    if (iZzf == 3) {
                        i12 = 1;
                    } else {
                        i12 = 2;
                    }
                    i9 *= iZzf == 1 ? 2 : 1;
                    i13 = i12;
                }
                i10 -= (iZzf8 + iZzf9) * i13;
                i11 -= (iZzf10 + iZzf11) * i9;
            }
            int i16 = i11;
            if (zzamgVar.zzd() || !zzamgVar.zzd()) {
                f = 1.0f;
            } else {
                int iZze4 = zzamgVar.zze(8);
                if (iZze4 == 255) {
                    int iZze5 = zzamgVar.zze(16);
                    int iZze6 = zzamgVar.zze(16);
                    if (iZze5 == 0 || iZze6 == 0) {
                        f = 1.0f;
                    } else {
                        f = iZze5 / iZze6;
                    }
                } else if (iZze4 < 17) {
                    f = zzb[iZze4];
                } else {
                    StringBuilder sb = new StringBuilder(46);
                    sb.append("Unexpected aspect_ratio_idc value: ");
                    sb.append(iZze4);
                    Log.w("NalUnitUtil", sb.toString());
                    f = 1.0f;
                }
            }
            return new zzalv(iZze, iZze2, iZze3, iZzf3, i10, i16, f, zZzd, zZzd2, iZzf4, iZzf5, iZzf2, z);
        }
        iZzf2 = zzamgVar.zzf() + 4;
        z = false;
        zzamgVar.zzf();
        zzamgVar.zzb();
        int iZzf12 = zzamgVar.zzf() + 1;
        int iZzf13 = zzamgVar.zzf();
        zZzd2 = zzamgVar.zzd();
        i9 = 2 - (zZzd2 ? 1 : 0);
        int i17 = (iZzf13 + 1) * i9;
        if (!zZzd2) {
            zzamgVar.zzb();
        }
        zzamgVar.zzb();
        i10 = iZzf12 * 16;
        i11 = i17 * 16;
        if (zzamgVar.zzd()) {
            int iZzf14 = zzamgVar.zzf();
            int iZzf15 = zzamgVar.zzf();
            int iZzf16 = zzamgVar.zzf();
            int iZzf17 = zzamgVar.zzf();
            if (iZzf != 0) {
                if (iZzf == 3) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                i9 *= iZzf == 1 ? 2 : 1;
                i13 = i12;
            }
            i10 -= (iZzf14 + iZzf15) * i13;
            i11 -= (iZzf16 + iZzf17) * i9;
        }
        int i18 = i11;
        if (zzamgVar.zzd()) {
            f = 1.0f;
        } else {
            f = 1.0f;
        }
        return new zzalv(iZze, iZze2, iZze3, iZzf3, i10, i18, f, zZzd, zZzd2, iZzf4, iZzf5, iZzf2, z);
    }

    public static zzalu zzc(byte[] bArr, int i, int i2) {
        zzamg zzamgVar = new zzamg(bArr, 3, i2);
        zzamgVar.zzc(8);
        int iZzf = zzamgVar.zzf();
        int iZzf2 = zzamgVar.zzf();
        zzamgVar.zzb();
        return new zzalu(iZzf, iZzf2, zzamgVar.zzd());
    }

    public static int zzd(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzakt.zzd(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zze(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zze(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zze(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    zze(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static void zze(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
