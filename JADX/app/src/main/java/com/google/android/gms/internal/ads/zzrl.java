package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzrl {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    public static zzaiu zza(zzamf zzamfVar) {
        String str;
        int iZzg = zzamfVar.zzg() + zzamfVar.zzv();
        int iZzv = zzamfVar.zzv();
        int i = (iZzv >> 24) & 255;
        zzaiu zzajqVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = iZzv & 16777215;
                if (i2 == 6516084) {
                    int iZzv2 = zzamfVar.zzv();
                    if (zzamfVar.zzv() == 1684108385) {
                        zzamfVar.zzk(8);
                        String strZzF = zzamfVar.zzF(iZzv2 - 16);
                        zzajqVar = new zzajq("und", strZzF, strZzF);
                    } else {
                        String strZzf = zzqx.zzf(iZzv);
                        Log.w("MetadataUtil", strZzf.length() != 0 ? "Failed to parse comment attribute: ".concat(strZzf) : new String("Failed to parse comment attribute: "));
                    }
                    zzamfVar.zzh(iZzg);
                    return zzajqVar;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    zzakf zzakfVarZzb = zzb(iZzv, "TIT2", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb;
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    zzakf zzakfVarZzb2 = zzb(iZzv, "TCOM", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb2;
                }
                if (i2 == 6578553) {
                    zzakf zzakfVarZzb3 = zzb(iZzv, "TDRC", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb3;
                }
                if (i2 == 4280916) {
                    zzakf zzakfVarZzb4 = zzb(iZzv, "TPE1", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb4;
                }
                if (i2 == 7630703) {
                    zzakf zzakfVarZzb5 = zzb(iZzv, "TSSE", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb5;
                }
                if (i2 == 6384738) {
                    zzakf zzakfVarZzb6 = zzb(iZzv, "TALB", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb6;
                }
                if (i2 == 7108978) {
                    zzakf zzakfVarZzb7 = zzb(iZzv, "USLT", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb7;
                }
                if (i2 == 6776174) {
                    zzakf zzakfVarZzb8 = zzb(iZzv, "TCON", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb8;
                }
                if (i2 == 6779504) {
                    zzakf zzakfVarZzb9 = zzb(iZzv, "TIT1", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb9;
                }
            } else {
                if (iZzv == 1735291493) {
                    int iZze = zze(zzamfVar);
                    String str2 = (iZze <= 0 || iZze > 192) ? null : zza[iZze - 1];
                    if (str2 != null) {
                        zzajqVar = new zzakf("TCON", null, str2);
                    } else {
                        Log.w("MetadataUtil", "Failed to parse standard genre code");
                    }
                    zzamfVar.zzh(iZzg);
                    return zzajqVar;
                }
                if (iZzv == 1684632427) {
                    zzakf zzakfVarZzd = zzd(1684632427, "TPOS", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzd;
                }
                if (iZzv == 1953655662) {
                    zzakf zzakfVarZzd2 = zzd(1953655662, "TRCK", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzd2;
                }
                if (iZzv == 1953329263) {
                    zzajx zzajxVarZzc = zzc(1953329263, "TBPM", zzamfVar, true, false);
                    zzamfVar.zzh(iZzg);
                    return zzajxVarZzc;
                }
                if (iZzv == 1668311404) {
                    zzajx zzajxVarZzc2 = zzc(1668311404, "TCMP", zzamfVar, true, true);
                    zzamfVar.zzh(iZzg);
                    return zzajxVarZzc2;
                }
                if (iZzv == 1668249202) {
                    int iZzv3 = zzamfVar.zzv();
                    if (zzamfVar.zzv() == 1684108385) {
                        int iZzv4 = zzamfVar.zzv() & 16777215;
                        if (iZzv4 == 13) {
                            str = "image/jpeg";
                        } else if (iZzv4 == 14) {
                            str = "image/png";
                            iZzv4 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            StringBuilder sb = new StringBuilder(41);
                            sb.append("Unrecognized cover art flags: ");
                            sb.append(iZzv4);
                            Log.w("MetadataUtil", sb.toString());
                        } else {
                            zzamfVar.zzk(4);
                            int i3 = iZzv3 - 16;
                            byte[] bArr = new byte[i3];
                            zzamfVar.zzm(bArr, 0, i3);
                            zzajqVar = new zzaji(str, null, 3, bArr);
                        }
                    } else {
                        Log.w("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    zzamfVar.zzh(iZzg);
                    return zzajqVar;
                }
                if (iZzv == 1631670868) {
                    zzakf zzakfVarZzb10 = zzb(1631670868, "TPE2", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb10;
                }
                if (iZzv == 1936682605) {
                    zzakf zzakfVarZzb11 = zzb(1936682605, "TSOT", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb11;
                }
                if (iZzv == 1936679276) {
                    zzakf zzakfVarZzb12 = zzb(1936679276, "TSO2", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb12;
                }
                if (iZzv == 1936679282) {
                    zzakf zzakfVarZzb13 = zzb(1936679282, "TSOA", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb13;
                }
                if (iZzv == 1936679265) {
                    zzakf zzakfVarZzb14 = zzb(1936679265, "TSOP", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb14;
                }
                if (iZzv == 1936679791) {
                    zzakf zzakfVarZzb15 = zzb(1936679791, "TSOC", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb15;
                }
                if (iZzv == 1920233063) {
                    zzajx zzajxVarZzc3 = zzc(1920233063, "ITUNESADVISORY", zzamfVar, false, false);
                    zzamfVar.zzh(iZzg);
                    return zzajxVarZzc3;
                }
                if (iZzv == 1885823344) {
                    zzajx zzajxVarZzc4 = zzc(1885823344, "ITUNESGAPLESS", zzamfVar, false, true);
                    zzamfVar.zzh(iZzg);
                    return zzajxVarZzc4;
                }
                if (iZzv == 1936683886) {
                    zzakf zzakfVarZzb16 = zzb(1936683886, "TVSHOWSORT", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb16;
                }
                if (iZzv == 1953919848) {
                    zzakf zzakfVarZzb17 = zzb(1953919848, "TVSHOW", zzamfVar);
                    zzamfVar.zzh(iZzg);
                    return zzakfVarZzb17;
                }
                if (iZzv == 757935405) {
                    int i4 = -1;
                    int i5 = -1;
                    String strZzF2 = null;
                    String strZzF3 = null;
                    while (zzamfVar.zzg() < iZzg) {
                        int iZzg2 = zzamfVar.zzg();
                        int iZzv5 = zzamfVar.zzv();
                        int iZzv6 = zzamfVar.zzv();
                        zzamfVar.zzk(4);
                        if (iZzv6 == 1835360622) {
                            strZzF2 = zzamfVar.zzF(iZzv5 - 12);
                        } else if (iZzv6 == 1851878757) {
                            strZzF3 = zzamfVar.zzF(iZzv5 - 12);
                        } else {
                            if (iZzv6 == 1684108385) {
                                i5 = iZzv5;
                            }
                            if (iZzv6 == 1684108385) {
                                i4 = iZzg2;
                            }
                            zzamfVar.zzk(iZzv5 - 12);
                        }
                    }
                    if (strZzF2 != null && strZzF3 != null && i4 != -1) {
                        zzamfVar.zzh(i4);
                        zzamfVar.zzk(16);
                        zzajqVar = new zzajz(strZzF2, strZzF3, zzamfVar.zzF(i5 - 16));
                    }
                    zzamfVar.zzh(iZzg);
                    return zzajqVar;
                }
            }
            String strZzf2 = zzqx.zzf(iZzv);
            Log.d("MetadataUtil", strZzf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(strZzf2) : new String("Skipped unknown metadata entry: "));
            zzamfVar.zzh(iZzg);
            return null;
        } catch (Throwable th) {
            zzamfVar.zzh(iZzg);
            throw th;
        }
    }

    private static zzakf zzb(int i, String str, zzamf zzamfVar) {
        int iZzv = zzamfVar.zzv();
        if (zzamfVar.zzv() == 1684108385) {
            zzamfVar.zzk(8);
            return new zzakf(str, null, zzamfVar.zzF(iZzv - 16));
        }
        String strZzf = zzqx.zzf(i);
        Log.w("MetadataUtil", strZzf.length() != 0 ? "Failed to parse text attribute: ".concat(strZzf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzajx zzc(int i, String str, zzamf zzamfVar, boolean z, boolean z2) {
        int iZze = zze(zzamfVar);
        if (z2) {
            iZze = Math.min(1, iZze);
        }
        if (iZze >= 0) {
            return z ? new zzakf(str, null, Integer.toString(iZze)) : new zzajq("und", str, Integer.toString(iZze));
        }
        String strZzf = zzqx.zzf(i);
        Log.w("MetadataUtil", strZzf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strZzf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static zzakf zzd(int i, String str, zzamf zzamfVar) {
        int iZzv = zzamfVar.zzv();
        if (zzamfVar.zzv() == 1684108385 && iZzv >= 22) {
            zzamfVar.zzk(10);
            int iZzo = zzamfVar.zzo();
            if (iZzo > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(iZzo);
                String string = sb.toString();
                int iZzo2 = zzamfVar.zzo();
                if (iZzo2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 12);
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(iZzo2);
                    string = sb2.toString();
                }
                return new zzakf(str, null, string);
            }
        }
        String strZzf = zzqx.zzf(i);
        Log.w("MetadataUtil", strZzf.length() != 0 ? "Failed to parse index/count attribute: ".concat(strZzf) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static int zze(zzamf zzamfVar) {
        zzamfVar.zzk(4);
        if (zzamfVar.zzv() == 1684108385) {
            zzamfVar.zzk(8);
            return zzamfVar.zzn();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
