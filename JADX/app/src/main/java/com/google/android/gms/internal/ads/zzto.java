package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzto implements zztb {
    private final String zza;
    private final zzamf zzb;
    private final zzame zzc;
    private zzox zzd;
    private String zze;
    private zzafv zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzto(String str) {
        this.zza = str;
        zzamf zzamfVar = new zzamf(1024);
        this.zzb = zzamfVar;
        byte[] bArrZzi = zzamfVar.zzi();
        this.zzc = new zzame(bArrZzi, bArrZzi.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzame zzameVar) throws zzaha {
        int iZzb = zzameVar.zzb();
        zzmv zzmvVarZzb = zzmx.zzb(zzameVar, true);
        this.zzu = zzmvVarZzb.zzc;
        this.zzr = zzmvVarZzb.zza;
        this.zzt = zzmvVarZzb.zzb;
        return iZzb - zzameVar.zzb();
    }

    private static long zzg(zzame zzameVar) {
        return zzameVar.zzh((zzameVar.zzh(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzd = zznxVar.zzB(zzunVar.zzb(), 1);
        this.zze = zzunVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzd(zzamf zzamfVar) throws zzaha {
        int i;
        int i2;
        int iZzh;
        boolean zZzg;
        zzakt.zze(this.zzd);
        while (zzamfVar.zzd() > 0) {
            int i3 = this.zzg;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iZzn = zzamfVar.zzn();
                    if ((iZzn & 224) == 224) {
                        this.zzj = iZzn;
                        this.zzg = 2;
                    } else if (iZzn != 86) {
                        this.zzg = 0;
                    }
                } else if (i3 != 2) {
                    int iMin = Math.min(zzamfVar.zzd(), this.zzi - this.zzh);
                    zzamfVar.zzm(this.zzc.zza, this.zzh, iMin);
                    int i4 = this.zzh + iMin;
                    this.zzh = i4;
                    if (i4 == this.zzi) {
                        this.zzc.zzd(0);
                        zzame zzameVar = this.zzc;
                        if (zzameVar.zzg()) {
                            if (this.zzl) {
                            }
                            this.zzg = 0;
                        } else {
                            this.zzl = true;
                            int iZzh2 = zzameVar.zzh(1);
                            if (iZzh2 == 1) {
                                iZzh = zzameVar.zzh(1);
                                i2 = 1;
                            } else {
                                i2 = iZzh2;
                                iZzh = 0;
                            }
                            this.zzm = iZzh;
                            if (iZzh != 0) {
                                throw zzaha.zzb(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzameVar);
                                i2 = 1;
                            }
                            if (!zzameVar.zzg()) {
                                throw zzaha.zzb(null, null);
                            }
                            this.zzn = zzameVar.zzh(6);
                            int iZzh3 = zzameVar.zzh(4);
                            int iZzh4 = zzameVar.zzh(3);
                            if (iZzh3 != 0 || iZzh4 != 0) {
                                throw zzaha.zzb(null, null);
                            }
                            if (i2 == 0) {
                                int iZzc = zzameVar.zzc();
                                int iZzf = zzf(zzameVar);
                                zzameVar.zzd(iZzc);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzameVar.zzi(bArr, 0, iZzf);
                                zzaft zzaftVar = new zzaft();
                                zzaftVar.zzD(this.zze);
                                zzaftVar.zzN("audio/mp4a-latm");
                                zzaftVar.zzK(this.zzu);
                                zzaftVar.zzaa(this.zzt);
                                zzaftVar.zzab(this.zzr);
                                zzaftVar.zzP(Collections.singletonList(bArr));
                                zzaftVar.zzG(this.zza);
                                zzafv zzafvVarZzah = zzaftVar.zzah();
                                if (!zzafvVarZzah.equals(this.zzf)) {
                                    this.zzf = zzafvVarZzah;
                                    this.zzs = 1024000000 / ((long) zzafvVarZzah.zzz);
                                    this.zzd.zzs(zzafvVarZzah);
                                }
                            } else {
                                zzameVar.zzf(((int) zzg(zzameVar)) - zzf(zzameVar));
                            }
                            int iZzh5 = zzameVar.zzh(3);
                            this.zzo = iZzh5;
                            if (iZzh5 == 0) {
                                zzameVar.zzf(8);
                            } else if (iZzh5 == 1) {
                                zzameVar.zzf(9);
                            } else if (iZzh5 == 3 || iZzh5 == 4 || iZzh5 == 5) {
                                zzameVar.zzf(6);
                            } else {
                                if (iZzh5 != 6 && iZzh5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzameVar.zzf(1);
                            }
                            boolean zZzg2 = zzameVar.zzg();
                            this.zzp = zZzg2;
                            this.zzq = 0L;
                            if (zZzg2) {
                                if (i2 != 1) {
                                    do {
                                        zZzg = zzameVar.zzg();
                                        this.zzq = (this.zzq << 8) + ((long) zzameVar.zzh(8));
                                    } while (zZzg);
                                } else {
                                    this.zzq = zzg(zzameVar);
                                }
                            }
                            if (zzameVar.zzg()) {
                                zzameVar.zzf(8);
                            }
                        }
                        if (this.zzm != 0) {
                            throw zzaha.zzb(null, null);
                        }
                        if (this.zzn != 0) {
                            throw zzaha.zzb(null, null);
                        }
                        if (this.zzo != 0) {
                            throw zzaha.zzb(null, null);
                        }
                        int i5 = 0;
                        while (true) {
                            int iZzh6 = zzameVar.zzh(8);
                            i = i5 + iZzh6;
                            if (iZzh6 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iZzc2 = zzameVar.zzc();
                        if ((iZzc2 & 7) == 0) {
                            this.zzb.zzh(iZzc2 >> 3);
                        } else {
                            zzameVar.zzi(this.zzb.zzi(), 0, i * 8);
                            this.zzb.zzh(0);
                        }
                        zzov.zzb(this.zzd, this.zzb, i);
                        long j = this.zzk;
                        if (j != -9223372036854775807L) {
                            this.zzd.zzv(j, 1, i, 0, null);
                            this.zzk += this.zzs;
                        }
                        if (this.zzp) {
                            zzameVar.zzf((int) this.zzq);
                        }
                        this.zzg = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzn2 = ((this.zzj & (-225)) << 8) | zzamfVar.zzn();
                    this.zzi = iZzn2;
                    if (iZzn2 > this.zzb.zzi().length) {
                        this.zzb.zza(this.zzi);
                        zzame zzameVar2 = this.zzc;
                        byte[] bArrZzi = this.zzb.zzi();
                        zzameVar2.zza(bArrZzi, bArrZzi.length);
                    }
                    this.zzh = 0;
                    this.zzg = 3;
                }
            } else if (zzamfVar.zzn() == 86) {
                this.zzg = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }
}
