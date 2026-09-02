package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzflw {
    private static final Logger zza = Logger.getLogger(zzflw.class.getName());
    private static final zzflu zzb = new zzflu(null);

    private zzflw() {
    }

    static boolean zza(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }

    static String zzb(@CheckForNull String str) {
        return str == null ? "" : str;
    }
}
