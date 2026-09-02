package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdzo implements zzfrz<zzfal> {
    final /* synthetic */ zzdzp zza;

    zzdzo(zzdzp zzdzpVar) {
        this.zza = zzdzpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzex)).booleanValue()) {
            Matcher matcher = zzdzp.zzf.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zze.zza(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzfal zzfalVar) {
        zzfal zzfalVar2 = zzfalVar;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzex)).booleanValue()) {
            this.zza.zze.zza(zzfalVar2.zzb.zzb.zze);
            this.zza.zze.zzc(zzfalVar2.zzb.zzb.zzf);
        }
    }
}
