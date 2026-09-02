package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfju extends zzadj implements IInterface {
    zzfju(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfjs zze(zzfjq zzfjqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzfjqVar);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        zzfjs zzfjsVar = (zzfjs) zzadl.zzc(parcelZzbi, zzfjs.CREATOR);
        parcelZzbi.recycle();
        return zzfjsVar;
    }

    public final void zzf(zzfjn zzfjnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzfjnVar);
        zzbj(2, parcelZza);
    }

    public final zzfkb zzg(zzfjz zzfjzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzfjzVar);
        Parcel parcelZzbi = zzbi(3, parcelZza);
        zzfkb zzfkbVar = (zzfkb) zzadl.zzc(parcelZzbi, zzfkb.CREATOR);
        parcelZzbi.recycle();
        return zzfkbVar;
    }
}
