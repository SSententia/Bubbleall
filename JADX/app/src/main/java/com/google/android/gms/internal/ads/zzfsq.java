package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfsq<V> extends zzfrx<V> implements ScheduledFuture<V>, zzfsm {
    private final ScheduledFuture<?> zza;

    public zzfsq(zzfsm<V> zzfsmVar, ScheduledFuture<?> scheduledFuture) {
        super(zzfsmVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = zzb().cancel(z);
        if (zCancel) {
            this.zza.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
