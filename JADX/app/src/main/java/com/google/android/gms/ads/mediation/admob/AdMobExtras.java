package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import com.google.ads.mediation.NetworkExtras;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AdMobExtras implements NetworkExtras {
    private final Bundle zza;

    public AdMobExtras(Bundle bundle) {
        this.zza = bundle != null ? new Bundle(bundle) : null;
    }

    public Bundle getExtras() {
        return this.zza;
    }
}
