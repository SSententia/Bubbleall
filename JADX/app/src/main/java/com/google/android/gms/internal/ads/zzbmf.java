package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbmf extends zzadj implements zzbmh {
    zzbmf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final IObjectWrapper zzb() throws RemoteException {
        Parcel parcelZzbi = zzbi(1, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final Uri zzc() throws RemoteException {
        Parcel parcelZzbi = zzbi(2, zza());
        Uri uri = (Uri) zzadl.zzc(parcelZzbi, Uri.CREATOR);
        parcelZzbi.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final double zzd() throws RemoteException {
        Parcel parcelZzbi = zzbi(3, zza());
        double d = parcelZzbi.readDouble();
        parcelZzbi.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final int zze() throws RemoteException {
        Parcel parcelZzbi = zzbi(4, zza());
        int i = parcelZzbi.readInt();
        parcelZzbi.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final int zzf() throws RemoteException {
        Parcel parcelZzbi = zzbi(5, zza());
        int i = parcelZzbi.readInt();
        parcelZzbi.recycle();
        return i;
    }
}
