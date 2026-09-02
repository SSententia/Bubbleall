package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbwp implements Runnable {
    final /* synthetic */ AdRequest.ErrorCode zza;
    final /* synthetic */ zzbww zzb;

    zzbwp(zzbww zzbwwVar, AdRequest.ErrorCode errorCode) {
        this.zzb = zzbwwVar;
        this.zza = errorCode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zza.zzg(zzbwx.zza(this.zza));
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
    }
}
