package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcct extends zzadj implements zzccv {
    zzcct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zze() throws RemoteException {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzf() throws RemoteException {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzg(zzccp zzccpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzccpVar);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzh(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzi(zzbcz zzbczVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbczVar);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzj() throws RemoteException {
        zzbj(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzk() throws RemoteException {
        zzbj(7, zza());
    }
}
