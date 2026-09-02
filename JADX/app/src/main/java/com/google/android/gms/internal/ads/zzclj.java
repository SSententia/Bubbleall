package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzclj extends zzcla implements zzcir {
    public static final /* synthetic */ int zzd = 0;
    private zzcis zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcks zzi;
    private long zzj;
    private long zzk;

    public zzclj(zzcjb zzcjbVar, zzcja zzcjaVar) {
        super(zzcjbVar);
        Context context = zzcjbVar.getContext();
        zzcis zzcmbVar = zzcjaVar.zzm ? new zzcmb(context, zzcjaVar, this.zzc.get()) : new zzcki(context, zzcjaVar, this.zzc.get());
        this.zze = zzcmbVar;
        zzcmbVar.zzr(this);
    }

    protected static final String zzt(String str) {
        String strValueOf = String.valueOf(zzcgm.zzd(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }

    private final void zzw(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcli
            private final zzclj zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.zzk();
            }
        }, j);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcla, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcis zzcisVar = this.zze;
        if (zzcisVar != null) {
            zzcisVar.zzr(null);
            this.zze.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzC() {
        com.google.android.gms.ads.internal.util.zze.zzi("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zza(final boolean z, final long j) {
        final zzcjb zzcjbVar = this.zzc.get();
        if (zzcjbVar != null) {
            zzchg.zze.execute(new Runnable(zzcjbVar, z, j) { // from class: com.google.android.gms.internal.ads.zzclh
                private final zzcjb zza;
                private final boolean zzb;
                private final long zzc;

                {
                    this.zza = zzcjbVar;
                    this.zzb = z;
                    this.zzc = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzcjb zzcjbVar2 = this.zza;
                    boolean z2 = this.zzb;
                    long j2 = this.zzc;
                    int i = zzclj.zzd;
                    zzcjbVar2.zzv(z2, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzc(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final boolean zzd(String str) {
        return zze(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.zzcjb] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.gms.internal.ads.zzcla, com.google.android.gms.internal.ads.zzclj] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.zzclj] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [long] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcla] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzcla
    public final boolean zze(String str, String[] strArr) throws Throwable {
        ?? r6;
        String str2;
        ?? r5;
        long j;
        ?? r1;
        String str3;
        long j2;
        ?? r2;
        ?? r15 = this;
        ?? r13 = str;
        r15.zzf = r13;
        String strZzt = zzt(str);
        ?? r17 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            r15.zze.zzp(uriArr, r15.zzb);
            zzcjb zzcjbVar = r15.zzc.get();
            if (zzcjbVar != 0) {
                zzcjbVar.zzu(strZzt, r15);
            }
            Clock clockZzj = com.google.android.gms.ads.internal.zzt.zzj();
            long jCurrentTimeMillis = clockZzj.currentTimeMillis();
            long jLongValue = ((Long) zzbet.zzc().zzc(zzbjl.zzt)).longValue();
            long jLongValue2 = ((Long) zzbet.zzc().zzc(zzbjl.zzs)).longValue() * 1000;
            long jIntValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzr)).intValue();
            boolean zBooleanValue = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue();
            ?? r3 = -1;
            long j3 = jIntValue;
            r13 = r13;
            r15 = r15;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzj.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            long j4 = jLongValue2;
                            StringBuilder sb = new StringBuilder(47);
                            sb.append("Timeout reached. Limit: ");
                            sb.append(j4);
                            sb.append(" ms");
                            throw new IOException(sb.toString());
                        }
                        if (r15.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!r15.zzh) {
                            if (!r15.zze.zzA()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzH = r15.zze.zzH();
                            if (jZzH > 0) {
                                long jZzN = r15.zze.zzN();
                                if (jZzN != r3) {
                                    try {
                                        long j5 = jZzH;
                                        str3 = strZzt;
                                        try {
                                            zzn(str, strZzt, jZzN, j5, jZzN > 0, zBooleanValue ? r15.zze.zzI() : -1L, zBooleanValue ? r15.zze.zzJ() : -1L, zBooleanValue ? r15.zze.zzK() : -1L, zzcis.zzP(), zzcis.zzQ());
                                            r2 = jZzN;
                                            j2 = jZzH;
                                            r6 = j5;
                                        } catch (Throwable th) {
                                            th = th;
                                            r5 = this;
                                            r6 = str;
                                            str2 = str3;
                                            try {
                                                throw th;
                                            } catch (Exception e) {
                                                e = e;
                                                ?? r4 = r17;
                                                String message = e.getMessage();
                                                ?? sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                                                sb2.append("Failed to preload url ");
                                                sb2.append(r6);
                                                sb2.append(" Exception: ");
                                                sb2.append(message);
                                                com.google.android.gms.ads.internal.util.zze.zzi(sb2.toString());
                                                com.google.android.gms.ads.internal.zzt.zzg().zzl(e, "VideoStreamExoPlayerCache.preload");
                                                release();
                                                r5.zzr(r6, str2, r4, zzx(r4, e));
                                                return false;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str3 = strZzt;
                                    }
                                } else {
                                    str3 = strZzt;
                                    j2 = jZzH;
                                    r2 = r3;
                                    r6 = j3;
                                }
                                r5 = (jZzN > j2 ? 1 : (jZzN == j2 ? 0 : -1));
                                if (r5 >= 0) {
                                    zzq(str, str3, j2);
                                } else {
                                    try {
                                        zzclj zzcljVar = this;
                                        r6 = str;
                                        str2 = str3;
                                        if (zzcljVar.zze.zzO() < j3 || jZzN <= 0) {
                                            r1 = r2;
                                            r5 = zzcljVar;
                                            j = j3;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                }
                            } else {
                                j = j3;
                                jLongValue2 = jLongValue2;
                                r6 = r13;
                                str2 = strZzt;
                                r5 = r15;
                                r1 = r3;
                            }
                            try {
                                try {
                                    r5.wait(jLongValue);
                                } catch (Throwable th4) {
                                    th = th4;
                                    r17 = r1;
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        }
                        return true;
                    } catch (Throwable th5) {
                        th = th5;
                        r6 = r13;
                        str2 = strZzt;
                        r5 = r15;
                    }
                }
                return true;
                jLongValue = jLongValue;
                r15 = r5;
                r13 = r6;
                strZzt = str2;
                j3 = j;
                jLongValue2 = jLongValue2;
                r3 = r1;
            }
        } catch (Exception e2) {
            e = e2;
            r6 = r13;
            str2 = strZzt;
            r5 = r15;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final boolean zzf(String str, String[] strArr, zzcks zzcksVar) {
        this.zzf = str;
        this.zzi = zzcksVar;
        String strZzt = zzt(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzp(uriArr, this.zzb);
            zzcjb zzcjbVar = this.zzc.get();
            if (zzcjbVar != null) {
                zzcjbVar.zzu(strZzt, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
            this.zzk = -1L;
            zzw(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
            com.google.android.gms.ads.internal.zzt.zzg().zzl(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzr(str, strZzt, "error", zzx("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzg(int i) {
        this.zze.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzh(int i) {
        this.zze.zzF(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzi(int i) {
        this.zze.zzx(i);
    }

    public final zzcis zzj() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzr(null);
        zzcis zzcisVar = this.zze;
        this.zze = null;
        return zzcisVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.zzcla, com.google.android.gms.internal.ads.zzclj] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzclj] */
    /* JADX WARN: Type inference failed for: r2v31 */
    final /* synthetic */ void zzk() throws Throwable {
        String str;
        zzclj zzcljVarBooleanValue;
        zzclj zzcljVar;
        zzclj zzcljVar2;
        long j;
        String str2;
        long j2;
        String strZzt = zzt(this.zzf);
        Object obj = "error";
        try {
            zzbjd<Long> zzbjdVar = zzbjl.zzs;
            zzbjj zzbjjVarZzc = zzbet.zzc();
            long jLongValue = ((Long) zzbjjVarZzc.zzc(zzbjdVar)).longValue() * 1000;
            long jIntValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzr)).intValue();
            zzcljVarBooleanValue = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue();
            try {
                synchronized (this) {
                    try {
                        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
                        long j3 = this.zzj;
                        if (jCurrentTimeMillis - j3 <= jLongValue) {
                            try {
                                if (this.zzg) {
                                    throw new IOException("Abort requested before buffering finished. ");
                                }
                                if (!this.zzh) {
                                    if (!this.zze.zzA()) {
                                        throw new IOException("ExoPlayer was released during preloading.");
                                    }
                                    long jZzH = this.zze.zzH();
                                    if (jZzH > 0) {
                                        long jZzN = this.zze.zzN();
                                        if (jZzN != this.zzk) {
                                            try {
                                                str2 = strZzt;
                                                try {
                                                    zzn(this.zzf, strZzt, jZzN, jZzH, jZzN > 0, zzcljVarBooleanValue != 0 ? this.zze.zzI() : -1L, zzcljVarBooleanValue != 0 ? this.zze.zzJ() : -1L, zzcljVarBooleanValue != 0 ? this.zze.zzK() : -1L, zzcis.zzP(), zzcis.zzQ());
                                                    zzcljVarBooleanValue = this;
                                                    j = jZzN;
                                                    try {
                                                        zzcljVarBooleanValue.zzk = j;
                                                        j2 = jZzH;
                                                        zzcljVarBooleanValue = zzcljVarBooleanValue;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        str = str2;
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    zzcljVarBooleanValue = this;
                                                    str = str2;
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                str2 = strZzt;
                                                zzcljVarBooleanValue = this;
                                            }
                                        } else {
                                            j = jZzN;
                                            str2 = strZzt;
                                            zzcljVarBooleanValue = this;
                                            j2 = jZzH;
                                        }
                                        if (j >= j2) {
                                            zzcljVarBooleanValue.zzq(zzcljVarBooleanValue.zzf, str2, j2);
                                            zzcljVar = zzcljVarBooleanValue;
                                        } else if (zzcljVarBooleanValue.zze.zzO() >= jIntValue && j > 0) {
                                            zzcljVar = zzcljVarBooleanValue;
                                        }
                                    } else {
                                        zzcljVar2 = this;
                                    }
                                    zzcljVar2.zzw(((Long) zzbet.zzc().zzc(zzbjl.zzt)).longValue());
                                    return;
                                }
                                zzcljVar = this;
                                com.google.android.gms.ads.internal.zzt.zzy().zzd(zzcljVar.zzi);
                            } catch (Throwable th4) {
                                th = th4;
                                obj = zzbjjVarZzc;
                                str = j3;
                            }
                        } else {
                            str = strZzt;
                            zzcljVarBooleanValue = this;
                            try {
                                StringBuilder sb = new StringBuilder(47);
                                sb.append("Timeout reached. Limit: ");
                                sb.append(jLongValue);
                                sb.append(" ms");
                                throw new IOException(sb.toString());
                            } catch (Throwable th5) {
                                th = th5;
                                obj = "downloadTimeout";
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str = strZzt;
                        zzcljVarBooleanValue = this;
                    }
                    try {
                        throw th;
                    } catch (Exception e) {
                        e = e;
                        String str3 = obj;
                        String str4 = zzcljVarBooleanValue.zzf;
                        String message = e.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 34 + String.valueOf(message).length());
                        sb2.append("Failed to preload url ");
                        sb2.append(str4);
                        sb2.append(" Exception: ");
                        sb2.append(message);
                        com.google.android.gms.ads.internal.util.zze.zzi(sb2.toString());
                        com.google.android.gms.ads.internal.zzt.zzg().zzl(e, "VideoStreamExoPlayerCache.preload");
                        release();
                        zzcljVarBooleanValue.zzr(zzcljVarBooleanValue.zzf, str, str3, zzx(str3, e));
                        zzcljVar = zzcljVarBooleanValue;
                        com.google.android.gms.ads.internal.zzt.zzy().zzd(zzcljVar.zzi);
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e2) {
            e = e2;
            str = strZzt;
            zzcljVarBooleanValue = this;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzl(int i) {
        this.zze.zzy(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzm() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzr(this.zzf, zzt(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzu(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.zze.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzg().zzl(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzv(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.zze.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzg().zzl(exc, "VideoStreamExoPlayerCache.onException");
    }
}
