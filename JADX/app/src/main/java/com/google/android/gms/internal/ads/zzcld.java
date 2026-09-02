package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcld extends zzcla {
    public static final /* synthetic */ int zzd = 0;
    private static final Set<String> zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcld(zzcjb zzcjbVar) {
        super(zzcjbVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            com.google.android.gms.ads.internal.util.zze.zzi(strValueOf.length() != 0 ? "Could not create preload cache directory at ".concat(strValueOf) : new String("Could not create preload cache directory at "));
            this.zzg = null;
        } else {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
            com.google.android.gms.ads.internal.util.zze.zzi(strValueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(strValueOf2) : new String("Could not set cache file permissions at "));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(this.zzg, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzm() {
        this.zzh = true;
    }

    /* JADX WARN: Code duplicated, block: B:194:0x0450  */
    /* JADX WARN: Code duplicated, block: B:198:0x0460  */
    /* JADX WARN: Code duplicated, block: B:199:0x0484  */
    /* JADX WARN: Code duplicated, block: B:202:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:206:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c8  */
    @Override // com.google.android.gms.internal.ads.zzcla
    public final boolean zzd(final String str) {
        int i;
        String str2;
        String str3;
        String strValueOf;
        String str4;
        FileOutputStream fileOutputStream;
        String str5;
        String str6;
        int responseCode;
        boolean zDelete;
        FileOutputStream fileOutputStream2 = null;
        if (this.zzg == null) {
            zzr(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file = this.zzg;
            if (file == null) {
                i = 0;
            } else {
                i = 0;
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".done")) {
                        i++;
                    }
                }
            }
            if (i <= ((Integer) zzbet.zzc().zzc(zzbjl.zzp)).intValue()) {
                File file3 = new File(this.zzg, zzcgm.zzd(str));
                File fileZza = zza(file3);
                if (file3.isFile() && fileZza.isFile()) {
                    int length = (int) file3.length();
                    String strValueOf2 = String.valueOf(str);
                    com.google.android.gms.ads.internal.util.zze.zzd(strValueOf2.length() != 0 ? "Stream cache hit at ".concat(strValueOf2) : new String("Stream cache hit at "));
                    zzp(str, file3.getAbsolutePath(), length);
                    return true;
                }
                String strValueOf3 = String.valueOf(this.zzg.getAbsolutePath());
                String strValueOf4 = String.valueOf(str);
                String strConcat = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Set<String> set = zze;
                synchronized (set) {
                    if (set.contains(strConcat)) {
                        String strValueOf5 = String.valueOf(str);
                        com.google.android.gms.ads.internal.util.zze.zzi(strValueOf5.length() != 0 ? "Stream cache already in progress at ".concat(strValueOf5) : new String("Stream cache already in progress at "));
                        zzr(str, file3.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(strConcat);
                    String str7 = "error";
                    try {
                        HttpURLConnection httpURLConnectionZzb = zzfkv.zza().zzb(new zzfku(str) { // from class: com.google.android.gms.internal.ads.zzclc
                            private final String zza;

                            {
                                this.zza = str;
                            }

                            @Override // com.google.android.gms.internal.ads.zzfku
                            public final URLConnection zza() throws IOException {
                                String str8 = this.zza;
                                int i2 = zzcld.zzd;
                                com.google.android.gms.ads.internal.zzt.zzo();
                                int iIntValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzu)).intValue();
                                URL url = new URL(str8);
                                int i3 = 0;
                                while (true) {
                                    i3++;
                                    if (i3 > 20) {
                                        throw new IOException("Too many redirects (20)");
                                    }
                                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                                    uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                    uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                        throw new IOException("Invalid protocol.");
                                    }
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                    zzcgs zzcgsVar = new zzcgs(null);
                                    zzcgsVar.zza(httpURLConnection, null);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    int responseCode2 = httpURLConnection.getResponseCode();
                                    zzcgsVar.zzc(httpURLConnection, responseCode2);
                                    if (responseCode2 / 100 != 3) {
                                        return httpURLConnection;
                                    }
                                    String headerField = httpURLConnection.getHeaderField("Location");
                                    if (headerField == null) {
                                        throw new IOException("Missing Location header in redirect");
                                    }
                                    URL url2 = new URL(url, headerField);
                                    String protocol = url2.getProtocol();
                                    if (protocol == null) {
                                        throw new IOException("Protocol is null");
                                    }
                                    if (!protocol.equals("http") && !protocol.equals("https")) {
                                        throw new IOException(protocol.length() != 0 ? "Unsupported scheme: ".concat(protocol) : new String("Unsupported scheme: "));
                                    }
                                    com.google.android.gms.ads.internal.util.zze.zzd(headerField.length() != 0 ? "Redirecting to ".concat(headerField) : new String("Redirecting to "));
                                    httpURLConnection.disconnect();
                                    url = url2;
                                }
                            }
                        }, 265, -1);
                        if (!(httpURLConnectionZzb instanceof HttpURLConnection) || (responseCode = httpURLConnectionZzb.getResponseCode()) < 400) {
                            int contentLength = httpURLConnectionZzb.getContentLength();
                            if (contentLength < 0) {
                                String strValueOf6 = String.valueOf(str);
                                com.google.android.gms.ads.internal.util.zze.zzi(strValueOf6.length() != 0 ? "Stream cache aborted, missing content-length header at ".concat(strValueOf6) : new String("Stream cache aborted, missing content-length header at "));
                                zzr(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                                set.remove(strConcat);
                                return false;
                            }
                            String str8 = zzf.format(contentLength);
                            int iIntValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzq)).intValue();
                            if (contentLength > iIntValue) {
                                StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 33 + String.valueOf(str).length());
                                sb.append("Content length ");
                                sb.append(str8);
                                sb.append(" exceeds limit at ");
                                sb.append(str);
                                com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
                                String strValueOf7 = String.valueOf(str8);
                                zzr(str, file3.getAbsolutePath(), "sizeExceeded", strValueOf7.length() != 0 ? "File too big for full file cache. Size: ".concat(strValueOf7) : new String("File too big for full file cache. Size: "));
                                set.remove(strConcat);
                                return false;
                            }
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 20 + String.valueOf(str).length());
                            sb2.append("Caching ");
                            sb2.append(str8);
                            sb2.append(" bytes from ");
                            sb2.append(str);
                            com.google.android.gms.ads.internal.util.zze.zzd(sb2.toString());
                            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionZzb.getInputStream());
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                            try {
                                FileChannel channel = fileOutputStream3.getChannel();
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                Clock clockZzj = com.google.android.gms.ads.internal.zzt.zzj();
                                long jCurrentTimeMillis = clockZzj.currentTimeMillis();
                                com.google.android.gms.ads.internal.util.zzcc zzccVar = new com.google.android.gms.ads.internal.util.zzcc(((Long) zzbet.zzc().zzc(zzbjl.zzt)).longValue());
                                long jLongValue = ((Long) zzbet.zzc().zzc(zzbjl.zzs)).longValue();
                                int i2 = 0;
                                while (true) {
                                    int i3 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                    if (i3 >= 0) {
                                        i2 += i3;
                                        if (i2 > iIntValue) {
                                            str7 = "sizeExceeded";
                                            try {
                                                String strValueOf8 = String.valueOf(Integer.toString(i2));
                                                String strConcat2 = strValueOf8.length() != 0 ? "File too big for full file cache. Size: ".concat(strValueOf8) : new String("File too big for full file cache. Size: ");
                                                try {
                                                    throw new IOException("stream cache file size limit exceeded");
                                                } catch (IOException | RuntimeException e) {
                                                    e = e;
                                                    str3 = strConcat2;
                                                    str2 = strConcat;
                                                    fileOutputStream2 = fileOutputStream3;
                                                }
                                            } catch (IOException | RuntimeException e2) {
                                                e = e2;
                                                fileOutputStream2 = fileOutputStream3;
                                                str2 = strConcat;
                                                str3 = null;
                                            }
                                        } else {
                                            try {
                                                byteBufferAllocate.flip();
                                                while (channel.write(byteBufferAllocate) > 0) {
                                                }
                                                byteBufferAllocate.clear();
                                                try {
                                                    if (clockZzj.currentTimeMillis() - jCurrentTimeMillis <= 1000 * jLongValue) {
                                                        ByteBuffer byteBuffer = byteBufferAllocate;
                                                        if (this.zzh) {
                                                            throw new IOException("abort requested");
                                                        }
                                                        if (zzccVar.zza()) {
                                                            str5 = str7;
                                                            try {
                                                                str6 = strConcat;
                                                                fileOutputStream = fileOutputStream3;
                                                                try {
                                                                    try {
                                                                        zzcgm.zza.post(new zzcku(this, str, file3.getAbsolutePath(), i2, contentLength, false));
                                                                    } catch (RuntimeException e3) {
                                                                        e = e3;
                                                                    }
                                                                } catch (IOException e4) {
                                                                    e = e4;
                                                                }
                                                            } catch (IOException e5) {
                                                                e = e5;
                                                                fileOutputStream = fileOutputStream3;
                                                                str6 = strConcat;
                                                                str2 = str6;
                                                                str7 = str5;
                                                                fileOutputStream2 = fileOutputStream;
                                                                str3 = null;
                                                                if (e instanceof RuntimeException) {
                                                                    com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "VideoStreamFullFileCache.preload");
                                                                }
                                                                fileOutputStream2.close();
                                                                if (this.zzh) {
                                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 26);
                                                                    sb3.append("Preload aborted for URL \"");
                                                                    sb3.append(str);
                                                                    sb3.append("\"");
                                                                    com.google.android.gms.ads.internal.util.zze.zzh(sb3.toString());
                                                                } else {
                                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 25);
                                                                    sb4.append("Preload failed for URL \"");
                                                                    sb4.append(str);
                                                                    sb4.append("\"");
                                                                    com.google.android.gms.ads.internal.util.zze.zzj(sb4.toString(), e);
                                                                }
                                                                if (file3.exists()) {
                                                                    strValueOf = String.valueOf(file3.getAbsolutePath());
                                                                    if (strValueOf.length() != 0) {
                                                                        str4 = "Could not delete partial cache file at ".concat(strValueOf);
                                                                    } else {
                                                                        str4 = new String("Could not delete partial cache file at ");
                                                                    }
                                                                    com.google.android.gms.ads.internal.util.zze.zzi(str4);
                                                                }
                                                                zzr(str, file3.getAbsolutePath(), str7, str3);
                                                                zze.remove(str2);
                                                                return false;
                                                            } catch (RuntimeException e6) {
                                                                e = e6;
                                                                fileOutputStream = fileOutputStream3;
                                                                str6 = strConcat;
                                                                str2 = str6;
                                                                str7 = str5;
                                                                fileOutputStream2 = fileOutputStream;
                                                                str3 = null;
                                                                if (e instanceof RuntimeException) {
                                                                    com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "VideoStreamFullFileCache.preload");
                                                                }
                                                                fileOutputStream2.close();
                                                                if (this.zzh) {
                                                                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 26);
                                                                    sb5.append("Preload aborted for URL \"");
                                                                    sb5.append(str);
                                                                    sb5.append("\"");
                                                                    com.google.android.gms.ads.internal.util.zze.zzh(sb5.toString());
                                                                } else {
                                                                    StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 25);
                                                                    sb6.append("Preload failed for URL \"");
                                                                    sb6.append(str);
                                                                    sb6.append("\"");
                                                                    com.google.android.gms.ads.internal.util.zze.zzj(sb6.toString(), e);
                                                                }
                                                                if (file3.exists()) {
                                                                    strValueOf = String.valueOf(file3.getAbsolutePath());
                                                                    if (strValueOf.length() != 0) {
                                                                        str4 = "Could not delete partial cache file at ".concat(strValueOf);
                                                                    } else {
                                                                        str4 = new String("Could not delete partial cache file at ");
                                                                    }
                                                                    com.google.android.gms.ads.internal.util.zze.zzi(str4);
                                                                }
                                                                zzr(str, file3.getAbsolutePath(), str7, str3);
                                                                zze.remove(str2);
                                                                return false;
                                                            }
                                                        } else {
                                                            fileOutputStream = fileOutputStream3;
                                                            str6 = strConcat;
                                                            str5 = str7;
                                                        }
                                                        byteBufferAllocate = byteBuffer;
                                                        readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                        str7 = str5;
                                                        zzccVar = zzccVar;
                                                        strConcat = str6;
                                                        channel = channel;
                                                        fileOutputStream3 = fileOutputStream;
                                                        iIntValue = iIntValue;
                                                        contentLength = contentLength;
                                                    } else {
                                                        FileOutputStream fileOutputStream4 = fileOutputStream3;
                                                        String str9 = strConcat;
                                                        str7 = "downloadTimeout";
                                                        String string = Long.toString(jLongValue);
                                                        StringBuilder sb7 = new StringBuilder(String.valueOf(string).length() + 29);
                                                        sb7.append("Timeout exceeded. Limit: ");
                                                        sb7.append(string);
                                                        sb7.append(" sec");
                                                        String string2 = sb7.toString();
                                                        try {
                                                            throw new IOException("stream cache time limit exceeded");
                                                        } catch (IOException | RuntimeException e7) {
                                                            e = e7;
                                                            str3 = string2;
                                                            str2 = str9;
                                                            fileOutputStream2 = fileOutputStream4;
                                                        }
                                                    }
                                                } catch (IOException | RuntimeException e8) {
                                                    e = e8;
                                                    str2 = str6;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str3 = null;
                                                }
                                            } catch (IOException | RuntimeException e9) {
                                                e = e9;
                                                fileOutputStream = fileOutputStream3;
                                                str6 = strConcat;
                                                str5 = str7;
                                            }
                                            str2 = str6;
                                        }
                                    } else {
                                        fileOutputStream = fileOutputStream3;
                                        str6 = strConcat;
                                        str5 = str7;
                                        fileOutputStream.close();
                                        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
                                            String str10 = zzf.format(i2);
                                            StringBuilder sb8 = new StringBuilder(String.valueOf(str10).length() + 22 + String.valueOf(str).length());
                                            sb8.append("Preloaded ");
                                            sb8.append(str10);
                                            sb8.append(" bytes from ");
                                            sb8.append(str);
                                            com.google.android.gms.ads.internal.util.zze.zzd(sb8.toString());
                                        }
                                        file3.setReadable(true, false);
                                        if (fileZza.isFile()) {
                                            fileZza.setLastModified(System.currentTimeMillis());
                                        } else {
                                            try {
                                                fileZza.createNewFile();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        zzp(str, file3.getAbsolutePath(), i2);
                                        str2 = str6;
                                        try {
                                            zze.remove(str2);
                                            return true;
                                        } catch (IOException e10) {
                                            e = e10;
                                        } catch (RuntimeException e11) {
                                            e = e11;
                                        }
                                    }
                                    str7 = str5;
                                    fileOutputStream2 = fileOutputStream;
                                    str3 = null;
                                }
                            } catch (IOException | RuntimeException e12) {
                                e = e12;
                                fileOutputStream = fileOutputStream3;
                                str2 = strConcat;
                                str5 = str7;
                            }
                        } else {
                            str7 = "badUrl";
                            try {
                                String strValueOf9 = String.valueOf(Integer.toString(responseCode));
                                String strConcat3 = strValueOf9.length() != 0 ? "HTTP request failed. Code: ".concat(strValueOf9) : new String("HTTP request failed. Code: ");
                                try {
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 32);
                                    sb9.append("HTTP status code ");
                                    sb9.append(responseCode);
                                    sb9.append(" at ");
                                    sb9.append(str);
                                    throw new IOException(sb9.toString());
                                } catch (IOException | RuntimeException e13) {
                                    e = e13;
                                    str3 = strConcat3;
                                    str2 = strConcat;
                                    if (e instanceof RuntimeException) {
                                        com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "VideoStreamFullFileCache.preload");
                                    }
                                    fileOutputStream2.close();
                                    if (this.zzh) {
                                        StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 26);
                                        sb10.append("Preload aborted for URL \"");
                                        sb10.append(str);
                                        sb10.append("\"");
                                        com.google.android.gms.ads.internal.util.zze.zzh(sb10.toString());
                                    } else {
                                        StringBuilder sb11 = new StringBuilder(String.valueOf(str).length() + 25);
                                        sb11.append("Preload failed for URL \"");
                                        sb11.append(str);
                                        sb11.append("\"");
                                        com.google.android.gms.ads.internal.util.zze.zzj(sb11.toString(), e);
                                    }
                                    if (file3.exists()) {
                                        strValueOf = String.valueOf(file3.getAbsolutePath());
                                        if (strValueOf.length() != 0) {
                                            str4 = "Could not delete partial cache file at ".concat(strValueOf);
                                        } else {
                                            str4 = new String("Could not delete partial cache file at ");
                                        }
                                        com.google.android.gms.ads.internal.util.zze.zzi(str4);
                                    }
                                    zzr(str, file3.getAbsolutePath(), str7, str3);
                                    zze.remove(str2);
                                    return false;
                                }
                            } catch (IOException | RuntimeException e14) {
                                e = e14;
                                str3 = null;
                            }
                        }
                    } catch (IOException | RuntimeException e15) {
                        e = e15;
                        str2 = strConcat;
                        str7 = "error";
                        str3 = null;
                        fileOutputStream2 = null;
                    }
                    if (e instanceof RuntimeException) {
                        com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "VideoStreamFullFileCache.preload");
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException | NullPointerException unused2) {
                    }
                    if (this.zzh) {
                        StringBuilder sb12 = new StringBuilder(String.valueOf(str).length() + 26);
                        sb12.append("Preload aborted for URL \"");
                        sb12.append(str);
                        sb12.append("\"");
                        com.google.android.gms.ads.internal.util.zze.zzh(sb12.toString());
                    } else {
                        StringBuilder sb13 = new StringBuilder(String.valueOf(str).length() + 25);
                        sb13.append("Preload failed for URL \"");
                        sb13.append(str);
                        sb13.append("\"");
                        com.google.android.gms.ads.internal.util.zze.zzj(sb13.toString(), e);
                    }
                    if (file3.exists() && !file3.delete()) {
                        strValueOf = String.valueOf(file3.getAbsolutePath());
                        if (strValueOf.length() != 0) {
                            str4 = "Could not delete partial cache file at ".concat(strValueOf);
                        } else {
                            str4 = new String("Could not delete partial cache file at ");
                        }
                        com.google.android.gms.ads.internal.util.zze.zzi(str4);
                    }
                    zzr(str, file3.getAbsolutePath(), str7, str3);
                    zze.remove(str2);
                    return false;
                }
            }
            File file4 = this.zzg;
            if (file4 == null) {
                break;
            }
            long j = Long.MAX_VALUE;
            File file5 = null;
            for (File file6 : file4.listFiles()) {
                if (!file6.getName().endsWith(".done")) {
                    long jLastModified = file6.lastModified();
                    if (jLastModified < j) {
                        file5 = file6;
                        j = jLastModified;
                    }
                }
            }
            if (file5 == null) {
                break;
            }
            zDelete = file5.delete();
            File fileZza2 = zza(file5);
            if (fileZza2.isFile()) {
                zDelete &= fileZza2.delete();
            }
        } while (zDelete);
        com.google.android.gms.ads.internal.util.zze.zzi("Unable to expire stream cache");
        zzr(str, null, "expireFailed", null);
        return false;
    }
}
