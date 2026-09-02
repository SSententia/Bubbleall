package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzgby extends zzgga<zzgby, zzgbx> implements zzghj {
    private static final zzgby zzf;
    private String zzb = "";
    private zzggj<zzgax> zze = zzaE();

    static {
        zzgby zzgbyVar = new zzgby();
        zzf = zzgbyVar;
        zzgga.zzay(zzgby.class, zzgbyVar);
    }

    private zzgby() {
    }

    public static zzgby zzc() {
        return zzf;
    }

    public final List<zzgax> zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zze", zzgax.class});
        }
        if (i2 == 3) {
            return new zzgby();
        }
        zzgbw zzgbwVar = null;
        if (i2 == 4) {
            return new zzgbx(zzgbwVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }
}
