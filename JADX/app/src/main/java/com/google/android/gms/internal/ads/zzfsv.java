package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfsv<V> implements Runnable {

    @CheckForNull
    zzfsy<V> zza;

    zzfsv(zzfsy<V> zzfsyVar) {
        this.zza = zzfsyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfsm<? extends V> zzfsmVar;
        zzfsy<V> zzfsyVar = this.zza;
        if (zzfsyVar == null || (zzfsmVar = ((zzfsy) zzfsyVar).zza) == null) {
            return;
        }
        this.zza = null;
        if (zzfsmVar.isDone()) {
            zzfsyVar.zzr(zzfsmVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = ((zzfsy) zzfsyVar).zzb;
            zzfsy.zzx(zzfsyVar, null);
            String string = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("Timed out (timeout delayed by ");
                        sb.append(jAbs);
                        sb.append(" ms after scheduled time)");
                        string = sb.toString();
                    }
                } catch (Throwable th) {
                    zzfsyVar.zzq(new zzfsx(string, null));
                    throw th;
                }
            }
            String string2 = zzfsmVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 2 + string2.length());
            sb2.append(string);
            sb2.append(": ");
            sb2.append(string2);
            zzfsyVar.zzq(new zzfsx(sb2.toString(), null));
            zzfsmVar.cancel(true);
        } catch (Throwable th2) {
            zzfsmVar.cancel(true);
            throw th2;
        }
    }
}
