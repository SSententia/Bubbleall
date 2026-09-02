package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzash implements Runnable {
    final /* synthetic */ IOException zza;
    final /* synthetic */ zzasl zzb;

    zzash(zzasl zzaslVar, IOException iOException) {
        this.zzb = zzaslVar;
        this.zza = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zze.zzi(this.zza);
    }
}
