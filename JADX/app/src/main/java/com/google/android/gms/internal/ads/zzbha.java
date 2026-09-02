package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbha extends zzadj implements zzbhc {
    zzbha(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zze() throws RemoteException {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzf() throws RemoteException {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzg(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzb(parcelZza, z);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzh() throws RemoteException {
        Parcel parcelZzbi = zzbi(4, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final int zzi() throws RemoteException {
        Parcel parcelZzbi = zzbi(5, zza());
        int i = parcelZzbi.readInt();
        parcelZzbi.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final float zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final float zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzl(zzbhf zzbhfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbhfVar);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final float zzm() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzn() throws RemoteException {
        Parcel parcelZzbi = zzbi(10, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final zzbhf zzo() throws RemoteException {
        zzbhf zzbhdVar;
        Parcel parcelZzbi = zzbi(11, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbhdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzbhdVar = iInterfaceQueryLocalInterface instanceof zzbhf ? (zzbhf) iInterfaceQueryLocalInterface : new zzbhd(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbhdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzp() throws RemoteException {
        Parcel parcelZzbi = zzbi(12, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzq() throws RemoteException {
        zzbj(13, zza());
    }
}
