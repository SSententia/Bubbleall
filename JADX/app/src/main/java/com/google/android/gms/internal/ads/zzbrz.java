package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbrz extends zzadk implements zzbsa {
    public zzbrz() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbsd zzbsbVar;
        if (i == 3) {
            zzbhc zzbhcVarZzb = zzb();
            parcel2.writeNoException();
            zzadl.zzf(parcel2, zzbhcVarZzb);
            return true;
        }
        if (i == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbsbVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbsbVar = iInterfaceQueryLocalInterface instanceof zzbsd ? (zzbsd) iInterfaceQueryLocalInterface : new zzbsb(strongBinder);
            }
            zzd(iObjectWrapperAsInterface, zzbsbVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        zzbme zzbmeVarZzf = zzf();
        parcel2.writeNoException();
        zzadl.zzf(parcel2, zzbmeVarZzf);
        return true;
    }
}
