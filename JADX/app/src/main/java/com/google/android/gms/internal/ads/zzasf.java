package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzasf implements Runnable {
    final /* synthetic */ zzasl zza;

    zzasf(zzasl zzaslVar) {
        this.zza = zzaslVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zzF) {
            return;
        }
        this.zza.zzo.zzbh(this.zza);
    }
}
