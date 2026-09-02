package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzaha extends IOException {
    public final boolean zzb;
    public final int zzc;

    protected zzaha(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.zzb = z;
        this.zzc = i;
    }

    public static zzaha zza(String str, Throwable th) {
        return new zzaha(str, th, true, 0);
    }

    public static zzaha zzb(String str, Throwable th) {
        return new zzaha(str, th, true, 1);
    }

    public static zzaha zzc(String str) {
        return new zzaha(str, null, false, 1);
    }
}
