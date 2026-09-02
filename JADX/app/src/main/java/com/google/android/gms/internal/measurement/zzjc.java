package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjc {
    private static final zzjb zza;
    private static final zzjb zzb;

    static {
        zzjb zzjbVar;
        try {
            zzjbVar = (zzjb) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzjbVar = null;
        }
        zza = zzjbVar;
        zzb = new zzjb();
    }

    static zzjb zza() {
        return zza;
    }

    static zzjb zzb() {
        return zzb;
    }
}
