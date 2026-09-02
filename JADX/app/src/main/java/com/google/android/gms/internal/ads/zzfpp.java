package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfpp<K0> {
    zzfpp() {
    }

    abstract <K extends K0, V> Map<K, Collection<V>> zza();

    public final zzfpn<K0, Object> zzb(int i) {
        return new zzfpo(this, 2);
    }
}
