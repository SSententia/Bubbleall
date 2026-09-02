package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfpl extends zzfpp {
    final /* synthetic */ Comparator zza;

    zzfpl(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfpp
    final <K, V> Map<K, Collection<V>> zza() {
        return new TreeMap(this.zza);
    }
}
