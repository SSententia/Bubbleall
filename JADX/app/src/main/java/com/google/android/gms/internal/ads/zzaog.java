package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaog implements Runnable {
    final /* synthetic */ zzapf zza;
    final /* synthetic */ zzaoi zzb;

    zzaog(zzaoi zzaoiVar, zzapf zzapfVar) {
        this.zzb = zzaoiVar;
        this.zza = zzapfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}
