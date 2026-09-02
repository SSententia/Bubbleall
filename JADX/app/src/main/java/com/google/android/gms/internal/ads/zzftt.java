package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzftt<PrimitiveT, KeyT> {
    private final Class<PrimitiveT> zza;

    public zzftt(Class<PrimitiveT> cls) {
        this.zza = cls;
    }

    final Class<PrimitiveT> zza() {
        return this.zza;
    }

    public abstract PrimitiveT zzb(KeyT keyt) throws GeneralSecurityException;
}
