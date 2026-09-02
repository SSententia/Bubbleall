package com.google.android.gms.internal.ads;

import androidx.media2.widget.Cea708CCParser;
import com.squareup.okhttp.internal.http.StatusLine;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzus implements zzut {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, Cea708CCParser.Const.CODE_C1_CW2, 143, Cea708CCParser.Const.CODE_C1_DF5, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zznx zzc;
    private final zzox zzd;
    private final zzuw zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzamf zzh;
    private final int zzi;
    private final zzafv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzus(zznx zznxVar, zzox zzoxVar, zzuw zzuwVar) throws zzaha {
        this.zzc = zznxVar;
        this.zzd = zzoxVar;
        this.zze = zzuwVar;
        int iMax = Math.max(1, zzuwVar.zzc / 10);
        this.zzi = iMax;
        zzamf zzamfVar = new zzamf(zzuwVar.zzf);
        zzamfVar.zzp();
        int iZzp = zzamfVar.zzp();
        this.zzf = iZzp;
        int i = zzuwVar.zzb;
        int i2 = (((zzuwVar.zzd - (i * 4)) * 8) / (zzuwVar.zze * i)) + 1;
        if (iZzp != i2) {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(iZzp);
            throw zzaha.zzb(sb.toString(), null);
        }
        int iZzw = zzamq.zzw(iMax, iZzp);
        this.zzg = new byte[zzuwVar.zzd * iZzw];
        this.zzh = new zzamf(iZzw * (iZzp + iZzp) * i);
        int i3 = ((zzuwVar.zzc * zzuwVar.zzd) * 8) / iZzp;
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN("audio/raw");
        zzaftVar.zzI(i3);
        zzaftVar.zzJ(i3);
        zzaftVar.zzO((iMax + iMax) * i);
        zzaftVar.zzaa(zzuwVar.zzb);
        zzaftVar.zzab(zzuwVar.zzc);
        zzaftVar.zzac(2);
        this.zzj = zzaftVar.zzah();
    }

    private final void zzd(int i) {
        long j = this.zzl;
        long jZzH = zzamq.zzH(this.zzn, 1000000L, this.zze.zzc);
        int iZzf = zzf(i);
        this.zzd.zzv(j + jZzH, 1, iZzf, this.zzm - iZzf, null);
        this.zzn += (long) i;
        this.zzm -= iZzf;
    }

    private final int zze(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zzf(int i) {
        return (i + i) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(int i, long j) {
        this.zzc.zzD(new zzuz(this.zze, this.zzf, i, j));
        this.zzd.zzs(this.zzj);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d A[LOOP:0: B:6:0x0021->B:12:0x003d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x001e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:4:0x001e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.zzut
    public final boolean zzc(com.google.android.gms.internal.ads.zznv r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzus.zzc(com.google.android.gms.internal.ads.zznv, long):boolean");
    }
}
