package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzby {
    public String zzb;
    public String zzc;
    public String zzd;
    public int zza = zzbu.zzg;
    public List<String> zze = Collections.emptyList();
    public List<zzbx> zzf = Collections.emptyList();

    public static zzby zza(JsonReader jsonReader) throws IOException {
        zzby zzbyVar = new zzby();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "consent_signal":
                    zzbyVar.zza = zzbu.zzb(jsonReader);
                    break;
                case "error_message":
                    zzbyVar.zzd = jsonReader.nextString();
                    break;
                case "consent_form_base_url":
                    zzbyVar.zzc = jsonReader.nextString();
                    break;
                case "actions":
                    zzbyVar.zzf = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzbx zzbxVar = new zzbx();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            if (strNextName2.equals("args_json")) {
                                zzbxVar.zzb = jsonReader.nextString();
                            } else if (strNextName2.equals("action_type")) {
                                zzbxVar.zza = zzbu.zza(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        zzbyVar.zzf.add(zzbxVar);
                    }
                    jsonReader.endArray();
                    break;
                case "request_info_keys":
                    zzbyVar.zze = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzbyVar.zze.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case "consent_form_payload":
                    zzbyVar.zzb = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zzbyVar;
    }
}
