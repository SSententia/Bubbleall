package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzch {
    private static zzch zzb;
    String zza;

    private zzch() {
    }

    public static zzch zza() {
        if (zzb == null) {
            zzb = new zzch();
        }
        return zzb;
    }
}
