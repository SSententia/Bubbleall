package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaec implements zzalp {
    private final zzamh zza;
    private final zzaeb zzb;
    private zzahv zzc;
    private zzalp zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzaec(zzaeb zzaebVar, zzaku zzakuVar) {
        this.zzb = zzaebVar;
        this.zza = new zzamh(zzakuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final zzahf zzA() {
        zzalp zzalpVar = this.zzd;
        return zzalpVar != null ? zzalpVar.zzA() : this.zza.zzA();
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j) {
        this.zza.zzc(j);
    }

    public final void zzd(zzahv zzahvVar) throws zzaeg {
        zzalp zzalpVar;
        zzalp zzalpVarZzi = zzahvVar.zzi();
        if (zzalpVarZzi == null || zzalpVarZzi == (zzalpVar = this.zzd)) {
            return;
        }
        if (zzalpVar != null) {
            throw zzaeg.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzalpVarZzi;
        this.zzc = zzahvVar;
        zzalpVarZzi.zzz(this.zza.zzA());
    }

    public final void zze(zzahv zzahvVar) {
        if (zzahvVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    public final long zzf(boolean z) {
        zzahf zzahfVarZzA;
        zzahv zzahvVar = this.zzc;
        if (zzahvVar == null || zzahvVar.zzw() || (!this.zzc.zzx() && (z || this.zzc.zzak()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zza();
            }
        } else {
            zzalp zzalpVar = this.zzd;
            zzalpVar.getClass();
            long jZzy = zzalpVar.zzy();
            if (!this.zze) {
                this.zza.zzc(jZzy);
                zzahfVarZzA = zzalpVar.zzA();
                if (!zzahfVarZzA.equals(this.zza.zzA())) {
                    this.zza.zzz(zzahfVarZzA);
                    this.zzb.zzb(zzahfVarZzA);
                }
            } else if (jZzy < this.zza.zzy()) {
                this.zza.zzb();
            } else {
                this.zze = false;
                if (this.zzf) {
                    this.zza.zza();
                }
                this.zza.zzc(jZzy);
                zzahfVarZzA = zzalpVar.zzA();
                if (!zzahfVarZzA.equals(this.zza.zzA())) {
                    this.zza.zzz(zzahfVarZzA);
                    this.zzb.zzb(zzahfVarZzA);
                }
            }
        }
        if (this.zze) {
            return this.zza.zzy();
        }
        zzalp zzalpVar2 = this.zzd;
        zzalpVar2.getClass();
        return zzalpVar2.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final long zzy() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzz(zzahf zzahfVar) {
        zzalp zzalpVar = this.zzd;
        if (zzalpVar != null) {
            zzalpVar.zzz(zzahfVar);
            zzahfVar = this.zzd.zzA();
        }
        this.zza.zzz(zzahfVar);
    }
}
