package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzaul;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzauk<T extends zzaul> extends Handler implements Runnable {
    public final int zza;
    final /* synthetic */ zzaun zzb;
    private final T zzc;
    private final zzauj<T> zzd;
    private final long zze;
    private IOException zzf;
    private int zzg;
    private volatile Thread zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzauk(zzaun zzaunVar, Looper looper, T t, zzauj<T> zzaujVar, int i, long j) {
        super(looper);
        this.zzb = zzaunVar;
        this.zzc = t;
        this.zzd = zzaujVar;
        this.zza = i;
        this.zze = j;
    }

    private final void zzd() {
        this.zzf = null;
        this.zzb.zza.execute(this.zzb.zzb);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        if (message.what == 0) {
            zzd();
            return;
        }
        if (message.what == 4) {
            throw ((Error) message.obj);
        }
        this.zzb.zzb = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.zze;
        if (this.zzc.zzd()) {
            this.zzd.zzz(this.zzc, jElapsedRealtime, j, false);
            return;
        }
        int i = message.what;
        if (i == 1) {
            this.zzd.zzz(this.zzc, jElapsedRealtime, j, false);
            return;
        }
        if (i == 2) {
            this.zzd.zzA(this.zzc, jElapsedRealtime, j);
            return;
        }
        if (i != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zzf = iOException;
        int iZzy = this.zzd.zzy(this.zzc, jElapsedRealtime, j, iOException);
        if (iZzy == 3) {
            this.zzb.zzc = this.zzf;
        } else if (iZzy != 2) {
            int i2 = iZzy != 1 ? 1 + this.zzg : 1;
            this.zzg = i2;
            zzb(Math.min((i2 - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzh = Thread.currentThread();
            if (!this.zzc.zzd()) {
                String strValueOf = String.valueOf(this.zzc.getClass().getSimpleName());
                zzavc.zza(strValueOf.length() != 0 ? "load:".concat(strValueOf) : new String("load:"));
                try {
                    this.zzc.zze();
                    zzavc.zzb();
                } catch (Throwable th) {
                    zzavc.zzb();
                    throw th;
                }
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzaum(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzaum(e3)).sendToTarget();
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.zzi) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (InterruptedException unused) {
            zzaup.zzd(this.zzc.zzd());
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        }
    }

    public final void zza(int i) throws IOException {
        IOException iOException = this.zzf;
        if (iOException != null && this.zzg > i) {
            throw iOException;
        }
    }

    public final void zzb(long j) {
        zzaup.zzd(this.zzb.zzb == null);
        this.zzb.zzb = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zzf = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.zzc.zzc();
            if (this.zzh != null) {
                this.zzh.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.zzb.zzb = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.zzd.zzz(this.zzc, jElapsedRealtime, jElapsedRealtime - this.zze, true);
    }
}
