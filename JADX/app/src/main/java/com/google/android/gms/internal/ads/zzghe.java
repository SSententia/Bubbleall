package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzghe {
    private static final zzghd zza;
    private static final zzghd zzb;

    static {
        zzghd zzghdVar;
        try {
            zzghdVar = (zzghd) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzghdVar = null;
        }
        zza = zzghdVar;
        zzb = new zzghd();
    }

    static zzghd zza() {
        return zza;
    }

    static zzghd zzb() {
        return zzb;
    }
}
