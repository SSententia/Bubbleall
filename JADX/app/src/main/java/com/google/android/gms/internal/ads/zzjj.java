package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzjj implements Comparable<zzjj> {
    public final boolean zza;
    private final String zzb;
    private final zzjn zzc;
    private final boolean zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final boolean zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;

    public zzjj(zzafv zzafvVar, zzjn zzjnVar, int i) {
        int i2;
        int iZzh;
        int iZzh2;
        this.zzc = zzjnVar;
        this.zzb = zzjt.zzg(zzafvVar.zzc);
        this.zzd = zzjt.zzf(i, false);
        int i3 = 0;
        while (true) {
            i2 = Integer.MAX_VALUE;
            if (i3 >= zzjnVar.zzo.size()) {
                iZzh = 0;
                i3 = Integer.MAX_VALUE;
                break;
            } else {
                iZzh = zzjt.zzh(zzafvVar, zzjnVar.zzo.get(i3), false);
                if (iZzh > 0) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.zzf = i3;
        this.zze = iZzh;
        int i4 = zzafvVar.zze;
        int i5 = zzjnVar.zzp;
        this.zzg = Integer.bitCount(0);
        this.zzj = 1 == (zzafvVar.zzd & 1);
        this.zzk = zzafvVar.zzy;
        this.zzl = zzafvVar.zzz;
        this.zzm = zzafvVar.zzh;
        if (zzafvVar.zzh != -1) {
            int i6 = zzjnVar.zzr;
        }
        if (zzafvVar.zzy != -1) {
            int i7 = zzjnVar.zzq;
        }
        this.zza = true;
        String[] strArrZzY = zzamq.zzY();
        int i8 = 0;
        while (true) {
            if (i8 >= strArrZzY.length) {
                iZzh2 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iZzh2 = zzjt.zzh(zzafvVar, strArrZzY[i8], false);
                if (iZzh2 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.zzh = i8;
        this.zzi = iZzh2;
        for (int i9 = 0; i9 < zzjnVar.zzs.size(); i9++) {
            String str = zzafvVar.zzl;
            if (str != null && str.equals(zzjnVar.zzs.get(i9))) {
                i2 = i9;
                break;
            }
        }
        this.zzn = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzjj zzjjVar) {
        zzfpw zzfpwVarZza = this.zzd ? zzjt.zzb : zzjt.zzb.zza();
        zzfny zzfnyVarZzb = zzfny.zzj().zzd(this.zzd, zzjjVar.zzd).zza(Integer.valueOf(this.zzf), Integer.valueOf(zzjjVar.zzf), zzfpw.zzb().zza()).zzb(this.zze, zzjjVar.zze).zzb(this.zzg, zzjjVar.zzg);
        boolean z = zzjjVar.zza;
        zzfny zzfnyVarZza = zzfnyVarZzb.zzd(true, true).zza(Integer.valueOf(this.zzn), Integer.valueOf(zzjjVar.zzn), zzfpw.zzb().zza());
        Integer numValueOf = Integer.valueOf(this.zzm);
        Integer numValueOf2 = Integer.valueOf(zzjjVar.zzm);
        boolean z2 = this.zzc.zzw;
        zzfny zzfnyVarZza2 = zzfnyVarZza.zza(numValueOf, numValueOf2, zzjt.zzc).zzd(this.zzj, zzjjVar.zzj).zza(Integer.valueOf(this.zzh), Integer.valueOf(zzjjVar.zzh), zzfpw.zzb().zza()).zzb(this.zzi, zzjjVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzjjVar.zzk), zzfpwVarZza).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzjjVar.zzl), zzfpwVarZza);
        Integer numValueOf3 = Integer.valueOf(this.zzm);
        Integer numValueOf4 = Integer.valueOf(zzjjVar.zzm);
        if (!zzamq.zzc(this.zzb, zzjjVar.zzb)) {
            zzfpwVarZza = zzjt.zzc;
        }
        return zzfnyVarZza2.zza(numValueOf3, numValueOf4, zzfpwVarZza).zze();
    }
}
