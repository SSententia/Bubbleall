package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgiy {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class<?> zzd;
    private static final boolean zze;
    private static final boolean zzf;
    private static final zzgix zzg;
    private static final boolean zzh;
    private static final boolean zzi;
    private static final long zzj;

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    static {
        Unsafe unsafe;
        boolean z;
        Unsafe unsafe2;
        boolean z2;
        zzgix zzgixVar;
        Unsafe unsafeZzt = zzt();
        zzc = unsafeZzt;
        zzd = zzgei.zza();
        boolean zZzu = zzu(Long.TYPE);
        zze = zZzu;
        boolean zZzu2 = zzu(Integer.TYPE);
        zzf = zZzu2;
        zzgix zzgivVar = null;
        if (unsafeZzt != null) {
            if (zZzu) {
                zzgivVar = new zzgiw(unsafeZzt);
            } else if (zZzu2) {
                zzgivVar = new zzgiv(unsafeZzt);
            }
        }
        zzg = zzgivVar;
        if (zzgivVar == null || (unsafe = zzgivVar.zza) == null) {
            z = false;
        } else {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                if (zzE() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                zzB(th);
            }
        }
        zzh = z;
        zzgix zzgixVar2 = zzg;
        if (zzgixVar2 == null || (unsafe2 = zzgixVar2.zza) == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls2 = unsafe2.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("arrayBaseOffset", Class.class);
                cls2.getMethod("arrayIndexScale", Class.class);
                cls2.getMethod("getInt", Object.class, Long.TYPE);
                cls2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls2.getMethod("getLong", Object.class, Long.TYPE);
                cls2.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                cls2.getMethod("getObject", Object.class, Long.TYPE);
                cls2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                zzB(th2);
                z2 = false;
            }
        }
        zzi = z2;
        zza = zzC(byte[].class);
        zzC(boolean[].class);
        zzD(boolean[].class);
        zzC(int[].class);
        zzD(int[].class);
        zzC(long[].class);
        zzD(long[].class);
        zzC(float[].class);
        zzD(float[].class);
        zzC(double[].class);
        zzD(double[].class);
        zzC(Object[].class);
        zzD(Object[].class);
        Field fieldZzE = zzE();
        long jZzj = -1;
        if (fieldZzE != null && (zzgixVar = zzg) != null) {
            jZzj = zzgixVar.zzj(fieldZzE);
        }
        zzj = jZzj;
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzgiy() {
    }

    static /* synthetic */ void zzB(Throwable th) {
        Logger.getLogger(zzgiy.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzC(Class<?> cls) {
        if (zzi) {
            return zzg.zzk(cls);
        }
        return -1;
    }

    private static int zzD(Class<?> cls) {
        if (zzi) {
            return zzg.zzl(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i = zzgei.zza;
        Field fieldZzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (fieldZzF != null) {
            return fieldZzF;
        }
        Field fieldZzF2 = zzF(Buffer.class, "address");
        if (fieldZzF2 == null || fieldZzF2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzF2;
    }

    private static Field zzF(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        zzgix zzgixVar = zzg;
        int iZzm = zzgixVar.zzm(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzgixVar.zzn(obj, j2, ((255 & b) << i) | (iZzm & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        zzgix zzgixVar = zzg;
        int i = (((int) j) & 3) << 3;
        zzgixVar.zzn(obj, j2, ((255 & b) << i) | (zzgixVar.zzm(obj, j2) & (~(255 << i))));
    }

    static boolean zza() {
        return zzi;
    }

    static boolean zzb() {
        return zzh;
    }

    static <T> T zzc(Class<T> cls) {
        try {
            return (T) zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static int zzd(Object obj, long j) {
        return zzg.zzm(obj, j);
    }

    static void zze(Object obj, long j, int i) {
        zzg.zzn(obj, j, i);
    }

    static long zzf(Object obj, long j) {
        return zzg.zzo(obj, j);
    }

    static void zzg(Object obj, long j, long j2) {
        zzg.zzp(obj, j, j2);
    }

    static boolean zzh(Object obj, long j) {
        return zzg.zzb(obj, j);
    }

    static void zzi(Object obj, long j, boolean z) {
        zzg.zzc(obj, j, z);
    }

    static float zzj(Object obj, long j) {
        return zzg.zzd(obj, j);
    }

    static void zzk(Object obj, long j, float f) {
        zzg.zze(obj, j, f);
    }

    static double zzl(Object obj, long j) {
        return zzg.zzf(obj, j);
    }

    static void zzm(Object obj, long j, double d) {
        zzg.zzg(obj, j, d);
    }

    static Object zzn(Object obj, long j) {
        return zzg.zzq(obj, j);
    }

    static void zzo(Object obj, long j, Object obj2) {
        zzg.zzr(obj, j, obj2);
    }

    static void zzp(byte[] bArr, long j, byte b) {
        zzg.zza(bArr, zza + j, b);
    }

    static void zzq(long j, byte[] bArr, long j2, long j3) {
        zzg.zzi(j, bArr, j2, j3);
    }

    static byte zzr(long j) {
        return zzg.zzh(j);
    }

    static long zzs(ByteBuffer byteBuffer) {
        return zzg.zzo(byteBuffer, zzj);
    }

    static Unsafe zzt() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgiu());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzu(Class<?> cls) {
        int i = zzgei.zza;
        try {
            Class<?> cls2 = zzd;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ boolean zzx(Object obj, long j) {
        return ((byte) ((zzg.zzm(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzy(Object obj, long j) {
        return ((byte) ((zzg.zzm(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
