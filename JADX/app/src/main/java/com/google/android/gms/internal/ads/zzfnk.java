package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfnk extends zzfnn<Map.Entry> {
    final /* synthetic */ zzfns zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfnk(zzfns zzfnsVar) {
        super(zzfnsVar, null);
        this.zza = zzfnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnn
    final /* bridge */ /* synthetic */ Map.Entry zza(int i) {
        return new zzfnp(this.zza, i);
    }
}
