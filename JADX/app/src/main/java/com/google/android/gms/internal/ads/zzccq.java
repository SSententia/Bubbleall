package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzccq extends zzadj implements zzccs {
    zzccq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzc(zzbdg zzbdgVar, zzccz zzcczVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbdgVar);
        zzadl.zzf(parcelZza, zzcczVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzd(zzbdg zzbdgVar, zzccz zzcczVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbdgVar);
        zzadl.zzf(parcelZza, zzcczVar);
        zzbj(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zze(zzccv zzccvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzccvVar);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzf(zzbgt zzbgtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbgtVar);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final Bundle zzg() throws RemoteException {
        Parcel parcelZzbi = zzbi(9, zza());
        Bundle bundle = (Bundle) zzadl.zzc(parcelZzbi, Bundle.CREATOR);
        parcelZzbi.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzh(zzcdg zzcdgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzcdgVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final boolean zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final String zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final zzccp zzl() throws RemoteException {
        zzccp zzccnVar;
        Parcel parcelZzbi = zzbi(11, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzccnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzccnVar = iInterfaceQueryLocalInterface instanceof zzccp ? (zzccp) iInterfaceQueryLocalInterface : new zzccn(strongBinder);
        }
        parcelZzbi.recycle();
        return zzccnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final zzbgz zzm() throws RemoteException {
        Parcel parcelZzbi = zzbi(12, zza());
        zzbgz zzbgzVarZzb = zzbgy.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbgzVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzn(zzbgw zzbgwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbgwVar);
        zzbj(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzo(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzb(parcelZza, z);
        zzbj(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzp(zzcda zzcdaVar) throws RemoteException {
        throw null;
    }
}
