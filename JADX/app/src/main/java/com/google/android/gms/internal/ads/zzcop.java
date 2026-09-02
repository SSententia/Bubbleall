package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcop implements zzgla<WeakReference<Context>> {
    private final zzcom zza;

    public zzcop(zzcom zzcomVar) {
        this.zza = zzcomVar;
    }

    public final WeakReference<Context> zza() {
        WeakReference<Context> weakReferenceZzb = this.zza.zzb();
        zzgli.zzb(weakReferenceZzb);
        return weakReferenceZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        WeakReference<Context> weakReferenceZzb = this.zza.zzb();
        zzgli.zzb(weakReferenceZzb);
        return weakReferenceZzb;
    }
}
