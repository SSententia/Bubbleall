package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzccc;
import com.google.android.gms.internal.ads.zzccs;
import com.google.android.gms.internal.ads.zzcfn;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzcoj;
import com.google.android.gms.internal.ads.zzdnf;
import com.google.android.gms.internal.ads.zzdnh;
import com.google.android.gms.internal.ads.zzdwq;
import com.google.android.gms.internal.ads.zzekl;
import com.google.android.gms.internal.ads.zzeux;
import com.google.android.gms.internal.ads.zzeuy;
import com.google.android.gms.internal.ads.zzewl;
import com.google.android.gms.internal.ads.zzeye;
import com.google.android.gms.internal.ads.zzezs;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends zzbfw {
    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfn zzb(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, String str, zzbvg zzbvgVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzewl zzewlVarZzl = zzcoj.zza(context, zzbvgVar, i).zzl();
        zzewlVarZzl.zzd(context);
        zzewlVarZzl.zzb(zzbdlVar);
        zzewlVarZzl.zzc(str);
        return zzewlVarZzl.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfn zzc(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, String str, zzbvg zzbvgVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeye zzeyeVarZzq = zzcoj.zza(context, zzbvgVar, i).zzq();
        zzeyeVarZzq.zzd(context);
        zzeyeVarZzq.zzb(zzbdlVar);
        zzeyeVarZzq.zzc(str);
        return zzeyeVarZzq.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfj zzd(IObjectWrapper iObjectWrapper, String str, zzbvg zzbvgVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzekl(zzcoj.zza(context, zzbvgVar, i), context, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbml zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdnh((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 213806000);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzccc zzf(IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezs zzezsVarZzt = zzcoj.zza(context, zzbvgVar, i).zzt();
        zzezsVarZzt.zzc(context);
        return zzezsVarZzt.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbzq zzg(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzs(activity);
        }
        int i = adOverlayInfoParcelZza.zzk;
        if (i == 1) {
            return new com.google.android.gms.ads.internal.overlay.zzr(activity);
        }
        if (i == 2) {
            return new zzaa(activity);
        }
        if (i == 3) {
            return new zzab(activity);
        }
        if (i != 4) {
            return i != 5 ? new com.google.android.gms.ads.internal.overlay.zzs(activity) : new zzy(activity);
        }
        return new zzu(activity, adOverlayInfoParcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbge zzh(IObjectWrapper iObjectWrapper, int i) {
        return zzcoj.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), i).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfn zzi(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, String str, int i) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbdlVar, str, new zzcgz(213806000, i, true, false));
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbmr zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdnf((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzccs zzk(IObjectWrapper iObjectWrapper, String str, zzbvg zzbvgVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezs zzezsVarZzt = zzcoj.zza(context, zzbvgVar, i).zzt();
        zzezsVarZzt.zzc(context);
        zzezsVarZzt.zzb(str);
        return zzezsVarZzt.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfn zzl(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, String str, zzbvg zzbvgVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeux zzeuxVarZzo = zzcoj.zza(context, zzbvgVar, i).zzo();
        zzeuxVarZzo.zzb(str);
        zzeuxVarZzo.zzc(context);
        zzeuy zzeuyVarZza = zzeuxVarZzo.zza();
        return i >= ((Integer) zzbet.zzc().zzc(zzbjl.zzdC)).intValue() ? zzeuyVarZza.zzb() : zzeuyVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzcfn zzm(IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, int i) {
        return zzcoj.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvgVar, i).zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbze zzn(IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, int i) {
        return zzcoj.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvgVar, i).zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbqp zzo(IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, int i, zzbqm zzbqmVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdwq zzdwqVarZzC = zzcoj.zza(context, zzbvgVar, i).zzC();
        zzdwqVarZzC.zzc(context);
        zzdwqVarZzC.zzb(zzbqmVar);
        return zzdwqVarZzC.zza().zzc();
    }
}
