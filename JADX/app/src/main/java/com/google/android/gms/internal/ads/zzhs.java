package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhs implements zziu {
    private final zziu zza;
    private final long zzb;

    public zzhs(zziu zziuVar, long j) {
        this.zza = zziuVar;
        this.zzb = j;
    }

    public final zziu zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final int zzd(zzafw zzafwVar, zzaf zzafVar, int i) {
        int iZzd = this.zza.zzd(zzafwVar, zzafVar, i);
        if (iZzd != -4) {
            return iZzd;
        }
        zzafVar.zzd = Math.max(0L, zzafVar.zzd + this.zzb);
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final int zze(long j) {
        return this.zza.zze(j - this.zzb);
    }
}
