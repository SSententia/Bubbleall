package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzenm implements zzery<zzerx<Bundle>> {
    private final Executor zza;
    private final zzcge zzb;

    zzenm(Executor executor, zzcge zzcgeVar) {
        this.zza = executor;
        this.zzb = zzcgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzerx<Bundle>> zza() {
        return ((Boolean) zzbet.zzc().zzc(zzbjl.zzbN)).booleanValue() ? zzfsd.zza(null) : zzfsd.zzj(this.zzb.zzr(), zzenk.zza, this.zza);
    }
}
