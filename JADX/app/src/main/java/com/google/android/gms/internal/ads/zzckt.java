package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzckt implements Iterable<zzcks> {
    private final List<zzcks> zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator<zzcks> iterator() {
        return this.zza.iterator();
    }

    public final boolean zza(zzcjb zzcjbVar) {
        ArrayList arrayList = new ArrayList();
        for (zzcks zzcksVar : this) {
            if (zzcksVar.zza == zzcjbVar) {
                arrayList.add(zzcksVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zzcks) it.next()).zzb.zzm();
        }
        return true;
    }

    final zzcks zzb(zzcjb zzcjbVar) {
        for (zzcks zzcksVar : this) {
            if (zzcksVar.zza == zzcjbVar) {
                return zzcksVar;
            }
        }
        return null;
    }

    public final void zzc(zzcks zzcksVar) {
        this.zza.add(zzcksVar);
    }

    public final void zzd(zzcks zzcksVar) {
        this.zza.remove(zzcksVar);
    }
}
