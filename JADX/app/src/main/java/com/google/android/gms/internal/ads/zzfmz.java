package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzfmz implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfna zzc;

    zzfmz(zzfna zzfnaVar) {
        this.zzc = zzfnaVar;
        this.zzb = zzfnaVar.zzb;
        Collection collection = zzfnaVar.zzb;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    zzfmz(zzfna zzfnaVar, Iterator it) {
        this.zzc = zzfnaVar;
        this.zzb = zzfnaVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        this.zzc.zze.zzb--;
        this.zzc.zzb();
    }

    final void zza() {
        this.zzc.zza();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
