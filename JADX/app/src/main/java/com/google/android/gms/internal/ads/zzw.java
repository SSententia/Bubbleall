package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzw {
    public static final zzw zza;

    @Deprecated
    public static final zzw zzb;
    public static final zzadw<zzw> zzz;
    public final int zzk;
    public final int zzl;
    public final boolean zzm;
    public final zzfoj<String> zzn;
    public final zzfoj<String> zzo;
    public final zzfoj<String> zzs;
    public final zzfoj<String> zzt;
    public final int zzu;
    public final zzfot<Integer> zzy;
    public final int zzc = Integer.MAX_VALUE;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = 0;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzp = 0;
    public final int zzq = Integer.MAX_VALUE;
    public final int zzr = Integer.MAX_VALUE;
    public final boolean zzv = false;
    public final boolean zzw = false;
    public final boolean zzx = false;

    static {
        zzw zzwVar = new zzw(new zzv());
        zza = zzwVar;
        zzb = zzwVar;
        zzz = zzu.zza;
    }

    protected zzw(zzv zzvVar) {
        this.zzk = zzvVar.zza;
        this.zzl = zzvVar.zzb;
        this.zzm = zzvVar.zzc;
        this.zzn = zzvVar.zzd;
        this.zzo = zzvVar.zze;
        this.zzs = zzvVar.zzf;
        this.zzt = zzvVar.zzg;
        this.zzu = zzvVar.zzh;
        this.zzy = zzvVar.zzi;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzw zzwVar = (zzw) obj;
            if (this.zzm == zzwVar.zzm && this.zzk == zzwVar.zzk && this.zzl == zzwVar.zzl && this.zzn.equals(zzwVar.zzn) && this.zzo.equals(zzwVar.zzo) && this.zzs.equals(zzwVar.zzs) && this.zzt.equals(zzwVar.zzt) && this.zzu == zzwVar.zzu && this.zzy.equals(zzwVar.zzy)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.zzm ? 1 : 0) - 1048002209) * 31) + this.zzk) * 31) + this.zzl) * 31) + this.zzn.hashCode()) * 31) + this.zzo.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.zzs.hashCode()) * 31) + this.zzt.hashCode()) * 31) + this.zzu) * 923521) + this.zzy.hashCode();
    }
}
