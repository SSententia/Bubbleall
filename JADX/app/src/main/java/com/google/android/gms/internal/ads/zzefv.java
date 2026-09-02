package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzefv implements zzfrz<zzcvh> {
    final /* synthetic */ zzefw zza;

    zzefv(zzefw zzefwVar) {
        this.zza = zzefwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzbcz zzbczVarZzh = this.zza.zza.zzY().zzh(th);
        this.zza.zzd.zzbD(zzbczVarZzh);
        zzfbh.zza(zzbczVarZzh.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzcvh zzcvhVar) {
        zzcvhVar.zzS();
    }
}
