package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznq implements zzoa {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    private static final Constructor<? extends zznu> zzc;

    static {
        Constructor<? extends zznu> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zznu.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        zzc = constructor;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x017e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0151  */
    @Override // com.google.android.gms.internal.ads.zzoa
    public final synchronized zznu[] zza(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int i;
        arrayList = new ArrayList(14);
        List<String> list = map.get("Content-Type");
        String str = null;
        if (list != null && !list.isEmpty()) {
            str = list.get(0);
        }
        int i2 = 10;
        if (str != null) {
            switch (zzalt.zzg(str)) {
                case "audio/ac3":
                case "audio/eac3":
                case "audio/eac3-joc":
                    i = 0;
                    break;
                case "audio/ac4":
                    i = 1;
                    break;
                case "audio/amr":
                case "audio/3gpp":
                case "audio/amr-wb":
                    i = 3;
                    break;
                case "audio/flac":
                    i = 4;
                    break;
                case "video/x-flv":
                    i = 5;
                    break;
                case "video/x-matroska":
                case "audio/x-matroska":
                case "video/webm":
                case "audio/webm":
                case "application/webm":
                    i = 6;
                    break;
                case "audio/mpeg":
                    i = 7;
                    break;
                case "video/mp4":
                case "audio/mp4":
                case "application/mp4":
                    i = 8;
                    break;
                case "audio/ogg":
                    i = 9;
                    break;
                case "video/mp2p":
                    i = 10;
                    break;
                case "video/mp2t":
                    i = 11;
                    break;
                case "audio/wav":
                    i = 12;
                    break;
                case "text/vtt":
                    i = 13;
                    break;
                case "image/jpeg":
                    i = 14;
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            zzb(i, arrayList);
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            i2 = -1;
        } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            i2 = 0;
        } else if (lastPathSegment.endsWith(".ac4")) {
            i2 = 1;
        } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            i2 = 2;
        } else if (lastPathSegment.endsWith(".amr")) {
            i2 = 3;
        } else if (lastPathSegment.endsWith(".flac")) {
            i2 = 4;
        } else if (lastPathSegment.endsWith(".flv")) {
            i2 = 5;
        } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            i2 = 6;
        } else if (lastPathSegment.endsWith(".mp3")) {
            i2 = 7;
        } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            i2 = 8;
        } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            i2 = 9;
        } else if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
            if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                i2 = 11;
            } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                i2 = 12;
            } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                i2 = 13;
            } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                i2 = 14;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1 && i2 != i) {
            zzb(i2, arrayList);
        }
        int[] iArr = zza;
        for (int i3 = 0; i3 < 14; i3++) {
            int i4 = iArr[i3];
            if (i4 != i && i4 != i2) {
                zzb(i4, arrayList);
            }
        }
        return (zznu[]) arrayList.toArray(new zznu[arrayList.size()]);
    }

    private static final void zzb(int i, List<zznu> list) {
        switch (i) {
            case 0:
                list.add(new zzsq());
                return;
            case 1:
                list.add(new zzst());
                return;
            case 2:
                list.add(new zzsw(0));
                return;
            case 3:
                list.add(new zzpe(0));
                return;
            case 4:
                Constructor<? extends zznu> constructor = zzc;
                if (constructor == null) {
                    list.add(new zzpk(0));
                    return;
                }
                try {
                    list.add(constructor.newInstance(0));
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                }
            case 5:
                list.add(new zzpn());
                return;
            case 6:
                list.add(new zzqi(0));
                return;
            case 7:
                list.add(new zzqq(0));
                return;
            case 8:
                list.add(new zzrk(0, null));
                list.add(new zzrp(0));
                return;
            case 9:
                list.add(new zzse());
                return;
            case 10:
                list.add(new zztz());
                return;
            case 11:
                list.add(new zzuj(1, 0, 112800));
                return;
            case 12:
                list.add(new zzuv());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new zzps());
                return;
        }
    }
}
