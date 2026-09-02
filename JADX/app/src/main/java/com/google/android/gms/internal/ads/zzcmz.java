package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzcmz implements Runnable {
    private final zzcml zza;

    private zzcmz(zzcml zzcmlVar) {
        this.zza = zzcmlVar;
    }

    static Runnable zza(zzcml zzcmlVar) {
        return new zzcmz(zzcmlVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.destroy();
    }
}
