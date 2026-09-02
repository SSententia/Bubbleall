package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbfm extends zzadk implements zzbfn {
    public zzbfm() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbfn zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzbfn ? (zzbfn) iInterfaceQueryLocalInterface : new zzbfl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbfa zzbeyVar = null;
        zzbgb zzbfzVar = null;
        zzbfd zzbfbVar = null;
        zzbgw zzbguVar = null;
        zzbfr zzbfpVar = null;
        zzbfy zzbfyVar = null;
        zzbex zzbevVar = null;
        zzbfu zzbfsVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperZzi = zzi();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, iObjectWrapperZzi);
                return true;
            case 2:
                zzj();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzk);
                return true;
            case 4:
                boolean zZzl = zzl((zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR));
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzl);
                return true;
            case 5:
                zzm();
                parcel2.writeNoException();
                return true;
            case 6:
                zzn();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbeyVar = iInterfaceQueryLocalInterface instanceof zzbfa ? (zzbfa) iInterfaceQueryLocalInterface : new zzbey(strongBinder);
                }
                zzo(zzbeyVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzbfsVar = iInterfaceQueryLocalInterface2 instanceof zzbfu ? (zzbfu) iInterfaceQueryLocalInterface2 : new zzbfs(strongBinder2);
                }
                zzp(zzbfsVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzs();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzt();
                parcel2.writeNoException();
                return true;
            case 12:
                zzbdl zzbdlVarZzu = zzu();
                parcel2.writeNoException();
                zzadl.zze(parcel2, zzbdlVarZzu);
                return true;
            case 13:
                zzv((zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzw(zzbzy.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zzx(zzcab.zzb(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzy = zzy();
                parcel2.writeNoException();
                parcel2.writeString(strZzy);
                return true;
            case 19:
                zzE(zzbkf.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbevVar = iInterfaceQueryLocalInterface3 instanceof zzbex ? (zzbex) iInterfaceQueryLocalInterface3 : new zzbev(strongBinder3);
                }
                zzF(zzbevVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzbfyVar = iInterfaceQueryLocalInterface4 instanceof zzbfy ? (zzbfy) iInterfaceQueryLocalInterface4 : new zzbfy(strongBinder4);
                }
                zzab(zzbfyVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzG(zzadl.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzH);
                return true;
            case 24:
                zzI(zzcce.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                zzJ(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                zzbhc zzbhcVarZzL = zzL();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbhcVarZzL);
                return true;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                zzM((zzbis) zzadl.zzc(parcel, zzbis.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zzN((zzbhg) zzadl.zzc(parcel, zzbhg.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzB = zzB();
                parcel2.writeNoException();
                parcel2.writeString(strZzB);
                return true;
            case 32:
                zzbfu zzbfuVarZzC = zzC();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbfuVarZzC);
                return true;
            case 33:
                zzbfa zzbfaVarZzD = zzD();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbfaVarZzD);
                return true;
            case 34:
                zzQ(zzadl.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzz = zzz();
                parcel2.writeNoException();
                parcel2.writeString(strZzz);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbfpVar = iInterfaceQueryLocalInterface5 instanceof zzbfr ? (zzbfr) iInterfaceQueryLocalInterface5 : new zzbfp(strongBinder5);
                }
                zzq(zzbfpVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzr = zzr();
                parcel2.writeNoException();
                zzadl.zze(parcel2, bundleZzr);
                return true;
            case 38:
                zzK(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                zzO((zzbdr) zzadl.zzc(parcel, zzbdr.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zzP(zzaxy.zze(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 41:
                zzbgz zzbgzVarZzA = zzA();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbgzVarZzA);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzbguVar = iInterfaceQueryLocalInterface6 instanceof zzbgw ? (zzbgw) iInterfaceQueryLocalInterface6 : new zzbgu(strongBinder6);
                }
                zzX(zzbguVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzbdg zzbdgVar = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbfbVar = iInterfaceQueryLocalInterface7 instanceof zzbfd ? (zzbfd) iInterfaceQueryLocalInterface7 : new zzbfb(strongBinder7);
                }
                zzY(zzbdgVar, zzbfbVar);
                parcel2.writeNoException();
                return true;
            case 44:
                zzZ(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzbfzVar = iInterfaceQueryLocalInterface8 instanceof zzbgb ? (zzbgb) iInterfaceQueryLocalInterface8 : new zzbfz(strongBinder8);
                }
                zzaa(zzbfzVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
