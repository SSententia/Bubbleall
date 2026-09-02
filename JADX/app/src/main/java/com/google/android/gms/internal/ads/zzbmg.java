package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbmg extends zzadk implements zzbmh {
    public zzbmg() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbmh zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof zzbmh ? (zzbmh) iInterfaceQueryLocalInterface : new zzbmf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper iObjectWrapperZzb = zzb();
            parcel2.writeNoException();
            zzadl.zzf(parcel2, iObjectWrapperZzb);
        } else if (i == 2) {
            Uri uriZzc = zzc();
            parcel2.writeNoException();
            zzadl.zze(parcel2, uriZzc);
        } else if (i == 3) {
            double dZzd = zzd();
            parcel2.writeNoException();
            parcel2.writeDouble(dZzd);
        } else if (i == 4) {
            int iZze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(iZze);
        } else {
            if (i != 5) {
                return false;
            }
            int iZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(iZzf);
        }
        return true;
    }
}
