package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbgd extends zzadk implements zzbge {
    public zzbgd() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbgq zzbgoVar;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                zzg(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                zzh(zzadl.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                zzi(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzj(parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzl);
                return true;
            case 9:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 10:
                zzn(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                zzo(zzbvf.zzg(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                zzp(zzbrr.zzc(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                List<zzbrl> listZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzq);
                return true;
            case 14:
                zzr((zzbim) zzadl.zzc(parcel, zzbim.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbgoVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzbgoVar = iInterfaceQueryLocalInterface instanceof zzbgq ? (zzbgq) iInterfaceQueryLocalInterface : new zzbgo(strongBinder);
                }
                zzt(zzbgoVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
