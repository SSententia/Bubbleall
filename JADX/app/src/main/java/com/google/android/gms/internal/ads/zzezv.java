package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzezv extends zzfid {
    final /* synthetic */ zzbfr zza;
    final /* synthetic */ zzezw zzb;

    zzezv(zzezw zzezwVar, zzbfr zzbfrVar) {
        this.zzb = zzezwVar;
        this.zza = zzbfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfid
    public final void zzu() {
        if (this.zzb.zzd != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
