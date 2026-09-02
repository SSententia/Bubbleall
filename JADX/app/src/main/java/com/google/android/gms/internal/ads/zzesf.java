package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzesf implements zzery<zzesd> {
    private final zzfsn zza;
    private final Context zzb;

    public zzesf(zzfsn zzfsnVar, Context context) {
        this.zza = zzfsnVar;
        this.zzb = context;
    }

    private static ResolveInfo zzc(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzesd> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzese
            private final zzesf zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x00df  */
    final /* synthetic */ zzesd zzb() throws Exception {
        ActivityInfo activityInfo;
        String string;
        String string2;
        boolean zEquals;
        PackageManager packageManager = this.zzb.getPackageManager();
        Locale locale = Locale.getDefault();
        boolean z = zzc(packageManager, "geo:0,0?q=donuts") != null;
        boolean z2 = zzc(packageManager, "http://www.google.com") != null;
        String country = locale.getCountry();
        boolean zStartsWith = Build.DEVICE.startsWith("generic");
        boolean zIsLatchsky = DeviceProperties.isLatchsky(this.zzb);
        boolean zIsSidewinder = DeviceProperties.isSidewinder(this.zzb);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i = 0; i < localeList.size(); i++) {
                arrayList.add(localeList.get(i).getLanguage());
            }
        }
        Context context = this.zzb;
        ResolveInfo resolveInfoZzc = zzc(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoZzc == null || (activityInfo = resolveInfoZzc.activityInfo) == null) {
            string = null;
        } else {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
                if (packageInfo != null) {
                    int i2 = packageInfo.versionCode;
                    String str = activityInfo.packageName;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append(i2);
                    sb.append(".");
                    sb.append(str);
                    string = sb.toString();
                } else {
                    string = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        try {
            PackageInfo packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
            if (packageInfo2 != null) {
                int i3 = packageInfo2.versionCode;
                String str2 = packageInfo2.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 12);
                sb2.append(i3);
                sb2.append(".");
                sb2.append(str2);
                string2 = sb2.toString();
            } else {
                string2 = null;
            }
        } catch (Exception unused2) {
        }
        String str3 = Build.FINGERPRINT;
        Context context2 = this.zzb;
        if (packageManager == null) {
            zEquals = false;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities == null || resolveInfoResolveActivity == null) {
                zEquals = false;
            } else {
                for (int i4 = 0; i4 < listQueryIntentActivities.size(); i4++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i4).activityInfo.name)) {
                        zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(zzglo.zza(context2));
                    }
                }
                zEquals = false;
            }
        }
        return new zzesd(z, z2, country, zStartsWith, zIsLatchsky, zIsSidewinder, language, arrayList, string, string2, str3, zEquals, Build.MODEL, com.google.android.gms.ads.internal.zzt.zze().zzi());
    }
}
