package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeiv implements zzeee<zzbxn, zzefy> {
    private final zzejz zza;

    public zzeiv(zzejz zzejzVar) {
        this.zza = zzejzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final zzeef<zzbxn, zzefy> zza(String str, JSONObject jSONObject) throws zzfaw {
        zzbxn zzbxnVarZzb = this.zza.zzb(str);
        if (zzbxnVarZzb == null) {
            return null;
        }
        return new zzeef<>(zzbxnVarZzb, new zzefy(), str);
    }
}
