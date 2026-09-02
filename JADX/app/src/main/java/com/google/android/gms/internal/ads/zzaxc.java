package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.media2.session.MediaConstants;
import com.google.android.gms.common.util.PlatformVersion;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzaxc extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzawt zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzaxc() {
        zzawt zzawtVar = new zzawt();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzawtVar;
        this.zzc = new Object();
        this.zzf = zzbks.zzd.zze().intValue();
        this.zzg = zzbks.zza.zze().intValue();
        this.zzh = zzbks.zze.zze().intValue();
        this.zzi = zzbks.zzc.zze().intValue();
        this.zzj = ((Integer) zzbet.zzc().zzc(zzbjl.zzN)).intValue();
        this.zzk = ((Integer) zzbet.zzc().zzc(zzbjl.zzO)).intValue();
        this.zzl = ((Integer) zzbet.zzc().zzc(zzbjl.zzP)).intValue();
        this.zze = zzbks.zzf.zze().intValue();
        this.zzm = (String) zzbet.zzc().zzc(zzbjl.zzR);
        this.zzn = ((Boolean) zzbet.zzc().zzc(zzbjl.zzS)).booleanValue();
        this.zzo = ((Boolean) zzbet.zzc().zzc(zzbjl.zzT)).booleanValue();
        this.zzp = ((Boolean) zzbet.zzc().zzc(zzbjl.zzU)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ee */
    /* JADX WARN: Code duplicated, block: B:63:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc A[EXC_TOP_SPLITTER, LOOP:1: B:65:0x00dc->B:70:0x00dc, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxc.run():void");
    }

    public final void zza() {
        synchronized (this.zzc) {
            if (this.zza) {
                com.google.android.gms.ads.internal.util.zze.zzd("Content hash thread already started, quiting...");
            } else {
                this.zza = true;
                start();
            }
        }
    }

    final void zzb(View view) {
        try {
            zzaws zzawsVar = new zzaws(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZze = com.google.android.gms.ads.internal.zzt.zzf().zze();
            if (contextZze != null && !TextUtils.isEmpty(this.zzm)) {
                String str = (String) view.getTag(contextZze.getResources().getIdentifier((String) zzbet.zzc().zzc(zzbjl.zzQ), MediaConstants.MEDIA_URI_QUERY_ID, contextZze.getPackageName()));
                if (str != null && str.equals(this.zzm)) {
                    return;
                }
            }
            zzaxb zzaxbVarZzc = zzc(view, zzawsVar);
            zzawsVar.zzk();
            if (zzaxbVarZzc.zza == 0 && zzaxbVarZzc.zzb == 0) {
                return;
            }
            if (zzaxbVarZzc.zzb == 0 && zzawsVar.zzo() == 0) {
                return;
            }
            if (zzaxbVarZzc.zzb == 0 && this.zzd.zzb(zzawsVar)) {
                return;
            }
            this.zzd.zzd(zzawsVar);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "ContentFetchTask.fetchContent");
        }
    }

    final zzaxb zzc(View view, zzaws zzawsVar) {
        if (view == null) {
            return new zzaxb(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzaxb(this, 0, 0);
            }
            zzawsVar.zzi(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzaxb(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcml)) {
            WebView webView = (WebView) view;
            if (!PlatformVersion.isAtLeastKitKat()) {
                return new zzaxb(this, 0, 0);
            }
            zzawsVar.zzg();
            webView.post(new zzaxa(this, zzawsVar, webView, globalVisibleRect));
            return new zzaxb(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzaxb(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            zzaxb zzaxbVarZzc = zzc(viewGroup.getChildAt(i3), zzawsVar);
            i += zzaxbVarZzc.zza;
            i2 += zzaxbVarZzc.zzb;
        }
        return new zzaxb(this, i, i2);
    }

    final void zzd(zzaws zzawsVar, WebView webView, String str, boolean z) {
        zzawsVar.zzf();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzawsVar.zzh(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    zzawsVar.zzh(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzawsVar.zza()) {
                this.zzd.zzc(zzawsVar);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzd("Json string may be malformed.");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zze("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final zzaws zze() {
        return this.zzd.zza(this.zzp);
    }

    public final void zzf() {
        synchronized (this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            com.google.android.gms.ads.internal.util.zze.zzd("ContentFetchThread: wakeup");
        }
    }

    public final void zzg() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = true");
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}
