package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.work.WorkRequest;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzasl implements zzasp, zzapp, zzauj, zzasz {
    private long zzB;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private final zzauc zzG;
    private final Uri zza;
    private final zzatz zzb;
    private final int zzc;
    private final Handler zzd;
    private final zzasm zze;
    private final zzasq zzf;
    private final long zzg;
    private final zzasj zzi;
    private zzaso zzo;
    private zzapv zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzu;
    private zzatg zzv;
    private long zzw;
    private boolean[] zzx;
    private boolean[] zzy;
    private boolean zzz;
    private final zzaun zzh = new zzaun("Loader:ExtractorMediaPeriod");
    private final zzaur zzj = new zzaur();
    private final Runnable zzk = new zzase(this);
    private final Runnable zzl = new zzasf(this);
    private final Handler zzm = new Handler();
    private long zzC = -9223372036854775807L;
    private final SparseArray<zzata> zzn = new SparseArray<>();
    private long zzA = -1;

    public zzasl(Uri uri, zzatz zzatzVar, zzapo[] zzapoVarArr, int i, Handler handler, zzasm zzasmVar, zzasq zzasqVar, zzauc zzaucVar, String str, int i2, byte[] bArr) {
        this.zza = uri;
        this.zzb = zzatzVar;
        this.zzc = i;
        this.zzd = handler;
        this.zze = zzasmVar;
        this.zzf = zzasqVar;
        this.zzG = zzaucVar;
        this.zzg = i2;
        this.zzi = new zzasj(zzapoVarArr, this);
    }

    private final void zzC(zzasi zzasiVar) {
        if (this.zzA == -1) {
            this.zzA = zzasiVar.zzj;
        }
    }

    private final void zzD() {
        zzapv zzapvVar;
        zzasi zzasiVar = new zzasi(this, this.zza, this.zzb, this.zzi, this.zzj);
        if (this.zzr) {
            zzaup.zzd(zzG());
            long j = this.zzw;
            if (j != -9223372036854775807L && this.zzC >= j) {
                this.zzE = true;
                this.zzC = -9223372036854775807L;
                return;
            } else {
                zzasiVar.zzb(this.zzp.zzc(this.zzC), this.zzC);
                this.zzC = -9223372036854775807L;
            }
        }
        this.zzD = zzE();
        int i = this.zzc;
        if (i == -1) {
            i = (this.zzr && this.zzA == -1 && ((zzapvVar = this.zzp) == null || zzapvVar.zzb() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzh.zze(zzasiVar, this, i);
    }

    private final int zzE() {
        int size = this.zzn.size();
        int iZzf = 0;
        for (int i = 0; i < size; i++) {
            iZzf += this.zzn.valueAt(i).zzf();
        }
        return iZzf;
    }

    private final long zzF() {
        int size = this.zzn.size();
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, this.zzn.valueAt(i).zzj());
        }
        return jMax;
    }

    private final boolean zzG() {
        return this.zzC != -9223372036854775807L;
    }

    static /* synthetic */ void zzx(zzasl zzaslVar) {
        if (zzaslVar.zzF || zzaslVar.zzr || zzaslVar.zzp == null || !zzaslVar.zzq) {
            return;
        }
        int size = zzaslVar.zzn.size();
        for (int i = 0; i < size; i++) {
            if (zzaslVar.zzn.valueAt(i).zzi() == null) {
                return;
            }
        }
        zzaslVar.zzj.zzb();
        zzatf[] zzatfVarArr = new zzatf[size];
        zzaslVar.zzy = new boolean[size];
        zzaslVar.zzx = new boolean[size];
        zzaslVar.zzw = zzaslVar.zzp.zzb();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                zzaslVar.zzv = new zzatg(zzatfVarArr);
                zzaslVar.zzr = true;
                zzaslVar.zzf.zzi(new zzate(zzaslVar.zzw, zzaslVar.zzp.zza()), null);
                zzaslVar.zzo.zzj(zzaslVar);
                return;
            }
            zzanm zzanmVarZzi = zzaslVar.zzn.valueAt(i2).zzi();
            zzatfVarArr[i2] = new zzatf(zzanmVarZzi);
            String str = zzanmVarZzi.zzf;
            if (!zzauu.zzb(str) && !zzauu.zza(str)) {
                z = false;
            }
            zzaslVar.zzy[i2] = z;
            zzaslVar.zzz = z | zzaslVar.zzz;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final /* bridge */ /* synthetic */ void zzA(zzaul zzaulVar, long j, long j2) {
        zzC((zzasi) zzaulVar);
        this.zzE = true;
        if (this.zzw == -9223372036854775807L) {
            long jZzF = zzF();
            long j3 = jZzF == Long.MIN_VALUE ? 0L : jZzF + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzw = j3;
            this.zzf.zzi(new zzate(j3, this.zzp.zza()), null);
        }
        this.zzo.zzbh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzB(zzatk[] zzatkVarArr, boolean[] zArr, zzatb[] zzatbVarArr, boolean[] zArr2, long j) {
        zzatk zzatkVar;
        zzaup.zzd(this.zzr);
        for (int i = 0; i < zzatkVarArr.length; i++) {
            zzatb zzatbVar = zzatbVarArr[i];
            if (zzatbVar != null && (zzatkVarArr[i] == null || !zArr[i])) {
                int i2 = ((zzask) zzatbVar).zzb;
                zzaup.zzd(this.zzx[i2]);
                this.zzu--;
                this.zzx[i2] = false;
                this.zzn.valueAt(i2).zzg();
                zzatbVarArr[i] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < zzatkVarArr.length; i3++) {
            if (zzatbVarArr[i3] == null && (zzatkVar = zzatkVarArr[i3]) != null) {
                zzatkVar.zzb();
                zzaup.zzd(zzatkVar.zzd(0) == 0);
                int iZzb = this.zzv.zzb(zzatkVar.zza());
                zzaup.zzd(!this.zzx[iZzb]);
                this.zzu++;
                this.zzx[iZzb] = true;
                zzatbVarArr[i3] = new zzask(this, iZzb);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.zzs) {
            int size = this.zzn.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.zzx[i4]) {
                    this.zzn.valueAt(i4).zzg();
                }
            }
        }
        if (this.zzu == 0) {
            this.zzt = false;
            if (this.zzh.zzf()) {
                this.zzh.zzg();
            }
        } else if (!this.zzs ? j != 0 : z) {
            j = zzr(j);
            for (int i5 = 0; i5 < zzatbVarArr.length; i5++) {
                if (zzatbVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.zzs = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzasp, com.google.android.gms.internal.ads.zzatd
    public final long zza() {
        if (this.zzu == 0) {
            return Long.MIN_VALUE;
        }
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzasp, com.google.android.gms.internal.ads.zzatd
    public final boolean zzb(long j) {
        if (this.zzE) {
            return false;
        }
        if (this.zzr && this.zzu == 0) {
            return false;
        }
        boolean zZza = this.zzj.zza();
        if (this.zzh.zzf()) {
            return zZza;
        }
        zzD();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final zzapx zzbf(int i, int i2) {
        zzata zzataVar = this.zzn.get(i);
        if (zzataVar != null) {
            return zzataVar;
        }
        zzata zzataVar2 = new zzata(this.zzG, null);
        zzataVar2.zzn(this);
        this.zzn.put(i, zzataVar2);
        return zzataVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzbg() {
        this.zzq = true;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final void zzc(zzapv zzapvVar) {
        this.zzp = zzapvVar;
        this.zzm.post(this.zzk);
    }

    public final void zzk() {
        this.zzh.zzh(new zzasg(this, this.zzi));
        this.zzm.removeCallbacksAndMessages(null);
        this.zzF = true;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzl(zzaso zzasoVar, long j) {
        this.zzo = zzasoVar;
        this.zzj.zza();
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzm() throws IOException {
        this.zzh.zzi(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final zzatg zzn() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzo(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzp() {
        if (!this.zzt) {
            return -9223372036854775807L;
        }
        this.zzt = false;
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzq() {
        long jZzF;
        if (this.zzE) {
            return Long.MIN_VALUE;
        }
        if (zzG()) {
            return this.zzC;
        }
        if (this.zzz) {
            int size = this.zzn.size();
            jZzF = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.zzy[i]) {
                    jZzF = Math.min(jZzF, this.zzn.valueAt(i).zzj());
                }
            }
        } else {
            jZzF = zzF();
        }
        return jZzF == Long.MIN_VALUE ? this.zzB : jZzF;
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final long zzr(long j) {
        if (true != this.zzp.zza()) {
            j = 0;
        }
        this.zzB = j;
        int size = this.zzn.size();
        boolean zZzG = true ^ zzG();
        int i = 0;
        while (zZzG) {
            if (i >= size) {
                this.zzt = false;
                return j;
            }
            if (this.zzx[i]) {
                zZzG = this.zzn.valueAt(i).zzl(j, false);
            }
            i++;
        }
        this.zzC = j;
        this.zzE = false;
        if (this.zzh.zzf()) {
            this.zzh.zzg();
        } else {
            for (int i2 = 0; i2 < size; i2++) {
                this.zzn.valueAt(i2).zze(this.zzx[i2]);
            }
        }
        this.zzt = false;
        return j;
    }

    final boolean zzs(int i) {
        if (this.zzE) {
            return true;
        }
        return !zzG() && this.zzn.valueAt(i).zzh();
    }

    final void zzt() throws IOException {
        this.zzh.zzi(Integer.MIN_VALUE);
    }

    final int zzu(int i, zzann zzannVar, zzapg zzapgVar, boolean z) {
        if (this.zzt || zzG()) {
            return -3;
        }
        return this.zzn.valueAt(i).zzm(zzannVar, zzapgVar, z, this.zzE, this.zzB);
    }

    final void zzv(int i, long j) {
        zzata zzataVarValueAt = this.zzn.valueAt(i);
        if (!this.zzE || j <= zzataVarValueAt.zzj()) {
            zzataVarValueAt.zzl(j, true);
        } else {
            zzataVarValueAt.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasz
    public final void zzw(zzanm zzanmVar) {
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final /* bridge */ /* synthetic */ int zzy(zzaul zzaulVar, long j, long j2, IOException iOException) {
        zzapv zzapvVar;
        zzasi zzasiVar = (zzasi) zzaulVar;
        zzC(zzasiVar);
        Handler handler = this.zzd;
        if (handler != null) {
            handler.post(new zzash(this, iOException));
        }
        if (iOException instanceof zzath) {
            return 3;
        }
        int iZzE = zzE();
        int i = this.zzD;
        if (this.zzA == -1 && ((zzapvVar = this.zzp) == null || zzapvVar.zzb() == -9223372036854775807L)) {
            this.zzB = 0L;
            this.zzt = this.zzr;
            int size = this.zzn.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.zzn.valueAt(i2).zze(!this.zzr || this.zzx[i2]);
            }
            zzasiVar.zzb(0L, 0L);
        }
        this.zzD = zzE();
        return iZzE <= i ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final /* bridge */ /* synthetic */ void zzz(zzaul zzaulVar, long j, long j2, boolean z) {
        zzC((zzasi) zzaulVar);
        if (z || this.zzu <= 0) {
            return;
        }
        int size = this.zzn.size();
        for (int i = 0; i < size; i++) {
            this.zzn.valueAt(i).zze(this.zzx[i]);
        }
        this.zzo.zzbh(this);
    }
}
