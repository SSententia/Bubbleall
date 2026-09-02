package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfso implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzfqw zzb;

    zzfso(Executor executor, zzfqw zzfqwVar) {
        this.zza = executor;
        this.zzb = zzfqwVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zzq(e);
        }
    }
}
