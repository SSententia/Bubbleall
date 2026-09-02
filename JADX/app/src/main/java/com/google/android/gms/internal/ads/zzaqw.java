package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaqw implements zzapo {
    public static final zzapq zza = new zzaqt();
    private static final int zzb = zzave.zzl("seig");
    private static final byte[] zzc = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private final SparseArray<zzaqv> zzd;
    private final zzaux zze;
    private final zzaux zzf;
    private final zzaux zzg;
    private final zzaux zzh;
    private final zzaux zzi;
    private final byte[] zzj;
    private final Stack<zzaqi> zzk;
    private final LinkedList<zzaqu> zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private zzaux zzq;
    private long zzr;
    private long zzs;
    private zzaqv zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private zzapp zzx;
    private boolean zzy;

    public zzaqw() {
        this(0, null, null);
    }

    private final void zza() {
        this.zzm = 0;
        this.zzp = 0;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0349  */
    /* JADX WARN: Code duplicated, block: B:122:0x0350  */
    /* JADX WARN: Code duplicated, block: B:124:0x0358 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x035a  */
    /* JADX WARN: Code duplicated, block: B:126:0x035f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0363  */
    /* JADX WARN: Code duplicated, block: B:129:0x036c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0372 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x0374  */
    /* JADX WARN: Code duplicated, block: B:133:0x037a  */
    /* JADX WARN: Code duplicated, block: B:134:0x037b A[DONT_INVERT, PHI: r5
  0x037b: PHI (r5v38 int) = (r5v36 int), (r5v41 int) binds: [B:130:0x0370, B:133:0x037a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x037d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0386  */
    /* JADX WARN: Code duplicated, block: B:138:0x038c  */
    /* JADX WARN: Code duplicated, block: B:139:0x039e  */
    /* JADX WARN: Code duplicated, block: B:142:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:143:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:220:0x0599  */
    /* JADX WARN: Code duplicated, block: B:231:0x05de  */
    private final void zzb(long j) throws zzanp {
        zzarc zzarcVarZza;
        zzaqw zzaqwVar;
        zzaqi zzaqiVar;
        SparseArray<zzaqv> sparseArray;
        int i;
        int i2;
        byte[] bArr;
        boolean z;
        zzare zzareVar;
        byte[] bArr2;
        int i3;
        byte[] bArr3;
        int i4;
        long jZzj;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        boolean[] zArr;
        int i5;
        long j2;
        long j3;
        int iZzu;
        int iZzu2;
        int iZzr;
        boolean z2;
        loop0: while (true) {
            zzaqw zzaqwVar2 = this;
            while (true) {
                if (zzaqwVar2.zzk.isEmpty() || zzaqwVar2.zzk.peek().zza != j) {
                    break loop0;
                }
                zzaqi zzaqiVarPop = zzaqwVar2.zzk.pop();
                int i6 = 12;
                int i7 = 8;
                boolean z3 = true;
                if (zzaqiVarPop.zzaR == zzaqk.zzE) {
                    zzapk zzapkVarZzh = zzh(zzaqiVarPop.zzb);
                    zzaqi zzaqiVarZzd = zzaqiVarPop.zzd(zzaqk.zzP);
                    SparseArray sparseArray2 = new SparseArray();
                    int size = zzaqiVarZzd.zzb.size();
                    long jZzp = -9223372036854775807L;
                    int i8 = 0;
                    while (i8 < size) {
                        zzaqj zzaqjVar = zzaqiVarZzd.zzb.get(i8);
                        if (zzaqjVar.zzaR == zzaqk.zzB) {
                            zzaux zzauxVar = zzaqjVar.zza;
                            zzauxVar.zzi(i6);
                            Pair pairCreate = Pair.create(Integer.valueOf(zzauxVar.zzr()), new zzaqs(zzauxVar.zzu() - 1, zzauxVar.zzu(), zzauxVar.zzu(), zzauxVar.zzr()));
                            sparseArray2.put(((Integer) pairCreate.first).intValue(), (zzaqs) pairCreate.second);
                        } else if (zzaqjVar.zzaR == zzaqk.zzQ) {
                            zzaux zzauxVar2 = zzaqjVar.zza;
                            zzauxVar2.zzi(8);
                            jZzp = zzaqk.zze(zzauxVar2.zzr()) == 0 ? zzauxVar2.zzp() : zzauxVar2.zzv();
                        }
                        i8++;
                        i6 = 12;
                    }
                    SparseArray sparseArray3 = new SparseArray();
                    int size2 = zzaqiVarPop.zzc.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        zzaqi zzaqiVar2 = zzaqiVarPop.zzc.get(i9);
                        if (zzaqiVar2.zzaR == zzaqk.zzG && (zzarcVarZza = zzaqr.zza(zzaqiVar2, zzaqiVarPop.zzc(zzaqk.zzF), jZzp, zzapkVarZzh, false)) != null) {
                            sparseArray3.put(zzarcVarZza.zza, zzarcVarZza);
                        }
                    }
                    int size3 = sparseArray3.size();
                    if (zzaqwVar2.zzd.size() == 0) {
                        for (int i10 = 0; i10 < size3; i10++) {
                            zzarc zzarcVar = (zzarc) sparseArray3.valueAt(i10);
                            zzaqv zzaqvVar = new zzaqv(zzaqwVar2.zzx.zzbf(i10, zzarcVar.zzb));
                            zzaqvVar.zza(zzarcVar, (zzaqs) sparseArray2.get(zzarcVar.zza));
                            zzaqwVar2.zzd.put(zzarcVar.zza, zzaqvVar);
                            zzaqwVar2.zzs = Math.max(zzaqwVar2.zzs, zzarcVar.zze);
                        }
                        zzaqwVar2.zzx.zzbg();
                    } else {
                        zzaup.zzd(zzaqwVar2.zzd.size() == size3);
                        for (int i11 = 0; i11 < size3; i11++) {
                            zzarc zzarcVar2 = (zzarc) sparseArray3.valueAt(i11);
                            zzaqwVar2.zzd.get(zzarcVar2.zza).zza(zzarcVar2, (zzaqs) sparseArray2.get(zzarcVar2.zza));
                        }
                    }
                } else {
                    if (zzaqiVarPop.zzaR == zzaqk.zzN) {
                        SparseArray<zzaqv> sparseArray4 = zzaqwVar2.zzd;
                        byte[] bArr4 = zzaqwVar2.zzj;
                        int size4 = zzaqiVarPop.zzc.size();
                        int i12 = 0;
                        while (i12 < size4) {
                            zzaqi zzaqiVar3 = zzaqiVarPop.zzc.get(i12);
                            if (zzaqiVar3.zzaR == zzaqk.zzO) {
                                zzaux zzauxVar3 = zzaqiVar3.zzc(zzaqk.zzA).zza;
                                zzauxVar3.zzi(i7);
                                int iZzf = zzaqk.zzf(zzauxVar3.zzr());
                                zzaqv zzaqvVar2 = sparseArray4.get(zzauxVar3.zzr());
                                if (zzaqvVar2 == null) {
                                    zzaqvVar2 = null;
                                } else {
                                    if ((iZzf & 1) != 0) {
                                        long jZzv = zzauxVar3.zzv();
                                        zzare zzareVar2 = zzaqvVar2.zza;
                                        zzareVar2.zzb = jZzv;
                                        zzareVar2.zzc = jZzv;
                                    }
                                    zzaqs zzaqsVar = zzaqvVar2.zzd;
                                    zzaqvVar2.zza.zza = new zzaqs((iZzf & 2) != 0 ? zzauxVar3.zzu() - 1 : zzaqsVar.zza, (iZzf & 8) != 0 ? zzauxVar3.zzu() : zzaqsVar.zzb, (iZzf & 16) != 0 ? zzauxVar3.zzu() : zzaqsVar.zzc, (iZzf & 32) != 0 ? zzauxVar3.zzu() : zzaqsVar.zzd);
                                }
                                if (zzaqvVar2 == null) {
                                    zzaqiVar = zzaqiVarPop;
                                    sparseArray = sparseArray4;
                                    i = size4;
                                    i2 = i12;
                                    bArr = bArr4;
                                    z = z3;
                                } else {
                                    zzare zzareVar3 = zzaqvVar2.zza;
                                    long jZzv2 = zzareVar3.zzr;
                                    zzaqvVar2.zzb();
                                    if (zzaqiVar3.zzc(zzaqk.zzz) != null) {
                                        zzaux zzauxVar4 = zzaqiVar3.zzc(zzaqk.zzz).zza;
                                        zzauxVar4.zzi(i7);
                                        jZzv2 = zzaqk.zze(zzauxVar4.zzr()) == z3 ? zzauxVar4.zzv() : zzauxVar4.zzp();
                                    }
                                    List<zzaqj> list = zzaqiVar3.zzb;
                                    int size5 = list.size();
                                    int i13 = 0;
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (i15 < size5) {
                                        SparseArray<zzaqv> sparseArray5 = sparseArray4;
                                        zzaqj zzaqjVar2 = list.get(i15);
                                        int i16 = size4;
                                        long j4 = jZzv2;
                                        if (zzaqjVar2.zzaR == zzaqk.zzC) {
                                            zzaux zzauxVar5 = zzaqjVar2.zza;
                                            zzauxVar5.zzi(12);
                                            int iZzu3 = zzauxVar5.zzu();
                                            if (iZzu3 > 0) {
                                                i13 += iZzu3;
                                                i14++;
                                            }
                                        }
                                        i15++;
                                        size4 = i16;
                                        sparseArray4 = sparseArray5;
                                        jZzv2 = j4;
                                    }
                                    sparseArray = sparseArray4;
                                    i = size4;
                                    long j5 = jZzv2;
                                    zzaqvVar2.zzg = 0;
                                    zzaqvVar2.zzf = 0;
                                    zzaqvVar2.zze = 0;
                                    zzare zzareVar4 = zzaqvVar2.zza;
                                    zzareVar4.zzd = i14;
                                    zzareVar4.zze = i13;
                                    int[] iArr3 = zzareVar4.zzg;
                                    if (iArr3 == null || iArr3.length < i14) {
                                        zzareVar4.zzf = new long[i14];
                                        zzareVar4.zzg = new int[i14];
                                    }
                                    int[] iArr4 = zzareVar4.zzh;
                                    if (iArr4 == null || iArr4.length < i13) {
                                        int i17 = (i13 * 125) / 100;
                                        zzareVar4.zzh = new int[i17];
                                        zzareVar4.zzi = new int[i17];
                                        zzareVar4.zzj = new long[i17];
                                        zzareVar4.zzk = new boolean[i17];
                                        zzareVar4.zzm = new boolean[i17];
                                    }
                                    int i18 = 0;
                                    int i19 = 0;
                                    int i20 = 0;
                                    while (i18 < size5) {
                                        zzaqj zzaqjVar3 = list.get(i18);
                                        if (zzaqjVar3.zzaR == zzaqk.zzC) {
                                            int i21 = i20 + 1;
                                            zzaux zzauxVar6 = zzaqjVar3.zza;
                                            zzauxVar6.zzi(8);
                                            int iZzf2 = zzaqk.zzf(zzauxVar6.zzr());
                                            zzarc zzarcVar3 = zzaqvVar2.zzc;
                                            zzare zzareVar5 = zzaqvVar2.zza;
                                            zzaqs zzaqsVar2 = zzareVar5.zza;
                                            zzareVar5.zzg[i20] = zzauxVar6.zzu();
                                            long[] jArr2 = zzareVar5.zzf;
                                            long j6 = zzareVar5.zzb;
                                            jArr2[i20] = j6;
                                            if ((iZzf2 & 1) != 0) {
                                                jArr2[i20] = j6 + ((long) zzauxVar6.zzr());
                                            }
                                            int i22 = iZzf2 & 4;
                                            int iZzu4 = zzaqsVar2.zzd;
                                            if (i22 != 0) {
                                                iZzu4 = zzauxVar6.zzu();
                                            }
                                            int i23 = iZzf2 & 256;
                                            int i24 = iZzf2 & 512;
                                            int i25 = iZzf2 & 1024;
                                            int i26 = iZzf2 & 2048;
                                            long[] jArr3 = zzarcVar3.zzi;
                                            if (jArr3 != null) {
                                                i4 = iZzu4;
                                                bArr3 = bArr4;
                                                if (jArr3.length == 1 && jArr3[0] == 0) {
                                                    jZzj = zzave.zzj(zzarcVar3.zzj[0], 1000L, zzarcVar3.zzc);
                                                }
                                                iArr = zzareVar5.zzh;
                                                iArr2 = zzareVar5.zzi;
                                                jArr = zzareVar5.zzj;
                                                zArr = zzareVar5.zzk;
                                                int i27 = zzarcVar3.zzb;
                                                i5 = zzareVar5.zzg[i20] + i19;
                                                j2 = zzarcVar3.zzc;
                                                if (i20 > 0) {
                                                    j3 = zzareVar5.zzr;
                                                } else {
                                                    j3 = j5;
                                                }
                                                while (i19 < i5) {
                                                    if (i23 != 0) {
                                                        iZzu = zzauxVar6.zzu();
                                                    } else {
                                                        iZzu = zzaqsVar2.zzb;
                                                    }
                                                    if (i24 != 0) {
                                                        iZzu2 = zzauxVar6.zzu();
                                                    } else {
                                                        iZzu2 = zzaqsVar2.zzc;
                                                    }
                                                    if (i19 != 0) {
                                                        if (i25 != 0) {
                                                            iZzr = zzauxVar6.zzr();
                                                        } else {
                                                            iZzr = zzaqsVar2.zzd;
                                                        }
                                                    } else if (i22 != 0) {
                                                        iZzr = i4;
                                                        i19 = 0;
                                                    } else {
                                                        i19 = 0;
                                                        if (i25 != 0) {
                                                            iZzr = zzauxVar6.zzr();
                                                        } else {
                                                            iZzr = zzaqsVar2.zzd;
                                                        }
                                                    }
                                                    if (i26 != 0) {
                                                        iArr2[i19] = (int) (((long) (zzauxVar6.zzr() * 1000)) / j2);
                                                    } else {
                                                        iArr2[i19] = 0;
                                                    }
                                                    jArr[i19] = zzave.zzj(j3, 1000L, j2) - jZzj;
                                                    iArr[i19] = iZzu2;
                                                    if (1 != (((iZzr >> 16) & 1) ^ 1)) {
                                                        z2 = false;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    zArr[i19] = z2;
                                                    j3 += (long) iZzu;
                                                    i19++;
                                                    i5 = i5;
                                                    i22 = i22;
                                                    i23 = i23;
                                                    i24 = i24;
                                                    i25 = i25;
                                                }
                                                zzareVar5.zzr = j3;
                                                i20 = i21;
                                                i19 = i5;
                                            } else {
                                                i4 = iZzu4;
                                                bArr3 = bArr4;
                                            }
                                            jZzj = 0;
                                            iArr = zzareVar5.zzh;
                                            iArr2 = zzareVar5.zzi;
                                            jArr = zzareVar5.zzj;
                                            zArr = zzareVar5.zzk;
                                            int i28 = zzarcVar3.zzb;
                                            i5 = zzareVar5.zzg[i20] + i19;
                                            j2 = zzarcVar3.zzc;
                                            if (i20 > 0) {
                                                j3 = zzareVar5.zzr;
                                            } else {
                                                j3 = j5;
                                            }
                                            while (i19 < i5) {
                                                if (i23 != 0) {
                                                    iZzu = zzauxVar6.zzu();
                                                } else {
                                                    iZzu = zzaqsVar2.zzb;
                                                }
                                                if (i24 != 0) {
                                                    iZzu2 = zzauxVar6.zzu();
                                                } else {
                                                    iZzu2 = zzaqsVar2.zzc;
                                                }
                                                if (i19 != 0) {
                                                    if (i25 != 0) {
                                                        iZzr = zzauxVar6.zzr();
                                                    } else {
                                                        iZzr = zzaqsVar2.zzd;
                                                    }
                                                } else if (i22 != 0) {
                                                    iZzr = i4;
                                                    i19 = 0;
                                                } else {
                                                    i19 = 0;
                                                    if (i25 != 0) {
                                                        iZzr = zzauxVar6.zzr();
                                                    } else {
                                                        iZzr = zzaqsVar2.zzd;
                                                    }
                                                }
                                                if (i26 != 0) {
                                                    iArr2[i19] = (int) (((long) (zzauxVar6.zzr() * 1000)) / j2);
                                                } else {
                                                    iArr2[i19] = 0;
                                                }
                                                jArr[i19] = zzave.zzj(j3, 1000L, j2) - jZzj;
                                                iArr[i19] = iZzu2;
                                                if (1 != (((iZzr >> 16) & 1) ^ 1)) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                zArr[i19] = z2;
                                                j3 += (long) iZzu;
                                                i19++;
                                                i5 = i5;
                                                i22 = i22;
                                                i23 = i23;
                                                i24 = i24;
                                                i25 = i25;
                                            }
                                            zzareVar5.zzr = j3;
                                            i20 = i21;
                                            i19 = i5;
                                        } else {
                                            bArr3 = bArr4;
                                            i12 = i12;
                                            zzaqiVar3 = zzaqiVar3;
                                            zzareVar3 = zzareVar3;
                                        }
                                        i18++;
                                        list = list;
                                        size5 = size5;
                                        zzaqiVarPop = zzaqiVarPop;
                                        i12 = i12;
                                        zzaqiVar3 = zzaqiVar3;
                                        zzareVar3 = zzareVar3;
                                        bArr4 = bArr3;
                                        zzaqvVar2 = zzaqvVar2;
                                    }
                                    zzaqiVar = zzaqiVarPop;
                                    byte[] bArr5 = bArr4;
                                    i2 = i12;
                                    zzare zzareVar6 = zzareVar3;
                                    zzaqv zzaqvVar3 = zzaqvVar2;
                                    zzaqj zzaqjVarZzc = zzaqiVar3.zzc(zzaqk.zzaf);
                                    if (zzaqjVarZzc != null) {
                                        zzareVar = zzareVar6;
                                        zzard zzardVar = zzaqvVar3.zzc.zzh[zzareVar.zza.zza];
                                        zzaux zzauxVar7 = zzaqjVarZzc.zza;
                                        int i29 = zzardVar.zza;
                                        zzauxVar7.zzi(8);
                                        if ((zzaqk.zzf(zzauxVar7.zzr()) & 1) == 1) {
                                            zzauxVar7.zzj(8);
                                        }
                                        int iZzl = zzauxVar7.zzl();
                                        int iZzu5 = zzauxVar7.zzu();
                                        int i30 = zzareVar.zze;
                                        if (iZzu5 != i30) {
                                            StringBuilder sb = new StringBuilder(41);
                                            sb.append("Length mismatch: ");
                                            sb.append(iZzu5);
                                            sb.append(", ");
                                            sb.append(i30);
                                            throw new zzanp(sb.toString());
                                        }
                                        if (iZzl == 0) {
                                            boolean[] zArr2 = zzareVar.zzm;
                                            i3 = 0;
                                            for (int i31 = 0; i31 < iZzu5; i31++) {
                                                int iZzl2 = zzauxVar7.zzl();
                                                i3 += iZzl2;
                                                zArr2[i31] = iZzl2 > i29;
                                            }
                                        } else {
                                            i3 = iZzl * iZzu5;
                                            Arrays.fill(zzareVar.zzm, 0, iZzu5, iZzl > i29);
                                        }
                                        zzareVar.zza(i3);
                                    } else {
                                        zzareVar = zzareVar6;
                                    }
                                    zzaqj zzaqjVarZzc2 = zzaqiVar3.zzc(zzaqk.zzag);
                                    if (zzaqjVarZzc2 != null) {
                                        zzaux zzauxVar8 = zzaqjVarZzc2.zza;
                                        zzauxVar8.zzi(8);
                                        int iZzr2 = zzauxVar8.zzr();
                                        if ((zzaqk.zzf(iZzr2) & 1) == 1) {
                                            zzauxVar8.zzj(8);
                                        }
                                        int iZzu6 = zzauxVar8.zzu();
                                        if (iZzu6 != 1) {
                                            StringBuilder sb2 = new StringBuilder(40);
                                            sb2.append("Unexpected saio entry count: ");
                                            sb2.append(iZzu6);
                                            throw new zzanp(sb2.toString());
                                        }
                                        zzareVar.zzc += zzaqk.zze(iZzr2) == 0 ? zzauxVar8.zzp() : zzauxVar8.zzv();
                                    }
                                    zzaqj zzaqjVarZzc3 = zzaqiVar3.zzc(zzaqk.zzak);
                                    if (zzaqjVarZzc3 != null) {
                                        zzc(zzaqjVarZzc3.zza, 0, zzareVar);
                                    }
                                    zzaqj zzaqjVarZzc4 = zzaqiVar3.zzc(zzaqk.zzah);
                                    zzaqj zzaqjVarZzc5 = zzaqiVar3.zzc(zzaqk.zzai);
                                    if (zzaqjVarZzc4 == null || zzaqjVarZzc5 == null) {
                                        z = true;
                                    } else {
                                        zzaux zzauxVar9 = zzaqjVarZzc4.zza;
                                        zzaux zzauxVar10 = zzaqjVarZzc5.zza;
                                        zzauxVar9.zzi(8);
                                        int iZzr3 = zzauxVar9.zzr();
                                        int iZzr4 = zzauxVar9.zzr();
                                        int i32 = zzb;
                                        if (iZzr4 != i32) {
                                            z = true;
                                        } else {
                                            if (zzaqk.zze(iZzr3) == 1) {
                                                zzauxVar9.zzj(4);
                                            }
                                            if (zzauxVar9.zzr() != 1) {
                                                throw new zzanp("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            zzauxVar10.zzi(8);
                                            int iZzr5 = zzauxVar10.zzr();
                                            if (zzauxVar10.zzr() == i32) {
                                                int iZze = zzaqk.zze(iZzr5);
                                                if (iZze == 1) {
                                                    if (zzauxVar10.zzp() == 0) {
                                                        throw new zzanp("Variable length decription in sgpd found (unsupported)");
                                                    }
                                                } else if (iZze >= 2) {
                                                    zzauxVar10.zzj(4);
                                                }
                                                if (zzauxVar10.zzp() != 1) {
                                                    throw new zzanp("Entry count in sgpd != 1 (unsupported).");
                                                }
                                                zzauxVar10.zzj(2);
                                                z = true;
                                                if (zzauxVar10.zzl() == 1) {
                                                    int iZzl3 = zzauxVar10.zzl();
                                                    byte[] bArr6 = new byte[16];
                                                    zzauxVar10.zzk(bArr6, 0, 16);
                                                    zzareVar.zzl = true;
                                                    zzareVar.zzn = new zzard(true, iZzl3, bArr6);
                                                }
                                            } else {
                                                z = true;
                                            }
                                        }
                                    }
                                    int size6 = zzaqiVar3.zzb.size();
                                    int i33 = 0;
                                    while (i33 < size6) {
                                        zzaqj zzaqjVar4 = zzaqiVar3.zzb.get(i33);
                                        if (zzaqjVar4.zzaR == zzaqk.zzaj) {
                                            zzaux zzauxVar11 = zzaqjVar4.zza;
                                            zzauxVar11.zzi(8);
                                            bArr2 = bArr5;
                                            zzauxVar11.zzk(bArr2, 0, 16);
                                            if (Arrays.equals(bArr2, zzc)) {
                                                zzc(zzauxVar11, 16, zzareVar);
                                            }
                                        } else {
                                            bArr2 = bArr5;
                                        }
                                        i33++;
                                        bArr5 = bArr2;
                                    }
                                    bArr = bArr5;
                                    i7 = 8;
                                }
                            } else {
                                zzaqiVar = zzaqiVarPop;
                                sparseArray = sparseArray4;
                                i = size4;
                                i2 = i12;
                                bArr = bArr4;
                                z = z3;
                            }
                            z3 = z;
                            bArr4 = bArr;
                            size4 = i;
                            sparseArray4 = sparseArray;
                            zzaqiVarPop = zzaqiVar;
                            i12 = i2 + 1;
                        }
                        zzapk zzapkVarZzh2 = zzh(zzaqiVarPop.zzb);
                        if (zzapkVarZzh2 != null) {
                            zzaqwVar = this;
                            int size7 = zzaqwVar.zzd.size();
                            for (int i34 = 0; i34 < size7; i34++) {
                                zzaqv zzaqvVarValueAt = zzaqwVar.zzd.valueAt(i34);
                                zzaqvVarValueAt.zzb.zza(zzaqvVarValueAt.zzc.zzf.zzi(zzapkVarZzh2));
                            }
                        }
                    } else {
                        zzaqwVar = zzaqwVar2;
                        if (!zzaqwVar.zzk.isEmpty()) {
                            zzaqwVar.zzk.peek().zzb(zzaqiVarPop);
                        }
                    }
                    zzaqwVar2 = zzaqwVar;
                }
            }
        }
        zza();
    }

    private static void zzc(zzaux zzauxVar, int i, zzare zzareVar) throws zzanp {
        zzauxVar.zzi(i + 8);
        int iZzf = zzaqk.zzf(zzauxVar.zzr());
        if ((iZzf & 1) != 0) {
            throw new zzanp("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iZzf & 2) != 0;
        int iZzu = zzauxVar.zzu();
        int i2 = zzareVar.zze;
        if (iZzu == i2) {
            Arrays.fill(zzareVar.zzm, 0, iZzu, z);
            zzareVar.zza(zzauxVar.zzd());
            zzauxVar.zzk(zzareVar.zzp.zza, 0, zzareVar.zzo);
            zzareVar.zzp.zzi(0);
            zzareVar.zzq = false;
            return;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Length mismatch: ");
        sb.append(iZzu);
        sb.append(", ");
        sb.append(i2);
        throw new zzanp(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    private static zzapk zzh(List<zzaqj> list) {
        Pair pairCreate;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzaqj zzaqjVar = list.get(i);
            if (zzaqjVar.zzaR == zzaqk.zzX) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = zzaqjVar.zza.zza;
                zzaux zzauxVar = new zzaux(bArr);
                if (zzauxVar.zze() < 32) {
                    pairCreate = null;
                } else {
                    zzauxVar.zzi(0);
                    if (zzauxVar.zzr() == zzauxVar.zzd() + 4 && zzauxVar.zzr() == zzaqk.zzX) {
                        int iZze = zzaqk.zze(zzauxVar.zzr());
                        if (iZze > 1) {
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Unsupported pssh version: ");
                            sb.append(iZze);
                            Log.w("PsshAtomUtil", sb.toString());
                        } else {
                            UUID uuid = new UUID(zzauxVar.zzs(), zzauxVar.zzs());
                            if (iZze == 1) {
                                zzauxVar.zzj(zzauxVar.zzu() * 16);
                            }
                            int iZzu = zzauxVar.zzu();
                            if (iZzu == zzauxVar.zzd()) {
                                byte[] bArr2 = new byte[iZzu];
                                zzauxVar.zzk(bArr2, 0, iZzu);
                                pairCreate = Pair.create(uuid, bArr2);
                            }
                        }
                        pairCreate = null;
                    } else {
                        pairCreate = null;
                    }
                }
                UUID uuid2 = pairCreate == null ? null : (UUID) pairCreate.first;
                if (uuid2 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzapj(uuid2, "video/mp4", bArr, false));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzapk(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zzd(zzapp zzappVar) {
        this.zzx = zzappVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zze(long j, long j2) {
        int size = this.zzd.size();
        for (int i = 0; i < size; i++) {
            this.zzd.valueAt(i).zzb();
        }
        this.zzl.clear();
        this.zzk.clear();
        zza();
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final boolean zzf(zzapn zzapnVar) throws InterruptedException, IOException {
        return zzarb.zza(zzapnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final int zzg(zzapn zzapnVar, zzapt zzaptVar) throws InterruptedException, IOException {
        zzard zzardVar;
        zzapw zzapwVar;
        int i;
        long jZzv;
        long jZzv2;
        zzapn zzapnVar2 = zzapnVar;
        while (true) {
            int i2 = this.zzm;
            int i3 = 0;
            if (i2 == 0) {
                if (this.zzp == 0) {
                    if (!zzapnVar2.zzb(this.zzi.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzp = 8;
                    this.zzi.zzi(0);
                    this.zzo = this.zzi.zzp();
                    this.zzn = this.zzi.zzr();
                }
                long jZzv3 = this.zzo;
                if (jZzv3 == 1) {
                    zzapnVar2.zzb(this.zzi.zza, 8, 8, false);
                    this.zzp += 8;
                    jZzv3 = this.zzi.zzv();
                    this.zzo = jZzv3;
                }
                if (jZzv3 < this.zzp) {
                    throw new zzanp("Atom size less than header length (unsupported).");
                }
                long jZzh = zzapnVar.zzh() - ((long) this.zzp);
                if (this.zzn == zzaqk.zzN) {
                    int size = this.zzd.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        zzare zzareVar = this.zzd.valueAt(i4).zza;
                        zzareVar.zzc = jZzh;
                        zzareVar.zzb = jZzh;
                    }
                }
                if (this.zzn == zzaqk.zzk) {
                    this.zzt = null;
                    this.zzr = jZzh + this.zzo;
                    if (!this.zzy) {
                        this.zzx.zzc(new zzapu(this.zzs));
                        this.zzy = true;
                    }
                    this.zzm = 2;
                } else {
                    int i5 = this.zzn;
                    if (i5 == zzaqk.zzE || i5 == zzaqk.zzG || i5 == zzaqk.zzH || i5 == zzaqk.zzI || i5 == zzaqk.zzJ || i5 == zzaqk.zzN || i5 == zzaqk.zzO || i5 == zzaqk.zzP || i5 == zzaqk.zzS) {
                        long jZzh2 = (zzapnVar.zzh() + this.zzo) - 8;
                        this.zzk.add(new zzaqi(this.zzn, jZzh2));
                        if (this.zzo == this.zzp) {
                            zzb(jZzh2);
                        } else {
                            zza();
                        }
                    } else {
                        int i6 = this.zzn;
                        if (i6 == zzaqk.zzV || i6 == zzaqk.zzU || i6 == zzaqk.zzF || i6 == zzaqk.zzD || i6 == zzaqk.zzW || i6 == zzaqk.zzz || i6 == zzaqk.zzA || i6 == zzaqk.zzR || i6 == zzaqk.zzB || i6 == zzaqk.zzC || i6 == zzaqk.zzX || i6 == zzaqk.zzaf || i6 == zzaqk.zzag || i6 == zzaqk.zzak || i6 == zzaqk.zzaj || i6 == zzaqk.zzah || i6 == zzaqk.zzai || i6 == zzaqk.zzT || i6 == zzaqk.zzQ || i6 == zzaqk.zzaI) {
                            if (this.zzp != 8) {
                                throw new zzanp("Leaf atom defines extended atom size (unsupported).");
                            }
                            long j = this.zzo;
                            if (j > 2147483647L) {
                                throw new zzanp("Leaf atom with length > 2147483647 (unsupported).");
                            }
                            this.zzq = new zzaux((int) j);
                            System.arraycopy(this.zzi.zza, 0, this.zzq.zza, 0, 8);
                            this.zzm = 1;
                        } else {
                            if (this.zzo > 2147483647L) {
                                throw new zzanp("Skipping atom with length > 2147483647 (unsupported).");
                            }
                            this.zzq = null;
                            this.zzm = 1;
                        }
                    }
                }
            } else if (i2 != 1) {
                long j2 = Long.MAX_VALUE;
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.zzt == null) {
                            SparseArray<zzaqv> sparseArray = this.zzd;
                            int size2 = sparseArray.size();
                            zzaqv zzaqvVar = null;
                            for (int i7 = 0; i7 < size2; i7++) {
                                zzaqv zzaqvVarValueAt = sparseArray.valueAt(i7);
                                int i8 = zzaqvVarValueAt.zzg;
                                zzare zzareVar2 = zzaqvVarValueAt.zza;
                                if (i8 != zzareVar2.zzd) {
                                    long j3 = zzareVar2.zzf[i8];
                                    if (j3 < j2) {
                                        zzaqvVar = zzaqvVarValueAt;
                                        j2 = j3;
                                    }
                                }
                            }
                            if (zzaqvVar == null) {
                                int iZzh = (int) (this.zzr - zzapnVar.zzh());
                                if (iZzh < 0) {
                                    throw new zzanp("Offset to end of mdat was negative.");
                                }
                                zzapnVar2.zzd(iZzh, false);
                                zza();
                            } else {
                                int iZzh2 = (int) (zzaqvVar.zza.zzf[zzaqvVar.zzg] - zzapnVar.zzh());
                                if (iZzh2 < 0) {
                                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    iZzh2 = 0;
                                }
                                zzapnVar2.zzd(iZzh2, false);
                                this.zzt = zzaqvVar;
                            }
                        }
                        zzaqv zzaqvVar2 = this.zzt;
                        zzare zzareVar3 = zzaqvVar2.zza;
                        int[] iArr = zzareVar3.zzh;
                        int i9 = zzaqvVar2.zze;
                        int i10 = iArr[i9];
                        this.zzu = i10;
                        if (zzareVar3.zzl) {
                            zzaux zzauxVar = zzareVar3.zzp;
                            int i11 = zzareVar3.zza.zza;
                            zzard zzardVar2 = zzareVar3.zzn;
                            if (zzardVar2 == null) {
                                zzardVar2 = zzaqvVar2.zzc.zzh[i11];
                            }
                            int i12 = zzardVar2.zza;
                            boolean z = zzareVar3.zzm[i9];
                            zzaux zzauxVar2 = this.zzh;
                            zzauxVar2.zza[0] = (byte) ((true != z ? 0 : 128) | i12);
                            zzauxVar2.zzi(0);
                            zzapx zzapxVar = zzaqvVar2.zzb;
                            zzapxVar.zzb(this.zzh, 1);
                            zzapxVar.zzb(zzauxVar, i12);
                            if (z) {
                                int iZzm = zzauxVar.zzm();
                                zzauxVar.zzj(-2);
                                int i13 = (iZzm * 6) + 2;
                                zzapxVar.zzb(zzauxVar, i13);
                                i = i12 + 1 + i13;
                            } else {
                                i = i12 + 1;
                            }
                            this.zzv = i;
                            i10 = this.zzu + i;
                            this.zzu = i10;
                        } else {
                            this.zzv = 0;
                        }
                        if (this.zzt.zzc.zzg == 1) {
                            this.zzu = i10 - 8;
                            zzapnVar2.zzd(8, false);
                        }
                        this.zzm = 4;
                        this.zzw = 0;
                    }
                    zzaqv zzaqvVar3 = this.zzt;
                    zzare zzareVar4 = zzaqvVar3.zza;
                    zzarc zzarcVar = zzaqvVar3.zzc;
                    zzapx zzapxVar2 = zzaqvVar3.zzb;
                    int i14 = zzaqvVar3.zze;
                    int i15 = zzarcVar.zzk;
                    if (i15 == 0) {
                        while (true) {
                            int i16 = this.zzv;
                            int i17 = this.zzu;
                            if (i16 >= i17) {
                                break;
                            }
                            this.zzv += zzapxVar2.zzd(zzapnVar2, i17 - i16, false);
                        }
                    } else {
                        byte[] bArr = this.zzf.zza;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i18 = i15 + 1;
                        int i19 = 4 - i15;
                        while (this.zzv < this.zzu) {
                            int i20 = this.zzw;
                            if (i20 == 0) {
                                zzapnVar2.zzb(bArr, i19, i18, false);
                                this.zzf.zzi(0);
                                this.zzw = this.zzf.zzu() - 1;
                                this.zze.zzi(0);
                                zzapxVar2.zzb(this.zze, 4);
                                zzapxVar2.zzb(this.zzf, 1);
                                this.zzv += 5;
                                this.zzu += i19;
                            } else {
                                int iZzd = zzapxVar2.zzd(zzapnVar2, i20, false);
                                this.zzv += iZzd;
                                this.zzw -= iZzd;
                            }
                        }
                    }
                    long j4 = (zzareVar4.zzj[i14] + ((long) zzareVar4.zzi[i14])) * 1000;
                    boolean z2 = zzareVar4.zzl;
                    int i21 = (true != z2 ? 0 : BasicMeasure.EXACTLY) | (zzareVar4.zzk[i14] ? 1 : 0);
                    if (z2) {
                        zzardVar = zzareVar4.zzn;
                        if (zzardVar == null) {
                            zzardVar = zzarcVar.zzh[zzareVar4.zza.zza];
                        }
                        zzaqv zzaqvVar4 = this.zzt;
                        zzapwVar = zzardVar != zzaqvVar4.zzi ? new zzapw(1, zzardVar.zzb) : zzaqvVar4.zzh;
                    } else {
                        zzardVar = null;
                        zzapwVar = null;
                    }
                    zzaqv zzaqvVar5 = this.zzt;
                    zzaqvVar5.zzh = zzapwVar;
                    zzaqvVar5.zzi = zzardVar;
                    zzapxVar2.zzc(j4, i21, this.zzu, 0, zzapwVar);
                    if (!this.zzl.isEmpty()) {
                        zzaqu zzaquVarRemoveFirst = this.zzl.removeFirst();
                        int i22 = zzaquVarRemoveFirst.zzb;
                        long j5 = zzaquVarRemoveFirst.zza;
                        throw null;
                    }
                    zzaqv zzaqvVar6 = this.zzt;
                    zzaqvVar6.zze++;
                    int i23 = zzaqvVar6.zzf + 1;
                    zzaqvVar6.zzf = i23;
                    int[] iArr2 = zzareVar4.zzg;
                    int i24 = zzaqvVar6.zzg;
                    if (i23 == iArr2[i24]) {
                        zzaqvVar6.zzg = i24 + 1;
                        zzaqvVar6.zzf = 0;
                        this.zzt = null;
                    }
                    this.zzm = 3;
                    return 0;
                }
                int size3 = this.zzd.size();
                zzaqv zzaqvVarValueAt2 = null;
                for (int i25 = 0; i25 < size3; i25++) {
                    zzare zzareVar5 = this.zzd.valueAt(i25).zza;
                    if (zzareVar5.zzq) {
                        long j6 = zzareVar5.zzc;
                        if (j6 < j2) {
                            zzaqvVarValueAt2 = this.zzd.valueAt(i25);
                            j2 = j6;
                        }
                    }
                }
                if (zzaqvVarValueAt2 == null) {
                    this.zzm = 3;
                } else {
                    int iZzh3 = (int) (j2 - zzapnVar.zzh());
                    if (iZzh3 < 0) {
                        throw new zzanp("Offset to encryption data was negative.");
                    }
                    zzapnVar2.zzd(iZzh3, false);
                    zzare zzareVar6 = zzaqvVarValueAt2.zza;
                    zzapnVar2.zzb(zzareVar6.zzp.zza, 0, zzareVar6.zzo, false);
                    zzareVar6.zzp.zzi(0);
                    zzareVar6.zzq = false;
                }
            } else {
                int i26 = ((int) this.zzo) - this.zzp;
                zzaux zzauxVar3 = this.zzq;
                if (zzauxVar3 != null) {
                    zzapnVar2.zzb(zzauxVar3.zza, 8, i26, false);
                    zzaqj zzaqjVar = new zzaqj(this.zzn, this.zzq);
                    long jZzh3 = zzapnVar.zzh();
                    if (this.zzk.isEmpty()) {
                        if (zzaqjVar.zzaR == zzaqk.zzD) {
                            zzaux zzauxVar4 = zzaqjVar.zza;
                            zzauxVar4.zzi(8);
                            int iZzr = zzauxVar4.zzr();
                            zzauxVar4.zzj(4);
                            long jZzp = zzauxVar4.zzp();
                            if (zzaqk.zze(iZzr) == 0) {
                                jZzv = zzauxVar4.zzp();
                                jZzv2 = zzauxVar4.zzp();
                            } else {
                                jZzv = zzauxVar4.zzv();
                                jZzv2 = zzauxVar4.zzv();
                            }
                            long j7 = jZzh3 + jZzv2;
                            long j8 = jZzv;
                            long jZzj = zzave.zzj(j8, 1000000L, jZzp);
                            zzauxVar4.zzj(2);
                            int iZzm2 = zzauxVar4.zzm();
                            int[] iArr3 = new int[iZzm2];
                            long[] jArr = new long[iZzm2];
                            long[] jArr2 = new long[iZzm2];
                            long[] jArr3 = new long[iZzm2];
                            long jZzj2 = jZzj;
                            while (i3 < iZzm2) {
                                int iZzr2 = zzauxVar4.zzr();
                                if ((iZzr2 & Integer.MIN_VALUE) != 0) {
                                    throw new zzanp("Unhandled indirect reference");
                                }
                                long jZzp2 = zzauxVar4.zzp();
                                iArr3[i3] = iZzr2 & Integer.MAX_VALUE;
                                jArr[i3] = j7;
                                jArr3[i3] = jZzj2;
                                j8 += jZzp2;
                                int i27 = iZzm2;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                jZzj2 = zzave.zzj(j8, 1000000L, jZzp);
                                jArr4[i3] = jZzj2 - jArr5[i3];
                                zzauxVar4.zzj(4);
                                j7 += (long) iArr3[i3];
                                i3++;
                                jArr = jArr;
                                jArr3 = jArr5;
                                jArr2 = jArr4;
                                iZzm2 = i27;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jZzj), new zzapm(iArr3, jArr, jArr2, jArr3));
                            ((Long) pairCreate.first).longValue();
                            this.zzx.zzc((zzapv) pairCreate.second);
                            this.zzy = true;
                        }
                        zzapnVar2 = zzapnVar;
                    } else {
                        this.zzk.peek().zza(zzaqjVar);
                    }
                } else {
                    zzapnVar2.zzd(i26, false);
                }
                zzb(zzapnVar.zzh());
            }
        }
    }

    public zzaqw(int i, zzavb zzavbVar, zzarc zzarcVar) {
        this.zzi = new zzaux(16);
        this.zze = new zzaux(zzauv.zza);
        this.zzf = new zzaux(5);
        this.zzg = new zzaux();
        this.zzh = new zzaux(1);
        this.zzj = new byte[16];
        this.zzk = new Stack<>();
        this.zzl = new LinkedList<>();
        this.zzd = new SparseArray<>();
        this.zzs = -9223372036854775807L;
        zza();
    }
}
