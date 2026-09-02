package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzamh implements zzalp {
    private final zzaku zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzahf zze = zzahf.zza;

    public zzamh(zzaku zzakuVar) {
        this.zza = zzakuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final zzahf zzA() {
        return this.zze;
    }

    public final void zza() {
        if (this.zzb) {
            return;
        }
        this.zzd = SystemClock.elapsedRealtime();
        this.zzb = true;
    }

    public final void zzb() {
        if (this.zzb) {
            zzc(zzy());
            this.zzb = false;
        }
    }

    public final void zzc(long j) {
        this.zzc = j;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final long zzy() {
        long j = this.zzc;
        if (!this.zzb) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
        zzahf zzahfVar = this.zze;
        return j + (zzahfVar.zzb == 1.0f ? zzadx.zzb(jElapsedRealtime) : zzahfVar.zza(jElapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzz(zzahf zzahfVar) {
        if (this.zzb) {
            zzc(zzy());
        }
        this.zze = zzahfVar;
    }
}
