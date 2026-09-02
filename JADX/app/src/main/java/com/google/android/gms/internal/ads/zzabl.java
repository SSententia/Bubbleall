package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabl implements zzfkh {
    private final zzfik zza;
    private final zzfjb zzb;
    private final zzaby zzc;
    private final zzabk zzd;
    private final zzaav zze;

    zzabl(zzfik zzfikVar, zzfjb zzfjbVar, zzaby zzabyVar, zzabk zzabkVar, zzaav zzaavVar) {
        this.zza = zzfikVar;
        this.zzb = zzfjbVar;
        this.zzc = zzabyVar;
        this.zzd = zzabkVar;
        this.zze = zzaavVar;
    }

    private final Map<String, Object> zze() {
        HashMap map = new HashMap();
        zzyz zzyzVarZzc = this.zzb.zzc();
        map.put("v", this.zza.zza());
        map.put("gms", Boolean.valueOf(this.zza.zzc()));
        map.put("int", zzyzVarZzc.zzc());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        return map;
    }

    final void zza(View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final Map<String, Object> zzb() {
        Map<String, Object> mapZze = zze();
        zzyz zzyzVarZzb = this.zzb.zzb();
        mapZze.put("gai", Boolean.valueOf(this.zza.zzb()));
        mapZze.put("did", zzyzVarZzb.zzd());
        mapZze.put("dst", Integer.valueOf(zzyzVarZzb.zzag() - 1));
        mapZze.put("doo", Boolean.valueOf(zzyzVarZzb.zze()));
        zzaav zzaavVar = this.zze;
        if (zzaavVar != null) {
            mapZze.put("nt", Long.valueOf(zzaavVar.zzd()));
        }
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final Map<String, Object> zzc() {
        return zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final Map<String, Object> zzd() {
        Map<String, Object> mapZze = zze();
        mapZze.put("lts", Long.valueOf(this.zzc.zzc()));
        return mapZze;
    }
}
