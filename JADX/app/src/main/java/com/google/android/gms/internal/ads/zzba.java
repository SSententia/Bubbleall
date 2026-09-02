package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzba {
    public final String zza;
    public final zzafv zzb;
    public final zzafv zzc;
    public final int zzd;
    public final int zze;

    public zzba(String str, zzafv zzafvVar, zzafv zzafvVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        zzakt.zza(z);
        zzakt.zzf(str);
        this.zza = str;
        zzafvVar.getClass();
        this.zzb = zzafvVar;
        zzafvVar2.getClass();
        this.zzc = zzafvVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (this.zzd == zzbaVar.zzd && this.zze == zzbaVar.zze && this.zza.equals(zzbaVar.zza) && this.zzb.equals(zzbaVar.zzb) && this.zzc.equals(zzbaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
