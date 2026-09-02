package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbvf extends zzadk implements zzbvg {
    public zzbvf() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbvg zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbvg ? (zzbvg) iInterfaceQueryLocalInterface : new zzbve(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzbvj zzbvjVarZzb = zzb(parcel.readString());
            parcel2.writeNoException();
            zzadl.zzf(parcel2, zzbvjVarZzb);
        } else if (i == 2) {
            boolean zZzc = zzc(parcel.readString());
            parcel2.writeNoException();
            zzadl.zzb(parcel2, zZzc);
        } else if (i == 3) {
            zzbxn zzbxnVarZzf = zzf(parcel.readString());
            parcel2.writeNoException();
            zzadl.zzf(parcel2, zzbxnVarZzf);
        } else {
            if (i != 4) {
                return false;
            }
            boolean zZzd = zzd(parcel.readString());
            parcel2.writeNoException();
            zzadl.zzb(parcel2, zZzd);
        }
        return true;
    }
}
