package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfjx {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfjx(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfjy.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfjy.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    static String zzb(zzadi zzadiVar) {
        return Hex.bytesToStringLowercase(zzadiVar.zzan().zzz());
    }

    private final File zze() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zzf() {
        int i = this.zzd;
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    private final String zzg() {
        int i = this.zzd;
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    public final boolean zza(zzadf zzadfVar, zzfkd zzfkdVar) {
        boolean z;
        String strZza = zzadfVar.zza().zza();
        byte[] bArrZzz = zzadfVar.zzc().zzz();
        byte[] bArrZzz2 = zzadfVar.zzd().zzz();
        if (!TextUtils.isEmpty(strZza) && bArrZzz2 != null && bArrZzz2.length != 0) {
            zzfjy.zze(this.zza);
            this.zza.mkdirs();
            zzfjy.zzc(strZza, this.zza).mkdirs();
            File fileZza = zzfjy.zza(strZza, "pcam.jar", this.zza);
            if ((bArrZzz == null || bArrZzz.length <= 0 || zzfjy.zzb(fileZza, bArrZzz)) && zzfjy.zzb(zzfjy.zza(strZza, "pcbc", this.zza), bArrZzz2)) {
                File fileZza2 = zzfjy.zza(zzadfVar.zza().zza(), "pcam.jar", this.zza);
                if (fileZza2.exists() && zzfkdVar != null && !zzfkdVar.zza(fileZza2)) {
                    return false;
                }
                String strZza2 = zzadfVar.zza().zza();
                if (TextUtils.isEmpty(strZza2)) {
                    z = false;
                } else {
                    File fileZza3 = zzfjy.zza(strZza2, "pcam.jar", this.zza);
                    File fileZza4 = zzfjy.zza(strZza2, "pcbc", this.zza);
                    File fileZza5 = zzfjy.zza(strZza2, "pcam.jar", zze());
                    File fileZza6 = zzfjy.zza(strZza2, "pcbc", zze());
                    if ((!fileZza3.exists() || fileZza3.renameTo(fileZza5)) && fileZza4.exists() && fileZza4.renameTo(fileZza6)) {
                        zzadh zzadhVarZzi = zzadi.zzi();
                        zzadhVarZzi.zza(zzadfVar.zza().zza());
                        zzadhVarZzi.zzb(zzadfVar.zza().zzc());
                        zzadhVarZzi.zzd(zzadfVar.zza().zze());
                        zzadhVarZzi.zze(zzadfVar.zza().zzf());
                        zzadhVarZzi.zzc(zzadfVar.zza().zzd());
                        zzadi zzadiVarZzah = zzadhVarZzi.zzah();
                        zzadi zzadiVarZzd = zzd(1);
                        SharedPreferences.Editor editorEdit = this.zzc.edit();
                        if (zzadiVarZzd != null && !zzadiVarZzah.zza().equals(zzadiVarZzd.zza())) {
                            editorEdit.putString(zzf(), zzb(zzadiVarZzd));
                        }
                        editorEdit.putString(zzg(), zzb(zzadiVarZzah));
                        if (editorEdit.commit()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                HashSet hashSet = new HashSet();
                zzadi zzadiVarZzd2 = zzd(1);
                if (zzadiVarZzd2 != null) {
                    hashSet.add(zzadiVarZzd2.zza());
                }
                zzadi zzadiVarZzd3 = zzd(2);
                if (zzadiVarZzd3 != null) {
                    hashSet.add(zzadiVarZzd3.zza());
                }
                for (File file : zze().listFiles()) {
                    String name = file.getName();
                    if (!hashSet.contains(name)) {
                        zzfjy.zze(zzfjy.zzc(name, zze()));
                    }
                }
                return z;
            }
        }
        return false;
    }

    public final zzfjw zzc(int i) {
        zzadi zzadiVarZzd = zzd(1);
        if (zzadiVarZzd == null) {
            return null;
        }
        String strZza = zzadiVarZzd.zza();
        File fileZza = zzfjy.zza(strZza, "pcam.jar", zze());
        if (!fileZza.exists()) {
            fileZza = zzfjy.zza(strZza, "pcam", zze());
        }
        return new zzfjw(zzadiVarZzd, fileZza, zzfjy.zza(strZza, "pcbc", zze()), zzfjy.zza(strZza, "pcopt", zze()));
    }

    final zzadi zzd(int i) {
        String string = i == 1 ? this.zzc.getString(zzg(), null) : this.zzc.getString(zzf(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            zzadi zzadiVarZzg = zzadi.zzg(zzgex.zzt(Hex.stringToBytes(string)));
            String strZza = zzadiVarZzg.zza();
            File fileZza = zzfjy.zza(strZza, "pcam.jar", zze());
            if (!fileZza.exists()) {
                fileZza = zzfjy.zza(strZza, "pcam", zze());
            }
            File fileZza2 = zzfjy.zza(strZza, "pcbc", zze());
            if (fileZza.exists() && fileZza2.exists()) {
                return zzadiVarZzg;
            }
            return null;
        } catch (zzggm unused) {
        }
    }
}
