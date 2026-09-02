package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzps implements zznu {
    private zznx zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzakn zzg;
    private zznv zzh;
    private zzpv zzi;
    private zzrp zzj;
    private final zzamf zza = new zzamf(6);
    private long zzf = -1;

    private final int zze(zznv zznvVar) throws IOException {
        this.zza.zza(2);
        ((zznp) zznvVar).zzh(this.zza.zzi(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzaiu[0]);
        zznx zznxVar = this.zzb;
        zznxVar.getClass();
        zznxVar.zzC();
        this.zzb.zzD(new zzos(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        if (zze(zznvVar) != 65496) {
            return false;
        }
        int iZze = zze(zznvVar);
        this.zzd = iZze;
        if (iZze == 65504) {
            this.zza.zza(2);
            zznp zznpVar = (zznp) zznvVar;
            zznpVar.zzh(this.zza.zzi(), 0, 2, false);
            zznpVar.zzj(this.zza.zzo() - 2, false);
            iZze = zze(zznvVar);
            this.zzd = iZze;
        }
        if (iZze == 65505) {
            zznp zznpVar2 = (zznp) zznvVar;
            zznpVar2.zzj(2, false);
            this.zza.zza(6);
            zznpVar2.zzh(this.zza.zzi(), 0, 6, false);
            if (this.zza.zzt() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzb = zznxVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        int i;
        String strZzG;
        zzpu zzpuVarZza;
        zzakn zzaknVar;
        long j;
        int i2 = this.zzc;
        if (i2 == 0) {
            this.zza.zza(2);
            ((zznp) zznvVar).zza(this.zza.zzi(), 0, 2, false);
            int iZzo = this.zza.zzo();
            this.zzd = iZzo;
            if (iZzo == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzf();
                return 0;
            }
            if ((iZzo >= 65488 && iZzo <= 65497) || iZzo == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i2 == 1) {
            this.zza.zza(2);
            ((zznp) zznvVar).zza(this.zza.zzi(), 0, 2, false);
            this.zze = this.zza.zzo() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zznvVar != this.zzh) {
                    this.zzh = zznvVar;
                    this.zzi = new zzpv(zznvVar, this.zzf);
                }
                zzrp zzrpVar = this.zzj;
                zzrpVar.getClass();
                int iZzc = zzrpVar.zzc(this.zzi, zzoqVar);
                if (iZzc == 1) {
                    zzoqVar.zza += this.zzf;
                }
                return iZzc;
            }
            long jZzn = zznvVar.zzn();
            long j2 = this.zzf;
            if (jZzn != j2) {
                zzoqVar.zza = j2;
                return 1;
            }
            if (zznvVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zznvVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzrp(0);
                }
                zzpv zzpvVar = new zzpv(zznvVar, this.zzf);
                this.zzi = zzpvVar;
                if (this.zzj.zza(zzpvVar)) {
                    zzrp zzrpVar2 = this.zzj;
                    long j3 = this.zzf;
                    zznx zznxVar = this.zzb;
                    zznxVar.getClass();
                    zzrpVar2.zzb(new zzpx(j3, zznxVar));
                    zzakn zzaknVar2 = this.zzg;
                    zzaknVar2.getClass();
                    zzg(zzaknVar2);
                    this.zzc = 5;
                } else {
                    zzf();
                }
            } else {
                zzf();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzamf zzamfVar = new zzamf(this.zze);
            ((zznp) zznvVar).zza(zzamfVar.zzi(), 0, this.zze, false);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzamfVar.zzG((char) 0)) && (strZzG = zzamfVar.zzG((char) 0)) != null) {
                long jZzo = zznvVar.zzo();
                if (jZzo == -1 || (zzpuVarZza = zzpy.zza(strZzG)) == null || zzpuVarZza.zzb.size() < 2) {
                    zzaknVar = null;
                } else {
                    long j4 = -1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    boolean zEquals = false;
                    for (int size = zzpuVarZza.zzb.size() - 1; size >= 0; size--) {
                        zzpt zzptVar = zzpuVarZza.zzb.get(size);
                        zEquals |= "video/mp4".equals(zzptVar.zza);
                        if (size == 0) {
                            jZzo -= zzptVar.zzd;
                            j = 0;
                        } else {
                            j = jZzo - zzptVar.zzc;
                        }
                        long j8 = jZzo;
                        jZzo = j;
                        if (zEquals && jZzo != j8) {
                            j7 = j8 - jZzo;
                            j6 = jZzo;
                            zEquals = false;
                        }
                        if (size == 0) {
                            j5 = j8;
                        }
                        if (size == 0) {
                            j4 = jZzo;
                        }
                    }
                    if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
                        zzaknVar = null;
                    } else {
                        zzaknVar = new zzakn(j4, j5, zzpuVarZza.zza, j6, j7);
                    }
                }
                this.zzg = zzaknVar;
                if (zzaknVar != null) {
                    this.zzf = zzaknVar.zzd;
                }
                i = 0;
            } else {
                i = 0;
            }
        } else {
            i = 0;
            ((zznp) zznvVar).zzd(this.zze, false);
        }
        this.zzc = i;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzrp zzrpVar = this.zzj;
            zzrpVar.getClass();
            zzrpVar.zzd(j, j2);
        }
    }

    private final void zzg(zzaiu... zzaiuVarArr) {
        zznx zznxVar = this.zzb;
        zznxVar.getClass();
        zzox zzoxVarZzB = zznxVar.zzB(1024, 4);
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzM("image/jpeg");
        zzaftVar.zzL(new zzaiv(zzaiuVarArr));
        zzoxVarZzB.zzs(zzaftVar.zzah());
    }
}
