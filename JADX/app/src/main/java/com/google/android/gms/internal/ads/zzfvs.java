package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvs extends zzfts<zzgce, zzgcb> {
    final /* synthetic */ zzfvt zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfvs(zzfvt zzfvtVar, Class cls) {
        super(cls);
        this.zza = zzfvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzghi zzghiVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzgce.zza(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzgcb zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzgca zzgcaVarZze = zzgcb.zze();
        zzgcaVarZze.zza(0);
        zzgcaVarZze.zzb(zzgex.zzt(zzgds.zza(32)));
        return zzgcaVarZze.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Map<String, zzftr<zzgce>> zze() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", new zzftr(zzgce.zzc(), 1));
        map.put("XCHACHA20_POLY1305_RAW", new zzftr(zzgce.zzc(), 3));
        return Collections.unmodifiableMap(map);
    }
}
