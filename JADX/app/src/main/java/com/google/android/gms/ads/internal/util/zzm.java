package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzm implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzs zzb;

    zzm(zzs zzsVar, Context context) {
        this.zzb = zzsVar;
        this.zza = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zzf) {
            this.zzb.zzg = zzs.zzU(this.zza);
            this.zzb.zzf.notifyAll();
        }
    }
}
