package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzwp implements zzwb {
    private final Map<String, List<zzwc<?>>> zza = new HashMap();
    private final zzvo zzb;
    private final BlockingQueue<zzwc<?>> zzc;
    private final zzvt zzd;

    /* JADX WARN: Multi-variable type inference failed */
    zzwp(zzvo zzvoVar, zzvo zzvoVar2, BlockingQueue<zzwc<?>> blockingQueue, zzvt zzvtVar) {
        this.zzd = blockingQueue;
        this.zzb = zzvoVar;
        this.zzc = zzvoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final void zza(zzwc<?> zzwcVar, zzwi<?> zzwiVar) {
        List<zzwc<?>> listRemove;
        zzvl zzvlVar = zzwiVar.zzb;
        if (zzvlVar == null || zzvlVar.zza(System.currentTimeMillis())) {
            zzb(zzwcVar);
            return;
        }
        String strZzj = zzwcVar.zzj();
        synchronized (this) {
            listRemove = this.zza.remove(strZzj);
        }
        if (listRemove != null) {
            if (zzwo.zzb) {
                zzwo.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), strZzj);
            }
            Iterator<zzwc<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.zzd.zza(it.next(), zzwiVar, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final synchronized void zzb(zzwc<?> zzwcVar) {
        String strZzj = zzwcVar.zzj();
        List<zzwc<?>> listRemove = this.zza.remove(strZzj);
        if (listRemove == null || listRemove.isEmpty()) {
            return;
        }
        if (zzwo.zzb) {
            zzwo.zza("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), strZzj);
        }
        zzwc<?> zzwcVarRemove = listRemove.remove(0);
        this.zza.put(strZzj, listRemove);
        zzwcVarRemove.zzv(this);
        try {
            this.zzc.put(zzwcVarRemove);
        } catch (InterruptedException e) {
            zzwo.zzc("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    final synchronized boolean zzc(zzwc<?> zzwcVar) {
        String strZzj = zzwcVar.zzj();
        if (!this.zza.containsKey(strZzj)) {
            this.zza.put(strZzj, null);
            zzwcVar.zzv(this);
            if (zzwo.zzb) {
                zzwo.zzb("new request, sending to network %s", strZzj);
            }
            return false;
        }
        List<zzwc<?>> arrayList = this.zza.get(strZzj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        zzwcVar.zzd("waiting-for-response");
        arrayList.add(zzwcVar);
        this.zza.put(strZzj, arrayList);
        if (zzwo.zzb) {
            zzwo.zzb("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
        }
        return true;
    }
}
