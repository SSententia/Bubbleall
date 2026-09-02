package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdao {
    private final Context zza;
    private final zzfar zzb;
    private final Bundle zzc;
    private final zzfam zzd;

    /* synthetic */ zzdao(zzdam zzdamVar, zzdan zzdanVar) {
        this.zza = zzdamVar.zza;
        this.zzb = zzdamVar.zzb;
        this.zzc = zzdamVar.zzc;
        this.zzd = zzdamVar.zzd;
    }

    final zzdam zza() {
        zzdam zzdamVar = new zzdam();
        zzdamVar.zze(this.zza);
        zzdamVar.zzf(this.zzb);
        zzdamVar.zzg(this.zzc);
        return zzdamVar;
    }

    final zzfar zzb() {
        return this.zzb;
    }

    final zzfam zzc() {
        return this.zzd;
    }

    final Bundle zzd() {
        return this.zzc;
    }

    final Context zze(Context context) {
        return this.zza;
    }
}
