package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsu implements zztb {
    private final zzame zza;
    private final zzamf zzb;
    private final String zzc;
    private String zzd;
    private zzox zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private zzafv zzk;
    private int zzl;
    private long zzm;

    public zzsu() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
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
            this.zzm = j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0121  */
    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzd(zzamf zzamfVar) {
        boolean z;
        zzakt.zze(this.zze);
        while (zzamfVar.zzd() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (true) {
                    if (zzamfVar.zzd() > 0) {
                        if (this.zzh) {
                            int iZzn = zzamfVar.zzn();
                            this.zzh = iZzn == 172;
                            if (iZzn == 64) {
                                if (iZzn != 65) {
                                    z = false;
                                }
                                this.zzi = z;
                                this.zzf = 1;
                                this.zzb.zzi()[0] = -84;
                                this.zzb.zzi()[1] = true == this.zzi ? (byte) 65 : (byte) 64;
                                this.zzg = 2;
                            } else if (iZzn == 65) {
                            }
                            z = true;
                            this.zzi = z;
                            this.zzf = 1;
                            this.zzb.zzi()[0] = -84;
                            this.zzb.zzi()[1] = true == this.zzi ? (byte) 65 : (byte) 64;
                            this.zzg = 2;
                        } else {
                            this.zzh = zzamfVar.zzn() == 172;
                        }
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzamfVar.zzd(), this.zzl - this.zzg);
                zzov.zzb(this.zze, zzamfVar, iMin);
                int i2 = this.zzg + iMin;
                this.zzg = i2;
                int i3 = this.zzl;
                if (i2 == i3) {
                    long j = this.zzm;
                    if (j != -9223372036854775807L) {
                        this.zze.zzv(j, 1, i3, 0, null);
                        this.zzm += this.zzj;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] bArrZzi = this.zzb.zzi();
                int iMin2 = Math.min(zzamfVar.zzd(), 16 - this.zzg);
                zzamfVar.zzm(bArrZzi, this.zzg, iMin2);
                int i4 = this.zzg + iMin2;
                this.zzg = i4;
                if (i4 == 16) {
                    this.zza.zzd(0);
                    zznc zzncVarZza = zznd.zza(this.zza);
                    zzafv zzafvVar = this.zzk;
                    if (zzafvVar == null || zzafvVar.zzy != 2 || zzncVarZza.zza != zzafvVar.zzz || !"audio/ac4".equals(zzafvVar.zzl)) {
                        zzaft zzaftVar = new zzaft();
                        zzaftVar.zzD(this.zzd);
                        zzaftVar.zzN("audio/ac4");
                        zzaftVar.zzaa(2);
                        zzaftVar.zzab(zzncVarZza.zza);
                        zzaftVar.zzG(this.zzc);
                        zzafv zzafvVarZzah = zzaftVar.zzah();
                        this.zzk = zzafvVarZzah;
                        this.zze.zzs(zzafvVarZzah);
                    }
                    this.zzl = zzncVarZza.zzb;
                    this.zzj = (((long) zzncVarZza.zzc) * 1000000) / ((long) this.zzk.zzz);
                    this.zzb.zzh(0);
                    zzov.zzb(this.zze, this.zzb, 16);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }

    public zzsu(String str) {
        zzame zzameVar = new zzame(new byte[16], 16);
        this.zza = zzameVar;
        this.zzb = new zzamf(zzameVar.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
    }
}
