package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcju implements zzaui {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzc = new AtomicReference<>();
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzauh zzh;
    private final zzauo<? super zzcju> zzi;
    private zzaub zzj;
    private HttpURLConnection zzk;
    private InputStream zzl;
    private boolean zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final SSLSocketFactory zzd = new zzcjt(this);
    private final Set<Socket> zzs = new HashSet();

    zzcju(String str, zzauo<? super zzcju> zzauoVar, int i, int i2, int i3) {
        zzaup.zzf(str);
        this.zzg = str;
        this.zzi = zzauoVar;
        this.zzh = new zzauh();
        this.zze = i;
        this.zzf = i2;
        this.zzr = i3;
    }

    private final void zzi() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Unexpected error while disconnecting", e);
            }
            this.zzk = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0100  */
    @Override // com.google.android.gms.internal.ads.zzatz
    public final long zza(zzaub zzaubVar) throws zzauf {
        long j;
        long jMax;
        this.zzj = zzaubVar;
        long j2 = 0;
        this.zzq = 0L;
        this.zzp = 0L;
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
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzd);
                }
                httpURLConnection.setConnectTimeout(this.zze);
                httpURLConnection.setReadTimeout(this.zzf);
                for (Map.Entry<String, String> entry : this.zzh.zza().entrySet()) {
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
                httpURLConnection.setRequestProperty("User-Agent", this.zzg);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    this.zzk = httpURLConnection;
                    try {
                        int responseCode2 = httpURLConnection.getResponseCode();
                        if (responseCode2 < 200 || responseCode2 > 299) {
                            Map<String, List<String>> headerFields = this.zzk.getHeaderFields();
                            zzi();
                            zzaug zzaugVar = new zzaug(responseCode2, headerFields, zzaubVar);
                            if (responseCode2 != 416) {
                                throw zzaugVar;
                            }
                            zzaugVar.initCause(new zzaua(0));
                            throw zzaugVar;
                        }
                        if (responseCode2 == 200) {
                            j = zzaubVar.zzc;
                            if (j == 0) {
                                j = 0;
                            }
                        } else {
                            j = 0;
                        }
                        this.zzn = j;
                        long j5 = zzaubVar.zzd;
                        if (j5 != -1) {
                            this.zzo = j5;
                        } else {
                            HttpURLConnection httpURLConnection2 = this.zzk;
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
                                    com.google.android.gms.ads.internal.util.zze.zzf(sb4.toString());
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
                                            com.google.android.gms.ads.internal.util.zze.zzi(sb5.toString());
                                            jMax = Math.max(jMax, j6);
                                        }
                                    } catch (NumberFormatException unused2) {
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(headerField2).length() + 27);
                                        sb6.append("Unexpected Content-Range [");
                                        sb6.append(headerField2);
                                        sb6.append("]");
                                        com.google.android.gms.ads.internal.util.zze.zzf(sb6.toString());
                                    }
                                }
                            }
                            this.zzo = jMax != -1 ? jMax - this.zzn : -1L;
                        }
                        try {
                            this.zzl = this.zzk.getInputStream();
                            this.zzm = true;
                            zzauo<? super zzcju> zzauoVar = this.zzi;
                            if (zzauoVar != null) {
                                ((zzcki) zzauoVar).zzj(this, zzaubVar);
                            }
                            return this.zzo;
                        } catch (IOException e) {
                            zzi();
                            throw new zzauf(e, zzaubVar, 1);
                        }
                    } catch (IOException e2) {
                        zzi();
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
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[Catch: Exception -> 0x0069, all -> 0x008a, TRY_LEAVE, TryCatch #0 {Exception -> 0x0069, blocks: (B:15:0x0021, B:17:0x0029, B:23:0x0038, B:25:0x0048, B:27:0x0050), top: B:45:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    @Override // com.google.android.gms.internal.ads.zzatz
    public final void zzd() throws zzauf {
        String name;
        try {
            if (this.zzl != null) {
                HttpURLConnection httpURLConnection = this.zzk;
                long j = this.zzo;
                if (j != -1) {
                    j -= this.zzq;
                }
                if (zzave.zza == 19 || zzave.zza == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() != -1) {
                                name = inputStream.getClass().getName();
                                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream, new Object[0]);
                                }
                            }
                            this.zzl = null;
                            zzi();
                            if (this.zzm) {
                                this.zzm = false;
                            }
                            this.zzs.clear();
                            throw th;
                        }
                        if (j > PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                            name = inputStream.getClass().getName();
                            if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream")) {
                                Method declaredMethod2 = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(inputStream, new Object[0]);
                            } else {
                                Method declaredMethod3 = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod3.setAccessible(true);
                                declaredMethod3.invoke(inputStream, new Object[0]);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.zzl.close();
                } catch (IOException e) {
                    throw new zzauf(e, this.zzj, 3);
                }
            }
            this.zzl = null;
            zzi();
            if (this.zzm) {
                this.zzm = false;
            }
            this.zzs.clear();
        } catch (Throwable th) {
            this.zzl = null;
            zzi();
            if (this.zzm) {
                this.zzm = false;
            }
            this.zzs.clear();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final Map<String, List<String>> zze() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzg(int i) {
        this.zzr = i;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: IOException -> 0x009a, TryCatch #0 {IOException -> 0x009a, blocks: (B:2:0x0000, B:23:0x005c, B:25:0x0064, B:28:0x006f, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0089, B:36:0x008a, B:38:0x0094, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0048, B:17:0x004d, B:18:0x004e, B:19:0x0053, B:20:0x0054), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084 A[Catch: IOException -> 0x009a, TryCatch #0 {IOException -> 0x009a, blocks: (B:2:0x0000, B:23:0x005c, B:25:0x0064, B:28:0x006f, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0089, B:36:0x008a, B:38:0x0094, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0048, B:17:0x004d, B:18:0x004e, B:19:0x0053, B:20:0x0054), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008a A[Catch: IOException -> 0x009a, TryCatch #0 {IOException -> 0x009a, blocks: (B:2:0x0000, B:23:0x005c, B:25:0x0064, B:28:0x006f, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0089, B:36:0x008a, B:38:0x0094, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0048, B:17:0x004d, B:18:0x004e, B:19:0x0053, B:20:0x0054), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: IOException -> 0x009a, TRY_LEAVE, TryCatch #0 {IOException -> 0x009a, blocks: (B:2:0x0000, B:23:0x005c, B:25:0x0064, B:28:0x006f, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0089, B:36:0x008a, B:38:0x0094, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0048, B:17:0x004d, B:18:0x004e, B:19:0x0053, B:20:0x0054), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzatz
    public final int zzb(byte[] bArr, int i, int i2) throws zzauf {
        int i3;
        zzauo<? super zzcju> zzauoVar;
        try {
            if (this.zzp != this.zzn) {
                byte[] andSet = zzc.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.zzp;
                    long j2 = this.zzn;
                    if (j == j2) {
                        zzc.set(andSet);
                        break;
                    }
                    int i4 = this.zzl.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.zzp += (long) i4;
                    zzauo<? super zzcju> zzauoVar2 = this.zzi;
                    if (zzauoVar2 != null) {
                        ((zzcki) zzauoVar2).zzS(this, i4);
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzo;
            if (j3 != -1) {
                long j4 = j3 - this.zzq;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                    i3 = this.zzl.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.zzq += (long) i3;
                        zzauoVar = this.zzi;
                        if (zzauoVar != null) {
                            return i3;
                        }
                        ((zzcki) zzauoVar).zzS(this, i3);
                        return i3;
                    }
                    if (this.zzo == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i3 = this.zzl.read(bArr, i, i2);
                if (i3 == -1) {
                    this.zzq += (long) i3;
                    zzauoVar = this.zzi;
                    if (zzauoVar != null) {
                        return i3;
                    }
                    ((zzcki) zzauoVar).zzS(this, i3);
                    return i3;
                }
                if (this.zzo == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e) {
            throw new zzauf(e, this.zzj, 2);
        }
    }
}
