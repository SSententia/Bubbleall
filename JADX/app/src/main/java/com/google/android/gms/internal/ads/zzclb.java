package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzclb implements zzbpr<zzcjb> {
    private static final Integer zzb(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcjb zzcjbVar, Map map) {
        zzcla zzcldVar;
        zzcjb zzcjbVar2 = zzcjbVar;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.zze.zzd("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzckt zzcktVarZzy = com.google.android.gms.ads.internal.zzt.zzy();
        if (map.containsKey("abort")) {
            if (zzcktVarZzy.zza(zzcjbVar2)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zzi("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcja zzcjaVar = new zzcja((String) map.get("flags"));
        boolean z = zzcjaVar.zzn;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzcks zzcksVarZzb = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.zze.zzi(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                for (zzcks zzcksVar : zzcktVarZzy) {
                    if (zzcksVar.zza == zzcjbVar2 && str.equals(zzcksVar.zzd())) {
                        zzcksVarZzb = zzcksVar;
                        break;
                    }
                }
            } else {
                zzcksVarZzb = zzcktVarZzy.zzb(zzcjbVar2);
            }
            if (zzcksVarZzb != null) {
                com.google.android.gms.ads.internal.util.zze.zzi("Precache task is already running.");
                return;
            }
            if (zzcjbVar2.zzk() == null) {
                com.google.android.gms.ads.internal.util.zze.zzi("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = 0;
            }
            if (numZzb != null) {
                zzcjbVar2.zzo(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzcjbVar2.zzB(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzcjbVar2.zzC(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzckm zzckmVar = zzcjbVar2.zzk().zzc;
            if (iIntValue > 0) {
                int iZzQ = zzcis.zzQ();
                zzcldVar = iZzQ < zzcjaVar.zzh ? new zzclj(zzcjbVar2, zzcjaVar) : iZzQ < zzcjaVar.zzb ? new zzclg(zzcjbVar2, zzcjaVar) : new zzcle(zzcjbVar2);
            } else {
                zzcldVar = new zzcld(zzcjbVar2);
            }
            new zzcks(zzcjbVar2, zzcldVar, str, strArr).zzc();
        } else {
            zzcks zzcksVarZzb2 = zzcktVarZzy.zzb(zzcjbVar2);
            if (zzcksVarZzb2 == null) {
                com.google.android.gms.ads.internal.util.zze.zzi("Precache must specify a source.");
                return;
            }
            zzcldVar = zzcksVarZzb2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzcldVar.zzh(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzcldVar.zzg(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzcldVar.zzi(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzcldVar.zzl(numZzb8.intValue());
        }
    }
}
