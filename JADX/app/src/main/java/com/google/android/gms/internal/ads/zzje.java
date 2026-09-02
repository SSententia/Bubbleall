package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzje extends zzjg {
    private final zzki zzd;
    private final zzfoj<zzjc> zze;
    private final zzaku zzf;

    protected zzje(zzq zzqVar, int[] iArr, int i, zzki zzkiVar, long j, long j2, long j3, float f, float f2, List<zzjc> list, zzaku zzakuVar) {
        super(zzqVar, iArr, 0);
        this.zzd = zzkiVar;
        this.zze = zzfoj.zzp(list);
        this.zzf = zzakuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ zzfoj<zzfoj<zzjc>> zza(zzju[] zzjuVarArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= 2) {
                break;
            }
            zzju zzjuVar = zzjuVarArr[i4];
            if (zzjuVar == null || zzjuVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfog zzfogVarZzu = zzfoj.zzu();
                zzfogVarZzu.zze(new zzjc(0L, 0L));
                arrayList.add(zzfogVarZzu);
            }
            i4++;
        }
        long[][] jArr = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            zzju zzjuVar2 = zzjuVarArr[i5];
            if (zzjuVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                jArr[i5] = new long[zzjuVar2.zzb.length];
                int i6 = 0;
                while (true) {
                    int[] iArr = zzjuVar2.zzb;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    jArr[i5][i6] = zzjuVar2.zza.zza(iArr[i6]).zzh;
                    i6++;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr2 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr3 = jArr[i7];
            jArr2[i7] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        zzf(arrayList, jArr2);
        zzfoy zzfoyVarZza = zzfpr.zzc(zzfpw.zzb()).zzb(2).zza();
        int i8 = 0;
        while (i8 < i) {
            int length = jArr[i8].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i9 = i3;
                while (true) {
                    long[] jArr4 = jArr[i8];
                    double dLog = 0.0d;
                    if (i9 >= jArr4.length) {
                        break;
                    }
                    long j = jArr4[i9];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i9] = dLog;
                    i9++;
                }
                int i10 = length - 1;
                double d = dArr[i10] - dArr[i3];
                int i11 = i3;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    zzfoyVarZza.zzh(Double.valueOf(d == 0.0d ? 1.0d : (((dArr[i11] + dArr[i12]) * 0.5d) - dArr[i3]) / d), Integer.valueOf(i8));
                    i11 = i12;
                    i3 = 0;
                }
            }
            i8++;
            i3 = 0;
            i = 2;
            i2 = 1;
        }
        zzfoj zzfojVarZzp = zzfoj.zzp(zzfoyVarZza.zzt());
        for (int i13 = 0; i13 < zzfojVarZzp.size(); i13++) {
            int iIntValue = ((Integer) zzfojVarZzp.get(i13)).intValue();
            int i14 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i14;
            jArr2[iIntValue] = jArr[iIntValue][i14];
            zzf(arrayList, jArr2);
        }
        for (int i15 = 0; i15 < 2; i15++) {
            if (arrayList.get(i15) != null) {
                long j2 = jArr2[i15];
                jArr2[i15] = j2 + j2;
            }
        }
        zzf(arrayList, jArr2);
        zzfog zzfogVarZzu2 = zzfoj.zzu();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            zzfog zzfogVar = (zzfog) arrayList.get(i16);
            zzfogVarZzu2.zze(zzfogVar == null ? zzfoj.zzi() : zzfogVar.zzf());
        }
        return zzfogVarZzu2.zzf();
    }

    private static void zzf(List<zzfog<zzjc>> list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfog<zzjc> zzfogVar = list.get(i2);
            if (zzfogVar != null) {
                zzfogVar.zze(new zzjc(j, jArr[i2]));
            }
        }
    }
}
