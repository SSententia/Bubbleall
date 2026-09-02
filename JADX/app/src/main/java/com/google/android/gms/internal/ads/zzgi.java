package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgi implements zzhh {
    private final ArrayList<zzhg> zza = new ArrayList<>(1);
    private final HashSet<zzhg> zzb = new HashSet<>(1);
    private final zzho zzc = new zzho();
    private final zzfa zzd = new zzfa();
    private Looper zze;
    private zzaiq zzf;

    protected void zzF() {
    }

    protected abstract void zza(zzay zzayVar);

    protected void zzc() {
    }

    protected abstract void zzd();

    protected final void zze(zzaiq zzaiqVar) {
        this.zzf = zzaiqVar;
        ArrayList<zzhg> arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).zza(this, zzaiqVar);
        }
    }

    protected final zzho zzf(zzhf zzhfVar) {
        return this.zzc.zza(0, zzhfVar, 0L);
    }

    protected final zzho zzg(int i, zzhf zzhfVar, long j) {
        return this.zzc.zza(i, zzhfVar, 0L);
    }

    protected final zzfa zzh(zzhf zzhfVar) {
        return this.zzd.zza(0, zzhfVar);
    }

    protected final zzfa zzi(int i, zzhf zzhfVar) {
        return this.zzd.zza(i, zzhfVar);
    }

    protected final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzl(zzhp zzhpVar) {
        this.zzc.zzc(zzhpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzn(zzfb zzfbVar) {
        this.zzd.zzc(zzfbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzo(zzhg zzhgVar, zzay zzayVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        zzakt.zza(z);
        zzaiq zzaiqVar = this.zzf;
        this.zza.add(zzhgVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzhgVar);
            zza(zzayVar);
        } else if (zzaiqVar != null) {
            zzp(zzhgVar);
            zzhgVar.zza(this, zzaiqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzp(zzhg zzhgVar) {
        this.zze.getClass();
        boolean zIsEmpty = this.zzb.isEmpty();
        this.zzb.add(zzhgVar);
        if (zIsEmpty) {
            zzF();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzq(zzhg zzhgVar) {
        boolean zIsEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzhgVar);
        if ((!zIsEmpty) && this.zzb.isEmpty()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzr(zzhg zzhgVar) {
        this.zza.remove(zzhgVar);
        if (!this.zza.isEmpty()) {
            zzq(zzhgVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzb.clear();
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzaiq zzs() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final boolean zzt() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzk(Handler handler, zzhp zzhpVar) {
        zzhpVar.getClass();
        this.zzc.zzb(handler, zzhpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzm(Handler handler, zzfb zzfbVar) {
        zzfbVar.getClass();
        this.zzd.zzb(handler, zzfbVar);
    }
}
