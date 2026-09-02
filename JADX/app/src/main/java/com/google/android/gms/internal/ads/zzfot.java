package com.google.android.gms.internal.ads;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfot<E> extends zzfoe<E> implements Set<E> {

    @CheckForNull
    private transient zzfoj<E> zza;

    zzfot() {
    }

    public static <E> zzfot<E> zzh() {
        return zzfqd.zza;
    }

    @SafeVarargs
    public static <E> zzfot<E> zzi(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Object[] objArr = new Object[11];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, 5);
        return zzp(11, objArr);
    }

    static int zzl(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zzflx.zza(iMax < 1073741824, "collection too large");
            return BasicMeasure.EXACTLY;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static <E> zzfos<E> zzo(int i) {
        return new zzfos<>(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzq(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfot) && zzm() && ((zzfot) obj).zzm() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfqh.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zza */
    public abstract zzfql<E> iterator();

    @Override // com.google.android.gms.internal.ads.zzfoe
    public zzfoj<E> zze() {
        zzfoj<E> zzfojVar = this.zza;
        if (zzfojVar != null) {
            return zzfojVar;
        }
        zzfoj<E> zzfojVarZzn = zzn();
        this.zza = zzfojVarZzn;
        return zzfojVarZzn;
    }

    boolean zzm() {
        return false;
    }

    zzfoj<E> zzn() {
        return zzfoj.zzr(toArray());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> zzfot<E> zzp(int i, Object... objArr) {
        if (i == 0) {
            return zzfqd.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzfqi(obj);
        }
        int iZzl = zzl(i);
        Object[] objArr2 = new Object[iZzl];
        int i2 = iZzl - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzfpv.zzb(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iZza = zzfob.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzfqi(obj4, i3);
        }
        if (zzl(i4) < iZzl / 2) {
            return zzp(i4, objArr);
        }
        if (zzq(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzfqd(objArr, i3, objArr2, i2, i4);
    }
}
