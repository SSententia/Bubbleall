package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcbd extends zzadj implements zzcbf {
    zzcbd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, parcelFileDescriptor);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzf(com.google.android.gms.ads.internal.util.zzbc zzbcVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbcVar);
        zzbj(2, parcelZza);
    }
}
