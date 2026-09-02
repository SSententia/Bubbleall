package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfz extends zzfu {
    zzfz() {
    }

    @Override // com.google.android.gms.internal.measurement.zzfu
    public final void zza(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }
}
