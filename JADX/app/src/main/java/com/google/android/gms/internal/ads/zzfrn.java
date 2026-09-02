package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfrn<V, C> extends zzfrd<V, C> {

    @CheckForNull
    private List<zzfrm<V>> zza;

    zzfrn(zzfoe<? extends zzfsm<? extends V>> zzfoeVar, boolean z) {
        super(zzfoeVar, true, true);
        List<zzfrm<V>> listEmptyList = zzfoeVar.isEmpty() ? Collections.emptyList() : zzfpb.zza(zzfoeVar.size());
        for (int i = 0; i < zzfoeVar.size(); i++) {
            listEmptyList.add(null);
        }
        this.zza = listEmptyList;
    }

    @Override // com.google.android.gms.internal.ads.zzfrd
    final void zzA() {
        List<zzfrm<V>> list = this.zza;
        if (list != null) {
            zzp(zzJ(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrd
    final void zzB(int i) {
        super.zzB(i);
        this.zza = null;
    }

    abstract C zzJ(List<zzfrm<V>> list);

    @Override // com.google.android.gms.internal.ads.zzfrd
    final void zzz(int i, V v) {
        List<zzfrm<V>> list = this.zza;
        if (list != null) {
            list.set(i, new zzfrm<>(v));
        }
    }
}
