package com.google.android.gms.internal.play_billing;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;
import kotlin.UByte;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzat extends zzal {
    static final zzal zza = new zzat(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzat(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    static zzat zzg(int i, Object[] objArr, zzak zzakVar) {
        int iHighestOneBit;
        char c;
        char c2;
        int[] iArr;
        Object obj;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return (zzat) zza;
        }
        zzaj zzajVar = null;
        Object obj2 = null;
        zzaj zzajVar2 = null;
        zzaj zzajVar3 = null;
        int i3 = 1;
        if (i2 == 1) {
            zzad.zza(Objects.requireNonNull(objArrCopyOf[0]), Objects.requireNonNull(objArrCopyOf[1]));
            return new zzat(null, objArrCopyOf, 1);
        }
        zzaa.zzb(i2, objArrCopyOf.length >> 1, "index");
        int iMax = Math.max(i2, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = BasicMeasure.EXACTLY;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i2 == 1) {
            zzad.zza(Objects.requireNonNull(objArrCopyOf[0]), Objects.requireNonNull(objArrCopyOf[1]));
            i2 = 1;
            c2 = 2;
            c = 1;
        } else {
            int i4 = iHighestOneBit - 1;
            int i5 = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i6 = 0;
                int i7 = 0;
                while (i6 < i2) {
                    int i8 = i7 + i7;
                    int i9 = i6 + i6;
                    Object objRequireNonNull = Objects.requireNonNull(objArrCopyOf[i9]);
                    Object objRequireNonNull2 = Objects.requireNonNull(objArrCopyOf[i9 ^ i3]);
                    zzad.zza(objRequireNonNull, objRequireNonNull2);
                    int iZza = zzae.zza(objRequireNonNull.hashCode());
                    while (true) {
                        int i10 = iZza & i4;
                        int i11 = bArr[i10] & UByte.MAX_VALUE;
                        if (i11 == 255) {
                            bArr[i10] = (byte) i8;
                            if (i7 < i6) {
                                objArrCopyOf[i8] = objRequireNonNull;
                                objArrCopyOf[i8 ^ 1] = objRequireNonNull2;
                            }
                            i7++;
                            break;
                        }
                        if (objRequireNonNull.equals(objArrCopyOf[i11 == true ? 1 : 0])) {
                            int i12 = ~i11;
                            zzaj zzajVar4 = new zzaj(objRequireNonNull, objRequireNonNull2, Objects.requireNonNull(objArrCopyOf[i12 == true ? 1 : 0]));
                            objArrCopyOf[i12 == true ? 1 : 0] = objRequireNonNull2;
                            zzajVar2 = zzajVar4;
                            break;
                        }
                        iZza = i10 + 1;
                    }
                    i6++;
                    i3 = 1;
                }
                if (i7 == i2) {
                    iArr = bArr;
                } else {
                    c2 = 2;
                    obj = new Object[]{bArr, Integer.valueOf(i7), zzajVar2};
                }
                c = 1;
                obj2 = obj;
            } else if (iHighestOneBit <= 32768) {
                short[] sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i13 = 0;
                for (int i14 = 0; i14 < i2; i14++) {
                    int i15 = i13 + i13;
                    int i16 = i14 + i14;
                    Object objRequireNonNull3 = Objects.requireNonNull(objArrCopyOf[i16]);
                    Object objRequireNonNull4 = Objects.requireNonNull(objArrCopyOf[i16 ^ 1]);
                    zzad.zza(objRequireNonNull3, objRequireNonNull4);
                    int iZza2 = zzae.zza(objRequireNonNull3.hashCode());
                    while (true) {
                        int i17 = iZza2 & i4;
                        char c3 = (char) sArr[i17];
                        if (c3 == 65535) {
                            sArr[i17] = (short) i15;
                            if (i13 < i14) {
                                objArrCopyOf[i15] = objRequireNonNull3;
                                objArrCopyOf[i15 ^ 1] = objRequireNonNull4;
                            }
                            i13++;
                            break;
                        }
                        if (objRequireNonNull3.equals(objArrCopyOf[c3])) {
                            int i18 = c3 ^ 1;
                            zzaj zzajVar5 = new zzaj(objRequireNonNull3, objRequireNonNull4, Objects.requireNonNull(objArrCopyOf[i18 == true ? 1 : 0]));
                            objArrCopyOf[i18 == true ? 1 : 0] = objRequireNonNull4;
                            zzajVar3 = zzajVar5;
                            break;
                        }
                        iZza2 = i17 + 1;
                    }
                }
                if (i13 == i2) {
                    iArr = sArr;
                } else {
                    obj2 = new Object[]{sArr, Integer.valueOf(i13), zzajVar3};
                    c = 1;
                    c2 = 2;
                }
            } else {
                int i19 = 1;
                int[] iArr2 = new int[iHighestOneBit];
                Arrays.fill(iArr2, -1);
                int i20 = 0;
                int i21 = 0;
                while (i20 < i2) {
                    int i22 = i21 + i21;
                    int i23 = i20 + i20;
                    Object objRequireNonNull5 = Objects.requireNonNull(objArrCopyOf[i23]);
                    Object objRequireNonNull6 = Objects.requireNonNull(objArrCopyOf[i23 ^ i19]);
                    zzad.zza(objRequireNonNull5, objRequireNonNull6);
                    int iZza3 = zzae.zza(objRequireNonNull5.hashCode());
                    while (true) {
                        int i24 = iZza3 & i4;
                        int i25 = iArr2[i24];
                        if (i25 == i5) {
                            iArr2[i24] = i22;
                            if (i21 < i20) {
                                objArrCopyOf[i22] = objRequireNonNull5;
                                objArrCopyOf[i22 ^ 1] = objRequireNonNull6;
                            }
                            i21++;
                            break;
                        }
                        if (objRequireNonNull5.equals(objArrCopyOf[i25])) {
                            int i26 = i25 ^ 1;
                            zzaj zzajVar6 = new zzaj(objRequireNonNull5, objRequireNonNull6, Objects.requireNonNull(objArrCopyOf[i26]));
                            objArrCopyOf[i26] = objRequireNonNull6;
                            zzajVar = zzajVar6;
                            break;
                        }
                        iZza3 = i24 + 1;
                        i5 = -1;
                    }
                    i20++;
                    i19 = 1;
                    i5 = -1;
                }
                if (i21 == i2) {
                    iArr = iArr2;
                } else {
                    c = 1;
                    c2 = 2;
                    obj2 = new Object[]{iArr2, Integer.valueOf(i21), zzajVar};
                }
            }
            c2 = 2;
            obj = iArr;
            c = 1;
            obj2 = obj;
        }
        boolean z = obj2 instanceof Object[];
        Object obj3 = obj2;
        if (z) {
            Object[] objArr2 = (Object[]) obj2;
            zzaj zzajVar7 = (zzaj) objArr2[c2];
            if (zzakVar == null) {
                throw zzajVar7.zza();
            }
            zzakVar.zzc = zzajVar7;
            Object obj4 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj3 = obj4;
            i2 = iIntValue;
        }
        return new zzat(obj3, objArrCopyOf, i2);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.play_billing.zzal, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object objRequireNonNull;
        if (obj == null) {
            objRequireNonNull = null;
        } else {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i != 1) {
                Object obj2 = this.zzc;
                if (obj2 == null) {
                    objRequireNonNull = null;
                } else if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int iZza = zzae.zza(obj.hashCode());
                    while (true) {
                        int i2 = iZza & length;
                        int i3 = bArr[i2] & UByte.MAX_VALUE;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            objRequireNonNull = objArr[i3 ^ 1];
                        } else {
                            iZza = i2 + 1;
                        }
                    }
                    objRequireNonNull = null;
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzae.zza(obj.hashCode());
                    while (true) {
                        int i4 = iZza2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            objRequireNonNull = objArr[c ^ 1];
                        } else {
                            iZza2 = i4 + 1;
                        }
                    }
                    objRequireNonNull = null;
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzae.zza(obj.hashCode());
                    while (true) {
                        int i5 = iZza3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            objRequireNonNull = objArr[i6 ^ 1];
                        } else {
                            iZza3 = i5 + 1;
                        }
                    }
                    objRequireNonNull = null;
                }
            } else if (Objects.requireNonNull(objArr[0]).equals(obj)) {
                objRequireNonNull = Objects.requireNonNull(objArr[1]);
            } else {
                objRequireNonNull = null;
            }
        }
        if (objRequireNonNull == null) {
            return null;
        }
        return objRequireNonNull;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    final zzaf zza() {
        return new zzas(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    final zzam zzd() {
        return new zzaq(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    final zzam zze() {
        return new zzar(this, new zzas(this.zzb, 0, this.zzd));
    }
}
