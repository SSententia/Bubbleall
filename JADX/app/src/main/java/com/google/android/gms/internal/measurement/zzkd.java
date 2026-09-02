package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzkd extends zzke {
    zzkd(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final void zza(Object obj, long j, byte b) {
        if (zzkf.zzb) {
            zzkf.zzD(obj, j, b);
        } else {
            zzkf.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final boolean zzb(Object obj, long j) {
        return zzkf.zzb ? zzkf.zzv(obj, j) : zzkf.zzw(obj, j);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzkf.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzkf.zzy(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.measurement.zzkf.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.measurement.zzkf.zzy(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.zzke
    public final void zzc(Object obj, long j, boolean z) {
        if (zzkf.zzb) {
            zzkf.zzx(obj, j, z);
        } else {
            zzkf.zzy(obj, j, z);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(zzk(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final void zze(Object obj, long j, float f) {
        zzl(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(zzm(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final void zzg(Object obj, long j, double d) {
        zzn(obj, j, Double.doubleToLongBits(d));
    }
}
