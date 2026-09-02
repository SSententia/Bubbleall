package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgkq implements Iterator {
    int zza = 0;
    final /* synthetic */ zzgkr zzb;

    zzgkq(zzgkr zzgkrVar) {
        this.zzb = zzgkrVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzgkr zzgkrVar = this.zzb;
            zzgkrVar.zza.add((E) zzgkrVar.zzb.next());
            return next();
        }
        List<E> list = this.zzb.zza;
        int i = this.zza;
        this.zza = i + 1;
        return list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
