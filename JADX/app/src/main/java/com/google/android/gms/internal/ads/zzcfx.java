package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcfx {
    final /* synthetic */ zzcfy zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzcfx(zzcfy zzcfyVar) {
        this.zza = zzcfyVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb() {
        this.zzc = this.zza.zza.elapsedRealtime();
    }

    public final void zzc() {
        this.zzb = this.zza.zza.elapsedRealtime();
    }

    public final Bundle zzd() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }
}
