package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcaz extends zzadj implements zzcbb {
    zzcaz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zze(zzcbj zzcbjVar, zzcbf zzcbfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzcbjVar);
        zzadl.zzf(parcelZza, zzcbfVar);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzf(zzcbj zzcbjVar, zzcbf zzcbfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzcbjVar);
        zzadl.zzf(parcelZza, zzcbfVar);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzg(zzcbj zzcbjVar, zzcbf zzcbfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzcbjVar);
        zzadl.zzf(parcelZza, zzcbfVar);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzh(String str, zzcbf zzcbfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzadl.zzf(parcelZza, zzcbfVar);
        zzbj(7, parcelZza);
    }
}
