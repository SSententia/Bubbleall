package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaar;
import com.google.android.gms.internal.ads.zzaas;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzo implements Callable<zzaas> {
    final /* synthetic */ zzs zza;

    zzo(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ zzaas call() throws Exception {
        return new zzaas(zzaar.zzs(this.zza.zza.zza, this.zza.zzd, false));
    }
}
