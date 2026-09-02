package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlj extends zzag {
    private final Resources zza;
    private final String zzb;
    private Uri zzc;
    private AssetFileDescriptor zzd;
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzlj(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i, int i2) throws zzli {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzf;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzli(null, e, 2000);
            }
        }
        InputStream inputStream = this.zze;
        int i3 = zzamq.zza;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.zzf == -1) {
                return -1;
            }
            throw new zzli("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.zzf;
        if (j2 != -1) {
            this.zzf = j2 - ((long) i4);
        }
        zzd(i4);
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws zzli {
        int identifier;
        long size;
        Uri uri = zzanVar.zza;
        this.zzc = uri;
        if (TextUtils.equals("rawresource", uri.getScheme())) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                lastPathSegment.getClass();
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new zzli("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                String lastPathSegment2 = uri.getLastPathSegment();
                lastPathSegment2.getClass();
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uri.getLastPathSegment();
                    lastPathSegment3.getClass();
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new zzli("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            String strValueOf = String.valueOf(TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":"));
            String strValueOf2 = String.valueOf(path);
            identifier = this.zza.getIdentifier(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), "raw", this.zzb);
            if (identifier == 0) {
                throw new zzli("Resource not found.", null, 2005);
            }
        }
        zzb(zzanVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.zza.openRawResourceFd(identifier);
            this.zzd = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                String strValueOf3 = String.valueOf(uri);
                String.valueOf(strValueOf3).length();
                throw new zzli("Resource is compressed: ".concat(String.valueOf(strValueOf3)), null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.zze = fileInputStream;
            if (length != -1) {
                try {
                    if (zzanVar.zzf > length) {
                        throw new zzli(null, null, 2008);
                    }
                } catch (zzli e) {
                    throw e;
                } catch (IOException e2) {
                    throw new zzli(null, e2, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(zzanVar.zzf + startOffset) - startOffset;
            if (jSkip != zzanVar.zzf) {
                throw new zzli(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.zzf = -1L;
                    size = -1;
                } else {
                    size = channel.size() - channel.position();
                    this.zzf = size;
                    if (size < 0) {
                        throw new zzli(null, null, 2008);
                    }
                }
            } else {
                size = length - jSkip;
                this.zzf = size;
                if (size < 0) {
                    throw new zzak(2008);
                }
            }
            long jMin = zzanVar.zzg;
            if (jMin != -1) {
                if (size != -1) {
                    jMin = Math.min(size, jMin);
                }
                this.zzf = jMin;
            }
            this.zzg = true;
            zzc(zzanVar);
            long j = zzanVar.zzg;
            return j != -1 ? j : this.zzf;
        } catch (Resources.NotFoundException e3) {
            throw new zzli(null, e3, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        return this.zzc;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // com.google.android.gms.internal.ads.zzaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj() throws com.google.android.gms.internal.ads.zzli {
        /*
            r5 = this;
            r0 = 0
            r5.zzc = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.zze     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.zze = r0
            android.content.res.AssetFileDescriptor r3 = r5.zzd     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.zzd = r0
            boolean r0 = r5.zzg
            if (r0 == 0) goto L21
            r5.zzg = r2
            r5.zze()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzli r4 = new com.google.android.gms.internal.ads.zzli     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.zzd = r0
            boolean r0 = r5.zzg
            if (r0 == 0) goto L36
            r5.zzg = r2
            r5.zze()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzli r4 = new com.google.android.gms.internal.ads.zzli     // Catch: java.lang.Throwable -> L37
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.zze = r0
            android.content.res.AssetFileDescriptor r4 = r5.zzd     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.zzd = r0
            boolean r0 = r5.zzg
            if (r0 == 0) goto L54
            r5.zzg = r2
            r5.zze()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzli r4 = new com.google.android.gms.internal.ads.zzli     // Catch: java.lang.Throwable -> L55
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.zzd = r0
            boolean r0 = r5.zzg
            if (r0 != 0) goto L65
            goto L6a
        L65:
            r5.zzg = r2
            r5.zze()
        L6a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlj.zzj():void");
    }
}
