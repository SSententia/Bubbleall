package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbi extends zzv {
    private final com.google.android.gms.measurement.internal.zzgp zza;

    zzbi(com.google.android.gms.measurement.internal.zzgp zzgpVar) {
        this.zza = zzgpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzw
    public final void zzd(String str, String str2, Bundle bundle, long j) {
        this.zza.interceptEvent(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzw
    public final int zze() {
        return System.identityHashCode(this.zza);
    }
}
