package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgez extends zzgfc {
    private final Iterable<ByteBuffer> zze;
    private final Iterator<ByteBuffer> zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ zzgez(Iterable iterable, Iterable<ByteBuffer> iterable2, int i, boolean z) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = iterable2;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (iterable2 != 0) {
            zzJ();
            return;
        }
        this.zzg = zzggk.zzd;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final void zzI() throws zzggm {
        if (!this.zzf.hasNext()) {
            throw zzggm.zzd();
        }
        zzJ();
    }

    private final void zzJ() {
        ByteBuffer next = this.zzf.next();
        this.zzg = next;
        this.zzl += (int) (this.zzm - this.zzn);
        long jPosition = next.position();
        this.zzm = jPosition;
        this.zzn = jPosition;
        this.zzo = this.zzg.limit();
        long jZzs = zzgiy.zzs(this.zzg);
        this.zzm += jZzs;
        this.zzn += jZzs;
        this.zzo += jZzs;
    }

    private final void zzK() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzj;
        if (i <= i2) {
            this.zzi = 0;
            return;
        }
        int i3 = i - i2;
        this.zzi = i3;
        this.zzh = i - i3;
    }

    private final void zzL(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > zzM()) {
            if (i2 > 0) {
                throw zzggm.zzd();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzI();
            }
            int iMin = Math.min(i3, (int) (this.zzo - this.zzm));
            long j = iMin;
            zzgiy.zzq(this.zzm, bArr, i2 - i3, j);
            i3 -= iMin;
            this.zzm += j;
        }
    }

    private final int zzM() {
        return (int) ((((long) (this.zzh - this.zzl)) - this.zzm) + this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final void zzA(int i) {
        this.zzj = i;
        zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final boolean zzB() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzC() {
        return (int) ((((long) this.zzl) + this.zzm) - this.zzn);
    }

    public final byte zzD() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzI();
        }
        long j = this.zzm;
        this.zzm = 1 + j;
        return zzgiy.zzr(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzk = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzk = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw zzggm.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final void zzb(int i) throws zzggm {
        if (this.zzk != i) {
            throw zzggm.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final boolean zzk() throws IOException {
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final String zzl() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            long j = iZzu;
            long j2 = this.zzo;
            long j3 = this.zzm;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[iZzu];
                zzgiy.zzq(j3, bArr, 0L, j);
                String str = new String(bArr, zzggk.zza);
                this.zzm += j;
                return str;
            }
        }
        if (iZzu > 0 && iZzu <= zzM()) {
            byte[] bArr2 = new byte[iZzu];
            zzL(bArr2, 0, iZzu);
            return new String(bArr2, zzggk.zza);
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw zzggm.zze();
        }
        throw zzggm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final String zzm() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            long j = iZzu;
            long j2 = this.zzo;
            long j3 = this.zzm;
            if (j <= j2 - j3) {
                String strZzi = zzgjd.zzi(this.zzg, (int) (j3 - this.zzn), iZzu);
                this.zzm += j;
                return strZzi;
            }
        }
        if (iZzu >= 0 && iZzu <= zzM()) {
            byte[] bArr = new byte[iZzu];
            zzL(bArr, 0, iZzu);
            return zzgjd.zzj(bArr, 0, iZzu);
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu <= 0) {
            throw zzggm.zze();
        }
        throw zzggm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final zzgex zzn() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            long j = iZzu;
            long j2 = this.zzo;
            long j3 = this.zzm;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[iZzu];
                zzgiy.zzq(j3, bArr, 0L, j);
                this.zzm += j;
                return zzgex.zzu(bArr);
            }
        }
        if (iZzu > 0 && iZzu <= zzM()) {
            byte[] bArr2 = new byte[iZzu];
            zzL(bArr2, 0, iZzu);
            return zzgex.zzu(bArr2);
        }
        if (iZzu == 0) {
            return zzgex.zzb;
        }
        if (iZzu < 0) {
            throw zzggm.zze();
        }
        throw zzggm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzs() throws IOException {
        return zzG(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final long zzt() throws IOException {
        return zzH(zzv());
    }

    final long zzw() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZzD = zzD();
            j |= ((long) (bZzD & ByteCompanionObject.MAX_VALUE)) << i;
            if ((bZzD & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw zzggm.zzf();
    }

    public final int zzx() throws IOException {
        int iZzD;
        byte bZzD;
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 >= 4) {
            this.zzm = 4 + j2;
            iZzD = (zzgiy.zzr(j2) & UByte.MAX_VALUE) | ((zzgiy.zzr(1 + j2) & UByte.MAX_VALUE) << 8) | ((zzgiy.zzr(2 + j2) & UByte.MAX_VALUE) << 16);
            bZzD = zzgiy.zzr(j2 + 3);
        } else {
            iZzD = (zzD() & UByte.MAX_VALUE) | ((zzD() & UByte.MAX_VALUE) << 8) | ((zzD() & UByte.MAX_VALUE) << 16);
            bZzD = zzD();
        }
        return iZzD | ((bZzD & UByte.MAX_VALUE) << 24);
    }

    public final long zzy() throws IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 8) {
            return ((((long) zzD()) & 255) << 56) | (((long) zzD()) & 255) | ((((long) zzD()) & 255) << 8) | ((((long) zzD()) & 255) << 16) | ((((long) zzD()) & 255) << 24) | ((((long) zzD()) & 255) << 32) | ((((long) zzD()) & 255) << 40) | ((((long) zzD()) & 255) << 48);
        }
        this.zzm = 8 + j2;
        return ((((long) zzgiy.zzr(j2 + 7)) & 255) << 56) | (((long) zzgiy.zzr(j2)) & 255) | ((((long) zzgiy.zzr(1 + j2)) & 255) << 8) | ((((long) zzgiy.zzr(2 + j2)) & 255) << 16) | ((((long) zzgiy.zzr(3 + j2)) & 255) << 24) | ((((long) zzgiy.zzr(4 + j2)) & 255) << 32) | ((((long) zzgiy.zzr(5 + j2)) & 255) << 40) | ((((long) zzgiy.zzr(6 + j2)) & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final int zzz(int i) throws zzggm {
        if (i < 0) {
            throw zzggm.zze();
        }
        int iZzC = i + zzC();
        int i2 = this.zzj;
        if (iZzC > i2) {
            throw zzggm.zzd();
        }
        this.zzj = iZzC;
        zzK();
        return i2;
    }

    public final void zzE(int i) throws IOException {
        if (i < 0 || i > (((long) (this.zzh - this.zzl)) - this.zzm) + this.zzn) {
            if (i >= 0) {
                throw zzggm.zzd();
            }
            throw zzggm.zze();
        }
        while (i > 0) {
            if (this.zzo - this.zzm == 0) {
                zzI();
            }
            int iMin = Math.min(i, (int) (this.zzo - this.zzm));
            i -= iMin;
            this.zzm += (long) iMin;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfc
    public final boolean zzc(int i) throws IOException {
        int iZza;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (zzD() >= 0) {
                    return true;
                }
            }
            throw zzggm.zzf();
        }
        if (i2 == 1) {
            zzE(8);
            return true;
        }
        if (i2 == 2) {
            zzE(zzu());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzggm.zzi();
            }
            zzE(4);
            return true;
        }
        do {
            iZza = zza();
            if (iZza == 0) {
                break;
            }
        } while (zzc(iZza));
        zzb(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int zzu() throws IOException {
        int i;
        long j = this.zzm;
        if (this.zzo != j) {
            long j2 = j + 1;
            byte bZzr = zzgiy.zzr(j);
            if (bZzr >= 0) {
                this.zzm++;
                return bZzr;
            }
            if (this.zzo - this.zzm >= 10) {
                long j3 = 2 + j;
                int iZzr = (zzgiy.zzr(j2) << 7) ^ bZzr;
                if (iZzr < 0) {
                    i = iZzr ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iZzr2 = (zzgiy.zzr(j3) << 14) ^ iZzr;
                    if (iZzr2 >= 0) {
                        i = iZzr2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iZzr3 = iZzr2 ^ (zzgiy.zzr(j4) << 21);
                        if (iZzr3 < 0) {
                            i = (-2080896) ^ iZzr3;
                        } else {
                            j4 = 5 + j;
                            byte bZzr2 = zzgiy.zzr(j5);
                            int i2 = (iZzr3 ^ (bZzr2 << 28)) ^ 266354560;
                            if (bZzr2 < 0) {
                                j5 = 6 + j;
                                if (zzgiy.zzr(j4) < 0) {
                                    j4 = 7 + j;
                                    if (zzgiy.zzr(j5) < 0) {
                                        j5 = 8 + j;
                                        if (zzgiy.zzr(j4) < 0) {
                                            j4 = 9 + j;
                                            if (zzgiy.zzr(j5) < 0) {
                                                long j6 = j + 10;
                                                if (zzgiy.zzr(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.zzm = j3;
                return i;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j;
        long j2;
        long j3 = this.zzm;
        if (this.zzo != j3) {
            long j4 = j3 + 1;
            byte bZzr = zzgiy.zzr(j3);
            if (bZzr >= 0) {
                this.zzm++;
                return bZzr;
            }
            if (this.zzo - this.zzm >= 10) {
                long j5 = 2 + j3;
                int iZzr = (zzgiy.zzr(j4) << 7) ^ bZzr;
                if (iZzr < 0) {
                    j = iZzr ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int iZzr2 = (zzgiy.zzr(j5) << 14) ^ iZzr;
                    if (iZzr2 >= 0) {
                        j = iZzr2 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int iZzr3 = iZzr2 ^ (zzgiy.zzr(j6) << 21);
                        if (iZzr3 < 0) {
                            j = (-2080896) ^ iZzr3;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long jZzr = (((long) zzgiy.zzr(j7)) << 28) ^ ((long) iZzr3);
                            if (jZzr >= 0) {
                                j = 266354560 ^ jZzr;
                            } else {
                                long j8 = 6 + j3;
                                long jZzr2 = jZzr ^ (((long) zzgiy.zzr(j6)) << 35);
                                if (jZzr2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long jZzr3 = jZzr2 ^ (((long) zzgiy.zzr(j8)) << 42);
                                    if (jZzr3 >= 0) {
                                        j = 4363953127296L ^ jZzr3;
                                    } else {
                                        j8 = 8 + j3;
                                        jZzr2 = jZzr3 ^ (((long) zzgiy.zzr(j9)) << 49);
                                        if (jZzr2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long jZzr4 = (jZzr2 ^ (((long) zzgiy.zzr(j8)) << 56)) ^ 71499008037633920L;
                                            if (jZzr4 < 0) {
                                                long j10 = j3 + 10;
                                                if (zzgiy.zzr(j9) >= 0) {
                                                    j = jZzr4;
                                                    j5 = j10;
                                                }
                                            } else {
                                                j = jZzr4;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ jZzr2;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.zzm = j5;
                return j;
            }
        }
        return zzw();
    }
}
