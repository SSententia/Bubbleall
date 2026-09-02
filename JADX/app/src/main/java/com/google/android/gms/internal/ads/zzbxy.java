package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbxy extends zzbxm {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private String zzd = "";

    public zzbxy(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzs(zzbdg zzbdgVar) {
        Bundle bundle;
        Bundle bundle2 = zzbdgVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzt(String str) throws RemoteException {
        String strValueOf = String.valueOf(str);
        zzcgt.zzi(strValueOf.length() != 0 ? "Server parameters: ".concat(strValueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            zzcgt.zzg("", e);
            throw new RemoteException();
        }
    }

    private static final boolean zzu(zzbdg zzbdgVar) {
        if (zzbdgVar.zzf) {
            return true;
        }
        zzber.zza();
        return zzcgm.zzm();
    }

    private static final String zzv(String str, zzbdg zzbdgVar) {
        String str2 = zzbdgVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzbdl zzbdlVar, zzbxq zzbxqVar) throws RemoteException {
        byte b;
        AdFormat adFormat;
        try {
            zzbxw zzbxwVar = new zzbxw(this, zzbxqVar);
            RtbAdapter rtbAdapter = this.zza;
            switch (str) {
                case "banner":
                    b = 0;
                    break;
                case "native":
                    b = 4;
                    break;
                case "rewarded":
                    b = 2;
                    break;
                case "interstitial":
                    b = 1;
                    break;
                case "rewarded_interstitial":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                adFormat = AdFormat.BANNER;
            } else if (b == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (b == 2) {
                adFormat = AdFormat.REWARDED;
            } else if (b == 3) {
                adFormat = AdFormat.REWARDED_INTERSTITIAL;
            } else {
                if (b != 4) {
                    throw new IllegalArgumentException("Internal Error");
                }
                adFormat = AdFormat.NATIVE;
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zza.zza(zzbdlVar.zze, zzbdlVar.zzb, zzbdlVar.zza)), zzbxwVar);
        } catch (Throwable th) {
            zzcgt.zzg("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final zzbya zzf() throws RemoteException {
        return zzbya.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final zzbya zzg() throws RemoteException {
        return zzbya.zza(this.zza.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final zzbhc zzh() {
        MediationExtrasReceiver mediationExtrasReceiver = this.zza;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zzb) {
            try {
                return ((com.google.android.gms.ads.mediation.zzb) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                zzcgt.zzg("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzcgt.zzg("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzl(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxk zzbxkVar, zzbvm zzbvmVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzbdgVar), zzu(zzbdgVar), zzbdgVar.zzk, zzbdgVar.zzg, zzbdgVar.zzt, zzv(str2, zzbdgVar), this.zzd), new zzbxx(this, zzbxkVar, zzbvmVar));
        } catch (Throwable th) {
            zzcgt.zzg("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzcgt.zzg("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzn(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbvm zzbvmVar) throws RemoteException {
        zzr(str, str2, zzbdgVar, iObjectWrapper, zzbxhVar, zzbvmVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzo(String str) {
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzp(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxk zzbxkVar, zzbvm zzbvmVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzbdgVar), zzu(zzbdgVar), zzbdgVar.zzk, zzbdgVar.zzg, zzbdgVar.zzt, zzv(str2, zzbdgVar), this.zzd), new zzbxx(this, zzbxkVar, zzbvmVar));
        } catch (Throwable th) {
            zzcgt.zzg("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzj(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxe zzbxeVar, zzbvm zzbvmVar) throws RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzbdgVar), zzu(zzbdgVar), zzbdgVar.zzk, zzbdgVar.zzg, zzbdgVar.zzt, zzv(str2, zzbdgVar), this.zzd), new zzbxu(this, zzbxeVar, zzbvmVar));
        } catch (Throwable th) {
            zzcgt.zzg("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzr(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbvm zzbvmVar, zzblv zzblvVar) throws RemoteException {
        try {
            this.zza.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzbdgVar), zzu(zzbdgVar), zzbdgVar.zzk, zzbdgVar.zzg, zzbdgVar.zzt, zzv(str2, zzbdgVar), this.zzd, zzblvVar), new zzbxv(this, zzbxhVar, zzbvmVar));
        } catch (Throwable th) {
            zzcgt.zzg("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzi(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxb zzbxbVar, zzbvm zzbvmVar, zzbdl zzbdlVar) throws RemoteException {
        try {
            this.zza.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzbdgVar), zzu(zzbdgVar), zzbdgVar.zzk, zzbdgVar.zzg, zzbdgVar.zzt, zzv(str2, zzbdgVar), com.google.android.gms.ads.zza.zza(zzbdlVar.zze, zzbdlVar.zzb, zzbdlVar.zza), this.zzd), new zzbxs(this, zzbxbVar, zzbvmVar));
        } catch (Throwable th) {
            zzcgt.zzg("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzq(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxb zzbxbVar, zzbvm zzbvmVar, zzbdl zzbdlVar) throws RemoteException {
        try {
            this.zza.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzbdgVar), zzu(zzbdgVar), zzbdgVar.zzk, zzbdgVar.zzg, zzbdgVar.zzt, zzv(str2, zzbdgVar), com.google.android.gms.ads.zza.zza(zzbdlVar.zze, zzbdlVar.zzb, zzbdlVar.zza), this.zzd), new zzbxt(this, zzbxbVar, zzbvmVar));
        } catch (Throwable th) {
            zzcgt.zzg("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }
}
