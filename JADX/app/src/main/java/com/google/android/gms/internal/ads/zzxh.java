package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzxh extends zzwc<String> {
    private final Object zza;
    private final zzwh<String> zzb;

    public zzxh(int i, String str, zzwh<String> zzwhVar, zzwg zzwgVar) {
        super(i, str, zzwgVar);
        this.zza = new Object();
        this.zzb = zzwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    protected final zzwi<String> zzs(zzvy zzvyVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzvyVar.zzb;
            Map<String, String> map = zzvyVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzvyVar.zzb);
        }
        return zzwi.zza(str, zzwz.zza(zzvyVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwc
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzt(String str) {
        zzwh<String> zzwhVar;
        synchronized (this.zza) {
            zzwhVar = this.zzb;
        }
        zzwhVar.zza(str);
    }
}
