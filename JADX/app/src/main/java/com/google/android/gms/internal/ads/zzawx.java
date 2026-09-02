package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzawx {
    private final Object zza = new Object();
    private zzawv zzb = null;
    private boolean zzc = false;

    public final void zza(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzawv();
                }
                this.zzb.zzf(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zzb(zzaww zzawwVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzawv();
            }
            this.zzb.zzg(zzawwVar);
        }
    }

    public final Activity zzd() {
        synchronized (this.zza) {
            zzawv zzawvVar = this.zzb;
            if (zzawvVar == null) {
                return null;
            }
            return zzawvVar.zzi();
        }
    }

    public final Context zze() {
        synchronized (this.zza) {
            zzawv zzawvVar = this.zzb;
            if (zzawvVar == null) {
                return null;
            }
            return zzawvVar.zzj();
        }
    }

    public final void zzc(zzaww zzawwVar) {
        synchronized (this.zza) {
            zzawv zzawvVar = this.zzb;
            if (zzawvVar == null) {
                return;
            }
            zzawvVar.zzh(zzawwVar);
        }
    }
}
