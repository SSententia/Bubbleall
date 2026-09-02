package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzjt extends zzjx {
    public static final /* synthetic */ int zza = 0;
    private static final zzfpw<Integer> zzb = zzfpw.zzc(zzjh.zza);
    private static final zzfpw<Integer> zzc = zzfpw.zzc(zzji.zza);
    private final AtomicReference<zzjn> zzd;
    private final zzjd zze;

    @Deprecated
    public zzjt() {
        zzjn zzjnVar = zzjn.zzA;
        throw null;
    }

    protected static boolean zzf(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    protected static String zzg(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int zzh(zzafv zzafvVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzafvVar.zzc)) {
            return 4;
        }
        String strZzg = zzg(str);
        String strZzg2 = zzg(zzafvVar.zzc);
        if (strZzg2 == null || strZzg == null) {
            return (z && strZzg2 == null) ? 1 : 0;
        }
        if (strZzg2.startsWith(strZzg) || strZzg.startsWith(strZzg2)) {
            return 3;
        }
        return zzamq.zzu(strZzg2, "-")[0].equals(zzamq.zzu(strZzg, "-")[0]) ? 2 : 0;
    }

    public final zzjn zzc() {
        return this.zzd.get();
    }

    public final void zzd(zzjo zzjoVar) {
        zzjn zzjnVar = new zzjn(zzjoVar);
        if (this.zzd.getAndSet(zzjnVar).equals(zzjnVar)) {
            return;
        }
        zzl();
    }

    /* JADX WARN: Code duplicated, block: B:156:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    @Override // com.google.android.gms.internal.ads.zzjx
    protected final Pair<zzahx[], zzjg[]> zze(zzjw zzjwVar, int[][][] iArr, int[] iArr2, zzhf zzhfVar, zzaiq zzaiqVar) throws zzaeg {
        int[] iArr3;
        int length;
        Pair pairCreate;
        int[][] iArr4;
        int[][] iArr5;
        int i;
        zzju zzjuVar;
        Pair pairCreate2;
        int[] iArr6;
        int i2;
        String str;
        int i3;
        zzq zzqVar;
        zzju[] zzjuVarArr;
        int i4;
        boolean z;
        zzju[] zzjuVarArr2;
        int i5;
        boolean z2;
        zzju[] zzjuVarArr3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Point point;
        int i12;
        zzjw zzjwVar2 = zzjwVar;
        zzjn zzjnVar = this.zzd.get();
        int i13 = 2;
        zzju[] zzjuVarArr4 = new zzju[2];
        int i14 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            int i15 = 1;
            if (i14 >= i13) {
                break;
            }
            if (zzjwVar2.zza(i14) == i13) {
                if (z3) {
                    zzjuVarArr = zzjuVarArr4;
                    z = z4;
                    i4 = i14;
                } else {
                    zzs zzsVarZzb = zzjwVar2.zzb(i14);
                    int[][] iArr7 = iArr[i14];
                    int i16 = iArr2[i14];
                    boolean z5 = zzjnVar.zzx;
                    boolean z6 = zzjnVar.zzw;
                    boolean z7 = zzjnVar.zzF;
                    boolean z8 = zzjnVar.zzE;
                    for (int i17 = 0; i17 < zzsVarZzb.zzb; i17++) {
                        zzq zzqVarZza = zzsVarZzb.zza(i17);
                        int[] iArr8 = iArr7[i17];
                        int i18 = zzjnVar.zzc;
                        int i19 = zzjnVar.zzd;
                        int i20 = zzjnVar.zze;
                        int i21 = zzjnVar.zzf;
                        int i22 = zzjnVar.zzg;
                        int i23 = zzjnVar.zzh;
                        int i24 = zzjnVar.zzi;
                        int i25 = zzjnVar.zzj;
                        int i26 = zzjnVar.zzk;
                        int i27 = zzjnVar.zzl;
                        boolean z9 = zzjnVar.zzm;
                        int i28 = zzqVarZza.zza;
                    }
                    int i29 = 0;
                    zzq zzqVar2 = null;
                    int i30 = -1;
                    zzjs zzjsVar = null;
                    while (i29 < zzsVarZzb.zzb) {
                        zzq zzqVarZza2 = zzsVarZzb.zza(i29);
                        int i31 = zzjnVar.zzk;
                        int i32 = zzjnVar.zzl;
                        boolean z10 = zzjnVar.zzm;
                        zzs zzsVar = zzsVarZzb;
                        int i33 = zzqVarZza2.zza;
                        ArrayList arrayList = new ArrayList(i15);
                        int i34 = 0;
                        while (true) {
                            int i35 = zzqVarZza2.zza;
                            if (i34 > 0) {
                                break;
                            }
                            arrayList.add(Integer.valueOf(i34));
                            i34++;
                        }
                        int i36 = Integer.MAX_VALUE;
                        if (i31 == Integer.MAX_VALUE || i32 == Integer.MAX_VALUE) {
                            zzjuVarArr2 = zzjuVarArr4;
                            i5 = i14;
                            z2 = z4;
                        } else {
                            z2 = z4;
                            int i37 = 0;
                            while (true) {
                                int i38 = zzqVarZza2.zza;
                                if (i37 > 0) {
                                    break;
                                }
                                zzafv zzafvVarZza = zzqVarZza2.zza(i37);
                                int i39 = zzafvVarZza.zzq;
                                if (i39 > 0) {
                                    zzjuVarArr3 = zzjuVarArr4;
                                    int i40 = zzafvVarZza.zzr;
                                    if (i40 > 0) {
                                        if (z10) {
                                            if ((i39 > i40) != (i31 > i32)) {
                                                i9 = i32;
                                                i6 = i9;
                                                i8 = i31;
                                            }
                                            i10 = i39 * i8;
                                            i7 = i14;
                                            i11 = i40 * i9;
                                            if (i10 >= i11) {
                                                point = new Point(i9, zzamq.zzw(i11, i39));
                                            } else {
                                                point = new Point(zzamq.zzw(i10, i40), i8);
                                            }
                                            i12 = zzafvVarZza.zzq;
                                            int i41 = zzafvVarZza.zzr * i12;
                                            if (i12 < ((int) (point.x * 0.98f)) && zzafvVarZza.zzr >= ((int) (point.y * 0.98f)) && i41 < i36) {
                                                i36 = i41;
                                            }
                                        } else {
                                            i31 = i31;
                                            z10 = z10;
                                        }
                                        i8 = i32;
                                        i6 = i8;
                                        i9 = i31;
                                        i10 = i39 * i8;
                                        i7 = i14;
                                        i11 = i40 * i9;
                                        if (i10 >= i11) {
                                            point = new Point(i9, zzamq.zzw(i11, i39));
                                        } else {
                                            point = new Point(zzamq.zzw(i10, i40), i8);
                                        }
                                        i12 = zzafvVarZza.zzq;
                                        int i42 = zzafvVarZza.zzr * i12;
                                        if (i12 < ((int) (point.x * 0.98f))) {
                                        }
                                    }
                                    i37++;
                                    zzjuVarArr4 = zzjuVarArr3;
                                    z10 = z10;
                                    i31 = i31;
                                    i32 = i6;
                                    i14 = i7;
                                } else {
                                    zzjuVarArr3 = zzjuVarArr4;
                                }
                                i6 = i32;
                                i7 = i14;
                                z10 = z10;
                                i37++;
                                zzjuVarArr4 = zzjuVarArr3;
                                z10 = z10;
                                i31 = i31;
                                i32 = i6;
                                i14 = i7;
                            }
                            zzjuVarArr2 = zzjuVarArr4;
                            i5 = i14;
                            if (i36 != Integer.MAX_VALUE) {
                                int i43 = -1;
                                int size = arrayList.size() - 1;
                                while (size >= 0) {
                                    int iZzc = zzqVarZza2.zza(((Integer) arrayList.get(size)).intValue()).zzc();
                                    if (iZzc == i43 || iZzc > i36) {
                                        arrayList.remove(size);
                                    }
                                    size--;
                                    i43 = -1;
                                }
                            }
                        }
                        int[] iArr9 = iArr7[i29];
                        zzjs zzjsVar2 = zzjsVar;
                        int i44 = 0;
                        while (true) {
                            int i45 = zzqVarZza2.zza;
                            if (i44 <= 0) {
                                zzafv zzafvVarZza2 = zzqVarZza2.zza(i44);
                                int i46 = zzafvVarZza2.zze;
                                if (zzf(iArr9[i44], zzjnVar.zzK)) {
                                    zzjs zzjsVar3 = new zzjs(zzafvVarZza2, zzjnVar, iArr9[i44], arrayList.contains(Integer.valueOf(i44)));
                                    if ((zzjsVar3.zza || zzjnVar.zzD) && (zzjsVar2 == null || zzjsVar3.zza(zzjsVar2) > 0)) {
                                        i30 = i44;
                                        zzjsVar2 = zzjsVar3;
                                        zzqVar2 = zzqVarZza2;
                                    }
                                }
                                i44++;
                            }
                        }
                        i29++;
                        zzjsVar = zzjsVar2;
                        zzsVarZzb = zzsVar;
                        z4 = z2;
                        zzjuVarArr4 = zzjuVarArr2;
                        i14 = i5;
                        i15 = 1;
                    }
                    zzjuVarArr = zzjuVarArr4;
                    int i47 = i14;
                    z = z4;
                    zzju zzjuVar2 = zzqVar2 == null ? null : new zzju(zzqVar2, new int[]{i30}, 0);
                    zzjuVarArr[i47] = zzjuVar2;
                    if (zzjuVar2 != null) {
                        i4 = i47;
                        z3 = true;
                    } else {
                        i4 = i47;
                        z3 = false;
                    }
                }
                z4 = z | (zzjwVar.zzb(i4).zzb > 0);
            } else {
                zzjwVar = zzjwVar2;
                zzjuVarArr = zzjuVarArr4;
                i4 = i14;
            }
            i14 = i4 + 1;
            zzjwVar2 = zzjwVar;
            zzjuVarArr4 = zzjuVarArr;
            i13 = 2;
        }
        zzjw zzjwVar3 = zzjwVar2;
        zzju[] zzjuVarArr5 = zzjuVarArr4;
        boolean z11 = z4;
        int i48 = i13;
        zzjj zzjjVar = null;
        int i49 = -1;
        int i50 = 0;
        String str2 = null;
        while (i50 < i48) {
            if (zzjwVar3.zza(i50) == 1) {
                boolean z12 = zzjnVar.zzM || !z11;
                zzs zzsVarZzb2 = zzjwVar3.zzb(i50);
                int[][] iArr10 = iArr[i50];
                int i51 = iArr2[i50];
                zzjj zzjjVar2 = null;
                int i52 = 0;
                int i53 = -1;
                int i54 = -1;
                while (i52 < zzsVarZzb2.zzb) {
                    zzq zzqVarZza3 = zzsVarZzb2.zza(i52);
                    int[] iArr11 = iArr10[i52];
                    int i55 = i53;
                    int i56 = 0;
                    while (true) {
                        int i57 = zzqVarZza3.zza;
                        if (i56 <= 0) {
                            int i58 = i54;
                            if (zzf(iArr11[i56], zzjnVar.zzK)) {
                                zzqVar = zzqVarZza3;
                                zzjj zzjjVar3 = new zzjj(zzqVarZza3.zza(i56), zzjnVar, iArr11[i56]);
                                if (zzjjVar2 == null || zzjjVar3.zza(zzjjVar2) > 0) {
                                    i55 = i52;
                                    zzjjVar2 = zzjjVar3;
                                    i54 = i56;
                                }
                                i56++;
                                zzqVarZza3 = zzqVar;
                            } else {
                                zzqVar = zzqVarZza3;
                            }
                            i54 = i58;
                            i56++;
                            zzqVarZza3 = zzqVar;
                        }
                    }
                    i52++;
                    i53 = i55;
                }
                if (i53 == -1) {
                    pairCreate2 = null;
                } else {
                    zzq zzqVarZza4 = zzsVarZzb2.zza(i53);
                    boolean z13 = zzjnVar.zzx;
                    boolean z14 = zzjnVar.zzw;
                    if (z12) {
                        int[] iArr12 = iArr10[i53];
                        int i59 = zzjnVar.zzr;
                        boolean z15 = zzjnVar.zzH;
                        boolean z16 = zzjnVar.zzI;
                        boolean z17 = zzjnVar.zzJ;
                        zzafv zzafvVarZza3 = zzqVarZza4.zza(i54);
                        int i60 = zzqVarZza4.zza;
                        int[] iArr13 = new int[1];
                        int i61 = 0;
                        int i62 = 0;
                        while (true) {
                            int i63 = zzqVarZza4.zza;
                            if (i61 > 0) {
                                break;
                            }
                            if (i61 != i54) {
                                zzafv zzafvVarZza4 = zzqVarZza4.zza(i61);
                                iArr6 = iArr12;
                                if (!zzf(iArr12[i61], false) || zzafvVarZza4.zzh == -1 || (i2 = zzafvVarZza4.zzy) == -1 || i2 != zzafvVarZza3.zzy || (str = zzafvVarZza4.zzl) == null || !TextUtils.equals(str, zzafvVarZza3.zzl) || (i3 = zzafvVarZza4.zzz) == -1 || i3 != zzafvVarZza3.zzz) {
                                }
                                i61++;
                                iArr12 = iArr6;
                            } else {
                                iArr6 = iArr12;
                            }
                            iArr13[i62] = i61;
                            i62++;
                            i61++;
                            iArr12 = iArr6;
                        }
                        int[] iArrCopyOf = Arrays.copyOf(iArr13, i62);
                        if (iArrCopyOf.length > 1) {
                            i = 0;
                            zzjuVar = new zzju(zzqVarZza4, iArrCopyOf, 0);
                        } else {
                            i = 0;
                            zzjuVar = null;
                        }
                    } else {
                        i = 0;
                        zzjuVar = null;
                    }
                    if (zzjuVar == null) {
                        zzjuVar = new zzju(zzqVarZza4, new int[]{i54}, i);
                    }
                    zzjjVar2.getClass();
                    pairCreate2 = Pair.create(zzjuVar, zzjjVar2);
                }
                if (pairCreate2 != null && (zzjjVar == null || ((zzjj) pairCreate2.second).zza(zzjjVar) > 0)) {
                    if (i49 != -1) {
                        zzjuVarArr5[i49] = null;
                    }
                    zzju zzjuVar3 = (zzju) pairCreate2.first;
                    zzjuVarArr5[i50] = zzjuVar3;
                    str2 = zzjuVar3.zza.zza(zzjuVar3.zzb[0]).zzc;
                    zzjjVar = (zzjj) pairCreate2.second;
                    i49 = i50;
                }
            }
            i50++;
            i48 = 2;
        }
        zzjr zzjrVar = null;
        int i64 = -1;
        int i65 = 0;
        while (i65 < i48) {
            int iZza = zzjwVar3.zza(i65);
            if (iZza != 1 && iZza != i48) {
                if (iZza != 3) {
                    zzs zzsVarZzb3 = zzjwVar3.zzb(i65);
                    int[][] iArr14 = iArr[i65];
                    zzq zzqVar3 = null;
                    zzjl zzjlVar = null;
                    int i66 = 0;
                    for (int i67 = 0; i67 < zzsVarZzb3.zzb; i67++) {
                        zzq zzqVarZza5 = zzsVarZzb3.zza(i67);
                        int[] iArr15 = iArr14[i67];
                        int i68 = 0;
                        while (true) {
                            int i69 = zzqVarZza5.zza;
                            if (i68 <= 0) {
                                zzs zzsVar2 = zzsVarZzb3;
                                if (zzf(iArr15[i68], zzjnVar.zzK)) {
                                    iArr5 = iArr14;
                                    zzjl zzjlVar2 = new zzjl(zzqVarZza5.zza(i68), iArr15[i68]);
                                    if (zzjlVar == null || zzjlVar2.compareTo(zzjlVar) > 0) {
                                        zzqVar3 = zzqVarZza5;
                                        i66 = i68;
                                        zzjlVar = zzjlVar2;
                                    }
                                } else {
                                    iArr5 = iArr14;
                                }
                                i68++;
                                zzsVarZzb3 = zzsVar2;
                                iArr14 = iArr5;
                            }
                        }
                    }
                    zzjuVarArr5[i65] = zzqVar3 == null ? null : new zzju(zzqVar3, new int[]{i66}, 0);
                } else {
                    zzs zzsVarZzb4 = zzjwVar3.zzb(i65);
                    int[][] iArr16 = iArr[i65];
                    zzq zzqVar4 = null;
                    zzjr zzjrVar2 = null;
                    int i70 = -1;
                    for (int i71 = 0; i71 < zzsVarZzb4.zzb; i71++) {
                        zzq zzqVarZza6 = zzsVarZzb4.zza(i71);
                        int[] iArr17 = iArr16[i71];
                        int i72 = 0;
                        while (true) {
                            int i73 = zzqVarZza6.zza;
                            if (i72 <= 0) {
                                zzs zzsVar3 = zzsVarZzb4;
                                if (zzf(iArr17[i72], zzjnVar.zzK)) {
                                    iArr4 = iArr16;
                                    zzjr zzjrVar3 = new zzjr(zzqVarZza6.zza(i72), zzjnVar, iArr17[i72], str2);
                                    if (zzjrVar3.zza && (zzjrVar2 == null || zzjrVar3.compareTo(zzjrVar2) > 0)) {
                                        zzqVar4 = zzqVarZza6;
                                        i70 = i72;
                                        zzjrVar2 = zzjrVar3;
                                    }
                                } else {
                                    iArr4 = iArr16;
                                }
                                i72++;
                                zzsVarZzb4 = zzsVar3;
                                iArr16 = iArr4;
                            }
                        }
                    }
                    if (zzqVar4 == null) {
                        pairCreate = null;
                    } else {
                        zzju zzjuVar4 = new zzju(zzqVar4, new int[]{i70}, 0);
                        zzjrVar2.getClass();
                        pairCreate = Pair.create(zzjuVar4, zzjrVar2);
                    }
                    if (pairCreate != null && (zzjrVar == null || ((zzjr) pairCreate.second).compareTo(zzjrVar) > 0)) {
                        if (i64 != -1) {
                            zzjuVarArr5[i64] = null;
                        }
                        zzjuVarArr5[i65] = (zzju) pairCreate.first;
                        zzjrVar = (zzjr) pairCreate.second;
                        i64 = i65;
                    }
                }
            }
            i65++;
            i48 = 2;
        }
        int i74 = 0;
        for (int i75 = i48; i74 < i75; i75 = 2) {
            int iZza2 = zzjwVar3.zza(i74);
            if (zzjnVar.zzd(i74) || zzjnVar.zzy.contains(Integer.valueOf(iZza2))) {
                zzjuVarArr5[i74] = null;
            } else {
                zzs zzsVarZzb5 = zzjwVar3.zzb(i74);
                if (zzjnVar.zze(i74, zzsVarZzb5)) {
                    zzjuVarArr5[i74] = zzjnVar.zzf(i74, zzsVarZzb5) == null ? null : new zzju(zzsVarZzb5.zza(0), null, 0);
                }
            }
            i74++;
        }
        zzjd zzjdVar = this.zze;
        zzki zzkiVarZzm = zzm();
        zzfoj<zzfoj<zzjc>> zzfojVarZza = zzje.zza(zzjuVarArr5);
        int i76 = 2;
        zzjg[] zzjgVarArr = new zzjg[2];
        int i77 = 0;
        while (i77 < i76) {
            zzju zzjuVar5 = zzjuVarArr5[i77];
            if (zzjuVar5 != null && (length = (iArr3 = zzjuVar5.zzb).length) != 0) {
                zzjgVarArr[i77] = length == 1 ? new zzjv(zzjuVar5.zza, iArr3[0], 0, 0, null) : zzjdVar.zza(zzjuVar5.zza, iArr3, 0, zzkiVarZzm, zzfojVarZza.get(i77));
            }
            i77++;
            i76 = 2;
        }
        zzahx[] zzahxVarArr = new zzahx[i76];
        for (int i78 = 0; i78 < i76; i78++) {
            zzahxVarArr[i78] = (zzjnVar.zzd(i78) || zzjnVar.zzy.contains(Integer.valueOf(zzjwVar3.zza(i78))) || (zzjwVar3.zza(i78) != -2 && zzjgVarArr[i78] == null)) ? null : zzahx.zza;
        }
        boolean z18 = zzjnVar.zzL;
        return Pair.create(zzahxVarArr, zzjgVarArr);
    }

    public zzjt(Context context) {
        zzjd zzjdVar = new zzjd();
        zzjn zzjnVarZzc = zzjn.zzc(context);
        this.zze = zzjdVar;
        this.zzd = new AtomicReference<>(zzjnVarZzc);
    }
}
