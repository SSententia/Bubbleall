package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfke {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfjl zzd;
    private boolean zze;

    public zzfke(Context context, int i, zzfjl zzfjlVar, boolean z) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(i - 1);
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfjlVar;
        this.zze = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        String strValueOf = String.valueOf(this.zzc);
        return strValueOf.length() != 0 ? "FBAMTD".concat(strValueOf) : new String("FBAMTD");
    }

    private final String zzg() {
        String strValueOf = String.valueOf(this.zzc);
        return strValueOf.length() != 0 ? "LATMTD".concat(strValueOf) : new String("LATMTD");
    }

    private static String zzh(zzadf zzadfVar) {
        zzadh zzadhVarZzi = zzadi.zzi();
        zzadhVarZzi.zza(zzadfVar.zza().zza());
        zzadhVarZzi.zzb(zzadfVar.zza().zzc());
        zzadhVarZzi.zzd(zzadfVar.zza().zze());
        zzadhVarZzi.zze(zzadfVar.zza().zzf());
        zzadhVarZzi.zzc(zzadfVar.zza().zzd());
        return Hex.bytesToStringLowercase(zzadhVarZzi.zzah().zzan().zzz());
    }

    private final void zzi(int i, long j) {
        zzfjl zzfjlVar = this.zzd;
        if (zzfjlVar != null) {
            zzfjlVar.zza(i, j);
        }
    }

    private final void zzj(int i, long j, String str) {
        zzfjl zzfjlVar = this.zzd;
        if (zzfjlVar != null) {
            zzfjlVar.zzb(i, j, str);
        }
    }

    private final zzadi zzk(int i) {
        String string = i == 1 ? this.zzb.getString(zzg(), null) : this.zzb.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            return zzadi.zzh(zzgex.zzt(Hex.stringToBytes(string)), this.zze ? zzgfm.zza() : zzgfm.zzb());
        } catch (zzggm unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzadf zzadfVar, zzfkd zzfkdVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzadi zzadiVarZzk = zzk(1);
            String strZza = zzadfVar.zza().zza();
            if (zzadiVarZzk != null && zzadiVarZzk.zza().equals(strZza)) {
                zzi(4014, jCurrentTimeMillis);
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            File fileZze = zze(strZza);
            if (fileZze.exists()) {
                String str = true != fileZze.isDirectory() ? "0" : "1";
                String str2 = true != fileZze.isFile() ? "0" : "1";
                StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                sb.append("d:");
                sb.append(str);
                sb.append(",f:");
                sb.append(str2);
                zzj(4023, jCurrentTimeMillis2, sb.toString());
                zzi(4015, jCurrentTimeMillis2);
            } else if (!fileZze.mkdirs()) {
                String str3 = true != fileZze.canWrite() ? "0" : "1";
                zzj(4024, jCurrentTimeMillis2, str3.length() != 0 ? "cw:".concat(str3) : new String("cw:"));
                zzi(4015, jCurrentTimeMillis2);
                return false;
            }
            File fileZze2 = zze(strZza);
            File file = new File(fileZze2, "pcam.jar");
            File file2 = new File(fileZze2, "pcbc");
            if (!zzfjy.zzb(file, zzadfVar.zzc().zzz())) {
                zzi(4016, jCurrentTimeMillis);
                return false;
            }
            if (!zzfjy.zzb(file2, zzadfVar.zzd().zzz())) {
                zzi(4017, jCurrentTimeMillis);
                return false;
            }
            if (zzfkdVar != null && !zzfkdVar.zza(file)) {
                zzi(4018, jCurrentTimeMillis);
                zzfjy.zze(fileZze2);
                return false;
            }
            String strZzh = zzh(zzadfVar);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            String string = this.zzb.getString(zzg(), null);
            SharedPreferences.Editor editorEdit = this.zzb.edit();
            editorEdit.putString(zzg(), strZzh);
            if (string != null) {
                editorEdit.putString(zzf(), string);
            }
            if (!editorEdit.commit()) {
                zzi(4019, jCurrentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            zzadi zzadiVarZzk2 = zzk(1);
            if (zzadiVarZzk2 != null) {
                hashSet.add(zzadiVarZzk2.zza());
            }
            zzadi zzadiVarZzk3 = zzk(2);
            if (zzadiVarZzk3 != null) {
                hashSet.add(zzadiVarZzk3.zza());
            }
            for (File file3 : new File(this.zza.getDir("pccache", 0), this.zzc).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    zzfjy.zze(file3);
                }
            }
            zzi(5014, jCurrentTimeMillis);
            return true;
        }
    }

    public final boolean zzb(zzadf zzadfVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            if (!zzfjy.zzb(new File(zze(zzadfVar.zza().zza()), "pcbc"), zzadfVar.zzd().zzz())) {
                zzi(4020, jCurrentTimeMillis);
                return false;
            }
            String strZzh = zzh(zzadfVar);
            SharedPreferences.Editor editorEdit = this.zzb.edit();
            editorEdit.putString(zzg(), strZzh);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                zzi(5015, jCurrentTimeMillis);
            } else {
                zzi(4021, jCurrentTimeMillis);
            }
            return zCommit;
        }
    }

    public final zzfjw zzc(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzadi zzadiVarZzk = zzk(1);
            if (zzadiVarZzk == null) {
                zzi(4022, jCurrentTimeMillis);
                return null;
            }
            File fileZze = zze(zzadiVarZzk.zza());
            File file = new File(fileZze, "pcam.jar");
            if (!file.exists()) {
                file = new File(fileZze, "pcam");
            }
            File file2 = new File(fileZze, "pcbc");
            File file3 = new File(fileZze, "pcopt");
            zzi(5016, jCurrentTimeMillis);
            return new zzfjw(zzadiVarZzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzadi zzadiVarZzk = zzk(1);
            if (zzadiVarZzk == null) {
                zzi(4025, jCurrentTimeMillis);
                return false;
            }
            File fileZze = zze(zzadiVarZzk.zza());
            if (!new File(fileZze, "pcam.jar").exists()) {
                zzi(4026, jCurrentTimeMillis);
                return false;
            }
            if (new File(fileZze, "pcbc").exists()) {
                zzi(5019, jCurrentTimeMillis);
                return true;
            }
            zzi(4027, jCurrentTimeMillis);
            return false;
        }
    }
}
