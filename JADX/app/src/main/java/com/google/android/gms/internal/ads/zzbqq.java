package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbqq extends zzadj implements zzbqs {
    zzbqq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final zzbqp zze(IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, int i, zzbqm zzbqmVar) throws RemoteException {
        zzbqp zzbqnVar;
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbvgVar);
        parcelZza.writeInt(213806000);
        zzadl.zzf(parcelZza, zzbqmVar);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbqnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbqnVar = iInterfaceQueryLocalInterface instanceof zzbqp ? (zzbqp) iInterfaceQueryLocalInterface : new zzbqn(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbqnVar;
    }
}
