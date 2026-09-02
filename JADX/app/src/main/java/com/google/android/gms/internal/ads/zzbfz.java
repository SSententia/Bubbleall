package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbfz extends zzadj implements zzbgb {
    zzbfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzb(zzbcz zzbczVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbczVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzc() throws RemoteException {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzd() throws RemoteException {
        zzbj(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zze() throws RemoteException {
        zzbj(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzf() throws RemoteException {
        zzbj(5, zza());
    }
}
