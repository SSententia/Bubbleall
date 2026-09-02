package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzayh implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzayj zza;

    zzayh(zzayj zzayjVar) {
        this.zza = zzayjVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zza.zzb) {
            try {
                if (this.zza.zzc != null) {
                    zzayj zzayjVar = this.zza;
                    zzayjVar.zze = zzayjVar.zzc.zzq();
                }
            } catch (DeadObjectException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Unable to obtain a cache service instance.", e);
                zzayj.zzj(this.zza);
            }
            this.zza.zzb.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        synchronized (this.zza.zzb) {
            this.zza.zze = null;
            this.zza.zzb.notifyAll();
        }
    }
}
