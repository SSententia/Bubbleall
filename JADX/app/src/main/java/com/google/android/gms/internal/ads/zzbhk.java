package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhk extends zzbes {
    final /* synthetic */ zzbhl zza;

    zzbhk(zzbhl zzbhlVar) {
        this.zza = zzbhlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbes, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zza.zze.zza(this.zza.zzx());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.internal.ads.zzbes, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zza.zze.zza(this.zza.zzx());
        super.onAdLoaded();
    }
}
