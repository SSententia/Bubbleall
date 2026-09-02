package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlq implements zzgla<JSONObject> {
    private final zzdlo zza;

    public zzdlq(zzdlo zzdloVar) {
        this.zza = zzdloVar;
    }

    public final JSONObject zza() {
        JSONObject jSONObjectZza = this.zza.zza();
        zzgli.zzb(jSONObjectZza);
        return jSONObjectZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        JSONObject jSONObjectZza = this.zza.zza();
        zzgli.zzb(jSONObjectZza);
        return jSONObjectZza;
    }
}
