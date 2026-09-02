package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgfh extends zzgem {
    private static final Logger zzb = Logger.getLogger(zzgfh.class.getName());
    private static final boolean zzc = zzgiy.zza();
    zzgfi zza;

    private zzgfh() {
    }

    /* synthetic */ zzgfh(zzgff zzgffVar) {
    }

    public static int zzA(zzggq zzggqVar) {
        int iZza = zzggqVar.zza();
        return zzx(iZza) + iZza;
    }

    public static int zzB(zzgex zzgexVar) {
        int iZzc = zzgexVar.zzc();
        return zzx(iZzc) + iZzc;
    }

    static int zzC(zzghi zzghiVar, zzghz zzghzVar) {
        zzgeg zzgegVar = (zzgeg) zzghiVar;
        int iZzap = zzgegVar.zzap();
        if (iZzap == -1) {
            iZzap = zzghzVar.zze(zzgegVar);
            zzgegVar.zzaq(iZzap);
        }
        return zzx(iZzap) + iZzap;
    }

    @Deprecated
    static int zzF(int i, zzghi zzghiVar, zzghz zzghzVar) {
        int iZzx = zzx(i << 3);
        int i2 = iZzx + iZzx;
        zzgeg zzgegVar = (zzgeg) zzghiVar;
        int iZzap = zzgegVar.zzap();
        if (iZzap == -1) {
            iZzap = zzghzVar.zze(zzgegVar);
            zzgegVar.zzaq(iZzap);
        }
        return i2 + iZzap;
    }

    public static zzgfh zzu(byte[] bArr) {
        return new zzgfe(bArr, 0, bArr.length);
    }

    public static int zzv(int i) {
        return zzx(i << 3);
    }

    public static int zzw(int i) {
        if (i >= 0) {
            return zzx(i);
        }
        return 10;
    }

    public static int zzx(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzy(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzgjd.zzg(str);
        } catch (zzgjc unused) {
            length = str.getBytes(zzggk.zza).length;
        }
        return zzx(length) + length;
    }

    public final void zzD() {
        if (zzs() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzE(String str, zzgjc zzgjcVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzgjcVar);
        byte[] bytes = str.getBytes(zzggk.zza);
        try {
            int length = bytes.length;
            zzl(length);
            zzq(bytes, 0, length);
        } catch (zzgfg e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgfg(e2);
        }
    }

    public abstract void zza(int i, int i2) throws IOException;

    public abstract void zzb(int i, int i2) throws IOException;

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzd(int i, int i2) throws IOException;

    public abstract void zze(int i, long j) throws IOException;

    public abstract void zzf(int i, long j) throws IOException;

    public abstract void zzg(int i, boolean z) throws IOException;

    public abstract void zzh(int i, String str) throws IOException;

    public abstract void zzi(int i, zzgex zzgexVar) throws IOException;

    public abstract void zzj(byte b) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(int i) throws IOException;

    public abstract void zzm(int i) throws IOException;

    public abstract void zzn(long j) throws IOException;

    public abstract void zzo(long j) throws IOException;

    public abstract void zzq(byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzs();
}
