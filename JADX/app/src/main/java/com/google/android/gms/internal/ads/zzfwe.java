package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwe extends zzftt<zzftk, zzfzv> {
    zzfwe(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final /* bridge */ /* synthetic */ zzftk zzb(zzfzv zzfzvVar) throws GeneralSecurityException {
        zzfzv zzfzvVar2 = zzfzvVar;
        zzfzs zzfzsVarZzc = zzfzvVar2.zzc().zzc();
        zzgab zzgabVarZza = zzfzsVarZzc.zza();
        int iZzc = zzfwp.zzc(zzgabVarZza.zzg());
        byte[] bArrZzz = zzfzvVar2.zzd().zzz();
        return new zzgcu((ECPrivateKey) zzgdb.zzg.zzb("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrZzz), zzgcz.zzd(iZzc))), zzgabVarZza.zza().zzz(), zzfwp.zzb(zzgabVarZza.zzh()), zzfwp.zzd(zzfzsVarZzc.zzi()), new zzfwq(zzfzsVarZzc.zzc().zza()));
    }
}
