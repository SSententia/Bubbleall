package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbvl extends zzadk implements zzbvm {
    public zzbvl() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbvm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface : new zzbvk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                zzg(parcel.readInt());
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (!(iInterfaceQueryLocalInterface instanceof zzbvq)) {
                        new zzbvq(strongBinder);
                    }
                }
                break;
            case 8:
                zzk();
                break;
            case 9:
                zzl(parcel.readString(), parcel.readString());
                break;
            case 10:
                zzbna.zzb(parcel.readStrongBinder());
                parcel.readString();
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                break;
            case 13:
                zzo();
                break;
            case 14:
                zzp((zzccl) zzadl.zzc(parcel, zzccl.CREATOR));
                break;
            case 15:
                zzq();
                break;
            case 16:
                zzr(zzcco.zzb(parcel.readStrongBinder()));
                break;
            case 17:
                zzs(parcel.readInt());
                break;
            case 18:
                zzt();
                break;
            case 19:
                break;
            case 20:
                zzu();
                break;
            case 21:
                zzv(parcel.readString());
                break;
            case 22:
                zzw(parcel.readInt(), parcel.readString());
                break;
            case 23:
                zzx((zzbcz) zzadl.zzc(parcel, zzbcz.CREATOR));
                break;
            case 24:
                zzy((zzbcz) zzadl.zzc(parcel, zzbcz.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
