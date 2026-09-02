package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzdgm<ListenerT> {
    protected final Map<ListenerT, Executor> zza = new HashMap();

    protected zzdgm(Set<zzdih<ListenerT>> set) {
        zzj(set);
    }

    public final synchronized void zzh(zzdih<ListenerT> zzdihVar) {
        zzi(zzdihVar.zza, zzdihVar.zzb);
    }

    public final synchronized void zzi(ListenerT listenert, Executor executor) {
        this.zza.put(listenert, executor);
    }

    public final synchronized void zzj(Set<zzdih<ListenerT>> set) {
        Iterator<zzdih<ListenerT>> it = set.iterator();
        while (it.hasNext()) {
            zzh(it.next());
        }
    }

    protected final synchronized void zzk(final zzdgl<ListenerT> zzdglVar) {
        for (Map.Entry<ListenerT, Executor> entry : this.zza.entrySet()) {
            final ListenerT key = entry.getKey();
            entry.getValue().execute(new Runnable(zzdglVar, key) { // from class: com.google.android.gms.internal.ads.zzdgk
                private final zzdgl zza;
                private final Object zzb;

                {
                    this.zza = zzdglVar;
                    this.zzb = key;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.zza.zza(this.zzb);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzg().zzl(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
