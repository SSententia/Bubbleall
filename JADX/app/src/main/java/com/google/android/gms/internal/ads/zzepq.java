package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzepq implements zzerx<Bundle> {
    public final Bundle zza;

    public zzepq(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundleZza = zzfbd.zza(bundle2, "device");
        bundleZza.putBundle("android_mem_info", this.zza);
        bundle2.putBundle("device", bundleZza);
    }
}
