package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzcmc;
import com.google.android.gms.internal.ads.zzcml;
import com.google.android.gms.internal.ads.zzcni;
import com.google.android.gms.internal.ads.zzcnn;
import com.google.android.gms.internal.ads.zzcnr;
import com.google.android.gms.internal.ads.zzcnu;
import com.google.android.gms.internal.ads.zzcnw;
import com.google.android.gms.internal.ads.zzdio;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbqc<T extends zzbcv & zzcmc & zzcml & zzbsi & zzcni & zzcnn & zzcnr & zzdio & zzcnu & zzcnw> implements zzbpr<T> {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdvi zzb;
    private final zzffc zzc;
    private final zzbyj zze;
    private final zzedq zzf;
    private com.google.android.gms.ads.internal.overlay.zzt zzg = null;
    private final zzcgy zzd = new zzcgy(null);

    public zzbqc(com.google.android.gms.ads.internal.zzb zzbVar, zzbyj zzbyjVar, zzedq zzedqVar, zzdvi zzdviVar, zzffc zzffcVar) {
        this.zza = zzbVar;
        this.zze = zzbyjVar;
        this.zzf = zzedqVar;
        this.zzb = zzdviVar;
        this.zzc = zzffcVar;
    }

    public static boolean zzc(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzd(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("c".equalsIgnoreCase(str)) {
            return com.google.android.gms.ads.internal.zzt.zze().zzh();
        }
        return -1;
    }

    static Uri zze(Context context, zzaas zzaasVar, Uri uri, View view, Activity activity) {
        if (zzaasVar == null) {
            return uri;
        }
        try {
            return zzaasVar.zzf(uri) ? zzaasVar.zze(uri, context, view, activity) : uri;
        } catch (zzaat unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zzf(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String strValueOf = String.valueOf(uri.toString());
            com.google.android.gms.ads.internal.util.zze.zzg(strValueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(strValueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    private final boolean zzh(T t, Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzI = com.google.android.gms.ads.internal.util.zzs.zzI(context);
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzbu zzbuVarZzD = com.google.android.gms.ads.internal.util.zzs.zzD(context);
        zzdvi zzdviVar = this.zzb;
        if (zzdviVar != null) {
            zzedy.zzd(context, zzdviVar, this.zzc, this.zzf, str2, "offline_open");
        }
        T t2 = t;
        boolean z = t2.zzP().zzg() && t2.zzj() == null;
        if (zZzI) {
            this.zzf.zzc(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (NotificationManagerCompat.from(context).areNotificationsEnabled() && zzbuVarZzD != null && !z) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzga)).booleanValue()) {
                if (t2.zzP().zzg()) {
                    zzedy.zzc(t2.zzj(), null, zzbuVarZzD, this.zzf, this.zzb, this.zzc, str2, str);
                } else {
                    t.zzaJ(zzbuVarZzD, this.zzf, this.zzb, this.zzc, str2, str, com.google.android.gms.ads.internal.zzt.zze().zzh());
                }
                zzdvi zzdviVar2 = this.zzb;
                if (zzdviVar2 != null) {
                    zzedy.zzd(context, zzdviVar2, this.zzc, this.zzf, str2, "dialog_impression");
                }
                t.onAdClicked();
                return true;
            }
        }
        this.zzf.zzd(str2);
        if (this.zzb != null) {
            HashMap map = new HashMap();
            com.google.android.gms.ads.internal.zzt.zzc();
            if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                map.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzbuVarZzD == null) {
                map.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzga)).booleanValue()) {
                    map.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    map.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzedy.zzh(context, this.zzb, this.zzc, this.zzf, str2, "dialog_not_shown", map);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0126  */
    /* JADX WARN: Code duplicated, block: B:46:0x0132  */
    private final void zzi(T t, Map<String, String> map, boolean z, String str, boolean z2) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzb;
        boolean z3 = true;
        zzj(true);
        T t2 = t;
        Context context = t2.getContext();
        zzaas zzaasVarZzU = t2.zzU();
        View viewZzH = t2.zzH();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = map.get("u");
        Intent intentZzd = null;
        Uri uriBuild = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri uriZzf = zzf(zze(context, zzaasVarZzU, Uri.parse(str2), viewZzH, null));
            boolean z4 = Boolean.parseBoolean(map.get("use_first_package"));
            boolean z5 = Boolean.parseBoolean(map.get("use_running_process"));
            if (!Boolean.parseBoolean(map.get("use_custom_tabs"))) {
                if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzcT)).booleanValue()) {
                    z3 = false;
                }
            }
            if ("http".equalsIgnoreCase(uriZzf.getScheme())) {
                uriBuild = uriZzf.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(uriZzf.getScheme())) {
                uriBuild = uriZzf.buildUpon().scheme("http").build();
            }
            ArrayList arrayList = new ArrayList();
            Intent intentZza = zzbqb.zza(uriZzf, context, zzaasVarZzU, viewZzH);
            Intent intentZza2 = zzbqb.zza(uriBuild, context, zzaasVarZzU, viewZzH);
            if (z3) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzu(context, intentZza);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzu(context, intentZza2);
            }
            ResolveInfo resolveInfoZzc = zzbqb.zzc(intentZza, arrayList, context, zzaasVarZzU, viewZzH);
            if (resolveInfoZzc != null) {
                intentZzd = zzbqb.zzd(intentZza, resolveInfoZzc, context, zzaasVarZzU, viewZzH);
            } else if (intentZza2 != null && (resolveInfoZzb = zzbqb.zzb(intentZza2, context, zzaasVarZzU, viewZzH)) != null) {
                intentZzd = zzbqb.zzd(intentZza, resolveInfoZzb, context, zzaasVarZzU, viewZzH);
                if (zzbqb.zzb(intentZzd, context, zzaasVarZzU, viewZzH) == null) {
                    if (arrayList.size() != 0) {
                        intentZzd = intentZza;
                    } else if (!z5) {
                        if (z4) {
                            intentZzd = zzbqb.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzaasVarZzU, viewZzH);
                        } else {
                            intentZzd = intentZza;
                        }
                    } else if (z4) {
                        intentZzd = zzbqb.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzaasVarZzU, viewZzH);
                    } else {
                        intentZzd = intentZza;
                    }
                }
            } else if (arrayList.size() != 0) {
                intentZzd = intentZza;
            } else if (!z5 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            int i2 = i + 1;
                            if (!it.hasNext()) {
                                i = i2;
                            } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                intentZzd = zzbqb.zzd(intentZza, resolveInfo, context, zzaasVarZzU, viewZzH);
                            }
                        }
                    } else if (z4) {
                        intentZzd = zzbqb.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzaasVarZzU, viewZzH);
                    } else {
                        intentZzd = intentZza;
                    }
                }
            } else if (z4) {
                intentZzd = zzbqb.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzaasVarZzU, viewZzH);
            } else {
                intentZzd = intentZza;
            }
        }
        if (!z || this.zzf == null || intentZzd == null || !zzh(t, t2.getContext(), intentZzd.getData().toString(), str)) {
            try {
                t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intentZzd, this.zzg), z2);
            } catch (ActivityNotFoundException e) {
                com.google.android.gms.ads.internal.util.zze.zzi(e.getMessage());
            }
        }
    }

    private final void zzj(boolean z) {
        zzbyj zzbyjVar = this.zze;
        if (zzbyjVar != null) {
            zzbyjVar.zzb(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(int i) {
        if (this.zzb == null) {
            return;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
            zzffc zzffcVar = this.zzc;
            zzffb zzffbVarZza = zzffb.zza("cct_action");
            zzffbVarZza.zzc("cct_open_status", zzbki.zza(i));
            zzffcVar.zza(zzffbVarZza);
            return;
        }
        zzdvh zzdvhVarZzd = this.zzb.zzd();
        zzdvhVarZzd.zzd("action", "cct_action");
        zzdvhVarZzd.zzd("cct_open_status", zzbki.zza(i));
        zzdvhVarZzd.zze();
    }

    /* JADX WARN: Code duplicated, block: B:134:0x031a  */
    /* JADX WARN: Code duplicated, block: B:135:0x031e  */
    @Override // com.google.android.gms.internal.ads.zzbpr
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(T t, Map<String, String> map) throws URISyntaxException {
        String str;
        boolean z;
        Intent uri;
        Object obj;
        String string;
        T t2 = t;
        String strZza = zzcfc.zza(map.get("u"), t2.getContext(), true);
        String str2 = map.get("a");
        if (str2 == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzb()) {
            this.zza.zzc(strZza);
            return;
        }
        zzezz zzezzVarZzF = t2.zzF();
        zzfac zzfacVarZzaB = t2.zzaB();
        boolean z2 = false;
        if (zzezzVarZzF == null || zzfacVarZzaB == null) {
            str = "";
            z = false;
        } else {
            z = zzezzVarZzF.zzaf;
            str = zzfacVarZzaB.zzb;
        }
        boolean z3 = (((Boolean) zzbet.zzc().zzc(zzbjl.zzgZ)).booleanValue() && map.containsKey("sc") && map.get("sc").equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (t2.zzW()) {
                com.google.android.gms.ads.internal.util.zze.zzi("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzj(false);
                t.zzaG(zzc(map), zzd(map), z3);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzj(false);
            if (strZza != null) {
                t.zzaH(zzc(map), zzd(map), strZza, z3);
                return;
            } else {
                t.zzaI(zzc(map), zzd(map), map.get("html"), map.get("baseurl"), z3);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = t2.getContext();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcV)).booleanValue()) {
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdb)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzcZ)).booleanValue()) {
                        z2 = true;
                        break;
                    }
                    String str3 = (String) zzbet.zzc().zzc(zzbjl.zzda);
                    if (!str3.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        Iterator<String> it = zzfmg.zzb(zzflk.zzb(';')).zzd(str3).iterator();
                        while (it.hasNext()) {
                            if (it.next().equals(packageName)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean zZza = zzbkj.zza(t2.getContext());
            if (z2) {
                if (zZza) {
                    zzj(true);
                    if (TextUtils.isEmpty(strZza)) {
                        com.google.android.gms.ads.internal.util.zze.zzi("Cannot open browser with null or empty url");
                        zzk(7);
                        return;
                    }
                    Uri uriZzf = zzf(zze(t2.getContext(), t2.zzU(), Uri.parse(strZza), t2.zzH(), t2.zzj()));
                    if (z && this.zzf != null && zzh(t, t2.getContext(), uriZzf.toString(), str)) {
                        return;
                    }
                    this.zzg = new zzbpz(this);
                    t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(null, uriZzf.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z3);
                    return;
                }
                zzk(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzi(t, map, z, str, z3);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase(map.get("system_browser"))) {
            zzi(t, map, z, str, z3);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfS)).booleanValue()) {
                zzj(true);
                String str4 = map.get("p");
                if (str4 == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Package name missing from open app action.");
                    return;
                }
                if (z && this.zzf != null && zzh(t, t2.getContext(), str4, str)) {
                    return;
                }
                PackageManager packageManager = t2.getContext().getPackageManager();
                if (packageManager == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                if (launchIntentForPackage != null) {
                    t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z3);
                    return;
                }
                return;
            }
            return;
        }
        zzj(true);
        String str5 = map.get("intent_url");
        if (TextUtils.isEmpty(str5)) {
            uri = null;
        } else {
            try {
                uri = Intent.parseUri(str5, 0);
            } catch (URISyntaxException e) {
                String strValueOf = String.valueOf(str5);
                com.google.android.gms.ads.internal.util.zze.zzg(strValueOf.length() != 0 ? "Error parsing the url: ".concat(strValueOf) : new String("Error parsing the url: "), e);
                uri = null;
            }
        }
        if (uri == null || uri.getData() == null) {
            obj = "p";
        } else {
            Uri data = uri.getData();
            if (Uri.EMPTY.equals(data)) {
                obj = "p";
            } else {
                obj = "p";
                Uri uriZzf2 = zzf(zze(t2.getContext(), t2.zzU(), data, t2.zzH(), t2.zzj()));
                if (TextUtils.isEmpty(uri.getType())) {
                    uri.setData(uriZzf2);
                } else {
                    if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfT)).booleanValue()) {
                        uri.setDataAndType(uriZzf2, uri.getType());
                    } else {
                        uri.setData(uriZzf2);
                    }
                }
            }
        }
        boolean z4 = ((Boolean) zzbet.zzc().zzc(zzbjl.zzge)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap map2 = new HashMap();
        if (z4) {
            this.zzg = new zzbqa(this, z3, t, map2, map);
            z3 = false;
        }
        if (uri != null) {
            if (!z || this.zzf == null || !zzh(t, t2.getContext(), uri.getData().toString(), str)) {
                t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(uri, this.zzg), z3);
                return;
            } else {
                if (z4) {
                    map2.put(map.get("event_id"), true);
                    t.zze("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(strZza)) {
            string = zzf(zze(t2.getContext(), t2.zzU(), Uri.parse(strZza), t2.zzH(), t2.zzj())).toString();
        }
        if (z) {
            string = strZza;
            if (this.zzf != null && zzh(t, t2.getContext(), string, str)) {
                if (z4) {
                    map2.put(map.get("event_id"), true);
                    t.zze("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        string = strZza;
        t.zzaF(new com.google.android.gms.ads.internal.overlay.zzc(map.get("i"), string, map.get("m"), map.get(obj), map.get("c"), map.get("f"), map.get("e"), this.zzg), z3);
    }
}
