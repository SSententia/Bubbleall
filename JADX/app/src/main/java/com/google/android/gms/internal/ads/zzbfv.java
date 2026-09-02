package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbfv extends zzadj implements zzbfx {
    zzbfv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfn zzb(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, String str, zzbvg zzbvgVar, int i) throws RemoteException {
        zzbfn zzbflVar;
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzbdlVar);
        parcelZza.writeString(str);
        zzadl.zzf(parcelZza, zzbvgVar);
        parcelZza.writeInt(213806000);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbflVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbflVar = iInterfaceQueryLocalInterface instanceof zzbfn ? (zzbfn) iInterfaceQueryLocalInterface : new zzbfl(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfn zzc(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, String str, zzbvg zzbvgVar, int i) throws RemoteException {
        zzbfn zzbflVar;
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzbdlVar);
        parcelZza.writeString(str);
        zzadl.zzf(parcelZza, zzbvgVar);
        parcelZza.writeInt(213806000);
        Parcel parcelZzbi = zzbi(2, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbflVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbflVar = iInterfaceQueryLocalInterface instanceof zzbfn ? (zzbfn) iInterfaceQueryLocalInterface : new zzbfl(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfj zzd(IObjectWrapper iObjectWrapper, String str, zzbvg zzbvgVar, int i) throws RemoteException {
        zzbfj zzbfhVar;
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzadl.zzf(parcelZza, zzbvgVar);
        parcelZza.writeInt(213806000);
        Parcel parcelZzbi = zzbi(3, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbfhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbfhVar = iInterfaceQueryLocalInterface instanceof zzbfj ? (zzbfj) iInterfaceQueryLocalInterface : new zzbfh(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbml zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, iObjectWrapper2);
        Parcel parcelZzbi = zzbi(5, parcelZza);
        zzbml zzbmlVarZzby = zzbmk.zzby(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbmlVarZzby;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzccc zzf(IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbzq zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzbi = zzbi(8, parcelZza);
        zzbzq zzbzqVarZzF = zzbzp.zzF(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbzqVarZzF;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbge zzh(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzbge zzbgcVar;
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(213806000);
        Parcel parcelZzbi = zzbi(9, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbgcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzbgcVar = iInterfaceQueryLocalInterface instanceof zzbge ? (zzbge) iInterfaceQueryLocalInterface : new zzbgc(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbgcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfn zzi(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, String str, int i) throws RemoteException {
        zzbfn zzbflVar;
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzbdlVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(213806000);
        Parcel parcelZzbi = zzbi(10, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbflVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbflVar = iInterfaceQueryLocalInterface instanceof zzbfn ? (zzbfn) iInterfaceQueryLocalInterface : new zzbfl(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbmr zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, iObjectWrapper2);
        zzadl.zzf(parcelZza, iObjectWrapper3);
        Parcel parcelZzbi = zzbi(11, parcelZza);
        zzbmr zzbmrVarZze = zzbmq.zze(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbmrVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzccs zzk(IObjectWrapper iObjectWrapper, String str, zzbvg zzbvgVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzadl.zzf(parcelZza, zzbvgVar);
        parcelZza.writeInt(213806000);
        Parcel parcelZzbi = zzbi(12, parcelZza);
        zzccs zzccsVarZzq = zzccr.zzq(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzccsVarZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfn zzl(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, String str, zzbvg zzbvgVar, int i) throws RemoteException {
        zzbfn zzbflVar;
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzd(parcelZza, zzbdlVar);
        parcelZza.writeString(str);
        zzadl.zzf(parcelZza, zzbvgVar);
        parcelZza.writeInt(213806000);
        Parcel parcelZzbi = zzbi(13, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbflVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbflVar = iInterfaceQueryLocalInterface instanceof zzbfn ? (zzbfn) iInterfaceQueryLocalInterface : new zzbfl(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzcfn zzm(IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbvgVar);
        parcelZza.writeInt(213806000);
        Parcel parcelZzbi = zzbi(14, parcelZza);
        zzcfn zzcfnVarZzb = zzcfm.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzcfnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbze zzn(IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbvgVar);
        parcelZza.writeInt(213806000);
        Parcel parcelZzbi = zzbi(15, parcelZza);
        zzbze zzbzeVarZzb = zzbzd.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbzeVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbqp zzo(IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, int i, zzbqm zzbqmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbvgVar);
        parcelZza.writeInt(213806000);
        zzadl.zzf(parcelZza, zzbqmVar);
        Parcel parcelZzbi = zzbi(16, parcelZza);
        zzbqp zzbqpVarZzb = zzbqo.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbqpVarZzb;
    }
}
