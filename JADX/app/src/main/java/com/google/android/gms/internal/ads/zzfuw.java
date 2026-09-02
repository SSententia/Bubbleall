package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfuw extends zzfts<zzfxx, zzfxu> {
    final /* synthetic */ zzfux zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfuw(zzfux zzfuxVar, Class cls) {
        super(cls);
        this.zza = zzfuxVar;
    }

    public static final zzfxu zzg(zzfxx zzfxxVar) throws GeneralSecurityException {
        zzfxt zzfxtVarZzf = zzfxu.zzf();
        zzfxtVarZzf.zzb(zzfxxVar.zza());
        zzfxtVarZzf.zzc(zzgex.zzt(zzgds.zza(zzfxxVar.zzc())));
        zzfxtVarZzf.zza(0);
        return zzfxtVarZzf.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfxx.zzd(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfxu zzd(zzghi zzghiVar) throws GeneralSecurityException {
        return zzg((zzfxx) zzghiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zzb(zzfxx zzfxxVar) throws GeneralSecurityException {
        zzgdu.zza(zzfxxVar.zzc());
        zzfux zzfuxVar = this.zza;
        zzfux.zzm(zzfxxVar.zza());
    }
}
