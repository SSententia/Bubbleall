package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaqx {
    private static final int zza = zzave.zzl("nam");
    private static final int zzb = zzave.zzl("trk");
    private static final int zzc = zzave.zzl("cmt");
    private static final int zzd = zzave.zzl("day");
    private static final int zze = zzave.zzl("ART");
    private static final int zzf = zzave.zzl("too");
    private static final int zzg = zzave.zzl("alb");
    private static final int zzh = zzave.zzl("com");
    private static final int zzi = zzave.zzl("wrt");
    private static final int zzj = zzave.zzl("lyr");
    private static final int zzk = zzave.zzl("gen");
    private static final int zzl = zzave.zzl("covr");
    private static final int zzm = zzave.zzl("gnre");
    private static final int zzn = zzave.zzl("grp");
    private static final int zzo = zzave.zzl("disk");
    private static final int zzp = zzave.zzl("trkn");
    private static final int zzq = zzave.zzl("tmpo");
    private static final int zzr = zzave.zzl("cpil");
    private static final int zzs = zzave.zzl("aART");
    private static final int zzt = zzave.zzl("sonm");
    private static final int zzu = zzave.zzl("soal");
    private static final int zzv = zzave.zzl("soar");
    private static final int zzw = zzave.zzl("soaa");
    private static final int zzx = zzave.zzl("soco");
    private static final int zzy = zzave.zzl("rtng");
    private static final int zzz = zzave.zzl("pgap");
    private static final int zzA = zzave.zzl("sosn");
    private static final int zzB = zzave.zzl("tvsh");
    private static final int zzC = zzave.zzl("----");
    private static final String[] zzD = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    public static zzart zza(zzaux zzauxVar) {
        String str;
        String str2;
        int iZzg = zzauxVar.zzg() + zzauxVar.zzr();
        int iZzr = zzauxVar.zzr();
        zzart zzaryVar = null;
        try {
            if (((iZzr >> 24) & 255) == 169) {
                int i = 16777215 & iZzr;
                if (i == zzc) {
                    int iZzr2 = zzauxVar.zzr();
                    if (zzauxVar.zzr() == zzaqk.zzaH) {
                        zzauxVar.zzj(8);
                        String strZzw = zzauxVar.zzw(iZzr2 - 16);
                        zzaryVar = new zzary("und", strZzw, strZzw);
                    } else {
                        String strZzg = zzaqk.zzg(iZzr);
                        Log.w("MetadataUtil", strZzg.length() != 0 ? "Failed to parse comment attribute: ".concat(strZzg) : new String("Failed to parse comment attribute: "));
                    }
                    zzauxVar.zzi(iZzg);
                    return zzaryVar;
                }
                if (i != zza && i != zzb) {
                    if (i != zzh && i != zzi) {
                        if (i == zzd) {
                            zzasc zzascVarZzb = zzb(iZzr, "TDRC", zzauxVar);
                            zzauxVar.zzi(iZzg);
                            return zzascVarZzb;
                        }
                        if (i == zze) {
                            zzasc zzascVarZzb2 = zzb(iZzr, "TPE1", zzauxVar);
                            zzauxVar.zzi(iZzg);
                            return zzascVarZzb2;
                        }
                        if (i == zzf) {
                            zzasc zzascVarZzb3 = zzb(iZzr, "TSSE", zzauxVar);
                            zzauxVar.zzi(iZzg);
                            return zzascVarZzb3;
                        }
                        if (i == zzg) {
                            zzasc zzascVarZzb4 = zzb(iZzr, "TALB", zzauxVar);
                            zzauxVar.zzi(iZzg);
                            return zzascVarZzb4;
                        }
                        if (i == zzj) {
                            zzasc zzascVarZzb5 = zzb(iZzr, "USLT", zzauxVar);
                            zzauxVar.zzi(iZzg);
                            return zzascVarZzb5;
                        }
                        if (i == zzk) {
                            zzasc zzascVarZzb6 = zzb(iZzr, "TCON", zzauxVar);
                            zzauxVar.zzi(iZzg);
                            return zzascVarZzb6;
                        }
                        if (i == zzn) {
                            zzasc zzascVarZzb7 = zzb(iZzr, "TIT1", zzauxVar);
                            zzauxVar.zzi(iZzg);
                            return zzascVarZzb7;
                        }
                    }
                    zzasc zzascVarZzb8 = zzb(iZzr, "TCOM", zzauxVar);
                    zzauxVar.zzi(iZzg);
                    return zzascVarZzb8;
                }
                zzasc zzascVarZzb9 = zzb(iZzr, "TIT2", zzauxVar);
                zzauxVar.zzi(iZzg);
                return zzascVarZzb9;
            }
            if (iZzr == zzm) {
                int iZze = zze(zzauxVar);
                if (iZze > 0) {
                    String[] strArr = zzD;
                    int length = strArr.length;
                    if (iZze <= 148) {
                        str2 = strArr[iZze - 1];
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    zzaryVar = new zzasc("TCON", null, str2);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                zzauxVar.zzi(iZzg);
                return zzaryVar;
            }
            if (iZzr == zzo) {
                zzasc zzascVarZzd = zzd(iZzr, "TPOS", zzauxVar);
                zzauxVar.zzi(iZzg);
                return zzascVarZzd;
            }
            if (iZzr == zzp) {
                zzasc zzascVarZzd2 = zzd(iZzr, "TRCK", zzauxVar);
                zzauxVar.zzi(iZzg);
                return zzascVarZzd2;
            }
            if (iZzr == zzq) {
                zzasa zzasaVarZzc = zzc(iZzr, "TBPM", zzauxVar, true, false);
                zzauxVar.zzi(iZzg);
                return zzasaVarZzc;
            }
            if (iZzr == zzr) {
                zzasa zzasaVarZzc2 = zzc(iZzr, "TCMP", zzauxVar, true, true);
                zzauxVar.zzi(iZzg);
                return zzasaVarZzc2;
            }
            if (iZzr == zzl) {
                int iZzr3 = zzauxVar.zzr();
                if (zzauxVar.zzr() == zzaqk.zzaH) {
                    int iZzf = zzaqk.zzf(zzauxVar.zzr());
                    if (iZzf == 13) {
                        str = "image/jpeg";
                    } else if (iZzf == 14) {
                        str = "image/png";
                        iZzf = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unrecognized cover art flags: ");
                        sb.append(iZzf);
                        Log.w("MetadataUtil", sb.toString());
                    } else {
                        zzauxVar.zzj(4);
                        int i2 = iZzr3 - 16;
                        byte[] bArr = new byte[i2];
                        zzauxVar.zzk(bArr, 0, i2);
                        zzaryVar = new zzarw(str, null, 3, bArr);
                    }
                } else {
                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                }
                zzauxVar.zzi(iZzg);
                return zzaryVar;
            }
            if (iZzr == zzs) {
                zzasc zzascVarZzb10 = zzb(iZzr, "TPE2", zzauxVar);
                zzauxVar.zzi(iZzg);
                return zzascVarZzb10;
            }
            if (iZzr == zzt) {
                zzasc zzascVarZzb11 = zzb(iZzr, "TSOT", zzauxVar);
                zzauxVar.zzi(iZzg);
                return zzascVarZzb11;
            }
            if (iZzr == zzu) {
                zzasc zzascVarZzb12 = zzb(iZzr, "TSO2", zzauxVar);
                zzauxVar.zzi(iZzg);
                return zzascVarZzb12;
            }
            if (iZzr == zzv) {
                zzasc zzascVarZzb13 = zzb(iZzr, "TSOA", zzauxVar);
                zzauxVar.zzi(iZzg);
                return zzascVarZzb13;
            }
            if (iZzr == zzw) {
                zzasc zzascVarZzb14 = zzb(iZzr, "TSOP", zzauxVar);
                zzauxVar.zzi(iZzg);
                return zzascVarZzb14;
            }
            if (iZzr == zzx) {
                zzasc zzascVarZzb15 = zzb(iZzr, "TSOC", zzauxVar);
                zzauxVar.zzi(iZzg);
                return zzascVarZzb15;
            }
            if (iZzr == zzy) {
                zzasa zzasaVarZzc3 = zzc(iZzr, "ITUNESADVISORY", zzauxVar, false, false);
                zzauxVar.zzi(iZzg);
                return zzasaVarZzc3;
            }
            if (iZzr == zzz) {
                zzasa zzasaVarZzc4 = zzc(iZzr, "ITUNESGAPLESS", zzauxVar, false, true);
                zzauxVar.zzi(iZzg);
                return zzasaVarZzc4;
            }
            if (iZzr == zzA) {
                zzasc zzascVarZzb16 = zzb(iZzr, "TVSHOWSORT", zzauxVar);
                zzauxVar.zzi(iZzg);
                return zzascVarZzb16;
            }
            if (iZzr == zzB) {
                zzasc zzascVarZzb17 = zzb(iZzr, "TVSHOW", zzauxVar);
                zzauxVar.zzi(iZzg);
                return zzascVarZzb17;
            }
            if (iZzr == zzC) {
                int i3 = -1;
                int i4 = -1;
                String strZzw2 = null;
                String strZzw3 = null;
                while (zzauxVar.zzg() < iZzg) {
                    int iZzg2 = zzauxVar.zzg();
                    int iZzr4 = zzauxVar.zzr();
                    int iZzr5 = zzauxVar.zzr();
                    zzauxVar.zzj(4);
                    if (iZzr5 == zzaqk.zzaF) {
                        strZzw2 = zzauxVar.zzw(iZzr4 - 12);
                    } else if (iZzr5 == zzaqk.zzaG) {
                        strZzw3 = zzauxVar.zzw(iZzr4 - 12);
                    } else {
                        int i5 = zzaqk.zzaH;
                        if (iZzr5 == i5) {
                            i4 = iZzr4;
                        }
                        if (iZzr5 == i5) {
                            i3 = iZzg2;
                        }
                        zzauxVar.zzj(iZzr4 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(strZzw2) && "iTunSMPB".equals(strZzw3) && i3 != -1) {
                    zzauxVar.zzi(i3);
                    zzauxVar.zzj(16);
                    zzaryVar = new zzary("und", strZzw3, zzauxVar.zzw(i4 - 16));
                }
                zzauxVar.zzi(iZzg);
                return zzaryVar;
            }
            String strZzg2 = zzaqk.zzg(iZzr);
            Log.d("MetadataUtil", strZzg2.length() != 0 ? "Skipped unknown metadata entry: ".concat(strZzg2) : new String("Skipped unknown metadata entry: "));
            zzauxVar.zzi(iZzg);
            return null;
        } catch (Throwable th) {
            zzauxVar.zzi(iZzg);
            throw th;
        }
    }

    private static zzasc zzb(int i, String str, zzaux zzauxVar) {
        int iZzr = zzauxVar.zzr();
        if (zzauxVar.zzr() == zzaqk.zzaH) {
            zzauxVar.zzj(8);
            return new zzasc(str, null, zzauxVar.zzw(iZzr - 16));
        }
        String strZzg = zzaqk.zzg(i);
        Log.w("MetadataUtil", strZzg.length() != 0 ? "Failed to parse text attribute: ".concat(strZzg) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzasa zzc(int i, String str, zzaux zzauxVar, boolean z, boolean z2) {
        int iZze = zze(zzauxVar);
        if (z2) {
            iZze = Math.min(1, iZze);
        }
        if (iZze >= 0) {
            return z ? new zzasc(str, null, Integer.toString(iZze)) : new zzary("und", str, Integer.toString(iZze));
        }
        String strZzg = zzaqk.zzg(i);
        Log.w("MetadataUtil", strZzg.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strZzg) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static zzasc zzd(int i, String str, zzaux zzauxVar) {
        int iZzr = zzauxVar.zzr();
        if (zzauxVar.zzr() == zzaqk.zzaH && iZzr >= 22) {
            zzauxVar.zzj(10);
            int iZzm = zzauxVar.zzm();
            if (iZzm > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(iZzm);
                String string = sb.toString();
                int iZzm2 = zzauxVar.zzm();
                if (iZzm2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 12);
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(iZzm2);
                    string = sb2.toString();
                }
                return new zzasc(str, null, string);
            }
        }
        String strZzg = zzaqk.zzg(i);
        Log.w("MetadataUtil", strZzg.length() != 0 ? "Failed to parse index/count attribute: ".concat(strZzg) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static int zze(zzaux zzauxVar) {
        zzauxVar.zzj(4);
        if (zzauxVar.zzr() == zzaqk.zzaH) {
            zzauxVar.zzj(8);
            return zzauxVar.zzl();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
