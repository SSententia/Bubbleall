package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-base@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgec extends zzgdx {
    zzgec() {
    }

    @Override // com.google.android.gms.internal.ads.zzgdx
    public final void zza(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgdx
    public final void zzb(Throwable th) {
        th.printStackTrace();
    }

    @Override // com.google.android.gms.internal.ads.zzgdx
    public final void zzc(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}
