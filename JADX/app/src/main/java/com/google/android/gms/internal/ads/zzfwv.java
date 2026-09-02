package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwv extends zzftt<zzfty, zzgai> {
    zzfwv(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final /* bridge */ /* synthetic */ zzfty zzb(zzgai zzgaiVar) throws GeneralSecurityException {
        zzgai zzgaiVar2 = zzgaiVar;
        int iZzg = zzgaiVar2.zzc().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgaiVar2.zzd().zzz(), "HMAC");
        int iZza = zzgaiVar2.zzc().zza();
        int i = iZzg - 2;
        if (i == 1) {
            return new zzgdq(new zzgdp("HMACSHA1", secretKeySpec), iZza);
        }
        if (i == 2) {
            return new zzgdq(new zzgdp("HMACSHA384", secretKeySpec), iZza);
        }
        if (i == 3) {
            return new zzgdq(new zzgdp("HMACSHA256", secretKeySpec), iZza);
        }
        if (i == 4) {
            return new zzgdq(new zzgdp("HMACSHA512", secretKeySpec), iZza);
        }
        if (i == 5) {
            return new zzgdq(new zzgdp("HMACSHA224", secretKeySpec), iZza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
