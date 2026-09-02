package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaal implements zzaao {
    private static zzaal zzb;
    private final Context zzc;
    private final zzfjx zzd;
    private final zzfke zze;
    private final zzfkg zzf;
    private final zzabl zzg;
    private final zzfii zzh;
    private final Executor zzi;
    private final zzfkd zzj;
    private volatile boolean zzm;
    private final int zzo;
    volatile long zza = 0;
    private final Object zzl = new Object();
    private volatile boolean zzn = false;
    private final CountDownLatch zzk = new CountDownLatch(1);

    zzaal(Context context, zzfii zzfiiVar, zzfjx zzfjxVar, zzfke zzfkeVar, zzfkg zzfkgVar, zzabl zzablVar, Executor executor, zzfie zzfieVar, int i) {
        this.zzc = context;
        this.zzh = zzfiiVar;
        this.zzd = zzfjxVar;
        this.zze = zzfkeVar;
        this.zzf = zzfkgVar;
        this.zzg = zzablVar;
        this.zzi = executor;
        this.zzo = i;
        this.zzj = new zzaaj(this, zzfieVar);
    }

    @Deprecated
    public static synchronized zzaal zze(String str, Context context, Executor executor, boolean z, boolean z2) {
        if (zzb == null) {
            zzfij zzfijVarZzd = zzfik.zzd();
            zzfijVarZzd.zza(str);
            zzfijVarZzd.zzb(z);
            zzfik zzfikVarZzd = zzfijVarZzd.zzd();
            zzfii zzfiiVarZza = zzfii.zza(context, executor, z2);
            zzaav zzaavVarZzb = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbW)).booleanValue() ? zzaav.zzb(context) : null;
            zzfjb zzfjbVarZza = zzfjb.zza(context, executor, zzfiiVarZza, zzfikVarZzd);
            zzabk zzabkVar = new zzabk(context);
            zzabl zzablVar = new zzabl(zzfikVarZzd, zzfjbVarZza, new zzaby(context, zzabkVar), zzabkVar, zzaavVarZzb);
            int iZzb = zzfjk.zzb(context, zzfiiVarZza);
            zzfie zzfieVar = new zzfie();
            zzaal zzaalVar = new zzaal(context, zzfiiVarZza, new zzfjx(context, iZzb), new zzfke(context, iZzb, new zzaai(zzfiiVarZza), ((Boolean) zzbet.zzc().zzc(zzbjl.zzbv)).booleanValue()), new zzfkg(context, zzablVar, zzfiiVarZza, zzfieVar), zzablVar, executor, zzfieVar, iZzb);
            zzb = zzaalVar;
            zzaalVar.zzh();
            zzb.zzq();
        }
        return zzb;
    }

    public static synchronized zzaal zzf(String str, Context context, boolean z, boolean z2) {
        return zze(str, context, Executors.newCachedThreadPool(), z, z2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cd A[Catch: all -> 0x0128, zzggm -> 0x012a, TRY_LEAVE, TryCatch #0 {zzggm -> 0x012a, blocks: (B:6:0x0021, B:8:0x0032, B:11:0x0037, B:12:0x0043, B:14:0x0051, B:16:0x005f, B:19:0x006c, B:26:0x009b, B:30:0x00b4, B:36:0x00cd, B:40:0x00df, B:42:0x00e5, B:44:0x00ed, B:45:0x00ef, B:33:0x00be, B:34:0x00c5, B:22:0x0073, B:24:0x0089, B:47:0x00fb, B:49:0x010a, B:51:0x0119), top: B:60:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb A[Catch: all -> 0x0128, zzggm -> 0x012a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {zzggm -> 0x012a, blocks: (B:6:0x0021, B:8:0x0032, B:11:0x0037, B:12:0x0043, B:14:0x0051, B:16:0x005f, B:19:0x006c, B:26:0x009b, B:30:0x00b4, B:36:0x00cd, B:40:0x00df, B:42:0x00e5, B:44:0x00ed, B:45:0x00ef, B:33:0x00be, B:34:0x00c5, B:22:0x0073, B:24:0x0089, B:47:0x00fb, B:49:0x010a, B:51:0x0119), top: B:60:0x0021, outer: #1 }] */
    static /* synthetic */ void zzi(zzaal zzaalVar) {
        String str;
        String strZzc;
        CountDownLatch countDownLatch;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfjw zzfjwVarZzr = zzaalVar.zzr(1);
        if (zzfjwVarZzr != null) {
            String strZza = zzfjwVarZzr.zza().zza();
            strZzc = zzfjwVarZzr.zza().zzc();
            str = strZza;
        } else {
            str = null;
            strZzc = null;
        }
        try {
            try {
                zzfkb zzfkbVarZza = zzfis.zza(zzaalVar.zzc, 1, zzaalVar.zzo, str, strZzc, "1", zzaalVar.zzh);
                byte[] bArr = zzfkbVarZza.zzb;
                if (bArr == null || bArr.length == 0) {
                    zzaalVar.zzh.zzb(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                    countDownLatch = zzaalVar.zzk;
                } else {
                    try {
                        zzadf zzadfVarZze = zzadf.zze(zzgex.zzt(bArr), zzgfm.zza());
                        if (zzadfVarZze.zza().zza().isEmpty() || zzadfVarZze.zza().zzc().isEmpty() || zzadfVarZze.zzd().zzz().length == 0) {
                            zzaalVar.zzh.zzb(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                            countDownLatch = zzaalVar.zzk;
                        } else {
                            zzfjw zzfjwVarZzr2 = zzaalVar.zzr(1);
                            if (zzfjwVarZzr2 != null) {
                                zzadi zzadiVarZza = zzfjwVarZzr2.zza();
                                if (zzadfVarZze.zza().zza().equals(zzadiVarZza.zza()) && zzadfVarZze.zza().zzc().equals(zzadiVarZza.zzc())) {
                                    zzaalVar.zzh.zzb(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                                    countDownLatch = zzaalVar.zzk;
                                }
                            }
                            zzfkd zzfkdVar = zzaalVar.zzj;
                            int i = zzfkbVarZza.zzc;
                            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbt)).booleanValue()) {
                                zZza = zzaalVar.zzd.zza(zzadfVarZze, zzfkdVar);
                            } else if (i == 3) {
                                zZza = zzaalVar.zze.zzb(zzadfVarZze);
                            } else if (i == 4) {
                                zZza = zzaalVar.zze.zza(zzadfVarZze, zzfkdVar);
                            } else {
                                zzaalVar.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                                countDownLatch = zzaalVar.zzk;
                            }
                            if (zZza) {
                                zzfjw zzfjwVarZzr3 = zzaalVar.zzr(1);
                                if (zzfjwVarZzr3 != null) {
                                    if (zzaalVar.zzf.zza(zzfjwVarZzr3)) {
                                        zzaalVar.zzn = true;
                                    }
                                    zzaalVar.zza = System.currentTimeMillis() / 1000;
                                }
                                countDownLatch = zzaalVar.zzk;
                            } else {
                                zzaalVar.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                                countDownLatch = zzaalVar.zzk;
                            }
                        }
                    } catch (NullPointerException unused) {
                        zzaalVar.zzh.zzb(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                        countDownLatch = zzaalVar.zzk;
                    }
                }
            } catch (zzggm e) {
                zzaalVar.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
                countDownLatch = zzaalVar.zzk;
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            zzaalVar.zzk.countDown();
            throw th;
        }
    }

    private final zzfjw zzr(int i) {
        if (zzfjk.zza(this.zzo)) {
            return ((Boolean) zzbet.zzc().zzc(zzbjl.zzbt)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    public final synchronized boolean zzg() {
        return this.zzn;
    }

    final synchronized void zzh() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfjw zzfjwVarZzr = zzr(1);
        if (zzfjwVarZzr == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zza(zzfjwVarZzr)) {
            this.zzn = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzj(MotionEvent motionEvent) {
        zzfil zzfilVarZzb = this.zzf.zzb();
        if (zzfilVarZzb != null) {
            try {
                zzfilVarZzb.zzd(null, motionEvent);
            } catch (zzfkf e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzk(int i, int i2, int i3) {
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final String zzl(Context context, String str, View view, Activity activity) {
        zzq();
        zzfil zzfilVarZzb = this.zzf.zzb();
        if (zzfilVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfilVarZzb.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final String zzm(Context context, String str, View view) {
        return zzl(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzn(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final String zzo(Context context, View view, Activity activity) {
        zzq();
        zzfil zzfilVarZzb = this.zzf.zzb();
        if (zzfilVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfilVarZzb.zzb(context, null, view, null);
        this.zzh.zzd(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final String zzp(Context context) {
        zzq();
        zzfil zzfilVarZzb = this.zzf.zzb();
        if (zzfilVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfilVarZzb.zza(context, null);
        this.zzh.zzd(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    public final void zzq() {
        if (this.zzm) {
            return;
        }
        synchronized (this.zzl) {
            if (!this.zzm) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfjw zzfjwVarZzc = this.zzf.zzc();
                if ((zzfjwVarZzc == null || zzfjwVarZzc.zze(3600L)) && zzfjk.zza(this.zzo)) {
                    this.zzi.execute(new zzaak(this));
                }
            }
        }
    }
}
