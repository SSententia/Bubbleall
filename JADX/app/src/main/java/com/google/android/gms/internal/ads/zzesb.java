package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzesb<T> {
    private final Set<zzery<? extends zzerx<T>>> zza;
    private final Executor zzb;

    public zzesb(Executor executor, Set<zzery<? extends zzerx<T>>> set) {
        this.zzb = executor;
        this.zza = set;
    }

    public final zzfsm<T> zza(final T t) {
        final ArrayList arrayList = new ArrayList(this.zza.size());
        for (final zzery<? extends zzerx<T>> zzeryVar : this.zza) {
            zzfsm<S> zzfsmVarZza = zzeryVar.zza();
            if (zzbla.zza.zze().booleanValue()) {
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
                zzfsmVarZza.zze(new Runnable(zzeryVar, jElapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzerz
                    private final zzery zza;
                    private final long zzb;

                    {
                        this.zza = zzeryVar;
                        this.zzb = jElapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzery zzeryVar2 = this.zza;
                        long j = this.zzb;
                        String canonicalName = zzeryVar2.getClass().getCanonicalName();
                        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb.append("Signal runtime : ");
                        sb.append(canonicalName);
                        sb.append(" = ");
                        sb.append(jElapsedRealtime2 - j);
                        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    }
                }, zzchg.zzf);
            }
            arrayList.add(zzfsmVarZza);
        }
        return zzfsd.zzo(arrayList).zza(new Callable(arrayList, t) { // from class: com.google.android.gms.internal.ads.zzesa
            private final List zza;
            private final Object zzb;

            {
                this.zza = arrayList;
                this.zzb = t;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = this.zza;
                Object obj = this.zzb;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzerx zzerxVar = (zzerx) ((zzfsm) it.next()).get();
                    if (zzerxVar != null) {
                        zzerxVar.zzf(obj);
                    }
                }
                return obj;
            }
        }, this.zzb);
    }
}
