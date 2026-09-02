package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.media2.session.SessionCommand;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaea implements zzafy {
    private final zzko zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private int zzg;
    private boolean zzh;

    public zzaea() {
        zzko zzkoVar = new zzko(true, 65536);
        zzk(2500, 0, "bufferForPlaybackMs", "0");
        zzk(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzk(SessionCommand.COMMAND_CODE_LIBRARY_GET_LIBRARY_ROOT, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzk(SessionCommand.COMMAND_CODE_LIBRARY_GET_LIBRARY_ROOT, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzk(SessionCommand.COMMAND_CODE_LIBRARY_GET_LIBRARY_ROOT, SessionCommand.COMMAND_CODE_LIBRARY_GET_LIBRARY_ROOT, "maxBufferMs", "minBufferMs");
        zzk(0, 0, "backBufferDurationMs", "0");
        this.zza = zzkoVar;
        this.zzb = zzadx.zzb(50000L);
        this.zzc = zzadx.zzb(50000L);
        this.zzd = zzadx.zzb(2500L);
        this.zze = zzadx.zzb(5000L);
        this.zzg = 13107200;
        this.zzf = zzadx.zzb(0L);
    }

    private final void zzj(boolean z) {
        this.zzg = 13107200;
        this.zzh = false;
        if (z) {
            this.zza.zza();
        }
    }

    private static void zzk(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        zzakt.zzb(z, sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zza() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzb() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzf(long j, long j2, float f) {
        int iZzg = this.zza.zzg();
        int i = this.zzg;
        long jMin = this.zzb;
        if (f > 1.0f) {
            jMin = Math.min(zzamq.zzJ(jMin, f), this.zzc);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            boolean z = iZzg < i;
            this.zzh = z;
            if (!z && j2 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.zzc || iZzg >= i) {
            this.zzh = false;
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzg(long j, float f, boolean z, long j2) {
        long jZzK = zzamq.zzK(j, f);
        long jMin = z ? this.zze : this.zzd;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        return jMin <= 0 || jZzK >= jMin || this.zza.zzg() >= this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzko zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzi(zzahv[] zzahvVarArr, zzs zzsVar, zzjg[] zzjgVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= 2) {
                int iMax = Math.max(13107200, i2);
                this.zzg = iMax;
                this.zza.zzb(iMax);
                return;
            } else {
                if (zzjgVarArr[i] != null) {
                    i2 += zzahvVarArr[i].zzac() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }
}
