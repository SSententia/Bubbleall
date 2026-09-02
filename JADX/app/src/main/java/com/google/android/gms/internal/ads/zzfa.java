package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfa {
    public final int zza;
    public final zzhf zzb;
    private final CopyOnWriteArrayList<zzez> zzc;

    public zzfa() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzfa(CopyOnWriteArrayList<zzez> copyOnWriteArrayList, int i, zzhf zzhfVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzhfVar;
    }

    public final zzfa zza(int i, zzhf zzhfVar) {
        return new zzfa(this.zzc, i, zzhfVar);
    }

    public final void zzb(Handler handler, zzfb zzfbVar) {
        this.zzc.add(new zzez(handler, zzfbVar));
    }

    public final void zzc(zzfb zzfbVar) {
        for (zzez zzezVar : this.zzc) {
            if (zzezVar.zzb == zzfbVar) {
                this.zzc.remove(zzezVar);
            }
        }
    }
}
