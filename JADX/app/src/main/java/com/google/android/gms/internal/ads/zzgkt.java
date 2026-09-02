package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkt {
    public static final zzgkt zzj = new zzgkt(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzgkt zzk = new zzgkt(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzgkt zzl = new zzgkt(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzgkt zzm = new zzgkt(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;

    public zzgkt(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.zza = d5;
        this.zzb = d6;
        this.zzc = d7;
        this.zzd = d;
        this.zze = d2;
        this.zzf = d3;
        this.zzg = d4;
        this.zzh = d8;
        this.zzi = d9;
    }

    public static zzgkt zza(ByteBuffer byteBuffer) {
        double dZze = zzxo.zze(byteBuffer);
        double dZze2 = zzxo.zze(byteBuffer);
        double dZzf = zzxo.zzf(byteBuffer);
        return new zzgkt(dZze, dZze2, zzxo.zze(byteBuffer), zzxo.zze(byteBuffer), dZzf, zzxo.zzf(byteBuffer), zzxo.zzf(byteBuffer), zzxo.zze(byteBuffer), zzxo.zze(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzgkt zzgktVar = (zzgkt) obj;
        return Double.compare(zzgktVar.zzd, this.zzd) == 0 && Double.compare(zzgktVar.zze, this.zze) == 0 && Double.compare(zzgktVar.zzf, this.zzf) == 0 && Double.compare(zzgktVar.zzg, this.zzg) == 0 && Double.compare(zzgktVar.zzh, this.zzh) == 0 && Double.compare(zzgktVar.zzi, this.zzi) == 0 && Double.compare(zzgktVar.zza, this.zza) == 0 && Double.compare(zzgktVar.zzb, this.zzb) == 0 && Double.compare(zzgktVar.zzc, this.zzc) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zza);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zzb);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.zzc);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.zzd);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.zze);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.zzf);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.zzg);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.zzh);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.zzi);
        return (((((((((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3))) * 31) + ((int) ((jDoubleToLongBits4 >>> 32) ^ jDoubleToLongBits4))) * 31) + ((int) ((jDoubleToLongBits5 >>> 32) ^ jDoubleToLongBits5))) * 31) + ((int) ((jDoubleToLongBits6 >>> 32) ^ jDoubleToLongBits6))) * 31) + ((int) ((jDoubleToLongBits7 >>> 32) ^ jDoubleToLongBits7))) * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)))) * 31) + ((int) ((jDoubleToLongBits9 >>> 32) ^ jDoubleToLongBits9));
    }

    public final String toString() {
        if (equals(zzj)) {
            return "Rotate 0°";
        }
        if (equals(zzk)) {
            return "Rotate 90°";
        }
        if (equals(zzl)) {
            return "Rotate 180°";
        }
        if (equals(zzm)) {
            return "Rotate 270°";
        }
        double d = this.zza;
        double d2 = this.zzb;
        double d3 = this.zzc;
        double d4 = this.zzd;
        double d5 = this.zze;
        double d6 = this.zzf;
        double d7 = this.zzg;
        double d8 = this.zzh;
        double d9 = this.zzi;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
