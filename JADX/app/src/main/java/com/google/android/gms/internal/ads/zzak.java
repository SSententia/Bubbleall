package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzak extends IOException {
    public final int zza;

    public zzak(int i) {
        this.zza = i;
    }

    public zzak(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzak(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzak(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
