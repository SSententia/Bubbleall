package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfhg implements Runnable {
    final /* synthetic */ zzfhh zza;
    private final WebView zzb;

    zzfhg(zzfhh zzfhhVar) {
        this.zza = zzfhhVar;
        this.zzb = zzfhhVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
