package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbgx extends zzadj implements zzbgz {
    zzbgx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final String zze() throws RemoteException {
        Parcel parcelZzbi = zzbi(1, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final String zzf() throws RemoteException {
        Parcel parcelZzbi = zzbi(2, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final List<zzbdp> zzg() throws RemoteException {
        Parcel parcelZzbi = zzbi(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzbi.createTypedArrayList(zzbdp.CREATOR);
        parcelZzbi.recycle();
        return arrayListCreateTypedArrayList;
    }
}
