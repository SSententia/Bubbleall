package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfvq extends zzftu<zzgbq> {
    zzfvq() {
        super(zzgbq.class, new zzfvo(zzftg.class));
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzgbq.zzd(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzgdu.zzb(((zzgbq) zzghiVar).zza(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final zzfts<zzgbt, zzgbq> zzh() {
        return new zzfvp(this, zzgbt.class);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzi() {
        return 6;
    }
}
