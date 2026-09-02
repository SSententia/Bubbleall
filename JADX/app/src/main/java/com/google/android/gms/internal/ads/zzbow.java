package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbow implements zzbpr {
    static final zzbpr zza = new zzbow();

    private zzbow() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map map) {
        zzcnn zzcnnVar = (zzcnn) obj;
        zzbpr<zzcml> zzbprVar = zzbpq.zza;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfS)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzi("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zzi("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap map2 = new HashMap();
        Boolean boolValueOf = Boolean.valueOf(zzcnnVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        map2.put(str, boolValueOf);
        String string = boolValueOf.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + string.length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(string);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        ((zzbsi) zzcnnVar).zze("openableApp", map2);
    }
}
