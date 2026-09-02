package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsa implements zzsh {
    private final zzsg zza;
    private final long zzb;
    private final long zzc;
    private final zzsm zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzsa(zzsm zzsmVar, long j, long j2, long j3, long j4, boolean z) {
        zzakt.zza(j >= 0 && j2 > j);
        this.zzd = zzsmVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzsg();
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void zzf(long j) {
        this.zzh = zzamq.zzy(j, 0L, this.zzf - 1);
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final /* bridge */ /* synthetic */ zzot zzg() {
        zzry zzryVar = null;
        if (this.zzf != 0) {
            return new zzrz(this, zzryVar);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // com.google.android.gms.internal.ads.zzsh
    public final long zze(zznv zznvVar) throws IOException {
        long j;
        long jZzy;
        int i = this.zze;
        if (i == 0) {
            long jZzn = zznvVar.zzn();
            this.zzg = jZzn;
            this.zze = 1;
            long j2 = this.zzc - 65307;
            if (j2 > jZzn) {
                return j2;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.zzi == this.zzj) {
                    j = -1;
                    jZzy = -1;
                } else {
                    long jZzn2 = zznvVar.zzn();
                    if (this.zza.zzb(zznvVar, this.zzj)) {
                        this.zza.zzc(zznvVar, false);
                        zznvVar.zzl();
                        long j3 = this.zzh;
                        zzsg zzsgVar = this.zza;
                        long j4 = zzsgVar.zzb;
                        long j5 = j3 - j4;
                        int i2 = zzsgVar.zzd + zzsgVar.zze;
                        if (j5 < 0 || j5 >= 72000) {
                            if (j5 < 0) {
                                this.zzj = jZzn2;
                                this.zzl = j4;
                            } else {
                                this.zzi = zznvVar.zzn() + ((long) i2);
                                this.zzk = this.zza.zzb;
                            }
                            long j6 = this.zzj;
                            long j7 = this.zzi;
                            if (j6 - j7 < 100000) {
                                this.zzj = j7;
                                j = -1;
                                jZzy = j7;
                            } else {
                                long j8 = i2;
                                long j9 = j5 <= 0 ? 2L : 1L;
                                long jZzn3 = zznvVar.zzn();
                                long j10 = this.zzj;
                                long j11 = this.zzi;
                                long j12 = (jZzn3 - (j8 * j9)) + ((j5 * (j10 - j11)) / (this.zzl - this.zzk));
                                j = -1;
                                jZzy = zzamq.zzy(j12, j11, j10 - 1);
                            }
                        } else {
                            j = -1;
                            jZzy = -1;
                        }
                    } else {
                        jZzy = this.zzi;
                        if (jZzy == jZzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j = -1;
                    }
                }
                if (jZzy != j) {
                    return jZzy;
                }
                this.zze = 3;
            } else {
                if (i != 3) {
                    return -1L;
                }
                j = -1;
            }
            while (true) {
                this.zza.zzb(zznvVar, j);
                this.zza.zzc(zznvVar, false);
                zzsg zzsgVar2 = this.zza;
                if (zzsgVar2.zzb > this.zzh) {
                    zznvVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                ((zznp) zznvVar).zzd(zzsgVar2.zzd + zzsgVar2.zze, false);
                this.zzi = zznvVar.zzn();
                this.zzk = this.zza.zzb;
                j = -1;
            }
        }
        this.zza.zza();
        if (!this.zza.zzb(zznvVar, -1L)) {
            throw new EOFException();
        }
        this.zza.zzc(zznvVar, false);
        zzsg zzsgVar3 = this.zza;
        ((zznp) zznvVar).zzd(zzsgVar3.zzd + zzsgVar3.zze, false);
        long j13 = this.zza.zzb;
        while (true) {
            zzsg zzsgVar4 = this.zza;
            if ((zzsgVar4.zza & 4) == 4 || !zzsgVar4.zzb(zznvVar, -1L) || zznvVar.zzn() >= this.zzc || !this.zza.zzc(zznvVar, true)) {
                break;
            }
            zzsg zzsgVar5 = this.zza;
            if (!zzny.zzd(zznvVar, zzsgVar5.zzd + zzsgVar5.zze)) {
                break;
            }
            j13 = this.zza.zzb;
        }
        this.zzf = j13;
        this.zze = 4;
        return this.zzg;
    }
}
