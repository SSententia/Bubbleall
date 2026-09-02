package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbln {
    private static final AtomicReference<zzblm> zzb = new AtomicReference<>();
    static final AtomicBoolean zza = new AtomicBoolean();

    static zzblm zza() {
        return zzb.get();
    }

    public static void zzb(zzblm zzblmVar) {
        zzb.set(zzblmVar);
    }
}
