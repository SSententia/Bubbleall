package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaam implements Runnable {
    final /* synthetic */ zzaan zza;

    zzaam(zzaan zzaanVar) {
        this.zza = zzaanVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.zza.zzb != null) {
            return;
        }
        synchronized (zzaan.zzd) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = zzbjl.zzbF.zze().booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzaan.zza = new zzfkk(this.zza.zzc.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z = zBooleanValue;
            this.zza.zzb = Boolean.valueOf(z);
            zzaan.zzd.open();
        }
    }
}
