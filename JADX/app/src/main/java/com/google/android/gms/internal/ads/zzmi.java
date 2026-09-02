package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzmi {
    private final zzlw zza = new zzlw();
    private final zzme zzb;
    private final zzmh zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzmi(Context context) {
        zzme zzmeVarZzc;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            zzmeVarZzc = zzamq.zza >= 17 ? zzmg.zzc(applicationContext) : null;
            if (zzmeVarZzc == null) {
                zzmeVarZzc = zzmf.zzc(applicationContext);
            }
        } else {
            zzmeVarZzc = null;
        }
        this.zzb = zzmeVarZzc;
        this.zzc = zzmeVarZzc != null ? zzmh.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    private final void zzm() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzn() {
        if (zzamq.zza < 30 || this.zze == null) {
            return;
        }
        float fZzg = this.zza.zzc() ? this.zza.zzg() : this.zzf;
        float f = this.zzg;
        if (fZzg == f) {
            return;
        }
        if (fZzg != -1.0f && f != -1.0f) {
            float f2 = 1.0f;
            if (this.zza.zzc() && this.zza.zze() >= 5000000000L) {
                f2 = 0.02f;
            }
            if (Math.abs(fZzg - this.zzg) < f2) {
                return;
            }
        } else if (fZzg == -1.0f && this.zza.zzd() < 30) {
            return;
        }
        this.zzg = fZzg;
        zzo(false);
    }

    private final void zzo(boolean z) {
        Surface surface;
        if (zzamq.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzmc.zza(surface, f);
        }
    }

    private final void zzp() {
        Surface surface;
        if (zzamq.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzmc.zza(surface, 0.0f);
    }

    public final void zza(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzo(true);
    }

    public final void zzc() {
        this.zzd = true;
        zzm();
        zzo(false);
    }

    public final void zzd(Surface surface) {
        if (true == (surface instanceof zzlu)) {
            surface = null;
        }
        if (this.zze == surface) {
            return;
        }
        zzp();
        this.zze = surface;
        zzo(true);
    }

    public final void zze() {
        zzm();
    }

    public final void zzf(float f) {
        this.zzi = f;
        zzm();
        zzo(false);
    }

    public final void zzg(float f) {
        this.zzf = f;
        this.zza.zza();
        zzn();
    }

    public final void zzh(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zzb(j * 1000);
        zzn();
    }

    public final void zzi() {
        this.zzd = false;
        zzp();
    }

    public final void zzj() {
        zzme zzmeVar = this.zzb;
        if (zzmeVar != null) {
            zzmeVar.zzb();
            zzmh zzmhVar = this.zzc;
            zzmhVar.getClass();
            zzmhVar.zzc();
        }
    }

    public final long zzk(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzc()) {
            long jZzf = this.zzq + ((long) ((this.zza.zzf() * (this.zzm - this.zzp)) / this.zzi));
            if (Math.abs(j - jZzf) <= 20000000) {
                j = jZzf;
            } else {
                zzm();
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzmh zzmhVar = this.zzc;
        if (zzmhVar == null || this.zzk == -9223372036854775807L) {
            return j;
        }
        long j3 = zzmhVar.zza;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.zzk;
        long j5 = j3 + (((j - j3) / j4) * j4);
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            j5 = j4 + j5;
            j2 = j5;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.zzl;
    }

    final /* bridge */ /* synthetic */ void zzl(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.zzk = refreshRate;
            this.zzl = (refreshRate * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.zzk = -9223372036854775807L;
            this.zzl = -9223372036854775807L;
        }
    }

    public final void zzb() {
        if (this.zzb != null) {
            zzmh zzmhVar = this.zzc;
            zzmhVar.getClass();
            zzmhVar.zzb();
            this.zzb.zza(new zzmd(this) { // from class: com.google.android.gms.internal.ads.zzmb
                private final zzmi zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzmd
                public final void zza(Display display) {
                    this.zza.zzl(display);
                }
            });
        }
    }
}
