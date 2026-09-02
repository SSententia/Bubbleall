package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzehh<AdT> implements zzeec<AdT> {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final boolean zza(zzfal zzfalVar, zzezz zzezzVar) {
        return !TextUtils.isEmpty(zzezzVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final zzfsm<AdT> zzb(zzfal zzfalVar, zzezz zzezzVar) {
        String strOptString = zzezzVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfar zzfarVar = zzfalVar.zza.zza;
        zzfap zzfapVar = new zzfap();
        zzfapVar.zzK(zzfarVar);
        zzfapVar.zzw(strOptString);
        Bundle bundleZzd = zzd(zzfarVar.zzd.zzm);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = zzezzVar.zzv.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = zzezzVar.zzv.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = zzezzVar.zzD.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = zzezzVar.zzD.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        zzbdg zzbdgVar = zzfarVar.zzd;
        zzfapVar.zzr(new zzbdg(zzbdgVar.zza, zzbdgVar.zzb, bundleZzd2, zzbdgVar.zzd, zzbdgVar.zze, zzbdgVar.zzf, zzbdgVar.zzg, zzbdgVar.zzh, zzbdgVar.zzi, zzbdgVar.zzj, zzbdgVar.zzk, zzbdgVar.zzl, bundleZzd, zzbdgVar.zzn, zzbdgVar.zzo, zzbdgVar.zzp, zzbdgVar.zzq, zzbdgVar.zzr, zzbdgVar.zzs, zzbdgVar.zzt, zzbdgVar.zzu, zzbdgVar.zzv, zzbdgVar.zzw, zzbdgVar.zzx));
        zzfar zzfarVarZzL = zzfapVar.zzL();
        Bundle bundle = new Bundle();
        zzfac zzfacVar = zzfalVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfacVar.zza));
        bundle2.putInt("refresh_interval", zzfacVar.zzc);
        bundle2.putString("gws_query_id", zzfacVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfalVar.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzezzVar.zzw);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzezzVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzezzVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzezzVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzezzVar.zzn));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzezzVar.zzh));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzezzVar.zzi));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzezzVar.zzj));
        bundle3.putString("transaction_id", zzezzVar.zzk);
        bundle3.putString("valid_from_timestamp", zzezzVar.zzl);
        bundle3.putBoolean("is_closable_area_disabled", zzezzVar.zzL);
        if (zzezzVar.zzm != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzezzVar.zzm.zzb);
            bundle4.putString("rb_type", zzezzVar.zzm.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzfarVarZzL, bundle);
    }

    protected abstract zzfsm<AdT> zzc(zzfar zzfarVar, Bundle bundle);
}
