package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzacz implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzabr zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzyj zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzacz(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i, int i2) {
        this.zzb = zzabrVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzyjVar;
        this.zzg = i;
        this.zzh = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            Method methodZzq = this.zzb.zzq(this.zzc, this.zzd);
            this.zzf = methodZzq;
            if (methodZzq == null) {
                return null;
            }
            zza();
            zzaan zzaanVarZzj = this.zzb.zzj();
            if (zzaanVarZzj != null && (i = this.zzg) != Integer.MIN_VALUE) {
                zzaanVarZzj.zzc(this.zzh, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }
}
