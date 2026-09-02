package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzadu implements zzahp {
    protected final zzaip zza = new zzaip();

    protected zzadu() {
    }

    public final boolean zza() {
        zzaiq zzaiqVarZzF = zzF();
        if (!zzaiqVarZzF.zzt()) {
            int iZzv = zzv();
            zzn();
            zzo();
            if (zzaiqVarZzF.zzc(iZzv, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzb() {
        zzaiq zzaiqVarZzF = zzF();
        if (!zzaiqVarZzF.zzt()) {
            int iZzv = zzv();
            zzn();
            zzo();
            if (zzaiqVarZzF.zzb(iZzv, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc() {
        zzaiq zzaiqVarZzF = zzF();
        return !zzaiqVarZzF.zzt() && zzaiqVarZzF.zzf(zzv(), this.zza, 0L).zzb();
    }

    public final boolean zzd() {
        zzaiq zzaiqVarZzF = zzF();
        return !zzaiqVarZzF.zzt() && zzaiqVarZzF.zzf(zzv(), this.zza, 0L).zzg;
    }
}
