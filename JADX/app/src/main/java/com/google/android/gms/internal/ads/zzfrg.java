package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0176xc40028dd;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfrg extends zzfre {
    final AtomicReferenceFieldUpdater<zzfri<?>, Set<Throwable>> zza;
    final AtomicIntegerFieldUpdater<zzfri<?>> zzb;

    zzfrg(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    final void zza(zzfri<?> zzfriVar, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
        C0176xc40028dd.m82m(this.zza, zzfriVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    final int zzb(zzfri<?> zzfriVar) {
        return this.zzb.decrementAndGet(zzfriVar);
    }
}
