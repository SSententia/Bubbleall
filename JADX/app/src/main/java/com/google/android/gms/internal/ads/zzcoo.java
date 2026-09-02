package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcoo implements zzgla<Context> {
    private final zzcom zza;

    public zzcoo(zzcom zzcomVar) {
        this.zza = zzcomVar;
    }

    public final Context zza() {
        Context contextZza = this.zza.zza();
        zzgli.zzb(contextZza);
        return contextZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = this.zza.zza();
        zzgli.zzb(contextZza);
        return contextZza;
    }
}
