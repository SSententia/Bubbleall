package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media2.session.MediaConstants;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbpq {
    public static final zzbpr<zzcml> zza = zzbov.zza;
    public static final zzbpr<zzcml> zzb = zzbow.zza;
    public static final zzbpr<zzcml> zzc = zzbox.zza;
    public static final zzbpr<zzcml> zzd = new zzbpi();
    public static final zzbpr<zzcml> zze = new zzbpj();
    public static final zzbpr<zzcml> zzf = zzbpc.zza;
    public static final zzbpr<Object> zzg = new zzbpk();
    public static final zzbpr<zzcml> zzh = new zzbpl();
    public static final zzbpr<zzcml> zzi = zzbpd.zza;
    public static final zzbpr<zzcml> zzj = new zzbpm();
    public static final zzbpr<zzcml> zzk = new zzbpn();
    public static final zzbpr<zzcjb> zzl = new zzcko();
    public static final zzbpr<zzcjb> zzm = new zzckp();
    public static final zzbpr<zzcml> zzn = new zzbou();
    public static final zzbqf zzo = new zzbqf();
    public static final zzbpr<zzcml> zzp = new zzbpo();
    public static final zzbpr<zzcml> zzq = new zzbpp();
    public static final zzbpr<zzcml> zzr = new zzbpe();
    public static final zzbpr<zzcml> zzs = new zzbpf();
    public static final zzbpr<zzcml> zzt = new zzbpg();

    public static zzfsm<String> zza(zzcml zzcmlVar, String str) {
        Uri uriZze = Uri.parse(str);
        try {
            zzaas zzaasVarZzU = zzcmlVar.zzU();
            if (zzaasVarZzU != null && zzaasVarZzU.zza(uriZze)) {
                uriZze = zzaasVarZzU.zze(uriZze, zzcmlVar.getContext(), zzcmlVar.zzH(), zzcmlVar.zzj());
            }
        } catch (zzaat unused) {
            com.google.android.gms.ads.internal.util.zze.zzi(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        final String strZzb = zzcfc.zzb(uriZze, zzcmlVar.getContext());
        long jLongValue = zzbkx.zze.zze().longValue();
        return (jLongValue <= 0 || jLongValue > 213806100) ? zzfsd.zza(strZzb) : zzfsd.zzf(zzfsd.zzj(zzfsd.zzf(zzfru.zzw((zzfsm) zzcmlVar.zzaE()), Throwable.class, zzboy.zza, zzchg.zzf), new zzfln(strZzb) { // from class: com.google.android.gms.internal.ads.zzboz
            private final String zza;

            {
                this.zza = strZzb;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                String strZze;
                String strZze2;
                Uri uri;
                String strReplace = this.zza;
                String str2 = (String) obj;
                zzbpr<zzcml> zzbprVar = zzbpq.zza;
                if (str2 != null) {
                    if (zzbkx.zzf.zze().booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (host.endsWith(strArr[i])) {
                                strZze = zzbkx.zza.zze();
                                strZze2 = zzbkx.zzb.zze();
                                if (!TextUtils.isEmpty(strZze)) {
                                    strReplace = strReplace.replace(strZze, str2);
                                }
                                if (!TextUtils.isEmpty(strZze2)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(strZze2))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(strZze2, str2).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        strZze = zzbkx.zza.zze();
                        strZze2 = zzbkx.zzb.zze();
                        if (!TextUtils.isEmpty(strZze)) {
                            strReplace = strReplace.replace(strZze, str2);
                        }
                        if (!TextUtils.isEmpty(strZze2)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(strZze2))) {
                                return uri.buildUpon().appendQueryParameter(strZze2, str2).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, zzchg.zzf), Throwable.class, new zzfln(strZzb) { // from class: com.google.android.gms.internal.ads.zzbpa
            private final String zza;

            {
                this.zza = strZzb;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                String str2 = this.zza;
                Throwable th = (Throwable) obj;
                zzbpr<zzcml> zzbprVar = zzbpq.zza;
                if (zzbkx.zzk.zze().booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, zzchg.zzf);
    }

    public static zzbpr<zzcml> zzb(final zzdio zzdioVar) {
        return new zzbpr(zzdioVar) { // from class: com.google.android.gms.internal.ads.zzbpb
            private final zzdio zza;

            {
                this.zza = zzdioVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                zzcml zzcmlVar = (zzcml) obj;
                zzbpq.zzc(map, this.zza);
                String str = (String) map.get("u");
                if (str == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("URL missing from click GMSG.");
                } else {
                    zzfsd.zzp(zzbpq.zza(zzcmlVar, str), new zzbph(zzcmlVar), zzchg.zza);
                }
            }
        };
    }

    public static void zzc(Map<String, String> map, zzdio zzdioVar) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzha)).booleanValue() && map.containsKey("sc") && map.get("sc").equals("1") && zzdioVar != null) {
            zzdioVar.zzb();
        }
    }

    static final /* synthetic */ void zzd(zzcnn zzcnnVar, Map map) {
        Intent uri;
        PackageManager packageManager = zzcnnVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString(MediaConstants.MEDIA_URI_QUERY_ID);
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e) {
                                String strValueOf = String.valueOf(strOptString7);
                                com.google.android.gms.ads.internal.util.zze.zzg(strValueOf.length() != 0 ? "Error parsing the url: ".concat(strValueOf) : new String("Error parsing the url: "), e);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(strOptString, packageManager.resolveActivity(uri, 65536) != null);
                        } catch (JSONException e2) {
                            com.google.android.gms.ads.internal.util.zze.zzg("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        com.google.android.gms.ads.internal.util.zze.zzg("Error parsing the intent data.", e3);
                    }
                }
                ((zzbsi) zzcnnVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbsi) zzcnnVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbsi) zzcnnVar).zzd("openableIntents", new JSONObject());
        }
    }
}
