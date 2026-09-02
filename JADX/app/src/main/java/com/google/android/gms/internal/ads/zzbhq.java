package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhq extends zzbgp {
    private zzbhq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zze(@Nullable zzbcz zzbczVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListener = zzbhs.zze().zzg;
        if (onAdInspectorClosedListener != null) {
            onAdInspectorClosedListener.onAdInspectorClosed(zzbczVar == null ? null : new AdInspectorError(zzbczVar.zza, zzbczVar.zzb, zzbczVar.zzc));
        }
    }

    /* synthetic */ zzbhq(zzbhp zzbhpVar) {
    }
}
