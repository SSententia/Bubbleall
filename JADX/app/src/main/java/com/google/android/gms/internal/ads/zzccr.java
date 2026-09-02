package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzccr extends zzadk implements zzccs {
    public zzccr() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzccs zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzccs ? (zzccs) iInterfaceQueryLocalInterface : new zzccq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzccz zzccxVar = null;
        zzccz zzccxVar2 = null;
        zzcda zzcdaVar = null;
        zzccv zzcctVar = null;
        switch (i) {
            case 1:
                zzbdg zzbdgVar = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccxVar = iInterfaceQueryLocalInterface instanceof zzccz ? (zzccz) iInterfaceQueryLocalInterface : new zzccx(strongBinder);
                }
                zzc(zzbdgVar, zzccxVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcctVar = iInterfaceQueryLocalInterface2 instanceof zzccv ? (zzccv) iInterfaceQueryLocalInterface2 : new zzcct(strongBinder2);
                }
                zze(zzcctVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzi = zzi();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzi);
                return true;
            case 4:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzcdaVar = iInterfaceQueryLocalInterface3 instanceof zzcda ? (zzcda) iInterfaceQueryLocalInterface3 : new zzcda(strongBinder3);
                }
                zzp(zzcdaVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzh((zzcdg) zzadl.zzc(parcel, zzcdg.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzf(zzbgs.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzadl.zze(parcel2, bundleZzg);
                return true;
            case 10:
                zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzadl.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                zzccp zzccpVarZzl = zzl();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzccpVarZzl);
                return true;
            case 12:
                zzbgz zzbgzVarZzm = zzm();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbgzVarZzm);
                return true;
            case 13:
                zzn(zzbgv.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbdg zzbdgVar2 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccxVar2 = iInterfaceQueryLocalInterface4 instanceof zzccz ? (zzccz) iInterfaceQueryLocalInterface4 : new zzccx(strongBinder4);
                }
                zzd(zzbdgVar2, zzccxVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzo(zzadl.zza(parcel));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
