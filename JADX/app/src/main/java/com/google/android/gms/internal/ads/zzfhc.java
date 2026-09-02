package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhc implements zzfha {
    private final zzfha zza;

    public zzfhc(zzfha zzfhaVar) {
        this.zza = zzfhaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfha
    public final JSONObject zza(View view) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfha
    public final void zzb(View view, JSONObject jSONObject, zzfgz zzfgzVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        zzfgr zzfgrVarZza = zzfgr.zza();
        if (zzfgrVarZza != null) {
            Collection<zzfgg> collectionZzf = zzfgrVarZza.zzf();
            int size = collectionZzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator<zzfgg> it = collectionZzf.iterator();
            while (it.hasNext()) {
                View viewZzi = it.next().zzi();
                if (viewZzi != null && viewZzi.isAttachedToWindow() && viewZzi.isShown()) {
                    View view2 = viewZzi;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float fZza = zzfhl.zza(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (zzfhl.zza((View) arrayList.get(i)) <= fZza) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == 0.0f) {
                            break;
                        }
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfgzVar.zza((View) arrayList.get(i2), this.zza, jSONObject);
        }
    }
}
