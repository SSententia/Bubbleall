package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhm implements zziu {
    private static final zzhm zza = new zzhm();

    private zzhm() {
    }

    public static zzhm zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zziu
    public final boolean zzb(Class<?> cls) {
        return zzhr.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zziu
    public final zzit zzc(Class<?> cls) {
        if (!zzhr.class.isAssignableFrom(cls)) {
            String strValueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzit) zzhr.zzbx(cls.asSubclass(zzhr.class)).zzl(3, null, null);
        } catch (Exception e) {
            String strValueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
