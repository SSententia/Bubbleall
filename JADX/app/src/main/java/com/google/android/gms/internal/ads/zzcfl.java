package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcfl extends zzadj implements zzcfn {
    zzcfl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zze(IObjectWrapper iObjectWrapper, zzcfr zzcfrVar, zzcfk zzcfkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzcfrVar);
        zzadl.zzf(parcelZza, zzcfkVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzg(List<Uri> list, IObjectWrapper iObjectWrapper, zzcaf zzcafVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzcafVar);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzh(List<Uri> list, IObjectWrapper iObjectWrapper, zzcaf zzcafVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzcafVar);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzi(zzcam zzcamVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzcamVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(8, parcelZza);
    }
}
