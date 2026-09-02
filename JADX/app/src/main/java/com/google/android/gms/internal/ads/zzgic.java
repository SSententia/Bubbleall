package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgic extends zzgik {
    zzgic(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    public final void zza() {
        if (!zzd()) {
            for (int i = 0; i < zze(); i++) {
                Map.Entry entryZzf = zzf(i);
                if (((zzgfq) entryZzf.getKey()).zzc()) {
                    entryZzf.setValue(Collections.unmodifiableList((List) entryZzf.getValue()));
                }
            }
            for (Map.Entry entry : zzg()) {
                if (((zzgfq) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
