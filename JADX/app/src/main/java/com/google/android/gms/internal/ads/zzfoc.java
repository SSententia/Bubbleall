package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzfoc<E> extends zzfod<E> {
    Object[] zza;
    int zzb = 0;
    boolean zzc;

    zzfoc(int i) {
        this.zza = new Object[i];
    }

    private final void zze(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            this.zza = Arrays.copyOf(objArr, zzd(length, i));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfod<E> zzb(Iterable<? extends E> iterable) {
        zze(this.zzb + iterable.size());
        if (iterable instanceof zzfoe) {
            this.zzb = ((zzfoe) iterable).zzg(this.zza, this.zzb);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzc(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfod
    public /* bridge */ /* synthetic */ zzfod zzc(Object obj) {
        throw null;
    }

    public final zzfoc<E> zza(E e) {
        e.getClass();
        zze(this.zzb + 1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = e;
        return this;
    }
}
