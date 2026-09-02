package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdqo implements zzblt {
    final /* synthetic */ zzdqp zza;

    zzdqo(zzdqp zzdqpVar) {
        this.zza = zzdqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zza() {
        if (this.zza.zzd != null) {
            this.zza.zzd.zzc("_videoMediaView");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zzb(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final JSONObject zzd() {
        return null;
    }
}
