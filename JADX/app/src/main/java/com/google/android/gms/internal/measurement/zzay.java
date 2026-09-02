package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzay extends zzbh {
    final /* synthetic */ zzn zza;
    final /* synthetic */ zzbs zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzay(zzbs zzbsVar, zzn zznVar) {
        super(zzbsVar, true);
        this.zzb = zzbsVar;
        this.zza = zznVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    final void zza() throws RemoteException {
        ((zzq) Preconditions.checkNotNull(this.zzb.zzj)).getAppInstanceId(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    protected final void zzb() {
        this.zza.zzb(null);
    }
}
