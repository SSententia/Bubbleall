package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdgp {
    private final Set<zzdih<zzbcv>> zza;
    private final Set<zzdih<zzdio>> zzb;
    private final Set<zzdih<zzdbc>> zzc;
    private final Set<zzdih<zzdbw>> zzd;
    private final Set<zzdih<zzddb>> zze;
    private final Set<zzdih<zzdcq>> zzf;
    private final Set<zzdih<zzdcu>> zzg;
    private final Set<zzdih<zzdbf>> zzh;
    private final Set<zzdih<zzdbs>> zzi;
    private final Set<zzdih<zzfid>> zzj;
    private final Set<zzdih<zzamv>> zzk;
    private final Set<zzdih<zzddn>> zzl;
    private final Set<zzdih<com.google.android.gms.ads.internal.overlay.zzo>> zzm;
    private final Set<zzdih<zzddx>> zzn;
    private final zzexl zzo;
    private zzdbe zzp;
    private zzehp zzq;

    /* synthetic */ zzdgp(zzdgn zzdgnVar, zzdgo zzdgoVar) {
        this.zza = zzdgnVar.zzc;
        this.zzb = zzdgnVar.zzd;
        this.zzd = zzdgnVar.zzf;
        this.zze = zzdgnVar.zzg;
        this.zzc = zzdgnVar.zze;
        this.zzf = zzdgnVar.zzh;
        this.zzg = zzdgnVar.zza;
        this.zzh = zzdgnVar.zzi;
        this.zzi = zzdgnVar.zzl;
        this.zzj = zzdgnVar.zzj;
        this.zzk = zzdgnVar.zzk;
        this.zzl = zzdgnVar.zzm;
        this.zzo = zzdgnVar.zzo;
        this.zzm = zzdgnVar.zzn;
        this.zzn = zzdgnVar.zzb;
    }

    public final Set<zzdih<zzdbc>> zza() {
        return this.zzc;
    }

    public final Set<zzdih<zzdcq>> zzb() {
        return this.zzf;
    }

    public final Set<zzdih<zzdbf>> zzc() {
        return this.zzh;
    }

    public final Set<zzdih<zzdbs>> zzd() {
        return this.zzi;
    }

    public final Set<zzdih<zzfid>> zze() {
        return this.zzj;
    }

    public final Set<zzdih<zzamv>> zzf() {
        return this.zzk;
    }

    public final Set<zzdih<zzbcv>> zzg() {
        return this.zza;
    }

    final Set<zzdih<zzdio>> zzh() {
        return this.zzb;
    }

    public final Set<zzdih<zzdbw>> zzi() {
        return this.zzd;
    }

    public final Set<zzdih<zzddb>> zzj() {
        return this.zze;
    }

    public final Set<zzdih<zzddn>> zzk() {
        return this.zzl;
    }

    public final Set<zzdih<zzddx>> zzl() {
        return this.zzn;
    }

    final Set<zzdih<zzdcu>> zzm() {
        return this.zzg;
    }

    public final Set<zzdih<com.google.android.gms.ads.internal.overlay.zzo>> zzn() {
        return this.zzm;
    }

    public final zzexl zzo() {
        return this.zzo;
    }

    public final zzdbe zzp(Set<zzdih<zzdbf>> set) {
        if (this.zzp == null) {
            this.zzp = new zzdbe(set);
        }
        return this.zzp;
    }

    public final zzehp zzq(Clock clock, zzehq zzehqVar, zzeeh zzeehVar) {
        if (this.zzq == null) {
            this.zzq = new zzehp(clock, zzehqVar, zzeehVar);
        }
        return this.zzq;
    }
}
