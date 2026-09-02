package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbjq {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue<zzbka> zza = new ArrayBlockingQueue(100);
    final LinkedHashMap<String, String> zzb = new LinkedHashMap<>();
    final Map<String, zzbjw> zzc = new HashMap();
    private final HashSet<String> zzg = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    private final void zzg(Map<String, String> map, zzbjz zzbjzVar) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (zzbjzVar != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(zzbjzVar.zza())) {
                sb.append("&it=");
                sb.append(zzbjzVar.zza());
            }
            if (!TextUtils.isEmpty(zzbjzVar.zzb())) {
                sb.append("&blat=");
                sb.append(zzbjzVar.zzb());
            }
            string = sb.toString();
        }
        if (!this.zzh.get()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzN(this.zze, this.zzf, string);
            return;
        }
        File file = this.zzi;
        if (file == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        com.google.android.gms.ads.internal.util.zze.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    com.google.android.gms.ads.internal.util.zze.zzj("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            com.google.android.gms.ads.internal.util.zze.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            com.google.android.gms.ads.internal.util.zze.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    public final void zza(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(zzbku.zzc.zze().booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.zzb.put(entry.getKey(), entry.getValue());
        }
        zzchg.zza.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbjp
            private final zzbjq zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.zzf();
            }
        });
        this.zzc.put("action", zzbjw.zzb);
        this.zzc.put("ad_format", zzbjw.zzb);
        this.zzc.put("e", zzbjw.zzc);
    }

    public final boolean zzb(zzbka zzbkaVar) {
        return this.zza.offer(zzbkaVar);
    }

    final Map<String, String> zzc(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            linkedHashMap.put(key, zzd(key).zza((String) linkedHashMap.get(key), value));
        }
        return linkedHashMap;
    }

    public final zzbjw zzd(String str) {
        zzbjw zzbjwVar = this.zzc.get(str);
        return zzbjwVar != null ? zzbjwVar : zzbjw.zza;
    }

    public final void zze(String str) throws Throwable {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzc(this.zzb, linkedHashMap), null);
    }

    final /* bridge */ /* synthetic */ void zzf() throws Throwable {
        while (true) {
            try {
                zzbka zzbkaVarTake = this.zza.take();
                zzbjz zzbjzVarZzc = zzbkaVarTake.zzc();
                if (!TextUtils.isEmpty(zzbjzVarZzc.zza())) {
                    zzg(zzc(this.zzb, zzbkaVarTake.zze()), zzbjzVarZzc);
                }
            } catch (InterruptedException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }
}
