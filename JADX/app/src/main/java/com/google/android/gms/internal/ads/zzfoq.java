package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfoq<K, V> extends zzfoe<V> {
    private final transient zzfor<K, V> zza;

    zzfoq(zzfor<K, V> zzforVar) {
        this.zza = zzforVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new zzfoo(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    /* JADX INFO: renamed from: zza */
    public final zzfql<V> iterator() {
        return new zzfoo(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfoe
    final int zzg(Object[] objArr, int i) {
        zzfqm zzfqmVarListIterator = ((zzfoj) this.zza.zzb.values()).listIterator(0);
        while (zzfqmVarListIterator.hasNext()) {
            i = ((zzfoe) zzfqmVarListIterator.next()).zzg(objArr, i);
        }
        return i;
    }
}
