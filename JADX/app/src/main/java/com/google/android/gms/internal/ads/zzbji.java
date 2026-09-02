package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbji implements zzblm {
    final /* synthetic */ zzbjj zza;

    zzbji(zzbjj zzbjjVar) {
        this.zza = zzbjjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final Boolean zza(String str, boolean z) {
        return Boolean.valueOf(this.zza.zze.getBoolean(str, z));
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final Long zzb(String str, long j) {
        try {
            return Long.valueOf(this.zza.zze.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.zze.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final Double zzc(String str, double d) {
        return Double.valueOf(this.zza.zze.getFloat(str, (float) d));
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final String zzd(String str, String str2) {
        return this.zza.zze.getString(str, str2);
    }
}
