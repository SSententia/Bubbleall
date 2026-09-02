package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzboc extends zzadj implements zzboe {
    zzboc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzbi = zzbi(24, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzB(zzbgm zzbgmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbgmVar);
        zzbj(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzC(zzbgi zzbgiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbgiVar);
        zzbj(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzD() throws RemoteException {
        zzbj(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzE() throws RemoteException {
        zzbj(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final zzbme zzF() throws RemoteException {
        zzbme zzbmcVar;
        Parcel parcelZzbi = zzbi(29, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbmcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbmcVar = iInterfaceQueryLocalInterface instanceof zzbme ? (zzbme) iInterfaceQueryLocalInterface : new zzbmc(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final boolean zzG() throws RemoteException {
        Parcel parcelZzbi = zzbi(30, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final zzbgz zzH() throws RemoteException {
        Parcel parcelZzbi = zzbi(31, zza());
        zzbgz zzbgzVarZzb = zzbgy.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbgzVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzI(zzbgw zzbgwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbgwVar);
        zzbj(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final String zze() throws RemoteException {
        Parcel parcelZzbi = zzbi(2, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final List zzf() throws RemoteException {
        Parcel parcelZzbi = zzbi(3, zza());
        ArrayList arrayListZzg = zzadl.zzg(parcelZzbi);
        parcelZzbi.recycle();
        return arrayListZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final String zzg() throws RemoteException {
        Parcel parcelZzbi = zzbi(4, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final zzbmh zzh() throws RemoteException {
        zzbmh zzbmfVar;
        Parcel parcelZzbi = zzbi(5, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzbmfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbmfVar = iInterfaceQueryLocalInterface instanceof zzbmh ? (zzbmh) iInterfaceQueryLocalInterface : new zzbmf(strongBinder);
        }
        parcelZzbi.recycle();
        return zzbmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final String zzi() throws RemoteException {
        Parcel parcelZzbi = zzbi(6, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final String zzj() throws RemoteException {
        Parcel parcelZzbi = zzbi(7, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final double zzk() throws RemoteException {
        Parcel parcelZzbi = zzbi(8, zza());
        double d = parcelZzbi.readDouble();
        parcelZzbi.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final String zzl() throws RemoteException {
        Parcel parcelZzbi = zzbi(9, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final String zzm() throws RemoteException {
        Parcel parcelZzbi = zzbi(10, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final zzbhc zzn() throws RemoteException {
        Parcel parcelZzbi = zzbi(11, zza());
        zzbhc zzbhcVarZzb = zzbhb.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbhcVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final String zzo() throws RemoteException {
        Parcel parcelZzbi = zzbi(12, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzp() throws RemoteException {
        zzbj(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final zzblz zzq() throws RemoteException {
        zzblz zzblxVar;
        Parcel parcelZzbi = zzbi(14, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            zzblxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzblxVar = iInterfaceQueryLocalInterface instanceof zzblz ? (zzblz) iInterfaceQueryLocalInterface : new zzblx(strongBinder);
        }
        parcelZzbi.recycle();
        return zzblxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, bundle);
        zzbj(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final boolean zzs(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, bundle);
        Parcel parcelZzbi = zzbi(16, parcelZza);
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzt(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, bundle);
        zzbj(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final IObjectWrapper zzu() throws RemoteException {
        Parcel parcelZzbi = zzbi(18, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final IObjectWrapper zzv() throws RemoteException {
        Parcel parcelZzbi = zzbi(19, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final Bundle zzw() throws RemoteException {
        Parcel parcelZzbi = zzbi(20, zza());
        Bundle bundle = (Bundle) zzadl.zzc(parcelZzbi, Bundle.CREATOR);
        parcelZzbi.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzx(zzbob zzbobVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbobVar);
        zzbj(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzy() throws RemoteException {
        zzbj(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final List zzz() throws RemoteException {
        Parcel parcelZzbi = zzbi(23, zza());
        ArrayList arrayListZzg = zzadl.zzg(parcelZzbi);
        parcelZzbi.recycle();
        return arrayListZzg;
    }
}
