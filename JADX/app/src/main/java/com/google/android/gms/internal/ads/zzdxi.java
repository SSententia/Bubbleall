package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdxi implements zzfrz<String> {
    final /* synthetic */ zzdxk zza;

    zzdxi(zzdxk zzdxkVar) {
        this.zza = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        synchronized (this) {
            zzdxk.zza(this.zza, true);
            this.zza.zzu("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - this.zza.zzd));
            this.zza.zze.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(@Nullable String str) {
        final String str2 = str;
        synchronized (this) {
            zzdxk.zza(this.zza, true);
            this.zza.zzu("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - this.zza.zzd));
            this.zza.zzi.execute(new Runnable(this, str2) { // from class: com.google.android.gms.internal.ads.zzdxh
                private final zzdxi zza;
                private final String zzb;

                {
                    this.zza = this;
                    this.zzb = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzdxi zzdxiVar = this.zza;
                    zzdxk.zzk(zzdxiVar.zza, this.zzb);
                }
            });
        }
    }
}
