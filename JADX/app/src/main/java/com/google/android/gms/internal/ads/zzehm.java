package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehm extends zzehh<zzdrw> {
    private final zzcoj zza;
    private final zzdam zzb;
    private final zzdgp zzc;

    public zzehm(zzcoj zzcojVar, zzdam zzdamVar, zzdgp zzdgpVar) {
        this.zza = zzcojVar;
        this.zzb = zzdamVar;
        this.zzc = zzdgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehh
    protected final zzfsm<zzdrw> zzc(zzfar zzfarVar, Bundle bundle) {
        zzdsa zzdsaVarZzs = this.zza.zzs();
        zzdam zzdamVar = this.zzb;
        zzdamVar.zzf(zzfarVar);
        zzdamVar.zzg(bundle);
        zzdsaVarZzs.zzb(zzdamVar.zzh());
        zzdsaVarZzs.zzc(this.zzc);
        zzcyj<zzdrw> zzcyjVarZzP = zzdsaVarZzs.zza().zzP();
        return zzcyjVarZzP.zzd(zzcyjVarZzP.zzc());
    }
}
