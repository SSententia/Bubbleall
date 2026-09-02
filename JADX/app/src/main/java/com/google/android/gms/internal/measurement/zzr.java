package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzr extends zza implements zzt {
    zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzt
    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, bundle);
        zzc(1, parcelZza);
    }
}
