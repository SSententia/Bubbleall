package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzern implements zzery<zzero> {
    private final zzfsn zza;
    private final Context zzb;
    private final zzcgz zzc;

    public zzern(zzfsn zzfsnVar, Context context, zzcgz zzcgzVar) {
        this.zza = zzfsnVar;
        this.zzb = context;
        this.zzc = zzcgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzero> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzerm
            private final zzern zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    final /* synthetic */ zzero zzb() throws Exception {
        boolean zIsCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzH = com.google.android.gms.ads.internal.util.zzs.zzH(this.zzb);
        String str = this.zzc.zza;
        com.google.android.gms.ads.internal.zzt.zze();
        boolean zZzu = com.google.android.gms.ads.internal.util.zzad.zzu();
        com.google.android.gms.ads.internal.zzt.zzc();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        return new zzero(zIsCallerInstantApp, zZzH, str, zZzu, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.getRemoteVersion(this.zzb, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(this.zzb, ModuleDescriptor.MODULE_ID));
    }
}
