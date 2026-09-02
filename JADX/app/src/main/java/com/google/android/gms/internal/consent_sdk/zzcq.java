package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcq<T> implements zzct<T> {
    private static final Object zza = new Object();
    private volatile zzct<T> zzb;
    private volatile Object zzc = zza;

    private zzcq(zzct<T> zzctVar) {
        this.zzb = zzctVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzct
    public final T zza() {
        T tZza = (T) this.zzc;
        Object obj = zza;
        if (tZza == obj) {
            synchronized (this) {
                tZza = (T) this.zzc;
                if (tZza == obj) {
                    tZza = this.zzb.zza();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && !(obj2 instanceof zzcr) && obj2 != tZza) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(tZza);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 118 + String.valueOf(strValueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.zzc = tZza;
                    this.zzb = null;
                }
            }
        }
        return tZza;
    }

    public static <P extends zzct<T>, T> zzct<T> zza(P p) {
        zzcu.zza(p);
        return p instanceof zzcq ? p : new zzcq(p);
    }
}
