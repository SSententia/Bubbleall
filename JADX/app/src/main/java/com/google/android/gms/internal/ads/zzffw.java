package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffw extends zzadj implements zzffy {
    zzffw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    public final boolean zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzbi = zzbi(2, parcelZza);
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    public final void zzg(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, iObjectWrapper2);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    public final String zzh() throws RemoteException {
        Parcel parcelZzbi = zzbi(6, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    public final void zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, iObjectWrapper2);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    public final IObjectWrapper zzk(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzadl.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString("");
        parcelZza.writeString("javascript");
        parcelZza.writeString(str4);
        parcelZza.writeString(str5);
        parcelZza.writeString(str6);
        parcelZza.writeString(str7);
        parcelZza.writeString(str8);
        Parcel parcelZzbi = zzbi(10, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    public final IObjectWrapper zzl(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzadl.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString("");
        parcelZza.writeString("javascript");
        parcelZza.writeString(str4);
        parcelZza.writeString("Google");
        parcelZza.writeString(str6);
        parcelZza.writeString(str7);
        parcelZza.writeString(str8);
        Parcel parcelZzbi = zzbi(11, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }
}
