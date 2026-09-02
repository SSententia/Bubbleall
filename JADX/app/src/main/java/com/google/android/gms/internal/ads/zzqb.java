package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqb {
    private final byte[] zza = new byte[8];
    private final ArrayDeque<zzpz> zzb = new ArrayDeque<>();
    private final zzqk zzc = new zzqk();
    private zzqc zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zznv zznvVar, int i) throws IOException {
        ((zznp) zznvVar).zza(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.zza[i2] & UByte.MAX_VALUE));
        }
        return j;
    }

    public final void zza(zzqc zzqcVar) {
        this.zzd = zzqcVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:61:0x0127 A[LOOP:2: B:58:0x011f->B:61:0x0127, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Code duplicated, block: B:67:0x0150  */
    /* JADX WARN: Code duplicated, block: B:69:0x0156  */
    /* JADX WARN: Code duplicated, block: B:71:0x0169  */
    /* JADX WARN: Code duplicated, block: B:73:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a4 A[LOOP:0: B:3:0x0005->B:75:0x01a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0129 A[EDGE_INSN: B:84:0x0129->B:62:0x0129 BREAK  A[LOOP:2: B:58:0x011f->B:61:0x0127], SYNTHETIC] */
    public final boolean zzc(zznv zznvVar) throws IOException {
        int iZzn;
        long j;
        long j2;
        int i;
        byte[] bArr;
        String str;
        int i2;
        long j3;
        int i3;
        long jZzd;
        double dLongBitsToDouble;
        zznp zznpVar;
        int iZzd;
        int iZze;
        zzakt.zze(this.zzd);
        while (true) {
            zzpz zzpzVarPeek = this.zzb.peek();
            if (zzpzVarPeek != null && zznvVar.zzn() >= zzpzVarPeek.zzb) {
                ((zzqe) this.zzd).zza.zzi(this.zzb.pop().zza);
                return true;
            }
            int i4 = this.zze;
            if (i4 == 0) {
                long jZzb = this.zzc.zzb(zznvVar, true, false, 4);
                if (jZzb == -2) {
                    zznvVar.zzl();
                    while (true) {
                        zznpVar = (zznp) zznvVar;
                        zznpVar.zzh(this.zza, 0, 4, false);
                        iZzd = zzqk.zzd(this.zza[0]);
                        if (iZzd != -1 && iZzd <= 4) {
                            iZze = (int) zzqk.zze(this.zza, iZzd, false);
                            zzqi zzqiVar = ((zzqe) this.zzd).zza;
                            if (zzqi.zzo(iZze)) {
                                break;
                            }
                        }
                        zznpVar.zzd(1, false);
                    }
                    zznpVar.zzd(iZzd, false);
                    jZzb = iZze;
                }
                if (jZzb == -1) {
                    return false;
                }
                this.zzf = (int) jZzb;
                this.zze = 1;
            } else {
                if (i4 == 1) {
                }
                zzqc zzqcVar = this.zzd;
                int i5 = this.zzf;
                zzqi zzqiVar2 = ((zzqe) zzqcVar).zza;
                iZzn = zzqi.zzn(i5);
                if (iZzn != 0) {
                    if (iZzn != 1) {
                        long jZzn = zznvVar.zzn();
                        this.zzb.push(new zzpz(this.zzf, this.zzg + jZzn, null));
                        ((zzqe) this.zzd).zza.zzh(this.zzf, jZzn, this.zzg);
                        this.zze = 0;
                        return true;
                    }
                    if (iZzn != 2) {
                        j = this.zzg;
                        if (j <= 8) {
                            StringBuilder sb = new StringBuilder(42);
                            sb.append("Invalid integer size: ");
                            sb.append(j);
                            throw zzaha.zzb(sb.toString(), null);
                        }
                        ((zzqe) this.zzd).zza.zzj(this.zzf, zzd(zznvVar, (int) j));
                        this.zze = 0;
                        return true;
                    }
                    if (iZzn == 3) {
                        j2 = this.zzg;
                        if (j2 <= 2147483647L) {
                            StringBuilder sb2 = new StringBuilder(41);
                            sb2.append("String element size: ");
                            sb2.append(j2);
                            throw zzaha.zzb(sb2.toString(), null);
                        }
                        zzqc zzqcVar2 = this.zzd;
                        int i6 = this.zzf;
                        i = (int) j2;
                        if (i == 0) {
                            str = "";
                        } else {
                            bArr = new byte[i];
                            ((zznp) zznvVar).zza(bArr, 0, i, false);
                            while (i > 0) {
                                i2 = i - 1;
                                if (bArr[i2] == 0) {
                                    break;
                                }
                                i = i2;
                            }
                            str = new String(bArr, 0, i);
                        }
                        ((zzqe) zzqcVar2).zza.zzl(i6, str);
                        this.zze = 0;
                        return true;
                    }
                    if (iZzn != 4) {
                        ((zzqe) this.zzd).zza.zzm(this.zzf, (int) this.zzg, zznvVar);
                        this.zze = 0;
                        return true;
                    }
                    j3 = this.zzg;
                    if (j3 == 4 && j3 != 8) {
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j3);
                        throw zzaha.zzb(sb3.toString(), null);
                    }
                    zzqc zzqcVar3 = this.zzd;
                    int i7 = this.zzf;
                    i3 = (int) j3;
                    jZzd = zzd(zznvVar, i3);
                    if (i3 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                    }
                    ((zzqe) zzqcVar3).zza.zzk(i7, dLongBitsToDouble);
                    this.zze = 0;
                    return true;
                }
                ((zznp) zznvVar).zzd((int) this.zzg, false);
                this.zze = 0;
            }
            this.zzg = this.zzc.zzb(zznvVar, false, true, 8);
            this.zze = 2;
            zzqc zzqcVar4 = this.zzd;
            int i8 = this.zzf;
            zzqi zzqiVar3 = ((zzqe) zzqcVar4).zza;
            iZzn = zzqi.zzn(i8);
            if (iZzn != 0) {
                if (iZzn != 1) {
                    long jZzn2 = zznvVar.zzn();
                    this.zzb.push(new zzpz(this.zzf, this.zzg + jZzn2, null));
                    ((zzqe) this.zzd).zza.zzh(this.zzf, jZzn2, this.zzg);
                    this.zze = 0;
                    return true;
                }
                if (iZzn != 2) {
                    j = this.zzg;
                    if (j <= 8) {
                        StringBuilder sb4 = new StringBuilder(42);
                        sb4.append("Invalid integer size: ");
                        sb4.append(j);
                        throw zzaha.zzb(sb4.toString(), null);
                    }
                    ((zzqe) this.zzd).zza.zzj(this.zzf, zzd(zznvVar, (int) j));
                    this.zze = 0;
                    return true;
                }
                if (iZzn == 3) {
                    if (iZzn != 4) {
                        ((zzqe) this.zzd).zza.zzm(this.zzf, (int) this.zzg, zznvVar);
                        this.zze = 0;
                        return true;
                    }
                    j3 = this.zzg;
                    if (j3 == 4) {
                    }
                    zzqc zzqcVar5 = this.zzd;
                    int i9 = this.zzf;
                    i3 = (int) j3;
                    jZzd = zzd(zznvVar, i3);
                    if (i3 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                    }
                    ((zzqe) zzqcVar5).zza.zzk(i9, dLongBitsToDouble);
                    this.zze = 0;
                    return true;
                }
                j2 = this.zzg;
                if (j2 <= 2147483647L) {
                    StringBuilder sb5 = new StringBuilder(41);
                    sb5.append("String element size: ");
                    sb5.append(j2);
                    throw zzaha.zzb(sb5.toString(), null);
                }
                zzqc zzqcVar6 = this.zzd;
                int i10 = this.zzf;
                i = (int) j2;
                if (i == 0) {
                    str = "";
                } else {
                    bArr = new byte[i];
                    ((zznp) zznvVar).zza(bArr, 0, i, false);
                    while (i > 0) {
                        i2 = i - 1;
                        if (bArr[i2] == 0) {
                            break;
                            break;
                        }
                        i = i2;
                    }
                    str = new String(bArr, 0, i);
                }
                ((zzqe) zzqcVar6).zza.zzl(i10, str);
                this.zze = 0;
                return true;
            }
            ((zznp) zznvVar).zzd((int) this.zzg, false);
            this.zze = 0;
        }
    }
}
