package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzuj implements zznu {
    public static final zzoa zza = zzug.zza;
    private final List<zzamn> zzb;
    private final zzamf zzc;
    private final SparseIntArray zzd;
    private final zzum zze;
    private final SparseArray<zzuo> zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzuf zzi;
    private zzue zzj;
    private zznx zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzuj() {
        this(0);
    }

    static /* synthetic */ boolean zzm(zzuj zzujVar, boolean z) {
        zzujVar.zzm = true;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        byte[] bArrZzi = this.zzc.zzi();
        zznp zznpVar = (zznp) zznvVar;
        zznpVar.zzh(bArrZzi, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    zznpVar.zzd(i, false);
                    return true;
                }
                if (bArrZzi[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzk = zznxVar;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.google.android.gms.internal.ads.zzuo] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        ?? r3;
        ?? r8;
        zzuo zzuoVar;
        long j;
        boolean z;
        long jZzo = zznvVar.zzo();
        if (!this.zzm) {
            r3 = 0;
        } else {
            if (jZzo != -1 && !this.zzi.zza()) {
                return this.zzi.zzb(zznvVar, zzoqVar, this.zzq);
            }
            if (this.zzn) {
                j = 0;
            } else {
                this.zzn = true;
                if (this.zzi.zzc() != -9223372036854775807L) {
                    j = 0;
                    zzue zzueVar = new zzue(this.zzi.zzd(), this.zzi.zzc(), jZzo, this.zzq, 112800);
                    this.zzj = zzueVar;
                    this.zzk.zzD(zzueVar.zza());
                } else {
                    j = 0;
                    this.zzk.zzD(new zzos(this.zzi.zzc(), 0L));
                }
            }
            if (this.zzo) {
                z = false;
                this.zzo = false;
                zzd(j, j);
                if (zznvVar.zzn() != j) {
                    zzoqVar.zza = j;
                    return 1;
                }
            } else {
                z = false;
            }
            zzue zzueVar2 = this.zzj;
            r3 = z;
            if (zzueVar2 != null && zzueVar2.zzc()) {
                r3 = z;
                return this.zzj.zzd(zznvVar, zzoqVar);
            }
        }
        r3 = z;
        byte[] bArrZzi = this.zzc.zzi();
        if (9400 - this.zzc.zzg() < 188) {
            int iZzd = this.zzc.zzd();
            if (iZzd > 0) {
                System.arraycopy(bArrZzi, this.zzc.zzg(), bArrZzi, r3, iZzd);
            }
            this.zzc.zzb(bArrZzi, iZzd);
        }
        while (this.zzc.zzd() < 188) {
            int iZze = this.zzc.zze();
            int iZzg = zznvVar.zzg(bArrZzi, iZze, 9400 - iZze);
            if (iZzg == -1) {
                return -1;
            }
            this.zzc.zzf(iZze + iZzg);
        }
        int iZzg2 = this.zzc.zzg();
        int iZze2 = this.zzc.zze();
        int iZza = zzup.zza(this.zzc.zzi(), iZzg2, iZze2);
        this.zzc.zzh(iZza);
        int i = iZza + 188;
        if (i > iZze2) {
            this.zzp += iZza - iZzg2;
        } else {
            this.zzp = r3;
        }
        int iZze3 = this.zzc.zze();
        if (i > iZze3) {
            return r3;
        }
        int iZzv = this.zzc.zzv();
        if ((8388608 & iZzv) != 0) {
            this.zzc.zzh(i);
            return r3;
        }
        ?? r10 = (4194304 & iZzv) != 0 ? 1 : r3;
        int i2 = (iZzv >> 8) & 8191;
        int i3 = iZzv & 32;
        if ((iZzv & 16) != 0) {
            zzuoVar = this.zzf.get(i2);
        } else {
            r8 = 0;
        }
        if (r8 == 0) {
            r8 = zzuoVar;
            this.zzc.zzh(i);
            return r3;
        }
        int i4 = iZzv & 15;
        int i5 = this.zzd.get(i2, i4 - 1);
        this.zzd.put(i2, i4);
        if (i5 == i4) {
            r8 = zzuoVar;
            this.zzc.zzh(i);
            return r3;
        }
        if (i4 != ((i5 + 1) & 15)) {
            r8 = zzuoVar;
            r8.zzb();
        }
        if (i3 != 0) {
            int iZzn = this.zzc.zzn();
            r10 = (r10 == true ? 1 : 0) | ((this.zzc.zzn() & 64) != 0 ? 2 : r3);
            this.zzc.zzk(iZzn - 1);
        }
        boolean z2 = this.zzm;
        if (z2 || !this.zzh.get(i2, r3)) {
            this.zzc.zzf(i);
            r8.zzc(this.zzc, r10);
            this.zzc.zzf(iZze3);
            if (!z2) {
                if (this.zzm && jZzo != -1) {
                    this.zzo = true;
                }
            }
        } else if (this.zzm) {
            this.zzo = true;
        }
        this.zzc.zzh(i);
        return r3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j, long j2) {
        zzue zzueVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzamn zzamnVar = this.zzb.get(i);
            if (zzamnVar.zzc() != -9223372036854775807L) {
                long jZza = zzamnVar.zza();
                if (jZza != -9223372036854775807L && jZza != 0 && jZza != j2) {
                    zzamnVar.zzd(j2);
                }
            } else {
                zzamnVar.zzd(j2);
            }
        }
        if (j2 != 0 && (zzueVar = this.zzj) != null) {
            zzueVar.zzb(j2);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzf.size(); i2++) {
            this.zzf.valueAt(i2).zzb();
        }
        this.zzp = 0;
    }

    public zzuj(int i) {
        this(1, 0, 112800);
    }

    public zzuj(int i, int i2, int i3) {
        zzamn zzamnVar = new zzamn(0L);
        this.zze = new zzsy(0);
        this.zzb = Collections.singletonList(zzamnVar);
        this.zzc = new zzamf(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray<zzuo> sparseArray = new SparseArray<>();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzuf(112800);
        this.zzk = zznx.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzf.put(sparseArray2.keyAt(i4), (zzuo) sparseArray2.valueAt(i4));
        }
        this.zzf.put(0, new zzub(new zzuh(this)));
    }
}
