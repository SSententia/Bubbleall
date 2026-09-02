package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzavw implements Runnable {
    final /* synthetic */ zzapf zza;
    final /* synthetic */ zzavx zzb;

    zzavw(zzavx zzavxVar, zzapf zzapfVar) {
        this.zzb = zzavxVar;
        this.zza = zzapfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}
