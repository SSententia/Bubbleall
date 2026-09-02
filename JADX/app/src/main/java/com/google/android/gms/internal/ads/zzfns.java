package com.google.android.gms.internal.ads;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfns<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Object zzd = new Object();

    @CheckForNull
    transient int[] zza;

    @CheckForNull
    transient Object[] zzb;

    @CheckForNull
    transient Object[] zzc;

    @CheckForNull
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;

    @CheckForNull
    private transient Set<K> zzh;

    @CheckForNull
    private transient Set<Map.Entry<K, V>> zzi;

    @CheckForNull
    private transient Collection<V> zzj;

    zzfns() {
        zze(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    static /* synthetic */ Object zzo(zzfns zzfnsVar) {
        Object obj = zzfnsVar.zze;
        obj.getClass();
        return obj;
    }

    static /* synthetic */ Object zzs(zzfns zzfnsVar, int i) {
        return zzfnsVar.zzB()[i];
    }

    static /* synthetic */ Object zzt(zzfns zzfnsVar, int i) {
        return zzfnsVar.zzC()[i];
    }

    static /* synthetic */ void zzu(zzfns zzfnsVar, int i, Object obj) {
        zzfnsVar.zzC()[i] = obj;
    }

    private final void zzv(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        Object objZza = zzfnt.zza(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            zzfnt.zzc(objZza, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] iArrZzA = zzA();
        for (int i6 = 0; i6 <= i; i6++) {
            int iZzb = zzfnt.zzb(obj, i6);
            while (iZzb != 0) {
                int i7 = iZzb - 1;
                int i8 = iArrZzA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iZzb2 = zzfnt.zzb(objZza, i10);
                zzfnt.zzc(objZza, i10, iZzb);
                iArrZzA[i7] = ((~i5) & i9) | (iZzb2 & i5);
                iZzb = i8 & i;
            }
        }
        this.zze = objZza;
        zzv(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzy(@CheckForNull Object obj) {
        if (zzf()) {
            return -1;
        }
        int iZzb = zzfob.zzb(obj);
        int iZzw = zzw();
        Object obj2 = this.zze;
        obj2.getClass();
        int iZzb2 = zzfnt.zzb(obj2, iZzb & iZzw);
        if (iZzb2 != 0) {
            int i = ~iZzw;
            int i2 = iZzb & i;
            do {
                int i3 = iZzb2 - 1;
                int i4 = zzA()[i3];
                if ((i4 & i) == i2 && zzflt.zza(obj, zzB()[i3])) {
                    return i3;
                }
                iZzb2 = i4 & iZzw;
            } while (iZzb2 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzz(@CheckForNull Object obj) {
        if (zzf()) {
            return zzd;
        }
        int iZzw = zzw();
        Object obj2 = this.zze;
        obj2.getClass();
        int iZze = zzfnt.zze(obj, null, iZzw, obj2, zzA(), zzB(), null);
        if (iZze == -1) {
            return zzd;
        }
        Object obj3 = zzC()[iZze];
        zzl(iZze, iZzw);
        this.zzg--;
        zzi();
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzf()) {
            return;
        }
        zzi();
        Map<K, V> mapZzg = zzg();
        if (mapZzg != null) {
            this.zzf = zzfqr.zza(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapZzg.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map<K, V> mapZzg = zzg();
        if (mapZzg != null) {
            return mapZzg.containsKey(obj);
        }
        return zzy(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map<K, V> mapZzg = zzg();
        if (mapZzg != null) {
            return mapZzg.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (zzflt.zza(obj, zzC()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.zzi;
        if (set != null) {
            return set;
        }
        zzfnm zzfnmVar = new zzfnm(this);
        this.zzi = zzfnmVar;
        return zzfnmVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        Map<K, V> mapZzg = zzg();
        if (mapZzg != null) {
            return mapZzg.get(obj);
        }
        int iZzy = zzy(obj);
        if (iZzy == -1) {
            return null;
        }
        return (V) zzC()[iZzy];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.zzh;
        if (set != null) {
            return set;
        }
        zzfno zzfnoVar = new zzfno(this);
        this.zzh = zzfnoVar;
        return zzfnoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V put(K k, V v) {
        int iMin;
        if (zzf()) {
            zzflx.zzb(zzf(), "Arrays already allocated");
            int i = this.zzf;
            int iMax = Math.max(i + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = BasicMeasure.EXACTLY;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzfnt.zza(iMax2);
            zzv(iMax2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map<K, V> mapZzg = zzg();
        if (mapZzg != null) {
            return mapZzg.put(k, v);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int iZzb = zzfob.zzb(k);
        int iZzw = zzw();
        int i4 = iZzb & iZzw;
        Object obj = this.zze;
        obj.getClass();
        int iZzb2 = zzfnt.zzb(obj, i4);
        if (iZzb2 != 0) {
            int i5 = ~iZzw;
            int i6 = iZzb & i5;
            int i7 = 0;
            while (true) {
                int i8 = iZzb2 - 1;
                int i9 = iArrZzA[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && zzflt.zza(k, objArrZzB[i8])) {
                    V v2 = (V) objArrZzC[i8];
                    objArrZzC[i8] = v;
                    return v2;
                }
                int i11 = i9 & iZzw;
                i7++;
                if (i11 == 0) {
                    if (i7 < 9) {
                        if (i3 <= iZzw) {
                            iArrZzA[i8] = (i3 & iZzw) | i10;
                            break;
                        }
                        iZzw = zzx(iZzw, zzfnt.zzd(iZzw), iZzb, i2);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzw() + 1, 1.0f);
                    int iZzm = zzm();
                    while (iZzm >= 0) {
                        linkedHashMap.put(zzB()[iZzm], zzC()[iZzm]);
                        iZzm = zzn(iZzm);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzi();
                    return (V) linkedHashMap.put(k, v);
                }
                iZzb2 = i11;
            }
        } else if (i3 > iZzw) {
            iZzw = zzx(iZzw, zzfnt.zzd(iZzw), iZzb, i2);
        } else {
            Object obj2 = this.zze;
            obj2.getClass();
            zzfnt.zzc(obj2, i4, i3);
        }
        int length = zzA().length;
        if (i3 > length && (iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), iMin);
            this.zzb = Arrays.copyOf(zzB(), iMin);
            this.zzc = Arrays.copyOf(zzC(), iMin);
        }
        zzA()[i2] = (~iZzw) & iZzb;
        zzB()[i2] = k;
        zzC()[i2] = v;
        this.zzg = i3;
        zzi();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        Map<K, V> mapZzg = zzg();
        if (mapZzg != null) {
            return mapZzg.remove(obj);
        }
        V v = (V) zzz(obj);
        if (v == zzd) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapZzg = zzg();
        return mapZzg != null ? mapZzg.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzfnr zzfnrVar = new zzfnr(this);
        this.zzj = zzfnrVar;
        return zzfnrVar;
    }

    final void zze(int i) {
        this.zzf = zzfqr.zza(i, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    final boolean zzf() {
        return this.zze == null;
    }

    @CheckForNull
    final Map<K, V> zzg() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void zzi() {
        this.zzf += 32;
    }

    final void zzl(int i, int i2) {
        Object obj = this.zze;
        obj.getClass();
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrZzB[i] = null;
            objArrZzC[i] = null;
            iArrZzA[i] = 0;
            return;
        }
        Object obj2 = objArrZzB[i3];
        objArrZzB[i] = obj2;
        objArrZzC[i] = objArrZzC[i3];
        objArrZzB[i3] = null;
        objArrZzC[i3] = null;
        iArrZzA[i] = iArrZzA[i3];
        iArrZzA[i3] = 0;
        int iZzb = zzfob.zzb(obj2) & i2;
        int iZzb2 = zzfnt.zzb(obj, iZzb);
        if (iZzb2 == size) {
            zzfnt.zzc(obj, iZzb, i + 1);
            return;
        }
        while (true) {
            int i4 = iZzb2 - 1;
            int i5 = iArrZzA[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrZzA[i4] = ((i + 1) & i2) | (i5 & (~i2));
                return;
            }
            iZzb2 = i6;
        }
    }

    final int zzm() {
        return isEmpty() ? -1 : 0;
    }

    final int zzn(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    zzfns(int i) {
        zze(8);
    }
}
