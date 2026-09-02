package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzekn implements zzelx<zzcvh> {
    final /* synthetic */ zzeko zza;

    zzekn(zzeko zzekoVar) {
        this.zza = zzekoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(zzcvh zzcvhVar) {
        zzcvh zzcvhVar2 = zzcvhVar;
        synchronized (this.zza) {
            if (this.zza.zzg != null) {
                this.zza.zzg.zzT();
            }
            this.zza.zzg = zzcvhVar2;
            this.zza.zzg.zzS();
        }
    }
}
