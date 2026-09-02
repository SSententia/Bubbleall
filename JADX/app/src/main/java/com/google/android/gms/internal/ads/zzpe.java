package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpe implements zznu {
    private static final int[] zzc;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zznx zzp;
    private zzox zzq;
    private zzot zzr;
    private boolean zzs;
    public static final zzoa zza = zzpd.zza;
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] zzd = zzamq.zzs("#!AMR\n");
    private static final byte[] zze = zzamq.zzs("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        zzf = iArr[8];
    }

    public zzpe() {
        this(0);
    }

    public zzpe(int i) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    private final boolean zze(zznv zznvVar) throws IOException {
        byte[] bArr = zzd;
        if (zzf(zznvVar, bArr)) {
            this.zzh = false;
            ((zznp) zznvVar).zzd(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (!zzf(zznvVar, bArr2)) {
            return false;
        }
        this.zzh = true;
        ((zznp) zznvVar).zzd(bArr2.length, false);
        return true;
    }

    private static boolean zzf(zznv zznvVar, byte[] bArr) throws IOException {
        zznvVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zznp) zznvVar).zzh(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    @RequiresNonNull({"trackOutput"})
    private final int zzg(zznv zznvVar) throws IOException {
        int i = this.zzk;
        if (i == 0) {
            try {
                zznvVar.zzl();
                ((zznp) zznvVar).zzh(this.zzg, 0, 1, false);
                byte b = this.zzg[0];
                if ((b & 131) > 0) {
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b);
                    throw zzaha.zzb(sb.toString(), null);
                }
                int i2 = (b >> 3) & 15;
                boolean z = this.zzh;
                if (!z) {
                    if (!z) {
                        if (i2 >= 12 && i2 <= 14) {
                        }
                    }
                    String str = true != z ? "NB" : "WB";
                    StringBuilder sb2 = new StringBuilder(str.length() + 35);
                    sb2.append("Illegal AMR ");
                    sb2.append(str);
                    sb2.append(" frame type ");
                    sb2.append(i2);
                    throw zzaha.zzb(sb2.toString(), null);
                }
                if (i2 >= 10 && i2 <= 13) {
                    if (!z) {
                        if (i2 >= 12) {
                        }
                    }
                    if (true != z) {
                    }
                    StringBuilder sb3 = new StringBuilder(str.length() + 35);
                    sb3.append("Illegal AMR ");
                    sb3.append(str);
                    sb3.append(" frame type ");
                    sb3.append(i2);
                    throw zzaha.zzb(sb3.toString(), null);
                }
                i = z ? zzc[i2] : zzb[i2];
                this.zzj = i;
                this.zzk = i;
                int i3 = this.zzm;
                if (i3 == -1) {
                    this.zzm = i;
                    i3 = i;
                }
                if (i3 == i) {
                    this.zzn++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iZza = zzov.zza(this.zzq, zznvVar, i, true);
        if (iZza == -1) {
            return -1;
        }
        int i4 = this.zzk - iZza;
        this.zzk = i4;
        if (i4 > 0) {
            return 0;
        }
        this.zzq.zzv(this.zzi, 1, this.zzj, 0, null);
        this.zzi += 20000;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        return zze(zznvVar);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzp = zznxVar;
        this.zzq = zznxVar.zzB(0, 1);
        zznxVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        zzakt.zze(this.zzq);
        int i = zzamq.zza;
        if (zznvVar.zzn() == 0 && !zze(zznvVar)) {
            throw zzaha.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzh;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? 8000 : 16000;
            zzox zzoxVar = this.zzq;
            zzaft zzaftVar = new zzaft();
            zzaftVar.zzN(str);
            zzaftVar.zzO(zzf);
            zzaftVar.zzaa(1);
            zzaftVar.zzab(i2);
            zzoxVar.zzs(zzaftVar.zzah());
        }
        int iZzg = zzg(zznvVar);
        if (this.zzl) {
            return iZzg;
        }
        zzos zzosVar = new zzos(-9223372036854775807L, 0L);
        this.zzr = zzosVar;
        this.zzp.zzD(zzosVar);
        this.zzl = true;
        return iZzg;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }
}
