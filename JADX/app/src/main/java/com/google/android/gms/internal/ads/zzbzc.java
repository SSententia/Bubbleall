package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbzc extends zzadj implements zzbze {
    zzbzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zze(Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzd(parcelZza, intent);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zzg() throws RemoteException {
        zzbj(3, zza());
    }
}
