package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdwv extends zzccy {
    final /* synthetic */ zzdwx zza;

    zzdwv(zzdwx zzdwxVar) {
        this.zza = zzdwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zze() throws RemoteException {
        this.zza.zzc.zzk(this.zza.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzf(int i) throws RemoteException {
        this.zza.zzc.zzl(this.zza.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzg(zzbcz zzbczVar) throws RemoteException {
        this.zza.zzc.zzl(this.zza.zza, zzbczVar.zza);
    }
}
