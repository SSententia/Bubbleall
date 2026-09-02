package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zznl {
    protected final zznf zza;
    protected final zznk zzb;
    protected zznh zzc;
    private final int zzd;

    protected zznl(zzni zzniVar, zznk zznkVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zznkVar;
        this.zzd = i;
        this.zza = new zznf(zzniVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zznv zznvVar, long j, zzoq zzoqVar) {
        if (j == zznvVar.zzn()) {
            return 0;
        }
        zzoqVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zznv zznvVar, long j) throws IOException {
        long jZzn = j - zznvVar.zzn();
        if (jZzn < 0 || jZzn > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((zznp) zznvVar).zzd((int) jZzn, false);
        return true;
    }

    public final zzot zza() {
        return this.zza;
    }

    public final void zzb(long j) {
        zznh zznhVar = this.zzc;
        if (zznhVar == null || zznhVar.zza != j) {
            this.zzc = new zznh(j, this.zza.zzh(j), 0L, this.zza.zzc, this.zza.zzd, this.zza.zze, this.zza.zzf);
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zznv zznvVar, zzoq zzoqVar) throws IOException {
        while (true) {
            zznh zznhVar = this.zzc;
            zzakt.zze(zznhVar);
            long j = zznhVar.zzf;
            long j2 = zznhVar.zzg;
            long j3 = zznhVar.zzh;
            if (j2 - j <= this.zzd) {
                zze(false, j);
                return zzf(zznvVar, j, zzoqVar);
            }
            if (!zzg(zznvVar, j3)) {
                return zzf(zznvVar, j3, zzoqVar);
            }
            zznvVar.zzl();
            zznj zznjVarZza = this.zzb.zza(zznvVar, zznhVar.zzb);
            int i = zznjVarZza.zzb;
            if (i == -3) {
                zze(false, j3);
                return zzf(zznvVar, j3, zzoqVar);
            }
            if (i == -2) {
                zznh.zzf(zznhVar, zznjVarZza.zzc, zznjVarZza.zzd);
            } else {
                if (i != -1) {
                    zzg(zznvVar, zznjVarZza.zzd);
                    zze(true, zznjVarZza.zzd);
                    return zzf(zznvVar, zznjVarZza.zzd, zzoqVar);
                }
                zznh.zzg(zznhVar, zznjVarZza.zzc, zznjVarZza.zzd);
            }
        }
    }

    protected final void zze(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
