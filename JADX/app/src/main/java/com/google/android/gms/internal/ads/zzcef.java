package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcef {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzcfa zzd;

    private zzcef() {
    }

    /* synthetic */ zzcef(zzceg zzcegVar) {
    }

    public final zzcef zza(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzcef zzb(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzcef zzc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzcef zzd(zzcfa zzcfaVar) {
        this.zzd = zzcfaVar;
        return this;
    }

    public final zzcfb zze() {
        zzgli.zzc(this.zza, Context.class);
        zzgli.zzc(this.zzb, Clock.class);
        zzgli.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzgli.zzc(this.zzd, zzcfa.class);
        return new zzceh(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
