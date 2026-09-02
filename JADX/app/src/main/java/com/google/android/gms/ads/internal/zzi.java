package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaal;
import com.google.android.gms.internal.ads.zzaao;
import com.google.android.gms.internal.ads.zzaar;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzchg;
import com.google.android.gms.internal.ads.zzfii;
import com.google.android.gms.internal.ads.zzfjk;
import com.google.android.gms.internal.ads.zzfke;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzi implements Runnable, zzaao {
    private final boolean zze;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfii zzi;
    private Context zzj;
    private final Context zzk;
    private zzcgz zzl;
    private final zzcgz zzm;
    private final boolean zzn;
    private int zzo;
    private final List<Object[]> zzb = new Vector();
    private final AtomicReference<zzaao> zzc = new AtomicReference<>();
    private final AtomicReference<zzaao> zzd = new AtomicReference<>();
    final CountDownLatch zza = new CountDownLatch(1);

    public zzi(Context context, zzcgz zzcgzVar) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = zzcgzVar;
        this.zzm = zzcgzVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzbet.zzc().zzc(zzbjl.zzby)).booleanValue();
        this.zzn = zBooleanValue;
        zzfii zzfiiVarZza = zzfii.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzi = zzfiiVarZza;
        this.zzf = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbu)).booleanValue();
        this.zzg = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbz)).booleanValue();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbx)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        Context context2 = this.zzj;
        zzh zzhVar = new zzh(this);
        this.zze = new zzfke(this.zzj, zzfjk.zzb(context2, zzfiiVarZza), zzhVar, ((Boolean) zzbet.zzc().zzc(zzbjl.zzbv)).booleanValue()).zzd(1);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbT)).booleanValue()) {
            zzchg.zza.execute(this);
            return;
        }
        zzber.zza();
        if (zzcgm.zzp()) {
            zzchg.zza.execute(this);
        } else {
            run();
        }
    }

    private final void zze() {
        zzaao zzaaoVarZzg = zzg();
        if (this.zzb.isEmpty() || zzaaoVarZzg == null) {
            return;
        }
        for (Object[] objArr : this.zzb) {
            int length = objArr.length;
            if (length == 1) {
                zzaaoVarZzg.zzj((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzaaoVarZzg.zzk(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzb.clear();
    }

    private final void zzf(boolean z) {
        this.zzc.set(zzaar.zzt(this.zzl.zza, zzh(this.zzj), z, this.zzo));
    }

    private final zzaao zzg() {
        return zzd() == 2 ? this.zzd.get() : this.zzc.get();
    }

    private static final Context zzh(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            boolean z = this.zzl.zzd;
            final boolean z2 = false;
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzaH)).booleanValue() && z) {
                z2 = true;
            }
            if (zzd() == 1) {
                zzf(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable(this, z2) { // from class: com.google.android.gms.ads.internal.zzg
                        private final zzi zza;
                        private final boolean zzb;

                        {
                            this.zza = this;
                            this.zzb = z2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzc(this.zzb);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzaal zzaalVarZzf = zzaal.zzf(this.zzl.zza, zzh(this.zzj), z2, this.zzn);
                    this.zzd.set(zzaalVarZzf);
                    if (this.zzg && !zzaalVarZzf.zzg()) {
                        this.zzo = 1;
                        zzf(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzo = 1;
                    zzf(z2);
                    this.zzi.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.zza.countDown();
            this.zzj = null;
            this.zzl = null;
        } catch (Throwable th) {
            this.zza.countDown();
            this.zzj = null;
            this.zzl = null;
            throw th;
        }
    }

    public final boolean zzb() {
        try {
            this.zza.await();
            return true;
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    final /* synthetic */ void zzc(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzaal.zzf(this.zzm.zza, zzh(this.zzk), z, this.zzn).zzq();
        } catch (NullPointerException e) {
            this.zzi.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    protected final int zzd() {
        if (!this.zzf || this.zze) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzj(MotionEvent motionEvent) {
        zzaao zzaaoVarZzg = zzg();
        if (zzaaoVarZzg == null) {
            this.zzb.add(new Object[]{motionEvent});
        } else {
            zze();
            zzaaoVarZzg.zzj(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzk(int i, int i2, int i3) {
        zzaao zzaaoVarZzg = zzg();
        if (zzaaoVarZzg == null) {
            this.zzb.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            zze();
            zzaaoVarZzg.zzk(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final String zzl(Context context, String str, View view, Activity activity) {
        if (!zzb()) {
            return "";
        }
        zzaao zzaaoVarZzg = zzg();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgV)).booleanValue()) {
            zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzM(view, 4, null);
        }
        if (zzaaoVarZzg == null) {
            return "";
        }
        zze();
        return zzaaoVarZzg.zzl(zzh(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final String zzm(Context context, String str, View view) {
        return zzl(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzn(View view) {
        zzaao zzaaoVarZzg = zzg();
        if (zzaaoVarZzg != null) {
            zzaaoVarZzg.zzn(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final String zzo(Context context, View view, Activity activity) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgU)).booleanValue()) {
            zzaao zzaaoVarZzg = zzg();
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgV)).booleanValue()) {
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
            }
            return zzaaoVarZzg != null ? zzaaoVarZzg.zzo(context, view, null) : "";
        }
        if (!zzb()) {
            return "";
        }
        zzaao zzaaoVarZzg2 = zzg();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgV)).booleanValue()) {
            zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
        }
        return zzaaoVarZzg2 != null ? zzaaoVarZzg2.zzo(context, view, null) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final String zzp(Context context) {
        zzaao zzaaoVarZzg;
        if (!zzb() || (zzaaoVarZzg = zzg()) == null) {
            return "";
        }
        zze();
        return zzaaoVarZzg.zzp(zzh(context));
    }
}
