package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaay extends zzzn<Integer, Long> {
    public long zza;
    public long zzb;

    public zzaay() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    protected final HashMap<Integer, Long> zza() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, Long.valueOf(this.zza));
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzaay(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap mapZzb = zzb(str);
        if (mapZzb != null) {
            this.zza = ((Long) mapZzb.get(0)).longValue();
            this.zzb = ((Long) mapZzb.get(1)).longValue();
        }
    }
}
