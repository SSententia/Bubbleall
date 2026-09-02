package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbna extends zzadk implements zzbnb {
    public zzbna() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbnb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof zzbnb ? (zzbnb) iInterfaceQueryLocalInterface : new zzbmz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String strZze = zze(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                zzbmh zzbmhVarZzf = zzf(parcel.readString());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbmhVarZzf);
                return true;
            case 3:
                List<String> listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzg);
                return true;
            case 4:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 5:
                zzi(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                zzbhc zzbhcVarZzk = zzk();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbhcVarZzk);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper iObjectWrapperZzm = zzm();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, iObjectWrapperZzm);
                return true;
            case 10:
                boolean zZzn = zzn(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzn);
                return true;
            case 11:
                parcel2.writeNoException();
                zzadl.zzf(parcel2, null);
                return true;
            case 12:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzo);
                return true;
            case 13:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzp);
                return true;
            case 14:
                zzq(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zzr();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
