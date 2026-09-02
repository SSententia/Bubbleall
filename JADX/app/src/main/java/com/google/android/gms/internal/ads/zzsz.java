package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsz implements zztb {
    private final String zzb;
    private String zzc;
    private zzox zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private zzafv zzi;
    private int zzj;
    private final zzamf zza = new zzamf(new byte[18]);
    private int zze = 0;
    private long zzk = -9223372036854775807L;

    public zzsz(String str) {
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzc = zzunVar.zzc();
        this.zzd = zznxVar.zzB(zzunVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:39:0x0111  */
    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzd(zzamf zzamfVar) {
        int i;
        byte b;
        boolean z;
        int i2;
        int i3;
        byte b2;
        int i4;
        byte b3;
        int i5;
        zzakt.zze(this.zzd);
        while (zzamfVar.zzd() > 0) {
            int i6 = this.zze;
            if (i6 == 0) {
                while (zzamfVar.zzd() > 0) {
                    int i7 = this.zzg << 8;
                    this.zzg = i7;
                    int iZzn = i7 | zzamfVar.zzn();
                    this.zzg = iZzn;
                    int i8 = zzns.zza;
                    if (iZzn == 2147385345 || iZzn == -25230976 || iZzn == 536864768 || iZzn == -14745368) {
                        byte[] bArrZzi = this.zza.zzi();
                        int i9 = this.zzg;
                        bArrZzi[0] = (byte) ((i9 >> 24) & 255);
                        bArrZzi[1] = (byte) ((i9 >> 16) & 255);
                        bArrZzi[2] = (byte) ((i9 >> 8) & 255);
                        bArrZzi[3] = (byte) (i9 & 255);
                        this.zzf = 4;
                        this.zzg = 0;
                        this.zze = 1;
                        break;
                    }
                }
            } else if (i6 != 1) {
                int iMin = Math.min(zzamfVar.zzd(), this.zzj - this.zzf);
                zzov.zzb(this.zzd, zzamfVar, iMin);
                int i10 = this.zzf + iMin;
                this.zzf = i10;
                int i11 = this.zzj;
                if (i10 == i11) {
                    long j = this.zzk;
                    if (j != -9223372036854775807L) {
                        this.zzd.zzv(j, 1, i11, 0, null);
                        this.zzk += this.zzh;
                    }
                    this.zze = 0;
                }
            } else {
                byte[] bArrZzi2 = this.zza.zzi();
                int iMin2 = Math.min(zzamfVar.zzd(), 18 - this.zzf);
                zzamfVar.zzm(bArrZzi2, this.zzf, iMin2);
                int i12 = this.zzf + iMin2;
                this.zzf = i12;
                if (i12 == 18) {
                    byte[] bArrZzi3 = this.zza.zzi();
                    if (this.zzi == null) {
                        zzafv zzafvVarZza = zzns.zza(bArrZzi3, this.zzc, this.zzb, null);
                        this.zzi = zzafvVarZza;
                        this.zzd.zzs(zzafvVarZza);
                    }
                    int i13 = zzns.zza;
                    byte b4 = bArrZzi3[0];
                    if (b4 != -2) {
                        if (b4 == -1) {
                            i5 = ((bArrZzi3[7] & 3) << 12) | ((bArrZzi3[6] & UByte.MAX_VALUE) << 4) | ((bArrZzi3[9] & 60) >> 2);
                        } else if (b4 != 31) {
                            i = ((bArrZzi3[5] & 3) << 12) | ((bArrZzi3[6] & UByte.MAX_VALUE) << 4);
                            b = bArrZzi3[7];
                        } else {
                            i5 = ((bArrZzi3[8] & 60) >> 2) | ((bArrZzi3[6] & 3) << 12) | ((bArrZzi3[7] & UByte.MAX_VALUE) << 4);
                        }
                        i2 = i5 + 1;
                        z = true;
                        if (z) {
                            i2 = (i2 * 16) / 14;
                        }
                        this.zzj = i2;
                        if (b4 != -2) {
                            if (b4 != -1) {
                                i3 = (bArrZzi3[4] & 7) << 4;
                                b3 = bArrZzi3[7];
                            } else if (b4 != 31) {
                                i3 = (bArrZzi3[4] & 1) << 6;
                                b2 = bArrZzi3[5];
                            } else {
                                i3 = (bArrZzi3[5] & 7) << 4;
                                b3 = bArrZzi3[6];
                            }
                            i4 = b3 & 60;
                            this.zzh = (int) ((((long) ((((i4 >> 2) | i3) + 1) * 32)) * 1000000) / ((long) this.zzi.zzz));
                            this.zza.zzh(0);
                            zzov.zzb(this.zzd, this.zza, 18);
                            this.zze = 2;
                        } else {
                            i3 = (bArrZzi3[5] & 1) << 6;
                            b2 = bArrZzi3[4];
                        }
                        i4 = b2 & 252;
                        this.zzh = (int) ((((long) ((((i4 >> 2) | i3) + 1) * 32)) * 1000000) / ((long) this.zzi.zzz));
                        this.zza.zzh(0);
                        zzov.zzb(this.zzd, this.zza, 18);
                        this.zze = 2;
                    } else {
                        i = ((bArrZzi3[4] & 3) << 12) | ((bArrZzi3[7] & UByte.MAX_VALUE) << 4);
                        b = bArrZzi3[6];
                    }
                    i2 = (i | ((b & 240) >> 4)) + 1;
                    z = false;
                    if (z) {
                        i2 = (i2 * 16) / 14;
                    }
                    this.zzj = i2;
                    if (b4 != -2) {
                        if (b4 != -1) {
                            i3 = (bArrZzi3[4] & 7) << 4;
                            b3 = bArrZzi3[7];
                        } else if (b4 != 31) {
                            i3 = (bArrZzi3[4] & 1) << 6;
                            b2 = bArrZzi3[5];
                        } else {
                            i3 = (bArrZzi3[5] & 7) << 4;
                            b3 = bArrZzi3[6];
                        }
                        i4 = b3 & 60;
                        this.zzh = (int) ((((long) ((((i4 >> 2) | i3) + 1) * 32)) * 1000000) / ((long) this.zzi.zzz));
                        this.zza.zzh(0);
                        zzov.zzb(this.zzd, this.zza, 18);
                        this.zze = 2;
                    } else {
                        i3 = (bArrZzi3[5] & 1) << 6;
                        b2 = bArrZzi3[4];
                    }
                    i4 = b2 & 252;
                    this.zzh = (int) ((((long) ((((i4 >> 2) | i3) + 1) * 32)) * 1000000) / ((long) this.zzi.zzz));
                    this.zza.zzh(0);
                    zzov.zzb(this.zzd, this.zza, 18);
                    this.zze = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }
}
