package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzfbm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzm extends WebViewClient {
    final /* synthetic */ zzs zza;

    zzm(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.zza.zzg != null) {
            try {
                this.zza.zzg.zzd(zzfbm.zzd(1, null, null));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
            }
        }
        if (this.zza.zzg != null) {
            try {
                this.zza.zzg.zzc(0);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zza.zzU())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (this.zza.zzg != null) {
                try {
                    this.zza.zzg.zzd(zzfbm.zzd(3, null, null));
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
                }
            }
            if (this.zza.zzg != null) {
                try {
                    this.zza.zzg.zzc(3);
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.zza.zzS(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            if (this.zza.zzg != null) {
                try {
                    this.zza.zzg.zzd(zzfbm.zzd(1, null, null));
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e3);
                }
            }
            if (this.zza.zzg != null) {
                try {
                    this.zza.zzg.zzc(0);
                } catch (RemoteException e4) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.zza.zzS(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            if (this.zza.zzg != null) {
                try {
                    this.zza.zzg.zzf();
                } catch (RemoteException e5) {
                    com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e5);
                }
            }
            this.zza.zzS(this.zza.zzR(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        if (this.zza.zzg != null) {
            try {
                this.zza.zzg.zzh();
                this.zza.zzg.zze();
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e6);
            }
        }
        zzs.zzW(this.zza, zzs.zzV(this.zza, str));
        return true;
    }
}
