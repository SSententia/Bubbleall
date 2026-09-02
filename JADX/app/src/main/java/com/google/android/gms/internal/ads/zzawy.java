package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzawy implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzaxc zzb;

    zzawy(zzaxc zzaxcVar, View view) {
        this.zzb = zzaxcVar;
        this.zza = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
