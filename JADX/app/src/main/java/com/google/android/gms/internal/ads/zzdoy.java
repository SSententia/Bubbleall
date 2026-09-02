package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdoy {
    private final zzfsn zza;
    private final zzdpl zzb;
    private final zzdpq zzc;

    public zzdoy(zzfsn zzfsnVar, zzdpl zzdplVar, zzdpq zzdpqVar) {
        this.zza = zzfsnVar;
        this.zzb = zzdplVar;
        this.zzc = zzdpqVar;
    }

    public final zzfsm<zzdmm> zza(final zzfal zzfalVar, final zzezz zzezzVar, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        zzfsm zzfsmVarZza;
        final zzfsm zzfsmVarZzb = this.zza.zzb(new Callable(this, zzfalVar, zzezzVar, jSONObject) { // from class: com.google.android.gms.internal.ads.zzdow
            private final zzdoy zza;
            private final zzfal zzb;
            private final zzezz zzc;
            private final JSONObject zzd;

            {
                this.zza = this;
                this.zzb = zzfalVar;
                this.zzc = zzezzVar;
                this.zzd = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws zzehs {
                zzfal zzfalVar2 = this.zzb;
                zzezz zzezzVar2 = this.zzc;
                JSONObject jSONObject2 = this.zzd;
                zzdmm zzdmmVar = new zzdmm();
                zzdmmVar.zza(jSONObject2.optInt("template_id", -1));
                zzdmmVar.zzl(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                zzdmmVar.zzt(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null);
                zzfar zzfarVar = zzfalVar2.zza.zza;
                if (!zzfarVar.zzg.contains(Integer.toString(zzdmmVar.zzv()))) {
                    int iZzv = zzdmmVar.zzv();
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("Invalid template ID: ");
                    sb.append(iZzv);
                    throw new zzehs(1, sb.toString());
                }
                if (zzdmmVar.zzv() == 3) {
                    if (zzdmmVar.zzQ() == null) {
                        throw new zzehs(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfarVar.zzh.contains(zzdmmVar.zzQ())) {
                        throw new zzehs(1, "Unexpected custom template id in the response.");
                    }
                }
                zzdmmVar.zzi(jSONObject2.optDouble("rating", -1.0d));
                String strOptString = jSONObject2.optString("headline", null);
                if (zzezzVar2.zzI) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    String strZzC = com.google.android.gms.ads.internal.util.zzs.zzC();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZzC).length() + 3 + String.valueOf(strOptString).length());
                    sb2.append(strZzC);
                    sb2.append(" : ");
                    sb2.append(strOptString);
                    strOptString = sb2.toString();
                }
                zzdmmVar.zzq("headline", strOptString);
                zzdmmVar.zzq("body", jSONObject2.optString("body", null));
                zzdmmVar.zzq("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdmmVar.zzq("store", jSONObject2.optString("store", null));
                zzdmmVar.zzq("price", jSONObject2.optString("price", null));
                zzdmmVar.zzq("advertiser", jSONObject2.optString("advertiser", null));
                return zzdmmVar;
            }
        });
        final zzfsm<List<zzblr>> zzfsmVarZzb2 = this.zzb.zzb(jSONObject, "images");
        final zzfsm<zzcml> zzfsmVarZzc = this.zzb.zzc(jSONObject, "images", zzezzVar, zzfalVar.zzb.zzb);
        final zzfsm<zzblr> zzfsmVarZza2 = this.zzb.zza(jSONObject, "secondary_image");
        final zzfsm<zzblr> zzfsmVarZza3 = this.zzb.zza(jSONObject, "app_icon");
        final zzfsm<zzblo> zzfsmVarZzd = this.zzb.zzd(jSONObject, "attribution");
        final zzfsm<zzcml> zzfsmVarZze = this.zzb.zze(jSONObject, zzezzVar, zzfalVar.zzb.zzb);
        final zzdpl zzdplVar = this.zzb;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            zzfsmVarZza = TextUtils.isEmpty(strOptString) ? zzfsd.zza(null) : zzfsd.zzi(zzfsd.zza(null), new zzfrk(zzdplVar, strOptString) { // from class: com.google.android.gms.internal.ads.zzdpg
                private final zzdpl zza;
                private final String zzb;

                {
                    this.zza = zzdplVar;
                    this.zzb = strOptString;
                }

                @Override // com.google.android.gms.internal.ads.zzfrk
                public final zzfsm zza(Object obj) {
                    return this.zza.zzf(this.zzb, obj);
                }
            }, zzchg.zze);
        } else {
            zzfsmVarZza = zzfsd.zza(null);
        }
        final zzfsm zzfsmVar = zzfsmVarZza;
        final zzfsm<List<zzdpp>> zzfsmVarZza4 = this.zzc.zza(jSONObject, "custom_assets");
        return zzfsd.zzl(zzfsmVarZzb, zzfsmVarZzb2, zzfsmVarZzc, zzfsmVarZza2, zzfsmVarZza3, zzfsmVarZzd, zzfsmVarZze, zzfsmVar, zzfsmVarZza4).zza(new Callable(this, zzfsmVarZzb, zzfsmVarZzb2, zzfsmVarZza3, zzfsmVarZza2, zzfsmVarZzd, jSONObject, zzfsmVarZze, zzfsmVarZzc, zzfsmVar, zzfsmVarZza4) { // from class: com.google.android.gms.internal.ads.zzdox
            private final zzdoy zza;
            private final zzfsm zzb;
            private final zzfsm zzc;
            private final zzfsm zzd;
            private final zzfsm zze;
            private final zzfsm zzf;
            private final JSONObject zzg;
            private final zzfsm zzh;
            private final zzfsm zzi;
            private final zzfsm zzj;
            private final zzfsm zzk;

            {
                this.zza = this;
                this.zzb = zzfsmVarZzb;
                this.zzc = zzfsmVarZzb2;
                this.zzd = zzfsmVarZza3;
                this.zze = zzfsmVarZza2;
                this.zzf = zzfsmVarZzd;
                this.zzg = jSONObject;
                this.zzh = zzfsmVarZze;
                this.zzi = zzfsmVarZzc;
                this.zzj = zzfsmVar;
                this.zzk = zzfsmVarZza4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfsm zzfsmVar2 = this.zzb;
                zzfsm zzfsmVar3 = this.zzc;
                zzfsm zzfsmVar4 = this.zzd;
                zzfsm zzfsmVar5 = this.zze;
                zzfsm zzfsmVar6 = this.zzf;
                JSONObject jSONObject2 = this.zzg;
                zzfsm zzfsmVar7 = this.zzh;
                zzfsm zzfsmVar8 = this.zzi;
                zzfsm zzfsmVar9 = this.zzj;
                zzfsm zzfsmVar10 = this.zzk;
                zzdmm zzdmmVar = (zzdmm) zzfsmVar2.get();
                zzdmmVar.zzd((List) zzfsmVar3.get());
                zzdmmVar.zzj((zzbmh) zzfsmVar4.get());
                zzdmmVar.zzk((zzbmh) zzfsmVar5.get());
                zzdmmVar.zzc((zzblz) zzfsmVar6.get());
                zzdmmVar.zze(zzdpl.zzj(jSONObject2));
                zzdmmVar.zzf(zzdpl.zzi(jSONObject2));
                zzcml zzcmlVar = (zzcml) zzfsmVar7.get();
                if (zzcmlVar != null) {
                    zzdmmVar.zzm(zzcmlVar);
                    zzdmmVar.zzg(zzcmlVar.zzH());
                    zzdmmVar.zzb(zzcmlVar.zzh());
                }
                zzcml zzcmlVar2 = (zzcml) zzfsmVar8.get();
                if (zzcmlVar2 != null) {
                    zzdmmVar.zzn(zzcmlVar2);
                    zzdmmVar.zzh(zzcmlVar2.zzH());
                }
                zzcml zzcmlVar3 = (zzcml) zzfsmVar9.get();
                if (zzcmlVar3 != null) {
                    zzdmmVar.zzo(zzcmlVar3);
                }
                for (zzdpp zzdppVar : (List) zzfsmVar10.get()) {
                    if (zzdppVar.zza != 1) {
                        zzdmmVar.zzr(zzdppVar.zzb, zzdppVar.zzd);
                    } else {
                        zzdmmVar.zzq(zzdppVar.zzb, zzdppVar.zzc);
                    }
                }
                return zzdmmVar;
            }
        }, this.zza);
    }
}
