package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfrc implements Runnable {
    final /* synthetic */ zzfoe zza;
    final /* synthetic */ zzfrd zzb;

    zzfrc(zzfrd zzfrdVar, zzfoe zzfoeVar) {
        this.zzb = zzfrdVar;
        this.zza = zzfoeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfrd.zzy(this.zzb, this.zza);
    }
}
