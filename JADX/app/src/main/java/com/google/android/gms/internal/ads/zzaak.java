package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaak implements Runnable {
    final /* synthetic */ zzaal zza;

    zzaak(zzaal zzaalVar) {
        this.zza = zzaalVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzl) {
            if (this.zza.zzm) {
                return;
            }
            this.zza.zzm = true;
            try {
                zzaal.zzi(this.zza);
            } catch (Exception e) {
                this.zza.zzh.zzc(2023, -1L, e);
            }
            synchronized (this.zza.zzl) {
                this.zza.zzm = false;
            }
        }
    }
}
