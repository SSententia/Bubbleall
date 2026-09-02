package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfjl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzh implements zzfjl {
    final /* synthetic */ zzi zza;

    zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final void zza(int i, long j) {
        this.zza.zzi.zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final void zzb(int i, long j, String str) {
        this.zza.zzi.zzf(i, System.currentTimeMillis() - j, str);
    }
}
