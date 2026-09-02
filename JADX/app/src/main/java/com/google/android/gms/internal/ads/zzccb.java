package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzccb extends zzadk implements zzccc {
    public zzccb() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb((zzccg) zzadl.zzc(parcel, zzccg.CREATOR));
            parcel2.writeNoException();
        } else if (i != 2) {
            zzccf zzccdVar = null;
            zzcca zzccaVar = null;
            if (i == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzccdVar = iInterfaceQueryLocalInterface instanceof zzccf ? (zzccf) iInterfaceQueryLocalInterface : new zzccd(strongBinder);
                }
                zzd(zzccdVar);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean zZze = zze();
                        parcel2.writeNoException();
                        zzadl.zzb(parcel2, zZze);
                        break;
                    case 6:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        zzi(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 10:
                        zzj(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 11:
                        zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzl);
                        break;
                    case 13:
                        zzm(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 14:
                        zzn(zzbfq.zzb(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzo = zzo();
                        parcel2.writeNoException();
                        zzadl.zze(parcel2, bundleZzo);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzccaVar = iInterfaceQueryLocalInterface2 instanceof zzcca ? (zzcca) iInterfaceQueryLocalInterface2 : new zzcca(strongBinder2);
                        }
                        zzu(zzccaVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        parcel2.writeNoException();
                        break;
                    case 18:
                        zzp(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 19:
                        zzq(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        zzadl.zzb(parcel2, zZzs);
                        break;
                    case 21:
                        zzbgz zzbgzVarZzt = zzt();
                        parcel2.writeNoException();
                        zzadl.zzf(parcel2, zzbgzVarZzt);
                        break;
                    default:
                        return false;
                }
            } else {
                zzr(zzadl.zza(parcel));
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
