package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbfl extends zzadj implements zzbfn {
    zzbfl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbgz zzA() throws RemoteException {
        zzbgz zzbgxVar;
        Parcel parcelZzbi = zzbi(41, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbgxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzbgxVar = iInterfaceQueryLocalInterface instanceof zzbgz ? (zzbgz) iInterfaceQueryLocalInterface : new zzbgx(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final String zzB() throws RemoteException {
        Parcel parcelZzbi = zzbi(31, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbfu zzC() throws RemoteException {
        zzbfu zzbfsVar;
        Parcel parcelZzbi = zzbi(32, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbfsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzbfsVar = iInterfaceQueryLocalInterface instanceof zzbfu ? (zzbfu) iInterfaceQueryLocalInterface : new zzbfs(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbfsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbfa zzD() throws RemoteException {
        zzbfa zzbeyVar;
        Parcel parcelZzbi = zzbi(33, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbeyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbeyVar = iInterfaceQueryLocalInterface instanceof zzbfa ? (zzbfa) iInterfaceQueryLocalInterface : new zzbey(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzE(zzbkg zzbkgVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzF(zzbex zzbexVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbexVar);
        zzbj(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzG(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzb(parcelZza, z);
        zzbj(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final boolean zzH() throws RemoteException {
        Parcel parcelZzbi = zzbi(23, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzI(zzccf zzccfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzJ(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzK(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbhc zzL() throws RemoteException {
        zzbhc zzbhaVar;
        Parcel parcelZzbi = zzbi(26, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbhaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzbhaVar = iInterfaceQueryLocalInterface instanceof zzbhc ? (zzbhc) iInterfaceQueryLocalInterface : new zzbha(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbhaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzM(zzbis zzbisVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbisVar);
        zzbj(29, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzN(zzbhg zzbhgVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzO(zzbdr zzbdrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbdrVar);
        zzbj(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzP(zzaxz zzaxzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzaxzVar);
        zzbj(40, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzQ(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzb(parcelZza, z);
        zzbj(34, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzX(zzbgw zzbgwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbgwVar);
        zzbj(42, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzY(zzbdg zzbdgVar, zzbfd zzbfdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbdgVar);
        zzadl.zzf(parcelZza, zzbfdVar);
        zzbj(43, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzZ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(44, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzaa(zzbgb zzbgbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbgbVar);
        zzbj(45, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzab(zzbfy zzbfyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final IObjectWrapper zzi() throws RemoteException {
        Parcel parcelZzbi = zzbi(1, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzj() throws RemoteException {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final boolean zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final boolean zzl(zzbdg zzbdgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbdgVar);
        Parcel parcelZzbi = zzbi(4, parcelZza);
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzm() throws RemoteException {
        zzbj(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzn() throws RemoteException {
        zzbj(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzo(zzbfa zzbfaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbfaVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzp(zzbfu zzbfuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbfuVar);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzq(zzbfr zzbfrVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final Bundle zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzt() throws RemoteException {
        zzbj(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbdl zzu() throws RemoteException {
        Parcel parcelZzbi = zzbi(12, zza());
        zzbdl zzbdlVar = (zzbdl) zzadl.zzc(parcelZzbi, zzbdl.CREATOR);
        parcelZzbi.recycle();
        return zzbdlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzv(zzbdl zzbdlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbdlVar);
        zzbj(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzw(zzbzz zzbzzVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzx(zzcac zzcacVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final String zzy() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final String zzz() throws RemoteException {
        throw null;
    }
}
