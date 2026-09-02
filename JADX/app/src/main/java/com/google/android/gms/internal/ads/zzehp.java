package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehp {
    private final Clock zza;
    private final zzehq zzb;
    private final List<String> zzc = Collections.synchronizedList(new ArrayList());
    private final boolean zzd = ((Boolean) zzbet.zzc().zzc(zzbjl.zzfd)).booleanValue();
    private final zzeeh zze;

    public zzehp(Clock clock, zzehq zzehqVar, zzeeh zzeehVar) {
        this.zza = clock;
        this.zzb = zzehqVar;
        this.zze = zzeehVar;
    }

    static /* synthetic */ void zzf(zzehp zzehpVar, String str, int i, long j, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String string = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(str2).length());
            sb2.append(string);
            sb2.append(".");
            sb2.append(str2);
            string = sb2.toString();
        }
        zzehpVar.zzc.add(string);
    }

    final <T> zzfsm<T> zze(zzfac zzfacVar, zzezz zzezzVar, zzfsm<T> zzfsmVar) {
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzezzVar.zzw;
        if (str != null) {
            zzfsd.zzp(zzfsmVar, new zzeho(this, jElapsedRealtime, str, zzezzVar, zzfacVar), zzchg.zzf);
        }
        return zzfsmVar;
    }

    public final String zzg() {
        return TextUtils.join("_", this.zzc);
    }
}
