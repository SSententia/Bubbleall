package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvi extends zzfts<zzfzh, zzfze> {
    final /* synthetic */ zzfvj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfvi(zzfvj zzfvjVar, Class cls) {
        super(cls);
        this.zza = zzfvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzghi zzghiVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfzh.zza(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfze zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfzd zzfzdVarZze = zzfze.zze();
        zzfzdVarZze.zza(0);
        zzfzdVarZze.zzb(zzgex.zzt(zzgds.zza(32)));
        return zzfzdVarZze.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Map<String, zzftr<zzfzh>> zze() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", new zzftr(zzfzh.zzc(), 1));
        map.put("CHACHA20_POLY1305_RAW", new zzftr(zzfzh.zzc(), 3));
        return Collections.unmodifiableMap(map);
    }
}
