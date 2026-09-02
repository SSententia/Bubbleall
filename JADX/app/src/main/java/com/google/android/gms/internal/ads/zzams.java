package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzams extends zzadj implements zzamu {
    zzams(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzamu
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString("GMA_SDK");
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzamu
    public final void zzf() throws RemoteException {
        zzbj(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzamu
    public final void zzg(int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzamu
    public final void zzh(byte[] bArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzamu
    public final void zzi(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(0);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzamu
    public final void zzj(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzbj(7, parcelZza);
    }
}
