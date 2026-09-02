package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaz extends zzbh {
    final /* synthetic */ zzn zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzbs zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaz(zzbs zzbsVar, zzn zznVar, int i) {
        super(zzbsVar, true);
        this.zzc = zzbsVar;
        this.zza = zznVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    final void zza() throws RemoteException {
        ((zzq) Preconditions.checkNotNull(this.zzc.zzj)).getTestFlag(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    protected final void zzb() {
        this.zza.zzb(null);
    }
}
