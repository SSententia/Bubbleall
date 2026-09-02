package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcjy {
    private final zzauc zza = new zzauc(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcjy() {
    }

    public final void zza() {
        zzk(false);
    }

    public final void zzb(zzanr[] zzanrVarArr, zzatg zzatgVar, zzats zzatsVar) {
        this.zzf = 0;
        for (int i = 0; i < 2; i++) {
            if (zzatsVar.zza(i) != null) {
                this.zzf += zzave.zzq(zzanrVarArr[i].zza());
            }
        }
        this.zza.zzb(this.zzf);
    }

    public final void zzc() {
        zzk(true);
    }

    public final void zzd() {
        zzk(true);
    }

    public final synchronized boolean zze(long j, boolean z) {
        try {
            long j2 = z ? this.zze : this.zzd;
            return j2 <= 0 || j >= j2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzf(long j) {
        boolean z;
        char c;
        z = true;
        if (j > this.zzc) {
            c = 0;
        } else {
            c = j < this.zzb ? (char) 2 : (char) 1;
        }
        int iZzg = this.zza.zzg();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || iZzg >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    public final synchronized void zzg(int i) {
        this.zzb = ((long) i) * 1000;
    }

    public final synchronized void zzh(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzi(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzj(int i) {
        this.zze = ((long) i) * 1000;
    }

    final void zzk(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zza();
        }
    }

    public final zzauc zzl() {
        return this.zza;
    }
}
