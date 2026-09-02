package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzaia {
    private final Context zza;
    private final zzahy zzb;
    private final zzaku zzc;
    private zzjz zzd;
    private final zzhq zze;
    private zzafy zzf;
    private final zzki zzg;
    private final zzcy zzh;
    private final Looper zzi;
    private final zzg zzj;
    private final zzahz zzk;
    private boolean zzl;
    private final zzadz zzm;

    @Deprecated
    public zzaia(Context context, zzahy zzahyVar) {
        zznq zznqVar = new zznq();
        zzjt zzjtVar = new zzjt(context);
        zzgt zzgtVar = new zzgt(context, zznqVar);
        zzaea zzaeaVar = new zzaea();
        zzkr zzkrVarZzg = zzkr.zzg(context);
        zzcy zzcyVar = new zzcy(zzaku.zza);
        this.zza = context;
        this.zzb = zzahyVar;
        this.zzd = zzjtVar;
        this.zze = zzgtVar;
        this.zzf = zzaeaVar;
        this.zzg = zzkrVarZzg;
        this.zzh = zzcyVar;
        this.zzi = zzamq.zzk();
        this.zzj = zzg.zza;
        this.zzk = zzahz.zze;
        this.zzm = new zzadz(0.97f, 1.03f, 1000L, 1.0E-7f, zzadx.zzb(20L), zzadx.zzb(500L), 0.999f, null);
        this.zzc = zzaku.zza;
    }

    @Deprecated
    public final zzaia zzl(zzjz zzjzVar) {
        zzakt.zzd(!this.zzl);
        this.zzd = zzjzVar;
        return this;
    }

    @Deprecated
    public final zzaia zzm(zzafy zzafyVar) {
        zzakt.zzd(!this.zzl);
        this.zzf = zzafyVar;
        return this;
    }

    @Deprecated
    public final zzaie zzn() {
        zzakt.zzd(!this.zzl);
        this.zzl = true;
        return new zzaie(this);
    }
}
