package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcom {
    private final zzcgz zza;
    private final Context zzb;
    private final WeakReference<Context> zzc;

    /* synthetic */ zzcom(zzcok zzcokVar, zzcol zzcolVar) {
        this.zza = zzcokVar.zza;
        this.zzb = zzcokVar.zzb;
        this.zzc = zzcokVar.zzc;
    }

    final Context zza() {
        return this.zzb;
    }

    final WeakReference<Context> zzb() {
        return this.zzc;
    }

    final zzcgz zzc() {
        return this.zza;
    }

    final String zzd() {
        return com.google.android.gms.ads.internal.zzt.zzc().zzi(this.zzb, this.zza.zza);
    }

    public final zzaas zze() {
        return new zzaas(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }
}
