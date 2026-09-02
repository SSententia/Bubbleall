package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbom implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ zzbfn zzb;
    final /* synthetic */ zzbon zzc;

    zzbom(zzbon zzbonVar, AdManagerAdView adManagerAdView, zzbfn zzbfnVar) {
        this.zzc = zzbonVar;
        this.zza = adManagerAdView;
        this.zzb = zzbfnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zza(this.zzb)) {
            this.zzc.zza.onAdManagerAdViewLoaded(this.zza);
        } else {
            zzcgt.zzi("Could not bind.");
        }
    }
}
