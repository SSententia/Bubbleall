package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbj extends zzv {
    private final com.google.android.gms.measurement.internal.zzgq zza;

    zzbj(com.google.android.gms.measurement.internal.zzgq zzgqVar) {
        this.zza = zzgqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzw
    public final void zzd(String str, String str2, Bundle bundle, long j) {
        this.zza.onEvent(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzw
    public final int zze() {
        return System.identityHashCode(this.zza);
    }
}
