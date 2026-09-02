package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzah {
    public final String zza;
    public String zzb;
    public Bundle zzc = new Bundle();

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    public zzah(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        byte b;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -995427962) {
                if (iHashCode == -271442291 && strNextName.equals("signal_dictionary")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strNextName.equals("params")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                strNextString = jsonReader.nextString();
            } else if (b != 1) {
                jsonReader.skipValue();
            } else {
                map = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            }
        }
        this.zza = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzc.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}
