package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehk extends zzehh<zzdji> {
    private final zzcoj zza;
    private final zzdam zzb;
    private final zzejq zzc;
    private final zzdgp zzd;

    public zzehk(zzcoj zzcojVar, zzdam zzdamVar, zzejq zzejqVar, zzdgp zzdgpVar) {
        this.zza = zzcojVar;
        this.zzb = zzdamVar;
        this.zzc = zzejqVar;
        this.zzd = zzdgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehh
    protected final zzfsm<zzdji> zzc(zzfar zzfarVar, Bundle bundle) {
        zzdke zzdkeVarZzp = this.zza.zzp();
        zzdam zzdamVar = this.zzb;
        zzdamVar.zzf(zzfarVar);
        zzdamVar.zzg(bundle);
        zzdkeVarZzp.zzc(zzdamVar.zzh());
        zzdkeVarZzp.zzd(this.zzd);
        zzdkeVarZzp.zzb(this.zzc);
        zzcyj<zzdji> zzcyjVarZzP = zzdkeVarZzp.zza().zzP();
        return zzcyjVarZzP.zzd(zzcyjVarZzP.zzc());
    }
}
