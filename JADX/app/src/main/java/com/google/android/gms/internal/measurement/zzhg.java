package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhg {
    private static final zzhe<?> zza = new zzhf();
    private static final zzhe<?> zzb;

    static {
        zzhe<?> zzheVar;
        try {
            zzheVar = (zzhe) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzheVar = null;
        }
        zzb = zzheVar;
    }

    static zzhe<?> zza() {
        return zza;
    }

    static zzhe<?> zzb() {
        zzhe<?> zzheVar = zzb;
        if (zzheVar != null) {
            return zzheVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
