package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzat extends zzbh {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzn zzd;
    final /* synthetic */ zzbs zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzat(zzbs zzbsVar, String str, String str2, boolean z, zzn zznVar) {
        super(zzbsVar, true);
        this.zze = zzbsVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = zznVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    final void zza() throws RemoteException {
        ((zzq) Preconditions.checkNotNull(this.zze.zzj)).getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    protected final void zzb() {
        this.zzd.zzb(null);
    }
}
