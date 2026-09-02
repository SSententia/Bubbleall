package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvz extends zzfts<zzfzb, zzfyy> {
    final /* synthetic */ zzfwa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfvz(zzfwa zzfwaVar, Class cls) {
        super(cls);
        this.zza = zzfwaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzghi zzghiVar) throws GeneralSecurityException {
        zzfzb zzfzbVar = (zzfzb) zzghiVar;
        if (zzfzbVar.zza() == 64) {
            return;
        }
        int iZza = zzfzbVar.zza();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(iZza);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidAlgorithmParameterException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfzb.zzc(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfyy zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfyx zzfyxVarZze = zzfyy.zze();
        zzfyxVarZze.zzb(zzgex.zzt(zzgds.zza(((zzfzb) zzghiVar).zza())));
        zzfyxVarZze.zza(0);
        return zzfyxVarZze.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Map<String, zzftr<zzfzb>> zze() throws GeneralSecurityException {
        HashMap map = new HashMap();
        zzfza zzfzaVarZzd = zzfzb.zzd();
        zzfzaVarZzd.zza(64);
        map.put("AES256_SIV", new zzftr(zzfzaVarZzd.zzah(), 1));
        zzfza zzfzaVarZzd2 = zzfzb.zzd();
        zzfzaVarZzd2.zza(64);
        map.put("AES256_SIV_RAW", new zzftr(zzfzaVarZzd2.zzah(), 3));
        return Collections.unmodifiableMap(map);
    }
}
