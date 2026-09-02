package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfuz extends zzfts<zzfyg, zzfyd> {
    final /* synthetic */ zzfva zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfuz(zzfva zzfvaVar, Class cls) {
        super(cls);
        this.zza = zzfvaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzghi zzghiVar) throws GeneralSecurityException {
        zzfyg zzfygVar = (zzfyg) zzghiVar;
        zzgdu.zza(zzfygVar.zzc());
        if (zzfygVar.zza().zza() != 12 && zzfygVar.zza().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfyg.zzd(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfyd zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfyg zzfygVar = (zzfyg) zzghiVar;
        zzfyc zzfycVarZzf = zzfyd.zzf();
        zzfycVarZzf.zzc(zzgex.zzt(zzgds.zza(zzfygVar.zzc())));
        zzfycVarZzf.zzb(zzfygVar.zza());
        zzfycVarZzf.zza(0);
        return zzfycVarZzf.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Map<String, zzftr<zzfyg>> zze() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzfva.zzk(16, 16, 1));
        map.put("AES128_EAX_RAW", zzfva.zzk(16, 16, 3));
        map.put("AES256_EAX", zzfva.zzk(32, 16, 1));
        map.put("AES256_EAX_RAW", zzfva.zzk(32, 16, 3));
        return Collections.unmodifiableMap(map);
    }
}
