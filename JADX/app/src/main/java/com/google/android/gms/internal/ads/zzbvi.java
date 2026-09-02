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
public abstract class zzbvi extends zzadk implements zzbvj {
    public zzbvi() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvm zzbvkVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdl zzbdlVar = (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR);
                zzbdg zzbdgVar = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvkVar = iInterfaceQueryLocalInterface instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface : new zzbvk(strongBinder);
                }
                zze(iObjectWrapperAsInterface, zzbdlVar, zzbdgVar, string, zzbvkVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperZzf = zzf();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, iObjectWrapperZzf);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdg zzbdgVar2 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvkVar = iInterfaceQueryLocalInterface2 instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface2 : new zzbvk(strongBinder2);
                }
                zzg(iObjectWrapperAsInterface2, zzbdgVar2, string2, zzbvkVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdl zzbdlVar2 = (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR);
                zzbdg zzbdgVar3 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvkVar = iInterfaceQueryLocalInterface3 instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface3 : new zzbvk(strongBinder3);
                }
                zzj(iObjectWrapperAsInterface3, zzbdlVar2, zzbdgVar3, string3, string4, zzbvkVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdg zzbdgVar4 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvkVar = iInterfaceQueryLocalInterface4 instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface4 : new zzbvk(strongBinder4);
                }
                zzk(iObjectWrapperAsInterface4, zzbdgVar4, string5, string6, zzbvkVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                zzn(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR), parcel.readString(), zzccj.zzb(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                zzo((zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzq);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdg zzbdgVar5 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvkVar = iInterfaceQueryLocalInterface5 instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface5 : new zzbvk(strongBinder5);
                }
                zzr(iObjectWrapperAsInterface5, zzbdgVar5, string7, string8, zzbvkVar, (zzblv) zzadl.zzc(parcel, zzblv.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzadl.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzadl.zzf(parcel2, null);
                return true;
            case 17:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                zzadl.zze(parcel2, bundleZzs);
                return true;
            case 18:
                Bundle bundleZzt = zzt();
                parcel2.writeNoException();
                zzadl.zze(parcel2, bundleZzt);
                return true;
            case 19:
                Bundle bundleZzu = zzu();
                parcel2.writeNoException();
                zzadl.zze(parcel2, bundleZzu);
                return true;
            case 20:
                zzv((zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                zzw(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                zzadl.zzb(parcel2, false);
                return true;
            case 23:
                zzy(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzccj.zzb(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                zzbnb zzbnbVarZzz = zzz();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbnbVarZzz);
                return true;
            case 25:
                zzA(zzadl.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                zzbhc zzbhcVarZzB = zzB();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbhcVarZzB);
                return true;
            case 27:
                zzbvv zzbvvVarZzC = zzC();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbvvVarZzC);
                return true;
            case 28:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdg zzbdgVar6 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String string9 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvkVar = iInterfaceQueryLocalInterface6 instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface6 : new zzbvk(strongBinder6);
                }
                zzD(iObjectWrapperAsInterface6, zzbdgVar6, string9, zzbvkVar);
                parcel2.writeNoException();
                return true;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
            default:
                return false;
            case 30:
                zzE(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                zzF(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzbro.zzb(parcel.readStrongBinder()), parcel.createTypedArrayList(zzbrv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdg zzbdgVar7 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String string10 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvkVar = iInterfaceQueryLocalInterface7 instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface7 : new zzbvk(strongBinder7);
                }
                zzG(iObjectWrapperAsInterface7, zzbdgVar7, string10, zzbvkVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbya zzbyaVarZzH = zzH();
                parcel2.writeNoException();
                zzadl.zze(parcel2, zzbyaVarZzH);
                return true;
            case 34:
                zzbya zzbyaVarZzI = zzI();
                parcel2.writeNoException();
                zzadl.zze(parcel2, zzbyaVarZzI);
                return true;
            case 35:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdl zzbdlVar3 = (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR);
                zzbdg zzbdgVar8 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvkVar = iInterfaceQueryLocalInterface8 instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface8 : new zzbvk(strongBinder8);
                }
                zzJ(iObjectWrapperAsInterface8, zzbdlVar3, zzbdgVar8, string11, string12, zzbvkVar);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbvp zzbvpVarZzK = zzK();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbvpVarZzK);
                return true;
            case 37:
                zzL(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
