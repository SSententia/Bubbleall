package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzfrx<V> extends zzfry<V> {
    private final zzfsm<V> zza;

    protected zzfrx(zzfsm<V> zzfsmVar) {
        this.zza = zzfsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw, com.google.android.gms.internal.ads.zzfoa
    protected final /* bridge */ /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfry, com.google.android.gms.internal.ads.zzfrw
    protected final /* bridge */ /* synthetic */ Future zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfry
    protected final zzfsm<V> zzc() {
        return this.zza;
    }
}
