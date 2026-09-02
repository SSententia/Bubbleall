package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzts implements zzuo {
    private final zztb zza;
    private final zzame zzb = new zzame(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzamn zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzts(zztb zztbVar) {
        this.zza = zztbVar;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzamf zzamfVar, byte[] bArr, int i) {
        int iMin = Math.min(zzamfVar.zzd(), i - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzamfVar.zzk(iMin);
        } else {
            zzamfVar.zzm(bArr, this.zzd, iMin);
        }
        int i2 = this.zzd + iMin;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zza(zzamn zzamnVar, zznx zznxVar, zzun zzunVar) {
        this.zze = zzamnVar;
        this.zza.zzb(zznxVar, zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzc(zzamf zzamfVar, int i) throws zzaha {
        int i2;
        long jZze;
        zzakt.zze(this.zze);
        int i3 = -1;
        int i4 = 2;
        if ((i & 1) != 0) {
            int i5 = this.zzc;
            if (i5 != 0 && i5 != 1) {
                if (i5 != 2) {
                    int i6 = this.zzj;
                    if (i6 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i6);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.zza.zze();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i7 = i;
        while (zzamfVar.zzd() > 0) {
            int i8 = this.zzc;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != i4) {
                        int iZzd = zzamfVar.zzd();
                        int i9 = this.zzj;
                        int i10 = i9 != i3 ? iZzd - i9 : 0;
                        if (i10 > 0) {
                            iZzd -= i10;
                            zzamfVar.zzf(zzamfVar.zzg() + iZzd);
                        }
                        this.zza.zzd(zzamfVar);
                        int i11 = this.zzj;
                        if (i11 != i3) {
                            int i12 = i11 - iZzd;
                            this.zzj = i12;
                            if (i12 == 0) {
                                this.zza.zze();
                                zzd(1);
                            }
                        }
                    } else {
                        if (zze(zzamfVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzamfVar, null, this.zzi)) {
                            this.zzb.zzd(0);
                            if (this.zzf) {
                                this.zzb.zzf(4);
                                int iZzh = this.zzb.zzh(3);
                                this.zzb.zzf(1);
                                int iZzh2 = this.zzb.zzh(15);
                                this.zzb.zzf(1);
                                long jZzh = ((long) (iZzh2 << 15)) | (((long) iZzh) << 30) | ((long) this.zzb.zzh(15));
                                this.zzb.zzf(1);
                                if (!this.zzh && this.zzg) {
                                    this.zzb.zzf(4);
                                    int iZzh3 = this.zzb.zzh(3);
                                    this.zzb.zzf(1);
                                    int iZzh4 = this.zzb.zzh(15);
                                    this.zzb.zzf(1);
                                    int iZzh5 = this.zzb.zzh(15);
                                    this.zzb.zzf(1);
                                    this.zze.zze((((long) iZzh3) << 30) | ((long) (iZzh4 << 15)) | ((long) iZzh5));
                                    this.zzh = true;
                                }
                                jZze = this.zze.zze(jZzh);
                            } else {
                                jZze = -9223372036854775807L;
                            }
                            i7 |= true != this.zzk ? 0 : 4;
                            this.zza.zzc(jZze, i7);
                            zzd(3);
                            i3 = -1;
                            i4 = 2;
                        }
                    }
                    i2 = i4;
                } else if (zze(zzamfVar, this.zzb.zza, 9)) {
                    int i13 = 0;
                    this.zzb.zzd(0);
                    int iZzh6 = this.zzb.zzh(24);
                    if (iZzh6 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(iZzh6);
                        Log.w("PesReader", sb2.toString());
                        i3 = -1;
                        this.zzj = -1;
                        i2 = 2;
                    } else {
                        this.zzb.zzf(8);
                        int iZzh7 = this.zzb.zzh(16);
                        this.zzb.zzf(5);
                        this.zzk = this.zzb.zzg();
                        i2 = 2;
                        this.zzb.zzf(2);
                        this.zzf = this.zzb.zzg();
                        this.zzg = this.zzb.zzg();
                        this.zzb.zzf(6);
                        int iZzh8 = this.zzb.zzh(8);
                        this.zzi = iZzh8;
                        if (iZzh7 == 0) {
                            this.zzj = -1;
                            i3 = -1;
                        } else {
                            int i14 = (iZzh7 - 3) - iZzh8;
                            this.zzj = i14;
                            if (i14 < 0) {
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i14);
                                Log.w("PesReader", sb3.toString());
                                i3 = -1;
                                this.zzj = -1;
                            } else {
                                i3 = -1;
                            }
                        }
                        i13 = 2;
                    }
                    zzd(i13);
                } else {
                    i3 = -1;
                    i2 = 2;
                }
            } else {
                i2 = i4;
                zzamfVar.zzk(zzamfVar.zzd());
            }
            i4 = i2;
        }
    }
}
