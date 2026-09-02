package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbf extends WebViewClient {
    private final /* synthetic */ zzbe zza;

    private zzbf(zzbe zzbeVar) {
        this.zza = zzbeVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zzbe zzbeVar = this.zza;
        if (zzbe.zza(str)) {
            this.zza.zzb.zza(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        zzbe zzbeVar = this.zza;
        if (!zzbe.zza(string)) {
            return false;
        }
        this.zza.zzb.zza(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzbe zzbeVar = this.zza;
        if (!zzbe.zza(str)) {
            return false;
        }
        this.zza.zzb.zza(str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.zza.zzc) {
            return;
        }
        zzbj unused = this.zza.zzb;
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        zzbe.zza(this.zza, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zza.zzb.zza(i, str, str2);
    }
}
