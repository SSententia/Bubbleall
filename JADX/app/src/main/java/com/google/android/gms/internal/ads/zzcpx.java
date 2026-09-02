package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcpx implements zzewl {
    private final zzcqu zza;
    private Context zzb;
    private String zzc;
    private zzbdl zzd;

    /* synthetic */ zzcpx(zzcqu zzcquVar, zzcql zzcqlVar) {
        this.zza = zzcquVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewl
    public final zzewm zza() {
        zzgli.zzc(this.zzb, Context.class);
        zzgli.zzc(this.zzc, String.class);
        zzgli.zzc(this.zzd, zzbdl.class);
        return new zzcpy(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzewl
    public final /* bridge */ /* synthetic */ zzewl zzb(zzbdl zzbdlVar) {
        zzbdlVar.getClass();
        this.zzd = zzbdlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewl
    public final /* bridge */ /* synthetic */ zzewl zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewl
    public final /* bridge */ /* synthetic */ zzewl zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
