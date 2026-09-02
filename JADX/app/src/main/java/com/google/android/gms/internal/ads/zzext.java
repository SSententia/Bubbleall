package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzext implements zzgla<zzexo<zzdsb, zzdrw>> {
    private final zzgln<Context> zza;
    private final zzgln<zzfby> zzb;
    private final zzgln<zzfcq> zzc;

    public zzext(zzgln<Context> zzglnVar, zzgln<zzfby> zzglnVar2, zzgln<zzfcq> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexo<zzdsb, zzdrw> zzb() {
        Context contextZzb = this.zza.zzb();
        zzfby zzfbyVarZzb = this.zzb.zzb();
        zzfcq zzfcqVarZzb = this.zzc.zzb();
        zzcfz zzcfzVarZzn = ((Boolean) zzbet.zzc().zzc(zzbjl.zzeF)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn() : com.google.android.gms.ads.internal.zzt.zzg().zzp().zzo();
        boolean z = false;
        if (zzcfzVarZzn != null && zzcfzVarZzn.zzi()) {
            z = true;
        }
        if (((Integer) zzbet.zzc().zzc(zzbjl.zzeH)).intValue() > 0) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzeE)).booleanValue() || z) {
                zzfcp zzfcpVarZza = zzfcqVarZzb.zza(zzfcg.Rewarded, contextZzb, zzfbyVarZzb, new zzews(new zzewp()));
                return new zzewu(new zzexe(new zzexd()), new zzexa(zzfcpVarZza.zza, zzchg.zza), zzfcpVarZza.zzb, zzfcpVarZza.zza.zze().zzf, zzchg.zza);
            }
        }
        return new zzexd();
    }
}
