package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzdjc implements zzdgl {
    static final zzdgl zza = new zzdjc();

    private zzdjc() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgl
    public final void zza(Object obj) {
        ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
    }
}
