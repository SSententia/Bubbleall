package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaoz {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final short[] zzf;
    private int zzg;
    private short[] zzh;
    private int zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzm = 0;
    private int zzn = 0;
    private int zzu = 0;
    private float zzo = 1.0f;
    private float zzp = 1.0f;

    public zzaoz(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i / 400;
        int i3 = i / 65;
        this.zzd = i3;
        int i4 = i3 + i3;
        this.zze = i4;
        this.zzf = new short[i4];
        this.zzg = i4;
        int i5 = i2 * i4;
        this.zzh = new short[i5];
        this.zzi = i4;
        this.zzj = new short[i5];
        this.zzk = i4;
        this.zzl = new short[i5];
    }

    private final void zzg(int i) {
        int i2 = this.zzr;
        int i3 = this.zzi;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.zzi = i4;
            this.zzj = Arrays.copyOf(this.zzj, i4 * this.zzb);
        }
    }

    private final void zzh(int i) {
        int i2 = this.zzq;
        int i3 = this.zzg;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.zzg = i4;
            this.zzh = Arrays.copyOf(this.zzh, i4 * this.zzb);
        }
    }

    private final void zzi(short[] sArr, int i, int i2) {
        zzg(i2);
        int i3 = this.zzb;
        System.arraycopy(sArr, i * i3, this.zzj, this.zzr * i3, i3 * i2);
        this.zzr += i2;
    }

    private final void zzj(short[] sArr, int i, int i2) {
        int i3 = this.zze / i2;
        int i4 = this.zzb;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.zzf[i7] = (short) (i8 / i5);
        }
    }

    private final int zzk(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.zzb;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            int i11 = i9 * i7;
            int i12 = i6 * i2;
            if (i11 < i12) {
                i6 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i5;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i5 = i2;
            }
            i2++;
        }
        this.zzw = i6 / i7;
        this.zzx = i8 / i5;
        return i7;
    }

    private static void zzm(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final void zza(float f) {
        this.zzo = f;
    }

    public final void zzb(float f) {
        this.zzp = f;
    }

    public final void zzc(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = iRemaining / i;
        int i3 = i * i2;
        zzh(i2);
        shortBuffer.get(this.zzh, this.zzq * this.zzb, (i3 + i3) / 2);
        this.zzq += i2;
        zzl();
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.zzb, this.zzr);
        shortBuffer.put(this.zzj, 0, this.zzb * iMin);
        int i = this.zzr - iMin;
        this.zzr = i;
        short[] sArr = this.zzj;
        int i2 = this.zzb;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    public final void zze() {
        int i;
        int i2 = this.zzq;
        float f = this.zzo;
        float f2 = this.zzp;
        int i3 = this.zzr + ((int) ((((i2 / (f / f2)) + this.zzs) / f2) + 0.5f));
        int i4 = this.zze;
        zzh(i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.zze;
            i = i6 + i6;
            int i7 = this.zzb;
            if (i5 >= i * i7) {
                break;
            }
            this.zzh[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.zzq += i;
        zzl();
        if (this.zzr > i3) {
            this.zzr = i3;
        }
        this.zzq = 0;
        this.zzt = 0;
        this.zzs = 0;
    }

    public final int zzf() {
        return this.zzr;
    }

    private final void zzl() {
        int iZzk;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.zzr;
        float f = this.zzo / this.zzp;
        double d = f;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = this.zzq;
            if (i10 >= this.zze) {
                int i11 = 0;
                while (true) {
                    int i12 = this.zzt;
                    if (i12 > 0) {
                        int iMin = Math.min(this.zze, i12);
                        zzi(this.zzh, i11, iMin);
                        this.zzt -= iMin;
                        i11 += iMin;
                    } else {
                        short[] sArr = this.zzh;
                        int i13 = this.zza;
                        int i14 = i13 > 4000 ? i13 / 4000 : i9;
                        if (this.zzb == i9 && i14 == i9) {
                            iZzk = zzk(sArr, i11, this.zzc, this.zzd);
                        } else {
                            zzj(sArr, i11, i14);
                            int iZzk2 = zzk(this.zzf, 0, this.zzc / i14, this.zzd / i14);
                            if (i14 != i9) {
                                int i15 = iZzk2 * i14;
                                int i16 = i14 * 4;
                                int i17 = i15 - i16;
                                int i18 = i15 + i16;
                                int i19 = this.zzc;
                                if (i17 < i19) {
                                    i17 = i19;
                                }
                                int i20 = this.zzd;
                                if (i18 > i20) {
                                    i18 = i20;
                                }
                                if (this.zzb == i9) {
                                    iZzk = zzk(sArr, i11, i17, i18);
                                } else {
                                    zzj(sArr, i11, i9);
                                    iZzk = zzk(this.zzf, 0, i17, i18);
                                }
                            } else {
                                iZzk = iZzk2;
                            }
                        }
                        int i21 = this.zzw;
                        int i22 = (i21 == 0 || (i3 = this.zzu) == 0 || this.zzx > i21 * 3 || i21 + i21 <= this.zzv * 3) ? iZzk : i3;
                        this.zzv = i21;
                        this.zzu = iZzk;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzh;
                            if (f >= 2.0f) {
                                i2 = (int) (i22 / ((-1.0f) + f));
                            } else {
                                this.zzt = (int) ((i22 * (2.0f - f)) / ((-1.0f) + f));
                                i2 = i22;
                            }
                            zzg(i2);
                            int i23 = i2;
                            zzm(i2, this.zzb, this.zzj, this.zzr, sArr2, i11, sArr2, i11 + i22);
                            this.zzr += i23;
                            i11 += i22 + i23;
                        } else {
                            int i24 = i22;
                            short[] sArr3 = this.zzh;
                            if (f < 0.5f) {
                                i = (int) ((i24 * f) / (1.0f - f));
                            } else {
                                this.zzt = (int) ((i24 * ((f + f) - 1.0f)) / (1.0f - f));
                                i = i24;
                            }
                            int i25 = i24 + i;
                            zzg(i25);
                            int i26 = this.zzb;
                            System.arraycopy(sArr3, i11 * i26, this.zzj, this.zzr * i26, i26 * i24);
                            zzm(i, this.zzb, this.zzj, this.zzr + i24, sArr3, i24 + i11, sArr3, i11);
                            this.zzr += i25;
                            i11 += i;
                        }
                    }
                    if (this.zze + i11 > i10) {
                        break;
                    } else {
                        i9 = 1;
                    }
                }
                int i27 = this.zzq - i11;
                short[] sArr4 = this.zzh;
                int i28 = this.zzb;
                System.arraycopy(sArr4, i11 * i28, sArr4, 0, i28 * i27);
                this.zzq = i27;
            }
        } else {
            zzi(this.zzh, 0, this.zzq);
            this.zzq = 0;
        }
        float f2 = this.zzp;
        if (f2 == 1.0f || this.zzr == i8) {
            return;
        }
        int i29 = this.zza;
        int i30 = (int) (i29 / f2);
        while (true) {
            if (i30 <= 16384 && i29 <= 16384) {
                break;
            }
            i30 /= 2;
            i29 /= 2;
        }
        int i31 = this.zzr - i8;
        int i32 = this.zzs;
        int i33 = this.zzk;
        if (i32 + i31 > i33) {
            int i34 = i33 + (i33 / 2) + i31;
            this.zzk = i34;
            this.zzl = Arrays.copyOf(this.zzl, i34 * this.zzb);
        }
        short[] sArr5 = this.zzj;
        int i35 = this.zzb;
        System.arraycopy(sArr5, i8 * i35, this.zzl, this.zzs * i35, i35 * i31);
        this.zzr = i8;
        this.zzs += i31;
        int i36 = 0;
        while (true) {
            i4 = this.zzs;
            i5 = i4 - 1;
            if (i36 >= i5) {
                break;
            }
            while (true) {
                i6 = this.zzm + 1;
                i7 = this.zzn;
                if (i6 * i30 <= i7 * i29) {
                    break;
                }
                zzg(1);
                int i37 = 0;
                while (true) {
                    int i38 = this.zzb;
                    if (i37 < i38) {
                        short[] sArr6 = this.zzj;
                        int i39 = this.zzr;
                        short[] sArr7 = this.zzl;
                        int i40 = (i36 * i38) + i37;
                        short s = sArr7[i40];
                        short s2 = sArr7[i40 + i38];
                        int i41 = this.zzn;
                        int i42 = this.zzm;
                        int i43 = (i42 + 1) * i30;
                        int i44 = i43 - (i41 * i29);
                        int i45 = i43 - (i42 * i30);
                        sArr6[(i39 * i38) + i37] = (short) (((s * i44) + ((i45 - i44) * s2)) / i45);
                        i37++;
                    }
                }
                this.zzn++;
                this.zzr++;
            }
            this.zzm = i6;
            if (i6 == i29) {
                this.zzm = 0;
                zzaup.zzd(i7 == i30);
                this.zzn = 0;
            }
            i36++;
        }
        if (i5 != 0) {
            short[] sArr8 = this.zzl;
            int i46 = this.zzb;
            System.arraycopy(sArr8, i5 * i46, sArr8, 0, (i4 - i5) * i46);
            this.zzs -= i5;
        }
    }
}
