package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgex implements Iterable<Byte>, Serializable {
    public static final zzgex zzb = new zzget(zzggk.zzc);
    private static final Comparator<zzgex> zzc;
    private static final zzgew zzd;
    private int zza = 0;

    static {
        int i = zzgei.zza;
        zzd = new zzgew(null);
        zzc = new zzgeo();
    }

    zzgex() {
    }

    public static zzgev zzB() {
        return new zzgev(128);
    }

    static void zzD(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    public static zzgex zzs(byte[] bArr, int i, int i2) {
        zzE(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzget(bArr2);
    }

    public static zzgex zzt(byte[] bArr) {
        return zzs(bArr, 0, bArr.length);
    }

    static zzgex zzu(byte[] bArr) {
        return new zzget(bArr);
    }

    public static zzgex zzv(String str) {
        return new zzget(str.getBytes(zzggk.zza));
    }

    public static zzgex zzw(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = inputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            zzgex zzgexVarZzs = i == 0 ? null : zzs(bArr, 0, i);
            if (zzgexVarZzs == null) {
                return zzx(arrayList);
            }
            arrayList.add(zzgexVarZzs);
            iMin = Math.min(iMin + iMin, 8192);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgex zzx(Iterable<zzgex> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzd(iterable.iterator(), size);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzo = this.zza;
        if (iZzo == 0) {
            int iZzc = zzc();
            iZzo = zzo(iZzc, 0, iZzc);
            if (iZzo == 0) {
                iZzo = 1;
            }
            this.zza = iZzo;
        }
        return iZzo;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzc());
        objArr[2] = zzc() <= 50 ? zzgim.zza(this) : zzgim.zza(zzi(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String zzA(Charset charset) {
        return zzc() == 0 ? "" : zzl(charset);
    }

    protected final int zzC() {
        return this.zza;
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzc();

    protected abstract void zze(byte[] bArr, int i, int i2, int i3);

    protected abstract int zzf();

    protected abstract boolean zzg();

    public abstract zzgex zzi(int i, int i2);

    public abstract ByteBuffer zzj();

    abstract void zzk(zzgem zzgemVar) throws IOException;

    protected abstract String zzl(Charset charset);

    public abstract boolean zzm();

    protected abstract int zzn(int i, int i2, int i3);

    protected abstract int zzo(int i, int i2, int i3);

    public abstract zzgfc zzp();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzger iterator() {
        return new zzgen(this);
    }

    public final boolean zzr() {
        return zzc() == 0;
    }

    @Deprecated
    public final void zzy(byte[] bArr, int i, int i2, int i3) {
        zzE(0, i3, zzc());
        zzE(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    public final byte[] zzz() {
        int iZzc = zzc();
        if (iZzc == 0) {
            return zzggk.zzc;
        }
        byte[] bArr = new byte[iZzc];
        zze(bArr, 0, 0, iZzc);
        return bArr;
    }

    private static zzgex zzd(Iterator<zzgex> it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        zzgex zzgexVarZzd = zzd(it, i2);
        zzgex zzgexVarZzd2 = zzd(it, i - i2);
        if (Integer.MAX_VALUE - zzgexVarZzd.zzc() >= zzgexVarZzd2.zzc()) {
            return zzghy.zzF(zzgexVarZzd, zzgexVarZzd2);
        }
        int iZzc = zzgexVarZzd.zzc();
        int iZzc2 = zzgexVarZzd2.zzc();
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(iZzc);
        sb.append("+");
        sb.append(iZzc2);
        throw new IllegalArgumentException(sb.toString());
    }

    static int zzE(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }
}
