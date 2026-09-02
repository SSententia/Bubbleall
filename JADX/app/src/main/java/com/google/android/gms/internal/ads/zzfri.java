package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzfri<OutputT> extends zzfqw.zzj<OutputT> {
    private static final zzfre zzaO;
    private static final Logger zzaP = Logger.getLogger(zzfri.class.getName());
    private volatile int remaining;

    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzfre zzfrhVar;
        Throwable th;
        zzfrf zzfrfVar = null;
        try {
            zzfrhVar = new zzfrg(AtomicReferenceFieldUpdater.newUpdater(zzfri.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfri.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzfrhVar = new zzfrh(zzfrfVar);
            th = th2;
        }
        zzaO = zzfrhVar;
        if (th != null) {
            zzaP.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzfri(int i) {
        this.remaining = i;
    }

    final Set<Throwable> zzG() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set<Throwable> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzw(setNewSetFromMap);
        zzaO.zza(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        set2.getClass();
        return set2;
    }

    final int zzH() {
        return zzaO.zzb(this);
    }

    final void zzI() {
        this.seenExceptions = null;
    }

    abstract void zzw(Set<Throwable> set);
}
