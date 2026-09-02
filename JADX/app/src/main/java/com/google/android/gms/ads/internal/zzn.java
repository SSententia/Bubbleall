package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzn implements View.OnTouchListener {
    final /* synthetic */ zzs zza;

    zzn(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zza.zzh == null) {
            return false;
        }
        this.zza.zzh.zzd(motionEvent);
        return false;
    }
}
