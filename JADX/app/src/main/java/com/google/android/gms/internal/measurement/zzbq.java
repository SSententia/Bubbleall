package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbq extends zzbh {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzbr zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbq(zzbr zzbrVar, Activity activity) {
        super(zzbrVar.zza, true);
        this.zzb = zzbrVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    final void zza() throws RemoteException {
        ((zzq) Preconditions.checkNotNull(this.zzb.zza.zzj)).onActivityDestroyed(ObjectWrapper.wrap(this.zza), this.zzi);
    }
}
