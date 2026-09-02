package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzelp implements zzelx<zzdji> {
    final /* synthetic */ zzelq zza;

    zzelp(zzelq zzelqVar) {
        this.zza = zzelqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(zzdji zzdjiVar) {
        zzdji zzdjiVar2 = zzdjiVar;
        synchronized (this.zza) {
            this.zza.zzg = zzdjiVar2;
            this.zza.zzg.zzS();
        }
    }
}
