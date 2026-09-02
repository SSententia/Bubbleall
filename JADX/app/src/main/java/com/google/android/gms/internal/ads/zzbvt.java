package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbvt extends zzadj implements zzbvv {
    zzbvt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final float zzA() throws RemoteException {
        Parcel parcelZzbi = zzbi(24, zza());
        float f = parcelZzbi.readFloat();
        parcelZzbi.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final float zzB() throws RemoteException {
        Parcel parcelZzbi = zzbi(25, zza());
        float f = parcelZzbi.readFloat();
        parcelZzbi.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final String zze() throws RemoteException {
        Parcel parcelZzbi = zzbi(2, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final List zzf() throws RemoteException {
        Parcel parcelZzbi = zzbi(3, zza());
        ArrayList arrayListZzg = zzadl.zzg(parcelZzbi);
        parcelZzbi.recycle();
        return arrayListZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final String zzg() throws RemoteException {
        Parcel parcelZzbi = zzbi(4, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final zzbmh zzh() throws RemoteException {
        Parcel parcelZzbi = zzbi(5, zza());
        zzbmh zzbmhVarZzg = zzbmg.zzg(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbmhVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final String zzi() throws RemoteException {
        Parcel parcelZzbi = zzbi(6, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final String zzj() throws RemoteException {
        Parcel parcelZzbi = zzbi(7, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final double zzk() throws RemoteException {
        Parcel parcelZzbi = zzbi(8, zza());
        double d = parcelZzbi.readDouble();
        parcelZzbi.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final String zzl() throws RemoteException {
        Parcel parcelZzbi = zzbi(9, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final String zzm() throws RemoteException {
        Parcel parcelZzbi = zzbi(10, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final zzbhc zzn() throws RemoteException {
        Parcel parcelZzbi = zzbi(11, zza());
        zzbhc zzbhcVarZzb = zzbhb.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbhcVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final zzblz zzo() throws RemoteException {
        Parcel parcelZzbi = zzbi(12, zza());
        zzblz zzblzVarZzj = zzbly.zzj(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzblzVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final IObjectWrapper zzp() throws RemoteException {
        Parcel parcelZzbi = zzbi(13, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final IObjectWrapper zzq() throws RemoteException {
        Parcel parcelZzbi = zzbi(14, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final IObjectWrapper zzr() throws RemoteException {
        Parcel parcelZzbi = zzbi(15, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final Bundle zzs() throws RemoteException {
        Parcel parcelZzbi = zzbi(16, zza());
        Bundle bundle = (Bundle) zzadl.zzc(parcelZzbi, Bundle.CREATOR);
        parcelZzbi.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final boolean zzt() throws RemoteException {
        Parcel parcelZzbi = zzbi(17, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final boolean zzu() throws RemoteException {
        Parcel parcelZzbi = zzbi(18, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zzv() throws RemoteException {
        zzbj(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zzx(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, iObjectWrapper2);
        zzadl.zzf(parcelZza, iObjectWrapper3);
        zzbj(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final float zzz() throws RemoteException {
        Parcel parcelZzbi = zzbi(23, zza());
        float f = parcelZzbi.readFloat();
        parcelZzbi.recycle();
        return f;
    }
}
