package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcoc extends zzadk implements zzcod {
    public zzcoc() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzb((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundleZzc = zzc((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzadl.zze(parcel2, bundleZzc);
                return true;
            case 3:
                zzd(parcel.readString(), parcel.readString(), (Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                zze(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map mapZzf = zzf(parcel.readString(), parcel.readString(), zzadl.zza(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(mapZzf);
                return true;
            case 6:
                int iZzg = zzg(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iZzg);
                return true;
            case 7:
                zzh((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzi(parcel.readString(), parcel.readString(), (Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List listZzj = zzj(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(listZzj);
                return true;
            case 10:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 11:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 12:
                long jZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeLong(jZzm);
                return true;
            case 13:
                zzn(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                zzo(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                zzq(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 17:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 18:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 19:
                zzp((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
