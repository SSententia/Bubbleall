package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcxg;
import com.google.android.gms.internal.ads.zzdal;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfcy<R extends zzdal<AdT>, AdT extends zzcxg> {
    private final zzfcc zza;
    private final zzfcw<R, AdT> zzb;
    private final zzfby zzc;
    private zzfde<R, AdT> zze;
    private int zzf = 1;
    private final ArrayDeque<zzfcx<R, AdT>> zzd = new ArrayDeque<>();

    public zzfcy(zzfcc zzfccVar, zzfby zzfbyVar, zzfcw<R, AdT> zzfcwVar) {
        this.zza = zzfccVar;
        this.zzc = zzfbyVar;
        this.zzb = zzfcwVar;
        zzfbyVar.zza(new zzfbx(this) { // from class: com.google.android.gms.internal.ads.zzfct
            private final zzfcy zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza() {
                this.zza.zzf();
            }
        });
    }

    static /* synthetic */ zzfde zzb(zzfcy zzfcyVar, zzfde zzfdeVar) {
        zzfcyVar.zze = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeD)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfcx<R, AdT> zzfcxVarPollFirst = this.zzd.pollFirst();
                if (zzfcxVarPollFirst == null || (zzfcxVarPollFirst.zzb() != null && this.zza.zzc(zzfcxVarPollFirst.zzb()))) {
                    zzfde<R, AdT> zzfdeVar = new zzfde<>(this.zza, this.zzb, zzfcxVarPollFirst);
                    this.zze = zzfdeVar;
                    zzfdeVar.zza(new zzfcu(this, zzfcxVarPollFirst));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zzc(zzfcx<R, AdT> zzfcxVar) {
        this.zzd.add(zzfcxVar);
    }

    public final synchronized zzfsm<zzfcv<R, AdT>> zzd(zzfcx<R, AdT> zzfcxVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfcxVar);
    }

    final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
