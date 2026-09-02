package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpn implements zznu {
    public static final zzoa zza = zzpm.zza;
    private zznx zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzpl zzp;
    private zzpr zzq;
    private final zzamf zzb = new zzamf(4);
    private final zzamf zzc = new zzamf(9);
    private final zzamf zzd = new zzamf(11);
    private final zzamf zze = new zzamf();
    private final zzpo zzf = new zzpo();
    private int zzh = 1;

    private final zzamf zze(zznv zznvVar) throws IOException {
        if (this.zzm > this.zze.zzj()) {
            zzamf zzamfVar = this.zze;
            int iZzj = zzamfVar.zzj();
            zzamfVar.zzb(new byte[Math.max(iZzj + iZzj, this.zzm)], 0);
        } else {
            this.zze.zzh(0);
        }
        this.zze.zzf(this.zzm);
        ((zznp) zznvVar).zza(this.zze.zzi(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzD(new zzos(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        zznp zznpVar = (zznp) zznvVar;
        zznpVar.zzh(this.zzb.zzi(), 0, 3, false);
        this.zzb.zzh(0);
        if (this.zzb.zzr() != 4607062) {
            return false;
        }
        zznpVar.zzh(this.zzb.zzi(), 0, 2, false);
        this.zzb.zzh(0);
        if ((this.zzb.zzo() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zznpVar.zzh(this.zzb.zzi(), 0, 4, false);
        this.zzb.zzh(0);
        int iZzv = this.zzb.zzv();
        zznvVar.zzl();
        zznpVar.zzj(iZzv, false);
        zznpVar.zzh(this.zzb.zzi(), 0, 4, false);
        this.zzb.zzh(0);
        return this.zzb.zzv() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzg = zznxVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        long j;
        boolean zZzf;
        boolean z;
        long j2;
        zzakt.zze(this.zzg);
        while (true) {
            int i = this.zzh;
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    ((zznp) zznvVar).zzd(this.zzk, false);
                    this.zzk = 0;
                    this.zzh = 3;
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (this.zzi) {
                        j = this.zzj + this.zzn;
                    } else {
                        j = this.zzf.zzc() == -9223372036854775807L ? 0L : this.zzn;
                    }
                    int i3 = this.zzl;
                    if (i3 == 8) {
                        if (this.zzp != null) {
                            zzf();
                            zZzf = this.zzp.zzf(zze(zznvVar), j);
                        }
                        z = true;
                        if (!this.zzi && zZzf) {
                            this.zzi = true;
                            if (this.zzf.zzc() == -9223372036854775807L) {
                                j2 = -this.zzn;
                            } else {
                                j2 = 0;
                            }
                            this.zzj = j2;
                        }
                        this.zzk = 4;
                        this.zzh = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        i2 = i3;
                    }
                    if (i2 == 9) {
                        if (this.zzq != null) {
                            zzf();
                            zZzf = this.zzq.zzf(zze(zznvVar), j);
                            z = true;
                        } else {
                            ((zznp) zznvVar).zzd(this.zzm, false);
                            zZzf = false;
                            z = false;
                        }
                    } else if (i2 != 18 || this.zzo) {
                        ((zznp) zznvVar).zzd(this.zzm, false);
                        zZzf = false;
                        z = false;
                    } else {
                        zZzf = this.zzf.zzf(zze(zznvVar), j);
                        long jZzc = this.zzf.zzc();
                        if (jZzc != -9223372036854775807L) {
                            this.zzg.zzD(new zzom(this.zzf.zze(), this.zzf.zzd(), jZzc));
                            this.zzo = true;
                        }
                        z = true;
                    }
                    if (!this.zzi) {
                        this.zzi = true;
                        if (this.zzf.zzc() == -9223372036854775807L) {
                            j2 = -this.zzn;
                        } else {
                            j2 = 0;
                        }
                        this.zzj = j2;
                    }
                    this.zzk = 4;
                    this.zzh = 2;
                    if (z) {
                        return 0;
                    }
                } else {
                    if (!zznvVar.zza(this.zzd.zzi(), 0, 11, true)) {
                        return -1;
                    }
                    this.zzd.zzh(0);
                    this.zzl = this.zzd.zzn();
                    this.zzm = this.zzd.zzr();
                    this.zzn = this.zzd.zzr();
                    this.zzn = (((long) (this.zzd.zzn() << 24)) | this.zzn) * 1000;
                    this.zzd.zzk(3);
                    this.zzh = 4;
                }
            } else {
                if (!zznvVar.zza(this.zzc.zzi(), 0, 9, true)) {
                    return -1;
                }
                this.zzc.zzh(0);
                this.zzc.zzk(4);
                int iZzn = this.zzc.zzn();
                int i4 = iZzn & 1;
                if ((iZzn & 4) != 0 && this.zzp == null) {
                    this.zzp = new zzpl(this.zzg.zzB(8, 1));
                }
                if (i4 != 0 && this.zzq == null) {
                    this.zzq = new zzpr(this.zzg.zzB(9, 2));
                }
                this.zzg.zzC();
                this.zzk = this.zzc.zzv() - 5;
                this.zzh = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }
}
