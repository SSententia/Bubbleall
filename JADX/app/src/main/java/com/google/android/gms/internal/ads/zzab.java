package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import com.android.billingclient.api.zzn$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzab {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = zzn$$ExternalSyntheticApiModelOutline0.m374m(0, 0);

    static /* synthetic */ void zza(zzab zzabVar, int i, int i2) {
        zzabVar.zzb.set(i, i2);
        zzabVar.zza.setPattern(zzabVar.zzb);
    }
}
