package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzejx {
    private final zzdkf zza;

    public zzejx(Context context, zzdkf zzdkfVar) {
        this.zza = zzdkfVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfal zzfalVar, zzezz zzezzVar, View view, zzejt zzejtVar) {
        zzdjj zzdjjVarZzQ = this.zza.zzQ(new zzcxv(zzfalVar, zzezzVar, null), new zzejv(this, zzeju.zza));
        zzejtVar.zzd(new zzejw(this, zzdjjVarZzQ));
        return zzdjjVarZzQ.zzh();
    }
}
