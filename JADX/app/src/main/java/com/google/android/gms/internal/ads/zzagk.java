package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagk {
    public static final zzagk zza = new zzagb().zzc();
    public static final zzadw<zzagk> zzg = zzafz.zza;
    public final String zzb;
    public final zzagj zzc;
    public final zzagh zzd;
    public final zzago zze;
    public final zzagd zzf;

    /* synthetic */ zzagk(String str, zzagd zzagdVar, zzagj zzagjVar, zzagh zzaghVar, zzago zzagoVar, zzagi zzagiVar) {
        this.zzb = str;
        this.zzc = zzagjVar;
        this.zzd = zzaghVar;
        this.zze = zzagoVar;
        this.zzf = zzagdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzagk)) {
            return false;
        }
        zzagk zzagkVar = (zzagk) obj;
        return zzamq.zzc(this.zzb, zzagkVar.zzb) && this.zzf.equals(zzagkVar.zzf) && zzamq.zzc(this.zzc, zzagkVar.zzc) && zzamq.zzc(this.zzd, zzagkVar.zzd) && zzamq.zzc(this.zze, zzagkVar.zze);
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() * 31;
        zzagj zzagjVar = this.zzc;
        return ((((((iHashCode + (zzagjVar != null ? zzagjVar.hashCode() : 0)) * 31) + this.zzd.hashCode()) * 31) + this.zzf.hashCode()) * 31) + this.zze.hashCode();
    }
}
