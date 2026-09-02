package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfw;
import com.google.android.gms.internal.ads.zzgga;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgga<MessageType extends zzgga<MessageType, BuilderType>, BuilderType extends zzgfw<MessageType, BuilderType>> extends zzgeg<MessageType, BuilderType> {
    private static final Map<Object, zzgga<?, ?>> zzb = new ConcurrentHashMap();
    protected zzgip zzc = zzgip.zza();
    protected int zzd = -1;

    private static <T extends zzgga<T, ?>> T zza(T t) throws zzggm {
        if (t == null || t.zzat()) {
            return t;
        }
        zzggm zzggmVar = new zzggm(new zzgin(t).getMessage());
        zzggmVar.zza(t);
        throw zzggmVar;
    }

    static Object zzaA(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static zzggf zzaB() {
        return zzggb.zzd();
    }

    protected static zzggf zzaC(zzggf zzggfVar) {
        int size = zzggfVar.size();
        return zzggfVar.zze(size == 0 ? 10 : size + size);
    }

    protected static zzggi zzaD() {
        return zzggx.zzd();
    }

    protected static <E> zzggj<E> zzaE() {
        return zzghr.zzd();
    }

    protected static <E> zzggj<E> zzaF(zzggj<E> zzggjVar) {
        int size = zzggjVar.size();
        return zzggjVar.zze(size == 0 ? 10 : size + size);
    }

    static <T extends zzgga<T, ?>> T zzaG(T t, byte[] bArr, int i, int i2, zzgfm zzgfmVar) throws zzggm {
        T t2 = (T) t.zzb(4, null, null);
        try {
            zzghz zzghzVarZzb = zzghq.zza().zzb(t2.getClass());
            zzghzVarZzb.zzi(t2, bArr, 0, i2, new zzgej(zzgfmVar));
            zzghzVarZzb.zzj(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (zzggm e) {
            e = e;
            if (e.zzc()) {
                e = new zzggm(e);
            }
            e.zza(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzggm) {
                throw ((zzggm) e2.getCause());
            }
            zzggm zzggmVar = new zzggm(e2);
            zzggmVar.zza(t2);
            throw zzggmVar;
        } catch (IndexOutOfBoundsException unused) {
            zzggm zzggmVarZzd = zzggm.zzd();
            zzggmVarZzd.zza(t2);
            throw zzggmVarZzd;
        }
    }

    protected static <T extends zzgga<T, ?>> T zzaH(T t, zzgex zzgexVar) throws zzggm {
        zzgfm zzgfmVarZza = zzgfm.zza();
        zzgfc zzgfcVarZzp = zzgexVar.zzp();
        T t2 = (T) t.zzb(4, null, null);
        try {
            zzghz zzghzVarZzb = zzghq.zza().zzb(t2.getClass());
            zzghzVarZzb.zzf(t2, zzgfd.zza(zzgfcVarZzp), zzgfmVarZza);
            zzghzVarZzb.zzj(t2);
            try {
                zzgfcVarZzp.zzb(0);
                zza(t2);
                zza(t2);
                return t2;
            } catch (zzggm e) {
                e.zza(t2);
                throw e;
            }
        } catch (zzggm e2) {
            e = e2;
            if (e.zzc()) {
                e = new zzggm(e);
            }
            e.zza(t2);
            throw e;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzggm) {
                throw ((zzggm) e3.getCause());
            }
            zzggm zzggmVar = new zzggm(e3);
            zzggmVar.zza(t2);
            throw zzggmVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzggm) {
                throw ((zzggm) e4.getCause());
            }
            throw e4;
        }
    }

    protected static <T extends zzgga<T, ?>> T zzaI(T t, zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        zzgfc zzgfcVarZzp = zzgexVar.zzp();
        T t2 = (T) t.zzb(4, null, null);
        try {
            zzghz zzghzVarZzb = zzghq.zza().zzb(t2.getClass());
            zzghzVarZzb.zzf(t2, zzgfd.zza(zzgfcVarZzp), zzgfmVar);
            zzghzVarZzb.zzj(t2);
            try {
                zzgfcVarZzp.zzb(0);
                zza(t2);
                return t2;
            } catch (zzggm e) {
                e.zza(t2);
                throw e;
            }
        } catch (zzggm e2) {
            e = e2;
            if (e.zzc()) {
                e = new zzggm(e);
            }
            e.zza(t2);
            throw e;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzggm) {
                throw ((zzggm) e3.getCause());
            }
            zzggm zzggmVar = new zzggm(e3);
            zzggmVar.zza(t2);
            throw zzggmVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzggm) {
                throw ((zzggm) e4.getCause());
            }
            throw e4;
        }
    }

    protected static <T extends zzgga<T, ?>> T zzaJ(T t, byte[] bArr) throws zzggm {
        T t2 = (T) zzaG(t, bArr, 0, bArr.length, zzgfm.zza());
        zza(t2);
        return t2;
    }

    protected static <T extends zzgga<T, ?>> T zzaK(T t, byte[] bArr, zzgfm zzgfmVar) throws zzggm {
        T t2 = (T) zzaG(t, bArr, 0, bArr.length, zzgfmVar);
        zza(t2);
        return t2;
    }

    static <T extends zzgga> T zzax(Class<T> cls) {
        Map<Object, zzgga<?, ?>> map = zzb;
        zzgga<?, ?> zzggaVar = map.get(cls);
        if (zzggaVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzggaVar = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzggaVar == null) {
            zzggaVar = (zzgga) ((zzgga) zzgiy.zzc(cls)).zzb(6, null, null);
            if (zzggaVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzggaVar);
        }
        return zzggaVar;
    }

    protected static <T extends zzgga> void zzay(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    protected static Object zzaz(zzghi zzghiVar, String str, Object[] objArr) {
        return new zzghs(zzghiVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzghq.zza().zzb(getClass()).zzb(this, (zzgga) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzc = zzghq.zza().zzb(getClass()).zzc(this);
        this.zza = iZzc;
        return iZzc;
    }

    public final String toString() {
        return zzghk.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final /* bridge */ /* synthetic */ zzghh zzaL() {
        zzgfw zzgfwVar = (zzgfw) zzb(5, null, null);
        zzgfwVar.zzai(this);
        return zzgfwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final /* bridge */ /* synthetic */ zzghh zzaM() {
        return (zzgfw) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgeg
    final int zzap() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgeg
    final void zzaq(int i) {
        this.zzd = i;
    }

    protected final <MessageType extends zzgga<MessageType, BuilderType>, BuilderType extends zzgfw<MessageType, BuilderType>> BuilderType zzas() {
        return (BuilderType) zzb(5, null, null);
    }

    public final boolean zzat() {
        boolean zBooleanValue = Boolean.TRUE.booleanValue();
        byte bByteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzghq.zza().zzb(getClass()).zzk(this);
        if (!zBooleanValue) {
            return zZzk;
        }
        zzb(2, true != zZzk ? null : this, null);
        return zZzk;
    }

    public final BuilderType zzau() {
        BuilderType buildertype = (BuilderType) zzb(5, null, null);
        buildertype.zzai(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final void zzav(zzgfh zzgfhVar) throws IOException {
        zzghq.zza().zzb(getClass()).zzn(this, zzgfi.zza(zzgfhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final int zzaw() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int iZze = zzghq.zza().zzb(getClass()).zze(this);
        this.zzd = iZze;
        return iZze;
    }

    protected abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzghj
    public final /* bridge */ /* synthetic */ zzghi zzbe() {
        return (zzgga) zzb(6, null, null);
    }
}
