package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzchy implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcig zzb;

    zzchy(zzcig zzcigVar, MediaPlayer mediaPlayer) {
        this.zzb = zzcigVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcig.zzu(this.zzb, this.zza);
        if (this.zzb.zzs != null) {
            this.zzb.zzs.zzb();
        }
    }
}
