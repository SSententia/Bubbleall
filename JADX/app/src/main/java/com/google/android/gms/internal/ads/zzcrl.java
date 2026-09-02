package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcrl implements zzgla<zzcgy> {
    private final zzgln<zzbut> zza;
    private final zzgln<String> zzb;

    public zzcrl(zzgln<zzbut> zzglnVar, zzgln<String> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbuv zzbuvVar = new zzbuv();
        String strZzb = this.zzb.zzb();
        return zzbkz.zza.zze().booleanValue() ? new zzbuu(zzbuvVar, strZzb) : new zzcgy(strZzb);
    }
}
