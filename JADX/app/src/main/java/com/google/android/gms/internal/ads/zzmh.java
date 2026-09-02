package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzmh implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzmh zzb = new zzmh();
    public volatile long zza = -9223372036854775807L;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzmh() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread;
        handlerThread.start();
        Handler handlerZzi = zzamq.zzi(handlerThread.getLooper(), this);
        this.zzc = handlerZzi;
        handlerZzi.sendEmptyMessage(0);
    }

    public static zzmh zza() {
        return zzb;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.zze = Choreographer.getInstance();
            return true;
        }
        if (i == 1) {
            int i2 = this.zzf + 1;
            this.zzf = i2;
            if (i2 == 1) {
                Choreographer choreographer = this.zze;
                choreographer.getClass();
                choreographer.postFrameCallback(this);
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i3 = this.zzf - 1;
        this.zzf = i3;
        if (i3 == 0) {
            Choreographer choreographer2 = this.zze;
            choreographer2.getClass();
            choreographer2.removeFrameCallback(this);
            this.zza = -9223372036854775807L;
        }
        return true;
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(1);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.zza = j;
        Choreographer choreographer = this.zze;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }
}
