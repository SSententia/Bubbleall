package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzarb {
    private static final int[] zza = {zzave.zzl("isom"), zzave.zzl("iso2"), zzave.zzl("iso3"), zzave.zzl("iso4"), zzave.zzl("iso5"), zzave.zzl("iso6"), zzave.zzl("avc1"), zzave.zzl("hvc1"), zzave.zzl("hev1"), zzave.zzl("mp41"), zzave.zzl("mp42"), zzave.zzl("3g2a"), zzave.zzl("3g2b"), zzave.zzl("3gr6"), zzave.zzl("3gs6"), zzave.zzl("3ge6"), zzave.zzl("3gg6"), zzave.zzl("M4V "), zzave.zzl("M4A "), zzave.zzl("f4v "), zzave.zzl("kddi"), zzave.zzl("M4VP"), zzave.zzl("qt  "), zzave.zzl("MSNV")};

    public static boolean zza(zzapn zzapnVar) throws InterruptedException, IOException {
        return zzc(zzapnVar, true);
    }

    public static boolean zzb(zzapn zzapnVar) throws InterruptedException, IOException {
        return zzc(zzapnVar, false);
    }

    private static boolean zzc(zzapn zzapnVar, boolean z) throws InterruptedException, IOException {
        boolean z2;
        long jZzv;
        int i;
        long jZzi = zzapnVar.zzi();
        if (jZzi == -1 || jZzi > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            jZzi = 4096;
        }
        int i2 = (int) jZzi;
        zzaux zzauxVar = new zzaux(64);
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            if (i3 < i2) {
                zzauxVar.zza(8);
                zzapnVar.zze(zzauxVar.zza, 0, 8, false);
                long jZzp = zzauxVar.zzp();
                int iZzr = zzauxVar.zzr();
                if (jZzp == 1) {
                    zzapnVar.zze(zzauxVar.zza, 8, 8, false);
                    i = 16;
                    zzauxVar.zzf(16);
                    jZzv = zzauxVar.zzv();
                } else {
                    jZzv = jZzp;
                    i = 8;
                }
                long j = i;
                if (jZzv < j) {
                    return false;
                }
                i3 += i;
                if (iZzr != zzaqk.zzE) {
                    if (iZzr == zzaqk.zzN || iZzr == zzaqk.zzP) {
                        z2 = true;
                        return !z3 && z == z2;
                    }
                    if ((((long) i3) + jZzv) - j < i2) {
                        int i4 = (int) (jZzv - j);
                        i3 += i4;
                        if (iZzr == zzaqk.zzd) {
                            if (i4 < 8) {
                                return false;
                            }
                            zzauxVar.zza(i4);
                            zzapnVar.zze(zzauxVar.zza, 0, i4, false);
                            int i5 = i4 >> 2;
                            for (int i6 = 0; i6 < i5; i6++) {
                                if (i6 != 1) {
                                    int iZzr2 = zzauxVar.zzr();
                                    if ((iZzr2 >>> 8) != zzave.zzl("3gp")) {
                                        int[] iArr = zza;
                                        int length = iArr.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= 24) {
                                                continue;
                                            } else if (iArr[i7] != iZzr2) {
                                                i7++;
                                            }
                                        }
                                    }
                                    z3 = true;
                                    break;
                                }
                                zzauxVar.zzj(4);
                            }
                            if (!z3) {
                                return false;
                            }
                        } else if (i4 != 0) {
                            zzapnVar.zzf(i4, false);
                        }
                    }
                }
            }
            z2 = false;
            if (z3) {
            }
        }
    }
}
