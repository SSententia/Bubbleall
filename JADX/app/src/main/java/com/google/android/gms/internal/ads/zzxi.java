package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzxi implements zzwx {
    final /* synthetic */ Context zza;
    private File zzb = null;

    zzxi(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzwx
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
