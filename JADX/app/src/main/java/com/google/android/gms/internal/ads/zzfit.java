package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfit {
    private final Context zza;
    private final Looper zzb;

    public zzfit(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfjh zzfjhVarZza = zzfjj.zza();
        zzfjhVarZza.zza(this.zza.getPackageName());
        zzfjhVarZza.zzc(2);
        zzfje zzfjeVarZza = zzfjf.zza();
        zzfjeVarZza.zza(str);
        zzfjeVarZza.zzb(2);
        zzfjhVarZza.zzb(zzfjeVarZza);
        new zzfiu(this.zza, this.zzb, zzfjhVarZza.zzah()).zza();
    }
}
