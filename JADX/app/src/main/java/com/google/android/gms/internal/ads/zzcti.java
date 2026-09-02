package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcti implements zzbpr<Object> {
    final /* synthetic */ zzctl zza;

    zzcti(zzctl zzctlVar) {
        this.zza = zzctlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        if (zzctl.zzg(this.zza, map)) {
            this.zza.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcth
                private final zzcti zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza.zzd.zzh();
                }
            });
        }
    }
}
