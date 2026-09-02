package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaoe implements Runnable {
    final /* synthetic */ zzanm zza;
    final /* synthetic */ zzaoi zzb;

    zzaoe(zzaoi zzaoiVar, zzanm zzanmVar) {
        this.zzb = zzaoiVar;
        this.zza = zzanmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzh(this.zza);
    }
}
