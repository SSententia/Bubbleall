package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzftq {
    public static zzftp zza(String str) throws GeneralSecurityException {
        if (zzfum.zzm().containsKey(str)) {
            return zzfum.zzm().get(str);
        }
        throw new GeneralSecurityException(str.length() != 0 ? "cannot find key template: ".concat(str) : new String("cannot find key template: "));
    }
}
