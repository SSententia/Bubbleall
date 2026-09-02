package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbtg implements Runnable {
    final /* synthetic */ zzbtr zza;
    final /* synthetic */ zzbsn zzb;
    final /* synthetic */ zzbts zzc;

    zzbtg(zzbts zzbtsVar, zzbtr zzbtrVar, zzbsn zzbsnVar) {
        this.zzc = zzbtsVar;
        this.zza = zzbtrVar;
        this.zzb = zzbsnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzc.zza) {
            if (this.zza.zzi() != -1 && this.zza.zzi() != 1) {
                this.zza.zzh();
                zzchg.zze.execute(zzbtf.zza(this.zzb));
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
