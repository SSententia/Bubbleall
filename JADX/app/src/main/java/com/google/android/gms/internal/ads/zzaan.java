package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaan {
    protected volatile Boolean zzb;
    private final zzabr zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    protected static volatile zzfkk zza = null;
    private static volatile Random zze = null;

    public zzaan(zzabr zzabrVar) {
        this.zzc = zzabrVar;
        zzabrVar.zze().execute(new zzaam(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return zze().nextInt();
        }
    }

    private static Random zze() {
        if (zze == null) {
            synchronized (zzaan.class) {
                if (zze == null) {
                    zze = new Random();
                }
            }
        }
        return zze;
    }

    public final void zzc(int i, int i2, long j, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzxv zzxvVarZza = zzxz.zza();
            zzxvVarZza.zza(this.zzc.zza.getPackageName());
            zzxvVarZza.zzb(j);
            if (str != null) {
                zzxvVarZza.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                zzged.zzc(exc, new PrintWriter(stringWriter));
                zzxvVarZza.zzc(stringWriter.toString());
                zzxvVarZza.zzd(exc.getClass().getName());
            }
            zzfki zzfkiVarZza = zza.zza(zzxvVarZza.zzah().zzao());
            zzfkiVarZza.zzc(i);
            if (i2 != -1) {
                zzfkiVarZza.zzb(i2);
            }
            zzfkiVarZza.zza();
        } catch (Exception unused) {
        }
    }
}
