package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapn {
    private static final byte[] zza = new byte[4096];
    private final zzatz zzb;
    private final long zzc;
    private long zzd;
    private byte[] zze = new byte[65536];
    private int zzf;
    private int zzg;

    public zzapn(zzatz zzatzVar, long j, long j2) {
        this.zzb = zzatzVar;
        this.zzd = j;
        this.zzc = j2;
    }

    private final int zzj(int i) {
        int iMin = Math.min(this.zzg, i);
        zzl(iMin);
        return iMin;
    }

    private final int zzk(byte[] bArr, int i, int i2) {
        int i3 = this.zzg;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.zze, 0, bArr, i, iMin);
        zzl(iMin);
        return iMin;
    }

    private final void zzl(int i) {
        int i2 = this.zzg - i;
        this.zzg = i2;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.zze = bArr2;
    }

    private final int zzm(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iZzb = this.zzb.zzb(bArr, i + i3, i2 - i3);
        if (iZzb != -1) {
            return i3 + iZzb;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private final void zzn(int i) {
        if (i != -1) {
            this.zzd += (long) i;
        }
    }

    public final int zza(byte[] bArr, int i, int i2) throws InterruptedException, IOException {
        int iZzk = zzk(bArr, i, i2);
        if (iZzk == 0) {
            iZzk = zzm(bArr, i, i2, 0, true);
        }
        zzn(iZzk);
        return iZzk;
    }

    public final boolean zzb(byte[] bArr, int i, int i2, boolean z) throws InterruptedException, IOException {
        int iZzk = zzk(bArr, i, i2);
        while (iZzk < i2 && iZzk != -1) {
            iZzk = zzm(bArr, i, i2, iZzk, z);
        }
        zzn(iZzk);
        return iZzk != -1;
    }

    public final int zzc(int i) throws InterruptedException, IOException {
        int iZzj = zzj(i);
        if (iZzj == 0) {
            iZzj = zzm(zza, 0, Math.min(i, 4096), 0, true);
        }
        zzn(iZzj);
        return iZzj;
    }

    public final boolean zzd(int i, boolean z) throws InterruptedException, IOException {
        int iZzj = zzj(i);
        while (iZzj < i && iZzj != -1) {
            iZzj = zzm(zza, -iZzj, Math.min(i, iZzj + 4096), iZzj, false);
        }
        zzn(iZzj);
        return iZzj != -1;
    }

    public final boolean zze(byte[] bArr, int i, int i2, boolean z) throws InterruptedException, IOException {
        if (!zzf(i2, false)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i2, bArr, i, i2);
        return true;
    }

    public final boolean zzf(int i, boolean z) throws InterruptedException, IOException {
        int i2 = this.zzf + i;
        int length = this.zze.length;
        if (i2 > length) {
            this.zze = Arrays.copyOf(this.zze, zzave.zzf(length + length, 65536 + i2, i2 + 524288));
        }
        int iMin = Math.min(this.zzg - this.zzf, i);
        while (iMin < i) {
            iMin = zzm(this.zze, this.zzf, i, iMin, false);
            if (iMin == -1) {
                return false;
            }
        }
        int i3 = this.zzf + i;
        this.zzf = i3;
        this.zzg = Math.max(this.zzg, i3);
        return true;
    }

    public final void zzg() {
        this.zzf = 0;
    }

    public final long zzh() {
        return this.zzd;
    }

    public final long zzi() {
        return this.zzc;
    }
}
