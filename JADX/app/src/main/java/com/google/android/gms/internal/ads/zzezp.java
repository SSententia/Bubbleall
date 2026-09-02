package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzezp implements zzelx<zzdrw> {
    final /* synthetic */ zzezq zza;

    zzezp(zzezq zzezqVar) {
        this.zza = zzezqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(zzdrw zzdrwVar) {
        zzdrw zzdrwVar2 = zzdrwVar;
        synchronized (this.zza) {
            this.zza.zzf = zzdrwVar2;
            this.zza.zzf.zzS();
        }
    }
}
