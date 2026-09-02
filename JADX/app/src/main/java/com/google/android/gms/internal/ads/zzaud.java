package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaud implements zzaui {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzc = new AtomicReference<>();
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzauh zzg;
    private final zzauo<? super zzaud> zzh;
    private zzaub zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;

    public zzaud(String str, zzauz<String> zzauzVar, zzauo<? super zzaud> zzauoVar, int i, int i2, boolean z, zzauh zzauhVar) {
        zzaup.zzf(str);
        this.zzf = str;
        this.zzh = zzauoVar;
        this.zzg = new zzauh();
        this.zzd = i;
        this.zze = i2;
    }

    private final void zzf() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzj = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    @Override // com.google.android.gms.internal.ads.zzatz
    public final long zza(zzaub zzaubVar) throws zzauf {
        long j;
        long jMax;
        this.zzi = zzaubVar;
        long j2 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzaubVar.zza.toString());
            long j3 = zzaubVar.zzc;
            long j4 = zzaubVar.zzd;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Too many redirects: ");
                    sb.append(i2);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (Map.Entry<String, String> entry : this.zzg.zza().entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                if (j3 != j2 || j4 != -1) {
                    StringBuilder sb2 = new StringBuilder(27);
                    sb2.append("bytes=");
                    sb2.append(j3);
                    sb2.append("-");
                    String string = sb2.toString();
                    if (j4 != -1) {
                        StringBuilder sb3 = new StringBuilder(string.length() + 20);
                        sb3.append(string);
                        sb3.append((j3 + j4) - 1);
                        string = sb3.toString();
                    }
                    httpURLConnection.setRequestProperty("Range", string);
                }
                httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    this.zzj = httpURLConnection;
                    try {
                        int responseCode2 = httpURLConnection.getResponseCode();
                        if (responseCode2 < 200 || responseCode2 > 299) {
                            Map<String, List<String>> headerFields = this.zzj.getHeaderFields();
                            zzf();
                            zzaug zzaugVar = new zzaug(responseCode2, headerFields, zzaubVar);
                            if (responseCode2 != 416) {
                                throw zzaugVar;
                            }
                            zzaugVar.initCause(new zzaua(0));
                            throw zzaugVar;
                        }
                        this.zzj.getContentType();
                        if (responseCode2 == 200) {
                            j = zzaubVar.zzc;
                            if (j == 0) {
                                j = 0;
                            }
                        } else {
                            j = 0;
                        }
                        this.zzm = j;
                        long j5 = zzaubVar.zzd;
                        if (j5 != -1) {
                            this.zzn = j5;
                        } else {
                            HttpURLConnection httpURLConnection2 = this.zzj;
                            String headerField = httpURLConnection2.getHeaderField("Content-Length");
                            if (TextUtils.isEmpty(headerField)) {
                                jMax = -1;
                            } else {
                                try {
                                    jMax = Long.parseLong(headerField);
                                } catch (NumberFormatException unused) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(headerField).length() + 28);
                                    sb4.append("Unexpected Content-Length [");
                                    sb4.append(headerField);
                                    sb4.append("]");
                                    Log.e("DefaultHttpDataSource", sb4.toString());
                                    jMax = -1;
                                }
                            }
                            String headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                            if (!TextUtils.isEmpty(headerField2)) {
                                Matcher matcher = zzb.matcher(headerField2);
                                if (matcher.find()) {
                                    try {
                                        long j6 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                        if (jMax < 0) {
                                            jMax = j6;
                                        } else if (jMax != j6) {
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(headerField).length() + 26 + String.valueOf(headerField2).length());
                                            sb5.append("Inconsistent headers [");
                                            sb5.append(headerField);
                                            sb5.append("] [");
                                            sb5.append(headerField2);
                                            sb5.append("]");
                                            Log.w("DefaultHttpDataSource", sb5.toString());
                                            jMax = Math.max(jMax, j6);
                                        }
                                    } catch (NumberFormatException unused2) {
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(headerField2).length() + 27);
                                        sb6.append("Unexpected Content-Range [");
                                        sb6.append(headerField2);
                                        sb6.append("]");
                                        Log.e("DefaultHttpDataSource", sb6.toString());
                                    }
                                }
                            }
                            this.zzn = jMax != -1 ? jMax - this.zzm : -1L;
                        }
                        try {
                            this.zzk = this.zzj.getInputStream();
                            this.zzl = true;
                            zzauo<? super zzaud> zzauoVar = this.zzh;
                            if (zzauoVar != null) {
                                zzauoVar.zzj(this, zzaubVar);
                            }
                            return this.zzn;
                        } catch (IOException e) {
                            zzf();
                            throw new zzauf(e, zzaubVar, 1);
                        }
                    } catch (IOException e2) {
                        zzf();
                        String strValueOf = String.valueOf(zzaubVar.zza.toString());
                        throw new zzauf(strValueOf.length() != 0 ? "Unable to connect to ".concat(strValueOf) : new String("Unable to connect to "), e2, zzaubVar, 1);
                    }
                }
                String headerField3 = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField3 == null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url2 = new URL(url, headerField3);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String strValueOf2 = String.valueOf(protocol);
                    throw new ProtocolException(strValueOf2.length() != 0 ? "Unsupported protocol redirect: ".concat(strValueOf2) : new String("Unsupported protocol redirect: "));
                }
                url = url2;
                i = i2;
                j2 = 0;
            }
        } catch (IOException e3) {
            String strValueOf3 = String.valueOf(zzaubVar.zza.toString());
            throw new zzauf(strValueOf3.length() != 0 ? "Unable to connect to ".concat(strValueOf3) : new String("Unable to connect to "), e3, zzaubVar, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0085 */
    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[Catch: Exception -> 0x0069, all -> 0x0085, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0002, B:5:0x0006, B:9:0x0014, B:11:0x001a, B:28:0x0069, B:31:0x0070, B:32:0x0078, B:15:0x0021, B:17:0x0029, B:23:0x0038, B:25:0x0048, B:27:0x0050, B:8:0x0011), top: B:43:0x0002, inners: #2 }] */
    @Override // com.google.android.gms.internal.ads.zzatz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd() throws com.google.android.gms.internal.ads.zzauf {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.zzk     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L79
            java.net.HttpURLConnection r2 = r9.zzj     // Catch: java.lang.Throwable -> L85
            long r3 = r9.zzn     // Catch: java.lang.Throwable -> L85
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.zzp     // Catch: java.lang.Throwable -> L85
            long r3 = r3 - r7
        L14:
            int r7 = com.google.android.gms.internal.ads.zzave.zza     // Catch: java.lang.Throwable -> L85
            r8 = 19
            if (r7 == r8) goto L21
            int r7 = com.google.android.gms.internal.ads.zzave.zza     // Catch: java.lang.Throwable -> L85
            r8 = 20
            if (r7 == r8) goto L21
            goto L69
        L21:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L31
            int r3 = r2.read()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
            r4 = -1
            if (r3 == r4) goto L69
            goto L38
        L31:
            r5 = 2048(0x800, double:1.012E-320)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L38
            goto L69
        L38:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
            if (r4 != 0) goto L50
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
            if (r3 == 0) goto L69
        L50:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L85
        L69:
            java.io.InputStream r2 = r9.zzk     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L85
            r2.close()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L85
            goto L79
        L6f:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzauf r3 = new com.google.android.gms.internal.ads.zzauf     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.internal.ads.zzaub r4 = r9.zzi     // Catch: java.lang.Throwable -> L85
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L85
            throw r3     // Catch: java.lang.Throwable -> L85
        L79:
            r9.zzk = r0
            r9.zzf()
            boolean r0 = r9.zzl
            if (r0 == 0) goto L84
            r9.zzl = r1
        L84:
            return
        L85:
            r2 = move-exception
            r9.zzk = r0
            r9.zzf()
            boolean r0 = r9.zzl
            if (r0 == 0) goto L91
            r9.zzl = r1
        L91:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaud.zzd():void");
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final Map<String, List<String>> zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: IOException -> 0x0096, TryCatch #0 {IOException -> 0x0096, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:38:0x0092, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: IOException -> 0x0096, TryCatch #0 {IOException -> 0x0096, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:38:0x0092, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: IOException -> 0x0096, TryCatch #0 {IOException -> 0x0096, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:38:0x0092, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0092 A[Catch: IOException -> 0x0096, TRY_LEAVE, TryCatch #0 {IOException -> 0x0096, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:38:0x0092, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzatz
    public final int zzb(byte[] bArr, int i, int i2) throws zzauf {
        int i3;
        zzauo<? super zzaud> zzauoVar;
        try {
            if (this.zzo != this.zzm) {
                byte[] andSet = zzc.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j2 = this.zzm;
                    if (j == j2) {
                        zzc.set(andSet);
                        break;
                    }
                    int i4 = this.zzk.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += (long) i4;
                    zzauo<? super zzaud> zzauoVar2 = this.zzh;
                    if (zzauoVar2 != null) {
                        zzauoVar2.zzk(this, i4);
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzn;
            if (j3 != -1) {
                long j4 = j3 - this.zzp;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                    i3 = this.zzk.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.zzp += (long) i3;
                        zzauoVar = this.zzh;
                        if (zzauoVar != null) {
                            return i3;
                        }
                        zzauoVar.zzk(this, i3);
                        return i3;
                    }
                    if (this.zzn == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i3 = this.zzk.read(bArr, i, i2);
                if (i3 == -1) {
                    this.zzp += (long) i3;
                    zzauoVar = this.zzh;
                    if (zzauoVar != null) {
                        return i3;
                    }
                    zzauoVar.zzk(this, i3);
                    return i3;
                }
                if (this.zzn == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e) {
            throw new zzauf(e, this.zzi, 2);
        }
    }
}
