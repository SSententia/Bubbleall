package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzin {
    private final zzamf zza = new zzamf(32);
    private zzim zzb;
    private zzim zzc;
    private zzim zzd;
    private long zze;
    private final zzko zzf;

    public zzin(zzko zzkoVar, byte[] bArr) {
        this.zzf = zzkoVar;
        zzim zzimVar = new zzim(0L, 65536);
        this.zzb = zzimVar;
        this.zzc = zzimVar;
        this.zzd = zzimVar;
    }

    private final int zzi(int i) {
        zzim zzimVar = this.zzd;
        if (!zzimVar.zzc) {
            zzkb zzkbVarZzc = this.zzf.zzc();
            zzim zzimVar2 = new zzim(this.zzd.zzb, 65536);
            zzimVar.zzd = zzkbVarZzc;
            zzimVar.zze = zzimVar2;
            zzimVar.zzc = true;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private final void zzj(int i) {
        long j = this.zze + ((long) i);
        this.zze = j;
        zzim zzimVar = this.zzd;
        if (j == zzimVar.zzb) {
            this.zzd = zzimVar.zze;
        }
    }

    private static zzim zzk(zzim zzimVar, zzaf zzafVar, zziq zziqVar, zzamf zzamfVar) {
        zzim zzimVarZzm;
        if (zzafVar.zzj()) {
            long j = zziqVar.zzb;
            int iZzo = 1;
            zzamfVar.zza(1);
            zzim zzimVarZzm2 = zzm(zzimVar, j, zzamfVar.zzi(), 1);
            long j2 = j + 1;
            byte b = zzamfVar.zzi()[0];
            int i = b & ByteCompanionObject.MIN_VALUE;
            int i2 = b & ByteCompanionObject.MAX_VALUE;
            zzac zzacVar = zzafVar.zza;
            byte[] bArr = zzacVar.zza;
            if (bArr == null) {
                zzacVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zzimVarZzm = zzm(zzimVarZzm2, j2, zzacVar.zza, i2);
            long j3 = j2 + ((long) i2);
            if (i != 0) {
                zzamfVar.zza(2);
                zzimVarZzm = zzm(zzimVarZzm, j3, zzamfVar.zzi(), 2);
                j3 += 2;
                iZzo = zzamfVar.zzo();
            }
            int i3 = iZzo;
            int[] iArr = zzacVar.zzc;
            if (iArr == null || iArr.length < i3) {
                iArr = new int[i3];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzacVar.zzd;
            if (iArr3 == null || iArr3.length < i3) {
                iArr3 = new int[i3];
            }
            int[] iArr4 = iArr3;
            if (i != 0) {
                int i4 = i3 * 6;
                zzamfVar.zza(i4);
                zzimVarZzm = zzm(zzimVarZzm, j3, zzamfVar.zzi(), i4);
                j3 += (long) i4;
                zzamfVar.zzh(0);
                for (int i5 = 0; i5 < i3; i5++) {
                    iArr2[i5] = zzamfVar.zzo();
                    iArr4[i5] = zzamfVar.zzB();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zziqVar.zza - ((int) (j3 - zziqVar.zzb));
            }
            zzow zzowVar = zziqVar.zzc;
            int i6 = zzamq.zza;
            zzacVar.zza(i3, iArr2, iArr4, zzowVar.zzb, zzacVar.zza, zzowVar.zza, zzowVar.zzc, zzowVar.zzd);
            long j4 = zziqVar.zzb;
            int i7 = (int) (j3 - j4);
            zziqVar.zzb = j4 + ((long) i7);
            zziqVar.zza -= i7;
        } else {
            zzimVarZzm = zzimVar;
        }
        if (!zzafVar.zze()) {
            zzafVar.zzi(zziqVar.zza);
            return zzl(zzimVarZzm, zziqVar.zzb, zzafVar.zzb, zziqVar.zza);
        }
        zzamfVar.zza(4);
        zzim zzimVarZzm3 = zzm(zzimVarZzm, zziqVar.zzb, zzamfVar.zzi(), 4);
        int iZzB = zzamfVar.zzB();
        zziqVar.zzb += 4;
        zziqVar.zza -= 4;
        zzafVar.zzi(iZzB);
        zzim zzimVarZzl = zzl(zzimVarZzm3, zziqVar.zzb, zzafVar.zzb, iZzB);
        zziqVar.zzb += (long) iZzB;
        int i8 = zziqVar.zza - iZzB;
        zziqVar.zza = i8;
        ByteBuffer byteBuffer = zzafVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            zzafVar.zze = ByteBuffer.allocate(i8);
        } else {
            zzafVar.zze.clear();
        }
        return zzl(zzimVarZzl, zziqVar.zzb, zzafVar.zze, zziqVar.zza);
    }

    private static zzim zzl(zzim zzimVar, long j, ByteBuffer byteBuffer, int i) {
        zzim zzimVarZzn = zzn(zzimVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (zzimVarZzn.zzb - j));
            byteBuffer.put(zzimVarZzn.zzd.zza, zzimVarZzn.zza(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == zzimVarZzn.zzb) {
                zzimVarZzn = zzimVarZzn.zze;
            }
        }
        return zzimVarZzn;
    }

    private static zzim zzm(zzim zzimVar, long j, byte[] bArr, int i) {
        zzim zzimVarZzn = zzn(zzimVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (zzimVarZzn.zzb - j));
            System.arraycopy(zzimVarZzn.zzd.zza, zzimVarZzn.zza(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == zzimVarZzn.zzb) {
                zzimVarZzn = zzimVarZzn.zze;
            }
        }
        return zzimVarZzn;
    }

    private static zzim zzn(zzim zzimVar, long j) {
        while (j >= zzimVar.zzb) {
            zzimVar = zzimVar.zze;
        }
        return zzimVar;
    }

    public final void zza() {
        zzim zzimVarZzb = this.zzb;
        if (zzimVarZzb.zzc) {
            zzim zzimVar = this.zzd;
            boolean z = zzimVar.zzc;
            int i = (z ? 1 : 0) + (((int) (zzimVar.zza - zzimVarZzb.zza)) / 65536);
            zzkb[] zzkbVarArr = new zzkb[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzkbVarArr[i2] = zzimVarZzb.zzd;
                zzimVarZzb = zzimVarZzb.zzb();
            }
            this.zzf.zze(zzkbVarArr);
        }
        zzim zzimVar2 = new zzim(0L, 65536);
        this.zzb = zzimVar2;
        this.zzc = zzimVar2;
        this.zzd = zzimVar2;
        this.zze = 0L;
        this.zzf.zzf();
    }

    public final void zzb() {
        this.zzc = this.zzb;
    }

    public final void zzc(zzaf zzafVar, zziq zziqVar) {
        this.zzc = zzk(this.zzc, zzafVar, zziqVar, this.zza);
    }

    public final void zzd(zzaf zzafVar, zziq zziqVar) {
        zzk(this.zzc, zzafVar, zziqVar, this.zza);
    }

    public final void zze(long j) {
        zzim zzimVar;
        if (j != -1) {
            while (true) {
                zzimVar = this.zzb;
                if (j < zzimVar.zzb) {
                    break;
                }
                this.zzf.zzd(zzimVar.zzd);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzimVar.zza) {
                this.zzc = zzimVar;
            }
        }
    }

    public final long zzf() {
        return this.zze;
    }

    public final int zzg(zzah zzahVar, int i, boolean z) throws IOException {
        int iZzi = zzi(i);
        zzim zzimVar = this.zzd;
        int iZzg = zzahVar.zzg(zzimVar.zzd.zza, zzimVar.zza(this.zze), iZzi);
        if (iZzg != -1) {
            zzj(iZzg);
            return iZzg;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzamf zzamfVar, int i) {
        while (i > 0) {
            int iZzi = zzi(i);
            zzim zzimVar = this.zzd;
            zzamfVar.zzm(zzimVar.zzd.zza, zzimVar.zza(this.zze), iZzi);
            i -= iZzi;
            zzj(iZzi);
        }
    }
}
