package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcba extends zzadk implements zzcbb {
    public zzcba() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcbf zzcbdVar = null;
        if (i == 1) {
            parcel2.writeNoException();
            zzadl.zze(parcel2, null);
        } else if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iInterfaceQueryLocalInterface instanceof zzcbc) {
                } else {
                    new zzcbc(strongBinder);
                }
            }
            parcel2.writeNoException();
        } else if (i == 4) {
            zzcbj zzcbjVar = (zzcbj) zzadl.zzc(parcel, zzcbj.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcbdVar = iInterfaceQueryLocalInterface2 instanceof zzcbf ? (zzcbf) iInterfaceQueryLocalInterface2 : new zzcbd(strongBinder2);
            }
            zze(zzcbjVar, zzcbdVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzcbj zzcbjVar2 = (zzcbj) zzadl.zzc(parcel, zzcbj.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcbdVar = iInterfaceQueryLocalInterface3 instanceof zzcbf ? (zzcbf) iInterfaceQueryLocalInterface3 : new zzcbd(strongBinder3);
            }
            zzf(zzcbjVar2, zzcbdVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzcbj zzcbjVar3 = (zzcbj) zzadl.zzc(parcel, zzcbj.CREATOR);
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcbdVar = iInterfaceQueryLocalInterface4 instanceof zzcbf ? (zzcbf) iInterfaceQueryLocalInterface4 : new zzcbd(strongBinder4);
            }
            zzg(zzcbjVar3, zzcbdVar);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String string = parcel.readString();
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcbdVar = iInterfaceQueryLocalInterface5 instanceof zzcbf ? (zzcbf) iInterfaceQueryLocalInterface5 : new zzcbd(strongBinder5);
            }
            zzh(string, zzcbdVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
