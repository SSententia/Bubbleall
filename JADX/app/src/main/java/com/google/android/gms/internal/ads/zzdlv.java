package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlv implements zzgla<zzavz> {
    private final zzgln<zzcgz> zza;
    private final zzgln<String> zzb;

    public zzdlv(zzgln<zzcgz> zzglnVar, zzgln<String> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgz zzcgzVarZza = ((zzcox) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzavz(UUID.randomUUID().toString(), zzcgzVarZza, "native", new JSONObject(), false, true);
    }
}
