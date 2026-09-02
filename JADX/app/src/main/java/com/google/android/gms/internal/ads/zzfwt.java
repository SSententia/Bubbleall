package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwt extends zzfts<zzfxi, zzfxf> {
    zzfwt(zzfwu zzfwuVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzghi zzghiVar) throws GeneralSecurityException {
        zzfxi zzfxiVar = (zzfxi) zzghiVar;
        zzfwu.zzm(zzfxiVar.zzc());
        zzfwu.zzn(zzfxiVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzghi zzc(zzgex zzgexVar) throws zzggm {
        return zzfxi.zzd(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfxf zzd(zzghi zzghiVar) throws GeneralSecurityException {
        zzfxi zzfxiVar = (zzfxi) zzghiVar;
        zzfxe zzfxeVarZzf = zzfxf.zzf();
        zzfxeVarZzf.zza(0);
        zzfxeVarZzf.zzb(zzgex.zzt(zzgds.zza(zzfxiVar.zza())));
        zzfxeVarZzf.zzc(zzfxiVar.zzc());
        return zzfxeVarZzf.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Map<String, zzftr<zzfxi>> zze() throws GeneralSecurityException {
        HashMap map = new HashMap();
        zzfxh zzfxhVarZze = zzfxi.zze();
        zzfxhVarZze.zza(32);
        zzfxk zzfxkVarZzc = zzfxl.zzc();
        zzfxkVarZzc.zza(16);
        zzfxhVarZze.zzb(zzfxkVarZzc.zzah());
        map.put("AES_CMAC", new zzftr(zzfxhVarZze.zzah(), 1));
        zzfxh zzfxhVarZze2 = zzfxi.zze();
        zzfxhVarZze2.zza(32);
        zzfxk zzfxkVarZzc2 = zzfxl.zzc();
        zzfxkVarZzc2.zza(16);
        zzfxhVarZze2.zzb(zzfxkVarZzc2.zzah());
        map.put("AES256_CMAC", new zzftr(zzfxhVarZze2.zzah(), 1));
        zzfxh zzfxhVarZze3 = zzfxi.zze();
        zzfxhVarZze3.zza(32);
        zzfxk zzfxkVarZzc3 = zzfxl.zzc();
        zzfxkVarZzc3.zza(16);
        zzfxhVarZze3.zzb(zzfxkVarZzc3.zzah());
        map.put("AES256_CMAC_RAW", new zzftr(zzfxhVarZze3.zzah(), 3));
        return Collections.unmodifiableMap(map);
    }
}
