package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbyc implements com.google.android.gms.ads.internal.overlay.zzo {
    final /* synthetic */ zzbye zza;

    zzbyc(zzbye zzbyeVar) {
        this.zza = zzbyeVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbp() {
        zzcgt.zzd("Opening AdMobCustomTabsAdapter overlay.");
        this.zza.zzb.onAdOpened(this.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbq() {
        zzcgt.zzd("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        zzcgt.zzd("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs(int i) {
        zzcgt.zzd("AdMobCustomTabsAdapter overlay is closed.");
        this.zza.zzb.onAdClosed(this.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzd() {
        zzcgt.zzd("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }
}
