package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbvk extends zzadj implements zzbvm {
    zzbvk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze() throws RemoteException {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzf() throws RemoteException {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzg(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzh() throws RemoteException {
        zzbj(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzi() throws RemoteException {
        zzbj(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzj() throws RemoteException {
        zzbj(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzk() throws RemoteException {
        zzbj(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzl(String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbj(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzm(zzbnb zzbnbVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbnbVar);
        parcelZza.writeString(str);
        zzbj(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzn() throws RemoteException {
        zzbj(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzo() throws RemoteException {
        zzbj(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzp(zzccl zzcclVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzq() throws RemoteException {
        zzbj(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzr(zzccp zzccpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzccpVar);
        zzbj(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzs(int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzt() throws RemoteException {
        zzbj(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzu() throws RemoteException {
        zzbj(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzv(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzw(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        zzbj(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzx(zzbcz zzbczVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbczVar);
        zzbj(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzy(zzbcz zzbczVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, zzbczVar);
        zzbj(24, parcelZza);
    }
}
