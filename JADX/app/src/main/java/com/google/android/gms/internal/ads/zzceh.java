package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzceh extends zzcfb {
    private final Clock zzb;
    private final zzceh zzc = this;
    private final zzgln<Context> zzd;
    private final zzgln<com.google.android.gms.ads.internal.util.zzg> zze;
    private final zzgln<zzcfa> zzf;
    private final zzgln<zzcdz> zzg;
    private final zzgln<Clock> zzh;
    private final zzgln<zzceb> zzi;
    private final zzgln<zzced> zzj;
    private final zzgln<zzcfg> zzk;

    /* synthetic */ zzceh(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcfa zzcfaVar, zzceg zzcegVar) {
        this.zzb = clock;
        zzgla zzglaVarZza = zzglb.zza(context);
        this.zzd = zzglaVarZza;
        zzgla zzglaVarZza2 = zzglb.zza(zzgVar);
        this.zze = zzglaVarZza2;
        zzgla zzglaVarZza3 = zzglb.zza(zzcfaVar);
        this.zzf = zzglaVarZza3;
        this.zzg = zzgkz.zza(new zzcea(zzglaVarZza, zzglaVarZza2, zzglaVarZza3));
        zzgla zzglaVarZza4 = zzglb.zza(clock);
        this.zzh = zzglaVarZza4;
        zzgln<zzceb> zzglnVarZza = zzgkz.zza(new zzcec(zzglaVarZza4, zzglaVarZza2, zzglaVarZza3));
        this.zzi = zzglnVarZza;
        zzcee zzceeVar = new zzcee(zzglaVarZza4, zzglnVarZza);
        this.zzj = zzceeVar;
        this.zzk = zzgkz.zza(new zzcfh(zzglaVarZza, zzceeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    final zzcdz zza() {
        return this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    final zzced zzb() {
        return new zzced(this.zzb, this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    final zzcfg zzc() {
        return this.zzk.zzb();
    }
}
