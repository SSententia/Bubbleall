package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfpw<T> implements Comparator<T> {
    protected zzfpw() {
    }

    public static <C extends Comparable> zzfpw<C> zzb() {
        return zzfpu.zza;
    }

    public static <T> zzfpw<T> zzc(Comparator<T> comparator) {
        return comparator instanceof zzfpw ? (zzfpw) comparator : new zzfnu(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    public <S extends T> zzfpw<S> zza() {
        return new zzfqf(this);
    }
}
