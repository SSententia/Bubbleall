package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbcz;
import com.google.android.gms.internal.ads.zzbgp;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzaw extends zzbgp {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaz zzb;

    zzaw(zzaz zzazVar, Context context) {
        this.zzb = zzazVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zze(zzbcz zzbczVar) {
        if (zzbczVar == null) {
            return;
        }
        this.zzb.zzn(this.zza, zzbczVar.zzb, true, true);
    }
}
