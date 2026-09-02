package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzkl {
    DOUBLE(zzkm.DOUBLE, 1),
    FLOAT(zzkm.FLOAT, 5),
    INT64(zzkm.LONG, 0),
    UINT64(zzkm.LONG, 0),
    INT32(zzkm.INT, 0),
    FIXED64(zzkm.LONG, 1),
    FIXED32(zzkm.INT, 5),
    BOOL(zzkm.BOOLEAN, 0),
    STRING(zzkm.STRING, 2),
    GROUP(zzkm.MESSAGE, 3),
    MESSAGE(zzkm.MESSAGE, 2),
    BYTES(zzkm.BYTE_STRING, 2),
    UINT32(zzkm.INT, 0),
    ENUM(zzkm.ENUM, 0),
    SFIXED32(zzkm.INT, 5),
    SFIXED64(zzkm.LONG, 1),
    SINT32(zzkm.INT, 0),
    SINT64(zzkm.LONG, 0);

    private final zzkm zzs;

    zzkl(zzkm zzkmVar, int i) {
        this.zzs = zzkmVar;
    }

    public final zzkm zza() {
        return this.zzs;
    }
}
