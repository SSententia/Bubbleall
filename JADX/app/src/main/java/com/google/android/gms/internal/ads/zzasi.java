package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzasi implements zzaul {
    final /* synthetic */ zzasl zza;
    private final Uri zzb;
    private final zzatz zzc;
    private final zzasj zzd;
    private final zzaur zze;
    private final zzapt zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;

    public zzasi(zzasl zzaslVar, Uri uri, zzatz zzatzVar, zzasj zzasjVar, zzaur zzaurVar) {
        this.zza = zzaslVar;
        uri.getClass();
        this.zzb = uri;
        zzatzVar.getClass();
        this.zzc = zzatzVar;
        zzasjVar.getClass();
        this.zzd = zzasjVar;
        this.zze = zzaurVar;
        this.zzf = new zzapt();
        this.zzh = true;
        this.zzj = -1L;
    }

    public final void zzb(long j, long j2) {
        this.zzf.zza = j;
        this.zzi = j2;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zzc() {
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final boolean zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zze() throws Throwable {
        zzapn zzapnVar;
        long j;
        while (!this.zzg) {
            int i = 0;
            try {
                long j2 = this.zzf.zza;
                long jZza = this.zzc.zza(new zzaub(this.zzb, null, j2, j2, -1L, null, 0));
                this.zzj = jZza;
                if (jZza != -1) {
                    j = j2;
                    jZza += j;
                    this.zzj = jZza;
                } else {
                    j = j2;
                }
                zzapnVar = new zzapn(this.zzc, j, jZza);
                try {
                    zzapo zzapoVarZzb = this.zzd.zzb(zzapnVar, this.zzc.zzc());
                    if (this.zzh) {
                        zzapoVarZzb.zze(j, this.zzi);
                        this.zzh = false;
                    }
                    int iZzg = 0;
                    long jZzh = j;
                    while (iZzg == 0) {
                        try {
                            if (this.zzg) {
                                iZzg = 0;
                                break;
                            }
                            this.zze.zzc();
                            iZzg = zzapoVarZzb.zzg(zzapnVar, this.zzf);
                            if (zzapnVar.zzh() > this.zza.zzg + jZzh) {
                                jZzh = zzapnVar.zzh();
                                this.zze.zzb();
                                this.zza.zzm.post(this.zza.zzl);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = iZzg;
                            if (i != 1 && zzapnVar != null) {
                                this.zzf.zza = zzapnVar.zzh();
                            }
                            zzave.zzc(this.zzc);
                            throw th;
                        }
                    }
                    if (iZzg != 1) {
                        this.zzf.zza = zzapnVar.zzh();
                        i = iZzg;
                    }
                    zzave.zzc(this.zzc);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                zzapnVar = null;
            }
        }
    }
}
