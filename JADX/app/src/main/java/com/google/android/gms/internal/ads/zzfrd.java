package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfrd<InputT, OutputT> extends zzfri<OutputT> {
    private static final Logger zza = Logger.getLogger(zzfrd.class.getName());

    @CheckForNull
    private zzfoe<? extends zzfsm<? extends InputT>> zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzfrd(zzfoe<? extends zzfsm<? extends InputT>> zzfoeVar, boolean z, boolean z2) {
        super(zzfoeVar.size());
        zzfoeVar.getClass();
        this.zzb = zzfoeVar;
        this.zzc = z;
        this.zzd = z2;
    }

    private static void zzK(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzL(int i, Future<? extends InputT> future) {
        try {
            zzz(i, zzfsd.zzq(future));
        } catch (ExecutionException e) {
            zzJ(e.getCause());
        } catch (Throwable th) {
            zzJ(th);
        }
    }

    private static boolean zzM(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    static /* synthetic */ zzfoe zza(zzfrd zzfrdVar, zzfoe zzfoeVar) {
        zzfrdVar.zzb = null;
        return null;
    }

    static /* synthetic */ void zzy(zzfrd zzfrdVar, zzfoe zzfoeVar) {
        int iZzH = zzfrdVar.zzH();
        int i = 0;
        zzflx.zzb(iZzH >= 0, "Less than 0 remaining futures");
        if (iZzH == 0) {
            if (zzfoeVar != null) {
                zzfql it = zzfoeVar.iterator();
                while (it.hasNext()) {
                    Future<? extends InputT> future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzfrdVar.zzL(i, future);
                    }
                    i++;
                }
            }
            zzfrdVar.zzI();
            zzfrdVar.zzA();
            zzfrdVar.zzB(2);
        }
    }

    abstract void zzA();

    void zzB(int i) {
        this.zzb = null;
    }

    final void zzb() {
        zzfoe<? extends zzfsm<? extends InputT>> zzfoeVar = this.zzb;
        zzfoeVar.getClass();
        if (zzfoeVar.isEmpty()) {
            zzA();
            return;
        }
        if (!this.zzc) {
            zzfrc zzfrcVar = new zzfrc(this, this.zzd ? this.zzb : null);
            zzfql<? extends zzfsm<? extends InputT>> it = this.zzb.iterator();
            while (it.hasNext()) {
                it.next().zze(zzfrcVar, zzfrr.INSTANCE);
            }
            return;
        }
        zzfql<? extends zzfsm<? extends InputT>> it2 = this.zzb.iterator();
        int i = 0;
        while (it2.hasNext()) {
            zzfsm<? extends InputT> next = it2.next();
            next.zze(new zzfrb(this, next, i), zzfrr.INSTANCE);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    @CheckForNull
    protected final String zzc() {
        zzfoe<? extends zzfsm<? extends InputT>> zzfoeVar = this.zzb;
        return zzfoeVar != null ? "futures=".concat(zzfoeVar.toString()) : super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    protected final void zzd() {
        zzfoe<? extends zzfsm<? extends InputT>> zzfoeVar = this.zzb;
        zzB(1);
        if ((zzfoeVar != null) && isCancelled()) {
            boolean zZzo = zzo();
            zzfql<? extends zzfsm<? extends InputT>> it = zzfoeVar.iterator();
            while (it.hasNext()) {
                it.next().cancel(zZzo);
            }
        }
    }

    abstract void zzz(int i, InputT inputt);

    @Override // com.google.android.gms.internal.ads.zzfri
    final void zzw(Set<Throwable> set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzu = zzu();
        thZzu.getClass();
        zzM(set, thZzu);
    }

    private final void zzJ(Throwable th) {
        th.getClass();
        if (this.zzc && !zzq(th) && zzM(zzG(), th)) {
            zzK(th);
        } else if (th instanceof Error) {
            zzK(th);
        }
    }
}
