package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzao implements zzai {
    private zzay zzb;
    private String zzc;
    private boolean zzf;
    private final zzav zza = new zzav();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzao zzb(String str) {
        this.zzc = str;
        return this;
    }

    public final zzao zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzao zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzao zze(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzao zzf(zzay zzayVar) {
        this.zzb = zzayVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzai
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzaq zza() {
        zzaq zzaqVar = new zzaq(this.zzc, this.zzd, this.zze, this.zzf, this.zza, null, false, null);
        zzay zzayVar = this.zzb;
        if (zzayVar != null) {
            zzaqVar.zza(zzayVar);
        }
        return zzaqVar;
    }
}
