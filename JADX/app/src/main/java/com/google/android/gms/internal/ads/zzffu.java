package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffu {
    private final Executor zza;
    private final zzcgy zzb;

    public zzffu(Executor executor, zzcgy zzcgyVar) {
        this.zza = executor;
        this.zzb = zzcgyVar;
    }

    public final void zza(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
    }

    public final void zzb(final String str) {
        this.zza.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzfft
            private final zzffu zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(this.zzb);
            }
        });
    }

    final /* synthetic */ void zzc(String str) {
        this.zzb.zza(str);
    }
}
