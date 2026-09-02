package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzavf {
    public final List<byte[]> zza;
    public final int zzb;
    public final float zzc;

    private zzavf(List<byte[]> list, int i, int i2, int i3, float f) {
        this.zza = list;
        this.zzb = i;
        this.zzc = f;
    }

    public static zzavf zza(zzaux zzauxVar) throws zzanp {
        int i;
        int i2;
        float f;
        int iZzd;
        int i3;
        try {
            zzauxVar.zzj(4);
            int i4 = 1;
            int iZzl = (zzauxVar.zzl() & 3) + 1;
            if (iZzl == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzl2 = zzauxVar.zzl() & 31;
            for (int i5 = 0; i5 < iZzl2; i5++) {
                arrayList.add(zzb(zzauxVar));
            }
            int iZzl3 = zzauxVar.zzl();
            for (int i6 = 0; i6 < iZzl3; i6++) {
                arrayList.add(zzb(zzauxVar));
            }
            float f2 = 1.0f;
            if (iZzl2 > 0) {
                zzauy zzauyVar = new zzauy((byte[]) arrayList.get(0), iZzl, ((byte[]) arrayList.get(0)).length);
                zzauyVar.zza(8);
                int iZzc = zzauyVar.zzc(8);
                zzauyVar.zza(16);
                zzauyVar.zzd();
                if (iZzc == 100 || iZzc == 110 || iZzc == 122 || iZzc == 244 || iZzc == 44 || iZzc == 83 || iZzc == 86 || iZzc == 118 || iZzc == 128 || iZzc == 138) {
                    iZzd = zzauyVar.zzd();
                    if (iZzd == 3) {
                        zzauyVar.zzb();
                        i3 = 3;
                    } else {
                        i3 = iZzd;
                    }
                    zzauyVar.zzd();
                    zzauyVar.zzd();
                    zzauyVar.zza(1);
                    if (zzauyVar.zzb()) {
                        int i7 = i3 != 3 ? 8 : 12;
                        int i8 = 0;
                        while (i8 < i7) {
                            if (zzauyVar.zzb()) {
                                int i9 = i8 < 6 ? 16 : 64;
                                int iZze = 8;
                                int i10 = 8;
                                for (int i11 = 0; i11 < i9; i11++) {
                                    if (iZze != 0) {
                                        iZze = ((zzauyVar.zze() + i10) + 256) % 256;
                                    }
                                    if (iZze != 0) {
                                        i10 = iZze;
                                    }
                                }
                            }
                            i8++;
                        }
                    }
                } else {
                    iZzd = 1;
                }
                zzauyVar.zzd();
                int iZzd2 = zzauyVar.zzd();
                if (iZzd2 == 0) {
                    zzauyVar.zzd();
                } else if (iZzd2 == 1) {
                    zzauyVar.zzb();
                    zzauyVar.zze();
                    zzauyVar.zze();
                    long jZzd = zzauyVar.zzd();
                    for (int i12 = 0; i12 < jZzd; i12++) {
                        zzauyVar.zzd();
                    }
                }
                zzauyVar.zzd();
                zzauyVar.zza(1);
                int iZzd3 = zzauyVar.zzd() + 1;
                int iZzd4 = zzauyVar.zzd() + 1;
                boolean zZzb = zzauyVar.zzb();
                int i13 = 2 - (zZzb ? 1 : 0);
                int i14 = iZzd4 * i13;
                if (!zZzb) {
                    zzauyVar.zza(1);
                }
                zzauyVar.zza(1);
                int i15 = iZzd3 * 16;
                int i16 = i14 * 16;
                if (zzauyVar.zzb()) {
                    int iZzd5 = zzauyVar.zzd();
                    int iZzd6 = zzauyVar.zzd();
                    int iZzd7 = zzauyVar.zzd();
                    int iZzd8 = zzauyVar.zzd();
                    if (iZzd != 0) {
                        int i17 = iZzd == 3 ? 1 : 2;
                        i13 *= iZzd == 1 ? 2 : 1;
                        i4 = i17;
                    }
                    i15 -= (iZzd5 + iZzd6) * i4;
                    i16 -= (iZzd7 + iZzd8) * i13;
                }
                if (zzauyVar.zzb() && zzauyVar.zzb()) {
                    int iZzc2 = zzauyVar.zzc(8);
                    if (iZzc2 == 255) {
                        int iZzc3 = zzauyVar.zzc(16);
                        int iZzc4 = zzauyVar.zzc(16);
                        if (iZzc3 != 0 && iZzc4 != 0) {
                            f2 = iZzc3 / iZzc4;
                        }
                    } else if (iZzc2 < 17) {
                        f2 = zzauv.zzb[iZzc2];
                    } else {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(iZzc2);
                        Log.w("NalUnitUtil", sb.toString());
                    }
                }
                f = f2;
                i = i15;
                i2 = i16;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new zzavf(arrayList, iZzl, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzanp("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzaux zzauxVar) {
        int iZzm = zzauxVar.zzm();
        int iZzg = zzauxVar.zzg();
        zzauxVar.zzj(iZzm);
        return zzauq.zzb(zzauxVar.zza, iZzg, iZzm);
    }
}
