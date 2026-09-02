package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzboy implements zzfln {
    static final zzfln zza = new zzboy();

    private zzboy() {
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzbpr<zzcml> zzbprVar = zzbpq.zza;
        if (!zzbkx.zzk.zze().booleanValue()) {
            return "failure_click_attok";
        }
        com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "prepareClickUrl.attestation1");
        return "failure_click_attok";
    }
}
