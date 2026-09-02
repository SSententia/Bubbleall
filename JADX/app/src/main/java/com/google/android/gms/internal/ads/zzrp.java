package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrp implements zznu, zzot {
    public static final zzoa zza = zzrn.zza;
    private final zzamf zzb;
    private final zzamf zzc;
    private final zzamf zzd;
    private final zzamf zze;
    private final ArrayDeque<zzqv> zzf;
    private final zzrs zzg;
    private final List<zzaiu> zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzamf zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zznx zzr;
    private zzro[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzakn zzx;

    public zzrp() {
        this(0);
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzi(long j) throws zzaha {
        zzrp zzrpVar;
        zzaiv zzaivVar;
        zzaiv zzaivVar2;
        long j2;
        zzrp zzrpVar2;
        zzaiv zzaivVar3;
        char c;
        int i;
        zzrp zzrpVar3 = this;
        while (!zzrpVar3.zzf.isEmpty() && zzrpVar3.zzf.peek().zza == j) {
            zzqv zzqvVarPop = zzrpVar3.zzf.pop();
            if (zzqvVarPop.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = zzrpVar3.zzw == 1;
                zzoj zzojVar = new zzoj();
                zzqw zzqwVarZzc = zzqvVarPop.zzc(1969517665);
                if (zzqwVarZzc != null) {
                    Pair<zzaiv, zzaiv> pairZzb = zzre.zzb(zzqwVarZzc);
                    zzaiv zzaivVar4 = (zzaiv) pairZzb.first;
                    zzaiv zzaivVar5 = (zzaiv) pairZzb.second;
                    if (zzaivVar4 != null) {
                        zzojVar.zza(zzaivVar4);
                    }
                    zzaivVar = zzaivVar5;
                    zzaivVar2 = zzaivVar4;
                } else {
                    zzaivVar = null;
                    zzaivVar2 = null;
                }
                zzqv zzqvVarZzd = zzqvVarPop.zzd(1835365473);
                zzaiv zzaivVarZzc = zzqvVarZzd != null ? zzre.zzc(zzqvVarZzd) : null;
                List<zzrx> listZza = zzre.zza(zzqvVarPop, zzojVar, -9223372036854775807L, null, false, z, zzrm.zza);
                zznx zznxVar = zzrpVar3.zzr;
                zznxVar.getClass();
                int size = listZza.size();
                long j3 = -9223372036854775807L;
                long j4 = -9223372036854775807L;
                int i2 = 0;
                int size2 = -1;
                while (true) {
                    j2 = 0;
                    if (i2 >= size) {
                        break;
                    }
                    zzrx zzrxVar = listZza.get(i2);
                    if (zzrxVar.zzb == 0) {
                        zzrpVar2 = zzrpVar3;
                    } else {
                        zzru zzruVar = zzrxVar.zza;
                        ArrayList arrayList2 = arrayList;
                        long j5 = zzruVar.zze;
                        if (j5 == j3) {
                            j5 = zzrxVar.zzh;
                        }
                        long jMax = Math.max(j4, j5);
                        zzro zzroVar = new zzro(zzruVar, zzrxVar, zznxVar.zzB(i2, zzruVar.zzb));
                        int i3 = zzrxVar.zze;
                        zzaft zzaftVarZza = zzruVar.zzf.zza();
                        zzaftVarZza.zzO(i3 + 30);
                        if (zzruVar.zzb == 2 && j5 > 0 && (i = zzrxVar.zzb) > 1) {
                            zzaftVarZza.zzU(i / (j5 / 1000000.0f));
                        }
                        int i4 = zzruVar.zzb;
                        int i5 = zzrl.zzb;
                        if (i4 == 1 && zzojVar.zzb()) {
                            zzaftVarZza.zzad(zzojVar.zza);
                            zzaftVarZza.zzae(zzojVar.zzb);
                        }
                        int i6 = zzruVar.zzb;
                        zzaiv[] zzaivVarArr = new zzaiv[2];
                        zzaivVarArr[0] = zzaivVar;
                        zzrpVar2 = this;
                        if (zzrpVar2.zzh.isEmpty()) {
                            c = 1;
                            zzaivVar3 = null;
                        } else {
                            zzaivVar3 = new zzaiv(zzrpVar2.zzh);
                            c = 1;
                        }
                        zzaivVarArr[c] = zzaivVar3;
                        zzaiv zzaivVar6 = new zzaiv(new zzaiu[0]);
                        if (i6 == 1) {
                            if (zzaivVar2 != null) {
                                zzaivVar6 = zzaivVar2;
                            }
                        } else if (i6 == 2 && zzaivVarZzc != null) {
                            for (int i7 = 0; i7 < zzaivVarZzc.zza(); i7++) {
                                zzaiu zzaiuVarZzb = zzaivVarZzc.zzb(i7);
                                if (zzaiuVarZzb instanceof zzakk) {
                                    zzakk zzakkVar = (zzakk) zzaiuVarZzb;
                                    if ("com.android.capture.fps".equals(zzakkVar.zza)) {
                                        zzaivVar6 = new zzaiv(zzakkVar);
                                        break;
                                    }
                                }
                            }
                        }
                        for (int i8 = 0; i8 < 2; i8++) {
                            zzaivVar6 = zzaivVar6.zzc(zzaivVarArr[i8]);
                        }
                        if (zzaivVar6.zza() > 0) {
                            zzaftVarZza.zzL(zzaivVar6);
                        }
                        zzroVar.zzc.zzs(zzaftVarZza.zzah());
                        if (zzruVar.zzb == 2 && size2 == -1) {
                            size2 = arrayList2.size();
                        }
                        arrayList = arrayList2;
                        arrayList.add(zzroVar);
                        j4 = jMax;
                    }
                    i2++;
                    zzrpVar3 = zzrpVar2;
                    listZza = listZza;
                    size = size;
                    j3 = -9223372036854775807L;
                }
                zzrpVar = zzrpVar3;
                zzrpVar.zzu = size2;
                zzrpVar.zzv = j4;
                zzro[] zzroVarArr = (zzro[]) arrayList.toArray(new zzro[0]);
                zzrpVar.zzs = zzroVarArr;
                int length = zzroVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i9 = 0; i9 < zzroVarArr.length; i9++) {
                    jArr[i9] = new long[zzroVarArr[i9].zzb.zzb];
                    jArr2[i9] = zzroVarArr[i9].zzb.zzf[0];
                }
                int i10 = 0;
                while (i10 < zzroVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < zzroVarArr.length; i12++) {
                        if (!zArr[i12]) {
                            long j7 = jArr2[i12];
                            if (j7 <= j6) {
                                i11 = i12;
                                j6 = j7;
                            }
                        }
                    }
                    int i13 = iArr[i11];
                    long[] jArr3 = jArr[i11];
                    jArr3[i13] = j2;
                    zzrx zzrxVar2 = zzroVarArr[i11].zzb;
                    j2 += (long) zzrxVar2.zzd[i13];
                    int i14 = i13 + 1;
                    iArr[i11] = i14;
                    if (i14 < jArr3.length) {
                        jArr2[i11] = zzrxVar2.zzf[i14];
                    } else {
                        zArr[i11] = true;
                        i10++;
                    }
                }
                zzrpVar.zzt = jArr;
                zznxVar.zzC();
                zznxVar.zzD(zzrpVar);
                zzrpVar.zzf.clear();
                zzrpVar.zzi = 2;
            } else {
                zzrpVar = zzrpVar3;
                if (!zzrpVar.zzf.isEmpty()) {
                    zzrpVar.zzf.peek().zzb(zzqvVarPop);
                }
            }
            zzrpVar3 = zzrpVar;
        }
        if (zzrpVar3.zzi != 2) {
            zzh();
        }
    }

    private static long zzj(zzrx zzrxVar, long j, long j2) {
        int iZzk = zzk(zzrxVar, j);
        return iZzk == -1 ? j2 : Math.min(zzrxVar.zzc[iZzk], j2);
    }

    private static int zzk(zzrx zzrxVar, long j) {
        int iZza = zzrxVar.zza(j);
        return iZza == -1 ? zzrxVar.zzb(j) : iZza;
    }

    private static int zzl(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        return zzrt.zzb(zznvVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzr = zznxVar;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j == 0) {
            zzh();
            return;
        }
        zzro[] zzroVarArr = this.zzs;
        if (zzroVarArr != null) {
            for (zzro zzroVar : zzroVarArr) {
                zzrx zzrxVar = zzroVar.zzb;
                int iZza = zzrxVar.zza(j2);
                if (iZza == -1) {
                    iZza = zzrxVar.zzb(j2);
                }
                zzroVar.zzd = iZza;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        long j2;
        long j3;
        int iZzb;
        zzro[] zzroVarArr = this.zzs;
        zzroVarArr.getClass();
        if (zzroVarArr.length == 0) {
            zzou zzouVar = zzou.zza;
            return new zzor(zzouVar, zzouVar);
        }
        int i = this.zzu;
        long jZzj = -1;
        if (i != -1) {
            zzrx zzrxVar = zzroVarArr[i].zzb;
            int iZzk = zzk(zzrxVar, j);
            if (iZzk == -1) {
                zzou zzouVar2 = zzou.zza;
                return new zzor(zzouVar2, zzouVar2);
            }
            long j4 = zzrxVar.zzf[iZzk];
            j2 = zzrxVar.zzc[iZzk];
            if (j4 >= j || iZzk >= zzrxVar.zzb - 1 || (iZzb = zzrxVar.zzb(j)) == -1 || iZzb == iZzk) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzrxVar.zzf[iZzb];
                jZzj = zzrxVar.zzc[iZzb];
            }
            j = j4;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzro[] zzroVarArr2 = this.zzs;
            if (i2 >= zzroVarArr2.length) {
                break;
            }
            if (i2 != this.zzu) {
                zzrx zzrxVar2 = zzroVarArr2[i2].zzb;
                long jZzj2 = zzj(zzrxVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    jZzj = zzj(zzrxVar2, j3, jZzj);
                }
                j2 = jZzj2;
            }
            i2++;
        }
        zzou zzouVar3 = new zzou(j, j2);
        return j3 == -9223372036854775807L ? new zzor(zzouVar3, zzouVar3) : new zzor(zzouVar3, new zzou(j3, jZzj));
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzv;
    }

    public zzrp(int i) {
        this.zzi = 0;
        this.zzg = new zzrs();
        this.zzh = new ArrayList();
        this.zze = new zzamf(16);
        this.zzf = new ArrayDeque<>();
        this.zzb = new zzamf(zzalw.zza);
        this.zzc = new zzamf(4);
        this.zzd = new zzamf();
        this.zzn = -1;
    }

    /* JADX WARN: Code duplicated, block: B:250:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        long j;
        int i;
        boolean z;
        boolean z2;
        zzqv zzqvVarPeek;
        while (true) {
            int i2 = this.zzi;
            if (i2 == 0) {
                if (this.zzl == 0) {
                    if (!zznvVar.zza(this.zze.zzi(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzl = 8;
                    this.zze.zzh(0);
                    this.zzk = this.zze.zzt();
                    this.zzj = this.zze.zzv();
                }
                long j2 = this.zzk;
                if (j2 == 1) {
                    zznvVar.zzb(this.zze.zzi(), 8, 8);
                    this.zzl += 8;
                    this.zzk = this.zze.zzD();
                } else if (j2 == 0) {
                    long jZzo = zznvVar.zzo();
                    if (jZzo == -1 && (zzqvVarPeek = this.zzf.peek()) != null) {
                        jZzo = zzqvVarPeek.zza;
                    }
                    if (jZzo != -1) {
                        this.zzk = (jZzo - zznvVar.zzn()) + ((long) this.zzl);
                    }
                }
                long j3 = this.zzk;
                int i3 = this.zzl;
                if (j3 < i3) {
                    throw zzaha.zzc("Atom size less than header length (unsupported).");
                }
                int i4 = this.zzj;
                if (i4 == 1836019574 || i4 == 1953653099 || i4 == 1835297121 || i4 == 1835626086 || i4 == 1937007212 || i4 == 1701082227 || i4 == 1835365473) {
                    long jZzn = zznvVar.zzn();
                    long j4 = this.zzk;
                    long j5 = this.zzl;
                    long j6 = (jZzn + j4) - j5;
                    if (j4 != j5 && this.zzj == 1835365473) {
                        this.zzd.zza(8);
                        zznvVar.zzi(this.zzd.zzi(), 0, 8);
                        zzre.zzd(this.zzd);
                        zznvVar.zze(this.zzd.zzg());
                        zznvVar.zzl();
                    }
                    this.zzf.push(new zzqv(this.zzj, j6));
                    if (this.zzk == this.zzl) {
                        zzi(j6);
                    } else {
                        zzh();
                    }
                } else if (i4 == 1835296868 || i4 == 1836476516 || i4 == 1751411826 || i4 == 1937011556 || i4 == 1937011827 || i4 == 1937011571 || i4 == 1668576371 || i4 == 1701606260 || i4 == 1937011555 || i4 == 1937011578 || i4 == 1937013298 || i4 == 1937007471 || i4 == 1668232756 || i4 == 1953196132 || i4 == 1718909296 || i4 == 1969517665 || i4 == 1801812339 || i4 == 1768715124) {
                    zzakt.zzd(i3 == 8);
                    zzakt.zzd(this.zzk <= 2147483647L);
                    zzamf zzamfVar = new zzamf((int) this.zzk);
                    System.arraycopy(this.zze.zzi(), 0, zzamfVar.zzi(), 0, 8);
                    this.zzm = zzamfVar;
                    this.zzi = 1;
                } else {
                    long jZzn2 = zznvVar.zzn();
                    long j7 = this.zzl;
                    long j8 = jZzn2 - j7;
                    if (this.zzj == 1836086884) {
                        this.zzx = new zzakn(0L, j8, -9223372036854775807L, j8 + j7, this.zzk - j7);
                    }
                    this.zzm = null;
                    this.zzi = 1;
                }
            } else {
                if (i2 != 1) {
                    long jZzn3 = zznvVar.zzn();
                    if (this.zzn == -1) {
                        int i5 = -1;
                        int i6 = -1;
                        boolean z3 = true;
                        boolean z4 = true;
                        long j9 = Long.MAX_VALUE;
                        long j10 = Long.MAX_VALUE;
                        long j11 = Long.MAX_VALUE;
                        for (int i7 = 0; i7 < ((zzro[]) zzamq.zzd(this.zzs)).length; i7++) {
                            zzro zzroVar = this.zzs[i7];
                            int i8 = zzroVar.zzd;
                            zzrx zzrxVar = zzroVar.zzb;
                            if (i8 != zzrxVar.zzb) {
                                long j12 = zzrxVar.zzc[i8];
                                long j13 = ((long[][]) zzamq.zzd(this.zzt))[i7][i8];
                                long j14 = j12 - jZzn3;
                                boolean z5 = j14 < 0 || j14 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                if (z5) {
                                    z = z4;
                                } else {
                                    if (z4) {
                                        i5 = i7;
                                        z4 = z5;
                                        j10 = j14;
                                        j11 = j13;
                                    } else {
                                        z = false;
                                    }
                                    if (j13 < j9) {
                                        i6 = i7;
                                        z3 = z5;
                                        j9 = j13;
                                    }
                                }
                                if (z5 != z || j14 >= j10) {
                                    z4 = z;
                                } else {
                                    i5 = i7;
                                    z4 = z5;
                                    j10 = j14;
                                    j11 = j13;
                                }
                                if (j13 < j9) {
                                    i6 = i7;
                                    z3 = z5;
                                    j9 = j13;
                                }
                            }
                        }
                        if (j9 != Long.MAX_VALUE && z3 && j11 >= j9 + 10485760) {
                            i5 = i6;
                        }
                        this.zzn = i5;
                        if (i5 == -1) {
                            return -1;
                        }
                    }
                    zzro zzroVar2 = ((zzro[]) zzamq.zzd(this.zzs))[this.zzn];
                    zzox zzoxVar = zzroVar2.zzc;
                    int i9 = zzroVar2.zzd;
                    zzrx zzrxVar2 = zzroVar2.zzb;
                    long j15 = zzrxVar2.zzc[i9];
                    int i10 = zzrxVar2.zzd[i9];
                    long j16 = (j15 - jZzn3) + ((long) this.zzo);
                    if (j16 < 0 || j16 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzoqVar.zza = j15;
                        return 1;
                    }
                    if (zzroVar2.zza.zzg == 1) {
                        i = i10 - 8;
                        j = j16 + 8;
                    } else {
                        j = j16;
                        i = i10;
                    }
                    zznvVar.zze((int) j);
                    zzru zzruVar = zzroVar2.zza;
                    if (zzruVar.zzj == 0) {
                        if ("audio/ac4".equals(zzruVar.zzf.zzl)) {
                            if (this.zzp == 0) {
                                zznd.zzb(i, this.zzd);
                                zzov.zzb(zzoxVar, this.zzd, 7);
                                this.zzp += 7;
                            }
                            i += 7;
                        }
                        while (true) {
                            int i11 = this.zzp;
                            if (i11 >= i) {
                                break;
                            }
                            int iZza = zzov.zza(zzoxVar, zznvVar, i - i11, false);
                            this.zzo += iZza;
                            this.zzp += iZza;
                            this.zzq -= iZza;
                        }
                    } else {
                        byte[] bArrZzi = this.zzc.zzi();
                        bArrZzi[0] = 0;
                        bArrZzi[1] = 0;
                        bArrZzi[2] = 0;
                        int i12 = zzroVar2.zza.zzj;
                        int i13 = 4 - i12;
                        while (this.zzp < i) {
                            int i14 = this.zzq;
                            if (i14 == 0) {
                                zznvVar.zzb(bArrZzi, i13, i12);
                                this.zzo += i12;
                                this.zzc.zzh(0);
                                int iZzv = this.zzc.zzv();
                                if (iZzv < 0) {
                                    throw zzaha.zzb("Invalid NAL length", null);
                                }
                                this.zzq = iZzv;
                                this.zzb.zzh(0);
                                zzov.zzb(zzoxVar, this.zzb, 4);
                                this.zzp += 4;
                                i += i13;
                            } else {
                                int iZza2 = zzov.zza(zzoxVar, zznvVar, i14, false);
                                this.zzo += iZza2;
                                this.zzp += iZza2;
                                this.zzq -= iZza2;
                            }
                        }
                    }
                    zzrx zzrxVar3 = zzroVar2.zzb;
                    zzoxVar.zzv(zzrxVar3.zzf[i9], zzrxVar3.zzg[i9], i, 0, null);
                    zzroVar2.zzd++;
                    this.zzn = -1;
                    this.zzo = 0;
                    this.zzp = 0;
                    this.zzq = 0;
                    return 0;
                }
                long j17 = this.zzk - ((long) this.zzl);
                long jZzn4 = zznvVar.zzn() + j17;
                zzamf zzamfVar2 = this.zzm;
                if (zzamfVar2 != null) {
                    zznvVar.zzb(zzamfVar2.zzi(), this.zzl, (int) j17);
                    if (this.zzj == 1718909296) {
                        zzamfVar2.zzh(8);
                        int iZzl = zzl(zzamfVar2.zzv());
                        if (iZzl == 0) {
                            zzamfVar2.zzk(4);
                            do {
                                if (zzamfVar2.zzd() <= 0) {
                                    iZzl = 0;
                                    break;
                                }
                                iZzl = zzl(zzamfVar2.zzv());
                            } while (iZzl == 0);
                        }
                        this.zzw = iZzl;
                    } else if (!this.zzf.isEmpty()) {
                        this.zzf.peek().zza(new zzqw(this.zzj, zzamfVar2));
                    }
                } else {
                    if (j17 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zznvVar.zze((int) j17);
                    } else {
                        zzoqVar.zza = zznvVar.zzn() + j17;
                        z2 = true;
                    }
                    zzi(jZzn4);
                    if (z2 && this.zzi != 2) {
                        return 1;
                    }
                }
                z2 = false;
                zzi(jZzn4);
                if (z2) {
                    continue;
                }
            }
        }
    }
}
