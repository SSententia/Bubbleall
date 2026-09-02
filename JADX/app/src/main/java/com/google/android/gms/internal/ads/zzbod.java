package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbod extends zzadk implements zzboe {
    public zzbod() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbob zzbnzVar;
        switch (i) {
            case 2:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                List listZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(listZzf);
                return true;
            case 4:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 5:
                zzbmh zzbmhVarZzh = zzh();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbmhVarZzh);
                return true;
            case 6:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzk);
                return true;
            case 9:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                zzbhc zzbhcVarZzn = zzn();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbhcVarZzn);
                return true;
            case 12:
                String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 13:
                zzp();
                parcel2.writeNoException();
                return true;
            case 14:
                zzblz zzblzVarZzq = zzq();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzblzVarZzq);
                return true;
            case 15:
                zzr((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                boolean zZzs = zzs((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzs);
                return true;
            case 17:
                zzt((Bundle) zzadl.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper iObjectWrapperZzu = zzu();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, iObjectWrapperZzu);
                return true;
            case 19:
                IObjectWrapper iObjectWrapperZzv = zzv();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, iObjectWrapperZzv);
                return true;
            case 20:
                Bundle bundleZzw = zzw();
                parcel2.writeNoException();
                zzadl.zze(parcel2, bundleZzw);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbnzVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbnzVar = iInterfaceQueryLocalInterface instanceof zzbob ? (zzbob) iInterfaceQueryLocalInterface : new zzbnz(strongBinder);
                }
                zzx(zzbnzVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzy();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzz = zzz();
                parcel2.writeNoException();
                parcel2.writeList(listZzz);
                return true;
            case 24:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzA);
                return true;
            case 25:
                zzB(zzbgl.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                zzC(zzbgh.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzE();
                parcel2.writeNoException();
                return true;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                zzbme zzbmeVarZzF = zzF();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbmeVarZzF);
                return true;
            case 30:
                boolean zZzG = zzG();
                parcel2.writeNoException();
                zzadl.zzb(parcel2, zZzG);
                return true;
            case 31:
                zzbgz zzbgzVarZzH = zzH();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbgzVarZzH);
                return true;
            case 32:
                zzI(zzbgv.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
