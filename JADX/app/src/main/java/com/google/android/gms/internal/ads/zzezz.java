package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media2.session.MediaConstants;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.p006io.encoding.Base64;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzezz {
    public final zzcdv zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final int zzM;
    public final int zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final String zzQ;
    public final zzfau zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final int zzU;
    public final String zzV;
    public final int zzW;
    public final String zzX;
    public final boolean zzY;
    public final zzbzw zzZ;
    public final List<String> zza;
    public final boolean zzaa;
    public final zzbdn zzab;
    public final String zzac;
    public final boolean zzad;
    public final JSONObject zzae;
    public final boolean zzaf;
    public final JSONObject zzag;
    public final boolean zzah;
    public final String zzai;
    public final boolean zzaj;
    public final int zzb;
    public final List<String> zzc;
    public final List<String> zzd;
    public final List<String> zze;
    public final int zzf;
    public final List<String> zzg;
    public final List<String> zzh;
    public final List<String> zzi;
    public final List<String> zzj;
    public final String zzk;
    public final String zzl;
    public final zzccl zzm;
    public final List<String> zzn;
    public final List<String> zzo;
    public final List<String> zzp;
    public final int zzq;
    public final List<zzfaa> zzr;
    public final zzfae zzs;
    public final List<String> zzt;
    public final List<zzfaa> zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Code duplicated, block: B:201:0x0551 A[PHI: r67 r69
  0x0551: PHI (r67v71 java.util.List<java.lang.String>) = 
  (r67v4 java.util.List<java.lang.String>)
  (r67v5 java.util.List<java.lang.String>)
  (r67v6 java.util.List<java.lang.String>)
  (r67v7 java.util.List<java.lang.String>)
  (r67v8 java.util.List<java.lang.String>)
  (r67v9 java.util.List<java.lang.String>)
  (r67v10 java.util.List<java.lang.String>)
  (r67v11 java.util.List<java.lang.String>)
  (r67v12 java.util.List<java.lang.String>)
  (r67v13 java.util.List<java.lang.String>)
  (r67v14 java.util.List<java.lang.String>)
  (r67v15 java.util.List<java.lang.String>)
  (r67v16 java.util.List<java.lang.String>)
  (r67v17 java.util.List<java.lang.String>)
  (r67v18 java.util.List<java.lang.String>)
  (r67v19 java.util.List<java.lang.String>)
  (r67v20 java.util.List<java.lang.String>)
  (r67v21 java.util.List<java.lang.String>)
  (r67v22 java.util.List<java.lang.String>)
  (r67v23 java.util.List<java.lang.String>)
  (r67v24 java.util.List<java.lang.String>)
  (r67v25 java.util.List<java.lang.String>)
  (r67v26 java.util.List<java.lang.String>)
  (r67v27 java.util.List<java.lang.String>)
  (r67v28 java.util.List<java.lang.String>)
  (r67v29 java.util.List<java.lang.String>)
  (r67v30 java.util.List<java.lang.String>)
  (r67v31 java.util.List<java.lang.String>)
  (r67v32 java.util.List<java.lang.String>)
  (r67v33 java.util.List<java.lang.String>)
  (r67v34 java.util.List<java.lang.String>)
  (r67v35 java.util.List<java.lang.String>)
  (r67v36 java.util.List<java.lang.String>)
  (r67v37 java.util.List<java.lang.String>)
  (r67v38 java.util.List<java.lang.String>)
  (r67v39 java.util.List<java.lang.String>)
  (r67v40 java.util.List<java.lang.String>)
  (r67v41 java.util.List<java.lang.String>)
  (r67v42 java.util.List<java.lang.String>)
  (r67v43 java.util.List<java.lang.String>)
  (r67v44 java.util.List<java.lang.String>)
  (r67v45 java.util.List<java.lang.String>)
  (r67v46 java.util.List<java.lang.String>)
  (r67v47 java.util.List<java.lang.String>)
  (r67v48 java.util.List<java.lang.String>)
  (r67v49 java.util.List<java.lang.String>)
  (r67v50 java.util.List<java.lang.String>)
  (r67v51 java.util.List<java.lang.String>)
  (r67v52 java.util.List<java.lang.String>)
  (r67v53 java.util.List<java.lang.String>)
  (r67v54 java.util.List<java.lang.String>)
  (r67v55 java.util.List<java.lang.String>)
  (r67v56 java.util.List<java.lang.String>)
  (r67v57 java.util.List<java.lang.String>)
  (r67v58 java.util.List<java.lang.String>)
  (r67v59 java.util.List<java.lang.String>)
  (r67v60 java.util.List<java.lang.String>)
  (r67v61 java.util.List<java.lang.String>)
  (r67v62 java.util.List<java.lang.String>)
  (r67v63 java.util.List<java.lang.String>)
  (r67v64 java.util.List<java.lang.String>)
  (r67v65 java.util.List<java.lang.String>)
  (r67v66 java.util.List<java.lang.String>)
  (r67v72 java.util.List<java.lang.String>)
 binds: [B:199:0x054c, B:196:0x053b, B:193:0x052a, B:190:0x0519, B:187:0x0508, B:184:0x04f7, B:181:0x04e5, B:178:0x04d3, B:175:0x04c1, B:172:0x04af, B:169:0x049d, B:166:0x048b, B:163:0x0479, B:160:0x0467, B:157:0x0455, B:154:0x0443, B:151:0x0431, B:148:0x041f, B:145:0x040d, B:142:0x03fb, B:139:0x03e9, B:136:0x03d7, B:133:0x03c5, B:130:0x03b3, B:127:0x03a1, B:124:0x0390, B:121:0x037e, B:118:0x036d, B:115:0x035b, B:112:0x0349, B:109:0x0337, B:106:0x0325, B:103:0x0313, B:100:0x0301, B:97:0x02ef, B:94:0x02dd, B:91:0x02cb, B:88:0x02b9, B:85:0x02a7, B:82:0x0295, B:79:0x0283, B:76:0x0271, B:73:0x025f, B:70:0x024e, B:67:0x023c, B:64:0x022a, B:61:0x0218, B:58:0x0207, B:55:0x01f5, B:52:0x01e4, B:49:0x01d2, B:46:0x01c0, B:43:0x01ae, B:40:0x019c, B:37:0x018a, B:34:0x0179, B:31:0x0167, B:28:0x0155, B:25:0x0143, B:22:0x0131, B:19:0x011f, B:16:0x010d, B:13:0x00fb, B:11:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x0551: PHI (r69v65 java.util.List<java.lang.String>) = 
  (r69v1 java.util.List<java.lang.String>)
  (r69v2 java.util.List<java.lang.String>)
  (r69v3 java.util.List<java.lang.String>)
  (r69v4 java.util.List<java.lang.String>)
  (r69v5 java.util.List<java.lang.String>)
  (r69v6 java.util.List<java.lang.String>)
  (r69v7 java.util.List<java.lang.String>)
  (r69v8 java.util.List<java.lang.String>)
  (r69v9 java.util.List<java.lang.String>)
  (r69v10 java.util.List<java.lang.String>)
  (r69v11 java.util.List<java.lang.String>)
  (r69v12 java.util.List<java.lang.String>)
  (r69v13 java.util.List<java.lang.String>)
  (r69v14 java.util.List<java.lang.String>)
  (r69v15 java.util.List<java.lang.String>)
  (r69v16 java.util.List<java.lang.String>)
  (r69v17 java.util.List<java.lang.String>)
  (r69v18 java.util.List<java.lang.String>)
  (r69v19 java.util.List<java.lang.String>)
  (r69v20 java.util.List<java.lang.String>)
  (r69v21 java.util.List<java.lang.String>)
  (r69v22 java.util.List<java.lang.String>)
  (r69v23 java.util.List<java.lang.String>)
  (r69v24 java.util.List<java.lang.String>)
  (r69v25 java.util.List<java.lang.String>)
  (r69v26 java.util.List<java.lang.String>)
  (r69v27 java.util.List<java.lang.String>)
  (r69v28 java.util.List<java.lang.String>)
  (r69v29 java.util.List<java.lang.String>)
  (r69v30 java.util.List<java.lang.String>)
  (r69v31 java.util.List<java.lang.String>)
  (r69v32 java.util.List<java.lang.String>)
  (r69v33 java.util.List<java.lang.String>)
  (r69v34 java.util.List<java.lang.String>)
  (r69v35 java.util.List<java.lang.String>)
  (r69v36 java.util.List<java.lang.String>)
  (r69v37 java.util.List<java.lang.String>)
  (r69v38 java.util.List<java.lang.String>)
  (r69v39 java.util.List<java.lang.String>)
  (r69v40 java.util.List<java.lang.String>)
  (r69v41 java.util.List<java.lang.String>)
  (r69v42 java.util.List<java.lang.String>)
  (r69v43 java.util.List<java.lang.String>)
  (r69v44 java.util.List<java.lang.String>)
  (r69v45 java.util.List<java.lang.String>)
  (r69v46 java.util.List<java.lang.String>)
  (r69v47 java.util.List<java.lang.String>)
  (r69v48 java.util.List<java.lang.String>)
  (r69v49 java.util.List<java.lang.String>)
  (r69v50 java.util.List<java.lang.String>)
  (r69v51 java.util.List<java.lang.String>)
  (r69v52 java.util.List<java.lang.String>)
  (r69v53 java.util.List<java.lang.String>)
  (r69v54 java.util.List<java.lang.String>)
  (r69v55 java.util.List<java.lang.String>)
  (r69v56 java.util.List<java.lang.String>)
  (r69v57 java.util.List<java.lang.String>)
  (r69v58 java.util.List<java.lang.String>)
  (r69v59 java.util.List<java.lang.String>)
  (r69v60 java.util.List<java.lang.String>)
  (r69v61 java.util.List<java.lang.String>)
  (r69v62 java.util.List<java.lang.String>)
  (r69v63 java.util.List<java.lang.String>)
  (r69v66 java.util.List<java.lang.String>)
 binds: [B:199:0x054c, B:196:0x053b, B:193:0x052a, B:190:0x0519, B:187:0x0508, B:184:0x04f7, B:181:0x04e5, B:178:0x04d3, B:175:0x04c1, B:172:0x04af, B:169:0x049d, B:166:0x048b, B:163:0x0479, B:160:0x0467, B:157:0x0455, B:154:0x0443, B:151:0x0431, B:148:0x041f, B:145:0x040d, B:142:0x03fb, B:139:0x03e9, B:136:0x03d7, B:133:0x03c5, B:130:0x03b3, B:127:0x03a1, B:124:0x0390, B:121:0x037e, B:118:0x036d, B:115:0x035b, B:112:0x0349, B:109:0x0337, B:106:0x0325, B:103:0x0313, B:100:0x0301, B:97:0x02ef, B:94:0x02dd, B:91:0x02cb, B:88:0x02b9, B:85:0x02a7, B:82:0x0295, B:79:0x0283, B:76:0x0271, B:73:0x025f, B:70:0x024e, B:67:0x023c, B:64:0x022a, B:61:0x0218, B:58:0x0207, B:55:0x01f5, B:52:0x01e4, B:49:0x01d2, B:46:0x01c0, B:43:0x01ae, B:40:0x019c, B:37:0x018a, B:34:0x0179, B:31:0x0167, B:28:0x0155, B:25:0x0143, B:22:0x0131, B:19:0x011f, B:16:0x010d, B:13:0x00fb, B:11:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    zzezz(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List<String> list;
        List<String> listZzb;
        byte b;
        List<String> listEmptyList = Collections.emptyList();
        List<String> listEmptyList2 = Collections.emptyList();
        List<String> listEmptyList3 = Collections.emptyList();
        List<String> listEmptyList4 = Collections.emptyList();
        List<String> listEmptyList5 = Collections.emptyList();
        Collections.emptyList();
        List<String> listEmptyList6 = Collections.emptyList();
        List<String> listEmptyList7 = Collections.emptyList();
        List<String> listEmptyList8 = Collections.emptyList();
        List<String> listEmptyList9 = Collections.emptyList();
        List<String> listEmptyList10 = Collections.emptyList();
        List<zzfaa> listEmptyList11 = Collections.emptyList();
        List<String> listEmptyList12 = Collections.emptyList();
        List<zzfaa> listEmptyList13 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfoj zzfojVarZzi = zzfoj.zzi();
        jsonReader.beginObject();
        JSONObject jSONObjectZzc = jSONObject3;
        JSONObject jSONObjectZzc2 = jSONObject4;
        JSONObject jSONObjectZzc3 = jSONObject5;
        JSONObject jSONObjectZzc4 = jSONObject6;
        List<String> listZzb2 = zzfojVarZzi;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String string = strNextString3;
        String strNextString4 = string;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int iNextInt2 = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt3 = 0;
        boolean zNextBoolean11 = false;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        zzfae zzfaeVar = null;
        zzcdv zzcdvVarZza = null;
        zzbzw zzbzwVarZza = null;
        zzbdn zzbdnVarZza = null;
        String strNextString10 = null;
        int iZzd = -1;
        int iNextInt4 = -1;
        boolean zNextBoolean17 = true;
        List<String> listZzb3 = listEmptyList12;
        List<zzfaa> listZza = listEmptyList13;
        JSONObject jSONObjectZzc5 = jSONObject;
        JSONObject jSONObjectZzc6 = jSONObject2;
        String strNextString11 = strNextString9;
        int iZzc = 0;
        int iZzb = 0;
        zzccl zzcclVarZza = null;
        List<zzfaa> listZza2 = listEmptyList11;
        String strNextString12 = strNextString11;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -1980587809:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("debug_signals")) {
                        b = -1;
                    } else {
                        b = 28;
                    }
                    break;
                case -1965512151:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("omid_settings")) {
                        b = -1;
                    } else {
                        b = 41;
                    }
                    break;
                case -1812055556:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("play_prewarm_options")) {
                        b = -1;
                    } else {
                        b = 49;
                    }
                    break;
                case -1662989631:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_interscroller")) {
                        b = -1;
                    } else {
                        b = 53;
                    }
                    break;
                case -1620470467:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("backend_query_id")) {
                        b = -1;
                    } else {
                        b = 47;
                    }
                    break;
                case -1440104884:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_custom_close_blocked")) {
                        b = -1;
                    } else {
                        b = 35;
                    }
                    break;
                case -1439500848:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("orientation")) {
                        b = -1;
                    } else {
                        b = 37;
                    }
                    break;
                case -1428969291:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("enable_omid")) {
                        b = -1;
                    } else {
                        b = 39;
                    }
                    break;
                case -1406227629:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("buffer_click_url_as_ready_to_ping")) {
                        b = -1;
                    } else {
                        b = 62;
                    }
                    break;
                case -1403779768:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("showable_impression_type")) {
                        b = -1;
                    } else {
                        b = 44;
                    }
                    break;
                case -1375413093:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_cover")) {
                        b = -1;
                    } else {
                        b = 54;
                    }
                    break;
                case -1360811658:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_sizes")) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case -1306015996:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("adapters")) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case -1303332046:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("test_mode_enabled")) {
                        b = -1;
                    } else {
                        b = 34;
                    }
                    break;
                case -1289032093:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("extras")) {
                        b = -1;
                    } else {
                        b = 29;
                    }
                    break;
                case -1240082064:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_event_value")) {
                        b = -1;
                    } else {
                        b = 51;
                    }
                    break;
                case -1234181075:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("allow_pub_rendered_attribution")) {
                        b = -1;
                    } else {
                        b = 30;
                    }
                    break;
                case -1168140544:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("presentation_error_urls")) {
                        b = -1;
                    } else {
                        b = 14;
                    }
                    break;
                case -1152230954:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_type")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1146534047:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_scroll_aware")) {
                        b = -1;
                    } else {
                        b = 43;
                    }
                    break;
                case -1115838944:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("fill_urls")) {
                        b = -1;
                    } else {
                        b = 13;
                    }
                    break;
                case -1081936678:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("allocation_id")) {
                        b = -1;
                    } else {
                        b = 21;
                    }
                    break;
                case -1078050970:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("video_complete_urls")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case -1051269058:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("active_view")) {
                        b = -1;
                    } else {
                        b = 25;
                    }
                    break;
                case -982608540:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("valid_from_timestamp")) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                case -776859333:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("click_urls")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -544216775:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("safe_browsing")) {
                        b = -1;
                    } else {
                        b = 26;
                    }
                    break;
                case -437057161:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("imp_urls")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -404433734:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("rtb_native_required_assets")) {
                        b = -1;
                    } else {
                        b = 57;
                    }
                    break;
                case -404326515:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("render_timeout_ms")) {
                        b = -1;
                    } else {
                        b = 38;
                    }
                    break;
                case -397704715:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_close_time_ms")) {
                        b = -1;
                    } else {
                        b = 45;
                    }
                    break;
                case -388807511:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("content_url")) {
                        b = -1;
                    } else {
                        b = 59;
                    }
                    break;
                case -369773488:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_close_button_enabled")) {
                        b = -1;
                    } else {
                        b = 50;
                    }
                    break;
                case -213449460:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("force_disable_hardware_acceleration")) {
                        b = -1;
                    } else {
                        b = 60;
                    }
                    break;
                case -213424028:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("watermark")) {
                        b = -1;
                    } else {
                        b = 46;
                    }
                    break;
                case -180214626:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("native_required_asset_viewability")) {
                        b = -1;
                    } else {
                        b = 58;
                    }
                    break;
                case -154616268:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_offline_ad")) {
                        b = -1;
                    } else {
                        b = 56;
                    }
                    break;
                case -29338502:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("allow_custom_click_gesture")) {
                        b = -1;
                    } else {
                        b = 32;
                    }
                    break;
                case 3107:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad")) {
                        b = -1;
                    } else {
                        b = 18;
                    }
                    break;
                case 3355:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals(MediaConstants.MEDIA_URI_QUERY_ID)) {
                        b = -1;
                    } else {
                        b = 23;
                    }
                    break;
                case 3076010:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("data")) {
                        b = -1;
                    } else {
                        b = 22;
                    }
                    break;
                case 63195984:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("render_test_label")) {
                        b = -1;
                    } else {
                        b = 33;
                    }
                    break;
                case 107433883:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("qdata")) {
                        b = -1;
                    } else {
                        b = 24;
                    }
                    break;
                case 230323073:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_load_urls")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 418392395:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_closable_area_disabled")) {
                        b = -1;
                    } else {
                        b = 36;
                    }
                    break;
                case 549176928:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("presentation_error_timeout_ms")) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 597473788:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("debug_dialog_string")) {
                        b = -1;
                    } else {
                        b = 27;
                    }
                    break;
                case 673261304:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("reward_granted_urls")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 754887508:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("container_sizes")) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 791122864:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("impression_type")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 1010584092:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("transaction_id")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case 1100650276:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("rewards")) {
                        b = -1;
                    } else {
                        b = 12;
                    }
                    break;
                case 1186014765:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("cache_hit_urls")) {
                        b = -1;
                    } else {
                        b = Base64.padSymbol;
                    }
                    break;
                case 1321720943:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("allow_pub_owned_ad_view")) {
                        b = -1;
                    } else {
                        b = 31;
                    }
                    break;
                case 1637553475:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("bid_response")) {
                        b = -1;
                    } else {
                        b = 40;
                    }
                    break;
                case 1638957285:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("video_start_urls")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 1686319423:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_network_class_name")) {
                        b = -1;
                    } else {
                        b = 55;
                    }
                    break;
                case 1688341040:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("video_reward_urls")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 1799285870:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("use_third_party_container_height")) {
                        b = -1;
                    } else {
                        b = 48;
                    }
                    break;
                case 1839650832:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("renderers")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 1875425491:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_analytics_logging_enabled")) {
                        b = -1;
                    } else {
                        b = 42;
                    }
                    break;
                case 2068142375:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("rule_line_external_id")) {
                        b = -1;
                    } else {
                        b = 52;
                    }
                    break;
                case 2072888499:
                    listZzb = listEmptyList10;
                    list = listEmptyList9;
                    if (!str.equals("manual_tracking_urls")) {
                        b = -1;
                    } else {
                        b = 15;
                    }
                    break;
                default:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    listEmptyList = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 1:
                    iZzb = zzb(jsonReader.nextString());
                    listEmptyList9 = list;
                    break;
                case 2:
                    listEmptyList2 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 3:
                    listEmptyList3 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 4:
                    listEmptyList4 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 5:
                    iZzc = zzc(jsonReader.nextInt());
                    listEmptyList9 = list;
                    break;
                case 6:
                    listEmptyList5 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 7:
                    com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 8:
                    listEmptyList6 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 9:
                    listEmptyList7 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 10:
                    strNextString11 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 11:
                    strNextString12 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 12:
                    zzcclVarZza = zzccl.zza(com.google.android.gms.ads.internal.util.zzbx.zzd(jsonReader));
                    listEmptyList9 = list;
                    break;
                case 13:
                    listEmptyList8 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 14:
                    listEmptyList9 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case 15:
                    listZzb = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 16:
                    iNextInt = jsonReader.nextInt();
                    listEmptyList9 = list;
                    break;
                case 17:
                    listZza2 = zzfaa.zza(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 18:
                    zzfaeVar = new zzfae(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 19:
                    listZza = zzfaa.zza(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 20:
                    listZzb3 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 21:
                    strNextString = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 22:
                    jSONObjectZzc5 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 23:
                    strNextString2 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 24:
                    strNextString3 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 25:
                    string = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader).toString();
                    listEmptyList9 = list;
                    break;
                case 26:
                    zzcdvVarZza = zzcdv.zza(com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader));
                    listEmptyList9 = list;
                    break;
                case 27:
                    strNextString4 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 28:
                    jSONObjectZzc6 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 30:
                    zNextBoolean = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 31:
                    zNextBoolean2 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 32:
                    zNextBoolean3 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 33:
                    zNextBoolean4 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 34:
                    zNextBoolean5 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 35:
                    zNextBoolean6 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 36:
                    zNextBoolean7 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 37:
                    iZzd = zzd(jsonReader.nextString());
                    listEmptyList9 = list;
                    break;
                case 38:
                    iNextInt2 = jsonReader.nextInt();
                    listEmptyList9 = list;
                    break;
                case 39:
                    zNextBoolean8 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 40:
                    strNextString5 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 41:
                    jSONObjectZzc2 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 42:
                    zNextBoolean9 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 43:
                    zNextBoolean10 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 44:
                    iNextInt3 = jsonReader.nextInt();
                    listEmptyList9 = list;
                    break;
                case 45:
                    iNextInt4 = jsonReader.nextInt();
                    listEmptyList9 = list;
                    break;
                case 46:
                    strNextString6 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 47:
                    strNextString7 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 48:
                    zNextBoolean11 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzbzwVarZza = zzbzw.zza(com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader));
                    listEmptyList9 = list;
                    break;
                case 50:
                    zNextBoolean17 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    zzbdnVarZza = zzbdn.zza(com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader));
                    listEmptyList9 = list;
                    break;
                case 52:
                    strNextString8 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 53:
                    zNextBoolean12 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 54:
                    jSONObjectZzc3 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 55:
                    strNextString9 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 56:
                    zNextBoolean13 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 57:
                    jSONObjectZzc4 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 58:
                    zNextBoolean14 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 59:
                    strNextString10 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zNextBoolean15 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    listZzb2 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 62:
                    zNextBoolean16 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    listEmptyList9 = list;
                    break;
            }
            listEmptyList10 = listZzb;
        }
        jsonReader.endObject();
        this.zza = listEmptyList;
        this.zzb = iZzb;
        this.zzc = listEmptyList2;
        this.zzd = listEmptyList3;
        this.zzg = listEmptyList4;
        this.zzf = iZzc;
        this.zzh = listEmptyList5;
        this.zzi = listEmptyList6;
        this.zzj = listEmptyList7;
        this.zzk = strNextString11;
        this.zzl = strNextString12;
        this.zzm = zzcclVarZza;
        this.zzn = listEmptyList8;
        this.zzo = listEmptyList9;
        this.zzp = listEmptyList10;
        this.zzq = iNextInt;
        this.zzr = listZza2;
        this.zzs = zzfaeVar;
        this.zzt = listZzb3;
        this.zzu = listZza;
        this.zzw = strNextString;
        this.zzv = jSONObjectZzc5;
        this.zzx = strNextString2;
        this.zzy = strNextString3;
        this.zzz = string;
        this.zzA = zzcdvVarZza;
        this.zzB = strNextString4;
        this.zzC = jSONObjectZzc6;
        this.zzD = jSONObjectZzc;
        this.zzF = zNextBoolean;
        this.zzG = zNextBoolean2;
        this.zzH = zNextBoolean3;
        this.zzI = zNextBoolean4;
        this.zzJ = zNextBoolean5;
        this.zzK = zNextBoolean6;
        this.zzL = zNextBoolean7;
        this.zzM = iZzd;
        this.zzN = iNextInt2;
        this.zzP = zNextBoolean8;
        this.zzQ = strNextString5;
        this.zzR = new zzfau(jSONObjectZzc2);
        this.zzS = zNextBoolean9;
        this.zzT = zNextBoolean10;
        this.zzU = iNextInt3;
        this.zzV = strNextString6;
        this.zzW = iNextInt4;
        this.zzX = strNextString7;
        this.zzY = zNextBoolean11;
        this.zzZ = zzbzwVarZza;
        this.zzaa = zNextBoolean17;
        this.zzab = zzbdnVarZza;
        this.zzac = strNextString8;
        this.zzad = zNextBoolean12;
        this.zzae = jSONObjectZzc3;
        this.zzE = strNextString9;
        this.zzaf = zNextBoolean13;
        this.zzag = jSONObjectZzc4;
        this.zzah = zNextBoolean14;
        this.zzai = strNextString10;
        this.zzaj = zNextBoolean15;
        this.zze = listZzb2;
        this.zzO = zNextBoolean16;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str) || "app_open_ad_v2".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i) {
        if (i == 0 || i == 1) {
            return i;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
