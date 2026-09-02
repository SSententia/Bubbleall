package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfut extends zzfts<zzfxr, zzfxo> {
    final /* synthetic */ zzfuu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfut(zzfuu zzfuuVar, Class cls) {
        super(cls);
        this.zza = zzfuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzghi zzghiVar) throws GeneralSecurityException {
        zzfxr zzfxrVar = (zzfxr) zzghiVar;
        ((zzfuw) new zzfux().zzh()).zzb(zzfxrVar.zza());
        new zzfwx().zzh().zzb(zzfxrVar.zzc());
        zzgdu.zza(zzfxrVar.zza().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfxr.zzd(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfxo zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfxr zzfxrVar = (zzfxr) zzghiVar;
        new zzfux();
        zzfxu zzfxuVarZzg = zzfuw.zzg(zzfxrVar.zza());
        zzgai zzgaiVarZzd = new zzfwx().zzh().zzd(zzfxrVar.zzc());
        zzfxn zzfxnVarZzf = zzfxo.zzf();
        zzfxnVarZzf.zzb(zzfxuVarZzg);
        zzfxnVarZzf.zzc(zzgaiVarZzd);
        zzfxnVarZzf.zza(0);
        return zzfxnVarZzf.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Map<String, zzftr<zzfxr>> zze() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzfuu.zzk(16, 16, 32, 16, 5, 1));
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzfuu.zzk(16, 16, 32, 16, 5, 3));
        map.put("AES256_CTR_HMAC_SHA256", zzfuu.zzk(32, 16, 32, 32, 5, 1));
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzfuu.zzk(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(map);
    }
}
