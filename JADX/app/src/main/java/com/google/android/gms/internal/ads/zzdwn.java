package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwn implements zzgla<zzdwm> {
    private final zzgln<zzbqm> zza;

    public zzdwn(zzgln<zzbqm> zzglnVar) {
        this.zza = zzglnVar;
    }

    public static zzdwm zzc(zzbqm zzbqmVar) {
        return new zzdwm(zzbqmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdwm zzb() {
        return new zzdwm(this.zza.zzb());
    }
}
