package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbzo extends zzadj implements zzbzq {
    zzbzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zze() throws RemoteException {
        zzbj(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzf() throws RemoteException {
        zzbj(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final boolean zzg() throws RemoteException {
        Parcel parcelZzbi = zzbi(11, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzh(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, bundle);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzi() throws RemoteException {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzj() throws RemoteException {
        zzbj(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzk() throws RemoteException {
        zzbj(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzl() throws RemoteException {
        zzbj(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzm(int i, int i2, Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        zzadl.zzd(parcelZza, intent);
        zzbj(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzo(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, bundle);
        Parcel parcelZzbi = zzbi(6, parcelZza);
        if (parcelZzbi.readInt() != 0) {
            bundle.readFromParcel(parcelZzbi);
        }
        parcelZzbi.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzp() throws RemoteException {
        zzbj(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzq() throws RemoteException {
        zzbj(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzs() throws RemoteException {
        zzbj(9, zza());
    }
}
