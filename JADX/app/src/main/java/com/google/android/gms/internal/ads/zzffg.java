package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzffg {
    public final String zza;
    public final String zzb;

    public zzffg(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzffg)) {
            return false;
        }
        zzffg zzffgVar = (zzffg) obj;
        return this.zza.equals(zzffgVar.zza) && this.zzb.equals(zzffgVar.zzb);
    }

    public final int hashCode() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        return (strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf)).hashCode();
    }
}
