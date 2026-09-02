package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzctd implements zzfrz<String> {
    final /* synthetic */ zzctf zza;

    zzctd(zzctf zzctfVar) {
        this.zza = zzctfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(String str) {
        String str2 = str;
        zzfbb zzfbbVar = this.zza.zzh;
        List<String> listZzb = this.zza.zzg.zzb(this.zza.zze, this.zza.zzf, false, "", str2, this.zza.zzf.zzc);
        com.google.android.gms.ads.internal.zzt.zzc();
        zzfbbVar.zzb(listZzb, true == com.google.android.gms.ads.internal.util.zzs.zzI(this.zza.zza) ? 2 : 1);
    }
}
