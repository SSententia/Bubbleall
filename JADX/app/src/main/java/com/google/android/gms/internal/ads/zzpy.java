package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpy {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzpu zza(String str) throws IOException {
        long j;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!zzamr.zzb(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw zzaha.zzb("Couldn't find xmp metadata", null);
            }
            zzfoj<zzpt> zzfojVarZzi = zzfoj.zzi();
            long j2 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (zzamr.zzb(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String strZzc = zzamr.zzc(xmlPullParserNewPullParser, strArr[i2]);
                        if (strZzc != null) {
                            if (Integer.parseInt(strZzc) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    String strZzc2 = zzamr.zzc(xmlPullParserNewPullParser, strArr2[i3]);
                                    if (strZzc2 != null) {
                                        j = Long.parseLong(strZzc2);
                                        if (j != -1) {
                                            break;
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                break;
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i >= 2) {
                                    zzfojVarZzi = zzfoj.zzi();
                                    break;
                                }
                                String strZzc3 = zzamr.zzc(xmlPullParserNewPullParser, strArr3[i]);
                                if (strZzc3 != null) {
                                    zzfojVarZzi = zzfoj.zzk(new zzpt("image/jpeg", "Primary", 0L, 0L), new zzpt("video/mp4", "MotionPhoto", Long.parseLong(strZzc3), 0L));
                                    break;
                                }
                                i++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (zzamr.zzb(xmlPullParserNewPullParser, "Container:Directory")) {
                    zzfojVarZzi = zzb(xmlPullParserNewPullParser, "Container", "Item");
                } else if (zzamr.zzb(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    zzfojVarZzi = zzb(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzamr.zza(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzfojVarZzi.isEmpty()) {
                return null;
            }
            return new zzpu(j2, zzfojVarZzi);
        } catch (zzaha | NumberFormatException | XmlPullParserException unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfoj<zzpt> zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfog zzfogVarZzu = zzfoj.zzu();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (zzamr.zzb(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strZzc = zzamr.zzc(xmlPullParser, strConcat3);
                String strZzc2 = zzamr.zzc(xmlPullParser, strConcat4);
                String strZzc3 = zzamr.zzc(xmlPullParser, strConcat5);
                String strZzc4 = zzamr.zzc(xmlPullParser, strConcat6);
                if (strZzc == null || strZzc2 == null) {
                    return zzfoj.zzi();
                }
                zzfogVarZzu.zze(new zzpt(strZzc, strZzc2, strZzc3 != null ? Long.parseLong(strZzc3) : 0L, strZzc4 != null ? Long.parseLong(strZzc4) : 0L));
            }
        } while (!zzamr.zza(xmlPullParser, strConcat2));
        return zzfogVarZzu.zzf();
    }
}
