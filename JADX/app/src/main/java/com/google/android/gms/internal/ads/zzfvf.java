package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvf extends zzfts<zzfyv, zzfys> {
    final /* synthetic */ zzfvg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfvf(zzfvg zzfvgVar, Class cls) {
        super(cls);
        this.zza = zzfvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzghi zzghiVar) throws GeneralSecurityException {
        zzgdu.zza(((zzfyv) zzghiVar).zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfyv.zzc(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfys zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfyr zzfyrVarZze = zzfys.zze();
        zzfyrVarZze.zzb(zzgex.zzt(zzgds.zza(((zzfyv) zzghiVar).zza())));
        zzfyrVarZze.zza(0);
        return zzfyrVarZze.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Map<String, zzftr<zzfyv>> zze() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM_SIV", zzfvg.zzl(16, 1));
        map.put("AES128_GCM_SIV_RAW", zzfvg.zzl(16, 3));
        map.put("AES256_GCM_SIV", zzfvg.zzl(32, 1));
        map.put("AES256_GCM_SIV_RAW", zzfvg.zzl(32, 3));
        return Collections.unmodifiableMap(map);
    }
}
