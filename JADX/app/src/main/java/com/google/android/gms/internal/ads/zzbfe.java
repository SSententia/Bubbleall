package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbfe extends zzadj implements zzbfg {
    zzbfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zze(zzbdg zzbdgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbdgVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean zzg() throws RemoteException {
        Parcel parcelZzbi = zzbi(3, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final String zzh() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzi(zzbdg zzbdgVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbdgVar);
        parcelZza.writeInt(i);
        zzbj(5, parcelZza);
    }
}
