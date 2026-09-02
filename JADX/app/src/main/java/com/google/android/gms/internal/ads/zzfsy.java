package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfsy<V> extends zzfrt<V> {

    @CheckForNull
    private zzfsm<V> zza;

    @CheckForNull
    private ScheduledFuture<?> zzb;

    private zzfsy(zzfsm<V> zzfsmVar) {
        zzfsmVar.getClass();
        this.zza = zzfsmVar;
    }

    static /* synthetic */ ScheduledFuture zzx(zzfsy zzfsyVar, ScheduledFuture scheduledFuture) {
        zzfsyVar.zzb = null;
        return null;
    }

    static <V> zzfsm<V> zzy(zzfsm<V> zzfsmVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfsy zzfsyVar = new zzfsy(zzfsmVar);
        zzfsv zzfsvVar = new zzfsv(zzfsyVar);
        zzfsyVar.zzb = scheduledExecutorService.schedule(zzfsvVar, j, timeUnit);
        zzfsmVar.zze(zzfsvVar, zzfrr.INSTANCE);
        return zzfsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    @CheckForNull
    protected final String zzc() {
        zzfsm<V> zzfsmVar = this.zza;
        ScheduledFuture<?> scheduledFuture = this.zzb;
        if (zzfsmVar == null) {
            return null;
        }
        String string = zzfsmVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 14);
        sb.append("inputFuture=[");
        sb.append(string);
        sb.append("]");
        String string2 = sb.toString();
        if (scheduledFuture == null) {
            return string2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return string2;
        }
        StringBuilder sb2 = new StringBuilder(string2.length() + 43);
        sb2.append(string2);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    protected final void zzd() {
        zzv(this.zza);
        ScheduledFuture<?> scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
