package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzuf {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzamn zza = new zzamn(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzamf zzb = new zzamf();

    zzuf(int i) {
    }

    private final int zze(zznv zznvVar) {
        zzamf zzamfVar = this.zzb;
        byte[] bArr = zzamq.zzf;
        int length = bArr.length;
        zzamfVar.zzb(bArr, 0);
        this.zzc = true;
        zznvVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zznv zznvVar, zzoq zzoqVar, int i) throws IOException {
        if (i <= 0) {
            zze(zznvVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zznvVar.zzo();
            int iMin = (int) Math.min(112800L, jZzo);
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
            int iZze = zzamfVar.zze();
            for (int i2 = iZze - 188; i2 >= iZzg; i2--) {
                byte[] bArrZzi = zzamfVar.zzi();
                int i3 = 0;
                for (int i4 = -4; i4 <= 4; i4++) {
                    int i5 = (i4 * 188) + i2;
                    if (i5 >= iZzg && i5 < iZze && bArrZzi[i5] == 71) {
                        i3++;
                        if (i3 == 5) {
                            long jZzb = zzup.zzb(zzamfVar, i2, i);
                            if (jZzb == -9223372036854775807L) {
                                break;
                            }
                            j = jZzb;
                            break;
                        }
                    } else {
                        i3 = 0;
                    }
                }
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zze(zznvVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zznvVar);
                return 0;
            }
            long jZze = this.zza.zze(this.zzg) - this.zza.zze(j3);
            this.zzh = jZze;
            if (jZze < 0) {
                StringBuilder sb = new StringBuilder(65);
                sb.append("Invalid duration: ");
                sb.append(jZze);
                sb.append(". Using TIME_UNSET instead.");
                Log.w("TsDurationReader", sb.toString());
                this.zzh = -9223372036854775807L;
            }
            zze(zznvVar);
            return 0;
        }
        int iMin2 = (int) Math.min(112800L, zznvVar.zzo());
        if (zznvVar.zzn() != 0) {
            zzoqVar.zza = 0L;
            return 1;
        }
        this.zzb.zza(iMin2);
        zznvVar.zzl();
        ((zznp) zznvVar).zzh(this.zzb.zzi(), 0, iMin2, false);
        zzamf zzamfVar2 = this.zzb;
        int iZze2 = zzamfVar2.zze();
        for (int iZzg2 = zzamfVar2.zzg(); iZzg2 < iZze2; iZzg2++) {
            if (zzamfVar2.zzi()[iZzg2] == 71) {
                long jZzb2 = zzup.zzb(zzamfVar2, iZzg2, i);
                if (jZzb2 != -9223372036854775807L) {
                    j = jZzb2;
                    break;
                }
            }
        }
        this.zzf = j;
        this.zzd = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzamn zzd() {
        return this.zza;
    }
}
