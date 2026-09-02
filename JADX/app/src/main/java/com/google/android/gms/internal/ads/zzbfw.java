package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbfw extends zzadk implements zzbfx {
    public zzbfw() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzbfn zzbfnVarZzb = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR), parcel.readString(), zzbvf.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbfnVarZzb);
                return true;
            case 2:
                zzbfn zzbfnVarZzc = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR), parcel.readString(), zzbvf.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbfnVarZzc);
                return true;
            case 3:
                zzbfj zzbfjVarZzd = zzd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzbvf.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbfjVarZzd);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, null);
                return true;
            case 5:
                zzbml zzbmlVarZze = zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbmlVarZze);
                return true;
            case 6:
                zzccc zzcccVarZzf = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzbvf.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzcccVarZzf);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, null);
                return true;
            case 8:
                zzbzq zzbzqVarZzg = zzg(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbzqVarZzg);
                return true;
            case 9:
                zzbge zzbgeVarZzh = zzh(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbgeVarZzh);
                return true;
            case 10:
                zzbfn zzbfnVarZzi = zzi(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbfnVarZzi);
                return true;
            case 11:
                zzbmr zzbmrVarZzj = zzj(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbmrVarZzj);
                return true;
            case 12:
                zzccs zzccsVarZzk = zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzbvf.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzccsVarZzk);
                return true;
            case 13:
                zzbfn zzbfnVarZzl = zzl(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzbdl) zzadl.zzc(parcel, zzbdl.CREATOR), parcel.readString(), zzbvf.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbfnVarZzl);
                return true;
            case 14:
                zzcfn zzcfnVarZzm = zzm(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzbvf.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzcfnVarZzm);
                return true;
            case 15:
                zzbze zzbzeVarZzn = zzn(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzbvf.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbzeVarZzn);
                return true;
            case 16:
                zzbqp zzbqpVarZzo = zzo(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzbvf.zzg(parcel.readStrongBinder()), parcel.readInt(), zzbql.zzc(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzbqpVarZzo);
                return true;
            default:
                return false;
        }
    }
}
