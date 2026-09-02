package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabw implements Runnable {
    final /* synthetic */ zzaby zza;

    zzabw(zzaby zzabyVar) {
        this.zza = zzabyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
