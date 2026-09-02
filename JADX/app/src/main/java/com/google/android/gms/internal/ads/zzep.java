package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzep implements zzdt {
    final /* synthetic */ zzer zza;

    /* synthetic */ zzep(zzer zzerVar, zzeq zzeqVar) {
        this.zza = zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zza() {
        if (this.zza.zzl != null) {
            this.zza.zzl.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzb(Exception exc) {
        zzaln.zzb("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzi(exc);
    }
}
