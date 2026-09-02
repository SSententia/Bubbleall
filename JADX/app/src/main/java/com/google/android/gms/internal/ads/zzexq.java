package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzexq {
    static zzexo<zzcuk, zzcuq> zza(Context context, zzfby zzfbyVar, zzfcq zzfcqVar) {
        return zzc(context, zzfbyVar, zzfcqVar);
    }

    static zzexo<zzcuv, zzcva> zzb(Context context, zzfby zzfbyVar, zzfcq zzfcqVar) {
        return zzc(context, zzfbyVar, zzfcqVar);
    }

    private static <AppOpenAdRequestComponent extends zzdal<AppOpenAd>, AppOpenAd extends zzcxg> zzexo<AppOpenAdRequestComponent, AppOpenAd> zzc(Context context, zzfby zzfbyVar, zzfcq zzfcqVar) {
        zzcfz zzcfzVarZzn = ((Boolean) zzbet.zzc().zzc(zzbjl.zzeF)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn() : com.google.android.gms.ads.internal.zzt.zzg().zzp().zzo();
        boolean z = false;
        if (zzcfzVarZzn != null && zzcfzVarZzn.zzi()) {
            z = true;
        }
        if (((Integer) zzbet.zzc().zzc(zzbjl.zzeV)).intValue() > 0) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzeE)).booleanValue() || z) {
                zzfcp zzfcpVarZza = zzfcqVar.zza(zzfcg.AppOpen, context, zzfbyVar, new zzews(new zzewp()));
                return new zzewu(new zzexe(new zzexd()), new zzexa(zzfcpVarZza.zza, zzchg.zza), zzfcpVarZza.zzb, zzfcpVarZza.zza.zze().zzf, zzchg.zza);
            }
        }
        return new zzexd();
    }
}
