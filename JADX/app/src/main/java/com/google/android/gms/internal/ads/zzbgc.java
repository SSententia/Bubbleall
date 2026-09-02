package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbgc extends zzadj implements zzbge {
    zzbgc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zze() throws RemoteException {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zzf(float f) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zzg(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zzh(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzb(parcelZza, z);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zzj(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzadl.zzf(parcelZza, iObjectWrapper);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final float zzk() throws RemoteException {
        Parcel parcelZzbi = zzbi(7, zza());
        float f = parcelZzbi.readFloat();
        parcelZzbi.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzbi = zzbi(8, zza());
        boolean zZza = zzadl.zza(parcelZzbi);
        parcelZzbi.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final String zzm() throws RemoteException {
        Parcel parcelZzbi = zzbi(9, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zzn(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zzo(zzbvg zzbvgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbvgVar);
        zzbj(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zzp(zzbrs zzbrsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbrsVar);
        zzbj(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final List<zzbrl> zzq() throws RemoteException {
        Parcel parcelZzbi = zzbi(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzbi.createTypedArrayList(zzbrl.CREATOR);
        parcelZzbi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zzr(zzbim zzbimVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbimVar);
        zzbj(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zzs() throws RemoteException {
        zzbj(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zzt(zzbgq zzbgqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbgqVar);
        zzbj(16, parcelZza);
    }
}
