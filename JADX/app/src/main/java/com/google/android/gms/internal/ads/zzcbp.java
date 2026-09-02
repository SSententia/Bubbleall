package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcbp implements Callable<zzcbo> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcbr zzb;

    zzcbp(zzcbr zzcbrVar, Context context) {
        this.zzb = zzcbrVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ zzcbo call() throws Exception {
        zzcbq zzcbqVar = (zzcbq) this.zzb.zza.get(this.zza);
        zzcbo zzcboVarZza = (zzcbqVar == null || zzcbqVar.zza + zzbkq.zza.zze().longValue() < com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()) ? new zzcbn(this.zza).zza() : new zzcbn(this.zza, zzcbqVar.zzb).zza();
        this.zzb.zza.put(this.zza, new zzcbq(this.zzb, zzcboVarZza));
        return zzcboVarZza;
    }
}
