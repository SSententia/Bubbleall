package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzbk implements zzwg {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbo zzb;

    zzbk(zzbr zzbrVar, String str, zzbo zzboVar) {
        this.zza = str;
        this.zzb = zzboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zza(zzwl zzwlVar) {
        String str = this.zza;
        String string = zzwlVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        zze.zzi(sb.toString());
        this.zzb.zza((Object) null);
    }
}
