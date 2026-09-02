package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahz {
    public static final zzahz zza;
    public static final zzahz zzb;
    public static final zzahz zzc;
    public static final zzahz zzd;
    public static final zzahz zze;
    public final long zzf;
    public final long zzg;

    static {
        zzahz zzahzVar = new zzahz(0L, 0L);
        zza = zzahzVar;
        zzb = new zzahz(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new zzahz(Long.MAX_VALUE, 0L);
        zzd = new zzahz(0L, Long.MAX_VALUE);
        zze = zzahzVar;
    }

    public zzahz(long j, long j2) {
        zzakt.zza(j >= 0);
        zzakt.zza(j2 >= 0);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahz zzahzVar = (zzahz) obj;
            if (this.zzf == zzahzVar.zzf && this.zzg == zzahzVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
