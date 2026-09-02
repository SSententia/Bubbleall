package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbvh extends zzadj implements zzbvj {
    zzbvh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzA(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzb(parcelZza, z);
        zzbj(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbhc zzB() throws RemoteException {
        Parcel parcelZzbi = zzbi(26, zza());
        zzbhc zzbhcVarZzb = zzbhb.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbhcVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbvv zzC() throws RemoteException {
        zzbvv zzbvtVar;
        Parcel parcelZzbi = zzbi(27, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbvtVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbvtVar = iInterfaceQueryLocalInterface instanceof zzbvv ? (zzbvv) iInterfaceQueryLocalInterface : new zzbvt(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzD(IObjectWrapper iObjectWrapper, zzbdg zzbdgVar, String str, zzbvm zzbvmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzbdgVar);
        parcelZza.writeString(str);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzbj(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzF(IObjectWrapper iObjectWrapper, zzbrp zzbrpVar, List<zzbrv> list) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbrpVar);
        parcelZza.writeTypedList(list);
        zzbj(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzG(IObjectWrapper iObjectWrapper, zzbdg zzbdgVar, String str, zzbvm zzbvmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzbdgVar);
        parcelZza.writeString(str);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzbj(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbya zzH() throws RemoteException {
        Parcel parcelZzbi = zzbi(33, zza());
        zzbya zzbyaVar = (zzbya) zzadl.zzc(parcelZzbi, zzbya.CREATOR);
        parcelZzbi.recycle();
        return zzbyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbya zzI() throws RemoteException {
        Parcel parcelZzbi = zzbi(34, zza());
        zzbya zzbyaVar = (zzbya) zzadl.zzc(parcelZzbi, zzbya.CREATOR);
        parcelZzbi.recycle();
        return zzbyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzJ(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, zzbdg zzbdgVar, String str, String str2, zzbvm zzbvmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzbdlVar);
        zzadl.zzd(parcelZza, zzbdgVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzbj(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbvp zzK() throws RemoteException {
        zzbvp zzbvnVar;
        Parcel parcelZzbi = zzbi(36, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbvnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbvnVar = iInterfaceQueryLocalInterface instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface : new zzbvn(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbvr zzM() throws RemoteException {
        zzbvr zzbvrVar;
        Parcel parcelZzbi = zzbi(15, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbvrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbvrVar = iInterfaceQueryLocalInterface instanceof zzbvr ? (zzbvr) iInterfaceQueryLocalInterface : new zzbvr(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbvs zzN() throws RemoteException {
        zzbvs zzbvsVar;
        Parcel parcelZzbi = zzbi(16, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbvsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbvsVar = iInterfaceQueryLocalInterface instanceof zzbvs ? (zzbvs) iInterfaceQueryLocalInterface : new zzbvs(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, zzbdg zzbdgVar, String str, zzbvm zzbvmVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel parcelZzbi = zzbi(2, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzg(IObjectWrapper iObjectWrapper, zzbdg zzbdgVar, String str, zzbvm zzbvmVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzh() throws RemoteException {
        zzbj(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzi() throws RemoteException {
        zzbj(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzj(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, zzbdg zzbdgVar, String str, String str2, zzbvm zzbvmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzbdlVar);
        zzadl.zzd(parcelZza, zzbdgVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzk(IObjectWrapper iObjectWrapper, zzbdg zzbdgVar, String str, String str2, zzbvm zzbvmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzbdgVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzl() throws RemoteException {
        zzbj(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzm() throws RemoteException {
        zzbj(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzn(IObjectWrapper iObjectWrapper, zzbdg zzbdgVar, String str, zzcck zzcckVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzbdgVar);
        parcelZza.writeString(null);
        zzadl.zzf(parcelZza, zzcckVar);
        parcelZza.writeString(str2);
        zzbj(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzo(zzbdg zzbdgVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbdgVar);
        parcelZza.writeString(str);
        zzbj(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzp() throws RemoteException {
        zzbj(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final boolean zzq() throws RemoteException {
        Parcel parcelZzbi = zzbi(13, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzr(IObjectWrapper iObjectWrapper, zzbdg zzbdgVar, String str, String str2, zzbvm zzbvmVar, zzblv zzblvVar, List<String> list) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzbdgVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzadl.zzd(parcelZza, zzblvVar);
        parcelZza.writeStringList(list);
        zzbj(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzv(zzbdg zzbdgVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final boolean zzx() throws RemoteException {
        Parcel parcelZzbi = zzbi(22, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzy(IObjectWrapper iObjectWrapper, zzcck zzcckVar, List<String> list) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzcckVar);
        parcelZza.writeStringList(list);
        zzbj(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbnb zzz() throws RemoteException {
        throw null;
    }
}
