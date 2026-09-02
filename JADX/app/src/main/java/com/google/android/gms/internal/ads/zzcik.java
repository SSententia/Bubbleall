package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzcik implements Runnable {
    private final zzcii zza;

    private zzcik(zzcii zzciiVar) {
        this.zza = zzciiVar;
    }

    static Runnable zza(zzcii zzciiVar) {
        return new zzcik(zzciiVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
