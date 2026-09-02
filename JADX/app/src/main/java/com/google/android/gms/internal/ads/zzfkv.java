package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfkv extends zzfko {
    private zzfmj<Integer> zza;
    private zzfmj<Integer> zzb;
    private zzfku zzc;
    private HttpURLConnection zzd;

    zzfkv() {
        zzfmj<Integer> zzfmjVar = zzfkq.zza;
        zzfmj<Integer> zzfmjVar2 = zzfkr.zza;
        this.zza = zzfmjVar;
        this.zzb = zzfmjVar2;
        this.zzc = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.zzd;
        zzfkp.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final HttpURLConnection zzb(zzfku zzfkuVar, int i, int i2) throws IOException {
        final int i3 = 265;
        this.zza = new zzfmj(i3) { // from class: com.google.android.gms.internal.ads.zzfks
            @Override // com.google.android.gms.internal.ads.zzfmj
            public final Object zza() {
                return 265;
            }
        };
        final int i4 = -1;
        this.zzb = new zzfmj(i4) { // from class: com.google.android.gms.internal.ads.zzfkt
            @Override // com.google.android.gms.internal.ads.zzfmj
            public final Object zza() {
                return -1;
            }
        };
        this.zzc = zzfkuVar;
        zzfkp.zza(this.zza.zza().intValue(), this.zzb.zza().intValue());
        zzfku zzfkuVar2 = this.zzc;
        zzfkuVar2.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfkuVar2.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }
}
