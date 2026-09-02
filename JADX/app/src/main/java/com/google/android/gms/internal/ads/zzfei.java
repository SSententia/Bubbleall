package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfei implements zzfrz {
    final /* synthetic */ zzfdy zza;
    final /* synthetic */ zzfej zzb;

    zzfei(zzfej zzfejVar, zzfdy zzfdyVar) {
        this.zzb = zzfejVar;
        this.zza = zzfdyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        this.zzb.zza.zzd.zzc(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zzb(Object obj) {
        this.zzb.zza.zzd.zzd(this.zza);
    }
}
