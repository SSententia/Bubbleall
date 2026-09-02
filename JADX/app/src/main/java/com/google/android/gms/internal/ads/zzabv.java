package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabv extends zzzn<Integer, Long> {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;

    public zzabv() {
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    protected final HashMap<Integer, Long> zza() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        map.put(3, this.zzd);
        return map;
    }

    public zzabv(String str) {
        HashMap mapZzb = zzb(str);
        if (mapZzb != null) {
            this.zza = (Long) mapZzb.get(0);
            this.zzb = (Long) mapZzb.get(1);
            this.zzc = (Long) mapZzb.get(2);
            this.zzd = (Long) mapZzb.get(3);
        }
    }
}
