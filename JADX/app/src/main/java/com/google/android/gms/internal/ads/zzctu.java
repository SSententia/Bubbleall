package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzctu implements zzgla<zzavz> {
    private final zzgln<zzezz> zza;
    private final zzgln<zzcgz> zzb;
    private final zzgln<JSONObject> zzc;
    private final zzgln<String> zzd;

    public zzctu(zzgln<zzezz> zzglnVar, zzgln<zzcgz> zzglnVar2, zzgln<JSONObject> zzglnVar3, zzgln<String> zzglnVar4) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzcxw) this.zza).zza();
        zzcgz zzcgzVarZza = ((zzcox) this.zzb).zza();
        JSONObject jSONObjectZzb = this.zzc.zzb();
        String strZzb = this.zzd.zzb();
        boolean zEquals = "native".equals(strZzb);
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzavz(UUID.randomUUID().toString(), zzcgzVarZza, strZzb, jSONObjectZzb, false, zEquals);
    }
}
