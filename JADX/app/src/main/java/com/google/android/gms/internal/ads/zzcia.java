package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcia implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcig zzc;

    zzcia(zzcig zzcigVar, String str, String str2) {
        this.zzc = zzcigVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.zzs != null) {
            this.zzc.zzs.zzf(this.zza, this.zzb);
        }
    }
}
