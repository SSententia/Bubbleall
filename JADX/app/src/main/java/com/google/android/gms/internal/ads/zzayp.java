package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzayp extends zzadj implements IInterface {
    zzayp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzayk zze(zzayn zzaynVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzaynVar);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        zzayk zzaykVar = (zzayk) zzadl.zzc(parcelZzbi, zzayk.CREATOR);
        parcelZzbi.recycle();
        return zzaykVar;
    }

    public final zzayk zzf(zzayn zzaynVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzaynVar);
        Parcel parcelZzbi = zzbi(2, parcelZza);
        zzayk zzaykVar = (zzayk) zzadl.zzc(parcelZzbi, zzayk.CREATOR);
        parcelZzbi.recycle();
        return zzaykVar;
    }

    public final long zzg(zzayn zzaynVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzaynVar);
        Parcel parcelZzbi = zzbi(3, parcelZza);
        long j = parcelZzbi.readLong();
        parcelZzbi.recycle();
        return j;
    }
}
