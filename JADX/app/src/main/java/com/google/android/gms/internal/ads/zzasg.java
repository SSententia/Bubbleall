package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzasg implements Runnable {
    final /* synthetic */ zzasj zza;
    final /* synthetic */ zzasl zzb;

    zzasg(zzasl zzaslVar, zzasj zzasjVar) {
        this.zzb = zzaslVar;
        this.zza = zzasjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
        int size = this.zzb.zzn.size();
        for (int i = 0; i < size; i++) {
            ((zzata) this.zzb.zzn.valueAt(i)).zzg();
        }
    }
}
