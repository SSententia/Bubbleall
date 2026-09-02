package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbfh extends zzadj implements zzbfj {
    zzbfh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final zzbfg zze() throws RemoteException {
        zzbfg zzbfeVar;
        Parcel parcelZzbi = zzbi(1, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbfeVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbfeVar = iInterfaceQueryLocalInterface instanceof zzbfg ? (zzbfg) iInterfaceQueryLocalInterface : new zzbfe(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzf(zzbfa zzbfaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbfaVar);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzg(zzbnf zzbnfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzh(zzbni zzbniVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzi(String str, zzbno zzbnoVar, zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzadl.zzf(parcelZza, zzbnoVar);
        zzadl.zzf(parcelZza, zzbnlVar);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzj(zzblv zzblvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzblvVar);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzk(zzbns zzbnsVar, zzbdl zzbdlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbnsVar);
        zzadl.zzd(parcelZza, zzbdlVar);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzm(zzbnv zzbnvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbnvVar);
        zzbj(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzn(zzbrx zzbrxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzo(zzbsg zzbsgVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, adManagerAdViewOptions);
        zzbj(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzq(zzbfy zzbfyVar) throws RemoteException {
        throw null;
    }
}
