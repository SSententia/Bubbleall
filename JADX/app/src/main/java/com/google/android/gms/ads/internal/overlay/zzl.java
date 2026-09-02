package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.load.Key;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzazb;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbor;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbzp;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzcml;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.internal.ads.zzcnx;
import com.google.android.gms.internal.ads.zzcnz;
import com.google.android.gms.internal.ads.zzcob;
import com.google.android.gms.internal.ads.zzdbp;
import com.google.android.gms.internal.ads.zzdio;
import com.google.android.gms.internal.ads.zzedy;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzl extends zzbzp implements zzz {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcml zzd;
    zzh zze;
    zzq zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzG(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        int i;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zZzo = com.google.android.gms.ads.internal.zzt.zze().zzo(this.zzb, configuration);
        if ((!this.zzk || z3) && !zZzo) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzaM)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z) {
                i = z2 ? 5894 : 5380;
            } else {
                i = 256;
            }
            decorView.setSystemUiVisibility(i);
            return;
        }
        if (!z) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z2) {
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        }
    }

    private static final void zzH(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzr().zzh(iObjectWrapper, view);
    }

    final void zzA() {
        zzcml zzcmlVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcml zzcmlVar2 = this.zzd;
        if (zzcmlVar2 != null) {
            this.zzl.removeView(zzcmlVar2.zzH());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.zzai(zzhVar.zzd);
                this.zzd.zzag(false);
                ViewGroup viewGroup = this.zze.zzc;
                View viewZzH = this.zzd.zzH();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(viewZzH, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzai(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbs(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcmlVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzH(zzcmlVar.zzV(), this.zzc.zzd.zzH());
    }

    public final void zzB() {
        if (this.zzm) {
            this.zzm = false;
            zzC();
        }
    }

    protected final void zzC() {
        this.zzd.zzK();
    }

    public final void zzD() {
        this.zzl.zzb = true;
    }

    public final void zzE() {
        synchronized (this.zzo) {
            this.zzq = true;
            if (this.zzp != null) {
                com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzp);
                com.google.android.gms.ads.internal.util.zzs.zza.post(this.zzp);
            }
        }
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final void zzd() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zze() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzf() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final boolean zzg() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zZzZ = this.zzd.zzZ();
        if (!zZzZ) {
            this.zzd.zze("onbackblocked", Collections.emptyMap());
        }
        return zZzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public void zzh(Bundle bundle) {
        this.zzb.requestWindowFeature(1);
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzf("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzm.zzc > 7500000) {
                this.zzn = 4;
            }
            if (this.zzb.getIntent() != null) {
                this.zzu = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzj zzjVar = adOverlayInfoParcel.zzo;
            if (zzjVar != null) {
                boolean z = zzjVar.zza;
                this.zzk = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzjVar.zzf != -1) {
                        new zzk(this, null).zzc();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzk(this, null).zzc();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzu) {
                    zzdbp zzdbpVar = this.zzc.zzx;
                    if (zzdbpVar != null) {
                        zzdbpVar.zzc();
                    }
                    zzo zzoVar = this.zzc.zzc;
                    if (zzoVar != null) {
                        zzoVar.zzbp();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    zzbcv zzbcvVar = adOverlayInfoParcel2.zzb;
                    if (zzbcvVar != null) {
                        zzbcvVar.onAdClicked();
                    }
                    zzdio zzdioVar = this.zzc.zzy;
                    if (zzdioVar != null) {
                        zzdioVar.zzb();
                    }
                }
            }
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            zzg zzgVar = new zzg(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.zza, adOverlayInfoParcel3.zzw);
            this.zzl = zzgVar;
            zzgVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.zze().zzr(this.zzb);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            int i = adOverlayInfoParcel4.zzk;
            if (i == 1) {
                zzy(false);
                return;
            }
            if (i == 2) {
                this.zze = new zzh(adOverlayInfoParcel4.zzd);
                zzy(false);
            } else if (i == 3) {
                zzy(true);
            } else {
                if (i != 5) {
                    throw new zzf("Could not determine ad overlay type.");
                }
                zzy(false);
            }
        } catch (zzf e) {
            com.google.android.gms.ads.internal.util.zze.zzi(e.getMessage());
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzj() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdl)).booleanValue()) {
            zzcml zzcmlVar = this.zzd;
            if (zzcmlVar == null || zzcmlVar.zzX()) {
                com.google.android.gms.ads.internal.util.zze.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzk() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbr();
        }
        zzG(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdl)).booleanValue()) {
            return;
        }
        zzcml zzcmlVar = this.zzd;
        if (zzcmlVar == null || zzcmlVar.zzX()) {
            com.google.android.gms.ads.internal.util.zze.zzi("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzl() {
        zzo zzoVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbq();
        }
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzdl)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzm(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzn(IObjectWrapper iObjectWrapper) {
        zzG((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzp() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdl)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzq() {
        zzcml zzcmlVar = this.zzd;
        if (zzcmlVar != null) {
            try {
                this.zzl.removeView(zzcmlVar.zzH());
            } catch (NullPointerException unused) {
            }
        }
        zzz();
    }

    public final void zzr(boolean z) {
        int iIntValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzdn)).intValue();
        boolean z2 = ((Boolean) zzbet.zzc().zzc(zzbjl.zzaL)).booleanValue() || z;
        zzp zzpVar = new zzp();
        zzpVar.zzd = 50;
        zzpVar.zza = true != z2 ? 0 : iIntValue;
        zzpVar.zzb = true != z2 ? iIntValue : 0;
        zzpVar.zzc = iIntValue;
        this.zzf = new zzq(this.zzb, zzpVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzt(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzs() {
        this.zzr = true;
    }

    public final void zzt(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzbet.zzc().zzc(zzbjl.zzaJ)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzbet.zzc().zzc(zzbjl.zzaK)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbyp(this.zzd, "useCustomClose").zzf("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzq zzqVar = this.zzf;
        if (zzqVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzqVar.zza(z3);
        }
    }

    public final void zzu(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzv() {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzbet.zzc().zzc(zzbjl.zzem)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzbet.zzc().zzc(zzbjl.zzen)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzbet.zzc().zzc(zzbjl.zzeo)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzbet.zzc().zzc(zzbjl.zzep)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzg().zzl(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzx(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    protected final void zzy(boolean z) throws zzf {
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window == null) {
            throw new zzf("Invalid activity, no window available.");
        }
        zzcml zzcmlVar = this.zzc.zzd;
        zzcnz zzcnzVarZzR = zzcmlVar != null ? zzcmlVar.zzR() : null;
        boolean z2 = false;
        boolean z3 = zzcnzVarZzR != null && zzcnzVarZzR.zzd();
        this.zzm = false;
        if (z3) {
            int i = this.zzc.zzj;
            if (i == 6) {
                z2 = this.zzb.getResources().getConfiguration().orientation == 1;
                this.zzm = z2;
            } else if (i == 7) {
                z2 = this.zzb.getResources().getConfiguration().orientation == 2;
                this.zzm = z2;
            }
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z2);
        com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        zzw(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.zze.zzd("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
            this.zzl.setBackgroundColor(zza);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        this.zzb.setContentView(this.zzl);
        this.zzr = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                Activity activity = this.zzb;
                zzcml zzcmlVar2 = this.zzc.zzd;
                zzcob zzcobVarZzP = zzcmlVar2 != null ? zzcmlVar2.zzP() : null;
                zzcml zzcmlVar3 = this.zzc.zzd;
                String strZzQ = zzcmlVar3 != null ? zzcmlVar3.zzQ() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                zzcgz zzcgzVar = adOverlayInfoParcel.zzm;
                zzcml zzcmlVar4 = adOverlayInfoParcel.zzd;
                zzcml zzcmlVarZza = zzcmx.zza(activity, zzcobVarZzP, strZzQ, true, z3, null, null, zzcgzVar, null, null, zzcmlVar4 != null ? zzcmlVar4.zzk() : null, zzazb.zza(), null, null);
                this.zzd = zzcmlVarZza;
                zzcnz zzcnzVarZzR2 = zzcmlVarZza.zzR();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                zzbor zzborVar = adOverlayInfoParcel2.zzp;
                zzbot zzbotVar = adOverlayInfoParcel2.zze;
                zzv zzvVar = adOverlayInfoParcel2.zzi;
                zzcml zzcmlVar5 = adOverlayInfoParcel2.zzd;
                zzcnzVarZzR2.zzL(null, zzborVar, null, zzbotVar, zzvVar, true, null, zzcmlVar5 != null ? zzcmlVar5.zzR().zzc() : null, null, null, null, null, null, null, null, null);
                this.zzd.zzR().zzy(new zzcnx(this) { // from class: com.google.android.gms.ads.internal.overlay.zzd
                    private final zzl zza;

                    {
                        this.zza = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcnx
                    public final void zza(boolean z4) {
                        zzcml zzcmlVar6 = this.zza.zzd;
                        if (zzcmlVar6 != null) {
                            zzcmlVar6.zzK();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.zzd.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new zzf("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", Key.STRING_CHARSET_NAME, null);
                }
                zzcml zzcmlVar6 = this.zzc.zzd;
                if (zzcmlVar6 != null) {
                    zzcmlVar6.zzam(this);
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Error obtaining webview.", e);
                throw new zzf("Could not obtain webview for the overlay.");
            }
        } else {
            zzcml zzcmlVar7 = this.zzc.zzd;
            this.zzd = zzcmlVar7;
            zzcmlVar7.zzai(this.zzb);
        }
        this.zzd.zzae(this);
        zzcml zzcmlVar8 = this.zzc.zzd;
        if (zzcmlVar8 != null) {
            zzH(zzcmlVar8.zzV(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzd.zzH());
            }
            if (this.zzk) {
                this.zzd.zzas();
            }
            this.zzl.addView(this.zzd.zzH(), -1, -1);
        }
        if (!z && !this.zzm) {
            zzC();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
        if (adOverlayInfoParcel4.zzk == 5) {
            zzedy.zzc(this.zzb, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
            return;
        }
        zzr(z3);
        if (this.zzd.zzT()) {
            zzt(z3, true);
        }
    }

    protected final void zzz() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.zzb.isFinishing() || this.zzs) {
            return;
        }
        this.zzs = true;
        zzcml zzcmlVar = this.zzd;
        if (zzcmlVar != null) {
            zzcmlVar.zzJ(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzq && this.zzd.zzaa()) {
                    if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdj)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzd();
                    }
                    this.zzp = new Runnable(this) { // from class: com.google.android.gms.ads.internal.overlay.zze
                        private final zzl zza;

                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzA();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this.zzp, ((Long) zzbet.zzc().zzc(zzbjl.zzaI)).longValue());
                    return;
                }
            }
        }
        zzA();
    }
}
