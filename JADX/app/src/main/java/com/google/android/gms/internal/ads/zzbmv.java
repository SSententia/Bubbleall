package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbmv extends zzadk implements zzbmw {
    public zzbmv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper iObjectWrapperZzb = zzb();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, iObjectWrapperZzb);
                return true;
            case 3:
                String strZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 4:
                List listZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeList(listZzd);
                return true;
            case 5:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 6:
                zzbmh zzbmhVarZzf = zzf();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbmhVarZzf);
                return true;
            case 7:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 8:
                double dZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzh);
                return true;
            case 9:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 10:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 11:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                zzadl.zze(parcel2, bundleZzk);
                return true;
            case 12:
                zzl();
                parcel2.writeNoException();
                return true;
            case 13:
                zzbhc zzbhcVarZzm = zzm();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbhcVarZzm);
                return true;
            case 14:
                zzn((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZzo = zzo((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzo);
                return true;
            case 16:
                zzp((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                zzblz zzblzVarZzq = zzq();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzblzVarZzq);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperZzr = zzr();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, iObjectWrapperZzr);
                return true;
            case 19:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            default:
                return false;
        }
    }
}
