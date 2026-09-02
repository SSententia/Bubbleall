package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.core.view.MotionEventCompat;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsx implements zztb {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzame zzc = new zzame(new byte[7], 7);
    private final zzamf zzd = new zzamf(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzox zzg;
    private zzox zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzox zzu;
    private long zzv;

    public zzsx(boolean z, String str) {
        zzi();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzi();
    }

    private final boolean zzh(zzamf zzamfVar, byte[] bArr, int i) {
        int iMin = Math.min(zzamfVar.zzd(), i - this.zzj);
        zzamfVar.zzm(bArr, this.zzj, iMin);
        int i2 = this.zzj + iMin;
        this.zzj = i2;
        return i2 == i;
    }

    private final void zzi() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzj(zzox zzoxVar, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzoxVar;
        this.zzv = j;
        this.zzs = i2;
    }

    private final void zzk() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & UByte.MAX_VALUE) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzamf zzamfVar, byte[] bArr, int i) {
        if (zzamfVar.zzd() < i) {
            return false;
        }
        zzamfVar.zzm(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zzt = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzf = zzunVar.zzc();
        zzox zzoxVarZzB = zznxVar.zzB(zzunVar.zzb(), 1);
        this.zzg = zzoxVarZzB;
        this.zzu = zzoxVarZzB;
        if (!this.zzb) {
            this.zzh = new zznt();
            return;
        }
        zzunVar.zza();
        zzox zzoxVarZzB2 = zznxVar.zzB(zzunVar.zzb(), 5);
        this.zzh = zzoxVarZzB2;
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzD(zzunVar.zzc());
        zzaftVar.zzN("application/id3");
        zzoxVarZzB2.zzs(zzaftVar.zzah());
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzt = j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x027e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0287  */
    /* JADX WARN: Code duplicated, block: B:111:0x028b  */
    /* JADX WARN: Code duplicated, block: B:113:0x028f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0293  */
    /* JADX WARN: Code duplicated, block: B:146:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x0210  */
    /* JADX WARN: Code duplicated, block: B:76:0x0220  */
    /* JADX WARN: Code duplicated, block: B:78:0x022b  */
    /* JADX WARN: Code duplicated, block: B:80:0x022f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0244  */
    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzd(zzamf zzamfVar) throws zzaha {
        int i;
        int i2;
        int i3;
        char c;
        boolean z;
        int i4;
        int iZzh;
        byte[] bArrZzi;
        int iZze;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        this.zzg.getClass();
        int i9 = zzamq.zza;
        while (zzamfVar.zzd() > 0) {
            int i10 = this.zzi;
            int i11 = 13;
            char c2 = 7;
            int i12 = 2;
            if (i10 == 0) {
                byte[] bArrZzi2 = zzamfVar.zzi();
                int iZzg = zzamfVar.zzg();
                int iZze2 = zzamfVar.zze();
                while (true) {
                    if (iZzg < iZze2) {
                        int i13 = iZzg + 1;
                        byte b2 = bArrZzi2[iZzg];
                        int i14 = b2 & UByte.MAX_VALUE;
                        if (this.zzk == 512 && zzl((byte) -1, (byte) i14)) {
                            if (!this.zzm) {
                                int i15 = iZzg - 1;
                                zzamfVar.zzh(iZzg);
                                if (zzm(zzamfVar, this.zzc.zza, 1)) {
                                    this.zzc.zzd(4);
                                    int iZzh2 = this.zzc.zzh(1);
                                    int i16 = this.zzn;
                                    if (i16 != -1 && iZzh2 != i16) {
                                        c2 = 7;
                                    } else if (this.zzo == -1) {
                                        if (zzm(zzamfVar, this.zzc.zza, 4)) {
                                            this.zzc.zzd(14);
                                            iZzh = this.zzc.zzh(i11);
                                            c2 = 7;
                                            if (iZzh >= 7) {
                                                bArrZzi = zzamfVar.zzi();
                                                iZze = zzamfVar.zze();
                                                i5 = i15 + iZzh;
                                                if (i5 >= iZze) {
                                                    b = bArrZzi[i5];
                                                    if (b == -1) {
                                                        i8 = i5 + 1;
                                                        if (i8 != iZze || (zzl((byte) -1, bArrZzi[i8]) && ((bArrZzi[i8] & 8) >> 3) == iZzh2)) {
                                                        }
                                                    } else if (b == 73 || ((i6 = i5 + 1) != iZze && (bArrZzi[i6] != 68 || ((i7 = i5 + 2) != iZze && bArrZzi[i7] != 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else if (zzm(zzamfVar, this.zzc.zza, 1)) {
                                        this.zzc.zzd(i12);
                                        if (this.zzc.zzh(4) == this.zzo) {
                                            zzamfVar.zzh(iZzg + 1);
                                            if (zzm(zzamfVar, this.zzc.zza, 4)) {
                                                this.zzc.zzd(14);
                                                iZzh = this.zzc.zzh(i11);
                                                c2 = 7;
                                                if (iZzh >= 7) {
                                                    bArrZzi = zzamfVar.zzi();
                                                    iZze = zzamfVar.zze();
                                                    i5 = i15 + iZzh;
                                                    if (i5 >= iZze) {
                                                        b = bArrZzi[i5];
                                                        if (b == -1) {
                                                            i8 = i5 + 1;
                                                            if (i8 != iZze) {
                                                            }
                                                        } else if (b == 73) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c2 = 7;
                                        }
                                    }
                                } else {
                                    c2 = c2;
                                }
                                i = this.zzk;
                                i2 = i | i14;
                                if (i2 != 329) {
                                    i3 = 2;
                                    c = 3;
                                    z = false;
                                    i4 = 768;
                                } else if (i2 != 511) {
                                    i3 = 2;
                                    c = 3;
                                    z = false;
                                    i4 = 512;
                                } else if (i2 != 836) {
                                    i3 = 2;
                                    c = 3;
                                    z = false;
                                    i4 = 1024;
                                } else if (i2 != 1075) {
                                    this.zzi = 2;
                                    this.zzj = 3;
                                    this.zzs = 0;
                                    this.zzd.zzh(0);
                                    zzamfVar.zzh(i13);
                                } else if (i != 256) {
                                    this.zzk = 256;
                                    i11 = 13;
                                    i12 = 2;
                                } else {
                                    i3 = 2;
                                    c = 3;
                                    z = false;
                                    iZzg = i13;
                                    i12 = i3;
                                    i11 = 13;
                                }
                                this.zzk = i4;
                                iZzg = i13;
                                i12 = i3;
                                i11 = 13;
                            }
                            this.zzp = (b2 & 8) >> 3;
                            this.zzl = 1 == ((b2 & 1) ^ 1);
                            if (this.zzm) {
                                zzk();
                            } else {
                                this.zzi = 1;
                                this.zzj = 0;
                            }
                            zzamfVar.zzh(i13);
                        } else {
                            c2 = c2;
                            i = this.zzk;
                            i2 = i | i14;
                            if (i2 != 329) {
                                i3 = 2;
                                c = 3;
                                z = false;
                                i4 = 768;
                            } else if (i2 != 511) {
                                i3 = 2;
                                c = 3;
                                z = false;
                                i4 = 512;
                            } else if (i2 != 836) {
                                i3 = 2;
                                c = 3;
                                z = false;
                                i4 = 1024;
                            } else if (i2 != 1075) {
                                this.zzi = 2;
                                this.zzj = 3;
                                this.zzs = 0;
                                this.zzd.zzh(0);
                                zzamfVar.zzh(i13);
                            } else if (i != 256) {
                                this.zzk = 256;
                                i11 = 13;
                                i12 = 2;
                            } else {
                                i3 = 2;
                                c = 3;
                                z = false;
                                iZzg = i13;
                                i12 = i3;
                                i11 = 13;
                            }
                            this.zzk = i4;
                            iZzg = i13;
                            i12 = i3;
                            i11 = 13;
                        }
                    } else {
                        zzamfVar.zzh(iZzg);
                    }
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        int iMin = Math.min(zzamfVar.zzd(), this.zzs - this.zzj);
                        this.zzu.zzy(zzamfVar, iMin);
                        int i17 = this.zzj + iMin;
                        this.zzj = i17;
                        int i18 = this.zzs;
                        if (i17 == i18) {
                            long j = this.zzt;
                            if (j != -9223372036854775807L) {
                                this.zzu.zzv(j, 1, i18, 0, null);
                                this.zzt += this.zzv;
                            }
                            zzi();
                        }
                    } else {
                        if (zzh(zzamfVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzd(0);
                            if (this.zzq) {
                                this.zzc.zzf(10);
                            } else {
                                int iZzh3 = this.zzc.zzh(2) + 1;
                                if (iZzh3 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(iZzh3);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.zzc.zzf(5);
                                int iZzh4 = this.zzc.zzh(3);
                                int i19 = this.zzo;
                                int i20 = zzmx.zza;
                                byte[] bArr = {(byte) (((i19 >> 1) & 7) | 16), (byte) (((iZzh4 << 3) & 120) | ((i19 << 7) & 128))};
                                zzmv zzmvVarZza = zzmx.zza(bArr);
                                zzaft zzaftVar = new zzaft();
                                zzaftVar.zzD(this.zzf);
                                zzaftVar.zzN("audio/mp4a-latm");
                                zzaftVar.zzK(zzmvVarZza.zzc);
                                zzaftVar.zzaa(zzmvVarZza.zzb);
                                zzaftVar.zzab(zzmvVarZza.zza);
                                zzaftVar.zzP(Collections.singletonList(bArr));
                                zzaftVar.zzG(this.zze);
                                zzafv zzafvVarZzah = zzaftVar.zzah();
                                this.zzr = 1024000000 / ((long) zzafvVarZzah.zzz);
                                this.zzg.zzs(zzafvVarZzah);
                                this.zzq = true;
                            }
                            this.zzc.zzf(4);
                            int iZzh5 = this.zzc.zzh(13);
                            zzj(this.zzg, this.zzr, 0, this.zzl ? iZzh5 - 9 : iZzh5 - 7);
                        }
                    }
                } else if (zzh(zzamfVar, this.zzd.zzi(), 10)) {
                    this.zzh.zzy(this.zzd, 10);
                    this.zzd.zzh(6);
                    zzj(this.zzh, 0L, 10, 10 + this.zzd.zzA());
                }
            } else if (zzamfVar.zzd() != 0) {
                this.zzc.zza[0] = zzamfVar.zzi()[zzamfVar.zzg()];
                this.zzc.zzd(2);
                int iZzh6 = this.zzc.zzh(4);
                int i21 = this.zzo;
                if (i21 == -1 || iZzh6 == i21) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = iZzh6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }
}
