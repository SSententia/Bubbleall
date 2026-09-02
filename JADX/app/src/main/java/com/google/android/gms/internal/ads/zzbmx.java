package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbmx extends zzadk implements zzbmy {
    public zzbmx() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
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
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 9:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                zzadl.zze(parcel2, bundleZzi);
                return true;
            case 10:
                zzj();
                parcel2.writeNoException();
                return true;
            case 11:
                zzbhc zzbhcVarZzk = zzk();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbhcVarZzk);
                return true;
            case 12:
                zzl((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzm = zzm((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzm);
                return true;
            case 14:
                zzn((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzblz zzblzVarZzo = zzo();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzblzVarZzo);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperZzp = zzp();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, iObjectWrapperZzp);
                return true;
            case 17:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            default:
                return false;
        }
    }
}
