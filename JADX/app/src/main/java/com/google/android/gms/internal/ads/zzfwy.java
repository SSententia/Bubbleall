package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfwy {

    @Deprecated
    public static final zzgby zza;

    @Deprecated
    public static final zzgby zzb;

    @Deprecated
    public static final zzgby zzc;

    static {
        new zzfwx();
        zzgby zzgbyVarZzc = zzgby.zzc();
        zza = zzgbyVarZzc;
        zzb = zzgbyVarZzc;
        zzc = zzgbyVarZzc;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfum.zze(new zzfxb());
        zzfum.zzc(new zzfwx(), true);
        if (zzfvx.zza()) {
            return;
        }
        zzfum.zzc(new zzfwu(), true);
    }
}
