package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfnn<T> implements Iterator<T> {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzfns zze;

    /* synthetic */ zzfnn(zzfns zzfnsVar, zzfnq zzfnqVar) {
        this.zze = zzfnsVar;
        this.zzb = zzfnsVar.zzf;
        this.zzc = zzfnsVar.zzm();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        T tZza = zza(i);
        this.zzc = this.zze.zzn(this.zzc);
        return tZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzflx.zzb(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfns zzfnsVar = this.zze;
        zzfnsVar.remove(zzfns.zzs(zzfnsVar, this.zzd));
        this.zzc--;
        this.zzd = -1;
    }

    abstract T zza(int i);
}
