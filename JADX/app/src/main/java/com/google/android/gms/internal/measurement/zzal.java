package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.internal.zzfh;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzal extends zzbh {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zzbs zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzal(zzbs zzbsVar, String str, String str2, Context context, Bundle bundle) {
        super(zzbsVar, true);
        this.zze = zzbsVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = context;
        this.zzd = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzbh
    public final void zza() {
        String str;
        String str2;
        String str3;
        try {
            zzbs zzbsVar = this.zze;
            if (zzbs.zzV(this.zza, this.zzb)) {
                str3 = this.zzb;
                str2 = this.zza;
                str = this.zze.zzd;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.zzc);
            zzbs zzbsVar2 = this.zze;
            zzbsVar2.zzj = zzbsVar2.zzc(this.zzc, true);
            if (this.zze.zzj == null) {
                Log.w(this.zze.zzd, "Failed to connect to measurement client.");
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(this.zzc, "com.google.android.gms.measurement.dynamite");
            int remoteVersion = DynamiteModule.getRemoteVersion(this.zzc, "com.google.android.gms.measurement.dynamite");
            ((zzq) Preconditions.checkNotNull(this.zze.zzj)).initialize(ObjectWrapper.wrap(this.zzc), new zzz(39065L, Math.max(localVersion, remoteVersion), remoteVersion < localVersion, str, str2, str3, this.zzd, zzfh.zza(this.zzc)), this.zzh);
        } catch (Exception e) {
            this.zze.zzT(e, true, false);
        }
    }
}
