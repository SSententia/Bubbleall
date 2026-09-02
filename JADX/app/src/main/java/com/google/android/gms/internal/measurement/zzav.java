package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzav extends zzbh {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzn zzb;
    final /* synthetic */ zzbs zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzav(zzbs zzbsVar, Bundle bundle, zzn zznVar) {
        super(zzbsVar, true);
        this.zzc = zzbsVar;
        this.zza = bundle;
        this.zzb = zznVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    final void zza() throws RemoteException {
        ((zzq) Preconditions.checkNotNull(this.zzc.zzj)).performAction(this.zza, this.zzb, this.zzh);
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    protected final void zzb() {
        this.zzb.zzb(null);
    }
}
