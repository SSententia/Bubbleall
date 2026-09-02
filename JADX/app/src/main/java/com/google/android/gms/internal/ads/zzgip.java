package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgip {
    private static final zzgip zza = new zzgip(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgip() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgip(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzgip zza() {
        return zza;
    }

    static zzgip zzb() {
        return new zzgip(0, new int[8], new Object[8], true);
    }

    static zzgip zzc(zzgip zzgipVar, zzgip zzgipVar2) {
        int i = zzgipVar.zzb + zzgipVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgipVar.zzc, i);
        System.arraycopy(zzgipVar2.zzc, 0, iArrCopyOf, zzgipVar.zzb, zzgipVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgipVar.zzd, i);
        System.arraycopy(zzgipVar2.zzd, 0, objArrCopyOf, zzgipVar.zzb, zzgipVar2.zzb);
        return new zzgip(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgip)) {
            return false;
        }
        zzgip zzgipVar = (zzgip) obj;
        int i = this.zzb;
        if (i == zzgipVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgipVar.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzgipVar.zzd;
            int i3 = this.zzb;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final void zzd() {
        this.zzf = false;
    }

    public final int zze() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzx = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            zzgex zzgexVar = (zzgex) this.zzd[i2];
            int iZzx2 = zzgfh.zzx(8);
            int iZzc = zzgexVar.zzc();
            iZzx += iZzx2 + iZzx2 + zzgfh.zzx(16) + zzgfh.zzx(i3 >>> 3) + zzgfh.zzx(24) + zzgfh.zzx(iZzc) + iZzc;
        }
        this.zze = iZzx;
        return iZzx;
    }

    public final int zzf() {
        int iZzx;
        int iZzy;
        int iZzx2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzx3 = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        zzgex zzgexVar = (zzgex) this.zzd[i2];
                        int iZzx4 = zzgfh.zzx(i4 << 3);
                        int iZzc = zzgexVar.zzc();
                        iZzx3 += iZzx4 + zzgfh.zzx(iZzc) + iZzc;
                    } else if (i5 == 3) {
                        int iZzv = zzgfh.zzv(i4);
                        iZzx = iZzv + iZzv;
                        iZzy = ((zzgip) this.zzd[i2]).zzf();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(zzggm.zzi());
                        }
                        ((Integer) this.zzd[i2]).intValue();
                        iZzx2 = zzgfh.zzx(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i2]).longValue();
                    iZzx2 = zzgfh.zzx(i4 << 3) + 8;
                }
                iZzx3 += iZzx2;
            } else {
                long jLongValue = ((Long) this.zzd[i2]).longValue();
                iZzx = zzgfh.zzx(i4 << 3);
                iZzy = zzgfh.zzy(jLongValue);
            }
            iZzx2 = iZzx + iZzy;
            iZzx3 += iZzx2;
        }
        this.zze = iZzx3;
        return iZzx3;
    }

    final void zzg(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzghk.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzh(int i, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.zzb;
        int[] iArr = this.zzc;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.zzc = Arrays.copyOf(iArr, i3);
            this.zzd = Arrays.copyOf(this.zzd, i3);
        }
        int[] iArr2 = this.zzc;
        int i4 = this.zzb;
        iArr2[i4] = i;
        this.zzd[i4] = obj;
        this.zzb = i4 + 1;
    }

    public final void zzi(zzgfi zzgfiVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zzgfiVar.zzc(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzgfiVar.zzj(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzgfiVar.zzn(i3, (zzgex) obj);
                } else if (i4 == 3) {
                    zzgfiVar.zzt(i3);
                    ((zzgip) obj).zzi(zzgfiVar);
                    zzgfiVar.zzu(i3);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(zzggm.zzi());
                    }
                    zzgfiVar.zzk(i3, ((Integer) obj).intValue());
                }
            }
        }
    }
}
