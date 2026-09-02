package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztg implements zztb {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzuq zzb;
    private final zzamf zzc;
    private final boolean[] zzd;
    private final zzte zze;
    private final zztq zzf;
    private zztf zzg;
    private long zzh;
    private String zzi;
    private zzox zzj;
    private boolean zzk;
    private long zzl;

    public zztg() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        zzalw.zze(this.zzd);
        this.zze.zza();
        zztf zztfVar = this.zzg;
        if (zztfVar != null) {
            zztfVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzi = zzunVar.zzc();
        zzox zzoxVarZzB = zznxVar.zzB(zzunVar.zzb(), 2);
        this.zzj = zzoxVarZzB;
        this.zzg = new zztf(zzoxVarZzB);
        this.zzb.zza(zznxVar, zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0110  */
    /* JADX WARN: Code duplicated, block: B:50:0x0181  */
    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzd(zzamf zzamfVar) {
        int i;
        int i2;
        zzakt.zze(this.zzg);
        zzakt.zze(this.zzj);
        int iZzg = zzamfVar.zzg();
        int iZze = zzamfVar.zze();
        byte[] bArrZzi = zzamfVar.zzi();
        this.zzh += (long) zzamfVar.zzd();
        zzov.zzb(this.zzj, zzamfVar, zzamfVar.zzd());
        while (true) {
            int iZzd = zzalw.zzd(bArrZzi, iZzg, iZze, this.zzd);
            if (iZzd == iZze) {
                break;
            }
            int i3 = iZzd + 3;
            int i4 = zzamfVar.zzi()[i3] & UByte.MAX_VALUE;
            int i5 = iZzd - iZzg;
            if (!this.zzk) {
                if (i5 > 0) {
                    this.zze.zzc(bArrZzi, iZzg, iZzd);
                }
                if (this.zze.zzb(i4, i5 < 0 ? -i5 : 0)) {
                    zzox zzoxVar = this.zzj;
                    zzte zzteVar = this.zze;
                    int i6 = zzteVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzteVar.zzc, zzteVar.zza);
                    zzame zzameVar = new zzame(bArrCopyOf, bArrCopyOf.length);
                    zzameVar.zzk(i6);
                    zzameVar.zzk(4);
                    zzameVar.zze();
                    zzameVar.zzf(8);
                    if (zzameVar.zzg()) {
                        zzameVar.zzf(4);
                        zzameVar.zzf(3);
                    }
                    int iZzh = zzameVar.zzh(4);
                    float f = 1.0f;
                    if (iZzh == 15) {
                        int iZzh2 = zzameVar.zzh(8);
                        int iZzh3 = zzameVar.zzh(8);
                        if (iZzh3 == 0) {
                            Log.w("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = iZzh2 / iZzh3;
                        }
                    } else if (iZzh < 7) {
                        f = zza[iZzh];
                    } else {
                        Log.w("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzameVar.zzg()) {
                        zzameVar.zzf(2);
                        zzameVar.zzf(1);
                        if (zzameVar.zzg()) {
                            zzameVar.zzf(15);
                            zzameVar.zze();
                            zzameVar.zzf(15);
                            zzameVar.zze();
                            zzameVar.zzf(15);
                            zzameVar.zze();
                            zzameVar.zzf(3);
                            zzameVar.zzf(11);
                            zzameVar.zze();
                            zzameVar.zzf(15);
                            zzameVar.zze();
                            i2 = 2;
                        } else {
                            i2 = 2;
                        }
                    } else {
                        i2 = 2;
                    }
                    if (zzameVar.zzh(i2) != 0) {
                        Log.w("H263Reader", "Unhandled video object layer shape");
                    }
                    zzameVar.zze();
                    int iZzh4 = zzameVar.zzh(16);
                    zzameVar.zze();
                    if (zzameVar.zzg()) {
                        if (iZzh4 == 0) {
                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = 0;
                            for (int i8 = iZzh4 - 1; i8 > 0; i8 >>= 1) {
                                i7++;
                            }
                            zzameVar.zzf(i7);
                        }
                    }
                    zzameVar.zze();
                    int iZzh5 = zzameVar.zzh(13);
                    zzameVar.zze();
                    int iZzh6 = zzameVar.zzh(13);
                    zzameVar.zze();
                    zzameVar.zze();
                    zzaft zzaftVar = new zzaft();
                    zzaftVar.zzD(str);
                    zzaftVar.zzN("video/mp4v-es");
                    zzaftVar.zzS(iZzh5);
                    zzaftVar.zzT(iZzh6);
                    zzaftVar.zzW(f2);
                    zzaftVar.zzP(Collections.singletonList(bArrCopyOf));
                    zzoxVar.zzs(zzaftVar.zzah());
                    this.zzk = true;
                }
            }
            this.zzg.zzc(bArrZzi, iZzg, iZzd);
            zztq zztqVar = this.zzf;
            if (i5 > 0) {
                zztqVar.zzd(bArrZzi, iZzg, iZzd);
                i = 0;
            } else {
                i = -i5;
            }
            if (this.zzf.zze(i)) {
                zztq zztqVar2 = this.zzf;
                int iZza = zzalw.zza(zztqVar2.zza, zztqVar2.zzb);
                zzamf zzamfVar2 = this.zzc;
                int i9 = zzamq.zza;
                zzamfVar2.zzb(this.zzf.zza, iZza);
                this.zzb.zzb(this.zzl, this.zzc);
            }
            if (i4 == 178) {
                if (zzamfVar.zzi()[iZzd + 2] == 1) {
                    this.zzf.zzc(178);
                }
                i4 = 178;
            }
            int i10 = iZze - iZzd;
            this.zzg.zzd(this.zzh - ((long) i10), i10, this.zzk);
            this.zzg.zzb(i4, this.zzl);
            iZzg = i3;
        }
        if (!this.zzk) {
            this.zze.zzc(bArrZzi, iZzg, iZze);
        }
        this.zzg.zzc(bArrZzi, iZzg, iZze);
        this.zzf.zzd(bArrZzi, iZzg, iZze);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }

    zztg(zzuq zzuqVar) {
        this.zzb = zzuqVar;
        this.zzd = new boolean[4];
        this.zze = new zzte(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zztq(178, 128);
        this.zzc = new zzamf();
    }
}
