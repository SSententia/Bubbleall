package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfqc<K, V> extends zzfon<K, V> {
    static final zzfon<Object, Object> zza = new zzfqc(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzfqc(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    static <K, V> zzfqc<K, V> zzh(int i, Object[] objArr) {
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            return (zzfqc) zza;
        }
        ?? r0 = 0;
        int i5 = 0;
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            Object obj2 = objArr[1];
            obj2.getClass();
            zzfni.zza(obj, obj2);
            return new zzfqc<>(null, objArr, 1);
        }
        zzflx.zzf(i, objArr.length >> 1, "index");
        int iZzl = zzfot.zzl(i);
        if (i == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            Object obj4 = objArr[1];
            obj4.getClass();
            zzfni.zza(obj3, obj4);
        } else {
            int i6 = iZzl - 1;
            if (iZzl <= 128) {
                bArr = new byte[iZzl];
                Arrays.fill(bArr, (byte) -1);
                while (i5 < i) {
                    int i7 = i5 + i5;
                    Object obj5 = objArr[i7];
                    obj5.getClass();
                    Object obj6 = objArr[i7 ^ 1];
                    obj6.getClass();
                    zzfni.zza(obj5, obj6);
                    int iZza = zzfob.zza(obj5.hashCode());
                    while (true) {
                        i4 = iZza & i6;
                        int i8 = bArr[i4] & 255;
                        if (i8 == 255) {
                            break;
                        }
                        if (obj5.equals(objArr[i8])) {
                            throw zzi(obj5, obj6, objArr, i8);
                        }
                        iZza = i4 + 1;
                    }
                    bArr[i4] = (byte) i7;
                    i5++;
                }
            } else if (iZzl <= 32768) {
                bArr = new short[iZzl];
                Arrays.fill(bArr, (short) -1);
                while (i5 < i) {
                    int i9 = i5 + i5;
                    Object obj7 = objArr[i9];
                    obj7.getClass();
                    Object obj8 = objArr[i9 ^ 1];
                    obj8.getClass();
                    zzfni.zza(obj7, obj8);
                    int iZza2 = zzfob.zza(obj7.hashCode());
                    while (true) {
                        i3 = iZza2 & i6;
                        char c = (char) bArr[i3];
                        if (c == 65535) {
                            break;
                        }
                        if (obj7.equals(objArr[c])) {
                            throw zzi(obj7, obj8, objArr, c);
                        }
                        iZza2 = i3 + 1;
                    }
                    bArr[i3] = (short) i9;
                    i5++;
                }
            } else {
                bArr = new int[iZzl];
                Arrays.fill((int[]) bArr, -1);
                while (i5 < i) {
                    int i10 = i5 + i5;
                    Object obj9 = objArr[i10];
                    obj9.getClass();
                    Object obj10 = objArr[i10 ^ 1];
                    obj10.getClass();
                    zzfni.zza(obj9, obj10);
                    int iZza3 = zzfob.zza(obj9.hashCode());
                    while (true) {
                        i2 = iZza3 & i6;
                        ?? r8 = bArr[i2];
                        if (r8 == -1) {
                            break;
                        }
                        if (obj9.equals(objArr[r8])) {
                            throw zzi(obj9, obj10, objArr, r8);
                        }
                        iZza3 = i2 + 1;
                    }
                    bArr[i2] = i10;
                    i5++;
                }
            }
            r0 = bArr;
        }
        return new zzfqc<>(r0, objArr, i);
    }

    private static IllegalArgumentException zzi(Object obj, Object obj2, Object[] objArr, int i) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(objArr[i]);
        String strValueOf4 = String.valueOf(objArr[i ^ 1]);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0038->B:21:0x004e], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0063->B:31:0x007a], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0089->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.ads.zzfon, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        V v;
        Object obj2 = this.zzc;
        Object[] objArr = this.zzb;
        int i = this.zzd;
        if (obj == null) {
            v = null;
        } else if (i == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                v = (V) objArr[1];
                v.getClass();
            } else {
                v = null;
            }
        } else if (obj2 == null) {
            v = null;
        } else if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int iZza = zzfob.zza(obj.hashCode());
            while (true) {
                int i2 = iZza & length;
                int i3 = bArr[i2] & UByte.MAX_VALUE;
                if (i3 == 255) {
                    break;
                }
                if (obj.equals(objArr[i3])) {
                    v = (V) objArr[i3 ^ 1];
                } else {
                    iZza = i2 + 1;
                }
            }
            v = null;
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int iZza2 = zzfob.zza(obj.hashCode());
            while (true) {
                int i4 = iZza2 & length2;
                char c = (char) sArr[i4];
                if (c == 65535) {
                    break;
                }
                if (obj.equals(objArr[c])) {
                    v = (V) objArr[c ^ 1];
                } else {
                    iZza2 = i4 + 1;
                }
            }
            v = null;
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int iZza3 = zzfob.zza(obj.hashCode());
            while (true) {
                int i5 = iZza3 & length3;
                int i6 = iArr[i5];
                if (i6 == -1) {
                    break;
                }
                if (obj.equals(objArr[i6])) {
                    v = (V) objArr[i6 ^ 1];
                } else {
                    iZza3 = i5 + 1;
                }
            }
            v = null;
        }
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfon
    final zzfot<Map.Entry<K, V>> zzd() {
        return new zzfpz(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfon
    final zzfot<K> zze() {
        return new zzfqa(this, new zzfqb(this.zzb, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfon
    final zzfoe<V> zzg() {
        return new zzfqb(this.zzb, 1, this.zzd);
    }
}
