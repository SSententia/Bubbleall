package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcci extends zzadj implements zzcck {
    zzcci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzk(IObjectWrapper iObjectWrapper, zzccl zzcclVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzcclVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzm(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i);
        zzbj(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(11, parcelZza);
    }
}
