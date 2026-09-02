package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzebu implements zzfdw<zzebs, zzebt> {
    protected final Context zza;
    protected final String zzb;
    protected final zzcbv zzc;

    public zzebu(Context context, String str, zzcbv zzcbvVar, int i, byte[] bArr) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzcbvVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024c A[Catch: all -> 0x024d, TRY_LEAVE, TryCatch #10 {all -> 0x024d, blocks: (B:20:0x009f, B:96:0x022c, B:98:0x023e, B:100:0x024c, B:21:0x00a5, B:23:0x00ae, B:26:0x00c7, B:30:0x00cf, B:31:0x00d2, B:32:0x00d3, B:33:0x00f1, B:35:0x00f7, B:37:0x010f, B:38:0x0119, B:39:0x0123, B:41:0x0128, B:51:0x015f, B:53:0x016d, B:56:0x0180, B:57:0x0186, B:58:0x0187, B:65:0x019b, B:66:0x019e, B:71:0x01a6, B:73:0x01b2, B:77:0x01d5, B:78:0x01e1, B:79:0x01e2, B:80:0x01ee, B:81:0x01ef, B:82:0x0217), top: B:113:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:98:0x023e A[Catch: all -> 0x024d, TryCatch #10 {all -> 0x024d, blocks: (B:20:0x009f, B:96:0x022c, B:98:0x023e, B:100:0x024c, B:21:0x00a5, B:23:0x00ae, B:26:0x00c7, B:30:0x00cf, B:31:0x00d2, B:32:0x00d3, B:33:0x00f1, B:35:0x00f7, B:37:0x010f, B:38:0x0119, B:39:0x0123, B:41:0x0128, B:51:0x015f, B:53:0x016d, B:56:0x0180, B:57:0x0186, B:58:0x0187, B:65:0x019b, B:66:0x019e, B:71:0x01a6, B:73:0x01b2, B:77:0x01d5, B:78:0x01e1, B:79:0x01e2, B:80:0x01ee, B:81:0x01ef, B:82:0x0217), top: B:113:0x009f }] */
    @Override // com.google.android.gms.internal.ads.zzfdw
    public final /* bridge */ /* synthetic */ zzebt zza(zzebs zzebsVar) throws Exception {
        HttpURLConnection httpURLConnection;
        zzebt zzebtVar;
        InputStreamReader inputStreamReader;
        zzebs zzebsVar2 = zzebsVar;
        String str = zzebsVar2.zza;
        int i = zzebsVar2.zzb;
        Map<String, String> map = zzebsVar2.zzc;
        String str2 = zzebsVar2.zzd;
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
        try {
            zzebt zzebtVar2 = new zzebt();
            String strValueOf = String.valueOf(this.zzb);
            com.google.android.gms.ads.internal.util.zze.zzh(strValueOf.length() != 0 ? "SDK version: ".concat(strValueOf) : new String("SDK version: "));
            String strValueOf2 = String.valueOf(str);
            com.google.android.gms.ads.internal.util.zze.zzd(strValueOf2.length() != 0 ? "AdRequestServiceImpl: Sending request: ".concat(strValueOf2) : new String("AdRequestServiceImpl: Sending request: "));
            URL url = new URL(str);
            HashMap map2 = new HashMap();
            int i2 = 0;
            while (true) {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                try {
                    HttpURLConnection httpURLConnection3 = httpURLConnection2;
                    zzebt zzebtVar3 = zzebtVar2;
                    try {
                        com.google.android.gms.ads.internal.zzt.zzc().zzf(this.zza, this.zzb, false, httpURLConnection2, false, i);
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            httpURLConnection = httpURLConnection3;
                            try {
                                try {
                                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                                    httpURLConnection3 = httpURLConnection;
                                } catch (Throwable th) {
                                    th = th;
                                    httpURLConnection.disconnect();
                                    throw th;
                                }
                            } catch (zzdym e) {
                                e = e;
                                zzebtVar = zzebtVar3;
                                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfW)).booleanValue()) {
                                    throw e;
                                }
                                zzebtVar.zzd = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - jElapsedRealtime;
                                httpURLConnection.disconnect();
                                return zzebtVar;
                            }
                        }
                        httpURLConnection = httpURLConnection3;
                        BufferedOutputStream bufferedOutputStream = null;
                        if (str2.length() > 0) {
                            byte[] bytes = str2.getBytes(zzfll.zzc);
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bytes);
                                    IOUtils.closeQuietly(bufferedOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    IOUtils.closeQuietly(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        zzcgs zzcgsVar = new zzcgs(null);
                        zzcgsVar.zza(httpURLConnection, str2.getBytes(zzfll.zzc));
                        int responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (map2.containsKey(key)) {
                                ((List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new ArrayList(value));
                            }
                        }
                        zzcgsVar.zzc(httpURLConnection, responseCode);
                        zzebtVar = zzebtVar3;
                        try {
                            zzebtVar.zza = responseCode;
                            zzebtVar.zzb = map2;
                            zzebtVar.zzc = "";
                            if (responseCode >= 200 && responseCode < 300) {
                                try {
                                    inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                                    try {
                                        com.google.android.gms.ads.internal.zzt.zzc();
                                        StringBuilder sb = new StringBuilder(8192);
                                        char[] cArr = new char[2048];
                                        while (true) {
                                            int i3 = inputStreamReader.read(cArr);
                                            if (i3 == -1) {
                                                break;
                                            }
                                            sb.append(cArr, 0, i3);
                                        }
                                        String string = sb.toString();
                                        IOUtils.closeQuietly(inputStreamReader);
                                        zzcgsVar.zze(string);
                                        zzebtVar.zzc = string;
                                        if (TextUtils.isEmpty(string)) {
                                            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzdN)).booleanValue()) {
                                                throw new zzdym(3);
                                            }
                                        }
                                        zzebtVar.zzd = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - jElapsedRealtime;
                                        break;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        IOUtils.closeQuietly(inputStreamReader);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStreamReader = null;
                                }
                            } else {
                                if (responseCode < 300 || responseCode >= 400) {
                                    StringBuilder sb2 = new StringBuilder(46);
                                    sb2.append("Received error HTTP response code: ");
                                    sb2.append(responseCode);
                                    com.google.android.gms.ads.internal.util.zze.zzi(sb2.toString());
                                    StringBuilder sb3 = new StringBuilder(46);
                                    sb3.append("Received error HTTP response code: ");
                                    sb3.append(responseCode);
                                    throw new zzdym(1, sb3.toString());
                                }
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (TextUtils.isEmpty(headerField)) {
                                    com.google.android.gms.ads.internal.util.zze.zzi("No location header to follow redirect.");
                                    throw new zzdym(1, "No location header to follow redirect");
                                }
                                URL url2 = new URL(headerField);
                                int i4 = i2 + 1;
                                if (i4 > ((Integer) zzbet.zzc().zzc(zzbjl.zzdt)).intValue()) {
                                    com.google.android.gms.ads.internal.util.zze.zzi("Too many redirects.");
                                    throw new zzdym(1, "Too many redirects");
                                }
                                httpURLConnection.disconnect();
                                i2 = i4;
                                zzebtVar2 = zzebtVar;
                                url = url2;
                            }
                        } catch (zzdym e2) {
                            e = e2;
                            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfW)).booleanValue()) {
                                throw e;
                            }
                            zzebtVar.zzd = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - jElapsedRealtime;
                        }
                    } catch (zzdym e3) {
                        e = e3;
                        httpURLConnection = httpURLConnection3;
                    } catch (Throwable th6) {
                        th = th6;
                        httpURLConnection = httpURLConnection3;
                    }
                } catch (zzdym e4) {
                    e = e4;
                    httpURLConnection = httpURLConnection2;
                    zzebtVar = zzebtVar2;
                } catch (Throwable th7) {
                    th = th7;
                    httpURLConnection = httpURLConnection2;
                }
            }
            httpURLConnection.disconnect();
            return zzebtVar;
        } catch (IOException e5) {
            String strValueOf3 = String.valueOf(e5.getMessage());
            String strConcat = strValueOf3.length() != 0 ? "Error while connecting to ad server: ".concat(strValueOf3) : new String("Error while connecting to ad server: ");
            com.google.android.gms.ads.internal.util.zze.zzi(strConcat);
            throw new zzdym(1, strConcat, e5);
        }
    }
}
