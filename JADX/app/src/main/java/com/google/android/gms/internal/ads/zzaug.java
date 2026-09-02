package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaug extends zzauf {
    public final Map<String, List<String>> zzb;

    public zzaug(int i, Map<String, List<String>> map, zzaub zzaubVar) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i);
        super(sb.toString(), zzaubVar, 1);
        this.zzb = map;
    }
}
