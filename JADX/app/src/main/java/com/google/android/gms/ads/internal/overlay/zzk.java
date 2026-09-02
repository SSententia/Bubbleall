package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.internal.util.zzad;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzk extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzl zza;

    /* synthetic */ zzk(zzl zzlVar, zzi zziVar) {
        this.zza = zzlVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Bitmap bitmapZza = com.google.android.gms.ads.internal.zzt.zzv().zza(Integer.valueOf(this.zza.zzc.zzo.zzf));
        if (bitmapZza != null) {
            zzad zzadVarZze = com.google.android.gms.ads.internal.zzt.zze();
            zzl zzlVar = this.zza;
            Activity activity = zzlVar.zzb;
            com.google.android.gms.ads.internal.zzj zzjVar = zzlVar.zzc.zzo;
            final Drawable drawableZzd = zzadVarZze.zzd(activity, bitmapZza, zzjVar.zzd, zzjVar.zze);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this, drawableZzd) { // from class: com.google.android.gms.ads.internal.overlay.zzj
                private final zzk zza;
                private final Drawable zzb;

                {
                    this.zza = this;
                    this.zzb = drawableZzd;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzk zzkVar = this.zza;
                    zzkVar.zza.zzb.getWindow().setBackgroundDrawable(this.zzb);
                }
            });
        }
    }
}
