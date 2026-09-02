package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzij extends zzik {
    private zzij() {
        super(null);
    }

    /* synthetic */ zzij(zzih zzihVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    final void zza(Object obj, long j) {
        ((zzhy) zzkf.zzn(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    final <E> void zzb(Object obj, Object obj2, long j) {
        zzhy zzhyVarZze = (zzhy) zzkf.zzn(obj, j);
        zzhy zzhyVar = (zzhy) zzkf.zzn(obj2, j);
        int size = zzhyVarZze.size();
        int size2 = zzhyVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzhyVarZze.zza()) {
                zzhyVarZze = zzhyVarZze.zze(size2 + size);
            }
            zzhyVarZze.addAll(zzhyVar);
        }
        if (size > 0) {
            zzhyVar = zzhyVarZze;
        }
        zzkf.zzo(obj, j, zzhyVar);
    }
}
