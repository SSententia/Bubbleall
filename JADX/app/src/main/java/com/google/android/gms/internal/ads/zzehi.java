package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehi extends zzehh<zzcvh> {
    private final zzcoj zza;
    private final zzdam zzb;
    private final zzejq zzc;
    private final zzdgp zzd;
    private final zzdkw zze;
    private final zzddr zzf;
    private final ViewGroup zzg;

    public zzehi(zzcoj zzcojVar, zzdam zzdamVar, zzejq zzejqVar, zzdgp zzdgpVar, zzdkw zzdkwVar, zzddr zzddrVar, ViewGroup viewGroup) {
        this.zza = zzcojVar;
        this.zzb = zzdamVar;
        this.zzc = zzejqVar;
        this.zzd = zzdgpVar;
        this.zze = zzdkwVar;
        this.zzf = zzddrVar;
        this.zzg = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzehh
    protected final zzfsm<zzcvh> zzc(zzfar zzfarVar, Bundle bundle) {
        zzcwd zzcwdVarZzk = this.zza.zzk();
        zzdam zzdamVar = this.zzb;
        zzdamVar.zzf(zzfarVar);
        zzdamVar.zzg(bundle);
        zzcwdVarZzk.zzi(zzdamVar.zzh());
        zzcwdVarZzk.zzj(this.zzd);
        zzcwdVarZzk.zze(this.zzc);
        zzcwdVarZzk.zzb(this.zze);
        zzcwdVarZzk.zzd(new zzcxa(this.zzf));
        zzcwdVarZzk.zzc(new zzcve(this.zzg));
        zzcyj<zzcvh> zzcyjVarZzY = zzcwdVarZzk.zza().zzY();
        return zzcyjVarZzY.zzd(zzcyjVarZzY.zzc());
    }
}
