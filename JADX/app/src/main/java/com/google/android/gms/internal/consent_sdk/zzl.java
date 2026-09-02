package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.content.p002pm.PackageInfoCompat;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzl {
    private final zzn zza;
    private final Activity zzb;
    private final ConsentDebugSettings zzc;
    private final ConsentRequestParameters zzd;

    private zzl(zzn zznVar, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbn zza() throws zzk {
        List<zzbs> arrayList;
        List<zzbw> listEmptyList;
        String string;
        zzbn zzbnVar = new zzbn();
        zzbnVar.zza = zzc();
        zza zzaVarZza = this.zza.zzb.zza();
        if (zzaVarZza != null) {
            zzbnVar.zzb = zzaVarZza.zza;
            zzbnVar.zzi = Boolean.valueOf(zzaVarZza.zzb);
        }
        if (!this.zzc.isTestDevice()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList<>();
            int debugGeography = this.zzc.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(zzbs.GEO_OVERRIDE_EEA);
            } else if (debugGeography == 2) {
                arrayList.add(zzbs.GEO_OVERRIDE_NON_EEA);
            }
        }
        zzbnVar.zzn = arrayList;
        Application application = this.zza.zza;
        Set<String> setZzc = this.zza.zzc.zzc();
        HashMap map = new HashMap();
        for (String str : setZzc) {
            zzcb zzcbVarZza = zzcc.zza(application, str);
            if (zzcbVarZza == null) {
                String strValueOf = String.valueOf(str);
                Log.d("UserMessagingPlatform", strValueOf.length() != 0 ? "Fetching request info: failed for key: ".concat(strValueOf) : new String("Fetching request info: failed for key: "));
            } else {
                Object obj = application.getSharedPreferences(zzcbVarZza.zza, 0).getAll().get(zzcbVarZza.zzb);
                if (obj == null) {
                    String strValueOf2 = String.valueOf(str);
                    Log.d("UserMessagingPlatform", strValueOf2.length() != 0 ? "Stored info not exists: ".concat(strValueOf2) : new String("Stored info not exists: "));
                } else {
                    if (obj instanceof Boolean) {
                        string = ((Boolean) obj).booleanValue() ? "1" : "0";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        String strValueOf3 = String.valueOf(str);
                        Log.d("UserMessagingPlatform", strValueOf3.length() != 0 ? "Failed to fetch stored info: ".concat(strValueOf3) : new String("Failed to fetch stored info: "));
                    }
                    map.put(str, string);
                }
            }
        }
        zzbnVar.zzj = map;
        zzbnVar.zzd = null;
        zzbnVar.zzg = null;
        zzbnVar.zzh = Boolean.valueOf(this.zzd.isTagForUnderAgeOfConsent());
        zzbnVar.zzf = null;
        zzbnVar.zze = Locale.getDefault().toLanguageTag();
        zzbr zzbrVar = new zzbr();
        zzbrVar.zzc = Integer.valueOf(Build.VERSION.SDK_INT);
        zzbrVar.zzb = Build.MODEL;
        zzbrVar.zza = zzbu.zzb;
        zzbnVar.zzc = zzbrVar;
        Configuration configuration = this.zza.zza.getResources().getConfiguration();
        this.zza.zza.getResources().getConfiguration();
        zzbt zzbtVar = new zzbt();
        zzbtVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzbtVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        zzbtVar.zzc = Double.valueOf(this.zza.zza.getResources().getDisplayMetrics().density);
        if (Build.VERSION.SDK_INT < 28) {
            listEmptyList = Collections.emptyList();
        } else {
            Activity activity = this.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null;
            if (displayCutout == null) {
                listEmptyList = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzbw zzbwVar = new zzbw();
                        zzbwVar.zzb = Integer.valueOf(rect.left);
                        zzbwVar.zzc = Integer.valueOf(rect.right);
                        zzbwVar.zza = Integer.valueOf(rect.top);
                        zzbwVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzbwVar);
                    }
                }
                listEmptyList = arrayList2;
            }
        }
        zzbtVar.zzd = listEmptyList;
        zzbnVar.zzk = zzbtVar;
        zzbnVar.zzl = zzb();
        zzbv zzbvVar = new zzbv();
        zzbvVar.zza = "1.0.0";
        zzbnVar.zzm = zzbvVar;
        return zzbnVar;
    }

    private final zzbp zzb() {
        PackageInfo packageInfo;
        Application application = this.zza.zza;
        try {
            packageInfo = this.zza.zza.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        zzbp zzbpVar = new zzbp();
        zzbpVar.zza = application.getPackageName();
        CharSequence applicationLabel = this.zza.zza.getPackageManager().getApplicationLabel(this.zza.zza.getApplicationInfo());
        zzbpVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzbpVar.zzc = Long.toString(PackageInfoCompat.getLongVersionCode(packageInfo));
        }
        return zzbpVar;
    }

    private final String zzc() throws zzk {
        Bundle bundle;
        String strZza = this.zzd.zza();
        if (!TextUtils.isEmpty(strZza)) {
            return strZza;
        }
        try {
            bundle = this.zza.zza.getPackageManager().getApplicationInfo(this.zza.zza.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            bundle = null;
        }
        if (bundle != null) {
            strZza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        }
        if (TextUtils.isEmpty(strZza)) {
            throw new zzk(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
        }
        return strZza;
    }
}
