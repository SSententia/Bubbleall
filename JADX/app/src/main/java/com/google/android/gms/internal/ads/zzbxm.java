package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbxm extends zzadk implements zzbxn {
    public zzbxm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbxn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbxn ? (zzbxn) iInterfaceQueryLocalInterface : new zzbxl(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.google.android.gms.internal.ads.zzbxk] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.gms.internal.ads.zzbxh] */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.google.android.gms.internal.ads.zzbxk] */
    /* JADX WARN: Type inference failed for: r11v9, types: [com.google.android.gms.internal.ads.zzbxh] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzbxm] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.zzbxb] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzbxb] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.ads.zzbxe] */
    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbxq zzbxoVar;
        IInterface zzbwzVar = null;
        if (i == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            Bundle bundle = (Bundle) zzadl.zzc(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzadl.zzc(parcel, Bundle.CREATOR);
            zzbdl zzbdlVar = (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbxoVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbxoVar = iInterfaceQueryLocalInterface instanceof zzbxq ? (zzbxq) iInterfaceQueryLocalInterface : new zzbxo(strongBinder);
            }
            zze(iObjectWrapperAsInterface, string, bundle, bundle2, zzbdlVar, zzbxoVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbya zzbyaVarZzf = zzf();
            parcel2.writeNoException();
            zzadl.zze(parcel2, zzbyaVarZzf);
        } else if (i == 3) {
            zzbya zzbyaVarZzg = zzg();
            parcel2.writeNoException();
            zzadl.zze(parcel2, zzbyaVarZzg);
        } else if (i == 5) {
            zzbhc zzbhcVarZzh = zzh();
            parcel2.writeNoException();
            zzadl.zzf(parcel2, zzbhcVarZzh);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    zzbdg zzbdgVar = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface2 instanceof zzbxb ? (zzbxb) iInterfaceQueryLocalInterface2 : new zzbwz(strongBinder2);
                    }
                    zzi(string2, string3, zzbdgVar, iObjectWrapperAsInterface2, zzbwzVar, zzbvl.zzb(parcel.readStrongBinder()), (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    zzbdg zzbdgVar2 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface3 instanceof zzbxe ? (zzbxe) iInterfaceQueryLocalInterface3 : new zzbxc(strongBinder3);
                    }
                    zzj(string4, string5, zzbdgVar2, iObjectWrapperAsInterface3, zzbwzVar, zzbvl.zzb(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    boolean zZzk = zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzadl.zzb(parcel2, zZzk);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    zzbdg zzbdgVar3 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface4 instanceof zzbxk ? (zzbxk) iInterfaceQueryLocalInterface4 : new zzbxi(strongBinder4);
                    }
                    zzl(string6, string7, zzbdgVar3, iObjectWrapperAsInterface4, zzbwzVar, zzbvl.zzb(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean zZzm = zzm(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzadl.zzb(parcel2, zZzm);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    zzbdg zzbdgVar4 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface5 instanceof zzbxh ? (zzbxh) iInterfaceQueryLocalInterface5 : new zzbxf(strongBinder5);
                    }
                    zzn(string8, string9, zzbdgVar4, iObjectWrapperAsInterface5, zzbwzVar, zzbvl.zzb(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 19:
                    zzo(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string10 = parcel.readString();
                    String string11 = parcel.readString();
                    zzbdg zzbdgVar5 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface6 instanceof zzbxk ? (zzbxk) iInterfaceQueryLocalInterface6 : new zzbxi(strongBinder6);
                    }
                    zzp(string10, string11, zzbdgVar5, iObjectWrapperAsInterface6, zzbwzVar, zzbvl.zzb(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string12 = parcel.readString();
                    String string13 = parcel.readString();
                    zzbdg zzbdgVar6 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface7 instanceof zzbxb ? (zzbxb) iInterfaceQueryLocalInterface7 : new zzbwz(strongBinder7);
                    }
                    zzq(string12, string13, zzbdgVar6, iObjectWrapperAsInterface7, zzbwzVar, zzbvl.zzb(parcel.readStrongBinder()), (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string14 = parcel.readString();
                    String string15 = parcel.readString();
                    zzbdg zzbdgVar7 = (zzbdg) zzadl.zzc(parcel, zzbdg.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface8 instanceof zzbxh ? (zzbxh) iInterfaceQueryLocalInterface8 : new zzbxf(strongBinder8);
                    }
                    zzr(string14, string15, zzbdgVar7, iObjectWrapperAsInterface8, zzbwzVar, zzbvl.zzb(parcel.readStrongBinder()), (zzblv) zzadl.zzc(parcel, zzblv.CREATOR));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            parcel2.writeNoException();
        }
        return true;
    }
}
