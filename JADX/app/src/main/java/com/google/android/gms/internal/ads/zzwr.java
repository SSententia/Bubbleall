package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzwr implements zzvv {
    protected final zzwt zza;

    @Deprecated
    protected final zzwq zzb;
    private final zzwq zzc;

    public zzwr(zzwq zzwqVar) {
        zzwt zzwtVar = new zzwt(4096);
        this.zzc = zzwqVar;
        this.zzb = zzwqVar;
        this.zza = zzwtVar;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:145:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:149:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:156:0x0316  */
    /* JADX WARN: Code duplicated, block: B:170:0x0357  */
    /* JADX WARN: Code duplicated, block: B:179:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x03ab A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzvv
    public zzvy zza(zzwc<?> zzwcVar) throws Throwable {
        zzxa zzxaVar;
        byte[] bArr;
        String strValueOf;
        String str;
        int iZza;
        zzxf zzxfVar;
        zzvy zzvyVar;
        zzxf zzxfVar2;
        int iZzp;
        Map mapEmptyMap;
        byte[] byteArray;
        byte[] bArrZza;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z = true;
            try {
                zzvl zzvlVarZzl = zzwcVar.zzl();
                if (zzvlVarZzl == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str2 = zzvlVarZzl.zzb;
                    if (str2 != null) {
                        map.put("If-None-Match", str2);
                    }
                    long j = zzvlVarZzl.zzd;
                    if (j > 0) {
                        map.put("If-Modified-Since", zzwz.zzc(j));
                    }
                    mapEmptyMap = map;
                }
                String strZzi = zzwcVar.zzi();
                HashMap map2 = new HashMap();
                map2.putAll(mapEmptyMap);
                map2.putAll(zzwcVar.zzn());
                URL url = new URL(strZzi);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int iZzp2 = zzwcVar.zzp();
                httpURLConnection.setConnectTimeout(iZzp2);
                httpURLConnection.setReadTimeout(iZzp2);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str3 : map2.keySet()) {
                        httpURLConnection.setRequestProperty(str3, (String) map2.get(str3));
                    }
                    if (zzwcVar.zzb() != 0) {
                        httpURLConnection.setRequestMethod("POST");
                        byte[] bArrZzo = zzwcVar.zzo();
                        if (bArrZzo != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(bArrZzo);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod("GET");
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (!z) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                    zzwcVar.zzb();
                    if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                        zzxaVar = new zzxa(responseCode, zzxd.zza(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    } else {
                        try {
                            zzxaVar = new zzxa(responseCode, zzxd.zza(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzxb(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            if (!z) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e) {
                                    e = e;
                                    zzxaVar = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                        zzxfVar = new zzxf("socket", new zzwk(), null);
                                    } else {
                                        if (e instanceof MalformedURLException) {
                                            strValueOf = String.valueOf(zzwcVar.zzi());
                                            if (strValueOf.length() != 0) {
                                                str = "Bad URL ".concat(strValueOf);
                                            } else {
                                                str = new String("Bad URL ");
                                            }
                                            throw new RuntimeException(str, e);
                                        }
                                        if (zzxaVar != null) {
                                            throw new zzvz(e);
                                        }
                                        iZza = zzxaVar.zza();
                                        zzwo.zzc("Unexpected response code %d for %s", Integer.valueOf(iZza), zzwcVar.zzi());
                                        if (bArr != null) {
                                            zzvyVar = new zzvy(iZza, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzxaVar.zzb());
                                            if (iZza == 401) {
                                            }
                                            zzxfVar = new zzxf("auth", new zzvk(zzvyVar), null);
                                        } else {
                                            zzxfVar = new zzxf("network", new zzvx(), null);
                                        }
                                    }
                                    zzxfVar2 = zzxfVar;
                                    zzvq zzvqVarZzy = zzwcVar.zzy();
                                    iZzp = zzwcVar.zzp();
                                    try {
                                        zzvqVarZzy.zzc(zzxfVar2.zzb);
                                        zzwcVar.zzd(String.format("%s-retry [timeout=%s]", zzxfVar2.zza, Integer.valueOf(iZzp)));
                                    } catch (zzwl e2) {
                                        zzwcVar.zzd(String.format("%s-timeout-giveup [timeout=%s]", zzxfVar2.zza, Integer.valueOf(iZzp)));
                                        throw e2;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        int iZza2 = zzxaVar.zza();
                        List<zzvu> listZzb = zzxaVar.zzb();
                        if (iZza2 == 304) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            zzvl zzvlVarZzl2 = zzwcVar.zzl();
                            if (zzvlVarZzl2 == null) {
                                return new zzvy(304, (byte[]) null, true, jElapsedRealtime2, listZzb);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!listZzb.isEmpty()) {
                                Iterator<zzvu> it = listZzb.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(it.next().zza());
                                }
                            }
                            ArrayList arrayList = new ArrayList(listZzb);
                            List<zzvu> list = zzvlVarZzl2.zzh;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (zzvu zzvuVar : zzvlVarZzl2.zzh) {
                                        if (!treeSet.contains(zzvuVar.zza())) {
                                            arrayList.add(zzvuVar);
                                        }
                                    }
                                }
                            } else if (!zzvlVarZzl2.zzg.isEmpty()) {
                                for (Map.Entry<String, String> entry : zzvlVarZzl2.zzg.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new zzvu(entry.getKey(), entry.getValue()));
                                    }
                                }
                            }
                            return new zzvy(304, zzvlVarZzl2.zza, true, jElapsedRealtime2, (List<zzvu>) arrayList);
                        }
                        InputStream inputStreamZzd = zzxaVar.zzd();
                        if (inputStreamZzd != null) {
                            int iZzc = zzxaVar.zzc();
                            try {
                                zzwt zzwtVar = this.zza;
                                zzxg zzxgVar = new zzxg(zzwtVar, iZzc);
                                try {
                                    bArrZza = zzwtVar.zza(1024);
                                    while (true) {
                                        try {
                                            int i = inputStreamZzd.read(bArrZza);
                                            if (i == -1) {
                                                break;
                                            }
                                            zzxgVar.write(bArrZza, 0, i);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                inputStreamZzd.close();
                                            } catch (IOException unused) {
                                                zzwo.zza("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            zzwtVar.zzb(bArrZza);
                                            zzxgVar.close();
                                            throw th;
                                        }
                                        if (e instanceof SocketTimeoutException) {
                                            zzxfVar = new zzxf("socket", new zzwk(), null);
                                        } else {
                                            if (e instanceof MalformedURLException) {
                                                strValueOf = String.valueOf(zzwcVar.zzi());
                                                if (strValueOf.length() != 0) {
                                                    str = "Bad URL ".concat(strValueOf);
                                                } else {
                                                    str = new String("Bad URL ");
                                                }
                                                throw new RuntimeException(str, e);
                                            }
                                            if (zzxaVar != null) {
                                                throw new zzvz(e);
                                            }
                                            iZza = zzxaVar.zza();
                                            zzwo.zzc("Unexpected response code %d for %s", Integer.valueOf(iZza), zzwcVar.zzi());
                                            if (bArr != null) {
                                                zzvyVar = new zzvy(iZza, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzxaVar.zzb());
                                                if (iZza == 401 && iZza != 403) {
                                                    if (iZza < 400 || iZza > 499) {
                                                        throw new zzwj(zzvyVar);
                                                    }
                                                    throw new zzvp(zzvyVar);
                                                }
                                                zzxfVar = new zzxf("auth", new zzvk(zzvyVar), null);
                                            } else {
                                                zzxfVar = new zzxf("network", new zzvx(), null);
                                            }
                                        }
                                        zzxfVar2 = zzxfVar;
                                        zzvq zzvqVarZzy2 = zzwcVar.zzy();
                                        iZzp = zzwcVar.zzp();
                                        zzvqVarZzy2.zzc(zzxfVar2.zzb);
                                        zzwcVar.zzd(String.format("%s-retry [timeout=%s]", zzxfVar2.zza, Integer.valueOf(iZzp)));
                                    }
                                    byteArray = zzxgVar.toByteArray();
                                    try {
                                        inputStreamZzd.close();
                                    } catch (IOException unused2) {
                                        zzwo.zza("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzwtVar.zzb(bArrZza);
                                    zzxgVar.close();
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArrZza = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                bArr = null;
                            }
                        } else {
                            byteArray = new byte[0];
                        }
                        try {
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (zzwo.zzb || jElapsedRealtime3 > 3000) {
                                Object[] objArr = new Object[5];
                                objArr[0] = zzwcVar;
                                objArr[1] = Long.valueOf(jElapsedRealtime3);
                                objArr[2] = byteArray != null ? Integer.valueOf(byteArray.length) : "null";
                                objArr[3] = Integer.valueOf(iZza2);
                                objArr[4] = Integer.valueOf(zzwcVar.zzy().zzb());
                                zzwo.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            }
                            if (iZza2 < 200 || iZza2 > 299) {
                                throw new IOException();
                            }
                            return new zzvy(iZza2, byteArray, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzb);
                        } catch (IOException e4) {
                            e = e4;
                            bArr = byteArray;
                        }
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e6) {
                e = e6;
            }
        }
    }
}
