package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaml implements zzalg {
    private static final List<zzamk> zza = new ArrayList(50);
    private final Handler zzb;

    public zzaml(Handler handler) {
        this.zzb = handler;
    }

    static /* synthetic */ void zzk(zzamk zzamkVar) {
        List<zzamk> list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzamkVar);
            }
        }
    }

    private static zzamk zzl() {
        zzamk zzamkVar;
        List<zzamk> list = zza;
        synchronized (list) {
            zzamkVar = list.isEmpty() ? new zzamk(null) : list.remove(list.size() - 1);
        }
        return zzamkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zza(int i) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final zzalf zzb(int i) {
        zzamk zzamkVarZzl = zzl();
        zzamkVarZzl.zzb(this.zzb.obtainMessage(i), this);
        return zzamkVarZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final zzalf zzc(int i, Object obj) {
        zzamk zzamkVarZzl = zzl();
        zzamkVarZzl.zzb(this.zzb.obtainMessage(i, obj), this);
        return zzamkVarZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final zzalf zzd(int i, int i2, int i3) {
        zzamk zzamkVarZzl = zzl();
        zzamkVarZzl.zzb(this.zzb.obtainMessage(1, i2, i3), this);
        return zzamkVarZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zze(zzalf zzalfVar) {
        return ((zzamk) zzalfVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zzf(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zzg(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final void zzh(int i) {
        this.zzb.removeMessages(2);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final void zzi(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    public final boolean zzj(Runnable runnable) {
        return this.zzb.post(runnable);
    }
}
