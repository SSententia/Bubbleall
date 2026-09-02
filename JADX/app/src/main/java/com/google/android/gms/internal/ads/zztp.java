package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztp implements zztb {
    private final zzamf zza;
    private final zzon zzb;
    private final String zzc;
    private zzox zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zztp() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zze = zzunVar.zzc();
        this.zzd = zznxVar.zzB(zzunVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzd(zzamf zzamfVar) {
        zzakt.zze(this.zzd);
        while (zzamfVar.zzd() > 0) {
            int i = this.zzf;
            if (i == 0) {
                byte[] bArrZzi = zzamfVar.zzi();
                int iZzg = zzamfVar.zzg();
                int iZze = zzamfVar.zze();
                while (true) {
                    if (iZzg >= iZze) {
                        zzamfVar.zzh(iZze);
                        break;
                    }
                    byte b = bArrZzi[iZzg];
                    boolean z = (b & UByte.MAX_VALUE) == 255;
                    boolean z2 = this.zzi && (b & 224) == 224;
                    this.zzi = z;
                    if (z2) {
                        zzamfVar.zzh(iZzg + 1);
                        this.zzi = false;
                        this.zza.zzi()[1] = bArrZzi[iZzg];
                        this.zzg = 2;
                        this.zzf = 1;
                        break;
                    }
                    iZzg++;
                }
            } else if (i != 1) {
                int iMin = Math.min(zzamfVar.zzd(), this.zzk - this.zzg);
                zzov.zzb(this.zzd, zzamfVar, iMin);
                int i2 = this.zzg + iMin;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 >= i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zzd.zzv(j, 1, i3, 0, null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int iMin2 = Math.min(zzamfVar.zzd(), 4 - this.zzg);
                zzamfVar.zzm(this.zza.zzi(), this.zzg, iMin2);
                int i4 = this.zzg + iMin2;
                this.zzg = i4;
                if (i4 >= 4) {
                    this.zza.zzh(0);
                    if (this.zzb.zza(this.zza.zzv())) {
                        zzon zzonVar = this.zzb;
                        this.zzk = zzonVar.zzc;
                        if (!this.zzh) {
                            this.zzj = (((long) zzonVar.zzg) * 1000000) / ((long) zzonVar.zzd);
                            zzaft zzaftVar = new zzaft();
                            zzaftVar.zzD(this.zze);
                            zzaftVar.zzN(this.zzb.zzb);
                            zzaftVar.zzO(4096);
                            zzaftVar.zzaa(this.zzb.zze);
                            zzaftVar.zzab(this.zzb.zzd);
                            zzaftVar.zzG(this.zzc);
                            this.zzd.zzs(zzaftVar.zzah());
                            this.zzh = true;
                        }
                        this.zza.zzh(0);
                        zzov.zzb(this.zzd, this.zza, 4);
                        this.zzf = 2;
                    } else {
                        this.zzg = 0;
                        this.zzf = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }

    public zztp(String str) {
        this.zzf = 0;
        zzamf zzamfVar = new zzamf(4);
        this.zza = zzamfVar;
        zzamfVar.zzi()[0] = -1;
        this.zzb = new zzon();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
