package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzatm extends zzatq {
    private final AtomicReference<zzatl> zza;

    public zzatm() {
        this(null);
    }

    protected static boolean zza(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    private static int zzh(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    @Override // com.google.android.gms.internal.ads.zzatq
    protected final zzatk[] zzb(zzans[] zzansVarArr, zzatg[] zzatgVarArr, int[][][] iArr) throws zzamy {
        zzatn zzatnVar;
        boolean z;
        int[] iArr2;
        boolean z2;
        boolean z3;
        int i = 2;
        zzatk[] zzatkVarArr = new zzatk[2];
        zzatl zzatlVar = this.zza.get();
        int i2 = 0;
        boolean z4 = false;
        while (true) {
            int i3 = -1;
            int i4 = 1;
            if (i2 >= i) {
                break;
            }
            if (zzansVarArr[i2].zza() == i) {
                if (!z4) {
                    zzans zzansVar = zzansVarArr[i2];
                    zzatg zzatgVar = zzatgVarArr[i2];
                    int[][] iArr3 = iArr[i2];
                    int i5 = zzatlVar.zzd;
                    int i6 = zzatlVar.zze;
                    int i7 = zzatlVar.zzf;
                    boolean z5 = zzatlVar.zzc;
                    boolean z6 = zzatlVar.zzb;
                    int i8 = zzatlVar.zzi;
                    int i9 = zzatlVar.zzj;
                    boolean z7 = zzatlVar.zzk;
                    boolean z8 = zzatlVar.zzg;
                    boolean z9 = zzatlVar.zzh;
                    int iZzk = -1;
                    int i10 = 0;
                    zzatf zzatfVar = null;
                    int i11 = 0;
                    int i12 = 0;
                    while (i10 < zzatgVar.zzb) {
                        zzatf zzatfVarZza = zzatgVar.zza(i10);
                        int i13 = zzatfVarZza.zza;
                        ArrayList arrayList = new ArrayList(i4);
                        int i14 = 0;
                        while (true) {
                            int i15 = zzatfVarZza.zza;
                            if (i14 > 0) {
                                break;
                            }
                            arrayList.add(Integer.valueOf(i14));
                            i14++;
                        }
                        int[] iArr4 = iArr3[i10];
                        int i16 = 0;
                        while (true) {
                            int i17 = zzatfVarZza.zza;
                            if (i16 <= 0) {
                                zzatg zzatgVar2 = zzatgVar;
                                if (zza(iArr4[i16], true)) {
                                    zzanm zzanmVarZza = zzatfVarZza.zza(i16);
                                    if (arrayList.contains(Integer.valueOf(i16))) {
                                        int i18 = zzanmVarZza.zzj;
                                        int i19 = zzanmVarZza.zzk;
                                        int i20 = zzanmVarZza.zzb;
                                        z2 = true;
                                        z3 = true;
                                    } else {
                                        z2 = true;
                                        z3 = false;
                                    }
                                    int i21 = z2 != z3 ? 1 : 2;
                                    iArr2 = iArr4;
                                    boolean zZza = zza(iArr4[i16], false);
                                    if (zZza) {
                                        i21 += 1000;
                                    }
                                    boolean z10 = i21 > i12;
                                    if (i21 == i12) {
                                        int iZzh = zzanmVarZza.zzk() != iZzk ? zzh(zzanmVarZza.zzk(), iZzk) : zzh(zzanmVarZza.zzb, i3);
                                        if (zZza && z3) {
                                            if (iZzh > 0) {
                                                i3 = zzanmVarZza.zzb;
                                                iZzk = zzanmVarZza.zzk();
                                                i12 = i21;
                                                i11 = i16;
                                                zzatfVar = zzatfVarZza;
                                            }
                                        } else if (iZzh < 0) {
                                            i3 = zzanmVarZza.zzb;
                                            iZzk = zzanmVarZza.zzk();
                                            i12 = i21;
                                            i11 = i16;
                                            zzatfVar = zzatfVarZza;
                                        }
                                    } else if (z10) {
                                        i3 = zzanmVarZza.zzb;
                                        iZzk = zzanmVarZza.zzk();
                                        i12 = i21;
                                        i11 = i16;
                                        zzatfVar = zzatfVarZza;
                                    }
                                } else {
                                    zzatfVarZza = zzatfVarZza;
                                    iArr2 = iArr4;
                                    arrayList = arrayList;
                                }
                                i16++;
                                zzatgVar = zzatgVar2;
                                zzatfVarZza = zzatfVarZza;
                                arrayList = arrayList;
                                iArr4 = iArr2;
                            }
                        }
                        i10++;
                        i4 = 1;
                    }
                    zzatn zzatnVar2 = zzatfVar == null ? null : new zzatn(zzatfVar, i11, 0, null);
                    zzatkVarArr[i2] = zzatnVar2;
                    z4 = zzatnVar2 != null;
                }
                int i22 = zzatgVarArr[i2].zzb;
            }
            i2++;
            i = 2;
        }
        int i23 = 0;
        boolean z11 = false;
        while (i23 < i) {
            if (zzansVarArr[i23].zza() == 1 && !z11) {
                zzatg zzatgVar3 = zzatgVarArr[i23];
                int[][] iArr5 = iArr[i23];
                String str = zzatlVar.zza;
                boolean z12 = zzatlVar.zzh;
                boolean z13 = zzatlVar.zzb;
                int i24 = -1;
                int i25 = -1;
                int i26 = 0;
                int i27 = 0;
                while (i26 < zzatgVar3.zzb) {
                    zzatf zzatfVarZza2 = zzatgVar3.zza(i26);
                    int[] iArr6 = iArr5[i26];
                    int i28 = i25;
                    int i29 = i24;
                    int i30 = i27;
                    int i31 = 0;
                    while (true) {
                        int i32 = zzatfVarZza2.zza;
                        if (i31 <= 0) {
                            if (zza(iArr6[i31], true)) {
                                zzanm zzanmVarZza2 = zzatfVarZza2.zza(i31);
                                int i33 = iArr6[i31];
                                int i34 = 1 != (zzanmVarZza2.zzx & 1) ? 1 : 2;
                                if (zza(i33, false)) {
                                    i34 += 1000;
                                }
                                if (i34 > i30) {
                                    i29 = i26;
                                    i28 = i31;
                                    i30 = i34;
                                }
                            }
                            i31++;
                        }
                    }
                    i26++;
                    i27 = i30;
                    i24 = i29;
                    i25 = i28;
                }
                if (i24 == -1) {
                    zzatnVar = null;
                    z = false;
                } else {
                    z = false;
                    zzatnVar = new zzatn(zzatgVar3.zza(i24), i25, 0, null);
                }
                zzatkVarArr[i23] = zzatnVar;
                z11 = zzatnVar != null ? true : z;
            }
            i23++;
            i = 2;
        }
        return zzatkVarArr;
    }

    public zzatm(zzatr zzatrVar) {
        this.zza = new AtomicReference<>(new zzatl());
    }
}
