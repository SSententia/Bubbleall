package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabp implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzabr zzb;

    zzabp(zzabr zzabrVar, int i, boolean z) {
        this.zzb = zzabrVar;
        this.zza = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzyz zzyzVarZza;
        zzabr zzabrVar = this.zzb;
        int i = this.zza;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzabrVar.zza.getPackageManager().getPackageInfo(zzabrVar.zza.getPackageName(), 0);
            Context context = zzabrVar.zza;
            zzyzVarZza = zzfiq.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzyzVarZza = null;
        }
        this.zzb.zzm = zzyzVarZza;
        if (this.zza < 4) {
            if (zzyzVarZza != null && zzyzVarZza.zza() && !zzyzVarZza.zzc().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzyzVarZza.zzf() && zzyzVarZza.zzg().zza() && zzyzVarZza.zzg().zzc() != -2) {
                return;
            }
            this.zzb.zzs(this.zza + 1, true);
        }
    }
}
