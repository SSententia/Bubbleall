package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeai implements zzddx {
    private final Context zza;
    private final zzcfa zzb;

    zzeai(Context context, zzcfa zzcfaVar) {
        this.zza = context;
        this.zzb = zzcfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzbG(zzcbj zzcbjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzq(zzfal zzfalVar) {
        if (TextUtils.isEmpty(zzfalVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzd(this.zza, zzfalVar.zza.zza.zzd);
        this.zzb.zzp(this.zza, zzfalVar.zzb.zzb.zzd);
    }
}
