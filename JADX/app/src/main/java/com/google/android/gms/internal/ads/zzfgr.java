package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfgr {
    private static final zzfgr zza = new zzfgr();
    private final ArrayList<zzfgg> zzb = new ArrayList<>();
    private final ArrayList<zzfgg> zzc = new ArrayList<>();

    private zzfgr() {
    }

    public static zzfgr zza() {
        return zza;
    }

    public final void zzb(zzfgg zzfggVar) {
        this.zzb.add(zzfggVar);
    }

    public final void zzc(zzfgg zzfggVar) {
        boolean zZzg = zzg();
        this.zzc.add(zzfggVar);
        if (zZzg) {
            return;
        }
        zzfgy.zza().zzc();
    }

    public final void zzd(zzfgg zzfggVar) {
        boolean zZzg = zzg();
        this.zzb.remove(zzfggVar);
        this.zzc.remove(zzfggVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfgy.zza().zzd();
    }

    public final Collection<zzfgg> zze() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final Collection<zzfgg> zzf() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
