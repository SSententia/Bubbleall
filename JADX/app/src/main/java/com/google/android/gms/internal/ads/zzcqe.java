package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcqe implements zzdwq {
    private final zzcqu zza;
    private Context zzb;
    private zzbqm zzc;

    /* synthetic */ zzcqe(zzcqu zzcquVar, zzcql zzcqlVar) {
        this.zza = zzcquVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwq
    public final zzdwr zza() {
        zzgli.zzc(this.zzb, Context.class);
        zzgli.zzc(this.zzc, zzbqm.class);
        return new zzcqf(this.zza, this.zzb, this.zzc, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdwq
    public final /* bridge */ /* synthetic */ zzdwq zzb(zzbqm zzbqmVar) {
        zzbqmVar.getClass();
        this.zzc = zzbqmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdwq
    public final /* bridge */ /* synthetic */ zzdwq zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
