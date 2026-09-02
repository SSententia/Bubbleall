package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbxl extends zzadj implements zzbxn {
    zzbxl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzbdl zzbdlVar, zzbxq zzbxqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzadl.zzd(parcelZza, bundle);
        zzadl.zzd(parcelZza, bundle2);
        zzadl.zzd(parcelZza, zzbdlVar);
        zzadl.zzf(parcelZza, zzbxqVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final zzbya zzf() throws RemoteException {
        Parcel parcelZzbi = zzbi(2, zza());
        zzbya zzbyaVar = (zzbya) zzadl.zzc(parcelZzbi, zzbya.CREATOR);
        parcelZzbi.recycle();
        return zzbyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final zzbya zzg() throws RemoteException {
        Parcel parcelZzbi = zzbi(3, zza());
        zzbya zzbyaVar = (zzbya) zzadl.zzc(parcelZzbi, zzbya.CREATOR);
        parcelZzbi.recycle();
        return zzbyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final zzbhc zzh() throws RemoteException {
        Parcel parcelZzbi = zzbi(5, zza());
        zzbhc zzbhcVarZzb = zzbhb.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zzbhcVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzi(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxb zzbxbVar, zzbvm zzbvmVar, zzbdl zzbdlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzadl.zzd(parcelZza, zzbdgVar);
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbxbVar);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzadl.zzd(parcelZza, zzbdlVar);
        zzbj(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzj(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxe zzbxeVar, zzbvm zzbvmVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzadl.zzd(parcelZza, zzbdgVar);
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbxeVar);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzbj(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzbi = zzbi(15, parcelZza);
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzl(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxk zzbxkVar, zzbvm zzbvmVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzadl.zzd(parcelZza, zzbdgVar);
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbxkVar);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzbj(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzbi = zzbi(17, parcelZza);
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzn(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbvm zzbvmVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzadl.zzd(parcelZza, zzbdgVar);
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbxhVar);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzbj(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzo(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzp(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxk zzbxkVar, zzbvm zzbvmVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzadl.zzd(parcelZza, zzbdgVar);
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbxkVar);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzbj(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzq(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxb zzbxbVar, zzbvm zzbvmVar, zzbdl zzbdlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzadl.zzd(parcelZza, zzbdgVar);
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbxbVar);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzadl.zzd(parcelZza, zzbdlVar);
        zzbj(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzr(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbvm zzbvmVar, zzblv zzblvVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzadl.zzd(parcelZza, zzbdgVar);
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzadl.zzf(parcelZza, zzbxhVar);
        zzadl.zzf(parcelZza, zzbvmVar);
        zzadl.zzd(parcelZza, zzblvVar);
        zzbj(22, parcelZza);
    }
}
