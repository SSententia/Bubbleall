package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzcds implements zzcdy {
    public static final /* synthetic */ int zzb = 0;
    private static final List<Future<Void>> zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzgji zzd;
    private final LinkedHashMap<String, zzgkc> zze;
    private final Context zzh;
    private final zzcdv zzi;
    private final zzcdu zzn;
    private final List<String> zzf = new ArrayList();
    private final List<String> zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet<String> zzk = new HashSet<>();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcds(Context context, zzcgz zzcgzVar, zzcdv zzcdvVar, String str, zzcdu zzcduVar, byte[] bArr) {
        Preconditions.checkNotNull(zzcdvVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap<>();
        this.zzn = zzcduVar;
        this.zzi = zzcdvVar;
        Iterator<String> it = zzcdvVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(it.next().toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgji zzgjiVarZze = zzgkg.zze();
        zzgjiVarZze.zzn(9);
        zzgjiVarZze.zzb(str);
        zzgjiVarZze.zzc(str);
        zzgjj zzgjjVarZza = zzgjk.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzgjjVarZza.zza(str2);
        }
        zzgjiVarZze.zzd(zzgjjVarZza.zzah());
        zzgke zzgkeVarZza = zzgkf.zza();
        zzgkeVarZza.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = zzcgzVar.zza;
        if (str3 != null) {
            zzgkeVarZza.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzgkeVarZza.zzb(apkVersion);
        }
        zzgjiVarZze.zzk(zzgkeVarZza.zzah());
        this.zzd = zzgjiVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzcdy
    public final zzcdv zzb() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcdy
    public final void zzc(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzi();
                } else {
                    this.zzd.zzh(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdy
    public final boolean zzd() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcdy
    public final void zze(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        com.google.android.gms.ads.internal.util.zze.zzg("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            com.google.android.gms.ads.internal.util.zze.zzi("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        com.google.android.gms.ads.internal.util.zze.zzg("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzcdx.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zzs.zzo(new Runnable(this, bitmap) { // from class: com.google.android.gms.internal.ads.zzcdn
                    private final zzcds zza;
                    private final Bitmap zzb;

                    {
                        this.zza = this;
                        this.zzb = bitmap;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzi(this.zzb);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdy
    public final void zzf(String str, Map<String, String> map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    this.zze.get(str).zze(zzgkb.zza(3));
                }
                return;
            }
            zzgkc zzgkcVarZzd = zzgkd.zzd();
            int iZza = zzgkb.zza(i);
            if (iZza != 0) {
                zzgkcVarZzd.zze(iZza);
            }
            zzgkcVarZzd.zza(this.zze.size());
            zzgkcVarZzd.zzb(str);
            zzgjn zzgjnVarZza = zzgjq.zza();
            if (this.zzk.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : "";
                    String value = entry.getValue() != null ? entry.getValue() : "";
                    if (this.zzk.contains(key.toLowerCase(Locale.ENGLISH))) {
                        zzgjl zzgjlVarZza = zzgjm.zza();
                        zzgjlVarZza.zza(zzgex.zzv(key));
                        zzgjlVarZza.zzb(zzgex.zzv(value));
                        zzgjnVarZza.zza(zzgjlVarZza.zzah());
                    }
                }
            }
            zzgkcVarZzd.zzc(zzgjnVarZza.zzah());
            this.zze.put(str, zzgkcVarZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdy
    public final void zzg() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfsm zzfsmVarZzi = zzfsd.zzi(zzfsd.zza(Collections.emptyMap()), new zzfrk(this) { // from class: com.google.android.gms.internal.ads.zzcdo
                private final zzcds zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzfrk
                public final zzfsm zza(Object obj) {
                    return this.zza.zzh((Map) obj);
                }
            }, zzchg.zzf);
            zzfsm zzfsmVarZzh = zzfsd.zzh(zzfsmVarZzi, 10L, TimeUnit.SECONDS, zzchg.zzd);
            zzfsd.zzp(zzfsmVarZzi, new zzcdr(this, zzfsmVarZzh), zzchg.zzf);
            zzc.add(zzfsmVarZzh);
        }
    }

    final /* synthetic */ zzfsm zzh(Map map) throws Exception {
        zzgkc zzgkcVar;
        zzfsm zzfsmVarZzj;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = jSONArrayOptJSONArray.length();
                            synchronized (this.zzj) {
                                try {
                                    zzgkcVar = this.zze.get(str);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (zzgkcVar == null) {
                                String strValueOf = String.valueOf(str);
                                zzcdx.zza(strValueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(strValueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzgkcVar.zzd(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (zzble.zzb.zze().booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zze("Failed to get SafeBrowsing metadata", e);
                }
                return zzfsd.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzfsd.zza(null);
        }
        synchronized (this.zzj) {
            Iterator<zzgkc> it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzf(it.next().zzah());
            }
            this.zzd.zzl(this.zzf);
            this.zzd.zzm(this.zzg);
            if (zzcdx.zzb()) {
                String strZza = this.zzd.zza();
                String strZzg = this.zzd.zzg();
                StringBuilder sb = new StringBuilder(String.valueOf(strZza).length() + 53 + String.valueOf(strZzg).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(strZza);
                sb.append("\n  clickUrl: ");
                sb.append(strZzg);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzgkd zzgkdVar : this.zzd.zze()) {
                    sb2.append("    [");
                    sb2.append(zzgkdVar.zzc());
                    sb2.append("] ");
                    sb2.append(zzgkdVar.zza());
                }
                zzcdx.zza(sb2.toString());
            }
            zzfsm<String> zzfsmVarZzb = new com.google.android.gms.ads.internal.util.zzbr(this.zzh).zzb(1, this.zzi.zzb, null, this.zzd.zzah().zzao());
            if (zzcdx.zzb()) {
                zzfsmVarZzb.zze(zzcdp.zza, zzchg.zza);
            }
            zzfsmVarZzj = zzfsd.zzj(zzfsmVarZzb, zzcdq.zza, zzchg.zzf);
        }
        return zzfsmVarZzj;
    }

    final /* synthetic */ void zzi(Bitmap bitmap) {
        zzgev zzgevVarZzB = zzgex.zzB();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzgevVarZzB);
        synchronized (this.zzj) {
            zzgji zzgjiVar = this.zzd;
            zzgjv zzgjvVarZza = zzgjx.zza();
            zzgjvVarZza.zzb(zzgevVarZzB.zza());
            zzgjvVarZza.zza("image/png");
            zzgjvVarZza.zzc(2);
            zzgjiVar.zzj(zzgjvVarZza.zzah());
        }
    }
}
