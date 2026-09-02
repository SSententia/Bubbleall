package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvc extends zzfts<zzfyp, zzfym> {
    final /* synthetic */ zzfvd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfvc(zzfvd zzfvdVar, Class cls) {
        super(cls);
        this.zza = zzfvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzghi zzghiVar) throws GeneralSecurityException {
        zzgdu.zza(((zzfyp) zzghiVar).zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfyp.zzc(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfym zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfyl zzfylVarZze = zzfym.zze();
        zzfylVarZze.zzb(zzgex.zzt(zzgds.zza(((zzfyp) zzghiVar).zza())));
        zzfylVarZze.zza(0);
        return zzfylVarZze.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Map<String, zzftr<zzfyp>> zze() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzfvd.zzk(16, 1));
        map.put("AES128_GCM_RAW", zzfvd.zzk(16, 3));
        map.put("AES256_GCM", zzfvd.zzk(32, 1));
        map.put("AES256_GCM_RAW", zzfvd.zzk(32, 3));
        return Collections.unmodifiableMap(map);
    }
}
