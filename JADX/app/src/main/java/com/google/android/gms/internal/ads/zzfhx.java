package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhx {
    private final BlockingQueue<Runnable> zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque<zzfhw> zzc = new ArrayDeque<>();
    private zzfhw zzd = null;

    public zzfhx() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfhw zzfhwVarPoll = this.zzc.poll();
        this.zzd = zzfhwVarPoll;
        if (zzfhwVarPoll != null) {
            zzfhwVarPoll.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfhw zzfhwVar) {
        zzfhwVar.zzb(this);
        this.zzc.add(zzfhwVar);
        if (this.zzd == null) {
            zzc();
        }
    }

    public final void zzb(zzfhw zzfhwVar) {
        this.zzd = null;
        zzc();
    }
}
