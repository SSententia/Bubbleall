package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbuu extends zzcgy {
    private final zzbut zza;

    public zzbuu(zzbut zzbutVar, String str) {
        super(str);
        this.zza = zzbutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzcgl
    public final void zza(String str) {
        String strValueOf = String.valueOf(str);
        zzcgt.zzd(strValueOf.length() != 0 ? "LeibnizHttpUrlPinger pinging URL: ".concat(strValueOf) : new String("LeibnizHttpUrlPinger pinging URL: "));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return;
        }
        zzcgt.zzd("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        super.zza(str);
    }
}
