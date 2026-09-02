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
public final class zzbvr extends zzadj implements IInterface {
    zzbvr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
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

    public final double zzj() throws RemoteException {
        Parcel parcelZzbi = zzbi(7, zza());
        double d = parcelZzbi.readDouble();
        parcelZzbi.recycle();
        return d;
    }

    public final String zzk() throws RemoteException {
        Parcel parcelZzbi = zzbi(8, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    public final String zzl() throws RemoteException {
        Parcel parcelZzbi = zzbi(9, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    public final void zzm() throws RemoteException {
        zzbj(10, zza());
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(11, parcelZza);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(12, parcelZza);
    }

    public final boolean zzp() throws RemoteException {
        Parcel parcelZzbi = zzbi(13, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    public final boolean zzq() throws RemoteException {
        Parcel parcelZzbi = zzbi(14, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    public final Bundle zzr() throws RemoteException {
        Parcel parcelZzbi = zzbi(15, zza());
        Bundle bundle = (Bundle) zzadl.zzc(parcelZzbi, Bundle.CREATOR);
        parcelZzbi.recycle();
        return bundle;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(16, parcelZza);
    }

    public final zzbhc zzt() throws RemoteException {
        Parcel parcelZzbi = zzbi(17, zza());
        zzbhc zzbhcVarZzb = zzbhb.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbhcVarZzb;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        Parcel parcelZzbi = zzbi(18, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    public final zzblz zzv() throws RemoteException {
        Parcel parcelZzbi = zzbi(19, zza());
        zzblz zzblzVarZzj = zzbly.zzj(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzblzVarZzj;
    }

    public final IObjectWrapper zzw() throws RemoteException {
        Parcel parcelZzbi = zzbi(20, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzx() throws RemoteException {
        Parcel parcelZzbi = zzbi(21, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, iObjectWrapper2);
        zzadl.zzf(parcelZza, iObjectWrapper3);
        zzbj(22, parcelZza);
    }
}
