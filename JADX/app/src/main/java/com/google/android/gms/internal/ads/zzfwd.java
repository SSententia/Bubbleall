package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfwd implements zzfue<zzftj, zzftj> {
    private static final Logger zza = Logger.getLogger(zzfwd.class.getName());

    zzfwd() {
    }

    @Override // com.google.android.gms.internal.ads.zzfue
    public final /* bridge */ /* synthetic */ zzftj zza(zzfud<zzftj> zzfudVar) throws GeneralSecurityException {
        return new zzfwc(zzfudVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfue
    public final Class<zzftj> zzb() {
        return zzftj.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfue
    public final Class<zzftj> zzc() {
        return zzftj.class;
    }
}
