package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzass implements zzasp, zzaso {
    public final zzasp[] zza;
    private final IdentityHashMap<zzatb, Integer> zzb = new IdentityHashMap<>();
    private zzaso zzc;
    private int zzd;
    private zzatg zze;
    private zzasp[] zzf;
    private zzatd zzg;

    public zzass(zzasp... zzaspVarArr) {
        this.zza = zzaspVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzB(zzatk[] zzatkVarArr, boolean[] zArr, zzatb[] zzatbVarArr, boolean[] zArr2, long j) {
        int length;
        zzatb[] zzatbVarArr2 = zzatbVarArr;
        int length2 = zzatkVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzatkVarArr.length;
            if (i >= length) {
                break;
            }
            zzatb zzatbVar = zzatbVarArr2[i];
            iArr[i] = zzatbVar == null ? -1 : this.zzb.get(zzatbVar).intValue();
            iArr2[i] = -1;
            zzatk zzatkVar = zzatkVarArr[i];
            if (zzatkVar != null) {
                zzatf zzatfVarZza = zzatkVar.zza();
                int i2 = 0;
                while (true) {
                    zzasp[] zzaspVarArr = this.zza;
                    if (i2 >= zzaspVarArr.length) {
                        break;
                    }
                    if (zzaspVarArr[i2].zzn().zzb(zzatfVarZza) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        this.zzb.clear();
        zzatb[] zzatbVarArr3 = new zzatb[length];
        zzatb[] zzatbVarArr4 = new zzatb[length];
        zzatk[] zzatkVarArr2 = new zzatk[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = 0; i4 < zzatkVarArr.length; i4++) {
                zzatk zzatkVar2 = null;
                zzatbVarArr4[i4] = iArr[i4] == i3 ? zzatbVarArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    zzatkVar2 = zzatkVarArr[i4];
                }
                zzatkVarArr2[i4] = zzatkVar2;
            }
            int i5 = i3;
            zzatk[] zzatkVarArr3 = zzatkVarArr2;
            ArrayList arrayList2 = arrayList;
            long jZzB = this.zza[i3].zzB(zzatkVarArr2, zArr, zzatbVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = jZzB;
            } else if (jZzB != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzatkVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzaup.zzd(zzatbVarArr4[i6] != null);
                    zzatb zzatbVar2 = zzatbVarArr4[i6];
                    zzatbVarArr3[i6] = zzatbVar2;
                    this.zzb.put(zzatbVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzaup.zzd(zzatbVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzatkVarArr2 = zzatkVarArr3;
            zzatbVarArr2 = zzatbVarArr;
        }
        zzatb[] zzatbVarArr5 = zzatbVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzatbVarArr3, 0, zzatbVarArr5, 0, length);
        zzasp[] zzaspVarArr2 = new zzasp[arrayList3.size()];
        this.zzf = zzaspVarArr2;
        arrayList3.toArray(zzaspVarArr2);
        this.zzg = new zzasd(this.zzf);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzasp, com.google.android.gms.internal.ads.zzatd
    public final long zza() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzasp, com.google.android.gms.internal.ads.zzatd
    public final boolean zzb(long j) {
        return this.zzg.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzatc
    public final /* bridge */ /* synthetic */ void zzbh(zzatd zzatdVar) {
        if (this.zze == null) {
            return;
        }
        this.zzc.zzbh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaso
    public final void zzj(zzasp zzaspVar) {
        int i = this.zzd - 1;
        this.zzd = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (zzasp zzaspVar2 : this.zza) {
            i2 += zzaspVar2.zzn().zzb;
        }
        zzatf[] zzatfVarArr = new zzatf[i2];
        int i3 = 0;
        for (zzasp zzaspVar3 : this.zza) {
            zzatg zzatgVarZzn = zzaspVar3.zzn();
            int i4 = zzatgVarZzn.zzb;
            int i5 = 0;
            while (i5 < i4) {
                zzatfVarArr[i3] = zzatgVarZzn.zza(i5);
                i5++;
                i3++;
            }
        }
        this.zze = new zzatg(zzatfVarArr);
        this.zzc.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzl(zzaso zzasoVar, long j) {
        this.zzc = zzasoVar;
        zzasp[] zzaspVarArr = this.zza;
        this.zzd = zzaspVarArr.length;
        for (zzasp zzaspVar : zzaspVarArr) {
            zzaspVar.zzl(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzm() throws IOException {
        for (zzasp zzaspVar : this.zza) {
            zzaspVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final zzatg zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzo(long j) {
        for (zzasp zzaspVar : this.zzf) {
            zzaspVar.zzo(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzp() {
        long jZzp = this.zza[0].zzp();
        int i = 1;
        while (true) {
            zzasp[] zzaspVarArr = this.zza;
            if (i >= zzaspVarArr.length) {
                if (jZzp != -9223372036854775807L) {
                    for (zzasp zzaspVar : this.zzf) {
                        if (zzaspVar != this.zza[0] && zzaspVar.zzr(jZzp) != jZzp) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return jZzp;
            }
            if (zzaspVarArr[i].zzp() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzq() {
        long jMin = Long.MAX_VALUE;
        for (zzasp zzaspVar : this.zzf) {
            long jZzq = zzaspVar.zzq();
            if (jZzq != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzq);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzr(long j) {
        long jZzr = this.zzf[0].zzr(j);
        int i = 1;
        while (true) {
            zzasp[] zzaspVarArr = this.zzf;
            if (i >= zzaspVarArr.length) {
                return jZzr;
            }
            if (zzaspVarArr[i].zzr(jZzr) != jZzr) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }
}
