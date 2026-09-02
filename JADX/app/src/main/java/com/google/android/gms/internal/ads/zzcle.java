package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcle extends zzcla {
    public zzcle(zzcjb zzcjbVar) {
        super(zzcjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final boolean zzd(String str) {
        String strZzd = zzcgm.zzd(str);
        zzcjb zzcjbVar = this.zzc.get();
        if (zzcjbVar != null && strZzd != null) {
            zzcjbVar.zzu(strZzd, this);
        }
        com.google.android.gms.ads.internal.util.zze.zzi("VideoStreamNoopCache is doing nothing.");
        zzr(str, strZzd, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzm() {
    }
}
