package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaq extends zzag implements zzaw {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzav zzf;
    private final zzav zzg;
    private zzan zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzaq() {
        this(null, 8000, 8000, false, null, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ zzaq(String str, String str2, int i, int i2, boolean z, zzav zzavVar, zzfly<String> zzflyVar, boolean z2) {
        this(str, str2, i, i2, z, null, false);
    }

    private final HttpURLConnection zzk(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzc);
        httpURLConnection.setReadTimeout(this.zzd);
        HashMap map2 = new HashMap();
        map2.putAll(this.zzf.zza());
        map2.putAll(this.zzg.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str = this.zze;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(zzan.zza(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzan zzanVar) throws zzat {
        if (str == null) {
            throw new zzat("Null location redirect", zzanVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                String strValueOf = String.valueOf(protocol);
                throw new zzat(strValueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(strValueOf) : new String("Unsupported protocol redirect: "), zzanVar, 2001, 1);
            }
            if (this.zzb || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 41 + String.valueOf(protocol).length());
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzat(sb.toString(), zzanVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzat(e, zzanVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzaln.zzb("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzag, com.google.android.gms.internal.ads.zzaj
    public final Map<String, List<String>> zzf() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i, int i2) throws zzat {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            if (j != -1) {
                long j2 = j - this.zzn;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.zzj;
                    int i4 = zzamq.zza;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.zzn += (long) i3;
                        zzd(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.zzj;
                int i5 = zzamq.zza;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 == -1) {
                    this.zzn += (long) i3;
                    zzd(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            zzan zzanVar = this.zzh;
            int i6 = zzamq.zza;
            throw zzat.zza(e, zzanVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws zzat {
        int i;
        HttpURLConnection httpURLConnectionZzk;
        byte[] bArrZza;
        long j;
        this.zzh = zzanVar;
        this.zzn = 0L;
        this.zzm = 0L;
        zzb(zzanVar);
        try {
            URL url = new URL(zzanVar.zza.toString());
            int i2 = zzanVar.zzb;
            byte[] bArr = zzanVar.zzc;
            long j2 = zzanVar.zzf;
            long j3 = zzanVar.zzg;
            boolean zZzb = zzanVar.zzb(1);
            try {
                if (this.zzb) {
                    URL urlZzl = url;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (i3 > 20) {
                            i = 1;
                            StringBuilder sb = new StringBuilder(31);
                            sb.append("Too many redirects: ");
                            sb.append(i4);
                            throw new zzat(new NoRouteToHostException(sb.toString()), zzanVar, 2001, 1);
                        }
                        long j4 = j3;
                        long j5 = j2;
                        URL url2 = urlZzl;
                        HttpURLConnection httpURLConnectionZzk2 = zzk(urlZzl, 1, null, j2, j3, zZzb, false, zzanVar.zzd);
                        int responseCode = httpURLConnectionZzk2.getResponseCode();
                        String headerField = httpURLConnectionZzk2.getHeaderField("Location");
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            httpURLConnectionZzk = httpURLConnectionZzk2;
                            break;
                        }
                        i = 1;
                        try {
                            httpURLConnectionZzk2.disconnect();
                            urlZzl = zzl(url2, headerField, zzanVar);
                            i3 = i4;
                            j3 = j4;
                            j2 = j5;
                        } catch (IOException e) {
                            e = e;
                        }
                        e = e;
                        zzm();
                        throw zzat.zza(e, zzanVar, i);
                    }
                }
                httpURLConnectionZzk = zzk(url, 1, null, j2, j3, zZzb, true, zzanVar.zzd);
                this.zzi = httpURLConnectionZzk;
                this.zzl = httpURLConnectionZzk.getResponseCode();
                String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i5 = this.zzl;
                if (i5 < 200 || i5 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (this.zzl == 416) {
                        if (zzanVar.zzf == zzax.zza(httpURLConnectionZzk.getHeaderField("Content-Range"))) {
                            this.zzk = true;
                            zzc(zzanVar);
                            long j6 = zzanVar.zzg;
                            if (j6 != -1) {
                                return j6;
                            }
                            return 0L;
                        }
                    }
                    InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        bArrZza = errorStream != null ? zzamq.zza(errorStream) : zzamq.zzf;
                    } catch (IOException unused) {
                        bArrZza = zzamq.zzf;
                    }
                    byte[] bArr2 = bArrZza;
                    zzm();
                    throw new zzau(this.zzl, responseMessage, this.zzl == 416 ? new zzak(2008) : null, headerFields, zzanVar, bArr2);
                }
                httpURLConnectionZzk.getContentType();
                if (this.zzl == 200) {
                    j = zzanVar.zzf;
                    if (j == 0) {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    this.zzm = zzanVar.zzg;
                } else {
                    long j7 = zzanVar.zzg;
                    if (j7 != -1) {
                        this.zzm = j7;
                    } else {
                        long jZzb = zzax.zzb(httpURLConnectionZzk.getHeaderField("Content-Length"), httpURLConnectionZzk.getHeaderField("Content-Range"));
                        this.zzm = jZzb != -1 ? jZzb - j : -1L;
                    }
                }
                try {
                    this.zzj = httpURLConnectionZzk.getInputStream();
                    if (zEqualsIgnoreCase) {
                        this.zzj = new GZIPInputStream(this.zzj);
                    }
                    this.zzk = true;
                    zzc(zzanVar);
                    if (j != 0) {
                        try {
                            byte[] bArr3 = new byte[4096];
                            while (j > 0) {
                                int iMin = (int) Math.min(j, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                                InputStream inputStream = this.zzj;
                                int i6 = zzamq.zza;
                                int i7 = inputStream.read(bArr3, 0, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzat(new InterruptedIOException(), zzanVar, 2000, 1);
                                }
                                if (i7 == -1) {
                                    throw new zzat(zzanVar, 2008, 1);
                                }
                                j -= (long) i7;
                                zzd(i7);
                            }
                        } catch (IOException e2) {
                            zzm();
                            if (e2 instanceof zzat) {
                                throw ((zzat) e2);
                            }
                            throw new zzat(e2, zzanVar, 2000, 1);
                        }
                    }
                    return this.zzm;
                } catch (IOException e3) {
                    zzm();
                    throw new zzat(e3, zzanVar, 2000, 1);
                }
            } catch (IOException e4) {
                e = e4;
                i = 1;
            }
        } catch (IOException e5) {
            e = e5;
            i = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0090 */
    /* JADX WARN: Code duplicated, block: B:29:0x0053 A[Catch: Exception -> 0x006f, all -> 0x0090, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0002, B:5:0x0006, B:9:0x0013, B:11:0x0017, B:13:0x001d, B:17:0x0024, B:19:0x002c, B:25:0x003b, B:27:0x004b, B:29:0x0053, B:31:0x005e, B:32:0x006f, B:35:0x0074, B:36:0x0080, B:8:0x0010), top: B:47:0x0002, inners: #2 }] */
    @Override // com.google.android.gms.internal.ads.zzaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj() throws com.google.android.gms.internal.ads.zzat {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.zzj     // Catch: java.lang.Throwable -> L90
            if (r2 == 0) goto L81
            long r3 = r10.zzm     // Catch: java.lang.Throwable -> L90
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L10
            r3 = r5
            goto L13
        L10:
            long r7 = r10.zzn     // Catch: java.lang.Throwable -> L90
            long r3 = r3 - r7
        L13:
            java.net.HttpURLConnection r7 = r10.zzi     // Catch: java.lang.Throwable -> L90
            if (r7 == 0) goto L6f
            int r8 = com.google.android.gms.internal.ads.zzamq.zza     // Catch: java.lang.Throwable -> L90
            r9 = 19
            if (r8 < r9) goto L6f
            int r8 = com.google.android.gms.internal.ads.zzamq.zza     // Catch: java.lang.Throwable -> L90
            r9 = 20
            if (r8 <= r9) goto L24
            goto L6f
        L24:
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L34
            int r3 = r7.read()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
            r4 = -1
            if (r3 == r4) goto L6f
            goto L3b
        L34:
            r5 = 2048(0x800, double:1.012E-320)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L3b
            goto L6f
        L3b:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
            if (r4 != 0) goto L53
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
            if (r3 == 0) goto L6f
        L53:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
            r3.getClass()
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
            r3.invoke(r7, r4)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L90
        L6f:
            r2.close()     // Catch: java.io.IOException -> L73 java.lang.Throwable -> L90
            goto L81
        L73:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzat r3 = new com.google.android.gms.internal.ads.zzat     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.zzan r4 = r10.zzh     // Catch: java.lang.Throwable -> L90
            int r5 = com.google.android.gms.internal.ads.zzamq.zza     // Catch: java.lang.Throwable -> L90
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L90
            throw r3     // Catch: java.lang.Throwable -> L90
        L81:
            r10.zzj = r0
            r10.zzm()
            boolean r0 = r10.zzk
            if (r0 == 0) goto L8f
            r10.zzk = r1
            r10.zze()
        L8f:
            return
        L90:
            r2 = move-exception
            r10.zzj = r0
            r10.zzm()
            boolean r0 = r10.zzk
            if (r0 == 0) goto L9f
            r10.zzk = r1
            r10.zze()
        L9f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaq.zzj():void");
    }

    private zzaq(String str, int i, int i2, boolean z, zzav zzavVar, zzfly<String> zzflyVar, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i;
        this.zzd = i2;
        this.zzb = z;
        this.zzf = zzavVar;
        this.zzg = new zzav();
    }
}
