package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzemw implements zzery<zzerx<Bundle>> {
    private final Set<String> zza;

    zzemw(Set<String> set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzerx<Bundle>> zza() {
        final ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return zzfsd.zza(new zzerx(arrayList) { // from class: com.google.android.gms.internal.ads.zzemv
            private final ArrayList zza;

            {
                this.zza = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzerx
            public final void zzf(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.zza);
            }
        });
    }
}
