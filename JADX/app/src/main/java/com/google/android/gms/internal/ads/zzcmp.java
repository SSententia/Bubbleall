package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcmp implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcdy zza;
    final /* synthetic */ zzcms zzb;

    zzcmp(zzcms zzcmsVar, zzcdy zzcdyVar) {
        this.zzb = zzcmsVar;
        this.zza = zzcdyVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzM(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
