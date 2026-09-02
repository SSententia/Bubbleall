package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgiw extends zzgix {
    zzgiw(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final void zza(Object obj, long j, byte b) {
        if (zzgiy.zzb) {
            zzgiy.zzG(obj, j, b);
        } else {
            zzgiy.zzH(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final boolean zzb(Object obj, long j) {
        return zzgiy.zzb ? zzgiy.zzx(obj, j) : zzgiy.zzy(obj, j);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzgiy.zzA(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzgiy.zzz(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to replace arg (r3v0 'z' boolean A[IMMUTABLE_TYPE, METHOD_ARGUMENT]) for method inline: com.google.android.gms.internal.ads.zzgiy.zzz(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.ads.zzgiy.zzA(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.zzgix
    public final void zzc(Object obj, long j, boolean z) {
        if (zzgiy.zzb) {
            zzgiy.zzz(obj, j, z);
        } else {
            zzgiy.zzA(obj, j, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(zzm(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final void zze(Object obj, long j, float f) {
        zzn(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(zzo(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final void zzg(Object obj, long j, double d) {
        zzp(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final byte zzh(long j) {
        return Memory.peekByte(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final void zzi(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }
}
