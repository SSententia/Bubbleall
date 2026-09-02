package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzat extends zzak {
    public final zzan zzb;

    public zzat(zzan zzanVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = zzanVar;
    }

    public static zzat zza(IOException iOException, zzan zzanVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !zzflf.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new zzas(iOException, zzanVar) : new zzat(iOException, zzanVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        if (i == 2000) {
            return i2 != 1 ? 2000 : 2001;
        }
        return i;
    }

    public zzat(IOException iOException, zzan zzanVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = zzanVar;
    }

    public zzat(String str, zzan zzanVar, int i, int i2) {
        super(str, zzb(2001, 1));
        this.zzb = zzanVar;
    }

    @Deprecated
    public zzat(String str, IOException iOException, zzan zzanVar, int i) {
        this(str, iOException, zzanVar, 2000, 1);
    }

    public zzat(String str, IOException iOException, zzan zzanVar, int i, int i2) {
        super(str, iOException, zzb(i, 1));
        this.zzb = zzanVar;
    }
}
