package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhu implements zzfgz {
    private static final zzfhu zza = new zzfhu();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzj = new zzfhq();
    private static final Runnable zzk = new zzfhr();
    private int zze;
    private long zzi;
    private final List<zzfht> zzd = new ArrayList();
    private final zzfhn zzg = new zzfhn();
    private final zzfhb zzf = new zzfhb();
    private final zzfho zzh = new zzfho(new zzfhx());

    zzfhu() {
    }

    public static zzfhu zzf() {
        return zza;
    }

    static /* synthetic */ void zzj(zzfhu zzfhuVar) {
        zzfhuVar.zze = 0;
        zzfhuVar.zzi = System.nanoTime();
        zzfhuVar.zzg.zzd();
        long jNanoTime = System.nanoTime();
        zzfha zzfhaVarZza = zzfhuVar.zzf.zza();
        if (zzfhuVar.zzg.zzb().size() > 0) {
            for (String str : zzfhuVar.zzg.zzb()) {
                JSONObject jSONObjectZzb = zzfhi.zzb(0, 0, 0, 0);
                View viewZzh = zzfhuVar.zzg.zzh(str);
                zzfha zzfhaVarZzb = zzfhuVar.zzf.zzb();
                String strZzc = zzfhuVar.zzg.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza = zzfhaVarZzb.zza(viewZzh);
                    zzfhi.zzd(jSONObjectZza, str);
                    zzfhi.zze(jSONObjectZza, strZzc);
                    zzfhi.zzg(jSONObjectZzb, jSONObjectZza);
                }
                zzfhi.zzh(jSONObjectZzb);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                zzfhuVar.zzh.zzb(jSONObjectZzb, hashSet, jNanoTime);
            }
        }
        if (zzfhuVar.zzg.zza().size() > 0) {
            JSONObject jSONObjectZzb2 = zzfhi.zzb(0, 0, 0, 0);
            zzfhuVar.zzk(null, zzfhaVarZza, jSONObjectZzb2, 1);
            zzfhi.zzh(jSONObjectZzb2);
            zzfhuVar.zzh.zza(jSONObjectZzb2, zzfhuVar.zzg.zza(), jNanoTime);
        } else {
            zzfhuVar.zzh.zzc();
        }
        zzfhuVar.zzg.zze();
        long jNanoTime2 = System.nanoTime() - zzfhuVar.zzi;
        if (zzfhuVar.zzd.size() > 0) {
            for (zzfht zzfhtVar : zzfhuVar.zzd) {
                int i = zzfhuVar.zze;
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfhtVar.zzb();
                if (zzfhtVar instanceof zzfhs) {
                    int i2 = zzfhuVar.zze;
                    ((zzfhs) zzfhtVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfha zzfhaVar, JSONObject jSONObject, int i) {
        zzfhaVar.zzb(view, jSONObject, this, i == 1);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzk);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgz
    public final void zza(View view, zzfha zzfhaVar, JSONObject jSONObject) {
        int iZzj;
        if (zzfhl.zzb(view) != null || (iZzj = this.zzg.zzj(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfhaVar.zza(view);
        zzfhi.zzg(jSONObject, jSONObjectZza);
        String strZzg = this.zzg.zzg(view);
        if (strZzg != null) {
            zzfhi.zzd(jSONObjectZza, strZzg);
            this.zzg.zzf();
        } else {
            zzfhm zzfhmVarZzi = this.zzg.zzi(view);
            if (zzfhmVarZzi != null) {
                zzfhi.zzf(jSONObjectZza, zzfhmVarZzi);
            }
            zzk(view, zzfhaVar, jSONObjectZza, iZzj);
        }
        this.zze++;
    }

    public final void zzg() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzj);
            zzc.postDelayed(zzk, 200L);
        }
    }

    public final void zzh() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfhp(this));
    }

    public final void zzi() {
        zzl();
    }
}
