package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzawu implements Runnable {
    final /* synthetic */ zzawv zza;

    zzawu(zzawv zzawvVar) {
        this.zza = zzawvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzc) {
            if (this.zza.zzd && this.zza.zze) {
                zzawv.zzc(this.zza, false);
                com.google.android.gms.ads.internal.util.zze.zzd("App went background");
                Iterator it = this.zza.zzf.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzaww) it.next()).zza(false);
                    } catch (Exception e) {
                        zzcgt.zzg("", e);
                    }
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zzd("App is still foreground");
            }
        }
    }
}
