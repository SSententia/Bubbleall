package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzau extends zzat {
    public final String zzc;
    public final Map<String, List<String>> zzd;
    public final byte[] zze;

    public zzau(int i, String str, IOException iOException, Map<String, List<String>> map, zzan zzanVar, byte[] bArr) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i);
        super(sb.toString(), iOException, zzanVar, 2004, 1);
        this.zzc = str;
        this.zzd = map;
        this.zze = bArr;
    }
}
