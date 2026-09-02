package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfff implements zzffc {
    private final zzffc zza;
    private final Queue<zzffb> zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) zzbet.zzc().zzc(zzbjl.zzgl)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfff(zzffc zzffcVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzffcVar;
        long jIntValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzgk)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzffe
            private final zzfff zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final void zza(zzffb zzffbVar) {
        if (this.zzb.size() < this.zzc) {
            this.zzb.offer(zzffbVar);
            return;
        }
        if (this.zzd.getAndSet(true)) {
            return;
        }
        Queue<zzffb> queue = this.zzb;
        zzffb zzffbVarZza = zzffb.zza("dropped_event");
        Map<String, String> mapZzj = zzffbVar.zzj();
        if (mapZzj.containsKey("action")) {
            zzffbVarZza.zzc("dropped_action", mapZzj.get("action"));
        }
        queue.offer(zzffbVarZza);
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final String zzb(zzffb zzffbVar) {
        return this.zza.zzb(zzffbVar);
    }

    final /* bridge */ /* synthetic */ void zzc() {
        while (!this.zzb.isEmpty()) {
            this.zza.zza(this.zzb.remove());
        }
    }
}
