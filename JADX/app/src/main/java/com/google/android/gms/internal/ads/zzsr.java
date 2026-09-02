package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsr implements zztb {
    private final zzame zza;
    private final zzamf zzb;
    private final String zzc;
    private String zzd;
    private zzox zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzafv zzj;
    private int zzk;
    private long zzl;

    public zzsr() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzd = zzunVar.zzc();
        this.zze = zznxVar.zzB(zzunVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzd(zzamf zzamfVar) {
        zzakt.zze(this.zze);
        while (zzamfVar.zzd() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (zzamfVar.zzd() > 0) {
                    if (this.zzh) {
                        int iZzn = zzamfVar.zzn();
                        if (iZzn == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            this.zzb.zzi()[0] = 11;
                            this.zzb.zzi()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        this.zzh = iZzn == 11;
                    } else {
                        this.zzh = zzamfVar.zzn() == 11;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzamfVar.zzd(), this.zzk - this.zzg);
                zzov.zzb(this.zze, zzamfVar, iMin);
                int i2 = this.zzg + iMin;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 == i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zze.zzv(j, 1, i3, 0, null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] bArrZzi = this.zzb.zzi();
                int iMin2 = Math.min(zzamfVar.zzd(), 128 - this.zzg);
                zzamfVar.zzm(bArrZzi, this.zzg, iMin2);
                int i4 = this.zzg + iMin2;
                this.zzg = i4;
                if (i4 == 128) {
                    this.zza.zzd(0);
                    zzmz zzmzVarZzc = zzna.zzc(this.zza);
                    zzafv zzafvVar = this.zzj;
                    if (zzafvVar == null || zzmzVarZzc.zzc != zzafvVar.zzy || zzmzVarZzc.zzb != zzafvVar.zzz || !zzamq.zzc(zzmzVarZzc.zza, zzafvVar.zzl)) {
                        zzaft zzaftVar = new zzaft();
                        zzaftVar.zzD(this.zzd);
                        zzaftVar.zzN(zzmzVarZzc.zza);
                        zzaftVar.zzaa(zzmzVarZzc.zzc);
                        zzaftVar.zzab(zzmzVarZzc.zzb);
                        zzaftVar.zzG(this.zzc);
                        zzafv zzafvVarZzah = zzaftVar.zzah();
                        this.zzj = zzafvVarZzah;
                        this.zze.zzs(zzafvVarZzah);
                    }
                    this.zzk = zzmzVarZzc.zzd;
                    this.zzi = (((long) zzmzVarZzc.zze) * 1000000) / ((long) this.zzj.zzz);
                    this.zzb.zzh(0);
                    zzov.zzb(this.zze, this.zzb, 128);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }

    public zzsr(String str) {
        zzame zzameVar = new zzame(new byte[128], 128);
        this.zza = zzameVar;
        this.zzb = new zzamf(zzameVar.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
