package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.lang.Exception;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzei<T extends Exception> {
    private T zza;
    private long zzb;

    public zzei(long j) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
    public final void zza(T t) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = t;
            this.zzb = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.zzb) {
            T t2 = this.zza;
            if (t2 != t) {
                zzged.zza(t2, t);
            }
            T t3 = this.zza;
            this.zza = null;
            throw t3;
        }
    }

    public final void zzb() {
        this.zza = null;
    }
}
