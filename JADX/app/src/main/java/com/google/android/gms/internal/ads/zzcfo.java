package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcfo extends zzadj implements zzcfq {
    zzcfo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final zzcfn zze(IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, int i) throws RemoteException {
        zzcfn zzcflVar;
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbvgVar);
        parcelZza.writeInt(213806000);
        Parcel parcelZzbi = zzbi(2, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzcflVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcflVar = iInterfaceQueryLocalInterface instanceof zzcfn ? (zzcfn) iInterfaceQueryLocalInterface : new zzcfl(strongBinder);
        }
        parcelZzbi.recycle();
        return zzcflVar;
    }
}
