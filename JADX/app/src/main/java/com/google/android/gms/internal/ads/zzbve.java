package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbve extends zzadj implements zzbvg {
    zzbve(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final zzbvj zzb(String str) throws RemoteException {
        zzbvj zzbvhVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbvhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbvhVar = iInterfaceQueryLocalInterface instanceof zzbvj ? (zzbvj) iInterfaceQueryLocalInterface : new zzbvh(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbvhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final boolean zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbi = zzbi(2, parcelZza);
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final boolean zzd(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbi = zzbi(4, parcelZza);
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final zzbxn zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbi = zzbi(3, parcelZza);
        zzbxn zzbxnVarZzb = zzbxm.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbxnVarZzb;
    }
}
