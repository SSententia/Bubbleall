package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffp implements zzffc {
    private final zzffm zza;
    private final zzffk zzb;

    public zzffp(zzffm zzffmVar, zzffk zzffkVar) {
        this.zza = zzffmVar;
        this.zzb = zzffkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final void zza(zzffb zzffbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final String zzb(zzffb zzffbVar) {
        zzffm zzffmVar = this.zza;
        Map<String, String> mapZzj = zzffbVar.zzj();
        this.zzb.zza(mapZzj);
        return zzffmVar.zza(mapZzj);
    }
}
