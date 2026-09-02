package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaqa {
    private final byte[] zza = new byte[8];
    private final Stack<zzapy> zzb = new Stack<>();
    private final zzaqh zzc = new zzaqh();
    private int zzd;
    private int zze;
    private long zzf;
    private zzaqc zzg;

    zzaqa() {
    }

    private final long zzd(zzapn zzapnVar, int i) throws InterruptedException, IOException {
        zzapnVar.zzb(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.zza[i2] & UByte.MAX_VALUE));
        }
        return j;
    }

    public final void zza() {
        this.zzd = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    public final void zzb(zzaqc zzaqcVar) {
        this.zzg = zzaqcVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    /* JADX WARN: Code duplicated, block: B:69:0x0158  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:73:0x0193 A[LOOP:0: B:7:0x000c->B:73:0x0193, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00a5 A[SYNTHETIC] */
    public final boolean zzc(zzapn zzapnVar) throws InterruptedException, IOException {
        int iZzl;
        long j;
        long j2;
        int i;
        String str;
        long j3;
        int i2;
        long jZzd;
        double dLongBitsToDouble;
        int iZzc;
        int iZzd;
        zzaup.zzd(this.zzg != null);
        while (true) {
            if (!this.zzb.isEmpty() && zzapnVar.zzh() >= this.zzb.peek().zzb) {
                this.zzg.zza.zzc(this.zzb.pop().zza);
                return true;
            }
            int i3 = this.zzd;
            if (i3 == 0) {
                long jZze = this.zzc.zze(zzapnVar, true, false, 4);
                if (jZze == -2) {
                    zzapnVar.zzg();
                    while (true) {
                        zzapnVar.zze(this.zza, 0, 4, false);
                        iZzc = zzaqh.zzc(this.zza[0]);
                        if (iZzc != -1 && iZzc <= 4) {
                            iZzd = (int) zzaqh.zzd(this.zza, iZzc, false);
                            zzaqf zzaqfVar = this.zzg.zza;
                            if (zzaqf.zzm(iZzd)) {
                                break;
                            }
                        }
                        zzapnVar.zzd(1, false);
                    }
                    zzapnVar.zzd(iZzc, false);
                    jZze = iZzd;
                }
                if (jZze == -1) {
                    return false;
                }
                this.zze = (int) jZze;
                this.zzd = 1;
            } else {
                if (i3 == 1) {
                }
                zzaqc zzaqcVar = this.zzg;
                int i4 = this.zze;
                zzaqf zzaqfVar2 = zzaqcVar.zza;
                iZzl = zzaqf.zzl(i4);
                if (iZzl != 0) {
                    if (iZzl != 1) {
                        long jZzh = zzapnVar.zzh();
                        this.zzb.add(new zzapy(this.zze, this.zzf + jZzh, null));
                        this.zzg.zza.zzb(this.zze, jZzh, this.zzf);
                        this.zzd = 0;
                        return true;
                    }
                    if (iZzl != 2) {
                        j = this.zzf;
                        if (j <= 8) {
                            this.zzg.zza.zzh(this.zze, zzd(zzapnVar, (int) j));
                            this.zzd = 0;
                            return true;
                        }
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Invalid integer size: ");
                        sb.append(j);
                        throw new zzanp(sb.toString());
                    }
                    if (iZzl == 3) {
                        j2 = this.zzf;
                        if (j2 <= 2147483647L) {
                            StringBuilder sb2 = new StringBuilder(41);
                            sb2.append("String element size: ");
                            sb2.append(j2);
                            throw new zzanp(sb2.toString());
                        }
                        zzaqc zzaqcVar2 = this.zzg;
                        int i5 = this.zze;
                        i = (int) j2;
                        if (i == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i];
                            zzapnVar.zzb(bArr, 0, i, false);
                            str = new String(bArr);
                        }
                        zzaqcVar2.zza.zzj(i5, str);
                        this.zzd = 0;
                        return true;
                    }
                    if (iZzl != 4) {
                        this.zzg.zza.zzk(this.zze, (int) this.zzf, zzapnVar);
                        this.zzd = 0;
                        return true;
                    }
                    j3 = this.zzf;
                    if (j3 == 4 && j3 != 8) {
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j3);
                        throw new zzanp(sb3.toString());
                    }
                    zzaqc zzaqcVar3 = this.zzg;
                    int i6 = this.zze;
                    i2 = (int) j3;
                    jZzd = zzd(zzapnVar, i2);
                    if (i2 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                    }
                    zzaqcVar3.zza.zzi(i6, dLongBitsToDouble);
                    this.zzd = 0;
                    return true;
                }
                zzapnVar.zzd((int) this.zzf, false);
                this.zzd = 0;
            }
            this.zzf = this.zzc.zze(zzapnVar, false, true, 8);
            this.zzd = 2;
            zzaqc zzaqcVar4 = this.zzg;
            int i7 = this.zze;
            zzaqf zzaqfVar3 = zzaqcVar4.zza;
            iZzl = zzaqf.zzl(i7);
            if (iZzl != 0) {
                if (iZzl != 1) {
                    long jZzh2 = zzapnVar.zzh();
                    this.zzb.add(new zzapy(this.zze, this.zzf + jZzh2, null));
                    this.zzg.zza.zzb(this.zze, jZzh2, this.zzf);
                    this.zzd = 0;
                    return true;
                }
                if (iZzl != 2) {
                    j = this.zzf;
                    if (j <= 8) {
                        this.zzg.zza.zzh(this.zze, zzd(zzapnVar, (int) j));
                        this.zzd = 0;
                        return true;
                    }
                    StringBuilder sb4 = new StringBuilder(42);
                    sb4.append("Invalid integer size: ");
                    sb4.append(j);
                    throw new zzanp(sb4.toString());
                }
                if (iZzl == 3) {
                    if (iZzl != 4) {
                        this.zzg.zza.zzk(this.zze, (int) this.zzf, zzapnVar);
                        this.zzd = 0;
                        return true;
                    }
                    j3 = this.zzf;
                    if (j3 == 4) {
                    }
                    zzaqc zzaqcVar5 = this.zzg;
                    int i8 = this.zze;
                    i2 = (int) j3;
                    jZzd = zzd(zzapnVar, i2);
                    if (i2 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                    }
                    zzaqcVar5.zza.zzi(i8, dLongBitsToDouble);
                    this.zzd = 0;
                    return true;
                }
                j2 = this.zzf;
                if (j2 <= 2147483647L) {
                    StringBuilder sb5 = new StringBuilder(41);
                    sb5.append("String element size: ");
                    sb5.append(j2);
                    throw new zzanp(sb5.toString());
                }
                zzaqc zzaqcVar6 = this.zzg;
                int i9 = this.zze;
                i = (int) j2;
                if (i == 0) {
                    str = "";
                } else {
                    byte[] bArr2 = new byte[i];
                    zzapnVar.zzb(bArr2, 0, i, false);
                    str = new String(bArr2);
                }
                zzaqcVar6.zza.zzj(i9, str);
                this.zzd = 0;
                return true;
            }
            zzapnVar.zzd((int) this.zzf, false);
            this.zzd = 0;
        }
    }
}
