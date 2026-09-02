package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzamf {
    private byte[] zza;
    private int zzb;
    private int zzc;

    public zzamf() {
        this.zza = zzamq.zzf;
    }

    public zzamf(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzc = i;
    }

    public final int zzA() {
        return (zzn() << 21) | (zzn() << 14) | (zzn() << 7) | zzn();
    }

    public final int zzB() {
        int iZzv = zzv();
        if (iZzv >= 0) {
            return iZzv;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iZzv);
        throw new IllegalStateException(sb.toString());
    }

    public final int zzC() {
        int iZzw = zzw();
        if (iZzw >= 0) {
            return iZzw;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iZzw);
        throw new IllegalStateException(sb.toString());
    }

    public final long zzD() {
        long jZzx = zzx();
        if (jZzx >= 0) {
            return jZzx;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jZzx);
        throw new IllegalStateException(sb.toString());
    }

    public final String zzE(int i, Charset charset) {
        String str = new String(this.zza, this.zzb, i, charset);
        this.zzb += i;
        return str;
    }

    public final String zzF(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.zzb;
        int i3 = (i2 + i) - 1;
        String strZzr = zzamq.zzr(this.zza, i2, (i3 >= this.zzc || this.zza[i3] != 0) ? i : i - 1);
        this.zzb += i;
        return strZzr;
    }

    public final String zzG(char c) {
        int i = this.zzc;
        int i2 = this.zzb;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.zzc && this.zza[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.zza;
        int i3 = this.zzb;
        String strZzr = zzamq.zzr(bArr, i3, i2 - i3);
        this.zzb = i2;
        if (i2 < this.zzc) {
            this.zzb = i2 + 1;
        }
        return strZzr;
    }

    public final long zzH() {
        int i;
        int i2;
        long j = this.zza[this.zzb];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) == 0) {
                if (i3 >= 6) {
                    if (i3 != 7) {
                        break;
                    }
                    i = 1;
                    break;
                }
                j &= (long) (i4 - 1);
                i = 7 - i3;
                break;
            }
            i3--;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j);
            throw new NumberFormatException(sb.toString());
        }
        for (i2 = 1; i2 < i; i2++) {
            byte b = this.zza[this.zzb + i2];
            if ((b & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j);
                throw new NumberFormatException(sb2.toString());
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.zzb += i;
        return j;
    }

    public final void zza(int i) {
        byte[] bArr = this.zza;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzb(bArr, i);
    }

    public final void zzb(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzc = i;
        this.zzb = 0;
    }

    public final void zzc(int i) {
        byte[] bArr = this.zza;
        if (i > bArr.length) {
            this.zza = Arrays.copyOf(bArr, i);
        }
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
        zzakt.zza(z);
        this.zzc = i;
    }

    public final int zzg() {
        return this.zzb;
    }

    public final void zzh(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzc) {
            z = true;
        }
        zzakt.zza(z);
        this.zzb = i;
    }

    public final byte[] zzi() {
        return this.zza;
    }

    public final int zzj() {
        return this.zza.length;
    }

    public final void zzk(int i) {
        zzh(this.zzb + i);
    }

    public final void zzl(zzame zzameVar, int i) {
        zzm(zzameVar.zza, 0, i);
        zzameVar.zzd(0);
    }

    public final void zzm(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zza, this.zzb, bArr, i, i2);
        this.zzb += i2;
    }

    public final int zzn() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public final int zzo() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        byte b = bArr[i];
        this.zzb = i + 2;
        return (bArr[i2] & UByte.MAX_VALUE) | ((b & UByte.MAX_VALUE) << 8);
    }

    public final int zzp() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        byte b = bArr[i];
        this.zzb = i + 2;
        return ((bArr[i2] & UByte.MAX_VALUE) << 8) | (b & UByte.MAX_VALUE);
    }

    public final short zzq() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        byte b = bArr[i];
        this.zzb = i + 2;
        return (short) ((bArr[i2] & UByte.MAX_VALUE) | ((b & UByte.MAX_VALUE) << 8));
    }

    public final int zzr() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        byte b = bArr[i];
        int i2 = i + 2;
        byte b2 = bArr[i + 1];
        this.zzb = i + 3;
        return (bArr[i2] & UByte.MAX_VALUE) | ((b & UByte.MAX_VALUE) << 16) | ((b2 & UByte.MAX_VALUE) << 8);
    }

    public final int zzs() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        byte b = bArr[i];
        int i2 = i + 2;
        byte b2 = bArr[i + 1];
        this.zzb = i + 3;
        return (bArr[i2] & UByte.MAX_VALUE) | (((b & UByte.MAX_VALUE) << 24) >> 8) | ((b2 & UByte.MAX_VALUE) << 8);
    }

    public final long zzt() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.zzb = i + 4;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i2]) & 255);
    }

    public final long zzu() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.zzb = i + 4;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i2]) & 255) << 24);
    }

    public final int zzv() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.zzb = i + 4;
        return (bArr[i2] & UByte.MAX_VALUE) | ((b & UByte.MAX_VALUE) << 24) | ((b2 & UByte.MAX_VALUE) << 16) | ((b3 & UByte.MAX_VALUE) << 8);
    }

    public final int zzw() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.zzb = i + 4;
        return ((bArr[i2] & UByte.MAX_VALUE) << 24) | (b & UByte.MAX_VALUE) | ((b2 & UByte.MAX_VALUE) << 8) | ((b3 & UByte.MAX_VALUE) << 16);
    }

    public final long zzx() {
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

    public final long zzy() {
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
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) b4) & 255) << 24) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 40) | ((((long) b7) & 255) << 48) | ((((long) bArr[i2]) & 255) << 56);
    }

    public final int zzz() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        this.zzb = i + 4;
        return (b2 & UByte.MAX_VALUE) | ((b & UByte.MAX_VALUE) << 8);
    }

    public zzamf(int i) {
        this.zza = new byte[i];
        this.zzc = i;
    }

    public zzamf(byte[] bArr) {
        this.zza = bArr;
        this.zzc = bArr.length;
    }
}
