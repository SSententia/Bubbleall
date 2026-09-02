package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfss extends zzfsp implements ScheduledExecutorService, zzfsn {
    final ScheduledExecutorService zza;

    zzfss(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzftb zzftbVarZza = zzftb.zza(runnable, null);
        return new zzfsq(zzftbVarZza, this.zza.schedule(zzftbVarZza, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfsr zzfsrVar = new zzfsr(runnable);
        return new zzfsq(zzfsrVar, this.zza.scheduleAtFixedRate(zzfsrVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfsr zzfsrVar = new zzfsr(runnable);
        return new zzfsq(zzfsrVar, this.zza.scheduleWithFixedDelay(zzfsrVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzftb zzftbVar = new zzftb(callable);
        return new zzfsq(zzftbVar, this.zza.schedule(zzftbVar, j, timeUnit));
    }
}
