package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdrr extends VideoController.VideoLifecycleCallbacks {
    private final zzdmm zza;

    public zzdrr(zzdmm zzdmmVar) {
        this.zza = zzdmmVar;
    }

    private static zzbhf zza(zzdmm zzdmmVar) {
        zzbhc zzbhcVarZzw = zzdmmVar.zzw();
        if (zzbhcVarZzw == null) {
            return null;
        }
        try {
            return zzbhcVarZzw.zzo();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzbhf zzbhfVarZza = zza(this.zza);
        if (zzbhfVarZza == null) {
            return;
        }
        try {
            zzbhfVarZza.zzh();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzbhf zzbhfVarZza = zza(this.zza);
        if (zzbhfVarZza == null) {
            return;
        }
        try {
            zzbhfVarZza.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzbhf zzbhfVarZza = zza(this.zza);
        if (zzbhfVarZza == null) {
            return;
        }
        try {
            zzbhfVarZza.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to call onVideoEnd()", e);
        }
    }
}
