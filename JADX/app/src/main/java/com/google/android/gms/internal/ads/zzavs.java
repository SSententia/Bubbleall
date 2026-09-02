package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzavs implements Runnable {
    final /* synthetic */ zzanm zza;
    final /* synthetic */ zzavx zzb;

    zzavs(zzavx zzavxVar, zzanm zzanmVar) {
        this.zzb = zzavxVar;
        this.zza = zzanmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzl(this.zza);
    }
}
