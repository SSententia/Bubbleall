package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaok extends Thread {
    final /* synthetic */ AudioTrack zza;
    final /* synthetic */ zzaot zzb;

    zzaok(zzaot zzaotVar, AudioTrack audioTrack) {
        this.zzb = zzaotVar;
        this.zza = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.zza.flush();
            this.zza.release();
        } finally {
            this.zzb.zze.open();
        }
    }
}
