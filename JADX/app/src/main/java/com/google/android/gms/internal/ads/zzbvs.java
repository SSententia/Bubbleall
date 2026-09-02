package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbvs extends zzadj implements IInterface {
    zzbvs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final String zze() throws RemoteException {
        Parcel parcelZzbi = zzbi(2, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    public final List zzf() throws RemoteException {
        Parcel parcelZzbi = zzbi(3, zza());
        ArrayList arrayListZzg = zzadl.zzg(parcelZzbi);
        parcelZzbi.recycle();
        return arrayListZzg;
    }

    public final String zzg() throws RemoteException {
        Parcel parcelZzbi = zzbi(4, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    public final zzbmh zzh() throws RemoteException {
        Parcel parcelZzbi = zzbi(5, zza());
        zzbmh zzbmhVarZzg = zzbmg.zzg(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbmhVarZzg;
    }

    public final String zzi() throws RemoteException {
        Parcel parcelZzbi = zzbi(6, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    public final String zzj() throws RemoteException {
        Parcel parcelZzbi = zzbi(7, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    public final void zzk() throws RemoteException {
        zzbj(8, zza());
    }

    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(9, parcelZza);
    }

    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(10, parcelZza);
    }

    public final boolean zzn() throws RemoteException {
        Parcel parcelZzbi = zzbi(11, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    public final boolean zzo() throws RemoteException {
        Parcel parcelZzbi = zzbi(12, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    public final Bundle zzp() throws RemoteException {
        Parcel parcelZzbi = zzbi(13, zza());
        Bundle bundle = (Bundle) zzadl.zzc(parcelZzbi, Bundle.CREATOR);
        parcelZzbi.recycle();
        return bundle;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(14, parcelZza);
    }

    public final IObjectWrapper zzr() throws RemoteException {
        Parcel parcelZzbi = zzbi(15, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    public final zzbhc zzs() throws RemoteException {
        Parcel parcelZzbi = zzbi(16, zza());
        zzbhc zzbhcVarZzb = zzbhb.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbhcVarZzb;
    }

    public final zzblz zzt() throws RemoteException {
        Parcel parcelZzbi = zzbi(19, zza());
        zzblz zzblzVarZzj = zzbly.zzj(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzblzVarZzj;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        Parcel parcelZzbi = zzbi(20, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzv() throws RemoteException {
        Parcel parcelZzbi = zzbi(21, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    public final void zzw(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, iObjectWrapper2);
        zzadl.zzf(parcelZza, iObjectWrapper3);
        zzbj(22, parcelZza);
    }
}
