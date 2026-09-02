package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfrh extends zzfre {
    private zzfrh() {
        super(null);
    }

    /* synthetic */ zzfrh(zzfrf zzfrfVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    final void zza(zzfri<?> zzfriVar, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
        synchronized (zzfriVar) {
            if (((zzfri) zzfriVar).seenExceptions == null) {
                ((zzfri) zzfriVar).seenExceptions = set2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    final int zzb(zzfri<?> zzfriVar) {
        int i;
        synchronized (zzfriVar) {
            i = ((zzfri) zzfriVar).remaining - 1;
            ((zzfri) zzfriVar).remaining = i;
        }
        return i;
    }
}
