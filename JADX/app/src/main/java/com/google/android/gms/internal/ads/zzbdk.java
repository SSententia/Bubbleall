package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdk {
    public static final zzbdk zza = new zzbdk();

    protected zzbdk() {
    }

    public final zzbdg zza(Context context, zzbhj zzbhjVar) {
        zzbcx zzbcxVar;
        String strZzl;
        Date dateZza = zzbhjVar.zza();
        long time = dateZza != null ? dateZza.getTime() : -1L;
        String strZzb = zzbhjVar.zzb();
        int iZzd = zzbhjVar.zzd();
        Set<String> setZze = zzbhjVar.zze();
        List listUnmodifiableList = !setZze.isEmpty() ? Collections.unmodifiableList(new ArrayList(setZze)) : null;
        boolean zZzm = zzbhjVar.zzm(context);
        Location locationZzf = zzbhjVar.zzf();
        Bundle bundleZzh = zzbhjVar.zzh(AdMobAdapter.class);
        AdInfo adInfoZzt = zzbhjVar.zzt();
        if (adInfoZzt != null) {
            QueryInfo queryInfo = adInfoZzt.getQueryInfo();
            zzbcxVar = new zzbcx(zzbhjVar.zzt().getAdString(), queryInfo != null ? queryInfo.zza().zzd() : "");
        } else {
            zzbcxVar = null;
        }
        String strZzj = zzbhjVar.zzj();
        SearchAdRequest searchAdRequestZzl = zzbhjVar.zzl();
        zzbio zzbioVar = searchAdRequestZzl != null ? new zzbio(searchAdRequestZzl) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzber.zza();
            strZzl = zzcgm.zzl(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strZzl = null;
        }
        boolean zZzs = zzbhjVar.zzs();
        RequestConfiguration requestConfigurationZzr = zzbhs.zze().zzr();
        return new zzbdg(8, time, bundleZzh, iZzd, listUnmodifiableList, zZzm, Math.max(zzbhjVar.zzp(), requestConfigurationZzr.getTagForChildDirectedTreatment()), false, strZzj, zzbioVar, locationZzf, strZzb, zzbhjVar.zzo(), zzbhjVar.zzq(), Collections.unmodifiableList(new ArrayList(zzbhjVar.zzr())), zzbhjVar.zzk(), strZzl, zZzs, zzbcxVar, Math.max(-1, requestConfigurationZzr.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(null, requestConfigurationZzr.getMaxAdContentRating()), zzbdj.zza), zzbhjVar.zzc(), zzbhjVar.zzv(), zzbhjVar.zzu());
    }
}
