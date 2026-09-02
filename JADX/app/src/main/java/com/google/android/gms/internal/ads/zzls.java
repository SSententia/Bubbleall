package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzls extends HandlerThread implements Handler.Callback {
    private zzalb zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzlu zze;

    public zzls() {
        super("ExoPlayer:DummySurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    zzalb zzalbVar = this.zza;
                    zzalbVar.getClass();
                    zzalbVar.zzb();
                } catch (Throwable th) {
                    try {
                        zzaln.zzb("DummySurface", "Failed to release dummy surface", th);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                int i2 = message.arg1;
                zzalb zzalbVar2 = this.zza;
                zzalbVar2.getClass();
                zzalbVar2.zza(i2);
                this.zze = new zzlu(this, this.zza.zzc(), i2 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e) {
                zzaln.zzb("DummySurface", "Failed to initialize dummy surface", e);
                this.zzc = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                zzaln.zzb("DummySurface", "Failed to initialize dummy surface", e2);
                this.zzd = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzlu zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzalb(this.zzb, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzlu zzluVar = this.zze;
        zzluVar.getClass();
        return zzluVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
