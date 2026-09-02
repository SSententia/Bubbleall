package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzwn {
    public static final boolean zza = zzwo.zzb;
    private final List<zzwm> zzb = new ArrayList();
    private boolean zzc = false;

    zzwn() {
    }

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzwo.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzwm(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        long j;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j = 0;
        } else {
            long j2 = this.zzb.get(0).zzc;
            List<zzwm> list = this.zzb;
            j = list.get(list.size() - 1).zzc - j2;
        }
        if (j <= 0) {
            return;
        }
        long j3 = this.zzb.get(0).zzc;
        zzwo.zzb("(%-4d ms) %s", Long.valueOf(j), str);
        for (zzwm zzwmVar : this.zzb) {
            long j4 = zzwmVar.zzc;
            zzwo.zzb("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(zzwmVar.zzb), zzwmVar.zza);
            j3 = j4;
        }
    }
}
