package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzwv {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List<zzvu> zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzwv(String str, zzvl zzvlVar) {
        String str2 = zzvlVar.zzb;
        long j = zzvlVar.zzc;
        long j2 = zzvlVar.zzd;
        long j3 = zzvlVar.zze;
        long j4 = zzvlVar.zzf;
        List arrayList = zzvlVar.zzh;
        if (arrayList == null) {
            Map<String, String> map = zzvlVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new zzvu(entry.getKey(), entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    static zzwv zza(zzww zzwwVar) throws IOException {
        if (zzwy.zzi(zzwwVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzwy.zzm(zzwwVar);
        String strZzm2 = zzwy.zzm(zzwwVar);
        long jZzk = zzwy.zzk(zzwwVar);
        long jZzk2 = zzwy.zzk(zzwwVar);
        long jZzk3 = zzwy.zzk(zzwwVar);
        long jZzk4 = zzwy.zzk(zzwwVar);
        int iZzi = zzwy.zzi(zzwwVar);
        if (iZzi < 0) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(iZzi);
            throw new IOException(sb.toString());
        }
        List listEmptyList = iZzi == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < iZzi; i++) {
            listEmptyList.add(new zzvu(zzwy.zzm(zzwwVar).intern(), zzwy.zzm(zzwwVar).intern()));
        }
        return new zzwv(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, listEmptyList);
    }

    private zzwv(String str, String str2, long j, long j2, long j3, long j4, List<zzvu> list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
