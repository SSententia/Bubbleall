package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcmq implements zzfrz<Map<String, String>> {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Uri zzc;
    final /* synthetic */ zzcms zzd;

    zzcmq(zzcms zzcmsVar, List list, String str, Uri uri) {
        this.zzd = zzcmsVar;
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        String strValueOf = String.valueOf(this.zzc);
        String.valueOf(strValueOf).length();
        com.google.android.gms.ads.internal.util.zze.zzi("Failed to parse gmsg params for: ".concat(String.valueOf(strValueOf)));
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(Map<String, String> map) {
        this.zzd.zzQ(map, this.zza, this.zzb);
    }
}
