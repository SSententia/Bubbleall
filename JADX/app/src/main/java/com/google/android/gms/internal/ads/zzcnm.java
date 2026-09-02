package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.zzcnn;
import com.google.android.gms.internal.ads.zzcnu;
import com.google.android.gms.internal.ads.zzcnw;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcnm<WebViewT extends zzcnn & zzcnu & zzcnw> {
    private final zzcnl zza;
    private final WebViewT zzb;

    public zzcnm(WebViewT webviewt, zzcnl zzcnlVar) {
        this.zza = zzcnlVar;
        this.zzb = webviewt;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzaas zzaasVarZzU = this.zzb.zzU();
        if (zzaasVarZzU == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaao zzaaoVarZzb = zzaasVarZzU.zzb();
        if (zzaaoVarZzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zzb.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        Context context = this.zzb.getContext();
        WebViewT webviewt = this.zzb;
        return zzaaoVarZzb.zzl(context, str, (View) webviewt, webviewt.zzj());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zzi("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzcnk
                private final zzcnm zza;
                private final String zzb;

                {
                    this.zza = this;
                    this.zzb = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(this.zzb);
                }
            });
        }
    }

    final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }
}
