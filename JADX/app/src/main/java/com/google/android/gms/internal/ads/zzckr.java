package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckr implements Runnable {
    final /* synthetic */ zzcks zza;

    zzckr(zzcks zzcksVar) {
        this.zza = zzcksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzy().zzd(this.zza);
    }
}
