package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfgy {
    private static zzfgy zza;
    private float zzb = 0.0f;
    private final zzfgq zzc;
    private final zzfgo zzd;
    private zzfgp zze;
    private zzfgr zzf;

    public zzfgy(zzfgq zzfgqVar, zzfgo zzfgoVar) {
        this.zzc = zzfgqVar;
        this.zzd = zzfgoVar;
    }

    public static zzfgy zza() {
        if (zza == null) {
            zza = new zzfgy(new zzfgq(), new zzfgo());
        }
        return zza;
    }

    public final void zzb(Context context) {
        this.zze = new zzfgp(new Handler(), context, new zzfgn(), this, null);
    }

    public final void zzc() {
        zzfgt.zza().zzg(this);
        zzfgt.zza().zzc();
        if (zzfgt.zza().zze()) {
            zzfhu.zzf().zzg();
        }
        this.zze.zza();
    }

    public final void zzd() {
        zzfhu.zzf().zzh();
        zzfgt.zza().zzd();
        this.zze.zzb();
    }

    public final void zze(float f) {
        this.zzb = f;
        if (this.zzf == null) {
            this.zzf = zzfgr.zza();
        }
        Iterator<zzfgg> it = this.zzf.zzf().iterator();
        while (it.hasNext()) {
            it.next().zzg().zzj(f);
        }
    }

    public final float zzf() {
        return this.zzb;
    }
}
