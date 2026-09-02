package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztm implements zztb {
    private final zzuc zza;
    private String zzb;
    private zzox zzc;
    private zztl zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zztq zzg = new zztq(32, 128);
    private final zztq zzh = new zztq(33, 128);
    private final zztq zzi = new zztq(34, 128);
    private final zztq zzj = new zztq(39, 128);
    private final zztq zzk = new zztq(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzamf zzn = new zzamf();

    public zztm(zzuc zzucVar) {
        this.zza = zzucVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zzd(bArr, i, i2);
            this.zzh.zzd(bArr, i, i2);
            this.zzi.zzd(bArr, i, i2);
        }
        this.zzj.zzd(bArr, i, i2);
        this.zzk.zzd(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzalw.zze(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        zztl zztlVar = this.zzd;
        if (zztlVar != null) {
            zztlVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzb = zzunVar.zzc();
        zzox zzoxVarZzB = zznxVar.zzB(zzunVar.zzb(), 2);
        this.zzc = zzoxVarZzB;
        this.zzd = new zztl(zzoxVarZzB);
        this.zza.zza(zznxVar, zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzm = j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0317  */
    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzd(zzamf zzamfVar) {
        long j;
        int i;
        int i2;
        zzakt.zze(this.zzc);
        int i3 = zzamq.zza;
        while (zzamfVar.zzd() > 0) {
            int iZzg = zzamfVar.zzg();
            int iZze = zzamfVar.zze();
            byte[] bArrZzi = zzamfVar.zzi();
            this.zzl += (long) zzamfVar.zzd();
            zzov.zzb(this.zzc, zzamfVar, zzamfVar.zzd());
            while (iZzg < iZze) {
                int iZzd = zzalw.zzd(bArrZzi, iZzg, iZze, this.zzf);
                if (iZzd == iZze) {
                    zzf(bArrZzi, iZzg, iZze);
                    return;
                }
                int i4 = iZzd + 3;
                int i5 = (bArrZzi[i4] & 126) >> 1;
                int i6 = iZzd - iZzg;
                if (i6 > 0) {
                    zzf(bArrZzi, iZzg, iZzd);
                }
                int i7 = iZze - iZzd;
                long j2 = this.zzl - ((long) i7);
                int i8 = i6 < 0 ? -i6 : 0;
                long j3 = this.zzm;
                this.zzd.zzd(j2, i7, this.zze);
                if (this.zze) {
                    j = j2;
                } else {
                    this.zzg.zze(i8);
                    this.zzh.zze(i8);
                    this.zzi.zze(i8);
                    if (this.zzg.zzb() && this.zzh.zzb() && this.zzi.zzb()) {
                        zzox zzoxVar = this.zzc;
                        String str = this.zzb;
                        zztq zztqVar = this.zzg;
                        zztq zztqVar2 = this.zzh;
                        zztq zztqVar3 = this.zzi;
                        int i9 = zztqVar.zzb;
                        byte[] bArr = new byte[zztqVar2.zzb + i9 + zztqVar3.zzb];
                        System.arraycopy(zztqVar.zza, 0, bArr, 0, i9);
                        System.arraycopy(zztqVar2.zza, 0, bArr, zztqVar.zzb, zztqVar2.zzb);
                        System.arraycopy(zztqVar3.zza, 0, bArr, zztqVar.zzb + zztqVar2.zzb, zztqVar3.zzb);
                        zzamg zzamgVar = new zzamg(zztqVar2.zza, 0, zztqVar2.zzb);
                        zzamgVar.zzc(44);
                        int iZze2 = zzamgVar.zze(3);
                        zzamgVar.zzb();
                        zzamgVar.zzc(88);
                        zzamgVar.zzc(8);
                        int i10 = 0;
                        for (int i11 = 0; i11 < iZze2; i11++) {
                            if (zzamgVar.zzd()) {
                                i10 += 89;
                            }
                            if (zzamgVar.zzd()) {
                                i10 += 8;
                            }
                        }
                        zzamgVar.zzc(i10);
                        if (iZze2 > 0) {
                            int i12 = 8 - iZze2;
                            zzamgVar.zzc(i12 + i12);
                        }
                        zzamgVar.zzf();
                        int iZzf = zzamgVar.zzf();
                        if (iZzf == 3) {
                            zzamgVar.zzb();
                            iZzf = 3;
                        }
                        int iZzf2 = zzamgVar.zzf();
                        int iZzf3 = zzamgVar.zzf();
                        if (zzamgVar.zzd()) {
                            int iZzf4 = zzamgVar.zzf();
                            int iZzf5 = zzamgVar.zzf();
                            int iZzf6 = zzamgVar.zzf();
                            int iZzf7 = zzamgVar.zzf();
                            if (iZzf == 1) {
                                i2 = 2;
                            } else if (iZzf == 2) {
                                iZzf = 2;
                                i2 = 2;
                            } else {
                                i2 = 1;
                            }
                            iZzf2 -= i2 * (iZzf4 + iZzf5);
                            iZzf3 -= (iZzf == 1 ? 2 : 1) * (iZzf6 + iZzf7);
                        }
                        zzamgVar.zzf();
                        zzamgVar.zzf();
                        int iZzf8 = zzamgVar.zzf();
                        for (int i13 = true != zzamgVar.zzd() ? iZze2 : 0; i13 <= iZze2; i13++) {
                            zzamgVar.zzf();
                            zzamgVar.zzf();
                            zzamgVar.zzf();
                        }
                        zzamgVar.zzf();
                        zzamgVar.zzf();
                        zzamgVar.zzf();
                        zzamgVar.zzf();
                        zzamgVar.zzf();
                        zzamgVar.zzf();
                        if (zzamgVar.zzd() && zzamgVar.zzd()) {
                            int i14 = 0;
                            for (int i15 = 4; i14 < i15; i15 = 4) {
                                int i16 = 0;
                                while (i16 < 6) {
                                    if (zzamgVar.zzd()) {
                                        int iMin = Math.min(64, 1 << ((i14 + i14) + 4));
                                        if (i14 > 1) {
                                            zzamgVar.zzg();
                                        }
                                        for (int i17 = 0; i17 < iMin; i17++) {
                                            zzamgVar.zzg();
                                        }
                                    } else {
                                        zzamgVar.zzf();
                                    }
                                    i16 += i14 == 3 ? 3 : 1;
                                    j2 = j2;
                                }
                                i14++;
                            }
                        }
                        j = j2;
                        zzamgVar.zzc(2);
                        if (zzamgVar.zzd()) {
                            zzamgVar.zzc(8);
                            zzamgVar.zzf();
                            zzamgVar.zzf();
                            zzamgVar.zzb();
                        }
                        int i18 = 0;
                        boolean zZzd = false;
                        int i19 = 0;
                        for (int iZzf9 = zzamgVar.zzf(); i18 < iZzf9; iZzf9 = iZzf9) {
                            if (i18 != 0) {
                                zZzd = zzamgVar.zzd();
                            }
                            if (zZzd) {
                                zzamgVar.zzb();
                                zzamgVar.zzf();
                                for (int i20 = 0; i20 <= i19; i20++) {
                                    if (zzamgVar.zzd()) {
                                        zzamgVar.zzb();
                                    }
                                }
                            } else {
                                int iZzf10 = zzamgVar.zzf();
                                int iZzf11 = zzamgVar.zzf();
                                int i21 = iZzf10 + iZzf11;
                                for (int i22 = 0; i22 < iZzf10; i22++) {
                                    zzamgVar.zzf();
                                    zzamgVar.zzb();
                                }
                                for (int i23 = 0; i23 < iZzf11; i23++) {
                                    zzamgVar.zzf();
                                    zzamgVar.zzb();
                                }
                                i19 = i21;
                            }
                            i18++;
                        }
                        if (zzamgVar.zzd()) {
                            for (int i24 = 0; i24 < zzamgVar.zzf(); i24++) {
                                zzamgVar.zzc(iZzf8 + 5);
                            }
                        }
                        zzamgVar.zzc(2);
                        float f = 1.0f;
                        if (zzamgVar.zzd()) {
                            if (zzamgVar.zzd()) {
                                int iZze3 = zzamgVar.zze(8);
                                if (iZze3 == 255) {
                                    int iZze4 = zzamgVar.zze(16);
                                    int iZze5 = zzamgVar.zze(16);
                                    if (iZze4 != 0 && iZze5 != 0) {
                                        f = iZze4 / iZze5;
                                    }
                                } else if (iZze3 < 17) {
                                    f = zzalw.zzb[iZze3];
                                } else {
                                    StringBuilder sb = new StringBuilder(46);
                                    sb.append("Unexpected aspect_ratio_idc value: ");
                                    sb.append(iZze3);
                                    Log.w("H265Reader", sb.toString());
                                }
                            }
                            if (zzamgVar.zzd()) {
                                zzamgVar.zzb();
                            }
                            if (zzamgVar.zzd()) {
                                zzamgVar.zzc(4);
                                if (zzamgVar.zzd()) {
                                    zzamgVar.zzc(24);
                                }
                            }
                            if (zzamgVar.zzd()) {
                                zzamgVar.zzf();
                                zzamgVar.zzf();
                            }
                            zzamgVar.zzb();
                            if (zzamgVar.zzd()) {
                                iZzf3 += iZzf3;
                            }
                        }
                        zzamgVar.zza(zztqVar2.zza, 0, zztqVar2.zzb);
                        zzamgVar.zzc(24);
                        String strZzb = zzakv.zzb(zzamgVar);
                        zzaft zzaftVar = new zzaft();
                        zzaftVar.zzD(str);
                        zzaftVar.zzN("video/hevc");
                        zzaftVar.zzK(strZzb);
                        zzaftVar.zzS(iZzf2);
                        zzaftVar.zzT(iZzf3);
                        zzaftVar.zzW(f);
                        zzaftVar.zzP(Collections.singletonList(bArr));
                        zzoxVar.zzs(zzaftVar.zzah());
                        this.zze = true;
                    } else {
                        j = j2;
                    }
                }
                if (this.zzj.zze(i8)) {
                    zztq zztqVar4 = this.zzj;
                    this.zzn.zzb(this.zzj.zza, zzalw.zza(zztqVar4.zza, zztqVar4.zzb));
                    this.zzn.zzk(5);
                    this.zza.zzb(j3, this.zzn);
                }
                if (this.zzk.zze(i8)) {
                    zztq zztqVar5 = this.zzk;
                    this.zzn.zzb(this.zzk.zza, zzalw.zza(zztqVar5.zza, zztqVar5.zzb));
                    this.zzn.zzk(5);
                    this.zza.zzb(j3, this.zzn);
                }
                this.zzd.zzb(j, i7, i5, this.zzm, this.zze);
                if (this.zze) {
                    i = i5;
                } else {
                    i = i5;
                    this.zzg.zzc(i);
                    this.zzh.zzc(i);
                    this.zzi.zzc(i);
                }
                this.zzj.zzc(i);
                this.zzk.zzc(i);
                iZzg = i4;
                iZze = iZze;
                bArrZzi = bArrZzi;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }
}
