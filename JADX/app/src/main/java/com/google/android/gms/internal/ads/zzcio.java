package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcio implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcip zzb;

    zzcio(zzcip zzcipVar, boolean z) {
        this.zzb = zzcipVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
