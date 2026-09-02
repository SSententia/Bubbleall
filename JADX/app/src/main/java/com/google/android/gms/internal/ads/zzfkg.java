package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfkg {
    private static final HashMap<String, Class<?>> zza = new HashMap<>();
    private final Context zzb;
    private final zzfkh zzc;
    private final zzfii zzd;
    private final zzfie zze;
    private zzfjv zzf;
    private final Object zzg = new Object();

    public zzfkg(Context context, zzfkh zzfkhVar, zzfii zzfiiVar, zzfie zzfieVar) {
        this.zzb = context;
        this.zzc = zzfkhVar;
        this.zzd = zzfiiVar;
        this.zze = zzfieVar;
    }

    private final synchronized Class<?> zzd(zzfjw zzfjwVar) throws zzfkf {
        String strZza = zzfjwVar.zza().zza();
        HashMap<String, Class<?>> map = zza;
        Class<?> cls = map.get(strZza);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfjwVar.zzb())) {
                throw new zzfkf(2026, "VM did not pass signature verification");
            }
            try {
                File fileZzc = zzfjwVar.zzc();
                if (!fileZzc.exists()) {
                    fileZzc.mkdirs();
                }
                Class clsLoadClass = new DexClassLoader(zzfjwVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strZza, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfkf(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfkf(2026, e2);
        }
    }

    public final boolean zza(zzfjw zzfjwVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfjv zzfjvVar = new zzfjv(zzd(zzfjwVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfjwVar.zzd(), null, new Bundle(), 2), zzfjwVar, this.zzc, this.zzd);
                if (!zzfjvVar.zzf()) {
                    throw new zzfkf(4000, "init failed");
                }
                int iZzh = zzfjvVar.zzh();
                if (iZzh != 0) {
                    StringBuilder sb = new StringBuilder(15);
                    sb.append("ci: ");
                    sb.append(iZzh);
                    throw new zzfkf(4001, sb.toString());
                }
                synchronized (this.zzg) {
                    zzfjv zzfjvVar2 = this.zzf;
                    if (zzfjvVar2 != null) {
                        try {
                            zzfjvVar2.zzg();
                        } catch (zzfkf e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                        this.zzf = zzfjvVar;
                    } else {
                        this.zzf = zzfjvVar;
                    }
                    throw th;
                }
                this.zzd.zzb(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfkf(2004, e2);
            }
        } catch (zzfkf e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    public final zzfil zzb() {
        zzfjv zzfjvVar;
        synchronized (this.zzg) {
            zzfjvVar = this.zzf;
        }
        return zzfjvVar;
    }

    public final zzfjw zzc() {
        synchronized (this.zzg) {
            zzfjv zzfjvVar = this.zzf;
            if (zzfjvVar == null) {
                return null;
            }
            return zzfjvVar.zze();
        }
    }
}
