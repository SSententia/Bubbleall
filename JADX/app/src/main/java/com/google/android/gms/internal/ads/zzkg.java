package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzkg {
    private final CopyOnWriteArrayList<zzkf> zza = new CopyOnWriteArrayList<>();

    public final void zza(Handler handler, zzkh zzkhVar) {
        zzb(zzkhVar);
        this.zza.add(new zzkf(handler, zzkhVar));
    }

    public final void zzb(zzkh zzkhVar) {
        for (zzkf zzkfVar : this.zza) {
            if (zzkfVar.zzb == zzkhVar) {
                zzkfVar.zzd();
                this.zza.remove(zzkfVar);
            }
        }
    }

    public final void zzc(final int i, final long j, final long j2) {
        for (final zzkf zzkfVar : this.zza) {
            if (!zzkfVar.zzc) {
                zzkfVar.zza.post(new Runnable(zzkfVar, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzke
                    private final zzkf zza;
                    private final int zzb;
                    private final long zzc;
                    private final long zzd;

                    {
                        this.zza = zzkfVar;
                        this.zzb = i;
                        this.zzc = j;
                        this.zzd = j2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzkf zzkfVar2 = this.zza;
                        zzkfVar2.zzb.zzW(this.zzb, this.zzc, this.zzd);
                    }
                });
            }
        }
    }
}
