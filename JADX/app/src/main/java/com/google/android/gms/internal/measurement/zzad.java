package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzad extends zzbh {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzn zzc;
    final /* synthetic */ zzbs zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzad(zzbs zzbsVar, String str, String str2, zzn zznVar) {
        super(zzbsVar, true);
        this.zzd = zzbsVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zznVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    final void zza() throws RemoteException {
        ((zzq) Preconditions.checkNotNull(this.zzd.zzj)).getConditionalUserProperties(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    protected final void zzb() {
        this.zzc.zzb(null);
    }
}
