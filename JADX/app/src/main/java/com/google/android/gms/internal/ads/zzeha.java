package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeha extends zzbxg {
    final /* synthetic */ zzehc zza;
    private final zzeef<zzbxn, zzefy> zzb;

    /* synthetic */ zzeha(zzehc zzehcVar, zzeef zzeefVar, zzehb zzehbVar) {
        this.zza = zzehcVar;
        this.zzb = zzeefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zze(zzbvv zzbvvVar) throws RemoteException {
        this.zza.zzc = zzbvvVar;
        ((zzefy) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzf(String str) throws RemoteException {
        ((zzefy) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzg(zzbcz zzbczVar) throws RemoteException {
        ((zzefy) this.zzb.zzc).zzx(zzbczVar);
    }
}
