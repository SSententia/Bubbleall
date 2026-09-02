package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.media2.session.MediaConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdoe {
    private final zzdss zza;
    private final zzdrh zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdoe(zzdss zzdssVar, zzdrh zzdrhVar) {
        this.zza = zzdssVar;
        this.zzb = zzdrhVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzber.zza();
        return zzcgm.zzs(context, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza(final View view, final WindowManager windowManager) throws zzcmw {
        zzcml zzcmlVarZzb = this.zza.zzb(zzbdl.zzb(), null, null);
        View view2 = (View) zzcmlVarZzb;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zzcmlVarZzb.zzab("/sendMessageToSdk", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdny
            private final zzdoe zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zze((zzcml) obj, map);
            }
        });
        zzcmlVarZzb.zzab("/hideValidatorOverlay", new zzbpr(this, windowManager, view) { // from class: com.google.android.gms.internal.ads.zzdnz
            private final zzdoe zza;
            private final WindowManager zzb;
            private final View zzc;

            {
                this.zza = this;
                this.zzb = windowManager;
                this.zzc = view;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zzd(this.zzb, this.zzc, (zzcml) obj, map);
            }
        });
        zzcmlVarZzb.zzab("/open", new zzbqc(null, null, null, null, null));
        this.zzb.zzi(new WeakReference(zzcmlVarZzb), "/loadNativeAdPolicyViolations", new zzbpr(this, view, windowManager) { // from class: com.google.android.gms.internal.ads.zzdoa
            private final zzdoe zza;
            private final View zzb;
            private final WindowManager zzc;

            {
                this.zza = this;
                this.zzb = view;
                this.zzc = windowManager;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zzb(this.zzb, this.zzc, (zzcml) obj, map);
            }
        });
        this.zzb.zzi(new WeakReference(zzcmlVarZzb), "/showValidatorOverlay", zzdob.zza);
        return view2;
    }

    final /* synthetic */ void zzb(final View view, final WindowManager windowManager, final zzcml zzcmlVar, final Map map) {
        zzcmlVar.zzR().zzy(new zzcnx(this, map) { // from class: com.google.android.gms.internal.ads.zzdod
            private final zzdoe zza;
            private final Map zzb;

            {
                this.zza = this;
                this.zzb = map;
            }

            @Override // com.google.android.gms.internal.ads.zzcnx
            public final void zza(boolean z) {
                this.zza.zzc(this.zzb, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) zzbet.zzc().zzc(zzbjl.zzfK)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) zzbet.zzc().zzc(zzbjl.zzfL)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcmlVar.zzaf(zzcob.zzc(iZzf, iZzf2));
        try {
            zzcmlVar.zzG().getSettings().setUseWideViewPort(((Boolean) zzbet.zzc().zzc(zzbjl.zzfM)).booleanValue());
            zzcmlVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) zzbet.zzc().zzc(zzbjl.zzfN)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzj = com.google.android.gms.ads.internal.util.zzca.zzj();
        layoutParamsZzj.x = iZzf3;
        layoutParamsZzj.y = iZzf4;
        windowManager.updateViewLayout(zzcmlVar.zzH(), layoutParamsZzj);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iZzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener(view, zzcmlVar, str, layoutParamsZzj, i, windowManager) { // from class: com.google.android.gms.internal.ads.zzdoc
                private final View zza;
                private final zzcml zzb;
                private final String zzc;
                private final WindowManager.LayoutParams zzd;
                private final int zze;
                private final WindowManager zzf;

                {
                    this.zza = view;
                    this.zzb = zzcmlVar;
                    this.zzc = str;
                    this.zzd = layoutParamsZzj;
                    this.zze = i;
                    this.zzf = windowManager;
                }

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = this.zza;
                    zzcml zzcmlVar2 = this.zzb;
                    String str2 = this.zzc;
                    WindowManager.LayoutParams layoutParams = this.zzd;
                    int i2 = this.zze;
                    WindowManager windowManager2 = this.zzf;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || zzcmlVar2.zzH().getWindowToken() == null) {
                        return;
                    }
                    if ("1".equals(str2) || "2".equals(str2)) {
                        layoutParams.y = rect2.bottom - i2;
                    } else {
                        layoutParams.y = rect2.top - i2;
                    }
                    windowManager2.updateViewLayout(zzcmlVar2.zzH(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcmlVar.loadUrl(str2);
    }

    final /* synthetic */ void zzc(Map map, boolean z) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put(MediaConstants.MEDIA_URI_QUERY_ID, (String) map.get(MediaConstants.MEDIA_URI_QUERY_ID));
        this.zzb.zzg("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void zzd(WindowManager windowManager, View view, zzcml zzcmlVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzd("Hide native ad policy validator overlay.");
        zzcmlVar.zzH().setVisibility(8);
        if (zzcmlVar.zzH().getWindowToken() != null) {
            windowManager.removeView(zzcmlVar.zzH());
        }
        zzcmlVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    final /* synthetic */ void zze(zzcml zzcmlVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }
}
