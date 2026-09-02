package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.media2.session.SessionCommand;
import com.bumptech.glide.load.Key;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
final class zzcne extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcml {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzblt zzC;
    private zzblq zzD;
    private zzaxq zzE;
    private int zzF;
    private int zzG;
    private zzbjx zzH;
    private final zzbjx zzI;
    private zzbjx zzJ;
    private final zzbjy zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzl zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzcl zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map<String, zzcla> zzV;
    private final WindowManager zzW;
    private final zzazb zzX;
    private final zzcoa zzb;
    private final zzaas zzc;
    private final zzbkk zzd;
    private final zzcgz zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzezz zzj;
    private zzfac zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcms zzn;
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    private IObjectWrapper zzp;
    private zzcob zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzcnh zzz;

    protected zzcne(zzcoa zzcoaVar, zzcob zzcobVar, String str, boolean z, boolean z2, zzaas zzaasVar, zzbkk zzbkkVar, zzcgz zzcgzVar, zzbka zzbkaVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzazb zzazbVar, zzezz zzezzVar, zzfac zzfacVar) {
        zzfac zzfacVar2;
        super(zzcoaVar);
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzcoaVar;
        this.zzq = zzcobVar;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzaasVar;
        this.zzd = zzbkkVar;
        this.zze = zzcgzVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzy = com.google.android.gms.ads.internal.util.zzs.zzy(windowManager);
        this.zzh = displayMetricsZzy;
        this.zzi = displayMetricsZzy.density;
        this.zzX = zzazbVar;
        this.zzj = zzezzVar;
        this.zzk = zzfacVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzcl(zzcoaVar.zza(), this, this, null);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMixedContentMode(2);
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zzi(zzcoaVar, zzcgzVar.zza));
        com.google.android.gms.ads.internal.zzt.zze().zza(getContext(), settings);
        setDownloadListener(this);
        zzaX();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(new zzcnm(this, new zzcnl(this) { // from class: com.google.android.gms.internal.ads.zzcnj
                private final zzcml zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzcnl
                public final void zza(Uri uri) {
                    zzcms zzcmsVarZzaS = ((zzcne) this.zza).zzaS();
                    if (zzcmsVarZzaS == null) {
                        com.google.android.gms.ads.internal.util.zze.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    } else {
                        zzcmsVarZzaS.zzF(uri);
                    }
                }
            }), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbc();
        zzbjy zzbjyVar = new zzbjy(new zzbka(true, "make_wv", this.zzr));
        this.zzK = zzbjyVar;
        zzbjyVar.zzc().zza(null);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() && (zzfacVar2 = this.zzk) != null && zzfacVar2.zzb != null) {
            zzbjyVar.zzc().zzd("gqi", this.zzk.zzb);
        }
        zzbjyVar.zzc();
        zzbjx zzbjxVarZzf = zzbka.zzf();
        this.zzI = zzbjxVarZzf;
        zzbjyVar.zza("native:view_create", zzbjxVarZzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.zzt.zze().zzc(zzcoaVar);
        com.google.android.gms.ads.internal.zzt.zzg().zzm();
    }

    private final synchronized void zzaU(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "AdWebViewImpl.loadUrlUnsafe");
            com.google.android.gms.ads.internal.util.zze.zzj("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void zzaV() {
        Boolean boolZzg = com.google.android.gms.ads.internal.zzt.zzg().zzg();
        this.zzw = boolZzg;
        if (boolZzg == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(true);
            } catch (IllegalStateException unused) {
                zzaQ(false);
            }
        }
    }

    private final void zzaW() {
        zzbjs.zza(this.zzK.zzc(), this.zzI, "aeh2");
    }

    private final synchronized void zzaX() {
        zzezz zzezzVar = this.zzj;
        if (zzezzVar != null && zzezzVar.zzaj) {
            com.google.android.gms.ads.internal.util.zze.zzd("Disabling hardware acceleration on an overlay.");
            zzaY();
            return;
        }
        if (!this.zzu && !this.zzq.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zzd("Enabling hardware acceleration on an AdView.");
            zzaZ();
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zzd("Enabling hardware acceleration on an overlay.");
        zzaZ();
    }

    private final synchronized void zzaY() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final synchronized void zzaZ() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzba() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzg().zzn();
    }

    private final synchronized void zzbb() {
        Map<String, zzcla> map = this.zzV;
        if (map != null) {
            Iterator<zzcla> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().release();
            }
        }
        this.zzV = null;
    }

    private final void zzbc() {
        zzbjy zzbjyVar = this.zzK;
        if (zzbjyVar == null) {
            return;
        }
        zzbka zzbkaVarZzc = zzbjyVar.zzc();
        zzbjq zzbjqVarZze = com.google.android.gms.ads.internal.zzt.zzg().zze();
        if (zzbjqVarZze != null) {
            zzbjqVarZze.zzb(zzbkaVarZzc);
        }
    }

    private final void zzbd(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : "1");
        zze("onAdVisibilityChanged", map);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final synchronized void destroy() {
        zzbc();
        this.zzQ.zzc();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzq();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzx();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zza(this);
        zzbb();
        this.zzt = true;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzhc)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzY();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaU("about:blank");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!zzX()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzcgt.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzx();
                    com.google.android.gms.ads.internal.zzt.zzy().zza(this);
                    zzbb();
                    zzba();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzX()) {
            com.google.android.gms.ads.internal.util.zze.zzi("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzX()) {
            com.google.android.gms.ads.internal.util.zze.zzi("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final synchronized void loadUrl(String str) {
        if (zzX()) {
            com.google.android.gms.ads.internal.util.zze.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "AdWebViewImpl.loadUrl");
            com.google.android.gms.ads.internal.util.zze.zzj("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcv
    public final void onAdClicked() {
        zzcms zzcmsVar = this.zzn;
        if (zzcmsVar != null) {
            zzcmsVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzX()) {
            this.zzQ.zzd();
        }
        boolean z = this.zzA;
        zzcms zzcmsVar = this.zzn;
        if (zzcmsVar != null && zzcmsVar.zze()) {
            if (!this.zzB) {
                this.zzn.zzg();
                this.zzn.zzh();
                this.zzB = true;
            }
            zzaM();
            z = true;
        }
        zzbd(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcms zzcmsVar;
        synchronized (this) {
            if (!zzX()) {
                this.zzQ.zze();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzcmsVar = this.zzn) != null && zzcmsVar.zze() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zzg();
                this.zzn.zzh();
                this.zzB = false;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzP(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zZzaM = zzaM();
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzN = zzN();
        if (zzlVarZzN == null || !zZzaM) {
            return;
        }
        zzlVarZzN.zzB();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0080 A[Catch: all -> 0x01ea, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:45:0x0086, B:43:0x0080, B:48:0x0093, B:50:0x009b, B:52:0x00ad, B:55:0x00b4, B:57:0x00d0, B:59:0x00d8, B:58:0x00d4, B:62:0x00dd, B:65:0x00e2, B:67:0x00ea, B:70:0x00f7, B:79:0x011b, B:81:0x0122, B:86:0x012a, B:88:0x013c, B:90:0x014a, B:99:0x015f, B:101:0x01ac, B:102:0x01b0, B:104:0x01b7, B:109:0x01c4, B:111:0x01ca, B:112:0x01cd, B:114:0x01d1, B:115:0x01da, B:118:0x01e5), top: B:124:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        int i3 = 0;
        if (zzX()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzu && !this.zzq.zzh()) {
            if (this.zzq.zzj()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzq.zzi()) {
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzco)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzcnh zzcnhVarZzh = zzh();
                float fZzm = zzcnhVarZzh != null ? zzcnhVarZzh.zzm() : 0.0f;
                if (fZzm == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int i4 = (int) (size2 * fZzm);
                int i5 = (int) (size / fZzm);
                if (size2 != 0) {
                    if (size == 0) {
                        i3 = size;
                    } else if (i4 != 0) {
                        i5 = (int) (i4 / fZzm);
                        i3 = i4;
                    }
                } else if (i5 != 0) {
                    i4 = (int) (i5 * fZzm);
                    i3 = size;
                    size2 = i5;
                } else {
                    size2 = 0;
                    if (size == 0) {
                        i3 = size;
                    } else if (i4 != 0) {
                        i5 = (int) (i4 / fZzm);
                        i3 = i4;
                    }
                }
                setMeasuredDimension(Math.min(i4, i3), Math.min(i5, size2));
                return;
            }
            if (this.zzq.zzf()) {
                if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzcs)).booleanValue() && PlatformVersion.isAtLeastJellyBeanMR1()) {
                    zzab("/contentHeight", new zzcnc(this));
                    zzaP("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    float f = this.zzh.density;
                    int size3 = View.MeasureSpec.getSize(i);
                    int i6 = this.zzG;
                    setMeasuredDimension(size3, i6 != -1 ? (int) (i6 * f) : View.MeasureSpec.getSize(i2));
                    return;
                }
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzq.zzg()) {
                setMeasuredDimension(this.zzh.widthPixels, this.zzh.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size4 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size5 = View.MeasureSpec.getSize(i2);
            int i7 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i8 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            zzcob zzcobVar = this.zzq;
            boolean z = zzcobVar.zzb > i7 || zzcobVar.zza > i8;
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdK)).booleanValue()) {
                zzcob zzcobVar2 = this.zzq;
                int i9 = zzcobVar2.zzb;
                float f2 = this.zzi;
                boolean z2 = ((float) i9) / f2 <= ((float) i7) / f2 && ((float) zzcobVar2.zza) / f2 <= ((float) i8) / f2;
                if (true == z) {
                    z = z2;
                }
            }
            if (!z) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.zzm) {
                    this.zzX.zzc(SessionCommand.COMMAND_CODE_PLAYER_PREPARE);
                    this.zzm = true;
                }
                zzcob zzcobVar3 = this.zzq;
                setMeasuredDimension(zzcobVar3.zzb, zzcobVar3.zza);
                return;
            }
            zzcob zzcobVar4 = this.zzq;
            int i10 = zzcobVar4.zzb;
            float f3 = this.zzi;
            int i11 = zzcobVar4.zza;
            StringBuilder sb = new StringBuilder(103);
            sb.append("Not enough space to show ad. Needs ");
            sb.append((int) (i10 / f3));
            sb.append("x");
            sb.append((int) (i11 / f3));
            sb.append(" dp, but only has ");
            sb.append((int) (size4 / f3));
            sb.append("x");
            sb.append((int) (size5 / f3));
            sb.append(" dp.");
            com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.zzl) {
                return;
            }
            this.zzX.zzc(SessionCommand.COMMAND_CODE_PLAYER_PAUSE);
            this.zzl = true;
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zze() || this.zzn.zzf()) {
            zzaas zzaasVar = this.zzc;
            if (zzaasVar != null) {
                zzaasVar.zzd(motionEvent);
            }
            zzbkk zzbkkVar = this.zzd;
            if (zzbkkVar != null) {
                zzbkkVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                zzblt zzbltVar = this.zzC;
                if (zzbltVar != null) {
                    zzbltVar.zzb(motionEvent);
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcml
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcms) {
            this.zzn = (zzcms) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final synchronized void zzA() {
        zzblq zzblqVar = this.zzD;
        if (zzblqVar != null) {
            zzblqVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final void zzB(int i) {
        this.zzM = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final void zzC(int i) {
        this.zzN = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final int zzD() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final int zzE() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcmc
    public final zzezz zzF() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcnw
    public final View zzH() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzI() {
        zzaW();
        HashMap map = new HashMap(1);
        map.put("version", this.zze.zza);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzJ(int i) {
        if (i == 0) {
            zzbjs.zza(this.zzK.zzc(), this.zzI, "aebb2");
        }
        zzaW();
        this.zzK.zzc();
        this.zzK.zzc().zzd("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.zze.zza);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzK() {
        if (this.zzH == null) {
            zzbjs.zza(this.zzK.zzc(), this.zzI, "aes2");
            this.zzK.zzc();
            zzbjx zzbjxVarZzf = zzbka.zzf();
            this.zzH = zzbjxVarZzf;
            this.zzK.zza("native:view_show", zzbjxVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zze.zza);
        zze("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzL() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final Context zzM() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzO() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcnt
    public final synchronized zzcob zzP() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized String zzQ() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final /* bridge */ /* synthetic */ zzcnz zzR() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final WebViewClient zzS() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized boolean zzT() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcnu
    public final zzaas zzU() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized IObjectWrapper zzV() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized boolean zzW() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized boolean zzX() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzba();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcnd(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized boolean zzZ() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final boolean zzaA() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcni
    public final zzfac zzaB() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzaC(zzezz zzezzVar, zzfac zzfacVar) {
        this.zzj = zzezzVar;
        this.zzk = zzfacVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:8:0x000b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x0007, B:8:0x000b), top: B:16:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0010, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzaD(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        if (!z) {
            zzlVar = this.zzo;
            if (zzlVar != null) {
                zzlVar.zzu(z);
                return;
            }
            return;
        }
        setBackgroundColor(0);
        zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzu(z);
            return;
        }
        return;
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final zzfsm<String> zzaE() {
        zzbkk zzbkkVar = this.zzd;
        return zzbkkVar == null ? zzfsd.zza(null) : zzbkkVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final void zzaF(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zzn.zzo(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final void zzaG(boolean z, int i, boolean z2) {
        this.zzn.zzq(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final void zzaH(boolean z, int i, String str, boolean z2) {
        this.zzn.zzr(z, i, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final void zzaI(boolean z, int i, String str, String str2, boolean z2) {
        this.zzn.zzs(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final void zzaJ(com.google.android.gms.ads.internal.util.zzbu zzbuVar, zzedq zzedqVar, zzdvi zzdviVar, zzffc zzffcVar, String str, String str2, int i) {
        this.zzn.zzp(zzbuVar, zzedqVar, zzdviVar, zzffcVar, str, str2, i);
    }

    public final boolean zzaM() {
        int i;
        int iZzq;
        if (!this.zzn.zzd() && !this.zzn.zze()) {
            return false;
        }
        zzber.zza();
        DisplayMetrics displayMetrics = this.zzh;
        int iZzq2 = zzcgm.zzq(displayMetrics, displayMetrics.widthPixels);
        zzber.zza();
        DisplayMetrics displayMetrics2 = this.zzh;
        int iZzq3 = zzcgm.zzq(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZza = this.zzb.zza();
        if (activityZza == null || activityZza.getWindow() == null) {
            i = iZzq2;
            iZzq = iZzq3;
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            int[] iArrZzT = com.google.android.gms.ads.internal.util.zzs.zzT(activityZza);
            zzber.zza();
            int iZzq4 = zzcgm.zzq(this.zzh, iArrZzT[0]);
            zzber.zza();
            iZzq = zzcgm.zzq(this.zzh, iArrZzT[1]);
            i = iZzq4;
        }
        int i2 = this.zzS;
        if (i2 == iZzq2 && this.zzR == iZzq3 && this.zzT == i && this.zzU == iZzq) {
            return false;
        }
        boolean z = (i2 == iZzq2 && this.zzR == iZzq3) ? false : true;
        this.zzS = iZzq2;
        this.zzR = iZzq3;
        this.zzT = i;
        this.zzU = iZzq;
        new zzbyp(this, "").zzk(iZzq2, iZzq3, i, iZzq, this.zzh.density, this.zzW.getDefaultDisplay().getRotation());
        return z;
    }

    protected final synchronized void zzaN(String str) {
        if (zzX()) {
            com.google.android.gms.ads.internal.util.zze.zzi("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    protected final synchronized void zzaO(String str, ValueCallback<String> valueCallback) {
        if (zzX()) {
            com.google.android.gms.ads.internal.util.zze.zzi("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    protected final void zzaP(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaN(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
            return;
        }
        if (zzaR() == null) {
            zzaV();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
        }
    }

    final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzg().zzf(bool);
    }

    final synchronized Boolean zzaR() {
        return this.zzw;
    }

    public final zzcms zzaS() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized boolean zzaa() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzab(String str, zzbpr<? super zzcml> zzbprVar) {
        zzcms zzcmsVar = this.zzn;
        if (zzcmsVar != null) {
            zzcmsVar.zzu(str, zzbprVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzac(String str, zzbpr<? super zzcml> zzbprVar) {
        zzcms zzcmsVar = this.zzn;
        if (zzcmsVar != null) {
            zzcmsVar.zzv(str, zzbprVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzad(String str, Predicate<zzbpr<? super zzcml>> predicate) {
        zzcms zzcmsVar = this.zzn;
        if (zzcmsVar != null) {
            zzcmsVar.zzw(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzaf(zzcob zzcobVar) {
        this.zzq = zzcobVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzag(boolean z) {
        boolean z2 = this.zzu;
        this.zzu = z;
        zzaX();
        if (z != z2) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzL)).booleanValue() || !this.zzq.zzg()) {
                new zzbyp(this, "").zzj(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzah() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzai(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zza(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzaj(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzt(this.zzn.zzd(), z);
        } else {
            this.zzs = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzak(IObjectWrapper iObjectWrapper) {
        this.zzp = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzal(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzam(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzO = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzan(boolean z) {
        this.zzx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzao() {
        if (this.zzJ == null) {
            this.zzK.zzc();
            zzbjx zzbjxVarZzf = zzbka.zzf();
            this.zzJ = zzbjxVarZzf;
            this.zzK.zza("native:view_load", zzbjxVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzap(zzblt zzbltVar) {
        this.zzC = zzbltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized zzblt zzaq() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzar(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.zzF + (true != z ? -1 : 1);
        this.zzF = i;
        if (i > 0 || (zzlVar = this.zzo) == null) {
            return;
        }
        zzlVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzas() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzat(String str, String str2, String str3) {
        String str4;
        if (zzX()) {
            com.google.android.gms.ads.internal.util.zze.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) zzbet.zzc().zzc(zzbjl.zzK);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, zzcns.zza(str2, strArr), "text/html", Key.STRING_CHARSET_NAME, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzau() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zzav(boolean z) {
        this.zzn.zzD(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzaw(zzblq zzblqVar) {
        this.zzD = zzblqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized void zzax(zzaxq zzaxqVar) {
        this.zzE = zzaxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final synchronized zzaxq zzay() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final boolean zzaz(final boolean z, final int i) {
        destroy();
        this.zzX.zzb(new zzaza(z, i) { // from class: com.google.android.gms.internal.ads.zzcnb
            private final boolean zza;
            private final int zzb;

            {
                this.zza = z;
                this.zzb = i;
            }

            @Override // com.google.android.gms.internal.ads.zzaza
            public final void zza(zzbao zzbaoVar) {
                boolean z2 = this.zza;
                int i2 = this.zzb;
                int i3 = zzcne.zza;
                zzbct zzbctVarZzc = zzbcu.zzc();
                if (zzbctVarZzc.zza() != z2) {
                    zzbctVarZzc.zzb(z2);
                }
                zzbctVarZzc.zzc(i2);
                zzbaoVar.zzj(zzbctVarZzc.zzah());
            }
        });
        this.zzX.zzc(SessionCommand.COMMAND_CODE_PLAYER_SEEK_TO);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdio
    public final void zzb() {
        zzcms zzcmsVar = this.zzn;
        if (zzcmsVar != null) {
            zzcmsVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzbl(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbm() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbm();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbn() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawd
    public final void zzc(zzawc zzawcVar) {
        synchronized (this) {
            this.zzA = zzawcVar.zzj;
        }
        zzbd(zzawcVar.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        String string2 = sb.toString();
        com.google.android.gms.ads.internal.util.zze.zzd(string2.length() != 0 ? "Dispatching AFMA event: ".concat(string2) : new String("Dispatching AFMA event: "));
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zze(String str, Map<String, ?> map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.zzt.zzc().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final zzciq zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final void zzg(boolean z) {
        this.zzn.zzB(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcjb
    public final synchronized zzcnh zzh() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final zzbjx zzi() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcnn, com.google.android.gms.internal.ads.zzcjb
    public final Activity zzj() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcjb
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzN = zzN();
        if (zzlVarZzN != null) {
            zzlVarZzN.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final synchronized String zzm() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final synchronized String zzn() {
        zzfac zzfacVar = this.zzk;
        if (zzfacVar == null) {
            return null;
        }
        return zzfacVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final synchronized void zzo(int i) {
        this.zzL = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final synchronized int zzp() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcjb
    public final zzbjy zzq() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzr(String str, JSONObject jSONObject) {
        zzbl(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final synchronized zzcla zzs(String str) {
        Map<String, zzcla> map = this.zzV;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcnv, com.google.android.gms.internal.ads.zzcjb
    public final zzcgz zzt() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcjb
    public final synchronized void zzu(String str, zzcla zzclaVar) {
        if (this.zzV == null) {
            this.zzV = new HashMap();
        }
        this.zzV.put(str, zzclaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final void zzv(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put("duration", Long.toString(j));
        zze("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final void zzw(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcml, com.google.android.gms.internal.ads.zzcjb
    public final synchronized void zzx(zzcnh zzcnhVar) {
        if (this.zzz != null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcnhVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final int zzy() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcjb
    public final int zzz() {
        return getMeasuredWidth();
    }
}
