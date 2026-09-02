package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeqa implements zzery<zzeqb> {
    private final zzfsn zza;
    private final zzfar zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeqa(zzfsn zzfsnVar, zzfar zzfarVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfsnVar;
        this.zzb = zzfarVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeqb> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzepw
            private final zzeqa zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0106  */
    final /* synthetic */ void zzb(ArrayList arrayList, Bundle bundle) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zzb.zzh);
        String str2 = "landscape";
        if (this.zzb.zzi.zza > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i = this.zzb.zzi.zzh;
            if (i == 1) {
                str = "any";
            } else if (i == 2) {
                str = "landscape";
            } else if (i != 3) {
                str = i != 4 ? EnvironmentCompat.MEDIA_UNKNOWN : "square";
            } else {
                str = "portrait";
            }
            if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str)) {
                bundle.putString("native_media_orientation", str);
            }
        }
        int i2 = this.zzb.zzi.zzc;
        if (i2 == 0) {
            str2 = "any";
        } else if (i2 == 1) {
            str2 = "portrait";
        } else if (i2 != 2) {
            str2 = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str2)) {
            bundle.putString("native_image_orientation", str2);
        }
        bundle.putBoolean("native_multiple_images", this.zzb.zzi.zzd);
        bundle.putBoolean("use_custom_mute", this.zzb.zzi.zzg);
        PackageInfo packageInfo = this.zzc;
        int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i3 > this.zzd.zzl()) {
            this.zzd.zzy();
            this.zzd.zzk(i3);
        }
        JSONObject jSONObjectZzx = this.zzd.zzx();
        String string = null;
        if (jSONObjectZzx != null && (jSONArrayOptJSONArray = jSONObjectZzx.optJSONArray(this.zzb.zzf)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i4 = this.zzb.zzk;
        if (i4 > 1) {
            bundle.putInt("max_num_ads", i4);
        }
        zzbrx zzbrxVar = this.zzb.zzb;
        if (zzbrxVar != null) {
            if (TextUtils.isEmpty(zzbrxVar.zzc)) {
                String str3 = "p";
                if (zzbrxVar.zza >= 2) {
                    int i5 = zzbrxVar.zzd;
                    if (i5 == 2 || i5 != 3) {
                        str3 = "l";
                    }
                } else {
                    int i6 = zzbrxVar.zzb;
                    if (i6 == 1) {
                        str3 = "l";
                    } else if (i6 != 2) {
                        StringBuilder sb = new StringBuilder(52);
                        sb.append("Instream ad video aspect ratio ");
                        sb.append(i6);
                        sb.append(" is wrong.");
                        zzcgt.zzf(sb.toString());
                        str3 = "l";
                    }
                }
                bundle.putString("ia_var", str3);
            } else {
                bundle.putString("ad_tag", zzbrxVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.zzb.zza() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
    }

    final /* bridge */ /* synthetic */ zzeqb zzc() throws Exception {
        final ArrayList<String> arrayList = this.zzb.zzg;
        if (arrayList == null) {
            return zzepx.zza;
        }
        return arrayList.isEmpty() ? zzepy.zza : new zzeqb(this, arrayList) { // from class: com.google.android.gms.internal.ads.zzepz
            private final zzeqa zza;
            private final ArrayList zzb;

            {
                this.zza = this;
                this.zzb = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzerx
            public final void zzf(Bundle bundle) {
                this.zza.zzb(this.zzb, bundle);
            }
        };
    }
}
