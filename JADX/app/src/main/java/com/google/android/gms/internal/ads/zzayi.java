package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzayi implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzayj zza;

    zzayi(zzayj zzayjVar) {
        this.zza = zzayjVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zza.zzb) {
            this.zza.zze = null;
            if (this.zza.zzc != null) {
                zzayj.zzc(this.zza, null);
            }
            this.zza.zzb.notifyAll();
        }
    }
}
