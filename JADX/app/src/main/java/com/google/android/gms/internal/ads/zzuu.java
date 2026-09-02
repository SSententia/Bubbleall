package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzuu implements zzut {
    private final zznx zza;
    private final zzox zzb;
    private final zzuw zzc;
    private final zzafv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzuu(zznx zznxVar, zzox zzoxVar, zzuw zzuwVar, String str, int i) throws zzaha {
        this.zza = zznxVar;
        this.zzb = zzoxVar;
        this.zzc = zzuwVar;
        int i2 = (zzuwVar.zzb * zzuwVar.zze) / 8;
        int i3 = zzuwVar.zzd;
        if (i3 != i2) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(i3);
            throw zzaha.zzb(sb.toString(), null);
        }
        int i4 = zzuwVar.zzc * i2;
        int i5 = i4 * 8;
        int iMax = Math.max(i2, i4 / 10);
        this.zze = iMax;
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN(str);
        zzaftVar.zzI(i5);
        zzaftVar.zzJ(i5);
        zzaftVar.zzO(iMax);
        zzaftVar.zzaa(zzuwVar.zzb);
        zzaftVar.zzab(zzuwVar.zzc);
        zzaftVar.zzac(i);
        this.zzd = zzaftVar.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(int i, long j) {
        this.zza.zzD(new zzuz(this.zzc, 1, i, j));
        this.zzb.zzs(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final boolean zzc(zznv zznvVar, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int iZza = zzov.zza(this.zzb, zznvVar, (int) Math.min(i2 - i, j2), true);
            if (iZza == -1) {
                j2 = 0;
            } else {
                this.zzg += iZza;
                j2 -= (long) iZza;
            }
        }
        zzuw zzuwVar = this.zzc;
        int i3 = zzuwVar.zzd;
        int i4 = this.zzg / i3;
        if (i4 > 0) {
            long j3 = this.zzf;
            long jZzH = zzamq.zzH(this.zzh, 1000000L, zzuwVar.zzc);
            int i5 = i4 * i3;
            int i6 = this.zzg - i5;
            this.zzb.zzv(j3 + jZzH, 1, i5, i6, null);
            this.zzh += (long) i4;
            this.zzg = i6;
        }
        return j2 <= 0;
    }
}
