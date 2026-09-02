package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwf extends zzfts<zzfzp, zzfzv> {
    final /* synthetic */ zzfwg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfwf(zzfwg zzfwgVar, Class cls) {
        super(cls);
        this.zza = zzfwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzghi zzghiVar) throws GeneralSecurityException {
        zzfwp.zza(((zzfzp) zzghiVar).zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfzp.zzc(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfzv zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfzp zzfzpVar = (zzfzp) zzghiVar;
        KeyPair keyPairZzc = zzgcz.zzc(zzgcz.zzd(zzfwp.zzc(zzfzpVar.zza().zza().zzg())));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairZzc.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairZzc.getPrivate();
        ECPoint w = eCPublicKey.getW();
        zzfzx zzfzxVarZzg = zzfzy.zzg();
        zzfzxVarZzg.zza(0);
        zzfzxVarZzg.zzb(zzfzpVar.zza());
        zzfzxVarZzg.zzc(zzgex.zzt(w.getAffineX().toByteArray()));
        zzfzxVarZzg.zzd(zzgex.zzt(w.getAffineY().toByteArray()));
        zzfzy zzfzyVarZzah = zzfzxVarZzg.zzah();
        zzfzu zzfzuVarZzf = zzfzv.zzf();
        zzfzuVarZzf.zza(0);
        zzfzuVarZzf.zzb(zzfzyVarZzah);
        zzfzuVarZzf.zzc(zzgex.zzt(eCPrivateKey.getS().toByteArray()));
        return zzfzuVarZzf.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Map<String, zzftr<zzfzp>> zze() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzfwg.zzl(4, 5, 3, zzftq.zza("AES128_GCM"), zzfwg.zza, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzfwg.zzl(4, 5, 3, zzftq.zza("AES128_GCM"), zzfwg.zza, 3));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzfwg.zzl(4, 5, 4, zzftq.zza("AES128_GCM"), zzfwg.zza, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzfwg.zzl(4, 5, 4, zzftq.zza("AES128_GCM"), zzfwg.zza, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzfwg.zzl(4, 5, 4, zzftq.zza("AES128_GCM"), zzfwg.zza, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzfwg.zzl(4, 5, 3, zzftq.zza("AES128_CTR_HMAC_SHA256"), zzfwg.zza, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzfwg.zzl(4, 5, 3, zzftq.zza("AES128_CTR_HMAC_SHA256"), zzfwg.zza, 3));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzfwg.zzl(4, 5, 4, zzftq.zza("AES128_CTR_HMAC_SHA256"), zzfwg.zza, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzfwg.zzl(4, 5, 4, zzftq.zza("AES128_CTR_HMAC_SHA256"), zzfwg.zza, 3));
        return Collections.unmodifiableMap(map);
    }
}
