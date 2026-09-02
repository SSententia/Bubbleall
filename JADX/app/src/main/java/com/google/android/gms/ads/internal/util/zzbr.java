package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvy;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzxj;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzbr {
    private static zzwf zzb;
    private static final Object zzc = new Object();

    @Deprecated
    public static final zzbm<Void> zza = new zzbj();

    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:8:0x0011, B:10:0x0015, B:12:0x001e, B:14:0x0030, B:16:0x003a, B:15:0x0035, B:17:0x003c), top: B:22:0x0011 }] */
    public zzbr(Context context) {
        zzwf zzwfVarZza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbjl.zza(context);
                if (ClientLibraryUtils.isPackageSide()) {
                    zzwfVarZza = zzxj.zza(context, null);
                } else {
                    if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcQ)).booleanValue()) {
                        zzwfVarZza = zzba.zzb(context);
                    } else {
                        zzwfVarZza = zzxj.zza(context, null);
                    }
                }
                zzb = zzwfVarZza;
            }
        }
    }

    public final zzfsm<zzvy> zza(String str) {
        zzchl zzchlVar = new zzchl();
        zzb.zzb(new zzbq(str, null, zzchlVar));
        return zzchlVar;
    }

    public final zzfsm<String> zzb(int i, String str, Map<String, String> map, byte[] bArr) {
        zzbo zzboVar = new zzbo(null);
        zzbk zzbkVar = new zzbk(this, str, zzboVar);
        zzcgs zzcgsVar = new zzcgs(null);
        zzbl zzblVar = new zzbl(this, i, str, zzboVar, zzbkVar, bArr, map, zzcgsVar);
        if (zzcgs.zzj()) {
            try {
                zzcgsVar.zzb(str, "GET", zzblVar.zzn(), zzblVar.zzo());
            } catch (zzvk e) {
                zze.zzi(e.getMessage());
            }
        }
        zzb.zzb(zzblVar);
        return zzboVar;
    }
}
