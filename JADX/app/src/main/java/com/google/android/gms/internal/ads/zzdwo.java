package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwo extends zzbqo {
    private final zzdwr zza;
    private final zzdwm zzb;
    private final Map<Long, zzdwh> zzc = new HashMap();

    zzdwo(zzdwr zzdwrVar, zzdwm zzdwmVar) {
        this.zza = zzdwrVar;
        this.zzb = zzdwmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    private static zzbdg zzc(Map<String, String> map) {
        zzbdh zzbdhVar = new zzbdh();
        String str = map.get("ad_request");
        if (str == null) {
            return zzbdhVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "extras":
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zzbdhVar.zzb(bundle);
                        break;
                    case "keywords":
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zzbdhVar.zzc(arrayList);
                        break;
                    case "isTestDevice":
                        zzbdhVar.zzd(jsonReader.nextBoolean());
                        break;
                    case "tagForChildDirectedTreatment":
                        if (!jsonReader.nextBoolean()) {
                            zzbdhVar.zze(0);
                            break;
                        } else {
                            zzbdhVar.zze(1);
                            break;
                        }
                        break;
                    case "tagForUnderAgeOfConsent":
                        if (!jsonReader.nextBoolean()) {
                            zzbdhVar.zzf(0);
                            break;
                        } else {
                            zzbdhVar.zzf(1);
                            break;
                        }
                        break;
                    case "maxAdContentRating":
                        String strNextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(strNextString)) {
                            break;
                        } else {
                            zzbdhVar.zzg(strNextString);
                            break;
                        }
                        break;
                    case "httpTimeoutMillis":
                        zzbdhVar.zzh(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            com.google.android.gms.ads.internal.util.zze.zzd("Ad Request json was malformed, parsing ended early.");
        }
        zzbdg zzbdgVarZza = zzbdhVar.zza();
        Bundle bundle2 = zzbdgVarZza.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zzbdgVarZza.zzc;
            zzbdgVarZza.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new zzbdg(zzbdgVarZza.zza, zzbdgVarZza.zzb, bundle2, zzbdgVarZza.zzd, zzbdgVarZza.zze, zzbdgVarZza.zzf, zzbdgVarZza.zzg, zzbdgVarZza.zzh, zzbdgVarZza.zzi, zzbdgVarZza.zzj, zzbdgVarZza.zzk, zzbdgVarZza.zzl, zzbdgVarZza.zzm, zzbdgVarZza.zzn, zzbdgVarZza.zzo, zzbdgVarZza.zzp, zzbdgVarZza.zzq, zzbdgVarZza.zzr, zzbdgVarZza.zzs, zzbdgVarZza.zzt, zzbdgVarZza.zzu, zzbdgVarZza.zzv, zzbdgVarZza.zzw, zzbdgVarZza.zzx);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zze(String str) throws RemoteException {
        byte b;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgJ)).booleanValue()) {
            String strValueOf = String.valueOf(str);
            com.google.android.gms.ads.internal.util.zze.zza(strValueOf.length() != 0 ? "Received H5 gmsg: ".concat(strValueOf) : new String("Received H5 gmsg: "));
            Uri uri = Uri.parse(str);
            com.google.android.gms.ads.internal.zzt.zzc();
            Map<String, String> mapZzR = com.google.android.gms.ads.internal.util.zzs.zzR(uri);
            String str2 = mapZzR.get("action");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.zze.zzd("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals("initialize")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str2.equals("dispose_all")) {
                b = 1;
            } else {
                b = -1;
            }
            if (b == 0) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (b == 1) {
                Iterator<zzdwh> it = this.zzc.values().iterator();
                while (it.hasNext()) {
                    it.next().zzc();
                }
                this.zzc.clear();
                return;
            }
            String str3 = mapZzR.get("obj_id");
            try {
                str3.getClass();
                long j = Long.parseLong(str3);
                switch (str2) {
                    case "create_interstitial_ad":
                        if (this.zzc.size() >= ((Integer) zzbet.zzc().zzc(zzbjl.zzgK)).intValue()) {
                            com.google.android.gms.ads.internal.util.zze.zzi("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(j);
                            break;
                        } else {
                            Map<Long, zzdwh> map = this.zzc;
                            Long lValueOf = Long.valueOf(j);
                            if (!map.containsKey(lValueOf)) {
                                String str4 = mapZzR.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzdwi zzdwiVarZzd = this.zza.zzd();
                                    zzdwiVarZzd.zzc(j);
                                    zzdwiVarZzd.zzb(str4);
                                    this.zzc.put(lValueOf, zzdwiVarZzd.zza().zza());
                                    this.zzb.zzb(j);
                                    StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 59);
                                    sb.append("Created H5 interstitial #");
                                    sb.append(j);
                                    sb.append(" with ad unit ");
                                    sb.append(str4);
                                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                                } else {
                                    com.google.android.gms.ads.internal.util.zze.zzi("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(j);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.zze.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(j);
                            }
                            break;
                        }
                        break;
                    case "load_interstitial_ad":
                        zzdwh zzdwhVar = this.zzc.get(Long.valueOf(j));
                        if (zzdwhVar == null) {
                            com.google.android.gms.ads.internal.util.zze.zzd("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzd(j);
                            break;
                        } else {
                            zzdwhVar.zza(zzc(mapZzR));
                            break;
                        }
                        break;
                    case "show_interstitial_ad":
                        zzdwh zzdwhVar2 = this.zzc.get(Long.valueOf(j));
                        if (zzdwhVar2 == null) {
                            com.google.android.gms.ads.internal.util.zze.zzd("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzd(j);
                            break;
                        } else {
                            zzdwhVar2.zzb();
                            break;
                        }
                        break;
                    case "create_rewarded_ad":
                        if (this.zzc.size() >= ((Integer) zzbet.zzc().zzc(zzbjl.zzgK)).intValue()) {
                            com.google.android.gms.ads.internal.util.zze.zzi("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(j);
                            break;
                        } else {
                            Map<Long, zzdwh> map2 = this.zzc;
                            Long lValueOf2 = Long.valueOf(j);
                            if (!map2.containsKey(lValueOf2)) {
                                String str5 = mapZzR.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    zzdwi zzdwiVarZzd2 = this.zza.zzd();
                                    zzdwiVarZzd2.zzc(j);
                                    zzdwiVarZzd2.zzb(str5);
                                    this.zzc.put(lValueOf2, zzdwiVarZzd2.zza().zzb());
                                    this.zzb.zzb(j);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 55);
                                    sb2.append("Created H5 rewarded #");
                                    sb2.append(j);
                                    sb2.append(" with ad unit ");
                                    sb2.append(str5);
                                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                                } else {
                                    com.google.android.gms.ads.internal.util.zze.zzi("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(j);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.zze.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(j);
                            }
                            break;
                        }
                        break;
                    case "load_rewarded_ad":
                        zzdwh zzdwhVar3 = this.zzc.get(Long.valueOf(j));
                        if (zzdwhVar3 == null) {
                            com.google.android.gms.ads.internal.util.zze.zzd("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzj(j);
                            break;
                        } else {
                            zzdwhVar3.zza(zzc(mapZzR));
                            break;
                        }
                        break;
                    case "show_rewarded_ad":
                        zzdwh zzdwhVar4 = this.zzc.get(Long.valueOf(j));
                        if (zzdwhVar4 == null) {
                            com.google.android.gms.ads.internal.util.zze.zzd("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzj(j);
                            break;
                        } else {
                            zzdwhVar4.zzb();
                            break;
                        }
                        break;
                    case "dispose":
                        Map<Long, zzdwh> map3 = this.zzc;
                        Long lValueOf3 = Long.valueOf(j);
                        zzdwh zzdwhVar5 = map3.get(lValueOf3);
                        if (zzdwhVar5 == null) {
                            com.google.android.gms.ads.internal.util.zze.zzd("Could not dispose H5 ad, object ID does not exist");
                            break;
                        } else {
                            zzdwhVar5.zzc();
                            this.zzc.remove(lValueOf3);
                            StringBuilder sb3 = new StringBuilder(36);
                            sb3.append("Disposed H5 ad #");
                            sb3.append(j);
                            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                            break;
                        }
                        break;
                    default:
                        String strValueOf2 = String.valueOf(str2);
                        com.google.android.gms.ads.internal.util.zze.zzd(strValueOf2.length() != 0 ? "H5 gmsg contained invalid action: ".concat(strValueOf2) : new String("H5 gmsg contained invalid action: "));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                String strValueOf3 = String.valueOf(str3);
                com.google.android.gms.ads.internal.util.zze.zzd(strValueOf3.length() != 0 ? "H5 gmsg did not contain a valid object id: ".concat(strValueOf3) : new String("H5 gmsg did not contain a valid object id: "));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zzf() {
        this.zzc.clear();
    }
}
