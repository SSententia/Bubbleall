package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzejn implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzchl zza;
    final /* synthetic */ zzfal zzb;
    final /* synthetic */ zzezz zzc;
    final /* synthetic */ zzejt zzd;
    final /* synthetic */ zzejo zze;

    zzejn(zzejo zzejoVar, zzchl zzchlVar, zzfal zzfalVar, zzezz zzezzVar, zzejt zzejtVar) {
        this.zze = zzejoVar;
        this.zza = zzchlVar;
        this.zzb = zzfalVar;
        this.zzc = zzezzVar;
        this.zzd = zzejtVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        this.zza.zzc(this.zze.zzd.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
