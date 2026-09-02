package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzchr implements zzfrz {
    final /* synthetic */ zzchp zza;
    final /* synthetic */ zzchn zzb;

    zzchr(zzchs zzchsVar, zzchp zzchpVar, zzchn zzchnVar) {
        this.zza = zzchpVar;
        this.zzb = zzchnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
