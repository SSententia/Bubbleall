package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzghl<T> implements zzghz<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgiy.zzt();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzghi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzggw zzn;
    private final zzgio<?, ?> zzo;
    private final zzgfn<?> zzp;
    private final zzghn zzq;
    private final zzghd zzr;

    /* JADX WARN: Multi-variable type inference failed */
    private zzghl(int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, zzghi zzghiVar, boolean z, boolean z2, int[] iArr3, int i3, int i4, zzghn zzghnVar, zzggw zzggwVar, zzgio<?, ?> zzgioVar, zzgfn<?> zzgfnVar, zzghd zzghdVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i;
        this.zzi = i2 instanceof zzgga;
        this.zzj = zzghiVar;
        boolean z3 = false;
        if (zzgioVar != 0 && zzgioVar.zza((zzghi) i2)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = z2;
        this.zzl = iArr3;
        this.zzm = i3;
        this.zzq = i4;
        this.zzn = zzghnVar;
        this.zzo = zzggwVar;
        this.zzp = zzgioVar;
        this.zzg = i2;
        this.zzr = zzgfnVar;
    }

    private final <UT, UB> UB zzA(Object obj, int i, UB ub, zzgio<UT, UB> zzgioVar) {
        int i2 = this.zzc[i];
        Object objZzn = zzgiy.zzn(obj, zzD(i) & 1048575);
        if (objZzn == null || zzy(i) == null) {
            return ub;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzB(Object obj, int i, zzghz zzghzVar) {
        return zzghzVar.zzk(zzgiy.zzn(obj, i & 1048575));
    }

    private final void zzC(Object obj, int i, zzght zzghtVar) throws IOException {
        if (zzG(i)) {
            zzgiy.zzo(obj, i & 1048575, zzghtVar.zzn());
        } else if (this.zzi) {
            zzgiy.zzo(obj, i & 1048575, zzghtVar.zzm());
        } else {
            zzgiy.zzo(obj, i & 1048575, zzghtVar.zzq());
        }
    }

    private final int zzD(int i) {
        return this.zzc[i + 1];
    }

    private final int zzE(int i) {
        return this.zzc[i + 2];
    }

    private static int zzF(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzG(int i) {
        return (i & 536870912) != 0;
    }

    private static <T> double zzH(T t, long j) {
        return ((Double) zzgiy.zzn(t, j)).doubleValue();
    }

    private static <T> float zzI(T t, long j) {
        return ((Float) zzgiy.zzn(t, j)).floatValue();
    }

    private static <T> int zzJ(T t, long j) {
        return ((Integer) zzgiy.zzn(t, j)).intValue();
    }

    private static <T> long zzK(T t, long j) {
        return ((Long) zzgiy.zzn(t, j)).longValue();
    }

    private static <T> boolean zzL(T t, long j) {
        return ((Boolean) zzgiy.zzn(t, j)).booleanValue();
    }

    private final boolean zzM(T t, T t2, int i) {
        return zzO(t, i) == zzO(t2, i);
    }

    private final boolean zzN(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzO(t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zzO(T t, int i) {
        int iZzE = zzE(i);
        long j = iZzE & 1048575;
        if (j != 1048575) {
            return (zzgiy.zzd(t, j) & (1 << (iZzE >>> 20))) != 0;
        }
        int iZzD = zzD(i);
        long j2 = iZzD & 1048575;
        switch (zzF(iZzD)) {
            case 0:
                return zzgiy.zzl(t, j2) != 0.0d;
            case 1:
                return zzgiy.zzj(t, j2) != 0.0f;
            case 2:
                return zzgiy.zzf(t, j2) != 0;
            case 3:
                return zzgiy.zzf(t, j2) != 0;
            case 4:
                return zzgiy.zzd(t, j2) != 0;
            case 5:
                return zzgiy.zzf(t, j2) != 0;
            case 6:
                return zzgiy.zzd(t, j2) != 0;
            case 7:
                return zzgiy.zzh(t, j2);
            case 8:
                Object objZzn = zzgiy.zzn(t, j2);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzgex) {
                    return !zzgex.zzb.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgiy.zzn(t, j2) != null;
            case 10:
                return !zzgex.zzb.equals(zzgiy.zzn(t, j2));
            case 11:
                return zzgiy.zzd(t, j2) != 0;
            case 12:
                return zzgiy.zzd(t, j2) != 0;
            case 13:
                return zzgiy.zzd(t, j2) != 0;
            case 14:
                return zzgiy.zzf(t, j2) != 0;
            case 15:
                return zzgiy.zzd(t, j2) != 0;
            case 16:
                return zzgiy.zzf(t, j2) != 0;
            case 17:
                return zzgiy.zzn(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzP(T t, int i) {
        int iZzE = zzE(i);
        long j = 1048575 & iZzE;
        if (j == 1048575) {
            return;
        }
        zzgiy.zze(t, j, (1 << (iZzE >>> 20)) | zzgiy.zzd(t, j));
    }

    private final boolean zzQ(T t, int i, int i2) {
        return zzgiy.zzd(t, (long) (zzE(i2) & 1048575)) == i;
    }

    private final void zzR(T t, int i, int i2) {
        zzgiy.zze(t, zzE(i2) & 1048575, i);
    }

    private final int zzS(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzU(i, 0);
    }

    private final int zzT(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzU(i, i2);
    }

    private final int zzU(int i, int i2) {
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
    private final void zzV(T t, zzgfi zzgfiVar) throws IOException {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iZzD = zzD(i4);
            int i6 = this.zzc[i4];
            int iZzF = zzF(iZzD);
            if (iZzF <= 17) {
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
            long j = iZzD & i2;
            switch (iZzF) {
                case 0:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzf(i6, zzgiy.zzl(t, j));
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zze(i6, zzgiy.zzj(t, j));
                    }
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzc(i6, unsafe.getLong(t, j));
                    }
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzh(i6, unsafe.getLong(t, j));
                    }
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzi(i6, unsafe.getInt(t, j));
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzj(i6, unsafe.getLong(t, j));
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzk(i6, unsafe.getInt(t, j));
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzl(i6, zzgiy.zzh(t, j));
                    }
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        zzX(i6, unsafe.getObject(t, j), zzgfiVar);
                    }
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzr(i6, unsafe.getObject(t, j), zzw(i4));
                    }
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzn(i6, (zzgex) unsafe.getObject(t, j));
                    }
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzo(i6, unsafe.getInt(t, j));
                    }
                    break;
                case 12:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzg(i6, unsafe.getInt(t, j));
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzb(i6, unsafe.getInt(t, j));
                    }
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzd(i6, unsafe.getLong(t, j));
                    }
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzp(i6, unsafe.getInt(t, j));
                    }
                    break;
                case 16:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzq(i6, unsafe.getLong(t, j));
                    }
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        zzgfiVar.zzs(i6, unsafe.getObject(t, j), zzw(i4));
                    }
                    break;
                case 18:
                    zzgib.zzJ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 19:
                    zzgib.zzK(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 20:
                    zzgib.zzL(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 21:
                    zzgib.zzM(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 22:
                    zzgib.zzQ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 23:
                    zzgib.zzO(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 24:
                    zzgib.zzT(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 25:
                    zzgib.zzW(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 26:
                    zzgib.zzX(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar);
                    break;
                case 27:
                    zzgib.zzZ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, zzw(i4));
                    break;
                case 28:
                    zzgib.zzY(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    z = false;
                    zzgib.zzR(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 30:
                    z = false;
                    zzgib.zzV(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 31:
                    z = false;
                    zzgib.zzU(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 32:
                    z = false;
                    zzgib.zzP(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 33:
                    z = false;
                    zzgib.zzS(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 34:
                    z = false;
                    zzgib.zzN(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, false);
                    break;
                case 35:
                    zzgib.zzJ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 36:
                    zzgib.zzK(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 37:
                    zzgib.zzL(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 38:
                    zzgib.zzM(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 39:
                    zzgib.zzQ(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 40:
                    zzgib.zzO(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 41:
                    zzgib.zzT(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 42:
                    zzgib.zzW(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 43:
                    zzgib.zzR(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 44:
                    zzgib.zzV(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 45:
                    zzgib.zzU(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 46:
                    zzgib.zzP(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 47:
                    zzgib.zzS(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case 48:
                    zzgib.zzN(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzgib.zzaa(this.zzc[i4], (List) unsafe.getObject(t, j), zzgfiVar, zzw(i4));
                    break;
                case 50:
                    zzW(zzgfiVar, i6, unsafe.getObject(t, j), i4);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzf(i6, zzH(t, j));
                    }
                    break;
                case 52:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zze(i6, zzI(t, j));
                    }
                    break;
                case 53:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzc(i6, zzK(t, j));
                    }
                    break;
                case 54:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzh(i6, zzK(t, j));
                    }
                    break;
                case 55:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzi(i6, zzJ(t, j));
                    }
                    break;
                case 56:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzj(i6, zzK(t, j));
                    }
                    break;
                case 57:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzk(i6, zzJ(t, j));
                    }
                    break;
                case 58:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzl(i6, zzL(t, j));
                    }
                    break;
                case 59:
                    if (zzQ(t, i6, i4)) {
                        zzX(i6, unsafe.getObject(t, j), zzgfiVar);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzr(i6, unsafe.getObject(t, j), zzw(i4));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzn(i6, (zzgex) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzo(i6, zzJ(t, j));
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzg(i6, zzJ(t, j));
                    }
                    break;
                case 64:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzb(i6, zzJ(t, j));
                    }
                    break;
                case 65:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzd(i6, zzK(t, j));
                    }
                    break;
                case 66:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzp(i6, zzJ(t, j));
                    }
                    break;
                case 67:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzq(i6, zzK(t, j));
                    }
                    break;
                case 68:
                    if (zzQ(t, i6, i4)) {
                        zzgfiVar.zzs(i6, unsafe.getObject(t, j), zzw(i4));
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzgio<?, ?> zzgioVar = this.zzo;
        zzgioVar.zzr(zzgioVar.zzj(t), zzgfiVar);
    }

    private final <K, V> void zzW(zzgfi zzgfiVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzX(int i, Object obj, zzgfi zzgfiVar) throws IOException {
        if (obj instanceof String) {
            zzgfiVar.zzm(i, (String) obj);
        } else {
            zzgfiVar.zzn(i, (zzgex) obj);
        }
    }

    static zzgip zzg(Object obj) {
        zzgga zzggaVar = (zzgga) obj;
        zzgip zzgipVar = zzggaVar.zzc;
        if (zzgipVar != zzgip.zza()) {
            return zzgipVar;
        }
        zzgip zzgipVarZzb = zzgip.zzb();
        zzggaVar.zzc = zzgipVarZzb;
        return zzgipVarZzb;
    }

    static <T> zzghl<T> zzl(Class<T> cls, zzghf zzghfVar, zzghn zzghnVar, zzggw zzggwVar, zzgio<?, ?> zzgioVar, zzgfn<?> zzgfnVar, zzghd zzghdVar) {
        if (zzghfVar instanceof zzghs) {
            return zzm((zzghs) zzghfVar, zzghnVar, zzggwVar, zzgioVar, zzgfnVar, zzghdVar);
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
    static <T> zzghl<T> zzm(zzghs zzghsVar, zzghn zzghnVar, zzggw zzggwVar, zzgio<?, ?> zzgioVar, zzgfn<?> zzgfnVar, zzghd zzghdVar) {
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
        Field fieldZzo;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldZzo2;
        int i26;
        Object obj2;
        Field fieldZzo3;
        int i27;
        char cCharAt10;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        boolean z = zzghsVar.zzc() == 2;
        String strZzd = zzghsVar.zzd();
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
        Object[] objArrZze = zzghsVar.zze();
        Class<?> cls = zzghsVar.zzb().getClass();
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
                        fieldZzo2 = (Field) obj;
                    } else {
                        fieldZzo2 = zzo(cls, (String) obj);
                        objArrZze[i25] = fieldZzo2;
                    }
                    iArr2 = iArr3;
                    i17 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzo2);
                    i26 = i25 + 1;
                    obj2 = objArrZze[i26];
                    if (obj2 instanceof Field) {
                        fieldZzo3 = (Field) obj2;
                    } else {
                        fieldZzo3 = zzo(cls, (String) obj2);
                        objArrZze[i26] = fieldZzo3;
                    }
                    strZzd = strZzd;
                    objArr = objArr2;
                    i19 = i2;
                    i20 = i80;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzo3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i21 = 0;
                }
                i2 = i24;
                i25 = iCharAt12 + iCharAt12;
                obj = objArrZze[i25];
                if (obj instanceof Field) {
                    fieldZzo2 = (Field) obj;
                } else {
                    fieldZzo2 = zzo(cls, (String) obj);
                    objArrZze[i25] = fieldZzo2;
                }
                iArr2 = iArr3;
                i17 = iCharAt;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzo2);
                i26 = i25 + 1;
                obj2 = objArrZze[i26];
                if (obj2 instanceof Field) {
                    fieldZzo3 = (Field) obj2;
                } else {
                    fieldZzo3 = zzo(cls, (String) obj2);
                    objArrZze[i26] = fieldZzo3;
                }
                strZzd = strZzd;
                objArr = objArr2;
                i19 = i2;
                i20 = i80;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzo3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i21 = 0;
            } else {
                iArr2 = iArr3;
                i17 = iCharAt;
                i18 = i4;
                int i83 = i2 + 1;
                Field fieldZzo4 = zzo(cls, (String) objArrZze[i2]);
                if (i73 == 9 || i73 == 17) {
                    int i84 = i63 / 3;
                    objArr2[i84 + i84 + 1] = fieldZzo4.getType();
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzo4);
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
                                fieldZzo = (Field) obj3;
                            } else {
                                fieldZzo = zzo(cls, (String) obj3);
                                objArrZze[i94] = fieldZzo;
                            }
                            i21 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzo);
                        }
                        if (i73 >= 18 && i73 <= 49) {
                            iArr[i62] = iObjectFieldOffset;
                            i62++;
                        }
                    }
                    i19 = i22;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzo4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzo4);
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
        return new zzghl<>(iArr3, objArr2, iCharAt, i4, zzghsVar.zzb(), z, false, iArr, iCharAt3, i60, zzghnVar, zzggwVar, zzgioVar, zzgfnVar, zzghdVar, null);
    }

    private static Field zzo(Class<?> cls, String str) {
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

    private final void zzp(T t, T t2, int i) {
        long jZzD = zzD(i) & 1048575;
        if (zzO(t2, i)) {
            Object objZzn = zzgiy.zzn(t, jZzD);
            Object objZzn2 = zzgiy.zzn(t2, jZzD);
            if (objZzn != null && objZzn2 != null) {
                zzgiy.zzo(t, jZzD, zzggk.zzi(objZzn, objZzn2));
                zzP(t, i);
            } else if (objZzn2 != null) {
                zzgiy.zzo(t, jZzD, objZzn2);
                zzP(t, i);
            }
        }
    }

    private final void zzq(T t, T t2, int i) {
        int iZzD = zzD(i);
        int i2 = this.zzc[i];
        long j = iZzD & 1048575;
        if (zzQ(t2, i2, i)) {
            Object objZzn = zzQ(t, i2, i) ? zzgiy.zzn(t, j) : null;
            Object objZzn2 = zzgiy.zzn(t2, j);
            if (objZzn != null && objZzn2 != null) {
                zzgiy.zzo(t, j, zzggk.zzi(objZzn, objZzn2));
                zzR(t, i2, i);
            } else if (objZzn2 != null) {
                zzgiy.zzo(t, j, objZzn2);
                zzR(t, i2, i);
            }
        }
    }

    private final int zzr(T t) {
        int i;
        int iZzx;
        int iZzx2;
        int iZzx3;
        int iZzy;
        int iZzx4;
        int iZzw;
        int iZzx5;
        int iZzx6;
        int iZzc;
        int iZzx7;
        int iZzw2;
        int iZzv;
        int iZzx8;
        int i2;
        Unsafe unsafe = zzb;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int iZzD = zzD(i6);
            int i7 = this.zzc[i6];
            int iZzF = zzF(iZzD);
            if (iZzF <= 17) {
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
            long j = iZzD & 1048575;
            switch (iZzF) {
                case 0:
                    if ((i4 & i) != 0) {
                        iZzx = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx + 8;
                        i3 += iZzw2;
                    }
                    break;
                case 1:
                    if ((i4 & i) != 0) {
                        iZzx2 = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx2 + 4;
                        i3 += iZzw2;
                    }
                    break;
                case 2:
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        iZzx3 = zzgfh.zzx(i7 << 3);
                        iZzy = zzgfh.zzy(j2);
                        iZzw2 = iZzx3 + iZzy;
                        i3 += iZzw2;
                    }
                    break;
                case 3:
                    if ((i4 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        iZzx3 = zzgfh.zzx(i7 << 3);
                        iZzy = zzgfh.zzy(j3);
                        iZzw2 = iZzx3 + iZzy;
                        i3 += iZzw2;
                    }
                    break;
                case 4:
                    if ((i4 & i) != 0) {
                        int i10 = unsafe.getInt(t, j);
                        iZzx4 = zzgfh.zzx(i7 << 3);
                        iZzw = zzgfh.zzw(i10);
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 5:
                    if ((i4 & i) != 0) {
                        iZzx = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx + 8;
                        i3 += iZzw2;
                    }
                    break;
                case 6:
                    if ((i4 & i) != 0) {
                        iZzx2 = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx2 + 4;
                        i3 += iZzw2;
                    }
                    break;
                case 7:
                    if ((i4 & i) != 0) {
                        iZzx5 = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx5 + 1;
                        i3 += iZzw2;
                    }
                    break;
                case 8:
                    if ((i4 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zzgex) {
                            iZzx6 = zzgfh.zzx(i7 << 3);
                            iZzc = ((zzgex) object).zzc();
                            iZzx7 = zzgfh.zzx(iZzc);
                            i2 = iZzx6 + iZzx7 + iZzc;
                            i3 += i2;
                        } else {
                            iZzx4 = zzgfh.zzx(i7 << 3);
                            iZzw = zzgfh.zzz((String) object);
                            i2 = iZzx4 + iZzw;
                            i3 += i2;
                        }
                    }
                    break;
                case 9:
                    if ((i4 & i) != 0) {
                        iZzw2 = zzgib.zzw(i7, unsafe.getObject(t, j), zzw(i6));
                        i3 += iZzw2;
                    }
                    break;
                case 10:
                    if ((i4 & i) != 0) {
                        zzgex zzgexVar = (zzgex) unsafe.getObject(t, j);
                        iZzx6 = zzgfh.zzx(i7 << 3);
                        iZzc = zzgexVar.zzc();
                        iZzx7 = zzgfh.zzx(iZzc);
                        i2 = iZzx6 + iZzx7 + iZzc;
                        i3 += i2;
                    }
                    break;
                case 11:
                    if ((i4 & i) != 0) {
                        int i11 = unsafe.getInt(t, j);
                        iZzx4 = zzgfh.zzx(i7 << 3);
                        iZzw = zzgfh.zzx(i11);
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 12:
                    if ((i4 & i) != 0) {
                        int i12 = unsafe.getInt(t, j);
                        iZzx4 = zzgfh.zzx(i7 << 3);
                        iZzw = zzgfh.zzw(i12);
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 13:
                    if ((i4 & i) != 0) {
                        iZzx2 = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx2 + 4;
                        i3 += iZzw2;
                    }
                    break;
                case 14:
                    if ((i4 & i) != 0) {
                        iZzx = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx + 8;
                        i3 += iZzw2;
                    }
                    break;
                case 15:
                    if ((i4 & i) != 0) {
                        int i13 = unsafe.getInt(t, j);
                        iZzx4 = zzgfh.zzx(i7 << 3);
                        iZzw = zzgfh.zzx((i13 >> 31) ^ (i13 + i13));
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 16:
                    if ((i4 & i) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        iZzx4 = zzgfh.zzx(i7 << 3);
                        iZzw = zzgfh.zzy((j4 >> 63) ^ (j4 + j4));
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 17:
                    if ((i4 & i) != 0) {
                        iZzw2 = zzgfh.zzF(i7, (zzghi) unsafe.getObject(t, j), zzw(i6));
                        i3 += iZzw2;
                    }
                    break;
                case 18:
                    iZzw2 = zzgib.zzs(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 19:
                    iZzw2 = zzgib.zzq(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 20:
                    iZzw2 = zzgib.zzc(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 21:
                    iZzw2 = zzgib.zze(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 22:
                    iZzw2 = zzgib.zzk(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 23:
                    iZzw2 = zzgib.zzs(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 24:
                    iZzw2 = zzgib.zzq(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 25:
                    iZzw2 = zzgib.zzu(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 26:
                    iZzw2 = zzgib.zzv(i7, (List) unsafe.getObject(t, j));
                    i3 += iZzw2;
                    break;
                case 27:
                    iZzw2 = zzgib.zzx(i7, (List) unsafe.getObject(t, j), zzw(i6));
                    i3 += iZzw2;
                    break;
                case 28:
                    iZzw2 = zzgib.zzy(i7, (List) unsafe.getObject(t, j));
                    i3 += iZzw2;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    iZzw2 = zzgib.zzm(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 30:
                    iZzw2 = zzgib.zzi(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 31:
                    iZzw2 = zzgib.zzq(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 32:
                    iZzw2 = zzgib.zzs(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 33:
                    iZzw2 = zzgib.zzo(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 34:
                    iZzw2 = zzgib.zzg(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iZzw2;
                    break;
                case 35:
                    iZzw = zzgib.zzr((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 36:
                    iZzw = zzgib.zzp((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 37:
                    iZzw = zzgib.zzb((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 38:
                    iZzw = zzgib.zzd((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 39:
                    iZzw = zzgib.zzj((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 40:
                    iZzw = zzgib.zzr((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 41:
                    iZzw = zzgib.zzp((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 42:
                    iZzw = zzgib.zzt((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 43:
                    iZzw = zzgib.zzl((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 44:
                    iZzw = zzgib.zzh((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 45:
                    iZzw = zzgib.zzp((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 46:
                    iZzw = zzgib.zzr((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 47:
                    iZzw = zzgib.zzn((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 48:
                    iZzw = zzgib.zzf((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i7);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    iZzw2 = zzgib.zzz(i7, (List) unsafe.getObject(t, j), zzw(i6));
                    i3 += iZzw2;
                    break;
                case 50:
                    zzghd.zza(i7, unsafe.getObject(t, j), zzx(i6));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzQ(t, i7, i6)) {
                        iZzx = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx + 8;
                        i3 += iZzw2;
                    }
                    break;
                case 52:
                    if (zzQ(t, i7, i6)) {
                        iZzx2 = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx2 + 4;
                        i3 += iZzw2;
                    }
                    break;
                case 53:
                    if (zzQ(t, i7, i6)) {
                        long jZzK = zzK(t, j);
                        iZzx3 = zzgfh.zzx(i7 << 3);
                        iZzy = zzgfh.zzy(jZzK);
                        iZzw2 = iZzx3 + iZzy;
                        i3 += iZzw2;
                    }
                    break;
                case 54:
                    if (zzQ(t, i7, i6)) {
                        long jZzK2 = zzK(t, j);
                        iZzx3 = zzgfh.zzx(i7 << 3);
                        iZzy = zzgfh.zzy(jZzK2);
                        iZzw2 = iZzx3 + iZzy;
                        i3 += iZzw2;
                    }
                    break;
                case 55:
                    if (zzQ(t, i7, i6)) {
                        int iZzJ = zzJ(t, j);
                        iZzx4 = zzgfh.zzx(i7 << 3);
                        iZzw = zzgfh.zzw(iZzJ);
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 56:
                    if (zzQ(t, i7, i6)) {
                        iZzx = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx + 8;
                        i3 += iZzw2;
                    }
                    break;
                case 57:
                    if (zzQ(t, i7, i6)) {
                        iZzx2 = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx2 + 4;
                        i3 += iZzw2;
                    }
                    break;
                case 58:
                    if (zzQ(t, i7, i6)) {
                        iZzx5 = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx5 + 1;
                        i3 += iZzw2;
                    }
                    break;
                case 59:
                    if (zzQ(t, i7, i6)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zzgex) {
                            iZzx6 = zzgfh.zzx(i7 << 3);
                            iZzc = ((zzgex) object2).zzc();
                            iZzx7 = zzgfh.zzx(iZzc);
                            i2 = iZzx6 + iZzx7 + iZzc;
                            i3 += i2;
                        } else {
                            iZzx4 = zzgfh.zzx(i7 << 3);
                            iZzw = zzgfh.zzz((String) object2);
                            i2 = iZzx4 + iZzw;
                            i3 += i2;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzQ(t, i7, i6)) {
                        iZzw2 = zzgib.zzw(i7, unsafe.getObject(t, j), zzw(i6));
                        i3 += iZzw2;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzQ(t, i7, i6)) {
                        zzgex zzgexVar2 = (zzgex) unsafe.getObject(t, j);
                        iZzx6 = zzgfh.zzx(i7 << 3);
                        iZzc = zzgexVar2.zzc();
                        iZzx7 = zzgfh.zzx(iZzc);
                        i2 = iZzx6 + iZzx7 + iZzc;
                        i3 += i2;
                    }
                    break;
                case 62:
                    if (zzQ(t, i7, i6)) {
                        int iZzJ2 = zzJ(t, j);
                        iZzx4 = zzgfh.zzx(i7 << 3);
                        iZzw = zzgfh.zzx(iZzJ2);
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzQ(t, i7, i6)) {
                        int iZzJ3 = zzJ(t, j);
                        iZzx4 = zzgfh.zzx(i7 << 3);
                        iZzw = zzgfh.zzw(iZzJ3);
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 64:
                    if (zzQ(t, i7, i6)) {
                        iZzx2 = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx2 + 4;
                        i3 += iZzw2;
                    }
                    break;
                case 65:
                    if (zzQ(t, i7, i6)) {
                        iZzx = zzgfh.zzx(i7 << 3);
                        iZzw2 = iZzx + 8;
                        i3 += iZzw2;
                    }
                    break;
                case 66:
                    if (zzQ(t, i7, i6)) {
                        int iZzJ4 = zzJ(t, j);
                        iZzx4 = zzgfh.zzx(i7 << 3);
                        iZzw = zzgfh.zzx((iZzJ4 >> 31) ^ (iZzJ4 + iZzJ4));
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 67:
                    if (zzQ(t, i7, i6)) {
                        long jZzK3 = zzK(t, j);
                        iZzx4 = zzgfh.zzx(i7 << 3);
                        iZzw = zzgfh.zzy((jZzK3 >> 63) ^ (jZzK3 + jZzK3));
                        i2 = iZzx4 + iZzw;
                        i3 += i2;
                    }
                    break;
                case 68:
                    if (zzQ(t, i7, i6)) {
                        iZzw2 = zzgfh.zzF(i7, (zzghi) unsafe.getObject(t, j), zzw(i6));
                        i3 += iZzw2;
                    }
                    break;
            }
        }
        zzgio<?, ?> zzgioVar = this.zzo;
        int iZzq = i3 + zzgioVar.zzq(zzgioVar.zzj(t));
        if (!this.zzh) {
            return iZzq;
        }
        this.zzp.zzb(t);
        throw null;
    }

    private final int zzs(T t) {
        int iZzx;
        int iZzx2;
        int iZzx3;
        int iZzy;
        int iZzx4;
        int iZzw;
        int iZzx5;
        int iZzx6;
        int iZzc;
        int iZzx7;
        int iZzw2;
        int iZzv;
        int iZzx8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int iZzD = zzD(i3);
            int iZzF = zzF(iZzD);
            int i4 = this.zzc[i3];
            long j = iZzD & 1048575;
            if (iZzF >= zzgfs.DOUBLE_LIST_PACKED.zza() && iZzF <= zzgfs.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (iZzF) {
                case 0:
                    if (zzO(t, i3)) {
                        iZzx = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx + 8;
                        i2 += iZzw2;
                    }
                    break;
                case 1:
                    if (zzO(t, i3)) {
                        iZzx2 = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx2 + 4;
                        i2 += iZzw2;
                    }
                    break;
                case 2:
                    if (zzO(t, i3)) {
                        long jZzf = zzgiy.zzf(t, j);
                        iZzx3 = zzgfh.zzx(i4 << 3);
                        iZzy = zzgfh.zzy(jZzf);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 3:
                    if (zzO(t, i3)) {
                        long jZzf2 = zzgiy.zzf(t, j);
                        iZzx3 = zzgfh.zzx(i4 << 3);
                        iZzy = zzgfh.zzy(jZzf2);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 4:
                    if (zzO(t, i3)) {
                        int iZzd = zzgiy.zzd(t, j);
                        iZzx4 = zzgfh.zzx(i4 << 3);
                        iZzw = zzgfh.zzw(iZzd);
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 5:
                    if (zzO(t, i3)) {
                        iZzx = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx + 8;
                        i2 += iZzw2;
                    }
                    break;
                case 6:
                    if (zzO(t, i3)) {
                        iZzx2 = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx2 + 4;
                        i2 += iZzw2;
                    }
                    break;
                case 7:
                    if (zzO(t, i3)) {
                        iZzx5 = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx5 + 1;
                        i2 += iZzw2;
                    }
                    break;
                case 8:
                    if (zzO(t, i3)) {
                        Object objZzn = zzgiy.zzn(t, j);
                        if (objZzn instanceof zzgex) {
                            iZzx6 = zzgfh.zzx(i4 << 3);
                            iZzc = ((zzgex) objZzn).zzc();
                            iZzx7 = zzgfh.zzx(iZzc);
                            i = iZzx6 + iZzx7 + iZzc;
                            i2 += i;
                        } else {
                            iZzx4 = zzgfh.zzx(i4 << 3);
                            iZzw = zzgfh.zzz((String) objZzn);
                            i = iZzx4 + iZzw;
                            i2 += i;
                        }
                    }
                    break;
                case 9:
                    if (zzO(t, i3)) {
                        iZzw2 = zzgib.zzw(i4, zzgiy.zzn(t, j), zzw(i3));
                        i2 += iZzw2;
                    }
                    break;
                case 10:
                    if (zzO(t, i3)) {
                        zzgex zzgexVar = (zzgex) zzgiy.zzn(t, j);
                        iZzx6 = zzgfh.zzx(i4 << 3);
                        iZzc = zzgexVar.zzc();
                        iZzx7 = zzgfh.zzx(iZzc);
                        i = iZzx6 + iZzx7 + iZzc;
                        i2 += i;
                    }
                    break;
                case 11:
                    if (zzO(t, i3)) {
                        int iZzd2 = zzgiy.zzd(t, j);
                        iZzx4 = zzgfh.zzx(i4 << 3);
                        iZzw = zzgfh.zzx(iZzd2);
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 12:
                    if (zzO(t, i3)) {
                        int iZzd3 = zzgiy.zzd(t, j);
                        iZzx4 = zzgfh.zzx(i4 << 3);
                        iZzw = zzgfh.zzw(iZzd3);
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 13:
                    if (zzO(t, i3)) {
                        iZzx2 = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx2 + 4;
                        i2 += iZzw2;
                    }
                    break;
                case 14:
                    if (zzO(t, i3)) {
                        iZzx = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx + 8;
                        i2 += iZzw2;
                    }
                    break;
                case 15:
                    if (zzO(t, i3)) {
                        int iZzd4 = zzgiy.zzd(t, j);
                        iZzx4 = zzgfh.zzx(i4 << 3);
                        iZzw = zzgfh.zzx((iZzd4 >> 31) ^ (iZzd4 + iZzd4));
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 16:
                    if (zzO(t, i3)) {
                        long jZzf3 = zzgiy.zzf(t, j);
                        iZzx4 = zzgfh.zzx(i4 << 3);
                        iZzw = zzgfh.zzy((jZzf3 >> 63) ^ (jZzf3 + jZzf3));
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 17:
                    if (zzO(t, i3)) {
                        iZzw2 = zzgfh.zzF(i4, (zzghi) zzgiy.zzn(t, j), zzw(i3));
                        i2 += iZzw2;
                    }
                    break;
                case 18:
                    iZzw2 = zzgib.zzs(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 19:
                    iZzw2 = zzgib.zzq(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 20:
                    iZzw2 = zzgib.zzc(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 21:
                    iZzw2 = zzgib.zze(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 22:
                    iZzw2 = zzgib.zzk(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 23:
                    iZzw2 = zzgib.zzs(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 24:
                    iZzw2 = zzgib.zzq(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 25:
                    iZzw2 = zzgib.zzu(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 26:
                    iZzw2 = zzgib.zzv(i4, (List) zzgiy.zzn(t, j));
                    i2 += iZzw2;
                    break;
                case 27:
                    iZzw2 = zzgib.zzx(i4, (List) zzgiy.zzn(t, j), zzw(i3));
                    i2 += iZzw2;
                    break;
                case 28:
                    iZzw2 = zzgib.zzy(i4, (List) zzgiy.zzn(t, j));
                    i2 += iZzw2;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    iZzw2 = zzgib.zzm(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 30:
                    iZzw2 = zzgib.zzi(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 31:
                    iZzw2 = zzgib.zzq(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 32:
                    iZzw2 = zzgib.zzs(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 33:
                    iZzw2 = zzgib.zzo(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 34:
                    iZzw2 = zzgib.zzg(i4, (List) zzgiy.zzn(t, j), false);
                    i2 += iZzw2;
                    break;
                case 35:
                    iZzw = zzgib.zzr((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 36:
                    iZzw = zzgib.zzp((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 37:
                    iZzw = zzgib.zzb((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 38:
                    iZzw = zzgib.zzd((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 39:
                    iZzw = zzgib.zzj((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 40:
                    iZzw = zzgib.zzr((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 41:
                    iZzw = zzgib.zzp((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 42:
                    iZzw = zzgib.zzt((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 43:
                    iZzw = zzgib.zzl((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 44:
                    iZzw = zzgib.zzh((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 45:
                    iZzw = zzgib.zzp((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 46:
                    iZzw = zzgib.zzr((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 47:
                    iZzw = zzgib.zzn((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 48:
                    iZzw = zzgib.zzf((List) unsafe.getObject(t, j));
                    if (iZzw > 0) {
                        iZzv = zzgfh.zzv(i4);
                        iZzx8 = zzgfh.zzx(iZzw);
                        iZzx4 = iZzv + iZzx8;
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    iZzw2 = zzgib.zzz(i4, (List) zzgiy.zzn(t, j), zzw(i3));
                    i2 += iZzw2;
                    break;
                case 50:
                    zzghd.zza(i4, zzgiy.zzn(t, j), zzx(i3));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzQ(t, i4, i3)) {
                        iZzx = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx + 8;
                        i2 += iZzw2;
                    }
                    break;
                case 52:
                    if (zzQ(t, i4, i3)) {
                        iZzx2 = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx2 + 4;
                        i2 += iZzw2;
                    }
                    break;
                case 53:
                    if (zzQ(t, i4, i3)) {
                        long jZzK = zzK(t, j);
                        iZzx3 = zzgfh.zzx(i4 << 3);
                        iZzy = zzgfh.zzy(jZzK);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 54:
                    if (zzQ(t, i4, i3)) {
                        long jZzK2 = zzK(t, j);
                        iZzx3 = zzgfh.zzx(i4 << 3);
                        iZzy = zzgfh.zzy(jZzK2);
                        i2 += iZzx3 + iZzy;
                    }
                    break;
                case 55:
                    if (zzQ(t, i4, i3)) {
                        int iZzJ = zzJ(t, j);
                        iZzx4 = zzgfh.zzx(i4 << 3);
                        iZzw = zzgfh.zzw(iZzJ);
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 56:
                    if (zzQ(t, i4, i3)) {
                        iZzx = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx + 8;
                        i2 += iZzw2;
                    }
                    break;
                case 57:
                    if (zzQ(t, i4, i3)) {
                        iZzx2 = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx2 + 4;
                        i2 += iZzw2;
                    }
                    break;
                case 58:
                    if (zzQ(t, i4, i3)) {
                        iZzx5 = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx5 + 1;
                        i2 += iZzw2;
                    }
                    break;
                case 59:
                    if (zzQ(t, i4, i3)) {
                        Object objZzn2 = zzgiy.zzn(t, j);
                        if (objZzn2 instanceof zzgex) {
                            iZzx6 = zzgfh.zzx(i4 << 3);
                            iZzc = ((zzgex) objZzn2).zzc();
                            iZzx7 = zzgfh.zzx(iZzc);
                            i = iZzx6 + iZzx7 + iZzc;
                            i2 += i;
                        } else {
                            iZzx4 = zzgfh.zzx(i4 << 3);
                            iZzw = zzgfh.zzz((String) objZzn2);
                            i = iZzx4 + iZzw;
                            i2 += i;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzQ(t, i4, i3)) {
                        iZzw2 = zzgib.zzw(i4, zzgiy.zzn(t, j), zzw(i3));
                        i2 += iZzw2;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzQ(t, i4, i3)) {
                        zzgex zzgexVar2 = (zzgex) zzgiy.zzn(t, j);
                        iZzx6 = zzgfh.zzx(i4 << 3);
                        iZzc = zzgexVar2.zzc();
                        iZzx7 = zzgfh.zzx(iZzc);
                        i = iZzx6 + iZzx7 + iZzc;
                        i2 += i;
                    }
                    break;
                case 62:
                    if (zzQ(t, i4, i3)) {
                        int iZzJ2 = zzJ(t, j);
                        iZzx4 = zzgfh.zzx(i4 << 3);
                        iZzw = zzgfh.zzx(iZzJ2);
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzQ(t, i4, i3)) {
                        int iZzJ3 = zzJ(t, j);
                        iZzx4 = zzgfh.zzx(i4 << 3);
                        iZzw = zzgfh.zzw(iZzJ3);
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 64:
                    if (zzQ(t, i4, i3)) {
                        iZzx2 = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx2 + 4;
                        i2 += iZzw2;
                    }
                    break;
                case 65:
                    if (zzQ(t, i4, i3)) {
                        iZzx = zzgfh.zzx(i4 << 3);
                        iZzw2 = iZzx + 8;
                        i2 += iZzw2;
                    }
                    break;
                case 66:
                    if (zzQ(t, i4, i3)) {
                        int iZzJ4 = zzJ(t, j);
                        iZzx4 = zzgfh.zzx(i4 << 3);
                        iZzw = zzgfh.zzx((iZzJ4 >> 31) ^ (iZzJ4 + iZzJ4));
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 67:
                    if (zzQ(t, i4, i3)) {
                        long jZzK3 = zzK(t, j);
                        iZzx4 = zzgfh.zzx(i4 << 3);
                        iZzw = zzgfh.zzy((jZzK3 >> 63) ^ (jZzK3 + jZzK3));
                        i = iZzx4 + iZzw;
                        i2 += i;
                    }
                    break;
                case 68:
                    if (zzQ(t, i4, i3)) {
                        iZzw2 = zzgfh.zzF(i4, (zzghi) zzgiy.zzn(t, j), zzw(i3));
                        i2 += iZzw2;
                    }
                    break;
            }
        }
        zzgio<?, ?> zzgioVar = this.zzo;
        return i2 + zzgioVar.zzq(zzgioVar.zzj(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zzt(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzgej zzgejVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iZza;
        int iZza2 = i;
        Unsafe unsafe = zzb;
        zzggj zzggjVarZze = (zzggj) unsafe.getObject(t, j2);
        if (!zzggjVarZze.zza()) {
            int size = zzggjVarZze.size();
            zzggjVarZze = zzggjVarZze.zze(size == 0 ? 10 : size + size);
            unsafe.putObject(t, j2, zzggjVarZze);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzgfj zzgfjVar = (zzgfj) zzggjVarZze;
                    int iZza3 = zzgek.zza(bArr, iZza2, zzgejVar);
                    int i12 = zzgejVar.zza + iZza3;
                    while (iZza3 < i12) {
                        zzgfjVar.zzd(Double.longBitsToDouble(zzgek.zze(bArr, iZza3)));
                        iZza3 += 8;
                    }
                    if (iZza3 == i12) {
                        return iZza3;
                    }
                    throw zzggm.zzd();
                }
                if (i5 == 1) {
                    zzgfj zzgfjVar2 = (zzgfj) zzggjVarZze;
                    zzgfjVar2.zzd(Double.longBitsToDouble(zzgek.zze(bArr, i)));
                    while (true) {
                        i8 = iZza2 + 8;
                        if (i8 < i2) {
                            iZza2 = zzgek.zza(bArr, i8, zzgejVar);
                            if (i3 == zzgejVar.zza) {
                                zzgfjVar2.zzd(Double.longBitsToDouble(zzgek.zze(bArr, iZza2)));
                            }
                        }
                    }
                    return i8;
                }
                return iZza2;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzgft zzgftVar = (zzgft) zzggjVarZze;
                    int iZza4 = zzgek.zza(bArr, iZza2, zzgejVar);
                    int i13 = zzgejVar.zza + iZza4;
                    while (iZza4 < i13) {
                        zzgftVar.zzd(Float.intBitsToFloat(zzgek.zzd(bArr, iZza4)));
                        iZza4 += 4;
                    }
                    if (iZza4 == i13) {
                        return iZza4;
                    }
                    throw zzggm.zzd();
                }
                if (i5 == 5) {
                    zzgft zzgftVar2 = (zzgft) zzggjVarZze;
                    zzgftVar2.zzd(Float.intBitsToFloat(zzgek.zzd(bArr, i)));
                    while (true) {
                        i9 = iZza2 + 4;
                        if (i9 < i2) {
                            iZza2 = zzgek.zza(bArr, i9, zzgejVar);
                            if (i3 == zzgejVar.zza) {
                                zzgftVar2.zzd(Float.intBitsToFloat(zzgek.zzd(bArr, iZza2)));
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
                    zzggx zzggxVar = (zzggx) zzggjVarZze;
                    int iZza5 = zzgek.zza(bArr, iZza2, zzgejVar);
                    int i14 = zzgejVar.zza + iZza5;
                    while (iZza5 < i14) {
                        iZza5 = zzgek.zzc(bArr, iZza5, zzgejVar);
                        zzggxVar.zzg(zzgejVar.zzb);
                    }
                    if (iZza5 == i14) {
                        return iZza5;
                    }
                    throw zzggm.zzd();
                }
                if (i5 == 0) {
                    zzggx zzggxVar2 = (zzggx) zzggjVarZze;
                    int iZzc = zzgek.zzc(bArr, iZza2, zzgejVar);
                    zzggxVar2.zzg(zzgejVar.zzb);
                    while (iZzc < i2) {
                        int iZza6 = zzgek.zza(bArr, iZzc, zzgejVar);
                        if (i3 != zzgejVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzgek.zzc(bArr, iZza6, zzgejVar);
                        zzggxVar2.zzg(zzgejVar.zzb);
                    }
                    return iZzc;
                }
                return iZza2;
            case 22:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzgek.zzl(bArr, iZza2, zzggjVarZze, zzgejVar);
                }
                if (i5 == 0) {
                    return zzgek.zzk(i3, bArr, i, i2, zzggjVarZze, zzgejVar);
                }
                return iZza2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzggx zzggxVar3 = (zzggx) zzggjVarZze;
                    int iZza7 = zzgek.zza(bArr, iZza2, zzgejVar);
                    int i15 = zzgejVar.zza + iZza7;
                    while (iZza7 < i15) {
                        zzggxVar3.zzg(zzgek.zze(bArr, iZza7));
                        iZza7 += 8;
                    }
                    if (iZza7 == i15) {
                        return iZza7;
                    }
                    throw zzggm.zzd();
                }
                if (i5 == 1) {
                    zzggx zzggxVar4 = (zzggx) zzggjVarZze;
                    zzggxVar4.zzg(zzgek.zze(bArr, i));
                    while (true) {
                        i10 = iZza2 + 8;
                        if (i10 < i2) {
                            iZza2 = zzgek.zza(bArr, i10, zzgejVar);
                            if (i3 == zzgejVar.zza) {
                                zzggxVar4.zzg(zzgek.zze(bArr, iZza2));
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
                    zzggb zzggbVar = (zzggb) zzggjVarZze;
                    int iZza8 = zzgek.zza(bArr, iZza2, zzgejVar);
                    int i16 = zzgejVar.zza + iZza8;
                    while (iZza8 < i16) {
                        zzggbVar.zzh(zzgek.zzd(bArr, iZza8));
                        iZza8 += 4;
                    }
                    if (iZza8 == i16) {
                        return iZza8;
                    }
                    throw zzggm.zzd();
                }
                if (i5 == 5) {
                    zzggb zzggbVar2 = (zzggb) zzggjVarZze;
                    zzggbVar2.zzh(zzgek.zzd(bArr, i));
                    while (true) {
                        i11 = iZza2 + 4;
                        if (i11 < i2) {
                            iZza2 = zzgek.zza(bArr, i11, zzgejVar);
                            if (i3 == zzgejVar.zza) {
                                zzggbVar2.zzh(zzgek.zzd(bArr, iZza2));
                            }
                        }
                    }
                    return i11;
                }
                return iZza2;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzgel zzgelVar = (zzgel) zzggjVarZze;
                    iZza = zzgek.zza(bArr, iZza2, zzgejVar);
                    int i17 = zzgejVar.zza + iZza;
                    while (iZza < i17) {
                        iZza = zzgek.zzc(bArr, iZza, zzgejVar);
                        zzgelVar.zzd(zzgejVar.zzb != 0);
                    }
                    if (iZza != i17) {
                        throw zzggm.zzd();
                    }
                    return iZza;
                }
                if (i5 == 0) {
                    zzgel zzgelVar2 = (zzgel) zzggjVarZze;
                    int iZzc2 = zzgek.zzc(bArr, iZza2, zzgejVar);
                    zzgelVar2.zzd(zzgejVar.zzb != 0);
                    while (iZzc2 < i2) {
                        int iZza9 = zzgek.zza(bArr, iZzc2, zzgejVar);
                        if (i3 != zzgejVar.zza) {
                            return iZzc2;
                        }
                        iZzc2 = zzgek.zzc(bArr, iZza9, zzgejVar);
                        zzgelVar2.zzd(zzgejVar.zzb != 0);
                    }
                    return iZzc2;
                }
                return iZza2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZza10 = zzgek.zza(bArr, iZza2, zzgejVar);
                        int i18 = zzgejVar.zza;
                        if (i18 < 0) {
                            throw zzggm.zze();
                        }
                        if (i18 == 0) {
                            zzggjVarZze.add("");
                        } else {
                            zzggjVarZze.add(new String(bArr, iZza10, i18, zzggk.zza));
                            iZza10 += i18;
                        }
                        while (iZza10 < i2) {
                            int iZza11 = zzgek.zza(bArr, iZza10, zzgejVar);
                            if (i3 != zzgejVar.zza) {
                                return iZza10;
                            }
                            iZza10 = zzgek.zza(bArr, iZza11, zzgejVar);
                            int i19 = zzgejVar.zza;
                            if (i19 < 0) {
                                throw zzggm.zze();
                            }
                            if (i19 == 0) {
                                zzggjVarZze.add("");
                            } else {
                                zzggjVarZze.add(new String(bArr, iZza10, i19, zzggk.zza));
                                iZza10 += i19;
                            }
                        }
                        return iZza10;
                    }
                    int iZza12 = zzgek.zza(bArr, iZza2, zzgejVar);
                    int i20 = zzgejVar.zza;
                    if (i20 < 0) {
                        throw zzggm.zze();
                    }
                    if (i20 == 0) {
                        zzggjVarZze.add("");
                    } else {
                        int i21 = iZza12 + i20;
                        if (!zzgjd.zzb(bArr, iZza12, i21)) {
                            throw zzggm.zzl();
                        }
                        zzggjVarZze.add(new String(bArr, iZza12, i20, zzggk.zza));
                        iZza12 = i21;
                    }
                    while (iZza12 < i2) {
                        int iZza13 = zzgek.zza(bArr, iZza12, zzgejVar);
                        if (i3 != zzgejVar.zza) {
                            return iZza12;
                        }
                        iZza12 = zzgek.zza(bArr, iZza13, zzgejVar);
                        int i22 = zzgejVar.zza;
                        if (i22 < 0) {
                            throw zzggm.zze();
                        }
                        if (i22 == 0) {
                            zzggjVarZze.add("");
                        } else {
                            int i23 = iZza12 + i22;
                            if (!zzgjd.zzb(bArr, iZza12, i23)) {
                                throw zzggm.zzl();
                            }
                            zzggjVarZze.add(new String(bArr, iZza12, i22, zzggk.zza));
                            iZza12 = i23;
                        }
                    }
                    return iZza12;
                }
                return iZza2;
            case 27:
                if (i5 == 2) {
                    return zzgek.zzm(zzw(i6), i3, bArr, i, i2, zzggjVarZze, zzgejVar);
                }
                return iZza2;
            case 28:
                if (i5 == 2) {
                    int iZza14 = zzgek.zza(bArr, iZza2, zzgejVar);
                    int i24 = zzgejVar.zza;
                    if (i24 < 0) {
                        throw zzggm.zze();
                    }
                    if (i24 > bArr.length - iZza14) {
                        throw zzggm.zzd();
                    }
                    if (i24 == 0) {
                        zzggjVarZze.add(zzgex.zzb);
                    } else {
                        zzggjVarZze.add(zzgex.zzs(bArr, iZza14, i24));
                        iZza14 += i24;
                    }
                    while (iZza14 < i2) {
                        int iZza15 = zzgek.zza(bArr, iZza14, zzgejVar);
                        if (i3 != zzgejVar.zza) {
                            return iZza14;
                        }
                        iZza14 = zzgek.zza(bArr, iZza15, zzgejVar);
                        int i25 = zzgejVar.zza;
                        if (i25 < 0) {
                            throw zzggm.zze();
                        }
                        if (i25 > bArr.length - iZza14) {
                            throw zzggm.zzd();
                        }
                        if (i25 == 0) {
                            zzggjVarZze.add(zzgex.zzb);
                        } else {
                            zzggjVarZze.add(zzgex.zzs(bArr, iZza14, i25));
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
                        iZza = zzgek.zzk(i3, bArr, i, i2, zzggjVarZze, zzgejVar);
                    }
                    return iZza2;
                }
                iZza = zzgek.zzl(bArr, iZza2, zzggjVarZze, zzgejVar);
                zzgga zzggaVar = (zzgga) t;
                zzgip zzgipVar = zzggaVar.zzc;
                if (zzgipVar == zzgip.zza()) {
                    zzgipVar = null;
                }
                Object objZzG = zzgib.zzG(i4, zzggjVarZze, zzy(i6), zzgipVar, this.zzo);
                if (objZzG != null) {
                    zzggaVar.zzc = (zzgip) objZzG;
                    return iZza;
                }
                return iZza;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzggb zzggbVar3 = (zzggb) zzggjVarZze;
                    int iZza16 = zzgek.zza(bArr, iZza2, zzgejVar);
                    int i26 = zzgejVar.zza + iZza16;
                    while (iZza16 < i26) {
                        iZza16 = zzgek.zza(bArr, iZza16, zzgejVar);
                        zzggbVar3.zzh(zzgfc.zzG(zzgejVar.zza));
                    }
                    if (iZza16 == i26) {
                        return iZza16;
                    }
                    throw zzggm.zzd();
                }
                if (i5 == 0) {
                    zzggb zzggbVar4 = (zzggb) zzggjVarZze;
                    int iZza17 = zzgek.zza(bArr, iZza2, zzgejVar);
                    zzggbVar4.zzh(zzgfc.zzG(zzgejVar.zza));
                    while (iZza17 < i2) {
                        int iZza18 = zzgek.zza(bArr, iZza17, zzgejVar);
                        if (i3 != zzgejVar.zza) {
                            return iZza17;
                        }
                        iZza17 = zzgek.zza(bArr, iZza18, zzgejVar);
                        zzggbVar4.zzh(zzgfc.zzG(zzgejVar.zza));
                    }
                    return iZza17;
                }
                return iZza2;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzggx zzggxVar5 = (zzggx) zzggjVarZze;
                    int iZza19 = zzgek.zza(bArr, iZza2, zzgejVar);
                    int i27 = zzgejVar.zza + iZza19;
                    while (iZza19 < i27) {
                        iZza19 = zzgek.zzc(bArr, iZza19, zzgejVar);
                        zzggxVar5.zzg(zzgfc.zzH(zzgejVar.zzb));
                    }
                    if (iZza19 == i27) {
                        return iZza19;
                    }
                    throw zzggm.zzd();
                }
                if (i5 == 0) {
                    zzggx zzggxVar6 = (zzggx) zzggjVarZze;
                    int iZzc3 = zzgek.zzc(bArr, iZza2, zzgejVar);
                    zzggxVar6.zzg(zzgfc.zzH(zzgejVar.zzb));
                    while (iZzc3 < i2) {
                        int iZza20 = zzgek.zza(bArr, iZzc3, zzgejVar);
                        if (i3 != zzgejVar.zza) {
                            return iZzc3;
                        }
                        iZzc3 = zzgek.zzc(bArr, iZza20, zzgejVar);
                        zzggxVar6.zzg(zzgfc.zzH(zzgejVar.zzb));
                    }
                    return iZzc3;
                }
                return iZza2;
            default:
                if (i5 == 3) {
                    zzghz zzghzVarZzw = zzw(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iZzj = zzgek.zzj(zzghzVarZzw, bArr, i, i2, i28, zzgejVar);
                    zzggjVarZze.add(zzgejVar.zzc);
                    while (iZzj < i2) {
                        int iZza21 = zzgek.zza(bArr, iZzj, zzgejVar);
                        if (i3 != zzgejVar.zza) {
                            return iZzj;
                        }
                        iZzj = zzgek.zzj(zzghzVarZzw, bArr, iZza21, i2, i28, zzgejVar);
                        zzggjVarZze.add(zzgejVar.zzc);
                    }
                    return iZzj;
                }
                return iZza2;
        }
    }

    private final <K, V> int zzu(T t, byte[] bArr, int i, int i2, int i3, long j, zzgej zzgejVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzx = zzx(i3);
        Object object = unsafe.getObject(t, j);
        if (zzghd.zzb(object)) {
            zzghc<K, V> zzghcVarZzc = zzghc.zza().zzc();
            zzghd.zzc(zzghcVarZzc, object);
            unsafe.putObject(t, j, zzghcVarZzc);
        }
        throw null;
    }

    private final int zzv(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgej zzgejVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(zzgek.zze(bArr, i))));
                unsafe.putInt(t, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(zzgek.zzd(bArr, i))));
                unsafe.putInt(t, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iZzc = zzgek.zzc(bArr, i, zzgejVar);
                unsafe.putObject(t, j, Long.valueOf(zzgejVar.zzb));
                unsafe.putInt(t, j2, i4);
                return iZzc;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iZza = zzgek.zza(bArr, i, zzgejVar);
                unsafe.putObject(t, j, Integer.valueOf(zzgejVar.zza));
                unsafe.putInt(t, j2, i4);
                return iZza;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(zzgek.zze(bArr, i)));
                unsafe.putInt(t, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(zzgek.zzd(bArr, i)));
                unsafe.putInt(t, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iZzc2 = zzgek.zzc(bArr, i, zzgejVar);
                unsafe.putObject(t, j, Boolean.valueOf(zzgejVar.zzb != 0));
                unsafe.putInt(t, j2, i4);
                return iZzc2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZza2 = zzgek.zza(bArr, i, zzgejVar);
                int i9 = zzgejVar.zza;
                if (i9 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !zzgjd.zzb(bArr, iZza2, iZza2 + i9)) {
                        throw zzggm.zzl();
                    }
                    unsafe.putObject(t, j, new String(bArr, iZza2, i9, zzggk.zza));
                    iZza2 += i9;
                }
                unsafe.putInt(t, j2, i4);
                return iZza2;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                int iZzi = zzgek.zzi(zzw(i8), bArr, i, i2, zzgejVar);
                Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, zzgejVar.zzc);
                } else {
                    unsafe.putObject(t, j, zzggk.zzi(object, zzgejVar.zzc));
                }
                unsafe.putInt(t, j2, i4);
                return iZzi;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 != 2) {
                    return i;
                }
                int iZzh = zzgek.zzh(bArr, i, zzgejVar);
                unsafe.putObject(t, j, zzgejVar.zzc);
                unsafe.putInt(t, j2, i4);
                return iZzh;
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int iZza3 = zzgek.zza(bArr, i, zzgejVar);
                int i10 = zzgejVar.zza;
                zzgge zzggeVarZzy = zzy(i8);
                if (zzggeVarZzy == null || zzggeVarZzy.zza(i10)) {
                    unsafe.putObject(t, j, Integer.valueOf(i10));
                    unsafe.putInt(t, j2, i4);
                } else {
                    zzg(t).zzh(i3, Long.valueOf(i10));
                }
                return iZza3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iZza4 = zzgek.zza(bArr, i, zzgejVar);
                unsafe.putObject(t, j, Integer.valueOf(zzgfc.zzG(zzgejVar.zza)));
                unsafe.putInt(t, j2, i4);
                return iZza4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iZzc3 = zzgek.zzc(bArr, i, zzgejVar);
                unsafe.putObject(t, j, Long.valueOf(zzgfc.zzH(zzgejVar.zzb)));
                unsafe.putInt(t, j2, i4);
                return iZzc3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                int iZzj = zzgek.zzj(zzw(i8), bArr, i, i2, (i3 & (-8)) | 4, zzgejVar);
                Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object2 == null) {
                    unsafe.putObject(t, j, zzgejVar.zzc);
                } else {
                    unsafe.putObject(t, j, zzggk.zzi(object2, zzgejVar.zzc));
                }
                unsafe.putInt(t, j2, i4);
                return iZzj;
            default:
                return i;
        }
    }

    private final zzghz zzw(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzghz zzghzVar = (zzghz) this.zzd[i3];
        if (zzghzVar != null) {
            return zzghzVar;
        }
        zzghz<T> zzghzVarZzb = zzghq.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzghzVarZzb;
        return zzghzVarZzb;
    }

    private final Object zzx(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzgge zzy(int i) {
        int i2 = i / 3;
        return (zzgge) this.zzd[i2 + i2 + 1];
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
    private final int zzz(T t, byte[] bArr, int i, int i2, zzgej zzgejVar) throws IOException {
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
        zzgejVar = zzgejVar;
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
                iZzb = zzgek.zzb(b, bArr, i19, zzgejVar);
                i3 = zzgejVar.zza;
            } else {
                i3 = b;
                iZzb = i19;
            }
            int i20 = i3 >>> 3;
            int i21 = i3 & 7;
            int iZzT = i20 > i15 ? this.zzT(i20, i17 / 3) : this.zzS(i20);
            if (iZzT == i14) {
                i4 = iZzb;
                i5 = i20;
                i6 = i14;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int i22 = this.zzc[iZzT + 1];
                int iZzF = zzF(i22);
                long j = i22 & i13;
                if (iZzF <= 17) {
                    int i23 = this.zzc[iZzT + 2];
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
                    switch (iZzF) {
                        case 0:
                            i5 = i20;
                            zzgejVar = zzgejVar;
                            i8 = iZzT;
                            i9 = i18;
                            if (i21 != 1) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                zzgiy.zzm(t, j, Double.longBitsToDouble(zzgek.zze(bArr, iZzb)));
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
                            i8 = iZzT;
                            if (i21 != 5) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                zzgiy.zzk(t, j, Float.intBitsToFloat(zzgek.zzd(bArr, iZzb)));
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
                            zzgejVar = zzgejVar;
                            i8 = iZzT;
                            i9 = i18;
                            if (i21 != 0) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzc = zzgek.zzc(bArr, iZzb, zzgejVar);
                                unsafe2.putLong(t, j, zzgejVar.zzb);
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
                            zzgejVar = zzgejVar;
                            i8 = iZzT;
                            i9 = i18;
                            if (i21 != 0) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzn = zzgek.zza(bArr, iZzb, zzgejVar);
                                unsafe2.putInt(t, j, zzgejVar.zza);
                                i18 = i9 | i24;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i5 = i20;
                            zzgejVar = zzgejVar;
                            i8 = iZzT;
                            i9 = i18;
                            if (i21 != 1) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                unsafe2.putLong(t, j, zzgek.zze(bArr, iZzb));
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
                            i8 = iZzT;
                            if (i21 != 5) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                unsafe2.putInt(t, j, zzgek.zzd(bArr, iZzb));
                                iZzn = iZzb + 4;
                                i18 = i9 | i24;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 7:
                            i5 = i20;
                            zzgejVar = zzgejVar;
                            i8 = iZzT;
                            i9 = i18;
                            if (i21 != 0) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                int iZzc2 = zzgek.zzc(bArr, iZzb, zzgejVar);
                                zzgiy.zzi(t, j, zzgejVar.zzb != 0);
                                i18 = i9 | i24;
                                iZzn = iZzc2;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 8:
                            i5 = i20;
                            zzgejVar = zzgejVar;
                            i8 = iZzT;
                            i9 = i18;
                            if (i21 != 2) {
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzn = (536870912 & i22) == 0 ? zzgek.zzf(bArr, iZzb, zzgejVar) : zzgek.zzg(bArr, iZzb, zzgejVar);
                                unsafe2.putObject(t, j, zzgejVar.zzc);
                                i18 = i9 | i24;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 9:
                            i5 = i20;
                            zzgejVar = zzgejVar;
                            i8 = iZzT;
                            if (i21 != 2) {
                                i9 = i18;
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzi = zzgek.zzi(this.zzw(i8), bArr, iZzb, i2, zzgejVar);
                                Object object = unsafe2.getObject(t, j);
                                if (object == null) {
                                    unsafe2.putObject(t, j, zzgejVar.zzc);
                                } else {
                                    unsafe2.putObject(t, j, zzggk.zzi(object, zzgejVar.zzc));
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
                            zzgejVar = zzgejVar;
                            i8 = iZzT;
                            if (i21 != 2) {
                                i9 = i18;
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzi = zzgek.zzh(bArr, iZzb, zzgejVar);
                                unsafe2.putObject(t, j, zzgejVar.zzc);
                                i18 |= i24;
                                iZzn = iZzi;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 12:
                            i5 = i20;
                            zzgejVar = zzgejVar;
                            i8 = iZzT;
                            if (i21 != 0) {
                                i9 = i18;
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzi = zzgek.zza(bArr, iZzb, zzgejVar);
                                unsafe2.putInt(t, j, zzgejVar.zza);
                                i18 |= i24;
                                iZzn = iZzi;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 15:
                            i5 = i20;
                            zzgejVar = zzgejVar;
                            i8 = iZzT;
                            if (i21 != 0) {
                                i9 = i18;
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iZzn = zzgek.zza(bArr, iZzb, zzgejVar);
                                unsafe2.putInt(t, j, zzgfc.zzG(zzgejVar.zza));
                                i18 |= i24;
                                i17 = i8;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 16:
                            if (i21 != 0) {
                                i5 = i20;
                                i8 = iZzT;
                                i9 = i18;
                                i18 = i9;
                                i4 = iZzb;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                zzgejVar = zzgejVar;
                                iZzc = zzgek.zzc(bArr, iZzb, zzgejVar);
                                i8 = iZzT;
                                i5 = i20;
                                unsafe2.putLong(t, j, zzgfc.zzH(zzgejVar.zzb));
                                i18 |= i24;
                                i17 = i8;
                                iZzn = iZzc;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        default:
                            i5 = i20;
                            i8 = iZzT;
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
                    zzgejVar = zzgejVar;
                    if (iZzF != 27) {
                        if (iZzF <= 49) {
                            i11 = i26;
                            int i27 = iZzb;
                            i10 = i16;
                            i7 = iZzT;
                            i6 = -1;
                            unsafe = unsafe2;
                            iZzn = zzt(t, bArr, iZzb, i2, i3, i5, i21, iZzT, i22, iZzF, j, zzgejVar);
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
                            i7 = iZzT;
                            unsafe = unsafe2;
                            i11 = i26;
                            i6 = -1;
                            i12 = iZzb;
                            if (iZzF == 50) {
                                if (i21 == 2) {
                                    iZzn = zzu(t, bArr, i12, i2, i7, j, zzgejVar);
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
                                iZzn = zzv(t, bArr, i12, i2, i3, i5, i21, i22, iZzF, j, i7, zzgejVar);
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
                        zzggj zzggjVarZze = (zzggj) unsafe2.getObject(t, j);
                        if (!zzggjVarZze.zza()) {
                            int size = zzggjVarZze.size();
                            zzggjVarZze = zzggjVarZze.zze(size == 0 ? 10 : size + size);
                            unsafe2.putObject(t, j, zzggjVarZze);
                        }
                        iZzn = zzgek.zzm(this.zzw(iZzT), i3, bArr, iZzb, i2, zzggjVarZze, zzgejVar);
                        i17 = iZzT;
                        i18 = i26;
                        i15 = i5;
                        i14 = -1;
                        this = this;
                    } else {
                        i12 = iZzb;
                        i10 = i16;
                        i7 = iZzT;
                        unsafe = unsafe2;
                        i11 = i26;
                        i6 = -1;
                    }
                    i4 = i12;
                    i18 = i11;
                    i16 = i10;
                }
            }
            iZzn = zzgek.zzn(i3, bArr, i4, i2, zzg(t), zzgejVar);
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
        throw zzggm.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final T zza() {
        return (T) ((zzgga) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final boolean zzb(T t, T t2) {
        boolean zZzD;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzD = zzD(i);
            long j = iZzD & 1048575;
            switch (zzF(iZzD)) {
                case 0:
                    if (!zzM(t, t2, i) || Double.doubleToLongBits(zzgiy.zzl(t, j)) != Double.doubleToLongBits(zzgiy.zzl(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzM(t, t2, i) || Float.floatToIntBits(zzgiy.zzj(t, j)) != Float.floatToIntBits(zzgiy.zzj(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzM(t, t2, i) || zzgiy.zzf(t, j) != zzgiy.zzf(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzM(t, t2, i) || zzgiy.zzf(t, j) != zzgiy.zzf(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzM(t, t2, i) || zzgiy.zzd(t, j) != zzgiy.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzM(t, t2, i) || zzgiy.zzf(t, j) != zzgiy.zzf(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzM(t, t2, i) || zzgiy.zzd(t, j) != zzgiy.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzM(t, t2, i) || zzgiy.zzh(t, j) != zzgiy.zzh(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzM(t, t2, i) || !zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzM(t, t2, i) || !zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzM(t, t2, i) || !zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzM(t, t2, i) || zzgiy.zzd(t, j) != zzgiy.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzM(t, t2, i) || zzgiy.zzd(t, j) != zzgiy.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzM(t, t2, i) || zzgiy.zzd(t, j) != zzgiy.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzM(t, t2, i) || zzgiy.zzf(t, j) != zzgiy.zzf(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzM(t, t2, i) || zzgiy.zzd(t, j) != zzgiy.zzd(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzM(t, t2, i) || zzgiy.zzf(t, j) != zzgiy.zzf(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzM(t, t2, i) || !zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j))) {
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
                    zZzD = zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j));
                    break;
                case 50:
                    zZzD = zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j));
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
                    long jZzE = zzE(i) & 1048575;
                    if (zzgiy.zzd(t, jZzE) != zzgiy.zzd(t2, jZzE) || !zzgib.zzD(zzgiy.zzn(t, j), zzgiy.zzn(t2, j))) {
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
        if (!this.zzo.zzj(t).equals(this.zzo.zzj(t2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zzb(t);
        this.zzp.zzb(t2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final int zzc(T t) {
        int i;
        int iZze;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzD = zzD(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzD;
            int iHashCode = 37;
            switch (zzF(iZzD)) {
                case 0:
                    i = i2 * 53;
                    iZze = zzggk.zze(Double.doubleToLongBits(zzgiy.zzl(t, j)));
                    i2 = i + iZze;
                    break;
                case 1:
                    i = i2 * 53;
                    iZze = Float.floatToIntBits(zzgiy.zzj(t, j));
                    i2 = i + iZze;
                    break;
                case 2:
                    i = i2 * 53;
                    iZze = zzggk.zze(zzgiy.zzf(t, j));
                    i2 = i + iZze;
                    break;
                case 3:
                    i = i2 * 53;
                    iZze = zzggk.zze(zzgiy.zzf(t, j));
                    i2 = i + iZze;
                    break;
                case 4:
                    i = i2 * 53;
                    iZze = zzgiy.zzd(t, j);
                    i2 = i + iZze;
                    break;
                case 5:
                    i = i2 * 53;
                    iZze = zzggk.zze(zzgiy.zzf(t, j));
                    i2 = i + iZze;
                    break;
                case 6:
                    i = i2 * 53;
                    iZze = zzgiy.zzd(t, j);
                    i2 = i + iZze;
                    break;
                case 7:
                    i = i2 * 53;
                    iZze = zzggk.zzf(zzgiy.zzh(t, j));
                    i2 = i + iZze;
                    break;
                case 8:
                    i = i2 * 53;
                    iZze = ((String) zzgiy.zzn(t, j)).hashCode();
                    i2 = i + iZze;
                    break;
                case 9:
                    Object objZzn = zzgiy.zzn(t, j);
                    if (objZzn != null) {
                        iHashCode = objZzn.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZze = zzgiy.zzn(t, j).hashCode();
                    i2 = i + iZze;
                    break;
                case 11:
                    i = i2 * 53;
                    iZze = zzgiy.zzd(t, j);
                    i2 = i + iZze;
                    break;
                case 12:
                    i = i2 * 53;
                    iZze = zzgiy.zzd(t, j);
                    i2 = i + iZze;
                    break;
                case 13:
                    i = i2 * 53;
                    iZze = zzgiy.zzd(t, j);
                    i2 = i + iZze;
                    break;
                case 14:
                    i = i2 * 53;
                    iZze = zzggk.zze(zzgiy.zzf(t, j));
                    i2 = i + iZze;
                    break;
                case 15:
                    i = i2 * 53;
                    iZze = zzgiy.zzd(t, j);
                    i2 = i + iZze;
                    break;
                case 16:
                    i = i2 * 53;
                    iZze = zzggk.zze(zzgiy.zzf(t, j));
                    i2 = i + iZze;
                    break;
                case 17:
                    Object objZzn2 = zzgiy.zzn(t, j);
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
                    iZze = zzgiy.zzn(t, j).hashCode();
                    i2 = i + iZze;
                    break;
                case 50:
                    i = i2 * 53;
                    iZze = zzgiy.zzn(t, j).hashCode();
                    i2 = i + iZze;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzggk.zze(Double.doubleToLongBits(zzH(t, j)));
                        i2 = i + iZze;
                    }
                    break;
                case 52:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = Float.floatToIntBits(zzI(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 53:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzggk.zze(zzK(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 54:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzggk.zze(zzK(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 55:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzJ(t, j);
                        i2 = i + iZze;
                    }
                    break;
                case 56:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzggk.zze(zzK(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 57:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzJ(t, j);
                        i2 = i + iZze;
                    }
                    break;
                case 58:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzggk.zzf(zzL(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 59:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = ((String) zzgiy.zzn(t, j)).hashCode();
                        i2 = i + iZze;
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzgiy.zzn(t, j).hashCode();
                        i2 = i + iZze;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzgiy.zzn(t, j).hashCode();
                        i2 = i + iZze;
                    }
                    break;
                case 62:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzJ(t, j);
                        i2 = i + iZze;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzJ(t, j);
                        i2 = i + iZze;
                    }
                    break;
                case 64:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzJ(t, j);
                        i2 = i + iZze;
                    }
                    break;
                case 65:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzggk.zze(zzK(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 66:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzJ(t, j);
                        i2 = i + iZze;
                    }
                    break;
                case 67:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzggk.zze(zzK(t, j));
                        i2 = i + iZze;
                    }
                    break;
                case 68:
                    if (zzQ(t, i4, i3)) {
                        i = i2 * 53;
                        iZze = zzgiy.zzn(t, j).hashCode();
                        i2 = i + iZze;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzo.zzj(t).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzp.zzb(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final int zze(T t) {
        return this.zzj ? zzs(t) : zzr(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzf(T t, zzght zzghtVar, zzgfm zzgfmVar) throws IOException {
        zzgfmVar.getClass();
        zzgio<?, ?> zzgioVar = this.zzo;
        zzgfn<?> zzgfnVar = this.zzp;
        zzgfr zzgfrVarZzc = null;
        Object objZzA = null;
        while (true) {
            try {
                int iZzb = zzghtVar.zzb();
                int iZzS = zzS(iZzb);
                if (iZzS >= 0) {
                    int iZzD = zzD(iZzS);
                    try {
                        switch (zzF(iZzD)) {
                            case 0:
                                zzgiy.zzm(t, iZzD & 1048575, zzghtVar.zze());
                                zzP(t, iZzS);
                                break;
                            case 1:
                                zzgiy.zzk(t, iZzD & 1048575, zzghtVar.zzf());
                                zzP(t, iZzS);
                                break;
                            case 2:
                                zzgiy.zzg(t, iZzD & 1048575, zzghtVar.zzh());
                                zzP(t, iZzS);
                                break;
                            case 3:
                                zzgiy.zzg(t, iZzD & 1048575, zzghtVar.zzg());
                                zzP(t, iZzS);
                                break;
                            case 4:
                                zzgiy.zze(t, iZzD & 1048575, zzghtVar.zzi());
                                zzP(t, iZzS);
                                break;
                            case 5:
                                zzgiy.zzg(t, iZzD & 1048575, zzghtVar.zzj());
                                zzP(t, iZzS);
                                break;
                            case 6:
                                zzgiy.zze(t, iZzD & 1048575, zzghtVar.zzk());
                                zzP(t, iZzS);
                                break;
                            case 7:
                                zzgiy.zzi(t, iZzD & 1048575, zzghtVar.zzl());
                                zzP(t, iZzS);
                                break;
                            case 8:
                                zzC(t, iZzD, zzghtVar);
                                zzP(t, iZzS);
                                break;
                            case 9:
                                if (zzO(t, iZzS)) {
                                    long j = iZzD & 1048575;
                                    zzgiy.zzo(t, j, zzggk.zzi(zzgiy.zzn(t, j), zzghtVar.zzo(zzw(iZzS), zzgfmVar)));
                                } else {
                                    zzgiy.zzo(t, iZzD & 1048575, zzghtVar.zzo(zzw(iZzS), zzgfmVar));
                                    zzP(t, iZzS);
                                }
                                break;
                            case 10:
                                zzgiy.zzo(t, iZzD & 1048575, zzghtVar.zzq());
                                zzP(t, iZzS);
                                break;
                            case 11:
                                zzgiy.zze(t, iZzD & 1048575, zzghtVar.zzr());
                                zzP(t, iZzS);
                                break;
                            case 12:
                                int iZzs = zzghtVar.zzs();
                                zzgge zzggeVarZzy = zzy(iZzS);
                                if (zzggeVarZzy == null || zzggeVarZzy.zza(iZzs)) {
                                    zzgiy.zze(t, iZzD & 1048575, iZzs);
                                    zzP(t, iZzS);
                                } else {
                                    objZzA = zzgib.zzH(iZzb, iZzs, objZzA, zzgioVar);
                                }
                                break;
                            case 13:
                                zzgiy.zze(t, iZzD & 1048575, zzghtVar.zzt());
                                zzP(t, iZzS);
                                break;
                            case 14:
                                zzgiy.zzg(t, iZzD & 1048575, zzghtVar.zzu());
                                zzP(t, iZzS);
                                break;
                            case 15:
                                zzgiy.zze(t, iZzD & 1048575, zzghtVar.zzv());
                                zzP(t, iZzS);
                                break;
                            case 16:
                                zzgiy.zzg(t, iZzD & 1048575, zzghtVar.zzw());
                                zzP(t, iZzS);
                                break;
                            case 17:
                                if (zzO(t, iZzS)) {
                                    long j2 = iZzD & 1048575;
                                    zzgiy.zzo(t, j2, zzggk.zzi(zzgiy.zzn(t, j2), zzghtVar.zzp(zzw(iZzS), zzgfmVar)));
                                } else {
                                    zzgiy.zzo(t, iZzD & 1048575, zzghtVar.zzp(zzw(iZzS), zzgfmVar));
                                    zzP(t, iZzS);
                                }
                                break;
                            case 18:
                                zzghtVar.zzx(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 19:
                                zzghtVar.zzy(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 20:
                                zzghtVar.zzA(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 21:
                                zzghtVar.zzz(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 22:
                                zzghtVar.zzB(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 23:
                                zzghtVar.zzC(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 24:
                                zzghtVar.zzD(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 25:
                                zzghtVar.zzE(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 26:
                                if (zzG(iZzD)) {
                                    ((zzgfd) zzghtVar).zzF(this.zzn.zza(t, iZzD & 1048575), true);
                                } else {
                                    ((zzgfd) zzghtVar).zzF(this.zzn.zza(t, iZzD & 1048575), false);
                                }
                                break;
                            case 27:
                                zzghtVar.zzG(this.zzn.zza(t, iZzD & 1048575), zzw(iZzS), zzgfmVar);
                                break;
                            case 28:
                                zzghtVar.zzI(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                zzghtVar.zzJ(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 30:
                                List<Integer> listZza = this.zzn.zza(t, iZzD & 1048575);
                                zzghtVar.zzK(listZza);
                                objZzA = zzgib.zzG(iZzb, listZza, zzy(iZzS), objZzA, zzgioVar);
                                break;
                            case 31:
                                zzghtVar.zzL(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 32:
                                zzghtVar.zzM(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 33:
                                zzghtVar.zzN(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 34:
                                zzghtVar.zzO(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 35:
                                zzghtVar.zzx(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 36:
                                zzghtVar.zzy(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 37:
                                zzghtVar.zzA(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 38:
                                zzghtVar.zzz(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 39:
                                zzghtVar.zzB(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 40:
                                zzghtVar.zzC(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 41:
                                zzghtVar.zzD(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 42:
                                zzghtVar.zzE(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 43:
                                zzghtVar.zzJ(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 44:
                                List<Integer> listZza2 = this.zzn.zza(t, iZzD & 1048575);
                                zzghtVar.zzK(listZza2);
                                objZzA = zzgib.zzG(iZzb, listZza2, zzy(iZzS), objZzA, zzgioVar);
                                break;
                            case 45:
                                zzghtVar.zzL(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 46:
                                zzghtVar.zzM(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 47:
                                zzghtVar.zzN(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case 48:
                                zzghtVar.zzO(this.zzn.zza(t, iZzD & 1048575));
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                zzghtVar.zzH(this.zzn.zza(t, iZzD & 1048575), zzw(iZzS), zzgfmVar);
                                break;
                            case 50:
                                Object objZzx = zzx(iZzS);
                                long jZzD = zzD(iZzS) & 1048575;
                                Object objZzn = zzgiy.zzn(t, jZzD);
                                if (objZzn == null) {
                                    objZzn = zzghc.zza().zzc();
                                    zzgiy.zzo(t, jZzD, objZzn);
                                } else if (zzghd.zzb(objZzn)) {
                                    Object objZzc = zzghc.zza().zzc();
                                    zzghd.zzc(objZzc, objZzn);
                                    zzgiy.zzo(t, jZzD, objZzc);
                                    objZzn = objZzc;
                                }
                                throw null;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                zzgiy.zzo(t, iZzD & 1048575, Double.valueOf(zzghtVar.zze()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case 52:
                                zzgiy.zzo(t, iZzD & 1048575, Float.valueOf(zzghtVar.zzf()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case 53:
                                zzgiy.zzo(t, iZzD & 1048575, Long.valueOf(zzghtVar.zzh()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case 54:
                                zzgiy.zzo(t, iZzD & 1048575, Long.valueOf(zzghtVar.zzg()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case 55:
                                zzgiy.zzo(t, iZzD & 1048575, Integer.valueOf(zzghtVar.zzi()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case 56:
                                zzgiy.zzo(t, iZzD & 1048575, Long.valueOf(zzghtVar.zzj()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case 57:
                                zzgiy.zzo(t, iZzD & 1048575, Integer.valueOf(zzghtVar.zzk()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case 58:
                                zzgiy.zzo(t, iZzD & 1048575, Boolean.valueOf(zzghtVar.zzl()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case 59:
                                zzC(t, iZzD, zzghtVar);
                                zzR(t, iZzb, iZzS);
                                break;
                            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                if (zzQ(t, iZzb, iZzS)) {
                                    long j3 = iZzD & 1048575;
                                    zzgiy.zzo(t, j3, zzggk.zzi(zzgiy.zzn(t, j3), zzghtVar.zzo(zzw(iZzS), zzgfmVar)));
                                } else {
                                    zzgiy.zzo(t, iZzD & 1048575, zzghtVar.zzo(zzw(iZzS), zzgfmVar));
                                    zzP(t, iZzS);
                                }
                                zzR(t, iZzb, iZzS);
                                break;
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                zzgiy.zzo(t, iZzD & 1048575, zzghtVar.zzq());
                                zzR(t, iZzb, iZzS);
                                break;
                            case 62:
                                zzgiy.zzo(t, iZzD & 1048575, Integer.valueOf(zzghtVar.zzr()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                int iZzs2 = zzghtVar.zzs();
                                zzgge zzggeVarZzy2 = zzy(iZzS);
                                if (zzggeVarZzy2 == null || zzggeVarZzy2.zza(iZzs2)) {
                                    zzgiy.zzo(t, iZzD & 1048575, Integer.valueOf(iZzs2));
                                    zzR(t, iZzb, iZzS);
                                } else {
                                    objZzA = zzgib.zzH(iZzb, iZzs2, objZzA, zzgioVar);
                                }
                                break;
                            case 64:
                                zzgiy.zzo(t, iZzD & 1048575, Integer.valueOf(zzghtVar.zzt()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case 65:
                                zzgiy.zzo(t, iZzD & 1048575, Long.valueOf(zzghtVar.zzu()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case 66:
                                zzgiy.zzo(t, iZzD & 1048575, Integer.valueOf(zzghtVar.zzv()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case 67:
                                zzgiy.zzo(t, iZzD & 1048575, Long.valueOf(zzghtVar.zzw()));
                                zzR(t, iZzb, iZzS);
                                break;
                            case 68:
                                zzgiy.zzo(t, iZzD & 1048575, zzghtVar.zzp(zzw(iZzS), zzgfmVar));
                                zzR(t, iZzb, iZzS);
                                break;
                            default:
                                if (objZzA == null) {
                                    objZzA = zzgioVar.zzg();
                                }
                                if (!zzgioVar.zzn((Object) objZzA, zzghtVar)) {
                                    for (int i = this.zzl; i < this.zzm; i++) {
                                        objZzA = zzA(t, this.zzk[i], objZzA, zzgioVar);
                                    }
                                    if (objZzA != null) {
                                        zzgioVar.zzl(t, (Object) objZzA);
                                        return;
                                    }
                                    return;
                                }
                                break;
                                break;
                        }
                    } catch (zzggl unused) {
                        zzgioVar.zza(zzghtVar);
                        if (objZzA == null) {
                            objZzA = zzgioVar.zzk(t);
                        }
                        if (!zzgioVar.zzn((Object) objZzA, zzghtVar)) {
                            for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                                objZzA = zzA(t, this.zzk[i2], objZzA, zzgioVar);
                            }
                            if (objZzA != null) {
                                zzgioVar.zzl(t, (Object) objZzA);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (iZzb == Integer.MAX_VALUE) {
                        for (int i3 = this.zzl; i3 < this.zzm; i3++) {
                            objZzA = zzA(t, this.zzk[i3], objZzA, zzgioVar);
                        }
                        if (objZzA != null) {
                            zzgioVar.zzl(t, (Object) objZzA);
                            return;
                        }
                        return;
                    }
                    Object objZzf = !this.zzh ? null : zzgfnVar.zzf(zzgfmVar, this.zzg, iZzb);
                    if (objZzf != null) {
                        if (zzgfrVarZzc == null) {
                            zzgfrVarZzc = zzgfnVar.zzc(t);
                        }
                        zzgfr zzgfrVar = zzgfrVarZzc;
                        objZzA = zzgfnVar.zze(zzghtVar, objZzf, zzgfmVar, zzgfrVar, objZzA, zzgioVar);
                        zzgfrVarZzc = zzgfrVar;
                    } else {
                        zzgioVar.zza(zzghtVar);
                        if (objZzA == null) {
                            objZzA = zzgioVar.zzk(t);
                        }
                        if (!zzgioVar.zzn((Object) objZzA, zzghtVar)) {
                            for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                                objZzA = zzA(t, this.zzk[i4], objZzA, zzgioVar);
                            }
                            if (objZzA != null) {
                                zzgioVar.zzl(t, (Object) objZzA);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                    objZzA = zzA(t, this.zzk[i5], objZzA, zzgioVar);
                }
                if (objZzA != null) {
                    zzgioVar.zzl(t, (Object) objZzA);
                }
                throw th;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzh(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.ads.zzgej r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzghl.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgej):int");
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzi(T t, byte[] bArr, int i, int i2, zzgej zzgejVar) throws IOException {
        if (this.zzj) {
            zzz(t, bArr, i, i2, zzgejVar);
        } else {
            zzh(t, bArr, i, i2, 0, zzgejVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzj(T t) {
        int i;
        int i2 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i2 >= i) {
                break;
            }
            long jZzD = zzD(this.zzk[i2]) & 1048575;
            Object objZzn = zzgiy.zzn(t, jZzD);
            if (objZzn != null) {
                ((zzghc) objZzn).zzd();
                zzgiy.zzo(t, jZzD, objZzn);
            }
            i2++;
        }
        int length = this.zzk.length;
        while (i < length) {
            this.zzn.zzb(t, this.zzk[i]);
            i++;
        }
        this.zzo.zzm(t);
        if (this.zzh) {
            this.zzp.zzd(t);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3 A[LOOP:1: B:45:0x00b2->B:50:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzghz
    public final boolean zzk(T t) {
        int i;
        int i2;
        List list;
        zzghz zzghzVarZzw;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzl) {
            int i7 = this.zzk[i6];
            int i8 = this.zzc[i7];
            int iZzD = zzD(i7);
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
            if ((268435456 & iZzD) != 0 && !zzN(t, i7, i, i2, i11)) {
                return false;
            }
            int iZzF = zzF(iZzD);
            if (iZzF == 9 || iZzF == 17) {
                if (zzN(t, i7, i, i2, i11) && !zzB(t, iZzD, zzw(i7))) {
                    return false;
                }
            } else if (iZzF == 27) {
                list = (List) zzgiy.zzn(t, iZzD & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzghzVarZzw = zzw(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzghzVarZzw.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzF == 60 || iZzF == 68) {
                if (zzQ(t, i8, i7) && !zzB(t, iZzD, zzw(i7))) {
                    return false;
                }
            } else if (iZzF == 49) {
                list = (List) zzgiy.zzn(t, iZzD & 1048575);
                if (list.isEmpty()) {
                    zzghzVarZzw = zzw(i7);
                    while (i3 < list.size()) {
                        if (!zzghzVarZzw.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzF == 50 && !((zzghc) zzgiy.zzn(t, iZzD & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zzb(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzn(T t, zzgfi zzgfiVar) throws IOException {
        if (!this.zzj) {
            zzV(t, zzgfiVar);
            return;
        }
        if (this.zzh) {
            this.zzp.zzb(t);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzD = zzD(i);
            int i2 = this.zzc[i];
            switch (zzF(iZzD)) {
                case 0:
                    if (zzO(t, i)) {
                        zzgfiVar.zzf(i2, zzgiy.zzl(t, iZzD & 1048575));
                    }
                    break;
                case 1:
                    if (zzO(t, i)) {
                        zzgfiVar.zze(i2, zzgiy.zzj(t, iZzD & 1048575));
                    }
                    break;
                case 2:
                    if (zzO(t, i)) {
                        zzgfiVar.zzc(i2, zzgiy.zzf(t, iZzD & 1048575));
                    }
                    break;
                case 3:
                    if (zzO(t, i)) {
                        zzgfiVar.zzh(i2, zzgiy.zzf(t, iZzD & 1048575));
                    }
                    break;
                case 4:
                    if (zzO(t, i)) {
                        zzgfiVar.zzi(i2, zzgiy.zzd(t, iZzD & 1048575));
                    }
                    break;
                case 5:
                    if (zzO(t, i)) {
                        zzgfiVar.zzj(i2, zzgiy.zzf(t, iZzD & 1048575));
                    }
                    break;
                case 6:
                    if (zzO(t, i)) {
                        zzgfiVar.zzk(i2, zzgiy.zzd(t, iZzD & 1048575));
                    }
                    break;
                case 7:
                    if (zzO(t, i)) {
                        zzgfiVar.zzl(i2, zzgiy.zzh(t, iZzD & 1048575));
                    }
                    break;
                case 8:
                    if (zzO(t, i)) {
                        zzX(i2, zzgiy.zzn(t, iZzD & 1048575), zzgfiVar);
                    }
                    break;
                case 9:
                    if (zzO(t, i)) {
                        zzgfiVar.zzr(i2, zzgiy.zzn(t, iZzD & 1048575), zzw(i));
                    }
                    break;
                case 10:
                    if (zzO(t, i)) {
                        zzgfiVar.zzn(i2, (zzgex) zzgiy.zzn(t, iZzD & 1048575));
                    }
                    break;
                case 11:
                    if (zzO(t, i)) {
                        zzgfiVar.zzo(i2, zzgiy.zzd(t, iZzD & 1048575));
                    }
                    break;
                case 12:
                    if (zzO(t, i)) {
                        zzgfiVar.zzg(i2, zzgiy.zzd(t, iZzD & 1048575));
                    }
                    break;
                case 13:
                    if (zzO(t, i)) {
                        zzgfiVar.zzb(i2, zzgiy.zzd(t, iZzD & 1048575));
                    }
                    break;
                case 14:
                    if (zzO(t, i)) {
                        zzgfiVar.zzd(i2, zzgiy.zzf(t, iZzD & 1048575));
                    }
                    break;
                case 15:
                    if (zzO(t, i)) {
                        zzgfiVar.zzp(i2, zzgiy.zzd(t, iZzD & 1048575));
                    }
                    break;
                case 16:
                    if (zzO(t, i)) {
                        zzgfiVar.zzq(i2, zzgiy.zzf(t, iZzD & 1048575));
                    }
                    break;
                case 17:
                    if (zzO(t, i)) {
                        zzgfiVar.zzs(i2, zzgiy.zzn(t, iZzD & 1048575), zzw(i));
                    }
                    break;
                case 18:
                    zzgib.zzJ(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 19:
                    zzgib.zzK(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 20:
                    zzgib.zzL(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 21:
                    zzgib.zzM(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 22:
                    zzgib.zzQ(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 23:
                    zzgib.zzO(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 24:
                    zzgib.zzT(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 25:
                    zzgib.zzW(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 26:
                    zzgib.zzX(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar);
                    break;
                case 27:
                    zzgib.zzZ(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, zzw(i));
                    break;
                case 28:
                    zzgib.zzY(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    zzgib.zzR(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 30:
                    zzgib.zzV(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 31:
                    zzgib.zzU(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 32:
                    zzgib.zzP(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 33:
                    zzgib.zzS(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 34:
                    zzgib.zzN(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, false);
                    break;
                case 35:
                    zzgib.zzJ(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 36:
                    zzgib.zzK(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 37:
                    zzgib.zzL(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 38:
                    zzgib.zzM(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 39:
                    zzgib.zzQ(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 40:
                    zzgib.zzO(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 41:
                    zzgib.zzT(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 42:
                    zzgib.zzW(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 43:
                    zzgib.zzR(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 44:
                    zzgib.zzV(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 45:
                    zzgib.zzU(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 46:
                    zzgib.zzP(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 47:
                    zzgib.zzS(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case 48:
                    zzgib.zzN(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzgib.zzaa(this.zzc[i], (List) zzgiy.zzn(t, iZzD & 1048575), zzgfiVar, zzw(i));
                    break;
                case 50:
                    zzW(zzgfiVar, i2, zzgiy.zzn(t, iZzD & 1048575), i);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzf(i2, zzH(t, iZzD & 1048575));
                    }
                    break;
                case 52:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zze(i2, zzI(t, iZzD & 1048575));
                    }
                    break;
                case 53:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzc(i2, zzK(t, iZzD & 1048575));
                    }
                    break;
                case 54:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzh(i2, zzK(t, iZzD & 1048575));
                    }
                    break;
                case 55:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzi(i2, zzJ(t, iZzD & 1048575));
                    }
                    break;
                case 56:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzj(i2, zzK(t, iZzD & 1048575));
                    }
                    break;
                case 57:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzk(i2, zzJ(t, iZzD & 1048575));
                    }
                    break;
                case 58:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzl(i2, zzL(t, iZzD & 1048575));
                    }
                    break;
                case 59:
                    if (zzQ(t, i2, i)) {
                        zzX(i2, zzgiy.zzn(t, iZzD & 1048575), zzgfiVar);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzr(i2, zzgiy.zzn(t, iZzD & 1048575), zzw(i));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzn(i2, (zzgex) zzgiy.zzn(t, iZzD & 1048575));
                    }
                    break;
                case 62:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzo(i2, zzJ(t, iZzD & 1048575));
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzg(i2, zzJ(t, iZzD & 1048575));
                    }
                    break;
                case 64:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzb(i2, zzJ(t, iZzD & 1048575));
                    }
                    break;
                case 65:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzd(i2, zzK(t, iZzD & 1048575));
                    }
                    break;
                case 66:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzp(i2, zzJ(t, iZzD & 1048575));
                    }
                    break;
                case 67:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzq(i2, zzK(t, iZzD & 1048575));
                    }
                    break;
                case 68:
                    if (zzQ(t, i2, i)) {
                        zzgfiVar.zzs(i2, zzgiy.zzn(t, iZzD & 1048575), zzw(i));
                    }
                    break;
            }
        }
        zzgio<?, ?> zzgioVar = this.zzo;
        zzgioVar.zzr(zzgioVar.zzj(t), zzgfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzghz
    public final void zzd(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzD = zzD(i);
            long j = 1048575 & iZzD;
            int i2 = this.zzc[i];
            switch (zzF(iZzD)) {
                case 0:
                    if (zzO(t2, i)) {
                        zzgiy.zzm(t, j, zzgiy.zzl(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 1:
                    if (zzO(t2, i)) {
                        zzgiy.zzk(t, j, zzgiy.zzj(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 2:
                    if (zzO(t2, i)) {
                        zzgiy.zzg(t, j, zzgiy.zzf(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 3:
                    if (zzO(t2, i)) {
                        zzgiy.zzg(t, j, zzgiy.zzf(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 4:
                    if (zzO(t2, i)) {
                        zzgiy.zze(t, j, zzgiy.zzd(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 5:
                    if (zzO(t2, i)) {
                        zzgiy.zzg(t, j, zzgiy.zzf(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 6:
                    if (zzO(t2, i)) {
                        zzgiy.zze(t, j, zzgiy.zzd(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 7:
                    if (zzO(t2, i)) {
                        zzgiy.zzi(t, j, zzgiy.zzh(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 8:
                    if (zzO(t2, i)) {
                        zzgiy.zzo(t, j, zzgiy.zzn(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 9:
                    zzp(t, t2, i);
                    break;
                case 10:
                    if (zzO(t2, i)) {
                        zzgiy.zzo(t, j, zzgiy.zzn(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 11:
                    if (zzO(t2, i)) {
                        zzgiy.zze(t, j, zzgiy.zzd(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 12:
                    if (zzO(t2, i)) {
                        zzgiy.zze(t, j, zzgiy.zzd(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 13:
                    if (zzO(t2, i)) {
                        zzgiy.zze(t, j, zzgiy.zzd(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 14:
                    if (zzO(t2, i)) {
                        zzgiy.zzg(t, j, zzgiy.zzf(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 15:
                    if (zzO(t2, i)) {
                        zzgiy.zze(t, j, zzgiy.zzd(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 16:
                    if (zzO(t2, i)) {
                        zzgiy.zzg(t, j, zzgiy.zzf(t2, j));
                        zzP(t, i);
                    }
                    break;
                case 17:
                    zzp(t, t2, i);
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
                    this.zzn.zzc(t, t2, j);
                    break;
                case 50:
                    zzgib.zzI(this.zzr, t, t2, j);
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
                    if (zzQ(t2, i2, i)) {
                        zzgiy.zzo(t, j, zzgiy.zzn(t2, j));
                        zzR(t, i2, i);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzq(t, t2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzQ(t2, i2, i)) {
                        zzgiy.zzo(t, j, zzgiy.zzn(t2, j));
                        zzR(t, i2, i);
                    }
                    break;
                case 68:
                    zzq(t, t2, i);
                    break;
            }
        }
        zzgib.zzF(this.zzo, t, t2);
        if (this.zzh) {
            zzgib.zzE(this.zzp, t, t2);
        }
    }
}
