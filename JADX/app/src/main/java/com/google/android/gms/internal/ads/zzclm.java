package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzclm implements zzafy {
    private final zzko zza = new zzko(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzclm() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zza() {
        zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzb() {
        zzn(true);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc() {
        zzn(true);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zzd() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzf(long j, long j2, float f) {
        char c;
        boolean z = true;
        if (j2 > this.zzc) {
            c = 0;
        } else {
            c = j2 < this.zzb ? (char) 2 : (char) 1;
        }
        int iZzg = this.zza.zzg();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || iZzg >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzg(long j, float f, boolean z, long j2) {
        long j3 = z ? this.zze : this.zzd;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzko zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzi(zzahv[] zzahvVarArr, zzs zzsVar, zzjg[] zzjgVarArr) {
        this.zzf = 0;
        for (int i = 0; i < 2; i++) {
            if (zzjgVarArr[i] != null) {
                this.zzf += zzahvVarArr[i].zzac() != 1 ? 131072000 : 13107200;
            }
        }
        this.zza.zzb(this.zzf);
    }

    public final synchronized void zzj(int i) {
        this.zzb = ((long) i) * 1000;
    }

    public final synchronized void zzk(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zze = ((long) i) * 1000;
    }

    final void zzn(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zza();
        }
    }
}
