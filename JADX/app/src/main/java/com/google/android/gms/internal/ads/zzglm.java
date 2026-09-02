package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzglm<T> implements zzgln<T> {
    private static final Object zza = new Object();
    private volatile zzgln<T> zzb;
    private volatile Object zzc = zza;

    private zzglm(zzgln<T> zzglnVar) {
        this.zzb = zzglnVar;
    }

    public static <P extends zzgln<T>, T> zzgln<T> zza(P p) {
        if ((p instanceof zzglm) || (p instanceof zzgkz)) {
            return p;
        }
        p.getClass();
        return new zzglm(p);
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final T zzb() {
        T t = (T) this.zzc;
        if (t != zza) {
            return t;
        }
        zzgln<T> zzglnVar = this.zzb;
        if (zzglnVar == null) {
            return (T) this.zzc;
        }
        T tZzb = zzglnVar.zzb();
        this.zzc = tZzb;
        this.zzb = null;
        return tZzb;
    }
}
