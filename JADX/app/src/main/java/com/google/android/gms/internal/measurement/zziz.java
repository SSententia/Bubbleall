package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zziz<T> implements zzjh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzkf.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zziw zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzik zzm;
    private final zzjv<?, ?> zzn;
    private final zzhe<?> zzo;
    private final zzjb zzp;
    private final zzir zzq;

    /* JADX WARN: Multi-variable type inference failed */
    private zziz(int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, zziw zziwVar, boolean z, boolean z2, int[] iArr3, int i3, int i4, zzjb zzjbVar, zzik zzikVar, zzjv<?, ?> zzjvVar, zzhe<?> zzheVar, zzir zzirVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i;
        this.zzi = zziwVar;
        boolean z3 = false;
        if (zzjvVar != 0 && zzjvVar.zza(i2)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = z2;
        this.zzk = iArr3;
        this.zzl = i3;
        this.zzp = i4;
        this.zzm = zzjbVar;
        this.zzn = zzikVar;
        this.zzo = zzjvVar;
        this.zzg = i2;
        this.zzq = zzheVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static <T> double zzD(T t, long j) {
        return ((Double) zzkf.zzn(t, j)).doubleValue();
    }

    private static <T> float zzE(T t, long j) {
        return ((Float) zzkf.zzn(t, j)).floatValue();
    }

    private static <T> int zzF(T t, long j) {
        return ((Integer) zzkf.zzn(t, j)).intValue();
    }

    private static <T> long zzG(T t, long j) {
        return ((Long) zzkf.zzn(t, j)).longValue();
    }

    private static <T> boolean zzH(T t, long j) {
        return ((Boolean) zzkf.zzn(t, j)).booleanValue();
    }

    private final boolean zzI(T t, T t2, int i) {
        return zzK(t, i) == zzK(t2, i);
    }

    private final boolean zzJ(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzK(t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zzK(T t, int i) {
        int iZzB = zzB(i);
        long j = iZzB & 1048575;
        if (j != 1048575) {
            return (zzkf.zzd(t, j) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i);
        long j2 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return zzkf.zzl(t, j2) != 0.0d;
            case 1:
                return zzkf.zzj(t, j2) != 0.0f;
            case 2:
                return zzkf.zzf(t, j2) != 0;
            case 3:
                return zzkf.zzf(t, j2) != 0;
            case 4:
                return zzkf.zzd(t, j2) != 0;
            case 5:
                return zzkf.zzf(t, j2) != 0;
            case 6:
                return zzkf.zzd(t, j2) != 0;
            case 7:
                return zzkf.zzh(t, j2);
            case 8:
                Object objZzn = zzkf.zzn(t, j2);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzgr) {
                    return !zzgr.zzb.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzkf.zzn(t, j2) != null;
            case 10:
                return !zzgr.zzb.equals(zzkf.zzn(t, j2));
            case 11:
                return zzkf.zzd(t, j2) != 0;
            case 12:
                return zzkf.zzd(t, j2) != 0;
            case 13:
                return zzkf.zzd(t, j2) != 0;
            case 14:
                return zzkf.zzf(t, j2) != 0;
            case 15:
                return zzkf.zzd(t, j2) != 0;
            case 16:
                return zzkf.zzf(t, j2) != 0;
            case 17:
                return zzkf.zzn(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzL(T t, int i) {
        int iZzB = zzB(i);
        long j = 1048575 & iZzB;
        if (j == 1048575) {
            return;
        }
        zzkf.zze(t, j, (1 << (iZzB >>> 20)) | zzkf.zzd(t, j));
    }

    private final boolean zzM(T t, int i, int i2) {
        return zzkf.zzd(t, (long) (zzB(i2) & 1048575)) == i;
    }

    private final void zzN(T t, int i, int i2) {
        zzkf.zze(t, zzB(i2) & 1048575, i);
    }

    private final int zzO(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzQ(i, 0);
    }

    private final int zzP(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzQ(i, i2);
    }

    private final int zzQ(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzR(T t, zzgz zzgzVar) throws IOException {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzo.zzb(t);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iZzA = zzA(i4);
            int i6 = this.zzc[i4];
            int iZzC = zzC(iZzA);
            if (iZzC <= 17) {
                int i7 = this.zzc[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(t, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iZzA & i2;
            switch (iZzC) {
                case 0:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzf(i6, zzkf.zzl(t, j));
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        zzgzVar.zze(i6, zzkf.zzj(t, j));
                    }
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzc(i6, unsafe.getLong(t, j));
                    }
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzh(i6, unsafe.getLong(t, j));
                    }
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzi(i6, unsafe.getInt(t, j));
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzj(i6, unsafe.getLong(t, j));
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzk(i6, unsafe.getInt(t, j));
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzl(i6, zzkf.zzh(t, j));
                    }
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        zzT(i6, unsafe.getObject(t, j), zzgzVar);
                    }
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzr(i6, unsafe.getObject(t, j), zzv(i4));
                    }
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzn(i6, (zzgr) unsafe.getObject(t, j));
                    }
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzo(i6, unsafe.getInt(t, j));
                    }
                    break;
                case 12:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzg(i6, unsafe.getInt(t, j));
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzb(i6, unsafe.getInt(t, j));
                    }
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzd(i6, unsafe.getLong(t, j));
                    }
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzp(i6, unsafe.getInt(t, j));
                    }
                    break;
                case 16:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzq(i6, unsafe.getLong(t, j));
                    }
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        zzgzVar.zzs(i6, unsafe.getObject(t, j), zzv(i4));
                    }
                    break;
                case 18:
                    zzjj.zzJ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 19:
                    zzjj.zzK(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 20:
                    zzjj.zzL(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 21:
                    zzjj.zzM(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 22:
                    zzjj.zzQ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 23:
                    zzjj.zzO(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 24:
                    zzjj.zzT(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 25:
                    zzjj.zzW(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 26:
                    zzjj.zzX(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar);
                    break;
                case 27:
                    zzjj.zzZ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, zzv(i4));
                    break;
                case 28:
                    zzjj.zzY(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    z = false;
                    zzjj.zzR(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 30:
                    z = false;
                    zzjj.zzV(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 31:
                    z = false;
                    zzjj.zzU(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 32:
                    z = false;
                    zzjj.zzP(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 33:
                    z = false;
                    zzjj.zzS(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 34:
                    z = false;
                    zzjj.zzN(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, false);
                    break;
                case 35:
                    zzjj.zzJ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 36:
                    zzjj.zzK(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 37:
                    zzjj.zzL(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 38:
                    zzjj.zzM(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 39:
                    zzjj.zzQ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 40:
                    zzjj.zzO(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 41:
                    zzjj.zzT(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 42:
                    zzjj.zzW(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 43:
                    zzjj.zzR(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 44:
                    zzjj.zzV(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 45:
                    zzjj.zzU(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 46:
                    zzjj.zzP(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 47:
                    zzjj.zzS(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case 48:
                    zzjj.zzN(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzjj.zzaa(this.zzc[i4], (List) unsafe.getObject(t, j), zzgzVar, zzv(i4));
                    break;
                case 50:
                    zzS(zzgzVar, i6, unsafe.getObject(t, j), i4);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzf(i6, zzD(t, j));
                    }
                    break;
                case 52:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zze(i6, zzE(t, j));
                    }
                    break;
                case 53:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzc(i6, zzG(t, j));
                    }
                    break;
                case 54:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzh(i6, zzG(t, j));
                    }
                    break;
                case 55:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzi(i6, zzF(t, j));
                    }
                    break;
                case 56:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzj(i6, zzG(t, j));
                    }
                    break;
                case 57:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzk(i6, zzF(t, j));
                    }
                    break;
                case 58:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzl(i6, zzH(t, j));
                    }
                    break;
                case 59:
                    if (zzM(t, i6, i4)) {
                        zzT(i6, unsafe.getObject(t, j), zzgzVar);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzr(i6, unsafe.getObject(t, j), zzv(i4));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzn(i6, (zzgr) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzo(i6, zzF(t, j));
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzg(i6, zzF(t, j));
                    }
                    break;
                case 64:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzb(i6, zzF(t, j));
                    }
                    break;
                case 65:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzd(i6, zzG(t, j));
                    }
                    break;
                case 66:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzp(i6, zzF(t, j));
                    }
                    break;
                case 67:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzq(i6, zzG(t, j));
                    }
                    break;
                case 68:
                    if (zzM(t, i6, i4)) {
                        zzgzVar.zzs(i6, unsafe.getObject(t, j), zzv(i4));
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzjv<?, ?> zzjvVar = this.zzn;
        zzjvVar.zzi(zzjvVar.zzd(t), zzgzVar);
    }

    private final <K, V> void zzS(zzgz zzgzVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzT(int i, Object obj, zzgz zzgzVar) throws IOException {
        if (obj instanceof String) {
            zzgzVar.zzm(i, (String) obj);
        } else {
            zzgzVar.zzn(i, (zzgr) obj);
        }
    }

    static zzjw zzf(Object obj) {
        zzhr zzhrVar = (zzhr) obj;
        zzjw zzjwVar = zzhrVar.zzc;
        if (zzjwVar != zzjw.zza()) {
            return zzjwVar;
        }
        zzjw zzjwVarZzb = zzjw.zzb();
        zzhrVar.zzc = zzjwVarZzb;
        return zzjwVarZzb;
    }

    static <T> zziz<T> zzk(Class<T> cls, zzit zzitVar, zzjb zzjbVar, zzik zzikVar, zzjv<?, ?> zzjvVar, zzhe<?> zzheVar, zzir zzirVar) {
        if (zzitVar instanceof zzjg) {
            return zzl((zzjg) zzitVar, zzjbVar, zzikVar, zzjvVar, zzheVar, zzirVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0261  */
    /* JADX WARN: Code duplicated, block: B:127:0x0279  */
    /* JADX WARN: Code duplicated, block: B:128:0x027c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0330  */
    /* JADX WARN: Code duplicated, block: B:177:0x037f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0389  */
    static <T> zziz<T> zzl(zzjg zzjgVar, zzjb zzjbVar, zzik zzikVar, zzjv<?, ?> zzjvVar, zzhe<?> zzheVar, zzir zzirVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        Object[] objArr;
        int i20;
        int i21;
        Field fieldZzn;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldZzn2;
        int i26;
        Object obj2;
        Field fieldZzn3;
        int i27;
        char cCharAt10;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        boolean z = zzjgVar.zzc() == 2;
        String strZzd = zzjgVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (strZzd.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int iCharAt4 = strZzd.charAt(i);
        if (iCharAt4 >= 55296) {
            int i33 = iCharAt4 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                cCharAt13 = strZzd.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            iCharAt4 = i33 | (cCharAt13 << i34);
            i32 = i30;
        }
        if (iCharAt4 == 0) {
            iCharAt = 0;
            i5 = 0;
            iCharAt2 = 0;
            i4 = 0;
            iCharAt3 = 0;
            i2 = 0;
            iArr = zza;
            i3 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt5 = strZzd.charAt(i32);
            if (iCharAt5 >= 55296) {
                int i36 = iCharAt5 & 8191;
                int i37 = 13;
                while (true) {
                    i13 = i35 + 1;
                    cCharAt8 = strZzd.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i13;
                }
                iCharAt5 = i36 | (cCharAt8 << i37);
                i35 = i13;
            }
            int i38 = i35 + 1;
            int iCharAt6 = strZzd.charAt(i35);
            if (iCharAt6 >= 55296) {
                int i39 = iCharAt6 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    cCharAt7 = strZzd.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                iCharAt6 = i39 | (cCharAt7 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            iCharAt = strZzd.charAt(i38);
            if (iCharAt >= 55296) {
                int i42 = iCharAt & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    cCharAt6 = strZzd.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                iCharAt = i42 | (cCharAt6 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            int iCharAt7 = strZzd.charAt(i41);
            if (iCharAt7 >= 55296) {
                int i45 = iCharAt7 & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    cCharAt5 = strZzd.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                iCharAt7 = i45 | (cCharAt5 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            iCharAt2 = strZzd.charAt(i44);
            if (iCharAt2 >= 55296) {
                int i48 = iCharAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    cCharAt4 = strZzd.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                iCharAt2 = i48 | (cCharAt4 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int iCharAt8 = strZzd.charAt(i47);
            if (iCharAt8 >= 55296) {
                int i51 = iCharAt8 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    cCharAt3 = strZzd.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                iCharAt8 = i51 | (cCharAt3 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            int iCharAt9 = strZzd.charAt(i50);
            if (iCharAt9 >= 55296) {
                int i54 = iCharAt9 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    cCharAt2 = strZzd.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                iCharAt9 = i54 | (cCharAt2 << i55);
                i53 = i7;
            }
            int i56 = i53 + 1;
            iCharAt3 = strZzd.charAt(i53);
            if (iCharAt3 >= 55296) {
                int i57 = iCharAt3 & 8191;
                int i58 = 13;
                while (true) {
                    i6 = i56 + 1;
                    cCharAt = strZzd.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i6;
                }
                iCharAt3 = i57 | (cCharAt << i58);
                i56 = i6;
            }
            iArr = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i2 = iCharAt5 + iCharAt5 + iCharAt6;
            i3 = iCharAt5;
            i32 = i56;
            int i59 = iCharAt8;
            i4 = iCharAt7;
            i5 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzjgVar.zze();
        Class<?> cls = zzjgVar.zzb().getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr2 = new Object[iCharAt2 + iCharAt2];
        int i60 = iCharAt3 + i5;
        int i61 = iCharAt3;
        int i62 = i60;
        int i63 = 0;
        int i64 = 0;
        while (i32 < length) {
            int i65 = i32 + 1;
            int iCharAt10 = strZzd.charAt(i32);
            if (iCharAt10 >= c) {
                int i66 = iCharAt10 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i29 = i67 + 1;
                    cCharAt12 = strZzd.charAt(i67);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i66 |= (cCharAt12 & 8191) << i68;
                    i68 += 13;
                    i67 = i29;
                }
                iCharAt10 = i66 | (cCharAt12 << i68);
                i14 = i29;
            } else {
                i14 = i65;
            }
            int i69 = i14 + 1;
            int iCharAt11 = strZzd.charAt(i14);
            if (iCharAt11 >= c) {
                int i70 = iCharAt11 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    cCharAt11 = strZzd.charAt(i71);
                    i15 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i70 |= (cCharAt11 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                    length = i15;
                }
                iCharAt11 = i70 | (cCharAt11 << i72);
                i16 = i28;
            } else {
                i15 = length;
                i16 = i69;
            }
            int i73 = iCharAt11 & 255;
            int i74 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            if (i73 >= 51) {
                int i75 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i27 = i77 + 1;
                        cCharAt10 = strZzd.charAt(i77);
                        i18 = i4;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i76 |= (cCharAt10 & 8191) << i78;
                        i78 += 13;
                        i77 = i27;
                        i4 = i18;
                    }
                    iCharAt12 = i76 | (cCharAt10 << i78);
                    i23 = i27;
                } else {
                    i18 = i4;
                    i23 = i75;
                }
                int i79 = i73 - 51;
                int i80 = i23;
                if (i79 == 9 || i79 == 17) {
                    int i81 = i63 / 3;
                    i24 = i2 + 1;
                    objArr2[i81 + i81 + 1] = objArrZze[i2];
                } else {
                    if (i79 == 12 && !z) {
                        int i82 = i63 / 3;
                        i24 = i2 + 1;
                        objArr2[i82 + i82 + 1] = objArrZze[i2];
                    }
                    i25 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i25];
                    if (obj instanceof Field) {
                        fieldZzn2 = (Field) obj;
                    } else {
                        fieldZzn2 = zzn(cls, (String) obj);
                        objArrZze[i25] = fieldZzn2;
                    }
                    iArr2 = iArr3;
                    i17 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzn2);
                    i26 = i25 + 1;
                    obj2 = objArrZze[i26];
                    if (obj2 instanceof Field) {
                        fieldZzn3 = (Field) obj2;
                    } else {
                        fieldZzn3 = zzn(cls, (String) obj2);
                        objArrZze[i26] = fieldZzn3;
                    }
                    strZzd = strZzd;
                    objArr = objArr2;
                    i19 = i2;
                    i20 = i80;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i21 = 0;
                }
                i2 = i24;
                i25 = iCharAt12 + iCharAt12;
                obj = objArrZze[i25];
                if (obj instanceof Field) {
                    fieldZzn2 = (Field) obj;
                } else {
                    fieldZzn2 = zzn(cls, (String) obj);
                    objArrZze[i25] = fieldZzn2;
                }
                iArr2 = iArr3;
                i17 = iCharAt;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzn2);
                i26 = i25 + 1;
                obj2 = objArrZze[i26];
                if (obj2 instanceof Field) {
                    fieldZzn3 = (Field) obj2;
                } else {
                    fieldZzn3 = zzn(cls, (String) obj2);
                    objArrZze[i26] = fieldZzn3;
                }
                strZzd = strZzd;
                objArr = objArr2;
                i19 = i2;
                i20 = i80;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i21 = 0;
            } else {
                iArr2 = iArr3;
                i17 = iCharAt;
                i18 = i4;
                int i83 = i2 + 1;
                Field fieldZzn4 = zzn(cls, (String) objArrZze[i2]);
                if (i73 == 9 || i73 == 17) {
                    int i84 = i63 / 3;
                    objArr2[i84 + i84 + 1] = fieldZzn4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        int i85 = i63 / 3;
                        i22 = i2 + 2;
                        objArr2[i85 + i85 + 1] = objArrZze[i83];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            int i86 = i63 / 3;
                            i22 = i2 + 2;
                            objArr2[i86 + i86 + 1] = objArrZze[i83];
                        }
                    } else if (i73 == 50) {
                        int i87 = i61 + 1;
                        iArr[i61] = i63;
                        int i88 = i63 / 3;
                        int i89 = i88 + i88;
                        int i90 = i2 + 2;
                        objArr2[i89] = objArrZze[i83];
                        if ((iCharAt11 & 2048) != 0) {
                            i83 = i2 + 3;
                            objArr2[i89 + 1] = objArrZze[i90];
                            i61 = i87;
                        } else {
                            i61 = i87;
                            i19 = i90;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                        iObjectFieldOffset2 = 1048575;
                        objArr = objArr2;
                        if ((iCharAt11 & 4096) == 4096 || i73 > 17) {
                            i20 = i16;
                            i21 = 0;
                        } else {
                            int i91 = i16 + 1;
                            int iCharAt13 = strZzd.charAt(i16);
                            if (iCharAt13 >= 55296) {
                                int i92 = iCharAt13 & 8191;
                                int i93 = 13;
                                while (true) {
                                    i20 = i91 + 1;
                                    cCharAt9 = strZzd.charAt(i91);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i92 |= (cCharAt9 & 8191) << i93;
                                    i93 += 13;
                                    i91 = i20;
                                }
                                iCharAt13 = i92 | (cCharAt9 << i93);
                            } else {
                                i20 = i91;
                            }
                            int i94 = i3 + i3 + (iCharAt13 / 32);
                            Object obj3 = objArrZze[i94];
                            if (obj3 instanceof Field) {
                                fieldZzn = (Field) obj3;
                            } else {
                                fieldZzn = zzn(cls, (String) obj3);
                                objArrZze[i94] = fieldZzn;
                            }
                            i21 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn);
                        }
                        if (i73 >= 18 && i73 <= 49) {
                            iArr[i62] = iObjectFieldOffset;
                            i62++;
                        }
                    }
                    i19 = i22;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                    iObjectFieldOffset2 = 1048575;
                    objArr = objArr2;
                    if ((iCharAt11 & 4096) == 4096) {
                        i20 = i16;
                        i21 = 0;
                    } else {
                        i20 = i16;
                        i21 = 0;
                    }
                    if (i73 >= 18) {
                        iArr[i62] = iObjectFieldOffset;
                        i62++;
                    }
                }
                i19 = i83;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                iObjectFieldOffset2 = 1048575;
                objArr = objArr2;
                if ((iCharAt11 & 4096) == 4096) {
                    i20 = i16;
                    i21 = 0;
                } else {
                    i20 = i16;
                    i21 = 0;
                }
                if (i73 >= 18) {
                    iArr[i62] = iObjectFieldOffset;
                    i62++;
                }
            }
            int i95 = i63 + 1;
            iArr2[i63] = iCharAt10;
            int i96 = i63 + 2;
            iArr2[i95] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i73 << 20) | iObjectFieldOffset;
            i63 += 3;
            iArr2[i96] = (i21 << 20) | iObjectFieldOffset2;
            i2 = i19;
            iCharAt = i17;
            iCharAt3 = i74;
            i32 = i20;
            length = i15;
            objArr2 = objArr;
            strZzd = strZzd;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new zziz<>(iArr3, objArr2, iCharAt, i4, zzjgVar.zzb(), z, false, iArr, iCharAt3, i60, zzjbVar, zzikVar, zzjvVar, zzheVar, zzirVar, null);
    }

    private static Field zzn(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void zzo(T t, T t2, int i) {
        long jZzA = zzA(i) & 1048575;
        if (zzK(t2, i)) {
            Object objZzn = zzkf.zzn(t, jZzA);
            Object objZzn2 = zzkf.zzn(t2, jZzA);
            if (objZzn != null && objZzn2 != null) {
                zzkf.zzo(t, jZzA, zzhz.zzi(objZzn, objZzn2));
                zzL(t, i);
            } else if (objZzn2 != null) {
                zzkf.zzo(t, jZzA, objZzn2);
                zzL(t, i);
            }
        }
    }

    private final void zzp(T t, T t2, int i) {
        int iZzA = zzA(i);
        int i2 = this.zzc[i];
        long j = iZzA & 1048575;
        if (zzM(t2, i2, i)) {
            Object objZzn = zzM(t, i2, i) ? zzkf.zzn(t, j) : null;
            Object objZzn2 = zzkf.zzn(t2, j);
            if (objZzn != null && objZzn2 != null) {
                zzkf.zzo(t, j, zzhz.zzi(objZzn, objZzn2));
                zzN(t, i2, i);
            } else if (objZzn2 != null) {
                zzkf.zzo(t, j, objZzn2);
                zzN(t, i2, i);
            }
        }
    }

    private final int zzq(T t) {
        int i;
        int iZzw;
        int iZzw2;
        int iZzw3;
        int iZzx;
        int iZzw4;
        int iZzv;
        int iZzw5;
        int iZzw6;
        int iZzc;
        int iZzw7;
        int iZzw8;
        int iZzu;
        int iZzw9;
        int i2;
        Unsafe unsafe = zzb;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int iZzA = zzA(i6);
            int i7 = this.zzc[i6];
            int iZzC = zzC(iZzA);
            if (iZzC <= 17) {
                int i8 = this.zzc[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i5) {
                    i4 = unsafe.getInt(t, i9);
                    i5 = i9;
                }
            } else {
                i = 0;
            }
            long j = iZzA & 1048575;
            switch (iZzC) {
                case 0:
                    if ((i4 & i) != 0) {
                        iZzw = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw + 8;
                        i3 += iZzw8;
                    }
                    break;
                case 1:
                    if ((i4 & i) != 0) {
                        iZzw2 = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw2 + 4;
                        i3 += iZzw8;
                    }
                    break;
                case 2:
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        iZzw3 = zzgy.zzw(i7 << 3);
                        iZzx = zzgy.zzx(j2);
                        iZzw8 = iZzw3 + iZzx;
                        i3 += iZzw8;
                    }
                    break;
                case 3:
                    if ((i4 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        iZzw3 = zzgy.zzw(i7 << 3);
                        iZzx = zzgy.zzx(j3);
                        iZzw8 = iZzw3 + iZzx;
                        i3 += iZzw8;
                    }
                    break;
                case 4:
                    if ((i4 & i) != 0) {
                        int i10 = unsafe.getInt(t, j);
                        iZzw4 = zzgy.zzw(i7 << 3);
                        iZzv = zzgy.zzv(i10);
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 5:
                    if ((i4 & i) != 0) {
                        iZzw = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw + 8;
                        i3 += iZzw8;
                    }
                    break;
                case 6:
                    if ((i4 & i) != 0) {
                        iZzw2 = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw2 + 4;
                        i3 += iZzw8;
                    }
                    break;
                case 7:
                    if ((i4 & i) != 0) {
                        iZzw5 = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw5 + 1;
                        i3 += iZzw8;
                    }
                    break;
                case 8:
                    if ((i4 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zzgr) {
                            iZzw6 = zzgy.zzw(i7 << 3);
                            iZzc = ((zzgr) object).zzc();
                            iZzw7 = zzgy.zzw(iZzc);
                            i2 = iZzw6 + iZzw7 + iZzc;
                            i3 += i2;
                        } else {
                            iZzw4 = zzgy.zzw(i7 << 3);
                            iZzv = zzgy.zzy((String) object);
                            i2 = iZzw4 + iZzv;
                            i3 += i2;
                        }
                    }
                    break;
                case 9:
                    if ((i4 & i) != 0) {
                        iZzw8 = zzjj.zzw(i7, unsafe.getObject(t, j), zzv(i6));
                        i3 += iZzw8;
                    }
                    break;
                case 10:
                    if ((i4 & i) != 0) {
                        zzgr zzgrVar = (zzgr) unsafe.getObject(t, j);
                        iZzw6 = zzgy.zzw(i7 << 3);
                        iZzc = zzgrVar.zzc();
                        iZzw7 = zzgy.zzw(iZzc);
                        i2 = iZzw6 + iZzw7 + iZzc;
                        i3 += i2;
                    }
                    break;
                case 11:
                    if ((i4 & i) != 0) {
                        int i11 = unsafe.getInt(t, j);
                        iZzw4 = zzgy.zzw(i7 << 3);
                        iZzv = zzgy.zzw(i11);
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 12:
                    if ((i4 & i) != 0) {
                        int i12 = unsafe.getInt(t, j);
                        iZzw4 = zzgy.zzw(i7 << 3);
                        iZzv = zzgy.zzv(i12);
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 13:
                    if ((i4 & i) != 0) {
                        iZzw2 = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw2 + 4;
                        i3 += iZzw8;
                    }
                    break;
                case 14:
                    if ((i4 & i) != 0) {
                        iZzw = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw + 8;
                        i3 += iZzw8;
                    }
                    break;
                case 15:
                    if ((i4 & i) != 0) {
                        int i13 = unsafe.getInt(t, j);
                        iZzw4 = zzgy.zzw(i7 << 3);
                        iZzv = zzgy.zzw((i13 >> 31) ^ (i13 + i13));
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 16:
                    if ((i4 & i) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        iZzw4 = zzgy.zzw(i7 << 3);
                        iZzv = zzgy.zzx((j4 >> 63) ^ (j4 + j4));
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 17:
                    if ((i4 & i) != 0) {
                        iZzw8 = zzgy.zzE(i7, (zziw) unsafe.getObject(t, j), zzv(i6));
                        i3 += iZzw8;
                    }
                    break;
                case 18:
                    iZzw8 = zzjj.zzs(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 19:
                    iZzw8 = zzjj.zzq(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 20:
                    iZzw8 = zzjj.zzc(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 21:
                    iZzw8 = zzjj.zze(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 22:
                    iZzw8 = zzjj.zzk(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 23:
                    iZzw8 = zzjj.zzs(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 24:
                    iZzw8 = zzjj.zzq(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 25:
                    iZzw8 = zzjj.zzu(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 26:
                    iZzw8 = zzjj.zzv(i7, (List) unsafe.getObject(t, j));
                    i3 += iZzw8;
                    break;
                case 27:
                    iZzw8 = zzjj.zzx(i7, (List) unsafe.getObject(t, j), zzv(i6));
                    i3 += iZzw8;
                    break;
                case 28:
                    iZzw8 = zzjj.zzy(i7, (List) unsafe.getObject(t, j));
                    i3 += iZzw8;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    iZzw8 = zzjj.zzm(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 30:
                    iZzw8 = zzjj.zzi(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 31:
                    iZzw8 = zzjj.zzq(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 32:
                    iZzw8 = zzjj.zzs(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 33:
                    iZzw8 = zzjj.zzo(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 34:
                    iZzw8 = zzjj.zzg(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw8;
                    break;
                case 35:
                    iZzv = zzjj.zzr((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 36:
                    iZzv = zzjj.zzp((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 37:
                    iZzv = zzjj.zzb((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 38:
                    iZzv = zzjj.zzd((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 39:
                    iZzv = zzjj.zzj((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 40:
                    iZzv = zzjj.zzr((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 41:
                    iZzv = zzjj.zzp((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 42:
                    iZzv = zzjj.zzt((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 43:
                    iZzv = zzjj.zzl((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 44:
                    iZzv = zzjj.zzh((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 45:
                    iZzv = zzjj.zzp((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 46:
                    iZzv = zzjj.zzr((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 47:
                    iZzv = zzjj.zzn((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 48:
                    iZzv = zzjj.zzf((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i7);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    iZzw8 = zzjj.zzz(i7, (List) unsafe.getObject(t, j), zzv(i6));
                    i3 += iZzw8;
                    break;
                case 50:
                    zzir.zza(i7, unsafe.getObject(t, j), zzw(i6));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(t, i7, i6)) {
                        iZzw = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw + 8;
                        i3 += iZzw8;
                    }
                    break;
                case 52:
                    if (zzM(t, i7, i6)) {
                        iZzw2 = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw2 + 4;
                        i3 += iZzw8;
                    }
                    break;
                case 53:
                    if (zzM(t, i7, i6)) {
                        long jZzG = zzG(t, j);
                        iZzw3 = zzgy.zzw(i7 << 3);
                        iZzx = zzgy.zzx(jZzG);
                        iZzw8 = iZzw3 + iZzx;
                        i3 += iZzw8;
                    }
                    break;
                case 54:
                    if (zzM(t, i7, i6)) {
                        long jZzG2 = zzG(t, j);
                        iZzw3 = zzgy.zzw(i7 << 3);
                        iZzx = zzgy.zzx(jZzG2);
                        iZzw8 = iZzw3 + iZzx;
                        i3 += iZzw8;
                    }
                    break;
                case 55:
                    if (zzM(t, i7, i6)) {
                        int iZzF = zzF(t, j);
                        iZzw4 = zzgy.zzw(i7 << 3);
                        iZzv = zzgy.zzv(iZzF);
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 56:
                    if (zzM(t, i7, i6)) {
                        iZzw = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw + 8;
                        i3 += iZzw8;
                    }
                    break;
                case 57:
                    if (zzM(t, i7, i6)) {
                        iZzw2 = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw2 + 4;
                        i3 += iZzw8;
                    }
                    break;
                case 58:
                    if (zzM(t, i7, i6)) {
                        iZzw5 = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw5 + 1;
                        i3 += iZzw8;
                    }
                    break;
                case 59:
                    if (zzM(t, i7, i6)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zzgr) {
                            iZzw6 = zzgy.zzw(i7 << 3);
                            iZzc = ((zzgr) object2).zzc();
                            iZzw7 = zzgy.zzw(iZzc);
                            i2 = iZzw6 + iZzw7 + iZzc;
                            i3 += i2;
                        } else {
                            iZzw4 = zzgy.zzw(i7 << 3);
                            iZzv = zzgy.zzy((String) object2);
                            i2 = iZzw4 + iZzv;
                            i3 += i2;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(t, i7, i6)) {
                        iZzw8 = zzjj.zzw(i7, unsafe.getObject(t, j), zzv(i6));
                        i3 += iZzw8;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(t, i7, i6)) {
                        zzgr zzgrVar2 = (zzgr) unsafe.getObject(t, j);
                        iZzw6 = zzgy.zzw(i7 << 3);
                        iZzc = zzgrVar2.zzc();
                        iZzw7 = zzgy.zzw(iZzc);
                        i2 = iZzw6 + iZzw7 + iZzc;
                        i3 += i2;
                    }
                    break;
                case 62:
                    if (zzM(t, i7, i6)) {
                        int iZzF2 = zzF(t, j);
                        iZzw4 = zzgy.zzw(i7 << 3);
                        iZzv = zzgy.zzw(iZzF2);
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(t, i7, i6)) {
                        int iZzF3 = zzF(t, j);
                        iZzw4 = zzgy.zzw(i7 << 3);
                        iZzv = zzgy.zzv(iZzF3);
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 64:
                    if (zzM(t, i7, i6)) {
                        iZzw2 = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw2 + 4;
                        i3 += iZzw8;
                    }
                    break;
                case 65:
                    if (zzM(t, i7, i6)) {
                        iZzw = zzgy.zzw(i7 << 3);
                        iZzw8 = iZzw + 8;
                        i3 += iZzw8;
                    }
                    break;
                case 66:
                    if (zzM(t, i7, i6)) {
                        int iZzF4 = zzF(t, j);
                        iZzw4 = zzgy.zzw(i7 << 3);
                        iZzv = zzgy.zzw((iZzF4 >> 31) ^ (iZzF4 + iZzF4));
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 67:
                    if (zzM(t, i7, i6)) {
                        long jZzG3 = zzG(t, j);
                        iZzw4 = zzgy.zzw(i7 << 3);
                        iZzv = zzgy.zzx((jZzG3 >> 63) ^ (jZzG3 + jZzG3));
                        i2 = iZzw4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 68:
                    if (zzM(t, i7, i6)) {
                        iZzw8 = zzgy.zzE(i7, (zziw) unsafe.getObject(t, j), zzv(i6));
                        i3 += iZzw8;
                    }
                    break;
            }
        }
        zzjv<?, ?> zzjvVar = this.zzn;
        int iZzh = i3 + zzjvVar.zzh(zzjvVar.zzd(t));
        if (!this.zzh) {
            return iZzh;
        }
        this.zzo.zzb(t);
        throw null;
    }

    private final int zzr(T t) {
        int iZzw;
        int iZzw2;
        int iZzw3;
        int iZzx;
        int iZzw4;
        int iZzv;
        int iZzw5;
        int iZzw6;
        int iZzc;
        int iZzw7;
        int iZzw8;
        int iZzu;
        int iZzw9;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int iZzA = zzA(i3);
            int iZzC = zzC(iZzA);
            int i4 = this.zzc[i3];
            long j = iZzA & 1048575;
            if (iZzC >= zzhj.DOUBLE_LIST_PACKED.zza() && iZzC <= zzhj.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (iZzC) {
                case 0:
                    if (zzK(t, i3)) {
                        iZzw = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw + 8;
                        i2 += iZzw8;
                    }
                    break;
                case 1:
                    if (zzK(t, i3)) {
                        iZzw2 = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw2 + 4;
                        i2 += iZzw8;
                    }
                    break;
                case 2:
                    if (zzK(t, i3)) {
                        long jZzf = zzkf.zzf(t, j);
                        iZzw3 = zzgy.zzw(i4 << 3);
                        iZzx = zzgy.zzx(jZzf);
                        i2 += iZzw3 + iZzx;
                    }
                    break;
                case 3:
                    if (zzK(t, i3)) {
                        long jZzf2 = zzkf.zzf(t, j);
                        iZzw3 = zzgy.zzw(i4 << 3);
                        iZzx = zzgy.zzx(jZzf2);
                        i2 += iZzw3 + iZzx;
                    }
                    break;
                case 4:
                    if (zzK(t, i3)) {
                        int iZzd = zzkf.zzd(t, j);
                        iZzw4 = zzgy.zzw(i4 << 3);
                        iZzv = zzgy.zzv(iZzd);
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 5:
                    if (zzK(t, i3)) {
                        iZzw = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw + 8;
                        i2 += iZzw8;
                    }
                    break;
                case 6:
                    if (zzK(t, i3)) {
                        iZzw2 = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw2 + 4;
                        i2 += iZzw8;
                    }
                    break;
                case 7:
                    if (zzK(t, i3)) {
                        iZzw5 = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw5 + 1;
                        i2 += iZzw8;
                    }
                    break;
                case 8:
                    if (zzK(t, i3)) {
                        Object objZzn = zzkf.zzn(t, j);
                        if (objZzn instanceof zzgr) {
                            iZzw6 = zzgy.zzw(i4 << 3);
                            iZzc = ((zzgr) objZzn).zzc();
                            iZzw7 = zzgy.zzw(iZzc);
                            i = iZzw6 + iZzw7 + iZzc;
                            i2 += i;
                        } else {
                            iZzw4 = zzgy.zzw(i4 << 3);
                            iZzv = zzgy.zzy((String) objZzn);
                            i = iZzw4 + iZzv;
                            i2 += i;
                        }
                    }
                    break;
                case 9:
                    if (zzK(t, i3)) {
                        iZzw8 = zzjj.zzw(i4, zzkf.zzn(t, j), zzv(i3));
                        i2 += iZzw8;
                    }
                    break;
                case 10:
                    if (zzK(t, i3)) {
                        zzgr zzgrVar = (zzgr) zzkf.zzn(t, j);
                        iZzw6 = zzgy.zzw(i4 << 3);
                        iZzc = zzgrVar.zzc();
                        iZzw7 = zzgy.zzw(iZzc);
                        i = iZzw6 + iZzw7 + iZzc;
                        i2 += i;
                    }
                    break;
                case 11:
                    if (zzK(t, i3)) {
                        int iZzd2 = zzkf.zzd(t, j);
                        iZzw4 = zzgy.zzw(i4 << 3);
                        iZzv = zzgy.zzw(iZzd2);
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 12:
                    if (zzK(t, i3)) {
                        int iZzd3 = zzkf.zzd(t, j);
                        iZzw4 = zzgy.zzw(i4 << 3);
                        iZzv = zzgy.zzv(iZzd3);
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 13:
                    if (zzK(t, i3)) {
                        iZzw2 = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw2 + 4;
                        i2 += iZzw8;
                    }
                    break;
                case 14:
                    if (zzK(t, i3)) {
                        iZzw = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw + 8;
                        i2 += iZzw8;
                    }
                    break;
                case 15:
                    if (zzK(t, i3)) {
                        int iZzd4 = zzkf.zzd(t, j);
                        iZzw4 = zzgy.zzw(i4 << 3);
                        iZzv = zzgy.zzw((iZzd4 >> 31) ^ (iZzd4 + iZzd4));
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 16:
                    if (zzK(t, i3)) {
                        long jZzf3 = zzkf.zzf(t, j);
                        iZzw4 = zzgy.zzw(i4 << 3);
                        iZzv = zzgy.zzx((jZzf3 >> 63) ^ (jZzf3 + jZzf3));
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 17:
                    if (zzK(t, i3)) {
                        iZzw8 = zzgy.zzE(i4, (zziw) zzkf.zzn(t, j), zzv(i3));
                        i2 += iZzw8;
                    }
                    break;
                case 18:
                    iZzw8 = zzjj.zzs(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 19:
                    iZzw8 = zzjj.zzq(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 20:
                    iZzw8 = zzjj.zzc(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 21:
                    iZzw8 = zzjj.zze(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 22:
                    iZzw8 = zzjj.zzk(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 23:
                    iZzw8 = zzjj.zzs(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 24:
                    iZzw8 = zzjj.zzq(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 25:
                    iZzw8 = zzjj.zzu(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 26:
                    iZzw8 = zzjj.zzv(i4, (List) zzkf.zzn(t, j));
                    i2 += iZzw8;
                    break;
                case 27:
                    iZzw8 = zzjj.zzx(i4, (List) zzkf.zzn(t, j), zzv(i3));
                    i2 += iZzw8;
                    break;
                case 28:
                    iZzw8 = zzjj.zzy(i4, (List) zzkf.zzn(t, j));
                    i2 += iZzw8;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    iZzw8 = zzjj.zzm(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 30:
                    iZzw8 = zzjj.zzi(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 31:
                    iZzw8 = zzjj.zzq(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 32:
                    iZzw8 = zzjj.zzs(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 33:
                    iZzw8 = zzjj.zzo(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 34:
                    iZzw8 = zzjj.zzg(i4, (List) zzkf.zzn(t, j), false);
                    i2 += iZzw8;
                    break;
                case 35:
                    iZzv = zzjj.zzr((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 36:
                    iZzv = zzjj.zzp((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 37:
                    iZzv = zzjj.zzb((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 38:
                    iZzv = zzjj.zzd((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 39:
                    iZzv = zzjj.zzj((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 40:
                    iZzv = zzjj.zzr((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 41:
                    iZzv = zzjj.zzp((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 42:
                    iZzv = zzjj.zzt((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 43:
                    iZzv = zzjj.zzl((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 44:
                    iZzv = zzjj.zzh((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 45:
                    iZzv = zzjj.zzp((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 46:
                    iZzv = zzjj.zzr((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 47:
                    iZzv = zzjj.zzn((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 48:
                    iZzv = zzjj.zzf((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzu = zzgy.zzu(i4);
                        iZzw9 = zzgy.zzw(iZzv);
                        iZzw4 = iZzu + iZzw9;
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    iZzw8 = zzjj.zzz(i4, (List) zzkf.zzn(t, j), zzv(i3));
                    i2 += iZzw8;
                    break;
                case 50:
                    zzir.zza(i4, zzkf.zzn(t, j), zzw(i3));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(t, i4, i3)) {
                        iZzw = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw + 8;
                        i2 += iZzw8;
                    }
                    break;
                case 52:
                    if (zzM(t, i4, i3)) {
                        iZzw2 = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw2 + 4;
                        i2 += iZzw8;
                    }
                    break;
                case 53:
                    if (zzM(t, i4, i3)) {
                        long jZzG = zzG(t, j);
                        iZzw3 = zzgy.zzw(i4 << 3);
                        iZzx = zzgy.zzx(jZzG);
                        i2 += iZzw3 + iZzx;
                    }
                    break;
                case 54:
                    if (zzM(t, i4, i3)) {
                        long jZzG2 = zzG(t, j);
                        iZzw3 = zzgy.zzw(i4 << 3);
                        iZzx = zzgy.zzx(jZzG2);
                        i2 += iZzw3 + iZzx;
                    }
                    break;
                case 55:
                    if (zzM(t, i4, i3)) {
                        int iZzF = zzF(t, j);
                        iZzw4 = zzgy.zzw(i4 << 3);
                        iZzv = zzgy.zzv(iZzF);
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 56:
                    if (zzM(t, i4, i3)) {
                        iZzw = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw + 8;
                        i2 += iZzw8;
                    }
                    break;
                case 57:
                    if (zzM(t, i4, i3)) {
                        iZzw2 = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw2 + 4;
                        i2 += iZzw8;
                    }
                    break;
                case 58:
                    if (zzM(t, i4, i3)) {
                        iZzw5 = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw5 + 1;
                        i2 += iZzw8;
                    }
                    break;
                case 59:
                    if (zzM(t, i4, i3)) {
                        Object objZzn2 = zzkf.zzn(t, j);
                        if (objZzn2 instanceof zzgr) {
                            iZzw6 = zzgy.zzw(i4 << 3);
                            iZzc = ((zzgr) objZzn2).zzc();
                            iZzw7 = zzgy.zzw(iZzc);
                            i = iZzw6 + iZzw7 + iZzc;
                            i2 += i;
                        } else {
                            iZzw4 = zzgy.zzw(i4 << 3);
                            iZzv = zzgy.zzy((String) objZzn2);
                            i = iZzw4 + iZzv;
                            i2 += i;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(t, i4, i3)) {
                        iZzw8 = zzjj.zzw(i4, zzkf.zzn(t, j), zzv(i3));
                        i2 += iZzw8;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(t, i4, i3)) {
                        zzgr zzgrVar2 = (zzgr) zzkf.zzn(t, j);
                        iZzw6 = zzgy.zzw(i4 << 3);
                        iZzc = zzgrVar2.zzc();
                        iZzw7 = zzgy.zzw(iZzc);
                        i = iZzw6 + iZzw7 + iZzc;
                        i2 += i;
                    }
                    break;
                case 62:
                    if (zzM(t, i4, i3)) {
                        int iZzF2 = zzF(t, j);
                        iZzw4 = zzgy.zzw(i4 << 3);
                        iZzv = zzgy.zzw(iZzF2);
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(t, i4, i3)) {
                        int iZzF3 = zzF(t, j);
                        iZzw4 = zzgy.zzw(i4 << 3);
                        iZzv = zzgy.zzv(iZzF3);
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 64:
                    if (zzM(t, i4, i3)) {
                        iZzw2 = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw2 + 4;
                        i2 += iZzw8;
                    }
                    break;
                case 65:
                    if (zzM(t, i4, i3)) {
                        iZzw = zzgy.zzw(i4 << 3);
                        iZzw8 = iZzw + 8;
                        i2 += iZzw8;
                    }
                    break;
                case 66:
                    if (zzM(t, i4, i3)) {
                        int iZzF4 = zzF(t, j);
                        iZzw4 = zzgy.zzw(i4 << 3);
                        iZzv = zzgy.zzw((iZzF4 >> 31) ^ (iZzF4 + iZzF4));
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 67:
                    if (zzM(t, i4, i3)) {
                        long jZzG3 = zzG(t, j);
                        iZzw4 = zzgy.zzw(i4 << 3);
                        iZzv = zzgy.zzx((jZzG3 >> 63) ^ (jZzG3 + jZzG3));
                        i = iZzw4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 68:
                    if (zzM(t, i4, i3)) {
                        iZzw8 = zzgy.zzE(i4, (zziw) zzkf.zzn(t, j), zzv(i3));
                        i2 += iZzw8;
                    }
                    break;
            }
        }
        zzjv<?, ?> zzjvVar = this.zzn;
        return i2 + zzjvVar.zzh(zzjvVar.zzd(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zzs(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzgf zzgfVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iZza;
        int iZza2 = i;
        Unsafe unsafe = zzb;
        zzhy zzhyVarZze = (zzhy) unsafe.getObject(t, j2);
        if (!zzhyVarZze.zza()) {
            int size = zzhyVarZze.size();
            zzhyVarZze = zzhyVarZze.zze(size == 0 ? 10 : size + size);
            unsafe.putObject(t, j2, zzhyVarZze);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzha zzhaVar = (zzha) zzhyVarZze;
                    int iZza3 = zzgg.zza(bArr, iZza2, zzgfVar);
                    int i12 = zzgfVar.zza + iZza3;
                    while (iZza3 < i12) {
                        zzhaVar.zzd(Double.longBitsToDouble(zzgg.zze(bArr, iZza3)));
                        iZza3 += 8;
                    }
                    if (iZza3 == i12) {
                        return iZza3;
                    }
                    throw zzib.zza();
                }
                if (i5 == 1) {
                    zzha zzhaVar2 = (zzha) zzhyVarZze;
                    zzhaVar2.zzd(Double.longBitsToDouble(zzgg.zze(bArr, i)));
                    while (true) {
                        i8 = iZza2 + 8;
                        if (i8 < i2) {
                            iZza2 = zzgg.zza(bArr, i8, zzgfVar);
                            if (i3 == zzgfVar.zza) {
                                zzhaVar2.zzd(Double.longBitsToDouble(zzgg.zze(bArr, iZza2)));
                            }
                        }
                    }
                    return i8;
                }
                return iZza2;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzhk zzhkVar = (zzhk) zzhyVarZze;
                    int iZza4 = zzgg.zza(bArr, iZza2, zzgfVar);
                    int i13 = zzgfVar.zza + iZza4;
                    while (iZza4 < i13) {
                        zzhkVar.zzd(Float.intBitsToFloat(zzgg.zzd(bArr, iZza4)));
                        iZza4 += 4;
                    }
                    if (iZza4 == i13) {
                        return iZza4;
                    }
                    throw zzib.zza();
                }
                if (i5 == 5) {
                    zzhk zzhkVar2 = (zzhk) zzhyVarZze;
                    zzhkVar2.zzd(Float.intBitsToFloat(zzgg.zzd(bArr, i)));
                    while (true) {
                        i9 = iZza2 + 4;
                        if (i9 < i2) {
                            iZza2 = zzgg.zza(bArr, i9, zzgfVar);
                            if (i3 == zzgfVar.zza) {
                                zzhkVar2.zzd(Float.intBitsToFloat(zzgg.zzd(bArr, iZza2)));
                            }
                        }
                    }
                    return i9;
                }
                return iZza2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzil zzilVar = (zzil) zzhyVarZze;
                    int iZza5 = zzgg.zza(bArr, iZza2, zzgfVar);
                    int i14 = zzgfVar.zza + iZza5;
                    while (iZza5 < i14) {
                        iZza5 = zzgg.zzc(bArr, iZza5, zzgfVar);
                        zzilVar.zzg(zzgfVar.zzb);
                    }
                    if (iZza5 == i14) {
                        return iZza5;
                    }
                    throw zzib.zza();
                }
                if (i5 == 0) {
                    zzil zzilVar2 = (zzil) zzhyVarZze;
                    int iZzc = zzgg.zzc(bArr, iZza2, zzgfVar);
                    zzilVar2.zzg(zzgfVar.zzb);
                    while (iZzc < i2) {
                        int iZza6 = zzgg.zza(bArr, iZzc, zzgfVar);
                        if (i3 != zzgfVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzgg.zzc(bArr, iZza6, zzgfVar);
                        zzilVar2.zzg(zzgfVar.zzb);
                    }
                    return iZzc;
                }
                return iZza2;
            case 22:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzgg.zzl(bArr, iZza2, zzhyVarZze, zzgfVar);
                }
                if (i5 == 0) {
                    return zzgg.zzk(i3, bArr, i, i2, zzhyVarZze, zzgfVar);
                }
                return iZza2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzil zzilVar3 = (zzil) zzhyVarZze;
                    int iZza7 = zzgg.zza(bArr, iZza2, zzgfVar);
                    int i15 = zzgfVar.zza + iZza7;
                    while (iZza7 < i15) {
                        zzilVar3.zzg(zzgg.zze(bArr, iZza7));
                        iZza7 += 8;
                    }
                    if (iZza7 == i15) {
                        return iZza7;
                    }
                    throw zzib.zza();
                }
                if (i5 == 1) {
                    zzil zzilVar4 = (zzil) zzhyVarZze;
                    zzilVar4.zzg(zzgg.zze(bArr, i));
                    while (true) {
                        i10 = iZza2 + 8;
                        if (i10 < i2) {
                            iZza2 = zzgg.zza(bArr, i10, zzgfVar);
                            if (i3 == zzgfVar.zza) {
                                zzilVar4.zzg(zzgg.zze(bArr, iZza2));
                            }
                        }
                    }
                    return i10;
                }
                return iZza2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzhs zzhsVar = (zzhs) zzhyVarZze;
                    int iZza8 = zzgg.zza(bArr, iZza2, zzgfVar);
                    int i16 = zzgfVar.zza + iZza8;
                    while (iZza8 < i16) {
                        zzhsVar.zzh(zzgg.zzd(bArr, iZza8));
                        iZza8 += 4;
                    }
                    if (iZza8 == i16) {
                        return iZza8;
                    }
                    throw zzib.zza();
                }
                if (i5 == 5) {
                    zzhs zzhsVar2 = (zzhs) zzhyVarZze;
                    zzhsVar2.zzh(zzgg.zzd(bArr, i));
                    while (true) {
                        i11 = iZza2 + 4;
                        if (i11 < i2) {
                            iZza2 = zzgg.zza(bArr, i11, zzgfVar);
                            if (i3 == zzgfVar.zza) {
                                zzhsVar2.zzh(zzgg.zzd(bArr, iZza2));
                            }
                        }
                    }
                    return i11;
                }
                return iZza2;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzgh zzghVar = (zzgh) zzhyVarZze;
                    iZza = zzgg.zza(bArr, iZza2, zzgfVar);
                    int i17 = zzgfVar.zza + iZza;
                    while (iZza < i17) {
                        iZza = zzgg.zzc(bArr, iZza, zzgfVar);
                        zzghVar.zzd(zzgfVar.zzb != 0);
                    }
                    if (iZza != i17) {
                        throw zzib.zza();
                    }
                    return iZza;
                }
                if (i5 == 0) {
                    zzgh zzghVar2 = (zzgh) zzhyVarZze;
                    int iZzc2 = zzgg.zzc(bArr, iZza2, zzgfVar);
                    zzghVar2.zzd(zzgfVar.zzb != 0);
                    while (iZzc2 < i2) {
                        int iZza9 = zzgg.zza(bArr, iZzc2, zzgfVar);
                        if (i3 != zzgfVar.zza) {
                            return iZzc2;
                        }
                        iZzc2 = zzgg.zzc(bArr, iZza9, zzgfVar);
                        zzghVar2.zzd(zzgfVar.zzb != 0);
                    }
                    return iZzc2;
                }
                return iZza2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZza10 = zzgg.zza(bArr, iZza2, zzgfVar);
                        int i18 = zzgfVar.zza;
                        if (i18 < 0) {
                            throw zzib.zzb();
                        }
                        if (i18 == 0) {
                            zzhyVarZze.add("");
                        } else {
                            zzhyVarZze.add(new String(bArr, iZza10, i18, zzhz.zza));
                            iZza10 += i18;
                        }
                        while (iZza10 < i2) {
                            int iZza11 = zzgg.zza(bArr, iZza10, zzgfVar);
                            if (i3 != zzgfVar.zza) {
                                return iZza10;
                            }
                            iZza10 = zzgg.zza(bArr, iZza11, zzgfVar);
                            int i19 = zzgfVar.zza;
                            if (i19 < 0) {
                                throw zzib.zzb();
                            }
                            if (i19 == 0) {
                                zzhyVarZze.add("");
                            } else {
                                zzhyVarZze.add(new String(bArr, iZza10, i19, zzhz.zza));
                                iZza10 += i19;
                            }
                        }
                        return iZza10;
                    }
                    int iZza12 = zzgg.zza(bArr, iZza2, zzgfVar);
                    int i20 = zzgfVar.zza;
                    if (i20 < 0) {
                        throw zzib.zzb();
                    }
                    if (i20 == 0) {
                        zzhyVarZze.add("");
                    } else {
                        int i21 = iZza12 + i20;
                        if (!zzkk.zzb(bArr, iZza12, i21)) {
                            throw zzib.zzf();
                        }
                        zzhyVarZze.add(new String(bArr, iZza12, i20, zzhz.zza));
                        iZza12 = i21;
                    }
                    while (iZza12 < i2) {
                        int iZza13 = zzgg.zza(bArr, iZza12, zzgfVar);
                        if (i3 != zzgfVar.zza) {
                            return iZza12;
                        }
                        iZza12 = zzgg.zza(bArr, iZza13, zzgfVar);
                        int i22 = zzgfVar.zza;
                        if (i22 < 0) {
                            throw zzib.zzb();
                        }
                        if (i22 == 0) {
                            zzhyVarZze.add("");
                        } else {
                            int i23 = iZza12 + i22;
                            if (!zzkk.zzb(bArr, iZza12, i23)) {
                                throw zzib.zzf();
                            }
                            zzhyVarZze.add(new String(bArr, iZza12, i22, zzhz.zza));
                            iZza12 = i23;
                        }
                    }
                    return iZza12;
                }
                return iZza2;
            case 27:
                if (i5 == 2) {
                    return zzgg.zzm(zzv(i6), i3, bArr, i, i2, zzhyVarZze, zzgfVar);
                }
                return iZza2;
            case 28:
                if (i5 == 2) {
                    int iZza14 = zzgg.zza(bArr, iZza2, zzgfVar);
                    int i24 = zzgfVar.zza;
                    if (i24 < 0) {
                        throw zzib.zzb();
                    }
                    if (i24 > bArr.length - iZza14) {
                        throw zzib.zza();
                    }
                    if (i24 == 0) {
                        zzhyVarZze.add(zzgr.zzb);
                    } else {
                        zzhyVarZze.add(zzgr.zzj(bArr, iZza14, i24));
                        iZza14 += i24;
                    }
                    while (iZza14 < i2) {
                        int iZza15 = zzgg.zza(bArr, iZza14, zzgfVar);
                        if (i3 != zzgfVar.zza) {
                            return iZza14;
                        }
                        iZza14 = zzgg.zza(bArr, iZza15, zzgfVar);
                        int i25 = zzgfVar.zza;
                        if (i25 < 0) {
                            throw zzib.zzb();
                        }
                        if (i25 > bArr.length - iZza14) {
                            throw zzib.zza();
                        }
                        if (i25 == 0) {
                            zzhyVarZze.add(zzgr.zzb);
                        } else {
                            zzhyVarZze.add(zzgr.zzj(bArr, iZza14, i25));
                            iZza14 += i25;
                        }
                    }
                    return iZza14;
                }
                return iZza2;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZza = zzgg.zzk(i3, bArr, i, i2, zzhyVarZze, zzgfVar);
                    }
                    return iZza2;
                }
                iZza = zzgg.zzl(bArr, iZza2, zzhyVarZze, zzgfVar);
                zzhr zzhrVar = (zzhr) t;
                zzjw zzjwVar = zzhrVar.zzc;
                if (zzjwVar == zzjw.zza()) {
                    zzjwVar = null;
                }
                Object objZzG = zzjj.zzG(i4, zzhyVarZze, zzx(i6), zzjwVar, this.zzn);
                if (objZzG != null) {
                    zzhrVar.zzc = (zzjw) objZzG;
                    return iZza;
                }
                return iZza;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzhs zzhsVar3 = (zzhs) zzhyVarZze;
                    int iZza16 = zzgg.zza(bArr, iZza2, zzgfVar);
                    int i26 = zzgfVar.zza + iZza16;
                    while (iZza16 < i26) {
                        iZza16 = zzgg.zza(bArr, iZza16, zzgfVar);
                        zzhsVar3.zzh(zzgu.zzb(zzgfVar.zza));
                    }
                    if (iZza16 == i26) {
                        return iZza16;
                    }
                    throw zzib.zza();
                }
                if (i5 == 0) {
                    zzhs zzhsVar4 = (zzhs) zzhyVarZze;
                    int iZza17 = zzgg.zza(bArr, iZza2, zzgfVar);
                    zzhsVar4.zzh(zzgu.zzb(zzgfVar.zza));
                    while (iZza17 < i2) {
                        int iZza18 = zzgg.zza(bArr, iZza17, zzgfVar);
                        if (i3 != zzgfVar.zza) {
                            return iZza17;
                        }
                        iZza17 = zzgg.zza(bArr, iZza18, zzgfVar);
                        zzhsVar4.zzh(zzgu.zzb(zzgfVar.zza));
                    }
                    return iZza17;
                }
                return iZza2;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzil zzilVar5 = (zzil) zzhyVarZze;
                    int iZza19 = zzgg.zza(bArr, iZza2, zzgfVar);
                    int i27 = zzgfVar.zza + iZza19;
                    while (iZza19 < i27) {
                        iZza19 = zzgg.zzc(bArr, iZza19, zzgfVar);
                        zzilVar5.zzg(zzgu.zzc(zzgfVar.zzb));
                    }
                    if (iZza19 == i27) {
                        return iZza19;
                    }
                    throw zzib.zza();
                }
                if (i5 == 0) {
                    zzil zzilVar6 = (zzil) zzhyVarZze;
                    int iZzc3 = zzgg.zzc(bArr, iZza2, zzgfVar);
                    zzilVar6.zzg(zzgu.zzc(zzgfVar.zzb));
                    while (iZzc3 < i2) {
                        int iZza20 = zzgg.zza(bArr, iZzc3, zzgfVar);
                        if (i3 != zzgfVar.zza) {
                            return iZzc3;
                        }
                        iZzc3 = zzgg.zzc(bArr, iZza20, zzgfVar);
                        zzilVar6.zzg(zzgu.zzc(zzgfVar.zzb));
                    }
                    return iZzc3;
                }
                return iZza2;
            default:
                if (i5 == 3) {
                    zzjh zzjhVarZzv = zzv(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iZzj = zzgg.zzj(zzjhVarZzv, bArr, i, i2, i28, zzgfVar);
                    zzhyVarZze.add(zzgfVar.zzc);
                    while (iZzj < i2) {
                        int iZza21 = zzgg.zza(bArr, iZzj, zzgfVar);
                        if (i3 != zzgfVar.zza) {
                            return iZzj;
                        }
                        iZzj = zzgg.zzj(zzjhVarZzv, bArr, iZza21, i2, i28, zzgfVar);
                        zzhyVarZze.add(zzgfVar.zzc);
                    }
                    return iZzj;
                }
                return iZza2;
        }
    }

    private final <K, V> int zzt(T t, byte[] bArr, int i, int i2, int i3, long j, zzgf zzgfVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzw = zzw(i3);
        Object object = unsafe.getObject(t, j);
        if (!((zziq) object).zze()) {
            zziq<K, V> zziqVarZzc = zziq.zza().zzc();
            zzir.zzb(zziqVarZzc, object);
            unsafe.putObject(t, j, zziqVarZzc);
        }
        throw null;
    }

    private final int zzu(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgf zzgfVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(zzgg.zze(bArr, i))));
                unsafe.putInt(t, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(zzgg.zzd(bArr, i))));
                unsafe.putInt(t, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iZzc = zzgg.zzc(bArr, i, zzgfVar);
                unsafe.putObject(t, j, Long.valueOf(zzgfVar.zzb));
                unsafe.putInt(t, j2, i4);
                return iZzc;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iZza = zzgg.zza(bArr, i, zzgfVar);
                unsafe.putObject(t, j, Integer.valueOf(zzgfVar.zza));
                unsafe.putInt(t, j2, i4);
                return iZza;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(zzgg.zze(bArr, i)));
                unsafe.putInt(t, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(zzgg.zzd(bArr, i)));
                unsafe.putInt(t, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iZzc2 = zzgg.zzc(bArr, i, zzgfVar);
                unsafe.putObject(t, j, Boolean.valueOf(zzgfVar.zzb != 0));
                unsafe.putInt(t, j2, i4);
                return iZzc2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZza2 = zzgg.zza(bArr, i, zzgfVar);
                int i9 = zzgfVar.zza;
                if (i9 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !zzkk.zzb(bArr, iZza2, iZza2 + i9)) {
                        throw zzib.zzf();
                    }
                    unsafe.putObject(t, j, new String(bArr, iZza2, i9, zzhz.zza));
                    iZza2 += i9;
                }
                unsafe.putInt(t, j2, i4);
                return iZza2;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                int iZzi = zzgg.zzi(zzv(i8), bArr, i, i2, zzgfVar);
                Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, zzgfVar.zzc);
                } else {
                    unsafe.putObject(t, j, zzhz.zzi(object, zzgfVar.zzc));
                }
                unsafe.putInt(t, j2, i4);
                return iZzi;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 != 2) {
                    return i;
                }
                int iZzh = zzgg.zzh(bArr, i, zzgfVar);
                unsafe.putObject(t, j, zzgfVar.zzc);
                unsafe.putInt(t, j2, i4);
                return iZzh;
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int iZza3 = zzgg.zza(bArr, i, zzgfVar);
                int i10 = zzgfVar.zza;
                zzhv zzhvVarZzx = zzx(i8);
                if (zzhvVarZzx == null || zzhvVarZzx.zza(i10)) {
                    unsafe.putObject(t, j, Integer.valueOf(i10));
                    unsafe.putInt(t, j2, i4);
                } else {
                    zzf(t).zzh(i3, Long.valueOf(i10));
                }
                return iZza3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iZza4 = zzgg.zza(bArr, i, zzgfVar);
                unsafe.putObject(t, j, Integer.valueOf(zzgu.zzb(zzgfVar.zza)));
                unsafe.putInt(t, j2, i4);
                return iZza4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iZzc3 = zzgg.zzc(bArr, i, zzgfVar);
                unsafe.putObject(t, j, Long.valueOf(zzgu.zzc(zzgfVar.zzb)));
                unsafe.putInt(t, j2, i4);
                return iZzc3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                int iZzj = zzgg.zzj(zzv(i8), bArr, i, i2, (i3 & (-8)) | 4, zzgfVar);
                Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object2 == null) {
                    unsafe.putObject(t, j, zzgfVar.zzc);
                } else {
                    unsafe.putObject(t, j, zzhz.zzi(object2, zzgfVar.zzc));
                }
                unsafe.putInt(t, j2, i4);
                return iZzj;
            default:
                return i;
        }
    }

    private final zzjh zzv(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzjh zzjhVar = (zzjh) this.zzd[i3];
        if (zzjhVar != null) {
            return zzjhVar;
        }
        zzjh<T> zzjhVarZzb = zzje.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzjhVarZzb;
        return zzjhVarZzb;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzhv zzx(int i) {
        int i2 = i / 3;
        return (zzhv) this.zzd[i2 + i2 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a3 A[PHI: r0 r18 r23 r26 r27 r28
  0x02a3: PHI (r0v55 int) = (r0v50 int), (r0v53 int), (r0v57 int) binds: [B:113:0x030b, B:108:0x02e8, B:100:0x02a1] A[DONT_GENERATE, DONT_INLINE]
  0x02a3: PHI (r18v5 int) = (r18v3 int), (r18v3 int), (r18v6 int) binds: [B:113:0x030b, B:108:0x02e8, B:100:0x02a1] A[DONT_GENERATE, DONT_INLINE]
  0x02a3: PHI (r23v3 int) = (r23v1 int), (r23v1 int), (r23v4 int) binds: [B:113:0x030b, B:108:0x02e8, B:100:0x02a1] A[DONT_GENERATE, DONT_INLINE]
  0x02a3: PHI (r26v2 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:113:0x030b, B:108:0x02e8, B:100:0x02a1] A[DONT_GENERATE, DONT_INLINE]
  0x02a3: PHI (r27v6 int) = (r27v4 int), (r27v4 int), (r27v7 int) binds: [B:113:0x030b, B:108:0x02e8, B:100:0x02a1] A[DONT_GENERATE, DONT_INLINE]
  0x02a3: PHI (r28v7 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:113:0x030b, B:108:0x02e8, B:100:0x02a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x02b7 A[PHI: r0 r18 r23 r26 r27 r28
  0x02b7: PHI (r0v54 int) = (r0v50 int), (r0v53 int), (r0v57 int) binds: [B:113:0x030b, B:108:0x02e8, B:100:0x02a1] A[DONT_GENERATE, DONT_INLINE]
  0x02b7: PHI (r18v4 int) = (r18v3 int), (r18v3 int), (r18v6 int) binds: [B:113:0x030b, B:108:0x02e8, B:100:0x02a1] A[DONT_GENERATE, DONT_INLINE]
  0x02b7: PHI (r23v2 int) = (r23v1 int), (r23v1 int), (r23v4 int) binds: [B:113:0x030b, B:108:0x02e8, B:100:0x02a1] A[DONT_GENERATE, DONT_INLINE]
  0x02b7: PHI (r26v1 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:113:0x030b, B:108:0x02e8, B:100:0x02a1] A[DONT_GENERATE, DONT_INLINE]
  0x02b7: PHI (r27v5 int) = (r27v4 int), (r27v4 int), (r27v7 int) binds: [B:113:0x030b, B:108:0x02e8, B:100:0x02a1] A[DONT_GENERATE, DONT_INLINE]
  0x02b7: PHI (r28v6 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:113:0x030b, B:108:0x02e8, B:100:0x02a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0085. Please report as an issue. */
    private final int zzy(T t, byte[] bArr, int i, int i2, zzgf zzgfVar) throws IOException {
        int i3;
        int iZzb;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int iZzc;
        int iZzi;
        int i10;
        int i11;
        int i12;
        this = this;
        t = t;
        bArr = bArr;
        i2 = i2;
        zzgfVar = zzgfVar;
        Unsafe unsafe2 = zzb;
        int i13 = 1048575;
        int i14 = -1;
        int iZzn = i;
        int i15 = -1;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        while (iZzn < i2) {
            int i19 = iZzn + 1;
            byte b = bArr[iZzn];
            if (b < 0) {
                iZzb = zzgg.zzb(b, bArr, i19, zzgfVar);
                i3 = zzgfVar.zza;
            } else {
                i3 = b;
                iZzb = i19;
            }
            int i20 = i3 >>> 3;
            int i21 = i3 & 7;
            int iZzP = i20 > i15 ? this.zzP(i20, i17 / 3) : this.zzO(i20);
            if (iZzP == i14) {
                i4 = iZzb;
                i5 = i20;
                i6 = i14;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int i22 = this.zzc[iZzP + 1];
                int iZzC = zzC(i22);
                long j = i22 & i13;
                if (iZzC <= 17) {
                    int i23 = this.zzc[iZzP + 2];
                    int i24 = 1 << (i23 >>> 20);
                    i13 = 1048575;
                    int i25 = i23 & 1048575;
                    if (i25 != i16) {
                        if (i16 != 1048575) {
                            unsafe2.putInt(t, i16, i18);
                            i13 = 1048575;
                        }
                        if (i25 != i13) {
                            i18 = unsafe2.getInt(t, i25);
                        }
                        i16 = i25;
                    }
                    switch (iZzC) {
                        case 0:
                            i5 = i20;
                            zzgfVar = zzgfVar;
                            i8 = iZzP;
                            i9 = i18;
                            if (i21 != 1) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                zzkf.zzm(t, j, Double.longBitsToDouble(zzgg.zze(bArr, iZzb)));
                                iZzn = iZzb + 8;
                                i18 = i9 | i24;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 1:
                            i5 = i20;
                            i9 = i18;
                            i8 = iZzP;
                            if (i21 != 5) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                zzkf.zzk(t, j, Float.intBitsToFloat(zzgg.zzd(bArr, iZzb)));
                                iZzn = iZzb + 4;
                                i18 = i9 | i24;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i5 = i20;
                            zzgfVar = zzgfVar;
                            i8 = iZzP;
                            i9 = i18;
                            if (i21 != 0) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzc = zzgg.zzc(bArr, iZzb, zzgfVar);
                                unsafe2.putLong(t, j, zzgfVar.zzb);
                                i18 = i9 | i24;
                                i17 = i8;
                                iZzn = iZzc;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            i5 = i20;
                            zzgfVar = zzgfVar;
                            i8 = iZzP;
                            i9 = i18;
                            if (i21 != 0) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzn = zzgg.zza(bArr, iZzb, zzgfVar);
                                unsafe2.putInt(t, j, zzgfVar.zza);
                                i18 = i9 | i24;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i5 = i20;
                            zzgfVar = zzgfVar;
                            i8 = iZzP;
                            i9 = i18;
                            if (i21 != 1) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                unsafe2.putLong(t, j, zzgg.zze(bArr, iZzb));
                                iZzn = iZzb + 8;
                                i18 = i9 | i24;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i5 = i20;
                            i9 = i18;
                            i8 = iZzP;
                            if (i21 != 5) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                unsafe2.putInt(t, j, zzgg.zzd(bArr, iZzb));
                                iZzn = iZzb + 4;
                                i18 = i9 | i24;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 7:
                            i5 = i20;
                            zzgfVar = zzgfVar;
                            i8 = iZzP;
                            i9 = i18;
                            if (i21 != 0) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                int iZzc2 = zzgg.zzc(bArr, iZzb, zzgfVar);
                                zzkf.zzi(t, j, zzgfVar.zzb != 0);
                                i18 = i9 | i24;
                                iZzn = iZzc2;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 8:
                            i5 = i20;
                            zzgfVar = zzgfVar;
                            i8 = iZzP;
                            i9 = i18;
                            if (i21 != 2) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzn = (536870912 & i22) == 0 ? zzgg.zzf(bArr, iZzb, zzgfVar) : zzgg.zzg(bArr, iZzb, zzgfVar);
                                unsafe2.putObject(t, j, zzgfVar.zzc);
                                i18 = i9 | i24;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 9:
                            i5 = i20;
                            zzgfVar = zzgfVar;
                            i8 = iZzP;
                            if (i21 != 2) {
                                i9 = i18;
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzi = zzgg.zzi(this.zzv(i8), bArr, iZzb, i2, zzgfVar);
                                Object object = unsafe2.getObject(t, j);
                                if (object == null) {
                                    unsafe2.putObject(t, j, zzgfVar.zzc);
                                } else {
                                    unsafe2.putObject(t, j, zzhz.zzi(object, zzgfVar.zzc));
                                }
                                i18 |= i24;
                                iZzn = iZzi;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 10:
                            i5 = i20;
                            zzgfVar = zzgfVar;
                            i8 = iZzP;
                            if (i21 != 2) {
                                i9 = i18;
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzi = zzgg.zzh(bArr, iZzb, zzgfVar);
                                unsafe2.putObject(t, j, zzgfVar.zzc);
                                i18 |= i24;
                                iZzn = iZzi;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 12:
                            i5 = i20;
                            zzgfVar = zzgfVar;
                            i8 = iZzP;
                            if (i21 != 0) {
                                i9 = i18;
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzi = zzgg.zza(bArr, iZzb, zzgfVar);
                                unsafe2.putInt(t, j, zzgfVar.zza);
                                i18 |= i24;
                                iZzn = iZzi;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 15:
                            i5 = i20;
                            zzgfVar = zzgfVar;
                            i8 = iZzP;
                            if (i21 != 0) {
                                i9 = i18;
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzn = zzgg.zza(bArr, iZzb, zzgfVar);
                                unsafe2.putInt(t, j, zzgu.zzb(zzgfVar.zza));
                                i18 |= i24;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 16:
                            if (i21 != 0) {
                                i5 = i20;
                                i8 = iZzP;
                                i9 = i18;
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                zzgfVar = zzgfVar;
                                iZzc = zzgg.zzc(bArr, iZzb, zzgfVar);
                                i8 = iZzP;
                                i5 = i20;
                                unsafe2.putLong(t, j, zzgu.zzc(zzgfVar.zzb));
                                i18 |= i24;
                                i17 = i8;
                                iZzn = iZzc;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        default:
                            i5 = i20;
                            i8 = iZzP;
                            i9 = i18;
                            i18 = i9;
                            i4 = iZzb;
                            i7 = i8;
                            unsafe = unsafe2;
                            i6 = -1;
                            break;
                    }
                } else {
                    i5 = i20;
                    int i26 = i18;
                    i13 = 1048575;
                    zzgfVar = zzgfVar;
                    if (iZzC != 27) {
                        if (iZzC <= 49) {
                            i11 = i26;
                            int i27 = iZzb;
                            i10 = i16;
                            i7 = iZzP;
                            i6 = -1;
                            unsafe = unsafe2;
                            iZzn = zzs(t, bArr, iZzb, i2, i3, i5, i21, iZzP, i22, iZzC, j, zzgfVar);
                            if (iZzn != i27) {
                                i17 = i7;
                                i15 = i5;
                                i18 = i11;
                                i16 = i10;
                            } else {
                                i4 = iZzn;
                                i18 = i11;
                                i16 = i10;
                            }
                        } else {
                            i10 = i16;
                            i7 = iZzP;
                            unsafe = unsafe2;
                            i11 = i26;
                            i6 = -1;
                            i12 = iZzb;
                            if (iZzC == 50) {
                                if (i21 == 2) {
                                    iZzn = zzt(t, bArr, i12, i2, i7, j, zzgfVar);
                                    if (iZzn != i12) {
                                        i17 = i7;
                                        i15 = i5;
                                        i18 = i11;
                                        i16 = i10;
                                    } else {
                                        i4 = iZzn;
                                    }
                                }
                                i18 = i11;
                                i16 = i10;
                            } else {
                                iZzn = zzu(t, bArr, i12, i2, i3, i5, i21, i22, iZzC, j, i7, zzgfVar);
                                if (iZzn != i12) {
                                    i17 = i7;
                                    i15 = i5;
                                    i18 = i11;
                                    i16 = i10;
                                } else {
                                    i4 = iZzn;
                                    i18 = i11;
                                    i16 = i10;
                                }
                            }
                        }
                        i14 = i6;
                        unsafe2 = unsafe;
                        i13 = 1048575;
                    } else if (i21 == 2) {
                        zzhy zzhyVarZze = (zzhy) unsafe2.getObject(t, j);
                        if (!zzhyVarZze.zza()) {
                            int size = zzhyVarZze.size();
                            zzhyVarZze = zzhyVarZze.zze(size == 0 ? 10 : size + size);
                            unsafe2.putObject(t, j, zzhyVarZze);
                        }
                        iZzn = zzgg.zzm(this.zzv(iZzP), i3, bArr, iZzb, i2, zzhyVarZze, zzgfVar);
                        i17 = iZzP;
                        i18 = i26;
                        i15 = i5;
                        i14 = -1;
                        this = this;
                    } else {
                        i12 = iZzb;
                        i10 = i16;
                        i7 = iZzP;
                        unsafe = unsafe2;
                        i11 = i26;
                        i6 = -1;
                    }
                    i4 = i12;
                    i18 = i11;
                    i16 = i10;
                }
            }
            iZzn = zzgg.zzn(i3, bArr, i4, i2, zzf(t), zzgfVar);
            i17 = i7;
            i15 = i5;
            i14 = i6;
            unsafe2 = unsafe;
            i13 = 1048575;
        }
        int i28 = i18;
        Unsafe unsafe3 = unsafe2;
        if (i16 != i13) {
            unsafe3.putInt(t, i16, i28);
        }
        if (iZzn == i2) {
            return iZzn;
        }
        throw zzib.zze();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzz(Object obj, int i, zzjh zzjhVar) {
        return zzjhVar.zzj(zzkf.zzn(obj, i & 1048575));
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final T zza() {
        return (T) ((zzhr) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final boolean zzb(T t, T t2) {
        boolean zZzD;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzA = zzA(i);
            long j = iZzA & 1048575;
            switch (zzC(iZzA)) {
                case 0:
                    if (!zzI(t, t2, i) || Double.doubleToLongBits(zzkf.zzl(t, j)) != Double.doubleToLongBits(zzkf.zzl(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzI(t, t2, i) || Float.floatToIntBits(zzkf.zzj(t, j)) != Float.floatToIntBits(zzkf.zzj(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzI(t, t2, i) || zzkf.zzf(t, j) != zzkf.zzf(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzI(t, t2, i) || zzkf.zzf(t, j) != zzkf.zzf(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzI(t, t2, i) || zzkf.zzd(t, j) != zzkf.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzI(t, t2, i) || zzkf.zzf(t, j) != zzkf.zzf(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzI(t, t2, i) || zzkf.zzd(t, j) != zzkf.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzI(t, t2, i) || zzkf.zzh(t, j) != zzkf.zzh(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzI(t, t2, i) || !zzjj.zzD(zzkf.zzn(t, j), zzkf.zzn(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzI(t, t2, i) || !zzjj.zzD(zzkf.zzn(t, j), zzkf.zzn(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzI(t, t2, i) || !zzjj.zzD(zzkf.zzn(t, j), zzkf.zzn(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzI(t, t2, i) || zzkf.zzd(t, j) != zzkf.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzI(t, t2, i) || zzkf.zzd(t, j) != zzkf.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzI(t, t2, i) || zzkf.zzd(t, j) != zzkf.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzI(t, t2, i) || zzkf.zzf(t, j) != zzkf.zzf(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzI(t, t2, i) || zzkf.zzd(t, j) != zzkf.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzI(t, t2, i) || zzkf.zzf(t, j) != zzkf.zzf(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzI(t, t2, i) || !zzjj.zzD(zzkf.zzn(t, j), zzkf.zzn(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zZzD = zzjj.zzD(zzkf.zzn(t, j), zzkf.zzn(t2, j));
                    break;
                case 50:
                    zZzD = zzjj.zzD(zzkf.zzn(t, j), zzkf.zzn(t2, j));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzB = zzB(i) & 1048575;
                    if (zzkf.zzd(t, jZzB) != zzkf.zzd(t2, jZzB) || !zzjj.zzD(zzkf.zzn(t, j), zzkf.zzn(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzD) {
                return false;
            }
        }
        if (!this.zzn.zzd(t).equals(this.zzn.zzd(t2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zzb(t);
        this.zzo.zzb(t2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final int zzc(T t) {
        int i;
        int iZze;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzA = zzA(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzA;
            int iHashCode = 37;
            switch (zzC(iZzA)) {
                case 0:
                    i = i2 * 53;
                    iZze = zzhz.zze(Double.doubleToLongBits(zzkf.zzl(t, j)));
                    i2 = i + iZze;
                    break;
                case 1:
                    i = i2 * 53;
                    iZze = Float.floatToIntBits(zzkf.zzj(t, j));
                    i2 = i + iZze;
                    break;
                case 2:
                    i = i2 * 53;
                    iZze = zzhz.zze(zzkf.zzf(t, j));
                    i2 = i + iZze;
                    break;
                case 3:
                    i = i2 * 53;
                    iZze = zzhz.zze(zzkf.zzf(t, j));
                    i2 = i + iZze;
                    break;
                case 4:
                    i = i2 * 53;
                    iZze = zzkf.zzd(t, j);
                    i2 = i + iZze;
                    break;
                case 5:
                    i = i2 * 53;
                    iZze = zzhz.zze(zzkf.zzf(t, j));
                    i2 = i + iZze;
                    break;
                case 6:
                    i = i2 * 53;
                    iZze = zzkf.zzd(t, j);
                    i2 = i + iZze;
                    break;
                case 7:
                    i = i2 * 53;
                    iZze = zzhz.zzf(zzkf.zzh(t, j));
                    i2 = i + iZze;
                    break;
                case 8:
                    i = i2 * 53;
                    iZze = ((String) zzkf.zzn(t, j)).hashCode();
                    i2 = i + iZze;
                    break;
                case 9:
                    Object objZzn = zzkf.zzn(t, j);
                    if (objZzn != null) {
                        iHashCode = objZzn.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZze = zzkf.zzn(t, j).hashCode();
                    i2 = i + iZze;
                    break;
                case 11:
                    i = i2 * 53;
                    iZze = zzkf.zzd(t, j);
                    i2 = i + iZze;
                    break;
                case 12:
                    i = i2 * 53;
                    iZze = zzkf.zzd(t, j);
                    i2 = i + iZze;
                    break;
                case 13:
                    i = i2 * 53;
                    iZze = zzkf.zzd(t, j);
                    i2 = i + iZze;
                    break;
                case 14:
                    i = i2 * 53;
                    iZze = zzhz.zze(zzkf.zzf(t, j));
                    i2 = i + iZze;
                    break;
                case 15:
                    i = i2 * 53;
                    iZze = zzkf.zzd(t, j);
                    i2 = i + iZze;
                    break;
                case 16:
                    i = i2 * 53;
                    iZze = zzhz.zze(zzkf.zzf(t, j));
                    i2 = i + iZze;
                    break;
                case 17:
                    Object objZzn2 = zzkf.zzn(t, j);
                    if (objZzn2 != null) {
                        iHashCode = objZzn2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i = i2 * 53;
                    iZze = zzkf.zzn(t, j).hashCode();
                    i2 = i + iZze;
                    break;
                case 50:
                    i = i2 * 53;
                    iZze = zzkf.zzn(t, j).hashCode();
                    i2 = i + iZze;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzhz.zze(Double.doubleToLongBits(zzD(t, j)));
                        i2 = i + iZze;
                    }
                    break;
                case 52:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = Float.floatToIntBits(zzE(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 53:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzhz.zze(zzG(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 54:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzhz.zze(zzG(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 55:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzF(t, j);
                        i2 = i + iZze;
                    }
                    break;
                case 56:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzhz.zze(zzG(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 57:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzF(t, j);
                        i2 = i + iZze;
                    }
                    break;
                case 58:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzhz.zzf(zzH(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 59:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = ((String) zzkf.zzn(t, j)).hashCode();
                        i2 = i + iZze;
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzkf.zzn(t, j).hashCode();
                        i2 = i + iZze;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzkf.zzn(t, j).hashCode();
                        i2 = i + iZze;
                    }
                    break;
                case 62:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzF(t, j);
                        i2 = i + iZze;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzF(t, j);
                        i2 = i + iZze;
                    }
                    break;
                case 64:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzF(t, j);
                        i2 = i + iZze;
                    }
                    break;
                case 65:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzhz.zze(zzG(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 66:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzF(t, j);
                        i2 = i + iZze;
                    }
                    break;
                case 67:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzhz.zze(zzG(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 68:
                    if (zzM(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzkf.zzn(t, j).hashCode();
                        i2 = i + iZze;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzn.zzd(t).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zzb(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final int zze(T t) {
        return this.zzi ? zzr(t) : zzq(t);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12161. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzg(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzgf r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zziz.zzg(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzgf):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final void zzh(T t, byte[] bArr, int i, int i2, zzgf zzgfVar) throws IOException {
        if (this.zzi) {
            zzy(t, bArr, i, i2, zzgfVar);
        } else {
            zzg(t, bArr, i, i2, 0, zzgfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final void zzi(T t) {
        int i;
        int i2 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i2 >= i) {
                break;
            }
            long jZzA = zzA(this.zzj[i2]) & 1048575;
            Object objZzn = zzkf.zzn(t, jZzA);
            if (objZzn != null) {
                ((zziq) objZzn).zzd();
                zzkf.zzo(t, jZzA, objZzn);
            }
            i2++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(t, this.zzj[i]);
            i++;
        }
        this.zzn.zze(t);
        if (this.zzh) {
            this.zzo.zzc(t);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3 A[LOOP:1: B:45:0x00b2->B:50:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzjh
    public final boolean zzj(T t) {
        int i;
        int i2;
        List list;
        zzjh zzjhVarZzv;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
            int i8 = this.zzc[i7];
            int iZzA = zzA(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(t, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i4;
                i2 = i5;
            }
            if ((268435456 & iZzA) != 0 && !zzJ(t, i7, i, i2, i11)) {
                return false;
            }
            int iZzC = zzC(iZzA);
            if (iZzC == 9 || iZzC == 17) {
                if (zzJ(t, i7, i, i2, i11) && !zzz(t, iZzA, zzv(i7))) {
                    return false;
                }
            } else if (iZzC == 27) {
                list = (List) zzkf.zzn(t, iZzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzjhVarZzv = zzv(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzjhVarZzv.zzj(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzC == 60 || iZzC == 68) {
                if (zzM(t, i8, i7) && !zzz(t, iZzA, zzv(i7))) {
                    return false;
                }
            } else if (iZzC == 49) {
                list = (List) zzkf.zzn(t, iZzA & 1048575);
                if (list.isEmpty()) {
                    zzjhVarZzv = zzv(i7);
                    while (i3 < list.size()) {
                        if (!zzjhVarZzv.zzj(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzC == 50 && !((zziq) zzkf.zzn(t, iZzA & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zzb(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final void zzm(T t, zzgz zzgzVar) throws IOException {
        if (!this.zzi) {
            zzR(t, zzgzVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zzb(t);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzA = zzA(i);
            int i2 = this.zzc[i];
            switch (zzC(iZzA)) {
                case 0:
                    if (zzK(t, i)) {
                        zzgzVar.zzf(i2, zzkf.zzl(t, iZzA & 1048575));
                    }
                    break;
                case 1:
                    if (zzK(t, i)) {
                        zzgzVar.zze(i2, zzkf.zzj(t, iZzA & 1048575));
                    }
                    break;
                case 2:
                    if (zzK(t, i)) {
                        zzgzVar.zzc(i2, zzkf.zzf(t, iZzA & 1048575));
                    }
                    break;
                case 3:
                    if (zzK(t, i)) {
                        zzgzVar.zzh(i2, zzkf.zzf(t, iZzA & 1048575));
                    }
                    break;
                case 4:
                    if (zzK(t, i)) {
                        zzgzVar.zzi(i2, zzkf.zzd(t, iZzA & 1048575));
                    }
                    break;
                case 5:
                    if (zzK(t, i)) {
                        zzgzVar.zzj(i2, zzkf.zzf(t, iZzA & 1048575));
                    }
                    break;
                case 6:
                    if (zzK(t, i)) {
                        zzgzVar.zzk(i2, zzkf.zzd(t, iZzA & 1048575));
                    }
                    break;
                case 7:
                    if (zzK(t, i)) {
                        zzgzVar.zzl(i2, zzkf.zzh(t, iZzA & 1048575));
                    }
                    break;
                case 8:
                    if (zzK(t, i)) {
                        zzT(i2, zzkf.zzn(t, iZzA & 1048575), zzgzVar);
                    }
                    break;
                case 9:
                    if (zzK(t, i)) {
                        zzgzVar.zzr(i2, zzkf.zzn(t, iZzA & 1048575), zzv(i));
                    }
                    break;
                case 10:
                    if (zzK(t, i)) {
                        zzgzVar.zzn(i2, (zzgr) zzkf.zzn(t, iZzA & 1048575));
                    }
                    break;
                case 11:
                    if (zzK(t, i)) {
                        zzgzVar.zzo(i2, zzkf.zzd(t, iZzA & 1048575));
                    }
                    break;
                case 12:
                    if (zzK(t, i)) {
                        zzgzVar.zzg(i2, zzkf.zzd(t, iZzA & 1048575));
                    }
                    break;
                case 13:
                    if (zzK(t, i)) {
                        zzgzVar.zzb(i2, zzkf.zzd(t, iZzA & 1048575));
                    }
                    break;
                case 14:
                    if (zzK(t, i)) {
                        zzgzVar.zzd(i2, zzkf.zzf(t, iZzA & 1048575));
                    }
                    break;
                case 15:
                    if (zzK(t, i)) {
                        zzgzVar.zzp(i2, zzkf.zzd(t, iZzA & 1048575));
                    }
                    break;
                case 16:
                    if (zzK(t, i)) {
                        zzgzVar.zzq(i2, zzkf.zzf(t, iZzA & 1048575));
                    }
                    break;
                case 17:
                    if (zzK(t, i)) {
                        zzgzVar.zzs(i2, zzkf.zzn(t, iZzA & 1048575), zzv(i));
                    }
                    break;
                case 18:
                    zzjj.zzJ(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 19:
                    zzjj.zzK(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 20:
                    zzjj.zzL(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 21:
                    zzjj.zzM(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 22:
                    zzjj.zzQ(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 23:
                    zzjj.zzO(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 24:
                    zzjj.zzT(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 25:
                    zzjj.zzW(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 26:
                    zzjj.zzX(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar);
                    break;
                case 27:
                    zzjj.zzZ(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, zzv(i));
                    break;
                case 28:
                    zzjj.zzY(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    zzjj.zzR(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 30:
                    zzjj.zzV(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 31:
                    zzjj.zzU(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 32:
                    zzjj.zzP(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 33:
                    zzjj.zzS(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 34:
                    zzjj.zzN(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, false);
                    break;
                case 35:
                    zzjj.zzJ(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 36:
                    zzjj.zzK(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 37:
                    zzjj.zzL(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 38:
                    zzjj.zzM(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 39:
                    zzjj.zzQ(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 40:
                    zzjj.zzO(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 41:
                    zzjj.zzT(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 42:
                    zzjj.zzW(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 43:
                    zzjj.zzR(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 44:
                    zzjj.zzV(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 45:
                    zzjj.zzU(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 46:
                    zzjj.zzP(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 47:
                    zzjj.zzS(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case 48:
                    zzjj.zzN(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzjj.zzaa(this.zzc[i], (List) zzkf.zzn(t, iZzA & 1048575), zzgzVar, zzv(i));
                    break;
                case 50:
                    zzS(zzgzVar, i2, zzkf.zzn(t, iZzA & 1048575), i);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzf(i2, zzD(t, iZzA & 1048575));
                    }
                    break;
                case 52:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zze(i2, zzE(t, iZzA & 1048575));
                    }
                    break;
                case 53:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzc(i2, zzG(t, iZzA & 1048575));
                    }
                    break;
                case 54:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzh(i2, zzG(t, iZzA & 1048575));
                    }
                    break;
                case 55:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzi(i2, zzF(t, iZzA & 1048575));
                    }
                    break;
                case 56:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzj(i2, zzG(t, iZzA & 1048575));
                    }
                    break;
                case 57:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzk(i2, zzF(t, iZzA & 1048575));
                    }
                    break;
                case 58:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzl(i2, zzH(t, iZzA & 1048575));
                    }
                    break;
                case 59:
                    if (zzM(t, i2, i)) {
                        zzT(i2, zzkf.zzn(t, iZzA & 1048575), zzgzVar);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzr(i2, zzkf.zzn(t, iZzA & 1048575), zzv(i));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzn(i2, (zzgr) zzkf.zzn(t, iZzA & 1048575));
                    }
                    break;
                case 62:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzo(i2, zzF(t, iZzA & 1048575));
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzg(i2, zzF(t, iZzA & 1048575));
                    }
                    break;
                case 64:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzb(i2, zzF(t, iZzA & 1048575));
                    }
                    break;
                case 65:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzd(i2, zzG(t, iZzA & 1048575));
                    }
                    break;
                case 66:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzp(i2, zzF(t, iZzA & 1048575));
                    }
                    break;
                case 67:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzq(i2, zzG(t, iZzA & 1048575));
                    }
                    break;
                case 68:
                    if (zzM(t, i2, i)) {
                        zzgzVar.zzs(i2, zzkf.zzn(t, iZzA & 1048575), zzv(i));
                    }
                    break;
            }
        }
        zzjv<?, ?> zzjvVar = this.zzn;
        zzjvVar.zzi(zzjvVar.zzd(t), zzgzVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final void zzd(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzA = zzA(i);
            long j = 1048575 & iZzA;
            int i2 = this.zzc[i];
            switch (zzC(iZzA)) {
                case 0:
                    if (zzK(t2, i)) {
                        zzkf.zzm(t, j, zzkf.zzl(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 1:
                    if (zzK(t2, i)) {
                        zzkf.zzk(t, j, zzkf.zzj(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 2:
                    if (zzK(t2, i)) {
                        zzkf.zzg(t, j, zzkf.zzf(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 3:
                    if (zzK(t2, i)) {
                        zzkf.zzg(t, j, zzkf.zzf(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 4:
                    if (zzK(t2, i)) {
                        zzkf.zze(t, j, zzkf.zzd(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 5:
                    if (zzK(t2, i)) {
                        zzkf.zzg(t, j, zzkf.zzf(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 6:
                    if (zzK(t2, i)) {
                        zzkf.zze(t, j, zzkf.zzd(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 7:
                    if (zzK(t2, i)) {
                        zzkf.zzi(t, j, zzkf.zzh(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 8:
                    if (zzK(t2, i)) {
                        zzkf.zzo(t, j, zzkf.zzn(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 9:
                    zzo(t, t2, i);
                    break;
                case 10:
                    if (zzK(t2, i)) {
                        zzkf.zzo(t, j, zzkf.zzn(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 11:
                    if (zzK(t2, i)) {
                        zzkf.zze(t, j, zzkf.zzd(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 12:
                    if (zzK(t2, i)) {
                        zzkf.zze(t, j, zzkf.zzd(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 13:
                    if (zzK(t2, i)) {
                        zzkf.zze(t, j, zzkf.zzd(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 14:
                    if (zzK(t2, i)) {
                        zzkf.zzg(t, j, zzkf.zzf(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 15:
                    if (zzK(t2, i)) {
                        zzkf.zze(t, j, zzkf.zzd(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 16:
                    if (zzK(t2, i)) {
                        zzkf.zzg(t, j, zzkf.zzf(t2, j));
                        zzL(t, i);
                    }
                    break;
                case 17:
                    zzo(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    this.zzm.zzb(t, t2, j);
                    break;
                case 50:
                    zzjj.zzI(this.zzq, t, t2, j);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(t2, i2, i)) {
                        zzkf.zzo(t, j, zzkf.zzn(t2, j));
                        zzN(t, i2, i);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzp(t, t2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(t2, i2, i)) {
                        zzkf.zzo(t, j, zzkf.zzn(t2, j));
                        zzN(t, i2, i);
                    }
                    break;
                case 68:
                    zzp(t, t2, i);
                    break;
            }
        }
        zzjj.zzF(this.zzn, t, t2);
        if (this.zzh) {
            zzjj.zzE(this.zzo, t, t2);
        }
    }
}
