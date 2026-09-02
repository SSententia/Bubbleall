package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvw extends Thread {
    private final BlockingQueue<zzwc<?>> zza;
    private final zzvv zzb;
    private final zzvm zzc;
    private volatile boolean zzd = false;
    private final zzvt zze;

    /* JADX WARN: Multi-variable type inference failed */
    public zzvw(BlockingQueue blockingQueue, BlockingQueue<zzwc<?>> blockingQueue2, zzvv zzvvVar, zzvm zzvmVar, zzvt zzvtVar) {
        this.zza = blockingQueue;
        this.zzb = blockingQueue2;
        this.zzc = zzvvVar;
        this.zze = zzvmVar;
    }

    private void zzb() throws InterruptedException {
        zzwc<?> zzwcVarTake = this.zza.take();
        SystemClock.elapsedRealtime();
        zzwcVarTake.zzf(3);
        try {
            zzwcVarTake.zzd("network-queue-take");
            zzwcVarTake.zzm();
            TrafficStats.setThreadStatsTag(zzwcVarTake.zzc());
            zzvy zzvyVarZza = this.zzb.zza(zzwcVarTake);
            zzwcVarTake.zzd("network-http-complete");
            if (zzvyVarZza.zze && zzwcVarTake.zzr()) {
                zzwcVarTake.zze("not-modified");
                zzwcVarTake.zzx();
                return;
            }
            zzwi<?> zzwiVarZzs = zzwcVarTake.zzs(zzvyVarZza);
            zzwcVarTake.zzd("network-parse-complete");
            if (zzwiVarZzs.zzb != null) {
                this.zzc.zzb(zzwcVarTake.zzj(), zzwiVarZzs.zzb);
                zzwcVarTake.zzd("network-cache-written");
            }
            zzwcVarTake.zzq();
            this.zze.zza(zzwcVarTake, zzwiVarZzs, null);
            zzwcVarTake.zzw(zzwiVarZzs);
        } catch (zzwl e) {
            SystemClock.elapsedRealtime();
            this.zze.zzb(zzwcVarTake, e);
            zzwcVarTake.zzx();
        } catch (Exception e2) {
            zzwo.zzd(e2, "Unhandled exception %s", e2.toString());
            zzwl zzwlVar = new zzwl(e2);
            SystemClock.elapsedRealtime();
            this.zze.zzb(zzwcVarTake, zzwlVar);
            zzwcVarTake.zzx();
        } finally {
            zzwcVarTake.zzf(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzwo.zzc("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
