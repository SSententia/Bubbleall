package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcah {
    private static zzcfn zzd;
    private final Context zza;
    private final AdFormat zzb;
    private final zzbhj zzc;

    public zzcah(Context context, AdFormat adFormat, zzbhj zzbhjVar) {
        this.zza = context;
        this.zzb = adFormat;
        this.zzc = zzbhjVar;
    }

    public static zzcfn zza(Context context) {
        zzcfn zzcfnVar;
        synchronized (zzcah.class) {
            if (zzd == null) {
                zzd = zzber.zzb().zzq(context, new zzbvd());
            }
            zzcfnVar = zzd;
        }
        return zzcfnVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzcfn zzcfnVarZza = zza(this.zza);
        if (zzcfnVarZza == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        try {
            zzcfnVarZza.zze(ObjectWrapper.wrap(this.zza), new zzcfr(null, this.zzb.name(), null, this.zzc == null ? new zzbdh().zza() : zzbdk.zza.zza(this.zza, this.zzc)), new zzcag(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
