package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.load.Key;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzdyb;
import com.google.android.gms.internal.ads.zzdyc;
import com.google.android.gms.internal.ads.zzfsm;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaz {
    private zzdyc zzg;
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    protected String zza = "";

    protected static final String zzo(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzc().zzi(context, str2));
        zzfsm<String> zzfsmVarZzb = new zzbr(context).zzb(0, str, map, null);
        try {
            return zzfsmVarZzb.get(((Integer) zzbet.zzc().zzc(zzbjl.zzdh)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String strValueOf = String.valueOf(str);
            zze.zzg(strValueOf.length() != 0 ? "Interrupted while retrieving a response from: ".concat(strValueOf) : new String("Interrupted while retrieving a response from: "), e);
            zzfsmVarZzb.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            String strValueOf2 = String.valueOf(str);
            zze.zzg(strValueOf2.length() != 0 ? "Timeout while retrieving a response from: ".concat(strValueOf2) : new String("Timeout while retrieving a response from: "), e2);
            zzfsmVarZzb.cancel(true);
            return null;
        } catch (Exception e3) {
            String strValueOf3 = String.valueOf(str);
            zze.zzg(strValueOf3.length() != 0 ? "Error retrieving a response from: ".concat(strValueOf3) : new String("Error retrieving a response from: "), e3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064 A[Catch: all -> 0x007b, TryCatch #2 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:10:0x0030, B:12:0x0038, B:14:0x004d, B:17:0x005f, B:9:0x0029, B:18:0x0064, B:19:0x0066), top: B:29:0x000b, inners: #0, #1 }] */
    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), Key.STRING_CHARSET_NAME);
                } catch (IOException unused) {
                    zze.zzd("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzc = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzc();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes(Key.STRING_CHARSET_NAME));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        zze.zzg("Error writing to file in internal storage.", e);
                    }
                    str4 = this.zzc;
                } else {
                    str4 = this.zzc;
                }
            } else {
                str4 = this.zzc;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    public final void zza(zzdyc zzdycVar) {
        this.zzg = zzdycVar;
    }

    public final zzdyc zzb() {
        return this.zzg;
    }

    public final void zzc(Context context) {
        zzdyc zzdycVar;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue() || (zzdycVar = this.zzg) == null) {
            return;
        }
        zzdycVar.zzk(new zzaw(this, context), zzdyb.DEBUG_MENU);
    }

    final boolean zzd(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) zzbet.zzc().zzc(zzbjl.zzde), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            zze.zzd("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strZzo.trim());
            String strOptString = jSONObject.optString("gct");
            this.zza = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue()) {
                boolean z = "0".equals(this.zza) || "2".equals(this.zza);
                zzj(z);
                zzg zzgVarZzp = com.google.android.gms.ads.internal.zzt.zzg().zzp();
                if (true != z) {
                    str = "";
                }
                zzgVarZzp.zzL(str);
            }
            synchronized (this.zzb) {
                this.zzd = strOptString;
            }
            return true;
        } catch (JSONException e) {
            zze.zzj("Fail to get in app preview response json.", e);
            return false;
        }
    }

    public final boolean zze(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) zzbet.zzc().zzc(zzbjl.zzdf), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            zze.zzd("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strZzo.trim()).optString("debug_mode"));
            zzj(zEquals);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue()) {
                zzg zzgVarZzp = com.google.android.gms.ads.internal.zzt.zzg().zzp();
                if (true != zEquals) {
                    str = "";
                }
                zzgVarZzp.zzL(str);
            }
            return zEquals;
        } catch (JSONException e) {
            zze.zzj("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final void zzf(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzX(context, zzp(context, (String) zzbet.zzc().zzc(zzbjl.zzdd), str, str2));
    }

    public final boolean zzg(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        zze.zzd("Sending troubleshooting signals to the server.");
        zzh(context, str, str2, str3);
        return true;
    }

    public final void zzh(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = zzp(context, (String) zzbet.zzc().zzc(zzbjl.zzdg), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzN(context, str, builderBuildUpon.build().toString());
    }

    public final String zzi() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzj(boolean z) {
        synchronized (this.zzb) {
            this.zzf = z;
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzg().zzp().zzJ(z);
                zzdyc zzdycVar = this.zzg;
                if (zzdycVar != null) {
                    zzdycVar.zzb(z);
                }
            }
        }
    }

    public final boolean zzk() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzf;
        }
        return z;
    }

    public final void zzl(boolean z) {
        synchronized (this.zzb) {
            this.zze = z;
        }
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zze;
        }
        return z;
    }

    protected final void zzn(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzs.zza.post(new zzay(this, context, str, z, z2));
        } else {
            zze.zzh("Can not create dialog without Activity Context");
        }
    }
}
