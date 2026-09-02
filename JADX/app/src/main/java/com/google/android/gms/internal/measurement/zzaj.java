package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaj extends zzbh {
    final /* synthetic */ zzbs zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaj(zzbs zzbsVar) {
        super(zzbsVar, true);
        this.zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    final void zza() throws RemoteException {
        ((zzq) Preconditions.checkNotNull(this.zza.zzj)).resetAnalyticsData(this.zzh);
    }
}
