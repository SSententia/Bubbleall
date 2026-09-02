package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfoj<E> extends zzfoe<E> implements List<E>, RandomAccess {
    private static final zzfqm<Object> zza = new zzfoh(zzfpx.zza, 0);

    zzfoj() {
    }

    public static <E> zzfoj<E> zzi() {
        return (zzfoj<E>) zzfpx.zza;
    }

    public static <E> zzfoj<E> zzj(E e) {
        Object[] objArr = {e};
        zzfpv.zza(objArr, 1);
        return zzs(objArr, 1);
    }

    public static <E> zzfoj<E> zzk(E e, E e2) {
        Object[] objArr = {e, e2};
        zzfpv.zza(objArr, 2);
        return zzs(objArr, 2);
    }

    public static <E> zzfoj<E> zzl(E e, E e2, E e3) {
        Object[] objArr = {"2011", "1009", "3010"};
        zzfpv.zza(objArr, 3);
        return zzs(objArr, 3);
    }

    public static <E> zzfoj<E> zzm(E e, E e2, E e3, E e4, E e5) {
        Object[] objArr = {e, e2, e3, e4, e5};
        zzfpv.zza(objArr, 5);
        return zzs(objArr, 5);
    }

    public static <E> zzfoj<E> zzn(E e, E e2, E e3, E e4, E e5, E e6) {
        Object[] objArr = {e, e2, e3, e4, e5, e6};
        zzfpv.zza(objArr, 6);
        return zzs(objArr, 6);
    }

    public static <E> zzfoj<E> zzp(Collection<? extends E> collection) {
        if (!(collection instanceof zzfoe)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzfpv.zza(array, length);
            return zzs(array, length);
        }
        zzfoj<E> zzfojVarZze = ((zzfoe) collection).zze();
        if (!zzfojVarZze.zzf()) {
            return zzfojVarZze;
        }
        Object[] array2 = zzfojVarZze.toArray();
        return zzs(array2, array2.length);
    }

    public static <E> zzfoj<E> zzq(E[] eArr) {
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        zzfpv.zza(objArr, length);
        return zzs(objArr, length);
    }

    static <E> zzfoj<E> zzr(Object[] objArr) {
        return zzs(objArr, objArr.length);
    }

    static <E> zzfoj<E> zzs(Object[] objArr, int i) {
        return i == 0 ? (zzfoj<E>) zzfpx.zza : new zzfpx(objArr, i);
    }

    public static <E> zzfog<E> zzu() {
        return new zzfog<>(4);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzflt.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && zzflt.zza(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    /* JADX INFO: renamed from: zza */
    public final zzfql<E> iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    @Deprecated
    public final zzfoj<E> zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    int zzg(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzfoj<E> subList(int i, int i2) {
        zzflx.zzg(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? (zzfoj<E>) zzfpx.zza : new zzfoi(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final zzfqm<E> listIterator(int i) {
        zzflx.zzf(i, size(), "index");
        return isEmpty() ? (zzfqm<E>) zza : new zzfoh(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> zzfoj<E> zzo(Iterable<? extends E> iterable) {
        iterable.getClass();
        return zzp(iterable);
    }
}
