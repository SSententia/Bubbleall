package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkz<T> implements zzgln, zzgku {
    private static final Object zza = new Object();
    private volatile zzgln<T> zzb;
    private volatile Object zzc = zza;

    private zzgkz(zzgln<T> zzglnVar) {
        this.zzb = zzglnVar;
    }

    public static <P extends zzgln<T>, T> zzgku<T> zzc(P p) {
        if (p instanceof zzgku) {
            return (zzgku) p;
        }
        p.getClass();
        return new zzgkz(p);
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final T zzb() {
        T tZzb = (T) this.zzc;
        Object obj = zza;
        if (tZzb == obj) {
            synchronized (this) {
                tZzb = (T) this.zzc;
                if (tZzb == obj) {
                    tZzb = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && obj2 != tZzb) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(tZzb);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 118 + String.valueOf(strValueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.zzc = tZzb;
                    this.zzb = null;
                }
            }
        }
        return tZzb;
    }

    public static <P extends zzgln<T>, T> zzgln<T> zza(P p) {
        p.getClass();
        return p instanceof zzgkz ? p : new zzgkz(p);
    }
}
