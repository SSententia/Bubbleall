package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcbn {
    private int zzA;
    private final String zzB;
    private boolean zzC;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private double zzm;
    private boolean zzn;
    private String zzo;
    private String zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final String zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final String zzw;
    private final String zzx;
    private float zzy;
    private int zzz;

    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    public zzcbn(Context context) {
        ActivityInfo activityInfo;
        String string;
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        zzb(context);
        zzc(context);
        zzd(context);
        Locale locale = Locale.getDefault();
        this.zzq = zze(packageManager, "geo:0,0?q=donuts") != null;
        this.zzr = zze(packageManager, "http://www.google.com") != null;
        this.zzs = locale.getCountry();
        zzber.zza();
        this.zzt = zzcgm.zzm();
        this.zzu = DeviceProperties.isLatchsky(context);
        this.zzv = DeviceProperties.isSidewinder(context);
        this.zzw = locale.getLanguage();
        ResolveInfo resolveInfoZze = zze(packageManager, "market://details?id=com.google.android.gms.ads");
        String string2 = null;
        if (resolveInfoZze == null || (activityInfo = resolveInfoZze.activityInfo) == null) {
            string = null;
        } else {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
                if (packageInfo != null) {
                    int i = packageInfo.versionCode;
                    String str = activityInfo.packageName;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append(i);
                    sb.append(".");
                    sb.append(str);
                    string = sb.toString();
                } else {
                    string = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.zzx = string;
        try {
            PackageInfo packageInfo2 = Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
            if (packageInfo2 != null) {
                int i2 = packageInfo2.versionCode;
                String str2 = packageInfo2.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 12);
                sb2.append(i2);
                sb2.append(".");
                sb2.append(str2);
                string2 = sb2.toString();
            }
        } catch (Exception unused2) {
        }
        this.zzB = string2;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.zzy = displayMetrics.density;
        this.zzz = displayMetrics.widthPixels;
        this.zzA = displayMetrics.heightPixels;
    }

    private final void zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.zza = audioManager.getMode();
                this.zzb = audioManager.isMusicActive();
                this.zzc = audioManager.isSpeakerphoneOn();
                this.zzd = audioManager.getStreamVolume(3);
                this.zze = audioManager.getRingerMode();
                this.zzf = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zza = -2;
        this.zzb = false;
        this.zzc = false;
        this.zzd = 0;
        this.zze = 2;
        this.zzf = 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    private final void zzc(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.zzg = telephonyManager.getNetworkOperator();
        if (PlatformVersion.isAtLeastR()) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgd)).booleanValue()) {
                networkType = 0;
            } else {
                networkType = telephonyManager.getNetworkType();
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        this.zzi = networkType;
        this.zzj = telephonyManager.getPhoneType();
        this.zzh = -2;
        this.zzk = false;
        this.zzl = -1;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzE(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.zzh = activeNetworkInfo.getType();
                this.zzl = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.zzh = -1;
            }
            this.zzk = connectivityManager.isActiveNetworkMetered();
        }
    }

    private final void zzd(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            this.zzm = -1.0d;
            this.zzn = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            this.zzm = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.zzn = intExtra == 2 || intExtra == 5;
        }
    }

    private static ResolveInfo zze(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final zzcbo zza() {
        return new zzcbo(this.zza, this.zzq, this.zzr, this.zzg, this.zzs, this.zzt, this.zzu, this.zzv, this.zzb, this.zzc, this.zzw, this.zzx, this.zzB, this.zzd, this.zzh, this.zzi, this.zzj, this.zze, this.zzf, this.zzy, this.zzz, this.zzA, this.zzm, this.zzn, this.zzk, this.zzl, this.zzo, this.zzC, this.zzp);
    }

    public zzcbn(Context context, zzcbo zzcboVar) {
        zzb(context);
        zzc(context);
        zzd(context);
        this.zzo = Build.FINGERPRINT;
        this.zzp = Build.DEVICE;
        boolean z = false;
        if (PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzbkj.zza(context)) {
            z = true;
        }
        this.zzC = z;
        this.zzq = zzcboVar.zza;
        this.zzr = zzcboVar.zzb;
        this.zzs = zzcboVar.zzd;
        this.zzt = zzcboVar.zze;
        this.zzu = zzcboVar.zzf;
        this.zzv = zzcboVar.zzg;
        this.zzw = zzcboVar.zzh;
        this.zzx = zzcboVar.zzi;
        this.zzB = zzcboVar.zzj;
        this.zzy = zzcboVar.zzm;
        this.zzz = zzcboVar.zzn;
        this.zzA = zzcboVar.zzo;
    }
}
