package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzja<T> implements zzjh<T> {
    private final zziw zza;
    private final zzjv<?, ?> zzb;
    private final boolean zzc;
    private final zzhe<?> zzd;

    private zzja(zzjv<?, ?> zzjvVar, zzhe<?> zzheVar, zziw zziwVar) {
        this.zzb = zzjvVar;
        this.zzc = zzheVar.zza(zziwVar);
        this.zzd = zzheVar;
        this.zza = zziwVar;
    }

    static <T> zzja<T> zzf(zzjv<?, ?> zzjvVar, zzhe<?> zzheVar, zziw zziwVar) {
        return new zzja<>(zzjvVar, zzheVar, zziwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final T zza() {
        return (T) this.zza.zzbH().zzaD();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final boolean zzb(T t, T t2) {
        if (!this.zzb.zzd(t).equals(this.zzb.zzd(t2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zzb(t);
        this.zzd.zzb(t2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final int zzc(T t) {
        int iHashCode = this.zzb.zzd(t).hashCode();
        if (!this.zzc) {
            return iHashCode;
        }
        this.zzd.zzb(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final void zzd(T t, T t2) {
        zzjj.zzF(this.zzb, t, t2);
        if (this.zzc) {
            zzjj.zzE(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final int zze(T t) {
        zzjv<?, ?> zzjvVar = this.zzb;
        int iZzg = zzjvVar.zzg(zzjvVar.zzd(t));
        if (!this.zzc) {
            return iZzg;
        }
        this.zzd.zzb(t);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzjh
    public final void zzh(T t, byte[] bArr, int i, int i2, zzgf zzgfVar) throws IOException {
        zzhr zzhrVar = (zzhr) t;
        if (zzhrVar.zzc == zzjw.zza()) {
            zzhrVar.zzc = zzjw.zzb();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final void zzi(T t) {
        this.zzb.zze(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final boolean zzj(T t) {
        this.zzd.zzb(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    public final void zzm(T t, zzgz zzgzVar) throws IOException {
        this.zzd.zzb(t);
        throw null;
    }
}
