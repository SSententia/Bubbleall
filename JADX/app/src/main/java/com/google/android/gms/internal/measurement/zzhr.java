package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhn;
import com.google.android.gms.internal.measurement.zzhr;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhr<MessageType extends zzhr<MessageType, BuilderType>, BuilderType extends zzhn<MessageType, BuilderType>> extends zzgc<MessageType, BuilderType> {
    private static final Map<Object, zzhr<?, ?>> zza = new ConcurrentHashMap();
    protected zzjw zzc = zzjw.zza();
    protected int zzd = -1;

    static Object zzbA(Method method, Object obj, Object... objArr) {
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

    protected static zzhw zzbB() {
        return zzhs.zzd();
    }

    protected static zzhx zzbC() {
        return zzil.zzf();
    }

    protected static zzhx zzbD(zzhx zzhxVar) {
        int size = zzhxVar.size();
        return zzhxVar.zze(size == 0 ? 10 : size + size);
    }

    protected static <E> zzhy<E> zzbE() {
        return zzjf.zzd();
    }

    protected static <E> zzhy<E> zzbF(zzhy<E> zzhyVar) {
        int size = zzhyVar.size();
        return zzhyVar.zze(size == 0 ? 10 : size + size);
    }

    static <T extends zzhr> T zzbx(Class<T> cls) {
        Map<Object, zzhr<?, ?>> map = zza;
        zzhr<?, ?> zzhrVar = map.get(cls);
        if (zzhrVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzhrVar = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzhrVar == null) {
            zzhrVar = (zzhr) ((zzhr) zzkf.zzc(cls)).zzl(6, null, null);
            if (zzhrVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzhrVar);
        }
        return zzhrVar;
    }

    protected static <T extends zzhr> void zzby(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    protected static Object zzbz(zziw zziwVar, String str, Object[] objArr) {
        return new zzjg(zziwVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzje.zza().zzb(getClass()).zzb(this, (zzhr) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int iZzc = zzje.zza().zzb(getClass()).zzc(this);
        this.zzb = iZzc;
        return iZzc;
    }

    public final String toString() {
        return zziy.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final /* bridge */ /* synthetic */ zziv zzbG() {
        zzhn zzhnVar = (zzhn) zzl(5, null, null);
        zzhnVar.zzaB(this);
        return zzhnVar;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final /* bridge */ /* synthetic */ zziv zzbH() {
        return (zzhn) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final /* bridge */ /* synthetic */ zziw zzbK() {
        return (zzhr) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzgc
    final int zzbq() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzgc
    final void zzbr(int i) {
        this.zzd = i;
    }

    protected final <MessageType extends zzhr<MessageType, BuilderType>, BuilderType extends zzhn<MessageType, BuilderType>> BuilderType zzbt() {
        return (BuilderType) zzl(5, null, null);
    }

    public final BuilderType zzbu() {
        BuilderType buildertype = (BuilderType) zzl(5, null, null);
        buildertype.zzaB(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final void zzbv(zzgy zzgyVar) throws IOException {
        zzje.zza().zzb(getClass()).zzm(this, zzgz.zza(zzgyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzbw() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int iZze = zzje.zza().zzb(getClass()).zze(this);
        this.zzd = iZze;
        return iZze;
    }

    protected abstract Object zzl(int i, Object obj, Object obj2);
}
