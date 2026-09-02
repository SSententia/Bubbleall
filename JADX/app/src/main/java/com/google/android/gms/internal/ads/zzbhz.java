package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhz implements Runnable {
    final /* synthetic */ zzbia zza;

    zzbhz(zzbia zzbiaVar) {
        this.zza = zzbiaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zza.zza != null) {
            try {
                this.zza.zza.zza.zzc(1);
            } catch (RemoteException e) {
                zzcgt.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
