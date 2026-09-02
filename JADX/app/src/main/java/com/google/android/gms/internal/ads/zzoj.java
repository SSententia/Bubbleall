package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzoj {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = zzamq.zza;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.zza = i2;
            this.zzb = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza(zzaiv zzaivVar) {
        for (int i = 0; i < zzaivVar.zza(); i++) {
            zzaiu zzaiuVarZzb = zzaivVar.zzb(i);
            if (zzaiuVarZzb instanceof zzajq) {
                zzajq zzajqVar = (zzajq) zzaiuVarZzb;
                if ("iTunSMPB".equals(zzajqVar.zzb) && zzc(zzajqVar.zzc)) {
                    return true;
                }
            } else if (zzaiuVarZzb instanceof zzajz) {
                zzajz zzajzVar = (zzajz) zzaiuVarZzb;
                if ("com.apple.iTunes".equals(zzajzVar.zza) && "iTunSMPB".equals(zzajzVar.zzb) && zzc(zzajzVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
