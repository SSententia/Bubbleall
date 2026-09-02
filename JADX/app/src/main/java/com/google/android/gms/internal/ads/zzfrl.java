package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfrl<V> extends zzfrn<V, List<V>> {
    zzfrl(zzfoe<? extends zzfsm<? extends V>> zzfoeVar, boolean z) {
        super(zzfoeVar, true);
        zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfrn
    public final /* bridge */ /* synthetic */ Object zzJ(List list) {
        ArrayList arrayListZza = zzfpb.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfrm zzfrmVar = (zzfrm) it.next();
            arrayListZza.add(zzfrmVar != null ? zzfrmVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZza);
    }
}
