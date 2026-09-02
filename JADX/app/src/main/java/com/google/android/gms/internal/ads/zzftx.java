package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzftx {
    private static final CopyOnWriteArrayList<zzftw> zza = new CopyOnWriteArrayList<>();

    public static zzftw zza(String str) throws GeneralSecurityException {
        for (zzftw zzftwVar : zza) {
            if (zzftwVar.zza()) {
                return zzftwVar;
            }
        }
        String strValueOf = String.valueOf(str);
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "No KMS client does support: ".concat(strValueOf) : new String("No KMS client does support: "));
    }
}
