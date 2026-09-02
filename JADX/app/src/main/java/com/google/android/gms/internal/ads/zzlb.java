package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzlc;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlb<T extends zzlc> extends Handler implements Runnable {
    final /* synthetic */ zzlh zza;
    private final T zzb;
    private final long zzc;
    private zzkz<T> zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlb(zzlh zzlhVar, Looper looper, T t, zzkz<T> zzkzVar, int i, long j) {
        super(looper);
        this.zza = zzlhVar;
        this.zzb = t;
        this.zzd = zzkzVar;
        this.zzc = j;
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
        if (message.what == 3) {
            throw ((Error) message.obj);
        }
        this.zza.zzf = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.zzc;
        zzkz<T> zzkzVar = this.zzd;
        zzkzVar.getClass();
        if (this.zzh) {
            zzkzVar.zzI(this.zzb, jElapsedRealtime, j, false);
            return;
        }
        int i = message.what;
        if (i == 1) {
            try {
                zzkzVar.zzJ(this.zzb, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                zzaln.zzb("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zzg = new zzlg(e);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i2 = this.zzf + 1;
        this.zzf = i2;
        zzla zzlaVarZzH = zzkzVar.zzH(this.zzb, jElapsedRealtime, j, iOException, i2);
        if (zzlaVarZzH.zza == 3) {
            this.zza.zzg = this.zze;
        } else if (zzlaVarZzH.zza != 2) {
            if (zzlaVarZzH.zza == 1) {
                this.zzf = 1;
            }
            zzb(zzlaVarZzH.zzb != -9223372036854775807L ? zzlaVarZzH.zzb : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                String strValueOf = String.valueOf(this.zzb.getClass().getSimpleName());
                zzamo.zza(strValueOf.length() != 0 ? "load:".concat(strValueOf) : new String("load:"));
                try {
                    this.zzb.zzh();
                    zzamo.zzb();
                } catch (Throwable th) {
                    zzamo.zzb();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e2) {
            if (this.zzi) {
                return;
            }
            zzaln.zzb("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(2, new zzlg(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.zzi) {
                return;
            }
            zzaln.zzb("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(2, new zzlg(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.zzi) {
                zzaln.zzb("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }

    public final void zza(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzb(long j) {
        zzakt.zzd(this.zza.zzf == null);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzkz<T> zzkzVar = this.zzd;
            zzkzVar.getClass();
            zzkzVar.zzI(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    private final void zzd() {
        this.zze = null;
        ExecutorService executorService = this.zza.zze;
        zzlb zzlbVar = this.zza.zzf;
        zzlbVar.getClass();
        executorService.execute(zzlbVar);
    }
}
