package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzag extends zzbh {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzbs zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzag(zzbs zzbsVar, Boolean bool) {
        super(zzbsVar, true);
        this.zzb = zzbsVar;
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    final void zza() throws RemoteException {
        if (this.zza != null) {
            ((zzq) Preconditions.checkNotNull(this.zzb.zzj)).setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
        } else {
            ((zzq) Preconditions.checkNotNull(this.zzb.zzj)).clearMeasurementEnabled(this.zzh);
        }
    }
}
