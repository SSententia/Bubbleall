package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcgc {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzcgc() {
    }

    /* synthetic */ zzcgc(zzcgd zzcgdVar) {
    }

    public final void zza() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc == 3) {
                if (this.zzb + ((Long) zzbet.zzc().zzc(zzbjl.zzel)).longValue() <= jCurrentTimeMillis) {
                    this.zzc = 1;
                }
            }
        }
        long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            if (this.zzc == 3) {
                this.zzb = jCurrentTimeMillis2;
            }
        }
    }
}
