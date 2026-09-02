package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvo extends Thread {
    private static final boolean zza = zzwo.zzb;
    private final BlockingQueue<zzwc<?>> zzb;
    private final BlockingQueue<zzwc<?>> zzc;
    private final zzvm zzd;
    private volatile boolean zze = false;
    private final zzwp zzf;
    private final zzvt zzg;

    /* JADX WARN: Multi-variable type inference failed */
    public zzvo(BlockingQueue blockingQueue, BlockingQueue<zzwc<?>> blockingQueue2, BlockingQueue<zzwc<?>> blockingQueue3, zzvm zzvmVar, zzvt zzvtVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = blockingQueue3;
        this.zzg = zzvmVar;
        this.zzf = new zzwp(this, blockingQueue2, zzvmVar, null);
    }

    private void zzc() throws InterruptedException {
        zzwc<?> zzwcVarTake = this.zzb.take();
        zzwcVarTake.zzd("cache-queue-take");
        zzwcVarTake.zzf(1);
        try {
            zzwcVarTake.zzm();
            zzvl zzvlVarZza = this.zzd.zza(zzwcVarTake.zzj());
            if (zzvlVarZza == null) {
                zzwcVarTake.zzd("cache-miss");
                if (!this.zzf.zzc(zzwcVarTake)) {
                    this.zzc.put(zzwcVarTake);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (zzvlVarZza.zza(jCurrentTimeMillis)) {
                zzwcVarTake.zzd("cache-hit-expired");
                zzwcVarTake.zzk(zzvlVarZza);
                if (!this.zzf.zzc(zzwcVarTake)) {
                    this.zzc.put(zzwcVarTake);
                }
                return;
            }
            zzwcVarTake.zzd("cache-hit");
            zzwi<?> zzwiVarZzs = zzwcVarTake.zzs(new zzvy(zzvlVarZza.zza, zzvlVarZza.zzg));
            zzwcVarTake.zzd("cache-hit-parsed");
            if (!zzwiVarZzs.zzc()) {
                zzwcVarTake.zzd("cache-parsing-failed");
                this.zzd.zzd(zzwcVarTake.zzj(), true);
                zzwcVarTake.zzk(null);
                if (!this.zzf.zzc(zzwcVarTake)) {
                    this.zzc.put(zzwcVarTake);
                }
                return;
            }
            if (zzvlVarZza.zzf < jCurrentTimeMillis) {
                zzwcVarTake.zzd("cache-hit-refresh-needed");
                zzwcVarTake.zzk(zzvlVarZza);
                zzwiVarZzs.zzd = true;
                if (this.zzf.zzc(zzwcVarTake)) {
                    this.zzg.zza(zzwcVarTake, zzwiVarZzs, null);
                } else {
                    this.zzg.zza(zzwcVarTake, zzwiVarZzs, new zzvn(this, zzwcVarTake));
                }
            } else {
                this.zzg.zza(zzwcVarTake, zzwiVarZzs, null);
            }
        } finally {
            zzwcVarTake.zzf(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzwo.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzc();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzwo.zzc("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
