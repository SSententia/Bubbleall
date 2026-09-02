package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzclf {
    private final ArrayList<zzaud> zza = new ArrayList<>();
    private long zzb;

    zzclf() {
    }

    final long zza() {
        Iterator<zzaud> it = this.zza.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> mapZze = it.next().zze();
            if (mapZze != null) {
                for (Map.Entry<String, List<String>> entry : mapZze.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.zzb = Math.max(this.zzb, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.zzb;
    }

    final void zzb(zzaud zzaudVar) {
        this.zza.add(zzaudVar);
    }
}
