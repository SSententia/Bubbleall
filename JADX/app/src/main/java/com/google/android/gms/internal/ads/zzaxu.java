package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxu extends zzadj implements zzaxw {
    zzaxu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final zzbfn zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzf(IObjectWrapper iObjectWrapper, zzayd zzaydVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzaydVar);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final zzbgz zzg() throws RemoteException {
        Parcel parcelZzbi = zzbi(5, zza());
        zzbgz zzbgzVarZzb = zzbgy.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbgzVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzh(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzb(parcelZza, z);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzi(zzbgw zzbgwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbgwVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzj(zzaya zzayaVar) throws RemoteException {
        throw null;
    }
}
