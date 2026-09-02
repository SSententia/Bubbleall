package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcko implements zzbpr<zzcjb> {
    private boolean zza;

    private static int zzb(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                zzber.zza();
                i = zzcgm.zzs(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 48 + String.valueOf(str2).length());
            sb2.append("Parse pixels for ");
            sb2.append(str);
            sb2.append(", got string ");
            sb2.append(str2);
            sb2.append(", int ");
            sb2.append(i);
            sb2.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        return i;
    }

    private static void zzc(zzcip zzcipVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcipVar.zzw(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.zze.zzi(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcipVar.zzx(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcipVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcipVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcipVar.zzA(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcjb zzcjbVar, Map map) {
        int iMin;
        int iMin2;
        zzcjb zzcjbVar2 = zzcjbVar;
        String str = (String) map.get("action");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Action missing from video GMSG.");
            return;
        }
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.zze.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcjbVar2.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.zze.zzi("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.zze.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcjbVar2.zzw(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.zze.zzi("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        int i = 0;
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                com.google.android.gms.ads.internal.util.zze.zzi("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzcjbVar2.zze("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            String[] strArrSplit = str4.split(",");
            int length = strArrSplit.length;
            while (i < length) {
                String str5 = strArrSplit[i];
                map3.put(str5, com.google.android.gms.ads.internal.util.zzck.zza(str5.trim()));
                i++;
            }
            HashMap map4 = new HashMap();
            map4.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            map4.put("mimeTypes", map3);
            zzcjbVar2.zze("onVideoEvent", map4);
            return;
        }
        zzciq zzciqVarZzf = zzcjbVar2.zzf();
        if (zzciqVarZzf == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = "new".equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = zzcjbVar2.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, "w", -1);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcp)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzcjbVar2.zzz() : Math.min(iZzb3, zzcjbVar2.zzz());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int iZzz = zzcjbVar2.zzz();
                    StringBuilder sb2 = new StringBuilder(110);
                    sb2.append("Calculate width with original width ");
                    sb2.append(iZzb3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(iZzz);
                    sb2.append(", x ");
                    sb2.append(iZzb);
                    sb2.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                }
                iMin = Math.min(iZzb3, zzcjbVar2.zzz() - iZzb);
            }
            int i2 = iMin;
            int iZzb4 = zzb(context, map, "h", -1);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcp)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzcjbVar2.zzy() : Math.min(iZzb4, zzcjbVar2.zzy());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int iZzy = zzcjbVar2.zzy();
                    StringBuilder sb3 = new StringBuilder(113);
                    sb3.append("Calculate height with original height ");
                    sb3.append(iZzb4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(iZzy);
                    sb3.append(", y ");
                    sb3.append(iZzb2);
                    sb3.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                }
                iMin2 = Math.min(iZzb4, zzcjbVar2.zzy() - iZzb2);
            }
            int i3 = iMin2;
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
            }
            int i4 = i;
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzciqVarZzf.zzc() != null) {
                zzciqVarZzf.zza(iZzb, iZzb2, i2, i3);
                return;
            }
            zzciqVarZzf.zzb(iZzb, iZzb2, i2, i3, i4, z, new zzcja((String) map.get("flags")));
            zzcip zzcipVarZzc = zzciqVarZzf.zzc();
            if (zzcipVarZzc != null) {
                zzc(zzcipVarZzc, map);
                return;
            }
            return;
        }
        zzcnh zzcnhVarZzh = zzcjbVar2.zzh();
        if (zzcnhVarZzh != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcnhVarZzh.zzd(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.zze.zzi(str6.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                    return;
                }
            }
            if ("skip".equals(str)) {
                zzcnhVarZzh.zzr();
                return;
            }
        }
        zzcip zzcipVarZzc2 = zzciqVarZzf.zzc();
        if (zzcipVarZzc2 == null) {
            HashMap map5 = new HashMap();
            map5.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            zzcjbVar2.zze("onVideoEvent", map5);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = zzcjbVar2.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            int iZzb6 = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, iZzb6, 0);
            zzcipVarZzc2.zzB(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                com.google.android.gms.ads.internal.util.zze.zzi("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcipVarZzc2.zzs((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.zze.zzi(str7.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(str7) : new String("Could not parse time parameter from currentTime video GMSG: "));
                return;
            }
        }
        if ("hide".equals(str)) {
            zzcipVarZzc2.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            zzcipVarZzc2.zzp();
            return;
        }
        if ("loadControl".equals(str)) {
            zzc(zzcipVarZzc2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcipVarZzc2.zzt();
                return;
            } else {
                zzcipVarZzc2.zzu();
                return;
            }
        }
        if ("pause".equals(str)) {
            zzcipVarZzc2.zzq();
            return;
        }
        if ("play".equals(str)) {
            zzcipVarZzc2.zzr();
            return;
        }
        if ("show".equals(str)) {
            zzcipVarZzc2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            Integer numValueOf = null;
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    String str9 = (String) map.get("periodicReportIntervalMs");
                    String.valueOf(str9).length();
                    com.google.android.gms.ads.internal.util.zze.zzi("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf(str9)));
                }
            }
            String[] strArr = {str8};
            String str10 = (String) map.get("demuxed");
            if (str10 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str10);
                    String[] strArr2 = new String[jSONArray.length()];
                    while (i < jSONArray.length()) {
                        strArr2[i] = jSONArray.getString(i);
                        i++;
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    com.google.android.gms.ads.internal.util.zze.zzi(str10.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(str10) : new String("Malformed demuxed URL list for playback: "));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                zzcjbVar2.zzo(numValueOf.intValue());
            }
            zzcipVarZzc2.zzn(str8, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = zzcjbVar2.getContext();
            zzcipVarZzc2.zzo(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
            if (this.zza) {
                return;
            }
            zzcjbVar2.zzl();
            this.zza = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                zzcipVarZzc2.zzC();
                return;
            } else {
                com.google.android.gms.ads.internal.util.zze.zzi(str.length() != 0 ? "Unknown video action: ".concat(str) : new String("Unknown video action: "));
                return;
            }
        }
        String str11 = (String) map.get("volume");
        if (str11 == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzcipVarZzc2.zzv(Float.parseFloat(str11));
        } catch (NumberFormatException unused8) {
            com.google.android.gms.ads.internal.util.zze.zzi(str11.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(str11) : new String("Could not parse volume parameter from volume video GMSG: "));
        }
    }
}
