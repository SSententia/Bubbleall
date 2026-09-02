package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdww extends zzccu {
    final /* synthetic */ zzdwx zza;

    zzdww(zzdwx zzdwxVar) {
        this.zza = zzdwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zze() throws RemoteException {
        this.zza.zzc.zzm(this.zza.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzf() throws RemoteException {
        this.zza.zzc.zzo(this.zza.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzg(zzccp zzccpVar) throws RemoteException {
        this.zza.zzc.zzp(this.zza.zza, zzccpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzh(int i) throws RemoteException {
        this.zza.zzc.zzn(this.zza.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzi(zzbcz zzbczVar) throws RemoteException {
        this.zza.zzc.zzn(this.zza.zza, zzbczVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzj() throws RemoteException {
        this.zza.zzc.zzq(this.zza.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzk() throws RemoteException {
        this.zza.zzc.zzr(this.zza.zza);
    }
}
