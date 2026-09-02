package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzhj {
    DOUBLE(0, 1, zzic.DOUBLE),
    FLOAT(1, 1, zzic.FLOAT),
    INT64(2, 1, zzic.LONG),
    UINT64(3, 1, zzic.LONG),
    INT32(4, 1, zzic.INT),
    FIXED64(5, 1, zzic.LONG),
    FIXED32(6, 1, zzic.INT),
    BOOL(7, 1, zzic.BOOLEAN),
    STRING(8, 1, zzic.STRING),
    MESSAGE(9, 1, zzic.MESSAGE),
    BYTES(10, 1, zzic.BYTE_STRING),
    UINT32(11, 1, zzic.INT),
    ENUM(12, 1, zzic.ENUM),
    SFIXED32(13, 1, zzic.INT),
    SFIXED64(14, 1, zzic.LONG),
    SINT32(15, 1, zzic.INT),
    SINT64(16, 1, zzic.LONG),
    GROUP(17, 1, zzic.MESSAGE),
    DOUBLE_LIST(18, 2, zzic.DOUBLE),
    FLOAT_LIST(19, 2, zzic.FLOAT),
    INT64_LIST(20, 2, zzic.LONG),
    UINT64_LIST(21, 2, zzic.LONG),
    INT32_LIST(22, 2, zzic.INT),
    FIXED64_LIST(23, 2, zzic.LONG),
    FIXED32_LIST(24, 2, zzic.INT),
    BOOL_LIST(25, 2, zzic.BOOLEAN),
    STRING_LIST(26, 2, zzic.STRING),
    MESSAGE_LIST(27, 2, zzic.MESSAGE),
    BYTES_LIST(28, 2, zzic.BYTE_STRING),
    UINT32_LIST(29, 2, zzic.INT),
    ENUM_LIST(30, 2, zzic.ENUM),
    SFIXED32_LIST(31, 2, zzic.INT),
    SFIXED64_LIST(32, 2, zzic.LONG),
    SINT32_LIST(33, 2, zzic.INT),
    SINT64_LIST(34, 2, zzic.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzic.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzic.FLOAT),
    INT64_LIST_PACKED(37, 3, zzic.LONG),
    UINT64_LIST_PACKED(38, 3, zzic.LONG),
    INT32_LIST_PACKED(39, 3, zzic.INT),
    FIXED64_LIST_PACKED(40, 3, zzic.LONG),
    FIXED32_LIST_PACKED(41, 3, zzic.INT),
    BOOL_LIST_PACKED(42, 3, zzic.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzic.INT),
    ENUM_LIST_PACKED(44, 3, zzic.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzic.INT),
    SFIXED64_LIST_PACKED(46, 3, zzic.LONG),
    SINT32_LIST_PACKED(47, 3, zzic.INT),
    SINT64_LIST_PACKED(48, 3, zzic.LONG),
    GROUP_LIST(49, 2, zzic.MESSAGE),
    MAP(50, 4, zzic.VOID);

    private static final zzhj[] zzac;
    private final zzic zzZ;
    private final int zzaa;
    private final Class<?> zzab;

    static {
        zzhj[] zzhjVarArrValues = values();
        zzac = new zzhj[zzhjVarArrValues.length];
        for (zzhj zzhjVar : zzhjVarArrValues) {
            zzac[zzhjVar.zzaa] = zzhjVar;
        }
    }

    zzhj(int i, int i2, zzic zzicVar) {
        this.zzaa = i;
        this.zzZ = zzicVar;
        zzic zzicVar2 = zzic.VOID;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            this.zzab = zzicVar.zza();
        } else {
            this.zzab = null;
        }
        if (i2 == 1) {
            zzicVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzaa;
    }
}
