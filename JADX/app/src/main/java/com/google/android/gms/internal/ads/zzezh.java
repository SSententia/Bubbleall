package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzezh implements Runnable {
    private final zzezc zza;

    private zzezh(zzezc zzezcVar) {
        this.zza = zzezcVar;
    }

    static Runnable zza(zzezc zzezcVar) {
        return new zzezh(zzezcVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf();
    }
}
