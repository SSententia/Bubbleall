package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjj {
    private static final Class<?> zza;
    private static final zzjv<?, ?> zzb;
    private static final zzjv<?, ?> zzc;
    private static final zzjv<?, ?> zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzjx();
    }

    public static zzjv<?, ?> zzA() {
        return zzb;
    }

    public static zzjv<?, ?> zzB() {
        return zzc;
    }

    public static zzjv<?, ?> zzC() {
        return zzd;
    }

    static boolean zzD(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T, FT extends zzhh<FT>> void zzE(zzhe<FT> zzheVar, T t, T t2) {
        zzheVar.zzb(t2);
        throw null;
    }

    static <T, UT, UB> void zzF(zzjv<UT, UB> zzjvVar, T t, T t2) {
        zzjvVar.zzc(t, zzjvVar.zzf(zzjvVar.zzd(t), zzjvVar.zzd(t2)));
    }

    static <UT, UB> UB zzG(int i, List<Integer> list, zzhv zzhvVar, UB ub, zzjv<UT, UB> zzjvVar) {
        if (zzhvVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int iIntValue = num.intValue();
                if (zzhvVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) zzH(i, iIntValue, ub, zzjvVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!zzhvVar.zza(iIntValue2)) {
                    ub = (UB) zzH(i, iIntValue2, ub, zzjvVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB zzH(int i, int i2, UB ub, zzjv<UT, UB> zzjvVar) {
        if (ub == null) {
            ub = zzjvVar.zzb();
        }
        zzjvVar.zza(ub, i, i2);
        return ub;
    }

    static <T> void zzI(zzir zzirVar, T t, T t2, long j) {
        zzkf.zzo(t, j, zzir.zzb(zzkf.zzn(t, j), zzkf.zzn(t2, j)));
    }

    public static void zzJ(int i, List<Double> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzB(i, list, z);
    }

    public static void zzK(int i, List<Float> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzA(i, list, z);
    }

    public static void zzL(int i, List<Long> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzx(i, list, z);
    }

    public static void zzM(int i, List<Long> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzy(i, list, z);
    }

    public static void zzN(int i, List<Long> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzK(i, list, z);
    }

    public static void zzO(int i, List<Long> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzz(i, list, z);
    }

    public static void zzP(int i, List<Long> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzI(i, list, z);
    }

    public static void zzQ(int i, List<Integer> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzv(i, list, z);
    }

    public static void zzR(int i, List<Integer> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzG(i, list, z);
    }

    public static void zzS(int i, List<Integer> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzJ(i, list, z);
    }

    public static void zzT(int i, List<Integer> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzw(i, list, z);
    }

    public static void zzU(int i, List<Integer> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzH(i, list, z);
    }

    public static void zzV(int i, List<Integer> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzC(i, list, z);
    }

    public static void zzW(int i, List<Boolean> list, zzgz zzgzVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzD(i, list, z);
    }

    public static void zzX(int i, List<String> list, zzgz zzgzVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzE(i, list);
    }

    public static void zzY(int i, List<zzgr> list, zzgz zzgzVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzVar.zzF(i, list);
    }

    public static void zzZ(int i, List<?> list, zzgz zzgzVar, zzjh zzjhVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgzVar.zzr(i, list.get(i2), zzjhVar);
        }
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzhr.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzaa(int i, List<?> list, zzgz zzgzVar, zzjh zzjhVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgzVar.zzs(i, list.get(i2), zzjhVar);
        }
    }

    private static zzjv<?, ?> zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzjv) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zzb(List<Long> list) {
        int iZzx;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzil) {
            zzil zzilVar = (zzil) list;
            iZzx = 0;
            while (i < size) {
                iZzx += zzgy.zzx(zzilVar.zzc(i));
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                iZzx += zzgy.zzx(list.get(i).longValue());
                i++;
            }
        }
        return iZzx;
    }

    static int zzc(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzb(list) + (list.size() * zzgy.zzu(i));
    }

    static int zzd(List<Long> list) {
        int iZzx;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzil) {
            zzil zzilVar = (zzil) list;
            iZzx = 0;
            while (i < size) {
                iZzx += zzgy.zzx(zzilVar.zzc(i));
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                iZzx += zzgy.zzx(list.get(i).longValue());
                i++;
            }
        }
        return iZzx;
    }

    static int zze(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzgy.zzu(i));
    }

    static int zzf(List<Long> list) {
        int iZzx;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzil) {
            zzil zzilVar = (zzil) list;
            iZzx = 0;
            while (i < size) {
                long jZzc = zzilVar.zzc(i);
                iZzx += zzgy.zzx((jZzc >> 63) ^ (jZzc + jZzc));
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                long jLongValue = list.get(i).longValue();
                iZzx += zzgy.zzx((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzx;
    }

    static int zzg(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzgy.zzu(i));
    }

    static int zzh(List<Integer> list) {
        int iZzv;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhs) {
            zzhs zzhsVar = (zzhs) list;
            iZzv = 0;
            while (i < size) {
                iZzv += zzgy.zzv(zzhsVar.zzg(i));
                i++;
            }
        } else {
            iZzv = 0;
            while (i < size) {
                iZzv += zzgy.zzv(list.get(i).intValue());
                i++;
            }
        }
        return iZzv;
    }

    static int zzi(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzgy.zzu(i));
    }

    static int zzj(List<Integer> list) {
        int iZzv;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhs) {
            zzhs zzhsVar = (zzhs) list;
            iZzv = 0;
            while (i < size) {
                iZzv += zzgy.zzv(zzhsVar.zzg(i));
                i++;
            }
        } else {
            iZzv = 0;
            while (i < size) {
                iZzv += zzgy.zzv(list.get(i).intValue());
                i++;
            }
        }
        return iZzv;
    }

    static int zzk(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzgy.zzu(i));
    }

    static int zzl(List<Integer> list) {
        int iZzw;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhs) {
            zzhs zzhsVar = (zzhs) list;
            iZzw = 0;
            while (i < size) {
                iZzw += zzgy.zzw(zzhsVar.zzg(i));
                i++;
            }
        } else {
            iZzw = 0;
            while (i < size) {
                iZzw += zzgy.zzw(list.get(i).intValue());
                i++;
            }
        }
        return iZzw;
    }

    static int zzm(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzgy.zzu(i));
    }

    static int zzn(List<Integer> list) {
        int iZzw;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhs) {
            zzhs zzhsVar = (zzhs) list;
            iZzw = 0;
            while (i < size) {
                int iZzg = zzhsVar.zzg(i);
                iZzw += zzgy.zzw((iZzg >> 31) ^ (iZzg + iZzg));
                i++;
            }
        } else {
            iZzw = 0;
            while (i < size) {
                int iIntValue = list.get(i).intValue();
                iZzw += zzgy.zzw((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzw;
    }

    static int zzo(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzn(list) + (size * zzgy.zzu(i));
    }

    static int zzp(List<?> list) {
        return list.size() * 4;
    }

    static int zzq(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgy.zzw(i << 3) + 4);
    }

    static int zzr(List<?> list) {
        return list.size() * 8;
    }

    static int zzs(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgy.zzw(i << 3) + 8);
    }

    static int zzt(List<?> list) {
        return list.size();
    }

    static int zzu(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgy.zzw(i << 3) + 1);
    }

    static int zzv(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzu = zzgy.zzu(i) * size;
        if (list instanceof zzig) {
            zzig zzigVar = (zzig) list;
            while (i2 < size) {
                Object objZzg = zzigVar.zzg(i2);
                iZzu += objZzg instanceof zzgr ? zzgy.zzA((zzgr) objZzg) : zzgy.zzy((String) objZzg);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iZzu += obj instanceof zzgr ? zzgy.zzA((zzgr) obj) : zzgy.zzy((String) obj);
                i2++;
            }
        }
        return iZzu;
    }

    static int zzw(int i, Object obj, zzjh zzjhVar) {
        if (!(obj instanceof zzie)) {
            return zzgy.zzw(i << 3) + zzgy.zzB((zziw) obj, zzjhVar);
        }
        int iZzw = zzgy.zzw(i << 3);
        int iZza = ((zzie) obj).zza();
        return iZzw + zzgy.zzw(iZza) + iZza;
    }

    static int zzx(int i, List<?> list, zzjh zzjhVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzu = zzgy.zzu(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iZzu += obj instanceof zzie ? zzgy.zzz((zzie) obj) : zzgy.zzB((zziw) obj, zzjhVar);
        }
        return iZzu;
    }

    static int zzy(int i, List<zzgr> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzu = size * zzgy.zzu(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZzu += zzgy.zzA(list.get(i2));
        }
        return iZzu;
    }

    static int zzz(int i, List<zziw> list, zzjh zzjhVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzE = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iZzE += zzgy.zzE(i, list.get(i2), zzjhVar);
        }
        return iZzE;
    }
}
