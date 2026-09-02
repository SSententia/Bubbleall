package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzecs implements zzdcq, zzdbf {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzedb zzd;

    public zzecs(zzedb zzedbVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzedbVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z) {
        int i;
        int iIntValue;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzex)).booleanValue() && !this.zzc.zzC()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                iIntValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzey)).intValue();
            }
            if (i >= iIntValue) {
                return;
            }
            this.zzd.zzf(z);
            synchronized (obj) {
                zzb++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzbD(zzbcz zzbczVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zzf() {
        zzb(true);
    }
}
