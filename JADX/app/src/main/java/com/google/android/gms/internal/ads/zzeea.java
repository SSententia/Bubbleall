package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeea implements zzbzk {
    private static zzfgk zzb(String str) {
        if ("native".equals(str)) {
            return zzfgk.NATIVE;
        }
        return "javascript".equals(str) ? zzfgk.JAVASCRIPT : zzfgk.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfgj zzj(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("beginToRender")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return zzfgj.BEGIN_TO_RENDER;
        }
        if (b != 1) {
            return b != 2 ? zzfgj.UNSPECIFIED : zzfgj.ONE_PIXEL;
        }
        return zzfgj.DEFINED_BY_JAVASCRIPT;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfgh zzk(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("video")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return zzfgh.HTML_DISPLAY;
        }
        if (b == 1) {
            return zzfgh.NATIVE_DISPLAY;
        }
        if (b != 2) {
            return null;
        }
        return zzfgh.VIDEO;
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final boolean zza(Context context) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzi("Omid flag is disabled");
            return false;
        }
        if (zzfga.zzb()) {
            return true;
        }
        zzfga.zza(context);
        return zzfga.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final String zzc(Context context) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue()) {
            return "a.1.3.3-google_20200416";
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final IObjectWrapper zzd(String str, WebView webView, String str2, String str3, String str4, zzbzm zzbzmVar, zzbzl zzbzlVar, String str5) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() || !zzfga.zzb()) {
            return null;
        }
        zzfgl zzfglVarZza = zzfgl.zza("Google", str);
        zzfgk zzfgkVarZzb = zzb("javascript");
        zzfgh zzfghVarZzk = zzk(zzbzlVar.toString());
        if (zzfgkVarZzb == zzfgk.NONE) {
            com.google.android.gms.ads.internal.util.zze.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfghVarZzk == null) {
            String strValueOf = String.valueOf(zzbzlVar);
            String.valueOf(strValueOf).length();
            com.google.android.gms.ads.internal.util.zze.zzi("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(strValueOf)));
            return null;
        }
        zzfgk zzfgkVarZzb2 = zzb(str4);
        if (zzfghVarZzk != zzfgh.VIDEO || zzfgkVarZzb2 != zzfgk.NONE) {
            return ObjectWrapper.wrap(zzfgc.zze(zzfgd.zza(zzfghVarZzk, zzj(zzbzmVar.toString()), zzfgkVarZzb, zzfgkVarZzb2, true), zzfge.zza(zzfglVarZza, webView, str5, "")));
        }
        String strValueOf2 = String.valueOf(str4);
        com.google.android.gms.ads.internal.util.zze.zzi(strValueOf2.length() != 0 ? "Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2) : new String("Omid html session error; Video events owner unknown for video creative: "));
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final IObjectWrapper zze(String str, WebView webView, String str2, String str3, String str4, String str5, zzbzm zzbzmVar, zzbzl zzbzlVar, String str6) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() || !zzfga.zzb()) {
            return null;
        }
        zzfgl zzfglVarZza = zzfgl.zza(str5, str);
        zzfgk zzfgkVarZzb = zzb("javascript");
        zzfgk zzfgkVarZzb2 = zzb(str4);
        zzfgh zzfghVarZzk = zzk(zzbzlVar.toString());
        if (zzfgkVarZzb == zzfgk.NONE) {
            com.google.android.gms.ads.internal.util.zze.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfghVarZzk == null) {
            String strValueOf = String.valueOf(zzbzlVar);
            String.valueOf(strValueOf).length();
            com.google.android.gms.ads.internal.util.zze.zzi("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(strValueOf)));
            return null;
        }
        if (zzfghVarZzk != zzfgh.VIDEO || zzfgkVarZzb2 != zzfgk.NONE) {
            return ObjectWrapper.wrap(zzfgc.zze(zzfgd.zza(zzfghVarZzk, zzj(zzbzmVar.toString()), zzfgkVarZzb, zzfgkVarZzb2, true), zzfge.zzb(zzfglVarZza, webView, str6, "")));
        }
        String strValueOf2 = String.valueOf(str4);
        com.google.android.gms.ads.internal.util.zze.zzi(strValueOf2.length() != 0 ? "Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2) : new String("Omid js session error; Video events owner unknown for video creative: "));
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzf(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zzfga.zzb()) {
            Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (objUnwrap instanceof zzfgc) {
                ((zzfgc) objUnwrap).zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzg(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zzfga.zzb()) {
            Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (objUnwrap instanceof zzfgc) {
                ((zzfgc) objUnwrap).zzc();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzh(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zzfga.zzb()) {
            Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (objUnwrap instanceof zzfgc) {
                ((zzfgc) objUnwrap).zzb(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzi(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zzfga.zzb()) {
            Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (objUnwrap instanceof zzfgc) {
                ((zzfgc) objUnwrap).zzd(view, zzfgi.NOT_VISIBLE, "Ad overlay");
            }
        }
    }
}
