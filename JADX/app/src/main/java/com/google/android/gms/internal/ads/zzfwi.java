package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwi extends zzftu<zzfzy> {
    public zzfwi() {
        super(zzfzy.class, new zzfwh(zzftl.class));
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfzy.zzf(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final /* bridge */ /* synthetic */ void zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfzy zzfzyVar = (zzfzy) zzghiVar;
        zzgdu.zzb(zzfzyVar.zza(), 0);
        zzfwp.zza(zzfzyVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzi() {
        return 5;
    }
}
