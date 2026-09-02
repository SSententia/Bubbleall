package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcgl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzn implements zzcgl {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;

    zzn(zzs zzsVar, Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcgl
    public final void zza(String str) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzN(this.zza, this.zzb, str);
    }
}
