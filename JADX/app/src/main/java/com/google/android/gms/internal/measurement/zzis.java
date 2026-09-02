package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzis {
    private static final zzir zza;
    private static final zzir zzb;

    static {
        zzir zzirVar;
        try {
            zzirVar = (zzir) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzirVar = null;
        }
        zza = zzirVar;
        zzb = new zzir();
    }

    static zzir zza() {
        return zza;
    }

    static zzir zzb() {
        return zzb;
    }
}
