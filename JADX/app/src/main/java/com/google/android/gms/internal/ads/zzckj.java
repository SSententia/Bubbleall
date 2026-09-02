package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckj implements zzatz {
    private final zzatz zza;
    private final long zzb;
    private final zzatz zzc;
    private long zzd;
    private Uri zze;

    zzckj(zzatz zzatzVar, int i, zzatz zzatzVar2) {
        this.zza = zzatzVar;
        this.zzb = i;
        this.zzc = zzatzVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final int zzb(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int iZzb = this.zza.zzb(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + ((long) iZzb);
            this.zzd = j3;
            i3 = iZzb;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.zzb) {
            return i3;
        }
        int iZzb2 = this.zzc.zzb(bArr, i + i3, i2 - i3);
        this.zzd += (long) iZzb2;
        return i3 + iZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final long zza(zzaub zzaubVar) throws IOException {
        zzaub zzaubVar2;
        this.zze = zzaubVar.zza;
        long j = zzaubVar.zzc;
        long j2 = this.zzb;
        zzaub zzaubVar3 = null;
        if (j >= j2) {
            zzaubVar2 = null;
        } else {
            long j3 = zzaubVar.zzd;
            zzaubVar2 = new zzaub(zzaubVar.zza, null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null, 0);
        }
        long j4 = zzaubVar.zzd;
        if (j4 == -1 || zzaubVar.zzc + j4 > this.zzb) {
            long jMax = Math.max(this.zzb, zzaubVar.zzc);
            long j5 = zzaubVar.zzd;
            zzaubVar3 = new zzaub(zzaubVar.zza, null, jMax, jMax, j5 != -1 ? Math.min(j5, (zzaubVar.zzc + j5) - this.zzb) : -1L, null, 0);
        }
        long jZza = zzaubVar2 != null ? this.zza.zza(zzaubVar2) : 0L;
        long jZza2 = zzaubVar3 != null ? this.zzc.zza(zzaubVar3) : 0L;
        this.zzd = zzaubVar.zzc;
        if (jZza2 == -1) {
            return -1L;
        }
        return jZza + jZza2;
    }
}
