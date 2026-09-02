package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfcu implements zzfrz<Void> {
    final /* synthetic */ zzfcx zza;
    final /* synthetic */ zzfcy zzb;

    zzfcu(zzfcy zzfcyVar, zzfcx zzfcxVar) {
        this.zzb = zzfcyVar;
        this.zza = zzfcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            zzfcy.zzb(this.zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(Void r3) {
        synchronized (this.zzb) {
            zzfcy.zzb(this.zzb, null);
            this.zzb.zzd.addFirst(this.zza);
            if (this.zzb.zzf == 1) {
                this.zzb.zzh();
            }
        }
    }
}
