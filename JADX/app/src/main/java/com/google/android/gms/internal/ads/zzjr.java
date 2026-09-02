package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzjr implements Comparable<zzjr> {
    public final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final boolean zzi;

    public zzjr(zzafv zzafvVar, zzjn zzjnVar, int i, String str) {
        int iZzh;
        boolean z = false;
        this.zzb = zzjt.zzf(i, false);
        int i2 = zzafvVar.zzd;
        int i3 = zzjnVar.zzC;
        this.zzc = 1 == (i2 & 1);
        this.zzd = (i2 & 2) != 0;
        zzfoj<String> zzfojVarZzj = zzjnVar.zzt.isEmpty() ? zzfoj.zzj("") : zzjnVar.zzt;
        int i4 = 0;
        while (true) {
            if (i4 >= zzfojVarZzj.size()) {
                i4 = Integer.MAX_VALUE;
                iZzh = 0;
                break;
            }
            String str2 = zzfojVarZzj.get(i4);
            boolean z2 = zzjnVar.zzv;
            iZzh = zzjt.zzh(zzafvVar, str2, false);
            if (iZzh > 0) {
                break;
            } else {
                i4++;
            }
        }
        this.zze = i4;
        this.zzf = iZzh;
        int i5 = zzafvVar.zze;
        int i6 = zzjnVar.zzu;
        int iBitCount = Integer.bitCount(0);
        this.zzg = iBitCount;
        int i7 = zzafvVar.zze;
        this.zzi = false;
        int iZzh2 = zzjt.zzh(zzafvVar, str, zzjt.zzg(str) == null);
        this.zzh = iZzh2;
        if (iZzh > 0 || ((zzjnVar.zzt.isEmpty() && iBitCount > 0) || this.zzc || (this.zzd && iZzh2 > 0))) {
            z = true;
        }
        this.zza = z;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzjr zzjrVar) {
        zzfny zzfnyVarZzb = zzfny.zzj().zzd(this.zzb, zzjrVar.zzb).zza(Integer.valueOf(this.zze), Integer.valueOf(zzjrVar.zze), zzfpw.zzb().zza()).zzb(this.zzf, zzjrVar.zzf).zzb(this.zzg, zzjrVar.zzg).zzd(this.zzc, zzjrVar.zzc).zza(Boolean.valueOf(this.zzd), Boolean.valueOf(zzjrVar.zzd), this.zzf == 0 ? zzfpw.zzb() : zzfpw.zzb().zza()).zzb(this.zzh, zzjrVar.zzh);
        if (this.zzg == 0) {
            boolean z = zzjrVar.zzi;
            zzfnyVarZzb = zzfnyVarZzb.zzc(false, false);
        }
        return zzfnyVarZzb.zze();
    }
}
