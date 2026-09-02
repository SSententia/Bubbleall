package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfry<V> extends zzfrw<V> implements zzfsm<V> {
    protected zzfry() {
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    protected /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    protected abstract zzfsm<? extends V> zzc();

    @Override // com.google.android.gms.internal.ads.zzfsm
    public final void zze(Runnable runnable, Executor executor) {
        zzc().zze(runnable, executor);
    }
}
