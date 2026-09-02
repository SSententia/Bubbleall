package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzggu extends zzggw {
    private zzggu() {
        super(null);
    }

    /* synthetic */ zzggu(zzggv zzggvVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzggw
    final <L> List<L> zza(Object obj, long j) {
        zzggj zzggjVar = (zzggj) zzgiy.zzn(obj, j);
        if (zzggjVar.zza()) {
            return zzggjVar;
        }
        int size = zzggjVar.size();
        zzggj zzggjVarZze = zzggjVar.zze(size == 0 ? 10 : size + size);
        zzgiy.zzo(obj, j, zzggjVarZze);
        return zzggjVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzggw
    final void zzb(Object obj, long j) {
        ((zzggj) zzgiy.zzn(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzggw
    final <E> void zzc(Object obj, Object obj2, long j) {
        zzggj zzggjVarZze = (zzggj) zzgiy.zzn(obj, j);
        zzggj zzggjVar = (zzggj) zzgiy.zzn(obj2, j);
        int size = zzggjVarZze.size();
        int size2 = zzggjVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzggjVarZze.zza()) {
                zzggjVarZze = zzggjVarZze.zze(size2 + size);
            }
            zzggjVarZze.addAll(zzggjVar);
        }
        if (size > 0) {
            zzggjVar = zzggjVarZze;
        }
        zzgiy.zzo(obj, j, zzggjVar);
    }
}
