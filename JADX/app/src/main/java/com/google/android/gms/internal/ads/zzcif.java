package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcif implements Runnable {
    final /* synthetic */ zzcig zza;

    zzcif(zzcig zzcigVar) {
        this.zza = zzcigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zzs != null) {
            this.zza.zzs.zzd();
        }
    }
}
