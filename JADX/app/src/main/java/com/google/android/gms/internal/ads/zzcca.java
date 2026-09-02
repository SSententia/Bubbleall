package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcca extends zzadj implements IInterface {
    zzcca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcbz zzcbzVar, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzcbzVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbj(2, parcelZza);
    }
}
