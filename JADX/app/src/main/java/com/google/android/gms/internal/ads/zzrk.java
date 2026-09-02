package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrk implements zznu {
    public static final zzoa zza = zzrh.zza;
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzafv zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zznx zzD;
    private zzox[] zzE;
    private zzox[] zzF;
    private boolean zzG;
    private final List<zzafv> zzd;
    private final SparseArray<zzrj> zze;
    private final zzamf zzf;
    private final zzamf zzg;
    private final zzamf zzh;
    private final byte[] zzi;
    private final zzamf zzj;
    private final zzaja zzk;
    private final zzamf zzl;
    private final ArrayDeque<zzqv> zzm;
    private final ArrayDeque<zzri> zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzamf zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzrj zzy;
    private int zzz;

    static {
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN("application/x-emsg");
        zzc = zzaftVar.zzah();
    }

    public zzrk() {
        this(0, null);
    }

    private final void zze() {
        this.zzo = 0;
        this.zzr = 0;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0329 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x032b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0334  */
    /* JADX WARN: Code duplicated, block: B:116:0x033d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0346  */
    /* JADX WARN: Code duplicated, block: B:120:0x034f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0358  */
    /* JADX WARN: Code duplicated, block: B:123:0x035c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x035e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0362  */
    /* JADX WARN: Code duplicated, block: B:126:0x0363 A[PHI: r5
  0x0363: PHI (r5v49 int) = (r5v48 int), (r5v50 int) binds: [B:122:0x035a, B:125:0x0362] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0367  */
    /* JADX WARN: Code duplicated, block: B:129:0x037c  */
    /* JADX WARN: Code duplicated, block: B:132:0x039a  */
    /* JADX WARN: Code duplicated, block: B:133:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:244:0x0640  */
    private final void zzf(long j) throws zzaha {
        zzrk zzrkVar;
        SparseArray<zzrj> sparseArray;
        zzqv zzqvVar;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        boolean z;
        int i6;
        zzqv zzqvVar2;
        zzrj zzrjVar;
        long jZzH;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        boolean[] zArr;
        int i7;
        long j2;
        long j3;
        zzrj zzrjVar2;
        int i8;
        int iZzv;
        int iZzv2;
        int i9;
        int iZzv3;
        long jZzH2;
        zzrj zzrjVar3;
        boolean z2;
        final zzrk zzrkVar2 = this;
        while (!zzrkVar2.zzm.isEmpty() && zzrkVar2.zzm.peek().zza == j) {
            zzqv zzqvVarPop = zzrkVar2.zzm.pop();
            int i10 = zzqvVarPop.zzd;
            int i11 = 12;
            int i12 = 8;
            if (i10 == 1836019574) {
                zzn zznVarZzi = zzi(zzqvVarPop.zzb);
                zzqv zzqvVarZzd = zzqvVarPop.zzd(1836475768);
                zzqvVarZzd.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = zzqvVarZzd.zzb.size();
                long jZzt = -9223372036854775807L;
                int i13 = 0;
                while (i13 < size) {
                    zzqw zzqwVar = zzqvVarZzd.zzb.get(i13);
                    int i14 = zzqwVar.zzd;
                    if (i14 == 1953654136) {
                        zzamf zzamfVar = zzqwVar.zza;
                        zzamfVar.zzh(i11);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzamfVar.zzv()), new zzrf(zzamfVar.zzv() - 1, zzamfVar.zzv(), zzamfVar.zzv(), zzamfVar.zzv()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (zzrf) pairCreate.second);
                    } else if (i14 == 1835362404) {
                        zzamf zzamfVar2 = zzqwVar.zza;
                        zzamfVar2.zzh(8);
                        jZzt = zzqx.zze(zzamfVar2.zzv()) == 0 ? zzamfVar2.zzt() : zzamfVar2.zzD();
                    }
                    i13++;
                    i11 = 12;
                }
                List<zzrx> listZza = zzre.zza(zzqvVarPop, new zzoj(), jZzt, zznVarZzi, false, false, new zzfln(zzrkVar2) { // from class: com.google.android.gms.internal.ads.zzrg
                    private final zzrk zza;

                    {
                        this.zza = zzrkVar2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzfln
                    public final Object apply(Object obj) {
                        return (zzru) obj;
                    }
                });
                int size2 = listZza.size();
                if (zzrkVar2.zze.size() == 0) {
                    for (int i15 = 0; i15 < size2; i15++) {
                        zzrx zzrxVar = listZza.get(i15);
                        zzru zzruVar = zzrxVar.zza;
                        zzrkVar2.zze.put(zzruVar.zza, new zzrj(zzrkVar2.zzD.zzB(i15, zzruVar.zzb), zzrxVar, zzj(sparseArray2, zzruVar.zza)));
                        zzrkVar2.zzw = Math.max(zzrkVar2.zzw, zzruVar.zze);
                    }
                    zzrkVar2.zzD.zzC();
                } else {
                    zzakt.zzd(zzrkVar2.zze.size() == size2);
                    for (int i16 = 0; i16 < size2; i16++) {
                        zzrx zzrxVar2 = listZza.get(i16);
                        zzru zzruVar2 = zzrxVar2.zza;
                        zzrkVar2.zze.get(zzruVar2.zza).zzc(zzrxVar2, zzj(sparseArray2, zzruVar2.zza));
                    }
                }
            } else {
                if (i10 == 1836019558) {
                    SparseArray<zzrj> sparseArray3 = zzrkVar2.zze;
                    byte[] bArr4 = zzrkVar2.zzi;
                    int size3 = zzqvVarPop.zzc.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        zzqv zzqvVar3 = zzqvVarPop.zzc.get(i17);
                        if (zzqvVar3.zzd == 1953653094) {
                            zzqw zzqwVarZzc = zzqvVar3.zzc(1952868452);
                            zzqwVarZzc.getClass();
                            zzamf zzamfVar3 = zzqwVarZzc.zza;
                            zzamfVar3.zzh(i12);
                            int iZzv4 = zzamfVar3.zzv();
                            zzrj zzrjVar4 = sparseArray3.get(zzamfVar3.zzv());
                            if (zzrjVar4 == null) {
                                zzrjVar4 = null;
                            } else {
                                if ((iZzv4 & 1) != 0) {
                                    long jZzD = zzamfVar3.zzD();
                                    zzrw zzrwVar = zzrjVar4.zzb;
                                    zzrwVar.zzb = jZzD;
                                    zzrwVar.zzc = jZzD;
                                }
                                zzrf zzrfVar = zzrjVar4.zze;
                                zzrjVar4.zzb.zza = new zzrf((iZzv4 & 2) != 0 ? zzamfVar3.zzv() - 1 : zzrfVar.zza, (iZzv4 & 8) != 0 ? zzamfVar3.zzv() : zzrfVar.zzb, (iZzv4 & 16) != 0 ? zzamfVar3.zzv() : zzrfVar.zzc, (iZzv4 & 32) != 0 ? zzamfVar3.zzv() : zzrfVar.zzd);
                            }
                            if (zzrjVar4 == null) {
                                sparseArray = sparseArray3;
                                zzqvVar = zzqvVarPop;
                                i = size3;
                                i2 = i12;
                                i3 = i17;
                                bArr = bArr4;
                            } else {
                                zzrw zzrwVar2 = zzrjVar4.zzb;
                                long j4 = zzrwVar2.zzq;
                                boolean z3 = zzrwVar2.zzr;
                                zzrjVar4.zzd();
                                zzrj.zza(zzrjVar4, true);
                                zzqw zzqwVarZzc2 = zzqvVar3.zzc(1952867444);
                                if (zzqwVarZzc2 != null) {
                                    zzamf zzamfVar4 = zzqwVarZzc2.zza;
                                    zzamfVar4.zzh(i12);
                                    zzrwVar2.zzq = zzqx.zze(zzamfVar4.zzv()) == 1 ? zzamfVar4.zzD() : zzamfVar4.zzt();
                                    zzrwVar2.zzr = true;
                                } else {
                                    zzrwVar2.zzq = j4;
                                    zzrwVar2.zzr = z3;
                                }
                                List<zzqw> list = zzqvVar3.zzb;
                                int size4 = list.size();
                                int i18 = 0;
                                int i19 = 0;
                                int i20 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i18 >= size4) {
                                        break;
                                    }
                                    zzqw zzqwVar2 = list.get(i18);
                                    SparseArray<zzrj> sparseArray4 = sparseArray3;
                                    if (zzqwVar2.zzd == 1953658222) {
                                        zzamf zzamfVar5 = zzqwVar2.zza;
                                        zzamfVar5.zzh(12);
                                        int iZzB = zzamfVar5.zzB();
                                        if (iZzB > 0) {
                                            i20 += iZzB;
                                            i19++;
                                        }
                                    }
                                    i18++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzrjVar4.zzh = 0;
                                zzrjVar4.zzg = 0;
                                zzrjVar4.zzf = 0;
                                zzrw zzrwVar3 = zzrjVar4.zzb;
                                zzrwVar3.zzd = i19;
                                zzrwVar3.zze = i20;
                                if (zzrwVar3.zzg.length < i19) {
                                    zzrwVar3.zzf = new long[i19];
                                    zzrwVar3.zzg = new int[i19];
                                }
                                if (zzrwVar3.zzh.length < i20) {
                                    int i21 = (i20 * 125) / 100;
                                    zzrwVar3.zzh = new int[i21];
                                    zzrwVar3.zzi = new int[i21];
                                    zzrwVar3.zzj = new long[i21];
                                    zzrwVar3.zzk = new boolean[i21];
                                    zzrwVar3.zzm = new boolean[i21];
                                }
                                int i22 = 0;
                                int i23 = 0;
                                int i24 = 0;
                                while (i22 < size4) {
                                    zzqw zzqwVar3 = list.get(i22);
                                    if (zzqwVar3.zzd == i4) {
                                        int i25 = i24 + 1;
                                        zzamf zzamfVar6 = zzqwVar3.zza;
                                        zzamfVar6.zzh(8);
                                        int iZzv5 = zzamfVar6.zzv();
                                        zzru zzruVar3 = zzrjVar4.zzd.zza;
                                        zzrw zzrwVar4 = zzrjVar4.zzb;
                                        zzrf zzrfVar2 = zzrwVar4.zza;
                                        int i26 = zzamq.zza;
                                        zzrwVar4.zzg[i24] = zzamfVar6.zzB();
                                        long[] jArr2 = zzrwVar4.zzf;
                                        long j5 = zzrwVar4.zzb;
                                        jArr2[i24] = j5;
                                        if ((iZzv5 & 1) != 0) {
                                            jArr2[i24] = j5 + ((long) zzamfVar6.zzv());
                                        }
                                        int i27 = iZzv5 & 4;
                                        int iZzv6 = zzrfVar2.zzd;
                                        if (i27 != 0) {
                                            iZzv6 = zzamfVar6.zzv();
                                        }
                                        int i28 = iZzv5 & 256;
                                        int i29 = iZzv5 & 512;
                                        int i30 = iZzv5 & 1024;
                                        int i31 = iZzv5 & 2048;
                                        int i32 = iZzv6;
                                        long[] jArr3 = zzruVar3.zzh;
                                        if (jArr3 != null) {
                                            i6 = i17;
                                            zzqvVar2 = zzqvVar3;
                                            if (jArr3.length == 1 && jArr3[0] == 0) {
                                                i31 = i31;
                                                jZzH = zzamq.zzH(((long[]) zzamq.zzd(zzruVar3.zzi))[0], 1000000L, zzruVar3.zzc);
                                            }
                                            iArr = zzrwVar4.zzh;
                                            iArr2 = zzrwVar4.zzi;
                                            jArr = zzrwVar4.zzj;
                                            zArr = zzrwVar4.zzk;
                                            i7 = zzrwVar4.zzg[i24] + i23;
                                            int i33 = i23;
                                            j2 = zzruVar3.zzc;
                                            j3 = zzrwVar4.zzq;
                                            zzrjVar2 = zzrjVar4;
                                            i8 = i33;
                                            while (i8 < i7) {
                                                if (i28 != 0) {
                                                    iZzv = zzamfVar6.zzv();
                                                } else {
                                                    iZzv = zzrfVar2.zzb;
                                                }
                                                zzg(iZzv);
                                                if (i29 != 0) {
                                                    iZzv2 = zzamfVar6.zzv();
                                                } else {
                                                    iZzv2 = zzrfVar2.zzc;
                                                }
                                                zzg(iZzv2);
                                                if (i30 != 0) {
                                                    i9 = i27;
                                                    iZzv3 = zzamfVar6.zzv();
                                                } else {
                                                    i9 = i27;
                                                    if (i8 != 0) {
                                                        iZzv3 = zzrfVar2.zzd;
                                                    } else if (i27 != 0) {
                                                        iZzv3 = i32;
                                                        i8 = 0;
                                                    } else {
                                                        i8 = 0;
                                                        iZzv3 = zzrfVar2.zzd;
                                                    }
                                                }
                                                if (i31 != 0) {
                                                    iArr2[i8] = (int) ((((long) zzamfVar6.zzv()) * 1000000) / j2);
                                                } else {
                                                    iArr2[i8] = 0;
                                                }
                                                jZzH2 = zzamq.zzH(j3, 1000000L, j2) - jZzH;
                                                jArr[i8] = jZzH2;
                                                int i34 = i7;
                                                if (zzrwVar4.zzr) {
                                                    zzrjVar3 = zzrjVar2;
                                                } else {
                                                    zzrjVar3 = zzrjVar2;
                                                    jArr[i8] = jZzH2 + zzrjVar3.zzd.zzh;
                                                }
                                                iArr[i8] = iZzv2;
                                                if (1 != (((iZzv3 >> 16) & 1) ^ 1)) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                zArr[i8] = z2;
                                                j3 += (long) iZzv;
                                                i8++;
                                                zzrjVar2 = zzrjVar3;
                                                i7 = i34;
                                                j2 = j2;
                                                i28 = i28;
                                                i29 = i29;
                                                i27 = i9;
                                                i31 = i31;
                                                zzamfVar6 = zzamfVar6;
                                                i30 = i30;
                                            }
                                            zzrjVar = zzrjVar2;
                                            zzrwVar4.zzq = j3;
                                            i24 = i25;
                                            i23 = i7;
                                        } else {
                                            i6 = i17;
                                            zzqvVar2 = zzqvVar3;
                                        }
                                        jZzH = 0;
                                        iArr = zzrwVar4.zzh;
                                        iArr2 = zzrwVar4.zzi;
                                        jArr = zzrwVar4.zzj;
                                        zArr = zzrwVar4.zzk;
                                        i7 = zzrwVar4.zzg[i24] + i23;
                                        int i35 = i23;
                                        j2 = zzruVar3.zzc;
                                        j3 = zzrwVar4.zzq;
                                        zzrjVar2 = zzrjVar4;
                                        i8 = i35;
                                        while (i8 < i7) {
                                            if (i28 != 0) {
                                                iZzv = zzamfVar6.zzv();
                                            } else {
                                                iZzv = zzrfVar2.zzb;
                                            }
                                            zzg(iZzv);
                                            if (i29 != 0) {
                                                iZzv2 = zzamfVar6.zzv();
                                            } else {
                                                iZzv2 = zzrfVar2.zzc;
                                            }
                                            zzg(iZzv2);
                                            if (i30 != 0) {
                                                i9 = i27;
                                                iZzv3 = zzamfVar6.zzv();
                                            } else {
                                                i9 = i27;
                                                if (i8 != 0) {
                                                    iZzv3 = zzrfVar2.zzd;
                                                } else if (i27 != 0) {
                                                    iZzv3 = i32;
                                                    i8 = 0;
                                                } else {
                                                    i8 = 0;
                                                    iZzv3 = zzrfVar2.zzd;
                                                }
                                            }
                                            if (i31 != 0) {
                                                iArr2[i8] = (int) ((((long) zzamfVar6.zzv()) * 1000000) / j2);
                                            } else {
                                                iArr2[i8] = 0;
                                            }
                                            jZzH2 = zzamq.zzH(j3, 1000000L, j2) - jZzH;
                                            jArr[i8] = jZzH2;
                                            int i36 = i7;
                                            if (zzrwVar4.zzr) {
                                                zzrjVar3 = zzrjVar2;
                                                jArr[i8] = jZzH2 + zzrjVar3.zzd.zzh;
                                            } else {
                                                zzrjVar3 = zzrjVar2;
                                            }
                                            iArr[i8] = iZzv2;
                                            if (1 != (((iZzv3 >> 16) & 1) ^ 1)) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            zArr[i8] = z2;
                                            j3 += (long) iZzv;
                                            i8++;
                                            zzrjVar2 = zzrjVar3;
                                            i7 = i36;
                                            j2 = j2;
                                            i28 = i28;
                                            i29 = i29;
                                            i27 = i9;
                                            i31 = i31;
                                            zzamfVar6 = zzamfVar6;
                                            i30 = i30;
                                        }
                                        zzrjVar = zzrjVar2;
                                        zzrwVar4.zzq = j3;
                                        i24 = i25;
                                        i23 = i7;
                                    } else {
                                        i22 = i22;
                                        i6 = i17;
                                        zzqvVar2 = zzqvVar3;
                                        zzrjVar = zzrjVar4;
                                    }
                                    zzrjVar4 = zzrjVar;
                                    list = list;
                                    size3 = size3;
                                    size4 = size4;
                                    zzqvVarPop = zzqvVarPop;
                                    bArr4 = bArr4;
                                    i17 = i6;
                                    zzqvVar3 = zzqvVar2;
                                    zzrwVar2 = zzrwVar2;
                                    i4 = 1953658222;
                                    i22++;
                                }
                                zzqvVar = zzqvVarPop;
                                byte[] bArr5 = bArr4;
                                zzrw zzrwVar5 = zzrwVar2;
                                i = size3;
                                i3 = i17;
                                zzqv zzqvVar4 = zzqvVar3;
                                zzru zzruVar4 = zzrjVar4.zzd.zza;
                                zzrf zzrfVar3 = zzrwVar5.zza;
                                zzrfVar3.getClass();
                                zzrv zzrvVarZza = zzruVar4.zza(zzrfVar3.zza);
                                zzqw zzqwVarZzc3 = zzqvVar4.zzc(1935763834);
                                if (zzqwVarZzc3 != null) {
                                    zzrvVarZza.getClass();
                                    zzamf zzamfVar7 = zzqwVarZzc3.zza;
                                    int i37 = zzrvVarZza.zzd;
                                    zzamfVar7.zzh(8);
                                    if ((zzamfVar7.zzv() & 1) == 1) {
                                        zzamfVar7.zzk(8);
                                    }
                                    int iZzn = zzamfVar7.zzn();
                                    int iZzB2 = zzamfVar7.zzB();
                                    int i38 = zzrwVar5.zze;
                                    if (iZzB2 > i38) {
                                        StringBuilder sb = new StringBuilder(78);
                                        sb.append("Saiz sample count ");
                                        sb.append(iZzB2);
                                        sb.append(" is greater than fragment sample count");
                                        sb.append(i38);
                                        throw zzaha.zzb(sb.toString(), null);
                                    }
                                    if (iZzn == 0) {
                                        boolean[] zArr2 = zzrwVar5.zzm;
                                        i5 = 0;
                                        for (int i39 = 0; i39 < iZzB2; i39++) {
                                            int iZzn2 = zzamfVar7.zzn();
                                            i5 += iZzn2;
                                            zArr2[i39] = iZzn2 > i37;
                                        }
                                        z = false;
                                    } else {
                                        boolean z4 = iZzn > i37;
                                        i5 = iZzn * iZzB2;
                                        z = false;
                                        Arrays.fill(zzrwVar5.zzm, 0, iZzB2, z4);
                                    }
                                    Arrays.fill(zzrwVar5.zzm, iZzB2, zzrwVar5.zze, z);
                                    if (i5 > 0) {
                                        zzrwVar5.zza(i5);
                                    }
                                }
                                zzqw zzqwVarZzc4 = zzqvVar4.zzc(1935763823);
                                if (zzqwVarZzc4 != null) {
                                    zzamf zzamfVar8 = zzqwVarZzc4.zza;
                                    zzamfVar8.zzh(8);
                                    int iZzv7 = zzamfVar8.zzv();
                                    if ((iZzv7 & 1) == 1) {
                                        zzamfVar8.zzk(8);
                                    }
                                    int iZzB3 = zzamfVar8.zzB();
                                    if (iZzB3 != 1) {
                                        StringBuilder sb2 = new StringBuilder(40);
                                        sb2.append("Unexpected saio entry count: ");
                                        sb2.append(iZzB3);
                                        throw zzaha.zzb(sb2.toString(), null);
                                    }
                                    zzrwVar5.zzc += zzqx.zze(iZzv7) == 0 ? zzamfVar8.zzt() : zzamfVar8.zzD();
                                }
                                zzqw zzqwVarZzc5 = zzqvVar4.zzc(1936027235);
                                if (zzqwVarZzc5 != null) {
                                    zzh(zzqwVarZzc5.zza, 0, zzrwVar5);
                                }
                                String str = zzrvVarZza != null ? zzrvVarZza.zzb : null;
                                zzamf zzamfVar9 = null;
                                zzamf zzamfVar10 = null;
                                for (int i40 = 0; i40 < zzqvVar4.zzb.size(); i40++) {
                                    zzqw zzqwVar4 = zzqvVar4.zzb.get(i40);
                                    zzamf zzamfVar11 = zzqwVar4.zza;
                                    int i41 = zzqwVar4.zzd;
                                    if (i41 == 1935828848) {
                                        zzamfVar11.zzh(12);
                                        if (zzamfVar11.zzv() == 1936025959) {
                                            zzamfVar9 = zzamfVar11;
                                        }
                                    } else if (i41 == 1936158820) {
                                        zzamfVar11.zzh(12);
                                        if (zzamfVar11.zzv() == 1936025959) {
                                            zzamfVar10 = zzamfVar11;
                                        }
                                    }
                                }
                                if (zzamfVar9 != null && zzamfVar10 != null) {
                                    zzamfVar9.zzh(8);
                                    int iZzv8 = zzamfVar9.zzv();
                                    zzamfVar9.zzk(4);
                                    if (zzqx.zze(iZzv8) == 1) {
                                        zzamfVar9.zzk(4);
                                    }
                                    if (zzamfVar9.zzv() != 1) {
                                        throw zzaha.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzamfVar10.zzh(8);
                                    int iZze = zzqx.zze(zzamfVar10.zzv());
                                    zzamfVar10.zzk(4);
                                    if (iZze == 1) {
                                        if (zzamfVar10.zzt() == 0) {
                                            throw zzaha.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iZze >= 2) {
                                        zzamfVar10.zzk(4);
                                    }
                                    if (zzamfVar10.zzt() != 1) {
                                        throw zzaha.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzamfVar10.zzk(1);
                                    int iZzn3 = zzamfVar10.zzn();
                                    int i42 = (iZzn3 & 240) >> 4;
                                    int i43 = iZzn3 & 15;
                                    if (zzamfVar10.zzn() == 1) {
                                        int iZzn4 = zzamfVar10.zzn();
                                        byte[] bArr6 = new byte[16];
                                        zzamfVar10.zzm(bArr6, 0, 16);
                                        if (iZzn4 == 0) {
                                            int iZzn5 = zzamfVar10.zzn();
                                            byte[] bArr7 = new byte[iZzn5];
                                            zzamfVar10.zzm(bArr7, 0, iZzn5);
                                            bArr3 = bArr7;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzrwVar5.zzl = true;
                                        zzrwVar5.zzn = new zzrv(true, str, iZzn4, bArr6, i42, i43, bArr3);
                                    }
                                }
                                int size5 = zzqvVar4.zzb.size();
                                int i44 = 0;
                                while (i44 < size5) {
                                    zzqw zzqwVar5 = zzqvVar4.zzb.get(i44);
                                    if (zzqwVar5.zzd == 1970628964) {
                                        zzamf zzamfVar12 = zzqwVar5.zza;
                                        zzamfVar12.zzh(8);
                                        bArr2 = bArr5;
                                        zzamfVar12.zzm(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzamfVar12, 16, zzrwVar5);
                                        }
                                    } else {
                                        bArr2 = bArr5;
                                    }
                                    i44++;
                                    bArr5 = bArr2;
                                }
                                bArr = bArr5;
                                i2 = 8;
                            }
                        } else {
                            sparseArray = sparseArray3;
                            zzqvVar = zzqvVarPop;
                            i = size3;
                            i2 = i12;
                            i3 = i17;
                            bArr = bArr4;
                        }
                        i12 = i2;
                        bArr4 = bArr;
                        size3 = i;
                        zzqvVarPop = zzqvVar;
                        i17 = i3 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzn zznVarZzi2 = zzi(zzqvVarPop.zzb);
                    zzrkVar = this;
                    if (zznVarZzi2 != null) {
                        int size6 = zzrkVar.zze.size();
                        for (int i45 = 0; i45 < size6; i45++) {
                            zzrj zzrjVarValueAt = zzrkVar.zze.valueAt(i45);
                            zzru zzruVar5 = zzrjVarValueAt.zzd.zza;
                            zzrf zzrfVar4 = zzrjVarValueAt.zzb.zza;
                            int i46 = zzamq.zza;
                            zzrv zzrvVarZza2 = zzruVar5.zza(zzrfVar4.zza);
                            zzn zznVarZza = zznVarZzi2.zza(zzrvVarZza2 != null ? zzrvVarZza2.zzb : null);
                            zzaft zzaftVarZza = zzrjVarValueAt.zzd.zza.zzf.zza();
                            zzaftVarZza.zzQ(zznVarZza);
                            zzrjVarValueAt.zza.zzs(zzaftVarZza.zzah());
                        }
                    }
                    if (zzrkVar.zzv != -9223372036854775807L) {
                        int size7 = zzrkVar.zze.size();
                        for (int i47 = 0; i47 < size7; i47++) {
                            zzrj zzrjVarValueAt2 = zzrkVar.zze.valueAt(i47);
                            long j6 = zzrkVar.zzv;
                            int i48 = zzrjVarValueAt2.zzf;
                            while (true) {
                                zzrw zzrwVar6 = zzrjVarValueAt2.zzb;
                                if (i48 >= zzrwVar6.zze || zzrwVar6.zzb(i48) >= j6) {
                                    break;
                                }
                                if (zzrjVarValueAt2.zzb.zzk[i48]) {
                                    zzrjVarValueAt2.zzi = i48;
                                }
                                i48++;
                            }
                        }
                        zzrkVar.zzv = -9223372036854775807L;
                    }
                } else {
                    zzrkVar = zzrkVar2;
                    if (!zzrkVar.zzm.isEmpty()) {
                        zzrkVar.zzm.peek().zzb(zzqvVarPop);
                    }
                }
                zzrkVar2 = zzrkVar;
            }
        }
        zze();
    }

    private static int zzg(int i) throws zzaha {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw zzaha.zzb(sb.toString(), null);
    }

    private static void zzh(zzamf zzamfVar, int i, zzrw zzrwVar) throws zzaha {
        zzamfVar.zzh(i + 8);
        int iZzv = zzamfVar.zzv();
        if ((iZzv & 1) != 0) {
            throw zzaha.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iZzv & 2) != 0;
        int iZzB = zzamfVar.zzB();
        if (iZzB == 0) {
            Arrays.fill(zzrwVar.zzm, 0, zzrwVar.zze, false);
            return;
        }
        int i2 = zzrwVar.zze;
        if (iZzB == i2) {
            Arrays.fill(zzrwVar.zzm, 0, iZzB, z);
            zzrwVar.zza(zzamfVar.zzd());
            zzamfVar.zzm(zzrwVar.zzo.zzi(), 0, zzrwVar.zzo.zze());
            zzrwVar.zzo.zzh(0);
            zzrwVar.zzp = false;
            return;
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append("Senc sample count ");
        sb.append(iZzB);
        sb.append(" is different from fragment sample count");
        sb.append(i2);
        throw zzaha.zzb(sb.toString(), null);
    }

    private static zzn zzi(List<zzqw> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzqw zzqwVar = list.get(i);
            if (zzqwVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrZzi = zzqwVar.zza.zzi();
                UUID uuidZza = zzrr.zza(bArrZzi);
                if (uuidZza == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzm(uuidZza, null, "video/mp4", bArrZzi));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzn(arrayList);
    }

    private static final zzrf zzj(SparseArray<zzrf> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        zzrf zzrfVar = sparseArray.get(i);
        zzrfVar.getClass();
        return zzrfVar;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        return zzrt.zza(zznvVar);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzD = zznxVar;
        zze();
        zzox[] zzoxVarArr = new zzox[2];
        this.zzE = zzoxVarArr;
        int i = 0;
        zzox[] zzoxVarArr2 = (zzox[]) zzamq.zzf(zzoxVarArr, 0);
        this.zzE = zzoxVarArr2;
        for (zzox zzoxVar : zzoxVarArr2) {
            zzoxVar.zzs(zzc);
        }
        this.zzF = new zzox[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzox zzoxVarZzB = this.zzD.zzB(i2, 3);
            zzoxVarZzB.zzs(this.zzd.get(i));
            this.zzF[i] = zzoxVarZzB;
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x01c3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        int i;
        ?? r9;
        zzrj zzrjVar;
        int iZza;
        boolean z;
        int iZzj;
        long j;
        long jZzH;
        long jZzt;
        String str;
        String str2;
        long j2;
        long jZzD;
        long jZzD2;
        zznv zznvVar2 = zznvVar;
        while (true) {
            int i2 = this.zzo;
            i = 1;
            r9 = 0;
            if (i2 == 0) {
                if (this.zzr == 0) {
                    if (!zznvVar2.zza(this.zzl.zzi(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzr = 8;
                    this.zzl.zzh(0);
                    this.zzq = this.zzl.zzt();
                    this.zzp = this.zzl.zzv();
                }
                long j3 = this.zzq;
                if (j3 == 1) {
                    ((zznp) zznvVar2).zza(this.zzl.zzi(), 8, 8, false);
                    this.zzr += 8;
                    this.zzq = this.zzl.zzD();
                } else if (j3 == 0) {
                    long jZzo = zznvVar.zzo();
                    if (jZzo == -1 && !this.zzm.isEmpty()) {
                        jZzo = this.zzm.peek().zza;
                    }
                    if (jZzo != -1) {
                        this.zzq = (jZzo - zznvVar.zzn()) + ((long) this.zzr);
                    }
                }
                if (this.zzq < this.zzr) {
                    throw zzaha.zzc("Atom size less than header length (unsupported).");
                }
                long jZzn = zznvVar.zzn() - ((long) this.zzr);
                int i3 = this.zzp;
                if ((i3 == 1836019558 || i3 == 1835295092) && !this.zzG) {
                    this.zzD.zzD(new zzos(this.zzw, jZzn));
                    this.zzG = true;
                }
                if (this.zzp == 1836019558) {
                    int size = this.zze.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        zzrw zzrwVar = this.zze.valueAt(i4).zzb;
                        zzrwVar.zzc = jZzn;
                        zzrwVar.zzb = jZzn;
                    }
                }
                int i5 = this.zzp;
                if (i5 == 1835295092) {
                    this.zzy = null;
                    this.zzt = jZzn + this.zzq;
                    this.zzo = 2;
                } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227) {
                    long jZzn2 = (zznvVar.zzn() + this.zzq) - 8;
                    this.zzm.push(new zzqv(this.zzp, jZzn2));
                    if (this.zzq == this.zzr) {
                        zzf(jZzn2);
                    } else {
                        zze();
                    }
                } else if (i5 == 1751411826 || i5 == 1835296868 || i5 == 1836476516 || i5 == 1936286840 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1668576371 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1937011571 || i5 == 1952867444 || i5 == 1952868452 || i5 == 1953196132 || i5 == 1953654136 || i5 == 1953658222 || i5 == 1886614376 || i5 == 1935763834 || i5 == 1935763823 || i5 == 1936027235 || i5 == 1970628964 || i5 == 1935828848 || i5 == 1936158820 || i5 == 1701606260 || i5 == 1835362404 || i5 == 1701671783) {
                    if (this.zzr != 8) {
                        throw zzaha.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j4 = this.zzq;
                    if (j4 > 2147483647L) {
                        throw zzaha.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzamf zzamfVar = new zzamf((int) j4);
                    System.arraycopy(this.zzl.zzi(), 0, zzamfVar.zzi(), 0, 8);
                    this.zzs = zzamfVar;
                    this.zzo = 1;
                } else {
                    if (this.zzq > 2147483647L) {
                        throw zzaha.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzs = null;
                    this.zzo = 1;
                }
            } else if (i2 != 1) {
                long j5 = Long.MAX_VALUE;
                if (i2 != 2) {
                    zzrjVar = this.zzy;
                    if (zzrjVar != null) {
                        break;
                    }
                    SparseArray<zzrj> sparseArray = this.zze;
                    int size2 = sparseArray.size();
                    long j6 = Long.MAX_VALUE;
                    zzrj zzrjVar2 = null;
                    for (int i6 = 0; i6 < size2; i6++) {
                        zzrj zzrjVarValueAt = sparseArray.valueAt(i6);
                        if ((zzrjVarValueAt.zzl || zzrjVarValueAt.zzf != zzrjVarValueAt.zzd.zzb) && (!zzrjVarValueAt.zzl || zzrjVarValueAt.zzh != zzrjVarValueAt.zzb.zzd)) {
                            long jZzf = zzrjVarValueAt.zzf();
                            if (jZzf < j6) {
                                zzrjVar2 = zzrjVarValueAt;
                                j6 = jZzf;
                            }
                        }
                    }
                    if (zzrjVar2 != null) {
                        int iZzf = (int) (zzrjVar2.zzf() - zznvVar.zzn());
                        if (iZzf < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZzf = 0;
                        }
                        ((zznp) zznvVar2).zzd(iZzf, false);
                        this.zzy = zzrjVar2;
                        zzrjVar = zzrjVar2;
                        break;
                    }
                    int iZzn = (int) (this.zzt - zznvVar.zzn());
                    if (iZzn < 0) {
                        throw zzaha.zzb("Offset to end of mdat was negative.", null);
                    }
                    ((zznp) zznvVar2).zzd(iZzn, false);
                    zze();
                } else {
                    int size3 = this.zze.size();
                    zzrj zzrjVarValueAt2 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzrw zzrwVar2 = this.zze.valueAt(i7).zzb;
                        if (zzrwVar2.zzp) {
                            long j7 = zzrwVar2.zzc;
                            if (j7 < j5) {
                                zzrjVarValueAt2 = this.zze.valueAt(i7);
                                j5 = j7;
                            }
                        }
                    }
                    if (zzrjVarValueAt2 == null) {
                        this.zzo = 3;
                    } else {
                        int iZzn2 = (int) (j5 - zznvVar.zzn());
                        if (iZzn2 < 0) {
                            throw zzaha.zzb("Offset to encryption data was negative.", null);
                        }
                        zznp zznpVar = (zznp) zznvVar2;
                        zznpVar.zzd(iZzn2, false);
                        zzrw zzrwVar3 = zzrjVarValueAt2.zzb;
                        zznpVar.zza(zzrwVar3.zzo.zzi(), 0, zzrwVar3.zzo.zze(), false);
                        zzrwVar3.zzo.zzh(0);
                        zzrwVar3.zzp = false;
                    }
                }
            } else {
                int i8 = ((int) this.zzq) - this.zzr;
                zzamf zzamfVar2 = this.zzs;
                if (zzamfVar2 != null) {
                    ((zznp) zznvVar2).zza(zzamfVar2.zzi(), 8, i8, false);
                    zzqw zzqwVar = new zzqw(this.zzp, zzamfVar2);
                    long jZzn3 = zznvVar.zzn();
                    if (this.zzm.isEmpty()) {
                        int i9 = zzqwVar.zzd;
                        if (i9 == 1936286840) {
                            zzamf zzamfVar3 = zzqwVar.zza;
                            zzamfVar3.zzh(8);
                            int iZzv = zzamfVar3.zzv();
                            zzamfVar3.zzk(4);
                            long jZzt2 = zzamfVar3.zzt();
                            if (zzqx.zze(iZzv) == 0) {
                                jZzD = zzamfVar3.zzt();
                                jZzD2 = zzamfVar3.zzt();
                            } else {
                                jZzD = zzamfVar3.zzD();
                                jZzD2 = zzamfVar3.zzD();
                            }
                            long j8 = jZzn3 + jZzD2;
                            long jZzH2 = zzamq.zzH(jZzD, 1000000L, jZzt2);
                            zzamfVar3.zzk(2);
                            int iZzo = zzamfVar3.zzo();
                            int[] iArr = new int[iZzo];
                            long[] jArr = new long[iZzo];
                            long[] jArr2 = new long[iZzo];
                            long[] jArr3 = new long[iZzo];
                            long jZzH3 = jZzH2;
                            int i10 = 0;
                            while (i10 < iZzo) {
                                int iZzv2 = zzamfVar3.zzv();
                                if ((iZzv2 & Integer.MIN_VALUE) != 0) {
                                    throw zzaha.zzb("Unhandled indirect reference", null);
                                }
                                long jZzt3 = zzamfVar3.zzt();
                                iArr[i10] = iZzv2 & Integer.MAX_VALUE;
                                jArr[i10] = j8;
                                jArr3[i10] = jZzH3;
                                long j9 = jZzD + jZzt3;
                                long[] jArr4 = jArr3;
                                int i11 = i10;
                                long[] jArr5 = jArr2;
                                int[] iArr2 = iArr;
                                jZzH3 = zzamq.zzH(j9, 1000000L, jZzt2);
                                jArr5[i11] = jZzH3 - jArr4[i11];
                                zzamfVar3.zzk(4);
                                j8 += (long) iArr2[i11];
                                i10 = i11 + 1;
                                iArr = iArr2;
                                jArr = jArr;
                                jArr2 = jArr5;
                                jArr3 = jArr4;
                                iZzo = iZzo;
                                jZzD = j9;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jZzH2), new zznn(iArr, jArr, jArr2, jArr3));
                            this.zzx = ((Long) pairCreate.first).longValue();
                            this.zzD.zzD((zzot) pairCreate.second);
                            this.zzG = true;
                        } else if (i9 == 1701671783) {
                            zzamf zzamfVar4 = zzqwVar.zza;
                            if (this.zzE.length != 0) {
                                zzamfVar4.zzh(8);
                                int iZze = zzqx.zze(zzamfVar4.zzv());
                                if (iZze == 0) {
                                    String strZzG = zzamfVar4.zzG((char) 0);
                                    strZzG.getClass();
                                    String strZzG2 = zzamfVar4.zzG((char) 0);
                                    strZzG2.getClass();
                                    long jZzt4 = zzamfVar4.zzt();
                                    long jZzH4 = zzamq.zzH(zzamfVar4.zzt(), 1000000L, jZzt4);
                                    long j10 = this.zzx;
                                    j = j10 != -9223372036854775807L ? j10 + jZzH4 : -9223372036854775807L;
                                    jZzH = zzamq.zzH(zzamfVar4.zzt(), 1000L, jZzt4);
                                    jZzt = zzamfVar4.zzt();
                                    str = strZzG;
                                    str2 = strZzG2;
                                    j2 = jZzH4;
                                } else if (iZze != 1) {
                                    StringBuilder sb = new StringBuilder(46);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(iZze);
                                    Log.w("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long jZzt5 = zzamfVar4.zzt();
                                    long jZzH5 = zzamq.zzH(zzamfVar4.zzD(), 1000000L, jZzt5);
                                    long jZzH6 = zzamq.zzH(zzamfVar4.zzt(), 1000L, jZzt5);
                                    long jZzt6 = zzamfVar4.zzt();
                                    String strZzG3 = zzamfVar4.zzG((char) 0);
                                    strZzG3.getClass();
                                    String strZzG4 = zzamfVar4.zzG((char) 0);
                                    strZzG4.getClass();
                                    jZzH = jZzH6;
                                    j = jZzH5;
                                    jZzt = jZzt6;
                                    str = strZzG3;
                                    str2 = strZzG4;
                                    j2 = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzamfVar4.zzd()];
                                zzamfVar4.zzm(bArr, 0, zzamfVar4.zzd());
                                zzamf zzamfVar5 = new zzamf(this.zzk.zza(new zzaiz(str, str2, jZzH, jZzt, bArr)));
                                int iZzd = zzamfVar5.zzd();
                                for (zzox zzoxVar : this.zzE) {
                                    zzamfVar5.zzh(0);
                                    zzoxVar.zzy(zzamfVar5, iZzd);
                                }
                                if (j == -9223372036854775807L) {
                                    this.zzn.addLast(new zzri(j2, iZzd));
                                    this.zzu += iZzd;
                                } else {
                                    for (zzox zzoxVar2 : this.zzE) {
                                        zzoxVar2.zzv(j, 1, iZzd, 0, null);
                                    }
                                }
                            }
                        }
                        zznvVar2 = zznvVar;
                    } else {
                        this.zzm.peek().zza(zzqwVar);
                    }
                } else {
                    ((zznp) zznvVar2).zzd(i8, false);
                }
                zzf(zznvVar.zzn());
            }
        }
        int i12 = 6;
        if (this.zzo == 3) {
            int iZzg = zzrjVar.zzg();
            this.zzz = iZzg;
            if (zzrjVar.zzf < zzrjVar.zzi) {
                ((zznp) zznvVar2).zzd(iZzg, false);
                zzrv zzrvVarZzk = zzrjVar.zzk();
                if (zzrvVarZzk != null) {
                    zzamf zzamfVar6 = zzrjVar.zzb.zzo;
                    int i13 = zzrvVarZzk.zzd;
                    if (i13 != 0) {
                        zzamfVar6.zzk(i13);
                    }
                    if (zzrjVar.zzb.zzc(zzrjVar.zzf)) {
                        zzamfVar6.zzk(zzamfVar6.zzo() * 6);
                    }
                }
                if (!zzrjVar.zzi()) {
                    this.zzy = null;
                }
                this.zzo = 3;
                return 0;
            }
            if (zzrjVar.zzd.zza.zzg == 1) {
                this.zzz = iZzg - 8;
                ((zznp) zznvVar2).zzd(8, false);
            }
            if ("audio/ac4".equals(zzrjVar.zzd.zza.zzf.zzl)) {
                this.zzA = zzrjVar.zzj(this.zzz, 7);
                zznd.zzb(this.zzz, this.zzj);
                zzov.zzb(zzrjVar.zza, this.zzj, 7);
                iZzj = this.zzA + 7;
                this.zzA = iZzj;
            } else {
                iZzj = zzrjVar.zzj(this.zzz, 0);
                this.zzA = iZzj;
            }
            this.zzz += iZzj;
            this.zzo = 4;
            this.zzB = 0;
        }
        zzru zzruVar = zzrjVar.zzd.zza;
        zzox zzoxVar3 = zzrjVar.zza;
        long jZze = zzrjVar.zze();
        if (zzruVar.zzj == 0) {
            while (true) {
                int i14 = this.zzA;
                int i15 = this.zzz;
                if (i14 >= i15) {
                    break;
                }
                this.zzA += zzov.zza(zzoxVar3, zznvVar2, i15 - i14, false);
            }
        } else {
            byte[] bArrZzi = this.zzg.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i16 = zzruVar.zzj;
            int i17 = i16 + 1;
            int i18 = 4 - i16;
            while (this.zzA < this.zzz) {
                int i19 = this.zzB;
                if (i19 == 0) {
                    ((zznp) zznvVar2).zza(bArrZzi, i18, i17, r9);
                    this.zzg.zzh(r9);
                    int iZzv3 = this.zzg.zzv();
                    if (iZzv3 <= 0) {
                        throw zzaha.zzb("Invalid NAL length", null);
                    }
                    this.zzB = iZzv3 - 1;
                    this.zzf.zzh(r9);
                    zzov.zzb(zzoxVar3, this.zzf, 4);
                    zzov.zzb(zzoxVar3, this.zzg, i);
                    if (this.zzF.length > 0) {
                        String str3 = zzruVar.zzf.zzl;
                        int i20 = bArrZzi[4];
                        byte[] bArr2 = zzalw.zza;
                        if (("video/avc".equals(str3) && (i20 & 31) == i12) || ("video/hevc".equals(str3) && ((i20 & 126) >> i) == 39)) {
                            z = i;
                        } else {
                            z = 0;
                        }
                    } else {
                        z = 0;
                    }
                    this.zzC = z;
                    this.zzA += 5;
                    this.zzz += i18;
                } else {
                    if (this.zzC) {
                        this.zzh.zza(i19);
                        ((zznp) zznvVar2).zza(this.zzh.zzi(), 0, this.zzB, false);
                        zzov.zzb(zzoxVar3, this.zzh, this.zzB);
                        iZza = this.zzB;
                        int iZza2 = zzalw.zza(this.zzh.zzi(), this.zzh.zze());
                        this.zzh.zzh("video/hevc".equals(zzruVar.zzf.zzl) ? 1 : 0);
                        this.zzh.zzf(iZza2);
                        zznm.zza(jZze, this.zzh, this.zzF);
                    } else {
                        iZza = zzov.zza(zzoxVar3, zznvVar2, i19, false);
                    }
                    this.zzA += iZza;
                    this.zzB -= iZza;
                    i12 = 6;
                    i = 1;
                }
                r9 = 0;
            }
        }
        int iZzh = zzrjVar.zzh();
        zzrv zzrvVarZzk2 = zzrjVar.zzk();
        zzoxVar3.zzv(jZze, iZzh, this.zzz, 0, zzrvVarZzk2 != null ? zzrvVarZzk2.zzc : null);
        while (!this.zzn.isEmpty()) {
            zzri zzriVarRemoveFirst = this.zzn.removeFirst();
            this.zzu -= zzriVarRemoveFirst.zzb;
            long j11 = zzriVarRemoveFirst.zza + jZze;
            for (zzox zzoxVar4 : this.zzE) {
                zzoxVar4.zzv(j11, 1, zzriVarRemoveFirst.zzb, this.zzu, null);
            }
        }
        if (!zzrjVar.zzi()) {
            this.zzy = null;
        }
        this.zzo = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            this.zze.valueAt(i).zzd();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zze();
    }

    public zzrk(int i, zzamn zzamnVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzaja();
        this.zzl = new zzamf(16);
        this.zzf = new zzamf(zzalw.zza);
        this.zzg = new zzamf(5);
        this.zzh = new zzamf();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzamf(bArr);
        this.zzm = new ArrayDeque<>();
        this.zzn = new ArrayDeque<>();
        this.zze = new SparseArray<>();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zznx.zza;
        this.zzE = new zzox[0];
        this.zzF = new zzox[0];
    }
}
