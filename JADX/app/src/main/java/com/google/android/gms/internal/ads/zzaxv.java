package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaxv extends zzadk implements zzaxw {
    public zzaxv() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaya zzayaVar = null;
        zzayd zzaybVar = null;
        switch (i) {
            case 2:
                zzbfn zzbfnVarZze = zze();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbfnVarZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    zzayaVar = iInterfaceQueryLocalInterface instanceof zzaya ? (zzaya) iInterfaceQueryLocalInterface : new zzaya(strongBinder);
                }
                zzj(zzayaVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzaybVar = iInterfaceQueryLocalInterface2 instanceof zzayd ? (zzayd) iInterfaceQueryLocalInterface2 : new zzayb(strongBinder2);
                }
                zzf(iObjectWrapperAsInterface, zzaybVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbgz zzbgzVarZzg = zzg();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbgzVarZzg);
                return true;
            case 6:
                zzh(zzadl.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 7:
                zzi(zzbgv.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
