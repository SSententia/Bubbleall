package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvp extends zzfts<zzgbt, zzgbq> {
    final /* synthetic */ zzfvq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfvp(zzfvq zzfvqVar, Class cls) {
        super(cls);
        this.zza = zzfvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzghi zzghiVar) throws GeneralSecurityException {
        zzgbt zzgbtVar = (zzgbt) zzghiVar;
        if (zzgbtVar.zza().isEmpty() || !zzgbtVar.zzc()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzgbt.zze(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzgbq zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzgbp zzgbpVarZze = zzgbq.zze();
        zzgbpVarZze.zzb((zzgbt) zzghiVar);
        zzgbpVarZze.zza(0);
        return zzgbpVarZze.zzah();
    }
}
