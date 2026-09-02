package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyw implements zzgla<zzfsm<String>> {
    private final zzgln<zzfes> zza;
    private final zzgln<Context> zzb;

    public zzdyw(zzgln<zzfes> zzglnVar, zzgln<Context> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfes zzfesVarZzb = this.zza.zzb();
        final CookieManager cookieManagerZzk = com.google.android.gms.ads.internal.zzt.zze().zzk(this.zzb.zzb());
        return zzfed.zzb(new Callable(cookieManagerZzk) { // from class: com.google.android.gms.internal.ads.zzdys
            private final CookieManager zza;

            {
                this.zza = cookieManagerZzk;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = this.zza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) zzbet.zzc().zzc(zzbjl.zzaz));
            }
        }, zzfem.WEBVIEW_COOKIE, zzfesVarZzb).zzh(1L, TimeUnit.SECONDS).zzf(Exception.class, zzdyt.zza).zzi();
    }
}
