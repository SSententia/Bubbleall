package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzavv implements Runnable {
    final /* synthetic */ Surface zza;
    final /* synthetic */ zzavx zzb;

    zzavv(zzavx zzavxVar, Surface surface) {
        this.zzb = zzavxVar;
        this.zza = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzo(this.zza);
    }
}
