package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzblx extends zzadj implements zzblz {
    zzblx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final String zzb() throws RemoteException {
        Parcel parcelZzbi = zzbi(2, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final List<zzbmh> zzc() throws RemoteException {
        Parcel parcelZzbi = zzbi(3, zza());
        ArrayList arrayListZzg = zzadl.zzg(parcelZzbi);
        parcelZzbi.recycle();
        return arrayListZzg;
    }
}
