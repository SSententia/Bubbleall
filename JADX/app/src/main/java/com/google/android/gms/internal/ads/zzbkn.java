package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzbkn<T> {
    private final String zza;
    private final T zzb;
    private final int zzc;

    protected zzbkn(String str, T t, int i) {
        this.zza = str;
        this.zzb = t;
        this.zzc = i;
    }

    public static zzbkn<Boolean> zza(String str, boolean z) {
        return new zzbkn<>(str, Boolean.valueOf(z), 1);
    }

    public static zzbkn<Long> zzb(String str, long j) {
        return new zzbkn<>(str, Long.valueOf(j), 2);
    }

    public static zzbkn<Double> zzc(String str, double d) {
        return new zzbkn<>(str, Double.valueOf(d), 3);
    }

    public static zzbkn<String> zzd(String str, String str2) {
        return new zzbkn<>(str, str2, 4);
    }

    public final T zze() {
        zzblm zzblmVarZza = zzbln.zza();
        if (zzblmVarZza == null) {
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i == 0) {
            return (T) zzblmVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i != 1) {
            return i != 2 ? (T) zzblmVarZza.zzd(this.zza, (String) this.zzb) : (T) zzblmVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue());
        }
        return (T) zzblmVarZza.zzb(this.zza, ((Long) this.zzb).longValue());
    }
}
