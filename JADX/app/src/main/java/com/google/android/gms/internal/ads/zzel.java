package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzel extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzen zza;
    final /* synthetic */ zzem zzb;

    zzel(zzem zzemVar, zzen zzenVar) {
        this.zzb = zzemVar;
        this.zza = zzenVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzakt.zzd(audioTrack == this.zzb.zza.zzn);
        if (this.zzb.zza.zzk == null || !this.zzb.zza.zzI) {
            return;
        }
        this.zzb.zza.zzk.zza();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzakt.zzd(audioTrack == this.zzb.zza.zzn);
        if (this.zzb.zza.zzk == null || !this.zzb.zza.zzI) {
            return;
        }
        this.zzb.zza.zzk.zza();
    }
}
