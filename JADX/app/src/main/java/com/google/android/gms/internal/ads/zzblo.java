package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzblo extends zzbly {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private static final int zzd;
    private final String zze;
    private final List<zzblr> zzf = new ArrayList();
    private final List<zzbmh> zzg = new ArrayList();
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        zzc = iRgb;
        int iRgb2 = Color.rgb(204, 204, 204);
        zzd = iRgb2;
        zza = iRgb2;
        zzb = iRgb;
    }

    public zzblo(String str, List<zzblr> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.zze = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzblr zzblrVar = list.get(i3);
            this.zzf.add(zzblrVar);
            this.zzg.add(zzblrVar);
        }
        this.zzh = num != null ? num.intValue() : zza;
        this.zzi = num2 != null ? num2.intValue() : zzb;
        this.zzj = num3 != null ? num3.intValue() : 12;
        this.zzk = i;
        this.zzl = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final String zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final List<zzbmh> zzc() {
        return this.zzg;
    }

    public final List<zzblr> zzd() {
        return this.zzf;
    }

    public final int zze() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zzi;
    }

    public final int zzg() {
        return this.zzj;
    }

    public final int zzh() {
        return this.zzk;
    }

    public final int zzi() {
        return this.zzl;
    }
}
