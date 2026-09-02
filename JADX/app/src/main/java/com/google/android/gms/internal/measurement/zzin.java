package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzin implements zziu {
    private final zziu[] zza;

    zzin(zziu... zziuVarArr) {
        this.zza = zziuVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zziu
    public final boolean zzb(Class<?> cls) {
        zziu[] zziuVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zziuVarArr[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zziu
    public final zzit zzc(Class<?> cls) {
        zziu[] zziuVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zziu zziuVar = zziuVarArr[i];
            if (zziuVar.zzb(cls)) {
                return zziuVar.zzc(cls);
            }
        }
        String strValueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new String("No factory is available for message type: "));
    }
}
