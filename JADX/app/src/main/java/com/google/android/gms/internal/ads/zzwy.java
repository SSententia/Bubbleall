package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwy implements zzvm {
    private final zzwx zzc;
    private final Map<String, zzwv> zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzwy(zzwx zzwxVar, int i) {
        this.zzc = zzwxVar;
    }

    static byte[] zzg(zzww zzwwVar, long j) throws IOException {
        long jZza = zzwwVar.zza();
        if (j >= 0 && j <= jZza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzwwVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(jZza);
        throw new IOException(sb.toString());
    }

    static void zzh(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    static void zzj(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static long zzk(InputStream inputStream) throws IOException {
        return (((long) zzp(inputStream)) & 255) | ((((long) zzp(inputStream)) & 255) << 8) | ((((long) zzp(inputStream)) & 255) << 16) | ((((long) zzp(inputStream)) & 255) << 24) | ((((long) zzp(inputStream)) & 255) << 32) | ((((long) zzp(inputStream)) & 255) << 40) | ((((long) zzp(inputStream)) & 255) << 48) | ((255 & ((long) zzp(inputStream))) << 56);
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(Key.STRING_CHARSET_NAME);
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static String zzm(zzww zzwwVar) throws IOException {
        return new String(zzg(zzwwVar, zzk(zzwwVar)), Key.STRING_CHARSET_NAME);
    }

    private final void zzn(String str, zzwv zzwvVar) {
        if (this.zza.containsKey(str)) {
            this.zzb += zzwvVar.zza - this.zza.get(str).zza;
        } else {
            this.zzb += zzwvVar.zza;
        }
        this.zza.put(str, zzwvVar);
    }

    private final void zzo(String str) {
        zzwv zzwvVarRemove = this.zza.remove(str);
        if (zzwvVarRemove != null) {
            this.zzb -= zzwvVarRemove.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        String strValueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String strValueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final synchronized zzvl zza(String str) {
        zzwv zzwvVar = this.zza.get(str);
        if (zzwvVar == null) {
            return null;
        }
        File fileZzf = zzf(str);
        try {
            zzww zzwwVar = new zzww(new BufferedInputStream(new FileInputStream(fileZzf)), fileZzf.length());
            try {
                zzwv zzwvVarZza = zzwv.zza(zzwwVar);
                if (!TextUtils.equals(str, zzwvVarZza.zzb)) {
                    zzwo.zzb("%s: key=%s, found=%s", fileZzf.getAbsolutePath(), str, zzwvVarZza.zzb);
                    zzo(str);
                    zzwwVar.close();
                    return null;
                }
                byte[] bArrZzg = zzg(zzwwVar, zzwwVar.zza());
                zzvl zzvlVar = new zzvl();
                zzvlVar.zza = bArrZzg;
                zzvlVar.zzb = zzwvVar.zzc;
                zzvlVar.zzc = zzwvVar.zzd;
                zzvlVar.zzd = zzwvVar.zze;
                zzvlVar.zze = zzwvVar.zzf;
                zzvlVar.zzf = zzwvVar.zzg;
                List<zzvu> list = zzwvVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzvu zzvuVar : list) {
                    treeMap.put(zzvuVar.zza(), zzvuVar.zzb());
                }
                zzvlVar.zzg = treeMap;
                zzvlVar.zzh = Collections.unmodifiableList(zzwvVar.zzh);
                zzwwVar.close();
                return zzvlVar;
            } catch (Throwable th) {
                zzwwVar.close();
                throw th;
            }
        } catch (IOException e) {
            zzwo.zzb("%s: %s", fileZzf.getAbsolutePath(), e.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final synchronized void zzb(String str, zzvl zzvlVar) {
        long j = this.zzb;
        int length = zzvlVar.zza.length;
        int i = this.zzd;
        if (j + ((long) length) <= i || length <= i * 0.9f) {
            File fileZzf = zzf(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzf));
                zzwv zzwvVar = new zzwv(str, zzvlVar);
                try {
                    zzh(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzwvVar.zzb);
                    String str2 = zzwvVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzj(bufferedOutputStream, zzwvVar.zzd);
                    zzj(bufferedOutputStream, zzwvVar.zze);
                    zzj(bufferedOutputStream, zzwvVar.zzf);
                    zzj(bufferedOutputStream, zzwvVar.zzg);
                    List<zzvu> list = zzwvVar.zzh;
                    if (list != null) {
                        zzh(bufferedOutputStream, list.size());
                        for (zzvu zzvuVar : list) {
                            zzl(bufferedOutputStream, zzvuVar.zza());
                            zzl(bufferedOutputStream, zzvuVar.zzb());
                        }
                    } else {
                        zzh(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzvlVar.zza);
                    bufferedOutputStream.close();
                    zzwvVar.zza = fileZzf.length();
                    zzn(str, zzwvVar);
                    if (this.zzb >= this.zzd) {
                        if (zzwo.zzb) {
                            zzwo.zza("Pruning old cache entries.", new Object[0]);
                        }
                        long j2 = this.zzb;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator<Map.Entry<String, zzwv>> it = this.zza.entrySet().iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            zzwv value = it.next().getValue();
                            if (zzf(value.zzb).delete()) {
                                this.zzb -= value.zza;
                            } else {
                                String str3 = value.zzb;
                                zzwo.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i2++;
                            if (this.zzb < this.zzd * 0.9f) {
                                break;
                            }
                        }
                        if (zzwo.zzb) {
                            zzwo.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.zzb - j2), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } catch (IOException e) {
                    zzwo.zzb("%s", e.toString());
                    bufferedOutputStream.close();
                    zzwo.zzb("Failed to write header for %s", fileZzf.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!fileZzf.delete()) {
                    zzwo.zzb("Could not clean up file %s", fileZzf.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzwo.zzb("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzc();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final synchronized void zzc() {
        File fileZza = this.zzc.zza();
        if (!fileZza.exists()) {
            if (fileZza.mkdirs()) {
                return;
            }
            zzwo.zzc("Unable to create cache dir %s", fileZza.getAbsolutePath());
            return;
        }
        File[] fileArrListFiles = fileZza.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                long length = file.length();
                zzww zzwwVar = new zzww(new BufferedInputStream(new FileInputStream(file)), length);
                try {
                    zzwv zzwvVarZza = zzwv.zza(zzwwVar);
                    zzwvVarZza.zza = length;
                    zzn(zzwvVarZza.zzb, zzwvVarZza);
                    zzwwVar.close();
                } catch (Throwable th) {
                    zzwwVar.close();
                    throw th;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final synchronized void zzd(String str, boolean z) {
        zzvl zzvlVarZza = zza(str);
        if (zzvlVarZza != null) {
            zzvlVarZza.zzf = 0L;
            zzvlVarZza.zze = 0L;
            zzb(str, zzvlVarZza);
        }
    }

    public final synchronized void zze(String str) {
        boolean zDelete = zzf(str).delete();
        zzo(str);
        if (zDelete) {
            return;
        }
        zzwo.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzwy(File file, int i) {
        this.zzc = new zzwu(this, file);
    }
}
