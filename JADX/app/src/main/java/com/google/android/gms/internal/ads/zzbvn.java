package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbvn extends zzadj implements zzbvp {
    zzbvn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final IObjectWrapper zze() throws RemoteException {
        Parcel parcelZzbi = zzbi(1, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzbi = zzbi(2, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }
}
