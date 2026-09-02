package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzdrc implements com.google.android.gms.ads.internal.overlay.zzv {
    private final zzdcj zza;

    private zzdrc(zzdcj zzdcjVar) {
        this.zza = zzdcjVar;
    }

    static com.google.android.gms.ads.internal.overlay.zzv zza(zzdcj zzdcjVar) {
        return new zzdrc(zzdcjVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzv
    public final void zzg() {
        this.zza.zzb();
    }
}
