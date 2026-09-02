package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzrt {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zznv zznvVar) throws IOException {
        return zzc(zznvVar, true, false);
    }

    public static boolean zzb(zznv zznvVar, boolean z) throws IOException {
        return zzc(zznvVar, false, false);
    }

    private static boolean zzc(zznv zznvVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        long jZzx;
        int i;
        long jZzo = zznvVar.zzo();
        long j = -1;
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (jZzo != -1 && jZzo <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = jZzo;
        }
        int i2 = (int) j2;
        zzamf zzamfVar = new zzamf(64);
        boolean z4 = false;
        int i3 = 0;
        boolean z5 = false;
        while (true) {
            if (i3 < i2) {
                zzamfVar.zza(8);
                if (!zznvVar.zzh(zzamfVar.zzi(), z4 ? 1 : 0, 8, true)) {
                    z3 = z4 ? 1 : 0;
                    break;
                }
                long jZzt = zzamfVar.zzt();
                int iZzv = zzamfVar.zzv();
                if (jZzt == 1) {
                    zznvVar.zzi(zzamfVar.zzi(), 8, 8);
                    i = 16;
                    zzamfVar.zzf(16);
                    jZzx = zzamfVar.zzx();
                } else {
                    if (jZzt == 0) {
                        long jZzo2 = zznvVar.zzo();
                        if (jZzo2 != j) {
                            jZzt = (jZzo2 - zznvVar.zzm()) + 8;
                        }
                    }
                    jZzx = jZzt;
                    i = 8;
                }
                long j3 = i;
                if (jZzx < j3) {
                    return z4;
                }
                i3 += i;
                if (iZzv == 1836019574) {
                    i2 += (int) jZzx;
                    if (jZzo != -1 && i2 > jZzo) {
                        i2 = (int) jZzo;
                    }
                    j = -1;
                } else {
                    if (iZzv == 1836019558 || iZzv == 1836475768) {
                        z3 = true;
                        break;
                    }
                    if ((((long) i3) + jZzx) - j3 < i2) {
                        int i4 = (int) (jZzx - j3);
                        i3 += i4;
                        if (iZzv == 1718909296) {
                            if (i4 < 8) {
                                return false;
                            }
                            zzamfVar.zza(i4);
                            zznvVar.zzi(zzamfVar.zzi(), 0, i4);
                            int i5 = i4 >> 2;
                            for (int i6 = 0; i6 < i5; i6++) {
                                if (i6 != 1) {
                                    int iZzv2 = zzamfVar.zzv();
                                    if ((iZzv2 >>> 8) != 3368816) {
                                        if (iZzv2 == 1751476579) {
                                            iZzv2 = 1751476579;
                                        }
                                        int[] iArr = zza;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= 29) {
                                                continue;
                                            } else if (iArr[i7] != iZzv2) {
                                                i7++;
                                            }
                                        }
                                    }
                                    z5 = true;
                                    break;
                                }
                                zzamfVar.zzk(4);
                            }
                            if (!z5) {
                                return false;
                            }
                        } else if (i4 != 0) {
                            zznvVar.zzk(i4);
                        }
                        j = -1;
                        z4 = false;
                    }
                }
            }
            z3 = false;
            break;
        }
        return z5 && z == z3;
    }
}
