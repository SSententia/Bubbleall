package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbpi implements zzbpr<zzcml> {
    zzbpi() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        zzcml zzcmlVar2 = zzcmlVar;
        if (zzcmlVar2.zzay() != null) {
            zzcmlVar2.zzay().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzN = zzcmlVar2.zzN();
        if (zzlVarZzN != null) {
            zzlVarZzN.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzO = zzcmlVar2.zzO();
        if (zzlVarZzO != null) {
            zzlVarZzO.zzb();
        } else {
            com.google.android.gms.ads.internal.util.zze.zzi("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
