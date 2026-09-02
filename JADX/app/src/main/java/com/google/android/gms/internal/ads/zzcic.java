package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcic implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcig zzc;

    zzcic(zzcig zzcigVar, int i, int i2) {
        this.zzc = zzcigVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.zzs != null) {
            this.zzc.zzs.zzj(this.zza, this.zzb);
        }
    }
}
