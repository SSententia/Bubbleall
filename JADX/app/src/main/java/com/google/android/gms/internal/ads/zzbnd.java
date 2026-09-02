package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbnd extends zzadj implements zzbnf {
    zzbnd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void zze(zzbmw zzbmwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzadl.zzf(parcelZza, zzbmwVar);
        zzbj(1, parcelZza);
    }
}
