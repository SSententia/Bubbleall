package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwh;
import com.google.android.gms.internal.ads.zzxh;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzbl extends zzxh {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzcgs zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbl(zzbr zzbrVar, int i, String str, zzwh zzwhVar, zzwg zzwgVar, byte[] bArr, Map map, zzcgs zzcgsVar) {
        super(i, str, zzwhVar, zzwgVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzcgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final Map<String, String> zzn() throws zzvk {
        Map<String, String> map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final byte[] zzo() throws zzvk {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzxh, com.google.android.gms.internal.ads.zzwc
    protected final /* bridge */ /* synthetic */ void zzt(String str) {
        zzt(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzxh
    /* JADX INFO: renamed from: zzz */
    public final void zzt(String str) {
        this.zzc.zze(str);
        super.zzt(str);
    }
}
