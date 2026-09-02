package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgho {
    private static final zzghn zza;
    private static final zzghn zzb;

    static {
        zzghn zzghnVar;
        try {
            zzghnVar = (zzghn) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzghnVar = null;
        }
        zza = zzghnVar;
        zzb = new zzghn();
    }

    static zzghn zza() {
        return zza;
    }

    static zzghn zzb() {
        return zzb;
    }
}
