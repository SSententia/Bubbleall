package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfjv implements zzfil {
    private final Object zza;
    private final zzfjw zzb;
    private final zzfkh zzc;
    private final zzfii zzd;

    zzfjv(Object obj, zzfjw zzfjwVar, zzfkh zzfkhVar, zzfii zzfiiVar) {
        this.zza = obj;
        this.zzb = zzfjwVar;
        this.zzc = zzfkhVar;
        this.zzd = zzfiiVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzzl zzzlVarZza = zzzm.zza();
        zzzlVarZza.zzc(5);
        zzzlVarZza.zza(zzgex.zzt(bArr));
        return Base64.encodeToString(zzzlVarZza.zzah().zzao(), 11);
    }

    private final synchronized byte[] zzj(Map<String, String> map, Map<String, Object> map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final synchronized String zza(Context context, String str) {
        Map<String, Object> mapZzb;
        mapZzb = this.zzc.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return zzi(zzj(null, mapZzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map<String, Object> mapZzc;
        mapZzc = this.zzc.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put("view", view);
        mapZzc.put("act", null);
        return zzi(zzj(null, mapZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> mapZzd;
        mapZzd = this.zzc.zzd();
        mapZzd.put("f", "c");
        mapZzd.put("ctx", context);
        mapZzd.put("cs", str2);
        mapZzd.put("aid", null);
        mapZzd.put("view", view);
        mapZzd.put("act", activity);
        return zzi(zzj(null, mapZzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfkf {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, map);
            this.zzd.zzb(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfkf(2005, e);
        }
    }

    final zzfjw zze() {
        return this.zzb;
    }

    final synchronized boolean zzf() throws zzfkf {
        try {
        } catch (Exception e) {
            throw new zzfkf(2001, e);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }

    public final synchronized void zzg() throws zzfkf {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzb(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfkf(2003, e);
        }
    }

    public final synchronized int zzh() throws zzfkf {
        try {
        } catch (Exception e) {
            throw new zzfkf(2006, e);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }
}
