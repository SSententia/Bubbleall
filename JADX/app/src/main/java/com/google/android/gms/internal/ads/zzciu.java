package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzciu implements Runnable {
    final /* synthetic */ zzcih zza;

    zzciu(zzciv zzcivVar, zzcih zzcihVar) {
        this.zza = zzcihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzi();
    }
}
