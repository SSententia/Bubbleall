package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzewg implements Runnable {
    private final zzeli zza;

    private zzewg(zzeli zzeliVar) {
        this.zza = zzeliVar;
    }

    static Runnable zza(zzeli zzeliVar) {
        return new zzewg(zzeliVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf();
    }
}
