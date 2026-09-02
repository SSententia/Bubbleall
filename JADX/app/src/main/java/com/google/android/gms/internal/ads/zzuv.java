package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzuv implements zznu {
    public static final zzoa zza = zzur.zza;
    private zznx zzb;
    private zzox zzc;
    private zzut zzd;
    private int zze = -1;
    private long zzf = -1;

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        return zzuy.zza(zznvVar) != null;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzb = zznxVar;
        this.zzc = zznxVar.zzB(0, 1);
        zznxVar.zzC();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        int iZzO;
        int i;
        zzakt.zze(this.zzc);
        int i2 = zzamq.zza;
        if (this.zzd == null) {
            zzuw zzuwVarZza = zzuy.zza(zznvVar);
            if (zzuwVarZza == null) {
                throw zzaha.zzb("Unsupported or unrecognized wav header.", null);
            }
            int i3 = zzuwVarZza.zza;
            if (i3 == 17) {
                this.zzd = new zzus(this.zzb, this.zzc, zzuwVarZza);
            } else if (i3 == 6) {
                this.zzd = new zzuu(this.zzb, this.zzc, zzuwVarZza, "audio/g711-alaw", -1);
            } else if (i3 == 7) {
                this.zzd = new zzuu(this.zzb, this.zzc, zzuwVarZza, "audio/g711-mlaw", -1);
            } else {
                int i4 = zzuwVarZza.zze;
                if (i3 == 1) {
                    iZzO = zzamq.zzO(i4);
                    i = iZzO;
                } else {
                    if (i3 != 3) {
                        if (i3 == 65534) {
                            iZzO = zzamq.zzO(i4);
                            i = iZzO;
                        }
                    } else if (i4 == 32) {
                        iZzO = 4;
                        i = iZzO;
                    }
                    i = 0;
                }
                if (i == 0) {
                    int i5 = zzuwVarZza.zza;
                    StringBuilder sb = new StringBuilder(40);
                    sb.append("Unsupported WAV format type: ");
                    sb.append(i5);
                    throw zzaha.zzc(sb.toString());
                }
                this.zzd = new zzuu(this.zzb, this.zzc, zzuwVarZza, "audio/raw", i);
            }
        }
        if (this.zze == -1) {
            zznvVar.zzl();
            zzamf zzamfVar = new zzamf(8);
            zzux zzuxVarZza = zzux.zza(zznvVar, zzamfVar);
            while (true) {
                int i6 = zzuxVarZza.zza;
                if (i6 == 1684108385) {
                    ((zznp) zznvVar).zzd(8, false);
                    long jZzn = zznvVar.zzn();
                    long j = zzuxVarZza.zzb + jZzn;
                    long jZzo = zznvVar.zzo();
                    if (jZzo != -1 && j > jZzo) {
                        StringBuilder sb2 = new StringBuilder(69);
                        sb2.append("Data exceeds input length: ");
                        sb2.append(j);
                        sb2.append(", ");
                        sb2.append(jZzo);
                        Log.w("WavHeaderReader", sb2.toString());
                        j = jZzo;
                    }
                    Pair pairCreate = Pair.create(Long.valueOf(jZzn), Long.valueOf(j));
                    this.zze = ((Long) pairCreate.first).intValue();
                    long jLongValue = ((Long) pairCreate.second).longValue();
                    this.zzf = jLongValue;
                    this.zzd.zzb(this.zze, jLongValue);
                    break;
                }
                if (i6 != 1380533830 && i6 != 1718449184) {
                    StringBuilder sb3 = new StringBuilder(39);
                    sb3.append("Ignoring unknown WAV chunk: ");
                    sb3.append(i6);
                    Log.w("WavHeaderReader", sb3.toString());
                }
                long j2 = zzuxVarZza.zzb + 8;
                int i7 = zzuxVarZza.zza;
                if (i7 == 1380533830) {
                    j2 = 12;
                }
                if (j2 > 2147483647L) {
                    StringBuilder sb4 = new StringBuilder(51);
                    sb4.append("Chunk is too large (~2GB+) to skip; id: ");
                    sb4.append(i7);
                    throw zzaha.zzc(sb4.toString());
                }
                ((zznp) zznvVar).zzd((int) j2, false);
                zzuxVarZza = zzux.zza(zznvVar, zzamfVar);
            }
        } else if (zznvVar.zzn() == 0) {
            ((zznp) zznvVar).zzd(this.zze, false);
        }
        zzakt.zzd(this.zzf != -1);
        return this.zzd.zzc(zznvVar, this.zzf - zznvVar.zzn()) ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        zzut zzutVar = this.zzd;
        if (zzutVar != null) {
            zzutVar.zza(j2);
        }
    }
}
