package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehf extends zzehh<zzcxn> {
    private final zzcoj zza;
    private final zzdkw zzb;
    private final zzdam zzc;
    private final zzdgp zzd;

    public zzehf(zzcoj zzcojVar, zzdkw zzdkwVar, zzdam zzdamVar, zzdgp zzdgpVar) {
        this.zza = zzcojVar;
        this.zzb = zzdkwVar;
        this.zzc = zzdamVar;
        this.zzd = zzdgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehh
    protected final zzfsm<zzcxn> zzc(zzfar zzfarVar, Bundle bundle) {
        zzdla zzdlaVarZzr = this.zza.zzr();
        zzdam zzdamVar = this.zzc;
        zzdamVar.zzf(zzfarVar);
        zzdamVar.zzg(bundle);
        zzdlaVarZzr.zzd(zzdamVar.zzh());
        zzdlaVarZzr.zze(this.zzd);
        zzdlaVarZzr.zzc(this.zzb);
        zzdlaVarZzr.zzb(new zzcve(null));
        zzcyj<zzcxn> zzcyjVarZzR = zzdlaVarZzr.zza().zzR();
        return zzcyjVarZzR.zzd(zzcyjVarZzR.zzc());
    }
}
