package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzjx extends zzjz {
    private zzjw zza;

    protected abstract Pair<zzahx[], zzjg[]> zze(zzjw zzjwVar, int[][][] iArr, int[] iArr2, zzhf zzhfVar, zzaiq zzaiqVar) throws zzaeg;

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zzi(Object obj) {
        this.zza = (zzjw) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final zzka zzj(zzahw[] zzahwVarArr, zzs zzsVar, zzhf zzhfVar, zzaiq zzaiqVar) throws zzaeg {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzq[][] zzqVarArr = new zzq[3][];
        int[][][] iArr3 = new int[3][][];
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = zzsVar.zzb;
            zzqVarArr[i2] = new zzq[i3];
            iArr3[i2] = new int[i3][];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr4[i5] = zzahwVarArr[i5].zzG();
        }
        int i6 = 0;
        while (i6 < zzsVar.zzb) {
            zzq zzqVarZza = zzsVar.zza(i6);
            int iZzf = zzalt.zzf(zzqVarZza.zza(i).zzl);
            int i7 = i4;
            int i8 = i;
            int i9 = i8;
            boolean z = true;
            while (i8 < i4) {
                zzahw zzahwVar = zzahwVarArr[i8];
                int iMax = i;
                while (true) {
                    int i10 = zzqVarZza.zza;
                    if (i > 0) {
                        break;
                    }
                    iMax = Math.max(iMax, zzahwVar.zzH(zzqVarZza.zza(i)) & 7);
                    i++;
                }
                boolean z2 = iArr2[i8] == 0;
                if (iMax > i9) {
                    z = z2;
                    i9 = iMax;
                    i7 = i8;
                } else if (iMax == i9 && iZzf == 5 && !z && z2) {
                    i9 = iMax;
                    i7 = i8;
                    z = true;
                }
                i8++;
                i4 = 2;
                i = 0;
            }
            if (i7 == i4) {
                int i11 = zzqVarZza.zza;
                iArr = new int[1];
            } else {
                zzahw zzahwVar2 = zzahwVarArr[i7];
                int i12 = zzqVarZza.zza;
                int[] iArr5 = new int[1];
                int i13 = 0;
                while (true) {
                    int i14 = zzqVarZza.zza;
                    if (i13 > 0) {
                        break;
                    }
                    iArr5[i13] = zzahwVar2.zzH(zzqVarZza.zza(i13));
                    i13++;
                }
                iArr = iArr5;
            }
            int i15 = iArr2[i7];
            zzqVarArr[i7][i15] = zzqVarZza;
            iArr3[i7][i15] = iArr;
            iArr2[i7] = i15 + 1;
            i6++;
            i4 = 2;
            i = 0;
        }
        zzs[] zzsVarArr = new zzs[i4];
        String[] strArr = new String[i4];
        int[] iArr6 = new int[i4];
        int i16 = 0;
        while (i16 < i4) {
            int i17 = iArr2[i16];
            zzsVarArr[i16] = new zzs((zzq[]) zzamq.zzf(zzqVarArr[i16], i17));
            iArr3[i16] = (int[][]) zzamq.zzf(iArr3[i16], i17);
            strArr[i16] = zzahwVarArr[i16].zzc();
            iArr6[i16] = zzahwVarArr[i16].zzac();
            i16++;
            i4 = 2;
        }
        int i18 = i4;
        zzjw zzjwVar = new zzjw(strArr, iArr6, zzsVarArr, iArr4, iArr3, new zzs((zzq[]) zzamq.zzf(zzqVarArr[i18], iArr2[i18])));
        Pair<zzahx[], zzjg[]> pairZze = zze(zzjwVar, iArr3, iArr4, zzhfVar, zzaiqVar);
        return new zzka((zzahx[]) pairZze.first, (zzjg[]) pairZze.second, zzjwVar, null);
    }
}
