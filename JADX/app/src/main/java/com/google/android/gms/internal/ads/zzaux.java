package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaux {
    public byte[] zza;
    private int zzb;
    private int zzc;

    public zzaux() {
    }

    public zzaux(int i) {
        this.zza = new byte[i];
        this.zzc = i;
    }

    public final void zza(int i) {
        zzb(zzh() < i ? new byte[i] : this.zza, i);
    }

    public final void zzb(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzc = i;
        this.zzb = 0;
    }

    public final void zzc() {
        this.zzb = 0;
        this.zzc = 0;
    }

    public final int zzd() {
        return this.zzc - this.zzb;
    }

    public final int zze() {
        return this.zzc;
    }

    public final void zzf(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zza.length) {
            z = true;
        }
        zzaup.zza(z);
        this.zzc = i;
    }

    public final int zzg() {
        return this.zzb;
    }

    public final int zzh() {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void zzi(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzc) {
            z = true;
        }
        zzaup.zza(z);
        this.zzb = i;
    }

    public final void zzj(int i) {
        zzi(this.zzb + i);
    }

    public final void zzk(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zza, this.zzb, bArr, i, i2);
        this.zzb += i2;
    }

    public final int zzl() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public final int zzm() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        byte b = bArr[i];
        this.zzb = i + 2;
        return (bArr[i2] & UByte.MAX_VALUE) | ((b & UByte.MAX_VALUE) << 8);
    }

    public final int zzn() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        byte b = bArr[i];
        this.zzb = i + 2;
        return ((bArr[i2] & UByte.MAX_VALUE) << 8) | (b & UByte.MAX_VALUE);
    }

    public final short zzo() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        byte b = bArr[i];
        this.zzb = i + 2;
        return (short) ((bArr[i2] & UByte.MAX_VALUE) | ((b & UByte.MAX_VALUE) << 8));
    }

    public final long zzp() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.zzb = i + 4;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i2]) & 255);
    }

    public final long zzq() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.zzb = i + 4;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i2]) & 255) << 24);
    }

    public final int zzr() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.zzb = i + 4;
        return (bArr[i2] & UByte.MAX_VALUE) | ((b & UByte.MAX_VALUE) << 24) | ((b2 & UByte.MAX_VALUE) << 16) | ((b3 & UByte.MAX_VALUE) << 8);
    }

    public final long zzs() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        byte b5 = bArr[i + 4];
        byte b6 = bArr[i + 5];
        int i2 = i + 7;
        byte b7 = bArr[i + 6];
        this.zzb = i + 8;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i2]) & 255);
    }

    public final int zzt() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        this.zzb = i + 4;
        return (b2 & UByte.MAX_VALUE) | ((b & UByte.MAX_VALUE) << 8);
    }

    public final int zzu() {
        int iZzr = zzr();
        if (iZzr >= 0) {
            return iZzr;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iZzr);
        throw new IllegalStateException(sb.toString());
    }

    public final long zzv() {
        long jZzs = zzs();
        if (jZzs >= 0) {
            return jZzs;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jZzs);
        throw new IllegalStateException(sb.toString());
    }

    public final String zzw(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.zzb;
        int i3 = (i2 + i) - 1;
        String str = new String(this.zza, i2, (i3 >= this.zzc || this.zza[i3] != 0) ? i : i - 1);
        this.zzb += i;
        return str;
    }

    public zzaux(byte[] bArr) {
        this.zza = bArr;
        this.zzc = bArr.length;
    }
}
