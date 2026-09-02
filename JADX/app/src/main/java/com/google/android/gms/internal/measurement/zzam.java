package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzam extends zzbh {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbs zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzam(zzbs zzbsVar, String str) {
        super(zzbsVar, true);
        this.zzb = zzbsVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    final void zza() throws RemoteException {
        ((zzq) Preconditions.checkNotNull(this.zzb.zzj)).beginAdUnitExposure(this.zza, this.zzi);
    }
}
