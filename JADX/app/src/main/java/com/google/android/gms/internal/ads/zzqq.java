package com.google.android.gms.internal.ads;

import androidx.media2.widget.Cea708CCParser;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqq implements zznu {
    public static final zzoa zza = zzqo.zza;
    private static final zzaju zzb = zzqp.zza;
    private final zzamf zzc;
    private final zzon zzd;
    private final zzoj zze;
    private final zzol zzf;
    private final zzox zzg;
    private zznx zzh;
    private zzox zzi;
    private zzox zzj;
    private int zzk;
    private zzaiv zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzqs zzq;
    private boolean zzr;

    public zzqq() {
        this(0);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0239  */
    /* JADX WARN: Code duplicated, block: B:113:0x0242  */
    /* JADX WARN: Code duplicated, block: B:117:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x011f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0143 A[LOOP:0: B:56:0x0104->B:69:0x0143, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0146 A[EDGE_INSN: B:70:0x0146->B:71:0x0147 BREAK  A[LOOP:0: B:56:0x0104->B:69:0x0143]] */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    /* JADX WARN: Code duplicated, block: B:79:0x015a  */
    /* JADX WARN: Code duplicated, block: B:80:0x015e  */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private final int zzf(zznv zznvVar) throws Throwable {
        int iZzx;
        int i;
        int i2;
        int i3;
        zzqu zzquVarZza;
        zzqs zzqsVarZzj;
        zzoj zzojVar;
        int i4;
        int i5;
        zzaiv zzaivVar;
        long jZzn;
        zzqn zzqnVarZza;
        int iZza;
        int i6;
        zzaiu zzaiuVarZzb;
        int iZza2;
        int i7;
        long jZzb;
        zzaiu zzaiuVarZzb2;
        zzakf zzakfVar;
        int iZzv;
        if (this.zzk == 0) {
            try {
                zzh(zznvVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzamf zzamfVar = new zzamf(this.zzd.zzc);
            zznp zznpVar = (zznp) zznvVar;
            zznpVar.zzh(zzamfVar.zzi(), 0, this.zzd.zzc, false);
            zzon zzonVar = this.zzd;
            int i8 = 21;
            if ((zzonVar.zza & 1) != 0) {
                if (zzonVar.zze != 1) {
                    i2 = 36;
                }
                if (zzamfVar.zze() >= i2 + 4) {
                    zzamfVar.zzh(i2);
                    iZzv = zzamfVar.zzv();
                    if (iZzv != 1483304551) {
                        i3 = iZzv;
                    } else if (iZzv == 1231971951) {
                        i3 = 1231971951;
                    } else if (zzamfVar.zze() >= 40) {
                        zzamfVar.zzh(36);
                        if (zzamfVar.zzv() == 1447187017) {
                            i3 = 1447187017;
                        } else {
                            i3 = 0;
                        }
                    } else {
                        i3 = 0;
                    }
                } else if (zzamfVar.zze() >= 40) {
                    zzamfVar.zzh(36);
                    if (zzamfVar.zzv() == 1447187017) {
                        i3 = 1447187017;
                    } else {
                        i3 = 0;
                    }
                } else {
                    i3 = 0;
                }
                if (i3 != 1483304551 || i3 == 1231971951) {
                    int i9 = i3;
                    zzquVarZza = zzqu.zza(zznvVar.zzo(), zznvVar.zzn(), this.zzd, zzamfVar);
                    if (zzquVarZza != null && !this.zze.zzb()) {
                        zznvVar.zzl();
                        zznpVar.zzj(i2 + Cea708CCParser.Const.CODE_C1_DLY, false);
                        zznpVar.zzh(this.zzc.zzi(), 0, 3, false);
                        this.zzc.zzh(0);
                        zzojVar = this.zze;
                        int iZzr = this.zzc.zzr();
                        i4 = iZzr >> 12;
                        i5 = iZzr & 4095;
                        if (i4 <= 0 || i5 > 0) {
                            zzojVar.zza = i4;
                            zzojVar.zzb = i5;
                        }
                    }
                    zznpVar.zzd(this.zzd.zzc, false);
                    if (zzquVarZza == null && !zzquVarZza.zze() && i9 == 1231971951) {
                        zzqsVarZzj = zzj(zznvVar, false);
                    } else {
                        zzqsVarZzj = zzquVarZza;
                    }
                } else if (i3 == 1447187017) {
                    zzqsVarZzj = zzqt.zza(zznvVar.zzo(), zznvVar.zzn(), this.zzd, zzamfVar);
                    zznpVar.zzd(this.zzd.zzc, false);
                } else {
                    zznvVar.zzl();
                    zzqsVarZzj = null;
                }
                zzaivVar = this.zzl;
                jZzn = zznvVar.zzn();
                if (zzaivVar != null) {
                    zzqnVarZza = null;
                    break;
                }
                iZza = zzaivVar.zza();
                i6 = 0;
                while (true) {
                    if (i6 < iZza) {
                        zzqnVarZza = null;
                        break;
                    }
                    zzaiuVarZzb = zzaivVar.zzb(i6);
                    if (zzaiuVarZzb instanceof zzakb) {
                        zzakb zzakbVar = (zzakb) zzaiuVarZzb;
                        iZza2 = zzaivVar.zza();
                        i7 = 0;
                        while (true) {
                            if (i7 < iZza2) {
                                jZzb = -9223372036854775807L;
                                break;
                            }
                            zzaiuVarZzb2 = zzaivVar.zzb(i7);
                            if (zzaiuVarZzb2 instanceof zzakf) {
                                zzakfVar = (zzakf) zzaiuVarZzb2;
                                if (zzakfVar.zzf.equals("TLEN")) {
                                    jZzb = zzadx.zzb(Long.parseLong(zzakfVar.zzb));
                                    break;
                                }
                            }
                            i7++;
                        }
                        zzqnVarZza = zzqn.zza(jZzn, zzakbVar, jZzb);
                        break;
                    }
                    i6++;
                }
                if (this.zzr) {
                    zzqsVarZzj = new zzqr();
                } else {
                    if (zzqnVarZza != null) {
                        zzqsVarZzj = zzqnVarZza;
                    } else if (zzqsVarZzj == null) {
                        zzqsVarZzj = null;
                    }
                    if (zzqsVarZzj != null) {
                        zzqsVarZzj.zze();
                    } else {
                        zzqsVarZzj = zzj(zznvVar, false);
                    }
                }
                this.zzq = zzqsVarZzj;
                this.zzh.zzD(zzqsVarZzj);
                zzox zzoxVar = this.zzj;
                zzaft zzaftVar = new zzaft();
                zzaftVar.zzN(this.zzd.zzb);
                zzaftVar.zzO(4096);
                zzaftVar.zzaa(this.zzd.zze);
                zzaftVar.zzab(this.zzd.zzd);
                zzaftVar.zzad(this.zze.zza);
                zzaftVar.zzae(this.zze.zzb);
                zzaftVar.zzL(this.zzl);
                zzoxVar.zzs(zzaftVar.zzah());
                this.zzo = zznvVar.zzn();
            } else if (zzonVar.zze == 1) {
                i8 = 13;
            }
            i2 = i8;
            if (zzamfVar.zze() >= i2 + 4) {
                zzamfVar.zzh(i2);
                iZzv = zzamfVar.zzv();
                if (iZzv != 1483304551) {
                    i3 = iZzv;
                } else if (iZzv == 1231971951) {
                    i3 = 1231971951;
                } else if (zzamfVar.zze() >= 40) {
                    zzamfVar.zzh(36);
                    if (zzamfVar.zzv() == 1447187017) {
                        i3 = 1447187017;
                    } else {
                        i3 = 0;
                    }
                } else {
                    i3 = 0;
                }
            } else if (zzamfVar.zze() >= 40) {
                zzamfVar.zzh(36);
                if (zzamfVar.zzv() == 1447187017) {
                    i3 = 1447187017;
                } else {
                    i3 = 0;
                }
            } else {
                i3 = 0;
            }
            if (i3 != 1483304551) {
                int i10 = i3;
                zzquVarZza = zzqu.zza(zznvVar.zzo(), zznvVar.zzn(), this.zzd, zzamfVar);
                if (zzquVarZza != null) {
                    zznvVar.zzl();
                    zznpVar.zzj(i2 + Cea708CCParser.Const.CODE_C1_DLY, false);
                    zznpVar.zzh(this.zzc.zzi(), 0, 3, false);
                    this.zzc.zzh(0);
                    zzojVar = this.zze;
                    int iZzr2 = this.zzc.zzr();
                    i4 = iZzr2 >> 12;
                    i5 = iZzr2 & 4095;
                    if (i4 <= 0) {
                        zzojVar.zza = i4;
                        zzojVar.zzb = i5;
                    } else {
                        zzojVar.zza = i4;
                        zzojVar.zzb = i5;
                    }
                }
                zznpVar.zzd(this.zzd.zzc, false);
                if (zzquVarZza == null) {
                    zzqsVarZzj = zzquVarZza;
                } else {
                    zzqsVarZzj = zzquVarZza;
                }
            } else {
                int i11 = i3;
                zzquVarZza = zzqu.zza(zznvVar.zzo(), zznvVar.zzn(), this.zzd, zzamfVar);
                if (zzquVarZza != null) {
                    zznvVar.zzl();
                    zznpVar.zzj(i2 + Cea708CCParser.Const.CODE_C1_DLY, false);
                    zznpVar.zzh(this.zzc.zzi(), 0, 3, false);
                    this.zzc.zzh(0);
                    zzojVar = this.zze;
                    int iZzr3 = this.zzc.zzr();
                    i4 = iZzr3 >> 12;
                    i5 = iZzr3 & 4095;
                    if (i4 <= 0) {
                        zzojVar.zza = i4;
                        zzojVar.zzb = i5;
                    } else {
                        zzojVar.zza = i4;
                        zzojVar.zzb = i5;
                    }
                }
                zznpVar.zzd(this.zzd.zzc, false);
                if (zzquVarZza == null) {
                    zzqsVarZzj = zzquVarZza;
                } else {
                    zzqsVarZzj = zzquVarZza;
                }
            }
            zzaivVar = this.zzl;
            jZzn = zznvVar.zzn();
            if (zzaivVar != null) {
                zzqnVarZza = null;
                break;
            }
            iZza = zzaivVar.zza();
            i6 = 0;
            while (true) {
                if (i6 < iZza) {
                    zzqnVarZza = null;
                    break;
                }
                zzaiuVarZzb = zzaivVar.zzb(i6);
                if (zzaiuVarZzb instanceof zzakb) {
                    zzakb zzakbVar2 = (zzakb) zzaiuVarZzb;
                    iZza2 = zzaivVar.zza();
                    i7 = 0;
                    while (true) {
                        if (i7 < iZza2) {
                            jZzb = -9223372036854775807L;
                            break;
                        }
                        zzaiuVarZzb2 = zzaivVar.zzb(i7);
                        if (zzaiuVarZzb2 instanceof zzakf) {
                            zzakfVar = (zzakf) zzaiuVarZzb2;
                            if (zzakfVar.zzf.equals("TLEN")) {
                                jZzb = zzadx.zzb(Long.parseLong(zzakfVar.zzb));
                                break;
                            }
                        }
                        i7++;
                    }
                    zzqnVarZza = zzqn.zza(jZzn, zzakbVar2, jZzb);
                    break;
                }
                i6++;
            }
            if (this.zzr) {
                zzqsVarZzj = new zzqr();
            } else {
                if (zzqnVarZza != null) {
                    zzqsVarZzj = zzqnVarZza;
                } else if (zzqsVarZzj == null) {
                    zzqsVarZzj = null;
                }
                if (zzqsVarZzj != null) {
                    zzqsVarZzj.zze();
                } else {
                    zzqsVarZzj = zzj(zznvVar, false);
                }
            }
            this.zzq = zzqsVarZzj;
            this.zzh.zzD(zzqsVarZzj);
            zzox zzoxVar2 = this.zzj;
            zzaft zzaftVar2 = new zzaft();
            zzaftVar2.zzN(this.zzd.zzb);
            zzaftVar2.zzO(4096);
            zzaftVar2.zzaa(this.zzd.zze);
            zzaftVar2.zzab(this.zzd.zzd);
            zzaftVar2.zzad(this.zze.zza);
            zzaftVar2.zzae(this.zze.zzb);
            zzaftVar2.zzL(this.zzl);
            zzoxVar2.zzs(zzaftVar2.zzah());
            this.zzo = zznvVar.zzn();
        } else if (this.zzo != 0) {
            long jZzn2 = zznvVar.zzn();
            long j = this.zzo;
            if (jZzn2 < j) {
                ((zznp) zznvVar).zzd((int) (j - jZzn2), false);
            }
        }
        int i12 = this.zzp;
        if (i12 == 0) {
            zznvVar.zzl();
            if (zzi(zznvVar)) {
                return -1;
            }
            this.zzc.zzh(0);
            int iZzv2 = this.zzc.zzv();
            if (!zzk(iZzv2, this.zzk) || zzoo.zzh(iZzv2) == -1) {
                ((zznp) zznvVar).zzd(1, false);
                this.zzk = 0;
            } else {
                this.zzd.zza(iZzv2);
                if (this.zzm == -9223372036854775807L) {
                    this.zzm = this.zzq.zzb(zznvVar.zzn());
                }
                zzon zzonVar2 = this.zzd;
                int i13 = zzonVar2.zzc;
                this.zzp = i13;
                zzqs zzqsVar = this.zzq;
                if (zzqsVar instanceof zzqm) {
                    zzg(this.zzn + ((long) zzonVar2.zzg));
                    throw null;
                }
                i12 = i13;
                iZzx = this.zzj.zzx(zznvVar, i12, true);
                if (iZzx == -1) {
                    return -1;
                }
                i = this.zzp - iZzx;
                this.zzp = i;
                if (i <= 0) {
                    this.zzj.zzv(zzg(this.zzn), 1, this.zzd.zzc, 0, null);
                    this.zzn += (long) this.zzd.zzg;
                    this.zzp = 0;
                    return 0;
                }
            }
        } else {
            iZzx = this.zzj.zzx(zznvVar, i12, true);
            if (iZzx == -1) {
                return -1;
            }
            i = this.zzp - iZzx;
            this.zzp = i;
            if (i <= 0) {
                this.zzj.zzv(zzg(this.zzn), 1, this.zzd.zzc, 0, null);
                this.zzn += (long) this.zzd.zzg;
                this.zzp = 0;
                return 0;
            }
        }
        return 0;
    }

    private final long zzg(long j) {
        return this.zzm + ((j * 1000000) / ((long) this.zzd.zzd));
    }

    private final boolean zzh(zznv zznvVar, boolean z) throws Throwable {
        int iZzm;
        int i;
        int iZzh;
        int i2 = true != z ? 131072 : 32768;
        zznvVar.zzl();
        if (zznvVar.zzn() == 0) {
            zzaiv zzaivVarZza = this.zzf.zza(zznvVar, null);
            this.zzl = zzaivVarZza;
            if (zzaivVarZza != null) {
                this.zze.zza(zzaivVarZza);
            }
            iZzm = (int) zznvVar.zzm();
            if (!z) {
                ((zznp) zznvVar).zzd(iZzm, false);
            }
            i = 0;
        } else {
            iZzm = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (zzi(zznvVar)) {
                if (i3 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.zzc.zzh(0);
            int iZzv = this.zzc.zzv();
            if ((i == 0 || zzk(iZzv, i)) && (iZzh = zzoo.zzh(iZzv)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.zzd.zza(iZzv);
                    i = iZzv;
                }
                ((zznp) zznvVar).zzj(iZzh - 4, false);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    throw zzaha.zzb("Searched too many bytes.", null);
                }
                if (z) {
                    zznvVar.zzl();
                    ((zznp) zznvVar).zzj(iZzm + i5, false);
                } else {
                    ((zznp) zznvVar).zzd(1, false);
                }
                i3 = 0;
                i4 = i5;
                i = 0;
            }
        }
        if (z) {
            ((zznp) zznvVar).zzd(iZzm + i4, false);
        } else {
            zznvVar.zzl();
        }
        this.zzk = i;
        return true;
    }

    private final boolean zzi(zznv zznvVar) throws IOException {
        zzqs zzqsVar = this.zzq;
        if (zzqsVar != null) {
            long jZzc = zzqsVar.zzc();
            if (jZzc != -1 && zznvVar.zzm() > jZzc - 4) {
                return true;
            }
        }
        try {
            return !zznvVar.zzh(this.zzc.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final zzqs zzj(zznv zznvVar, boolean z) throws IOException {
        ((zznp) zznvVar).zzh(this.zzc.zzi(), 0, 4, false);
        this.zzc.zzh(0);
        this.zzd.zza(this.zzc.zzv());
        return new zzql(zznvVar.zzo(), zznvVar.zzn(), this.zzd, false);
    }

    private static boolean zzk(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        return zzh(zznvVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzh = zznxVar;
        zzox zzoxVarZzB = zznxVar.zzB(0, 1);
        this.zzi = zzoxVarZzB;
        this.zzj = zzoxVarZzB;
        this.zzh.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws Throwable {
        zzakt.zze(this.zzi);
        int i = zzamq.zza;
        int iZzf = zzf(zznvVar);
        if (iZzf == -1 && (this.zzq instanceof zzqm)) {
            if (this.zzq.zzg() != zzg(this.zzn)) {
                throw null;
            }
        }
        return iZzf;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzqs zzqsVar = this.zzq;
        if (zzqsVar instanceof zzqm) {
            throw null;
        }
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzqq(int i) {
        this.zzc = new zzamf(10);
        this.zzd = new zzon();
        this.zze = new zzoj();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzol();
        zznt zzntVar = new zznt();
        this.zzg = zzntVar;
        this.zzj = zzntVar;
    }
}
