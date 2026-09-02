package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfst {
    public static Executor zza() {
        return zzfrr.INSTANCE;
    }

    public static zzfsn zzb(ExecutorService executorService) {
        if (executorService instanceof zzfsn) {
            return (zzfsn) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzfss((ScheduledExecutorService) executorService) : new zzfsp(executorService);
    }

    static Executor zzc(Executor executor, zzfqw<?> zzfqwVar) {
        executor.getClass();
        return executor == zzfrr.INSTANCE ? executor : new zzfso(executor, zzfqwVar);
    }
}
