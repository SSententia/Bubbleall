package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzsm {
    private zzox zzb;
    private zznx zzc;
    private zzsh zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzsf zza = new zzsf();
    private zzsk zzj = new zzsk();

    protected void zza(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzsk();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract long zzb(zzamf zzamfVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzamf zzamfVar, long j, zzsk zzskVar) throws IOException;

    final void zze(zznx zznxVar, zzox zzoxVar) {
        this.zzc = zznxVar;
        this.zzb = zzoxVar;
        zza(true);
    }

    final void zzf(long j, long j2) {
        this.zza.zza();
        if (j == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long jZzi = zzi(j2);
            this.zze = jZzi;
            zzsh zzshVar = this.zzd;
            int i = zzamq.zza;
            zzshVar.zzf(jZzi);
            this.zzh = 2;
        }
    }

    final int zzg(zznv zznvVar, zzoq zzoqVar) throws IOException {
        zzakt.zze(this.zzb);
        int i = zzamq.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zzb(zznvVar)) {
                this.zzk = zznvVar.zzn() - this.zzf;
                if (!zzc(this.zza.zzd(), this.zzf, this.zzj)) {
                    zzafv zzafvVar = this.zzj.zza;
                    this.zzi = zzafvVar.zzz;
                    if (!this.zzm) {
                        this.zzb.zzs(zzafvVar);
                        this.zzm = true;
                    }
                    zzsh zzshVar = this.zzj.zzb;
                    if (zzshVar != null) {
                        this.zzd = zzshVar;
                    } else if (zznvVar.zzo() == -1) {
                        this.zzd = new zzsl(null);
                    } else {
                        zzsg zzsgVarZzc = this.zza.zzc();
                        this.zzd = new zzsa(this, this.zzf, zznvVar.zzo(), zzsgVarZzc.zzd + zzsgVarZzc.zze, zzsgVarZzc.zzb, (zzsgVarZzc.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zze();
                    return 0;
                }
                this.zzf = zznvVar.zzn();
            }
            this.zzh = 3;
            return -1;
        }
        if (i2 == 1) {
            ((zznp) zznvVar).zzd((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        }
        if (i2 != 2) {
            return -1;
        }
        long jZze = this.zzd.zze(zznvVar);
        if (jZze >= 0) {
            zzoqVar.zza = jZze;
            return 1;
        }
        if (jZze < -1) {
            zzj(-(jZze + 2));
        }
        if (!this.zzl) {
            zzot zzotVarZzg = this.zzd.zzg();
            zzakt.zze(zzotVarZzg);
            this.zzc.zzD(zzotVarZzg);
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zzb(zznvVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzamf zzamfVarZzd = this.zza.zzd();
        long jZzb = zzb(zzamfVarZzd);
        if (jZzb >= 0) {
            long j = this.zzg;
            if (j + jZzb >= this.zze) {
                long jZzh = zzh(j);
                zzov.zzb(this.zzb, zzamfVarZzd, zzamfVarZzd.zze());
                this.zzb.zzv(jZzh, 1, zzamfVarZzd.zze(), 0, null);
                this.zze = -1L;
            }
        }
        this.zzg += jZzb;
        return 0;
    }

    protected final long zzh(long j) {
        return (j * 1000000) / ((long) this.zzi);
    }

    protected final long zzi(long j) {
        return (((long) this.zzi) * j) / 1000000;
    }

    protected void zzj(long j) {
        this.zzg = j;
    }
}
