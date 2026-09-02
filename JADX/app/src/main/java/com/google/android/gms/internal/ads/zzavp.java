package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzavp {
    private final zzavo zza;
    private final boolean zzb;
    private final long zzc;
    private final long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private long zzk;

    public zzavp() {
        this(-1.0d);
    }

    private final boolean zzd(long j, long j2) {
        return Math.abs((j2 - this.zzi) - (j - this.zzj)) > 20000000;
    }

    public final void zza() {
        this.zzh = false;
        if (this.zzb) {
            this.zza.zzb();
        }
    }

    public final void zzb() {
        if (this.zzb) {
            this.zza.zzc();
        }
    }

    public final long zzc(long j, long j2) {
        long j3;
        long j4;
        long j5;
        long j6 = 1000 * j;
        if (this.zzh) {
            if (j != this.zze) {
                this.zzk++;
                this.zzf = this.zzg;
            }
            long j7 = this.zzk;
            if (j7 >= 6) {
                j4 = this.zzf + ((j6 - this.zzj) / j7);
                if (zzd(j4, j2)) {
                    this.zzh = false;
                } else {
                    j3 = (this.zzi + j4) - this.zzj;
                }
            } else if (zzd(j6, j2)) {
                this.zzh = false;
            }
            j3 = j2;
            j4 = j6;
        } else {
            j3 = j2;
            j4 = j6;
        }
        if (!this.zzh) {
            this.zzj = j6;
            this.zzi = j2;
            this.zzk = 0L;
            this.zzh = true;
        }
        this.zze = j;
        this.zzg = j4;
        zzavo zzavoVar = this.zza;
        if (zzavoVar == null || zzavoVar.zza == 0) {
            return j3;
        }
        long j8 = this.zza.zza;
        long j9 = this.zzc;
        long j10 = j8 + (((j3 - j8) / j9) * j9);
        if (j3 <= j10) {
            j5 = j10 - j9;
        } else {
            j10 = j9 + j10;
            j5 = j10;
        }
        if (j10 - j3 >= j3 - j5) {
            j10 = j5;
        }
        return j10 - this.zzd;
    }

    private zzavp(double d) {
        long j;
        boolean z = d != -1.0d;
        this.zzb = z;
        if (z) {
            this.zza = zzavo.zza();
            long j2 = (long) (1.0E9d / d);
            this.zzc = j2;
            j = (j2 * 80) / 100;
        } else {
            this.zza = null;
            j = -1;
            this.zzc = -1L;
        }
        this.zzd = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzavp(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this(windowManager.getDefaultDisplay() != null ? windowManager.getDefaultDisplay().getRefreshRate() : -1.0d);
    }
}
