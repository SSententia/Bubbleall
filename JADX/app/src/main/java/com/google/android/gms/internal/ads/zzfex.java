package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfex implements zzgla<zzbug> {
    private final zzfew zza;
    private final zzgln<Context> zzb;
    private final zzgln<zzcgz> zzc;

    public zzfex(zzfew zzfewVar, zzgln<Context> zzglnVar, zzgln<zzcgz> zzglnVar2) {
        this.zza = zzfewVar;
        this.zzb = zzglnVar;
        this.zzc = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbug zzbugVarZzb = new zzbtx().zzb(((zzcoo) this.zzb).zza(), ((zzcox) this.zzc).zza());
        zzgli.zzb(zzbugVarZzb);
        return zzbugVarZzb;
    }
}
