package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzerq implements zzerx {
    static final zzerx zza = new zzerq();

    private zzerq() {
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final void zzf(Object obj) {
        ((Bundle) obj).putBoolean("sdk_prefetch", true);
    }
}
