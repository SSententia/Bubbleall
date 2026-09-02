package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbly extends zzadk implements zzblz {
    public zzbly() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzblz zzj(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof zzblz ? (zzblz) iInterfaceQueryLocalInterface : new zzblx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String strZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(strZzb);
            return true;
        }
        if (i != 3) {
            return false;
        }
        List<zzbmh> listZzc = zzc();
        parcel2.writeNoException();
        parcel2.writeList(listZzc);
        return true;
    }
}
