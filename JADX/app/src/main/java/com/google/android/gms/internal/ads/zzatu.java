package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzatu {
    private zzatt zza;

    public abstract zzatv zzd(zzans[] zzansVarArr, zzatg zzatgVar) throws zzamy;

    public abstract void zze(Object obj);

    public final void zzf(zzatt zzattVar) {
        this.zza = zzattVar;
    }

    protected final void zzg() {
        zzatt zzattVar = this.zza;
        if (zzattVar != null) {
            zzattVar.zzk();
        }
    }
}
