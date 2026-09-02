package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpk implements zznu {
    public static final zzoa zza = zzpj.zza;
    private final byte[] zzb;
    private final zzamf zzc;
    private final zzob zzd;
    private zznx zze;
    private zzox zzf;
    private int zzg;
    private zzaiv zzh;
    private zzoh zzi;
    private int zzj;
    private int zzk;
    private zzpi zzl;
    private int zzm;
    private long zzn;

    public zzpk() {
        this(0);
    }

    private final long zze(zzamf zzamfVar, boolean z) {
        boolean zZza;
        this.zzi.getClass();
        int iZzg = zzamfVar.zzg();
        while (iZzg <= zzamfVar.zze() - 16) {
            zzamfVar.zzh(iZzg);
            if (zzoc.zza(zzamfVar, this.zzi, this.zzk, this.zzd)) {
                zzamfVar.zzh(iZzg);
                return this.zzd.zza;
            }
            iZzg++;
        }
        if (!z) {
            zzamfVar.zzh(iZzg);
            return -1L;
        }
        while (iZzg <= zzamfVar.zze() - this.zzj) {
            zzamfVar.zzh(iZzg);
            try {
                zZza = zzoc.zza(zzamfVar, this.zzi, this.zzk, this.zzd);
            } catch (IndexOutOfBoundsException unused) {
                zZza = false;
            }
            if (zzamfVar.zzg() <= zzamfVar.zze() && zZza) {
                zzamfVar.zzh(iZzg);
                return this.zzd.zza;
            }
            iZzg++;
        }
        zzamfVar.zzh(zzamfVar.zze());
        return -1L;
    }

    private final void zzf() {
        long j = this.zzn;
        zzoh zzohVar = this.zzi;
        int i = zzamq.zza;
        this.zzf.zzv((j * 1000000) / ((long) zzohVar.zze), 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws Throwable {
        zzoe.zza(zznvVar, false);
        zzamf zzamfVar = new zzamf(4);
        ((zznp) zznvVar).zzh(zzamfVar.zzi(), 0, 4, false);
        return zzamfVar.zzt() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zze = zznxVar;
        this.zzf = zznxVar.zzB(0, 1);
        zznxVar.zzC();
    }

    public zzpk(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzamf(new byte[32768], 0);
        this.zzd = new zzob();
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzpi zzpiVar = this.zzl;
            if (zzpiVar != null) {
                zzpiVar.zzb(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws Throwable {
        boolean zZzg;
        zzoh zzohVar;
        zzot zzosVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zznvVar.zzl();
            long jZzm = zznvVar.zzm();
            zzaiv zzaivVarZza = zzoe.zza(zznvVar, true);
            ((zznp) zznvVar).zzd((int) (zznvVar.zzm() - jZzm), false);
            this.zzh = zzaivVarZza;
            this.zzg = 1;
            return 0;
        }
        if (i == 1) {
            ((zznp) zznvVar).zzh(this.zzb, 0, 42, false);
            zznvVar.zzl();
            this.zzg = 2;
            return 0;
        }
        if (i == 2) {
            zzamf zzamfVar = new zzamf(4);
            ((zznp) zznvVar).zza(zzamfVar.zzi(), 0, 4, false);
            if (zzamfVar.zzt() != 1716281667) {
                throw zzaha.zzb("Failed to read FLAC stream marker.", null);
            }
            this.zzg = 3;
            return 0;
        }
        if (i == 3) {
            zzod zzodVar = new zzod(this.zzi);
            do {
                zznvVar.zzl();
                zzame zzameVar = new zzame(new byte[4], 4);
                zznp zznpVar = (zznp) zznvVar;
                zznpVar.zzh(zzameVar.zza, 0, 4, false);
                zZzg = zzameVar.zzg();
                int iZzh = zzameVar.zzh(7);
                int iZzh2 = zzameVar.zzh(24) + 4;
                if (iZzh == 0) {
                    byte[] bArr = new byte[38];
                    zznpVar.zza(bArr, 0, 38, false);
                    zzodVar.zza = new zzoh(bArr, 4);
                } else {
                    zzoh zzohVar2 = zzodVar.zza;
                    if (zzohVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iZzh == 3) {
                        zzamf zzamfVar2 = new zzamf(iZzh2);
                        zznpVar.zza(zzamfVar2.zzi(), 0, iZzh2, false);
                        zzodVar.zza = zzohVar2.zze(zzoe.zzb(zzamfVar2));
                    } else if (iZzh == 4) {
                        zzamf zzamfVar3 = new zzamf(iZzh2);
                        zznpVar.zza(zzamfVar3.zzi(), 0, iZzh2, false);
                        zzamfVar3.zzk(4);
                        zzodVar.zza = zzohVar2.zzf(Arrays.asList(zzpc.zzb(zzamfVar3, false, false).zzb));
                    } else if (iZzh == 6) {
                        zzamf zzamfVar4 = new zzamf(iZzh2);
                        zznpVar.zza(zzamfVar4.zzi(), 0, iZzh2, false);
                        zzamfVar4.zzk(4);
                        int iZzv = zzamfVar4.zzv();
                        String strZzE = zzamfVar4.zzE(zzamfVar4.zzv(), zzfll.zza);
                        String strZzE2 = zzamfVar4.zzE(zzamfVar4.zzv(), zzfll.zzc);
                        int iZzv2 = zzamfVar4.zzv();
                        int iZzv3 = zzamfVar4.zzv();
                        int iZzv4 = zzamfVar4.zzv();
                        int iZzv5 = zzamfVar4.zzv();
                        int iZzv6 = zzamfVar4.zzv();
                        byte[] bArr2 = new byte[iZzv6];
                        zzamfVar4.zzm(bArr2, 0, iZzv6);
                        zzodVar.zza = zzohVar2.zzg(Collections.singletonList(new zzajc(iZzv, strZzE, strZzE2, iZzv2, iZzv3, iZzv4, iZzv5, bArr2)));
                    } else {
                        zznpVar.zzd(iZzh2, false);
                    }
                }
                zzohVar = zzodVar.zza;
                int i2 = zzamq.zza;
                this.zzi = zzohVar;
            } while (!zZzg);
            zzohVar.getClass();
            this.zzj = Math.max(zzohVar.zzc, 6);
            this.zzf.zzs(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        }
        if (i == 4) {
            zznvVar.zzl();
            zzamf zzamfVar5 = new zzamf(2);
            ((zznp) zznvVar).zzh(zzamfVar5.zzi(), 0, 2, false);
            int iZzo = zzamfVar5.zzo();
            if ((iZzo >> 2) != 16382) {
                zznvVar.zzl();
                throw zzaha.zzb("First frame does not start with sync code.", null);
            }
            zznvVar.zzl();
            this.zzk = iZzo;
            zznx zznxVar = this.zze;
            int i3 = zzamq.zza;
            long jZzn = zznvVar.zzn();
            long jZzo = zznvVar.zzo();
            zzoh zzohVar3 = this.zzi;
            zzohVar3.getClass();
            if (zzohVar3.zzk != null) {
                zzosVar = new zzof(zzohVar3, jZzn);
            } else if (jZzo == -1 || zzohVar3.zzj <= 0) {
                zzosVar = new zzos(zzohVar3.zza(), 0L);
            } else {
                zzpi zzpiVar = new zzpi(zzohVar3, this.zzk, jZzn, jZzo);
                this.zzl = zzpiVar;
                zzosVar = zzpiVar.zza();
            }
            zznxVar.zzD(zzosVar);
            this.zzg = 5;
            return 0;
        }
        this.zzf.getClass();
        this.zzi.getClass();
        zzpi zzpiVar2 = this.zzl;
        if (zzpiVar2 != null && zzpiVar2.zzc()) {
            return this.zzl.zzd(zznvVar, zzoqVar);
        }
        if (this.zzn == -1) {
            this.zzn = zzoc.zzb(zznvVar, this.zzi);
            return 0;
        }
        int iZze = this.zzc.zze();
        if (iZze < 32768) {
            int iZzg = zznvVar.zzg(this.zzc.zzi(), iZze, 32768 - iZze);
            z = iZzg == -1;
            if (!z) {
                this.zzc.zzf(iZze + iZzg);
            } else if (this.zzc.zzd() == 0) {
                zzf();
                return -1;
            }
        } else {
            z = false;
        }
        int iZzg2 = this.zzc.zzg();
        int i4 = this.zzm;
        int i5 = this.zzj;
        if (i4 < i5) {
            zzamf zzamfVar6 = this.zzc;
            zzamfVar6.zzk(Math.min(i5 - i4, zzamfVar6.zzd()));
        }
        long jZze = zze(this.zzc, z);
        int iZzg3 = this.zzc.zzg() - iZzg2;
        this.zzc.zzh(iZzg2);
        zzov.zzb(this.zzf, this.zzc, iZzg3);
        this.zzm += iZzg3;
        if (jZze != -1) {
            zzf();
            this.zzm = 0;
            this.zzn = jZze;
        }
        if (this.zzc.zzd() >= 16) {
            return 0;
        }
        int iZzd = this.zzc.zzd();
        System.arraycopy(this.zzc.zzi(), this.zzc.zzg(), this.zzc.zzi(), 0, iZzd);
        this.zzc.zzh(0);
        this.zzc.zzf(iZzd);
        return 0;
    }
}
