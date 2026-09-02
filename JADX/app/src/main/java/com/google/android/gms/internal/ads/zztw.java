package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zztw {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzamn zza = new zzamn(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzamf zzb = new zzamf();

    zztw() {
    }

    public static long zze(zzamf zzamfVar) {
        int iZzg = zzamfVar.zzg();
        if (zzamfVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzamfVar.zzm(bArr, 0, 9);
        zzamfVar.zzh(iZzg);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((((long) bArr[1]) & 255) << 20) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    private final int zzf(zznv zznvVar) {
        zzamf zzamfVar = this.zzb;
        byte[] bArr = zzamq.zzf;
        int length = bArr.length;
        zzamfVar.zzb(bArr, 0);
        this.zzc = true;
        zznvVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzamn zzb() {
        return this.zza;
    }

    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zznvVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j2 = jZzo - ((long) iMin);
            if (zznvVar.zzn() != j2) {
                zzoqVar.zza = j2;
                return 1;
            }
            this.zzb.zza(iMin);
            zznvVar.zzl();
            ((zznp) zznvVar).zzh(this.zzb.zzi(), 0, iMin, false);
            zzamf zzamfVar = this.zzb;
            int iZzg = zzamfVar.zzg();
            for (int iZze = zzamfVar.zze() - 4; iZze >= iZzg; iZze--) {
                if (zzg(zzamfVar.zzi(), iZze) == 442) {
                    zzamfVar.zzh(iZze + 4);
                    long jZze = zze(zzamfVar);
                    if (jZze != -9223372036854775807L) {
                        j = jZze;
                        break;
                    }
                }
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zznvVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zznvVar);
                return 0;
            }
            long jZze2 = this.zza.zze(this.zzg) - this.zza.zze(j3);
            this.zzh = jZze2;
            if (jZze2 < 0) {
                StringBuilder sb = new StringBuilder(65);
                sb.append("Invalid duration: ");
                sb.append(jZze2);
                sb.append(". Using TIME_UNSET instead.");
                Log.w("PsDurationReader", sb.toString());
                this.zzh = -9223372036854775807L;
            }
            zzf(zznvVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zznvVar.zzo());
        if (zznvVar.zzn() != 0) {
            zzoqVar.zza = 0L;
            return 1;
        }
        this.zzb.zza(iMin2);
        zznvVar.zzl();
        ((zznp) zznvVar).zzh(this.zzb.zzi(), 0, iMin2, false);
        zzamf zzamfVar2 = this.zzb;
        int iZze2 = zzamfVar2.zze();
        for (int iZzg2 = zzamfVar2.zzg(); iZzg2 < iZze2 - 3; iZzg2++) {
            if (zzg(zzamfVar2.zzi(), iZzg2) == 442) {
                zzamfVar2.zzh(iZzg2 + 4);
                long jZze3 = zze(zzamfVar2);
                if (jZze3 != -9223372036854775807L) {
                    j = jZze3;
                    break;
                }
            }
        }
        this.zzf = j;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
