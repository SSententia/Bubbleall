package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public class zzie {
    private static final zzhd zzb = zzhd.zza();
    protected volatile zziw zza;
    private volatile zzgr zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzie)) {
            return false;
        }
        zzie zzieVar = (zzie) obj;
        zziw zziwVar = this.zza;
        zziw zziwVar2 = zzieVar.zza;
        if (zziwVar == null && zziwVar2 == null) {
            return zzb().equals(zzieVar.zzb());
        }
        if (zziwVar != null && zziwVar2 != null) {
            return zziwVar.equals(zziwVar2);
        }
        if (zziwVar != null) {
            zzieVar.zzc(zziwVar.zzbK());
            return zziwVar.equals(zzieVar.zza);
        }
        zzc(zziwVar2.zzbK());
        return this.zza.equals(zziwVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgp) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzbw();
        }
        return 0;
    }

    public final zzgr zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzgr.zzb;
            } else {
                this.zzc = this.zza.zzbo();
            }
            return this.zzc;
        }
    }

    protected final void zzc(zziw zziwVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zziwVar;
                    this.zzc = zzgr.zzb;
                } catch (zzib unused) {
                    this.zza = zziwVar;
                    this.zzc = zzgr.zzb;
                }
            }
        }
    }
}
