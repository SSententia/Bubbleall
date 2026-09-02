package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzig implements zzhe, zznx, zzkz, zzle, zzis {
    private static final Map<String, String> zzb;
    private static final zzafv zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzku zzM;
    private final zzko zzN;
    private final Uri zzd;
    private final zzaj zze;
    private final zzff zzf;
    private final zzho zzg;
    private final zzfa zzh;
    private final zzic zzi;
    private final long zzj;
    private final zzhx zzl;
    private zzhd zzq;
    private zzajg zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zzif zzx;
    private zzot zzy;
    private final zzlh zzk = new zzlh("ProgressiveMediaPeriod");
    private final zzakw zzm = new zzakw(zzaku.zza);
    private final Runnable zzn = new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzhy
        private final zzig zza;

        {
            this.zza = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzM();
        }
    };
    private final Runnable zzo = new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzhz
        private final zzig zza;

        {
            this.zza = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzL();
        }
    };
    private final Handler zzp = zzamq.zzh(null);
    private zzie[] zzt = new zzie[0];
    private zzit[] zzs = new zzit[0];
    private long zzH = -9223372036854775807L;
    private long zzF = -1;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzD("icy");
        zzaftVar.zzN("application/x-icy");
        zzc = zzaftVar.zzah();
    }

    public zzig(Uri uri, zzaj zzajVar, zzhx zzhxVar, zzff zzffVar, zzfa zzfaVar, zzku zzkuVar, zzho zzhoVar, zzic zzicVar, zzko zzkoVar, String str, int i, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzajVar;
        this.zzf = zzffVar;
        this.zzh = zzfaVar;
        this.zzM = zzkuVar;
        this.zzg = zzhoVar;
        this.zzi = zzicVar;
        this.zzN = zzkoVar;
        this.zzj = i;
        this.zzl = zzhxVar;
    }

    private final void zzN(int i) {
        zzX();
        zzif zzifVar = this.zzx;
        boolean[] zArr = zzifVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzafv zzafvVarZza = zzifVar.zza.zza(i).zza(0);
        this.zzg.zzl(zzalt.zzf(zzafvVarZza.zzl), zzafvVarZza, 0, null, this.zzG);
        zArr[i] = true;
    }

    private final void zzO(int i) {
        zzX();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzk(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zzit zzitVar : this.zzs) {
                zzitVar.zzb(false);
            }
            zzhd zzhdVar = this.zzq;
            zzhdVar.getClass();
            zzhdVar.zzp(this);
        }
    }

    private final boolean zzP() {
        return this.zzD || zzW();
    }

    private final zzox zzQ(zzie zzieVar) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zzieVar.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzko zzkoVar = this.zzN;
        Looper looper = this.zzp.getLooper();
        zzff zzffVar = this.zzf;
        zzfa zzfaVar = this.zzh;
        looper.getClass();
        zzffVar.getClass();
        zzit zzitVar = new zzit(zzkoVar, looper, zzffVar, zzfaVar, null);
        zzitVar.zzr(this);
        int i2 = length + 1;
        zzie[] zzieVarArr = (zzie[]) Arrays.copyOf(this.zzt, i2);
        zzieVarArr[length] = zzieVar;
        this.zzt = (zzie[]) zzamq.zze(zzieVarArr);
        zzit[] zzitVarArr = (zzit[]) Arrays.copyOf(this.zzs, i2);
        zzitVarArr[length] = zzitVar;
        this.zzs = (zzit[]) zzamq.zze(zzitVarArr);
        return zzitVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
    public final void zzM() {
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zzit zzitVar : this.zzs) {
            if (zzitVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzb();
        int length = this.zzs.length;
        zzq[] zzqVarArr = new zzq[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zzafv zzafvVarZzh = this.zzs[i].zzh();
            zzafvVarZzh.getClass();
            String str = zzafvVarZzh.zzl;
            boolean zZza = zzalt.zza(str);
            boolean z = zZza || zzalt.zzb(str);
            zArr[i] = z;
            this.zzw = z | this.zzw;
            zzajg zzajgVar = this.zzr;
            if (zzajgVar != null) {
                if (zZza || this.zzt[i].zzb) {
                    zzaiv zzaivVar = zzafvVarZzh.zzj;
                    zzaiv zzaivVar2 = zzaivVar == null ? new zzaiv(zzajgVar) : zzaivVar.zzd(zzajgVar);
                    zzaft zzaftVarZza = zzafvVarZzh.zza();
                    zzaftVarZza.zzL(zzaivVar2);
                    zzafvVarZzh = zzaftVarZza.zzah();
                }
                if (zZza && zzafvVarZzh.zzf == -1 && zzafvVarZzh.zzg == -1 && zzajgVar.zza != -1) {
                    zzaft zzaftVarZza2 = zzafvVarZzh.zza();
                    zzaftVarZza2.zzI(zzajgVar.zza);
                    zzafvVarZzh = zzaftVarZza2.zzah();
                }
            }
            zzqVarArr[i] = new zzq(zzafvVarZzh.zzb(this.zzf.zza(zzafvVarZzh)));
        }
        this.zzx = new zzif(new zzs(zzqVarArr), zArr);
        this.zzv = true;
        zzhd zzhdVar = this.zzq;
        zzhdVar.getClass();
        zzhdVar.zzn(this);
    }

    private final void zzS(zzib zzibVar) {
        if (this.zzF == -1) {
            this.zzF = zzibVar.zzm;
        }
    }

    private final void zzT() {
        zzib zzibVar = new zzib(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzakt.zzd(zzW());
            long j = this.zzz;
            if (j != -9223372036854775807L && this.zzH > j) {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
            zzot zzotVar = this.zzy;
            zzotVar.getClass();
            zzib.zzi(zzibVar, zzotVar.zzf(this.zzH).zza.zzc, this.zzH);
            for (zzit zzitVar : this.zzs) {
                zzitVar.zzc(this.zzH);
            }
            this.zzH = -9223372036854775807L;
        }
        this.zzJ = zzU();
        long jZzh = this.zzk.zzh(zzibVar, this, zzku.zza(this.zzB));
        zzan zzanVar = zzibVar.zzl;
        this.zzg.zzd(new zzgx(zzibVar.zzb, zzanVar, zzanVar.zza, Collections.emptyMap(), jZzh, 0L, 0L), 1, -1, null, 0, null, zzibVar.zzk, this.zzz);
    }

    private final int zzU() {
        int iZzd = 0;
        for (zzit zzitVar : this.zzs) {
            iZzd += zzitVar.zzd();
        }
        return iZzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzV() {
        long jMax = Long.MIN_VALUE;
        for (zzit zzitVar : this.zzs) {
            jMax = Math.max(jMax, zzitVar.zzi());
        }
        return jMax;
    }

    private final boolean zzW() {
        return this.zzH != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzX() {
        zzakt.zzd(this.zzv);
        this.zzx.getClass();
        this.zzy.getClass();
    }

    final int zzA(int i, long j) {
        if (zzP()) {
            return 0;
        }
        zzN(i);
        zzit zzitVar = this.zzs[i];
        int iZzn = zzitVar.zzn(j, this.zzK);
        zzitVar.zzo(iZzn);
        if (iZzn != 0) {
            return iZzn;
        }
        zzO(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final zzox zzB(int i, int i2) {
        return zzQ(new zzie(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final void zzD(final zzot zzotVar) {
        this.zzp.post(new Runnable(this, zzotVar) { // from class: com.google.android.gms.internal.ads.zzia
            private final zzig zza;
            private final zzot zzb;

            {
                this.zza = this;
                this.zzb = zzotVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK(this.zzb);
            }
        });
    }

    final zzox zzE() {
        return zzQ(new zzie(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzis
    public final void zzF(zzafv zzafvVar) {
        this.zzp.post(this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzkz
    public final /* bridge */ /* synthetic */ zzla zzH(zzlc zzlcVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        zzla zzlaVarZze;
        zzot zzotVar;
        zzib zzibVar = (zzib) zzlcVar;
        zzS(zzibVar);
        zzlp zzlpVar = zzibVar.zzd;
        zzgx zzgxVar = new zzgx(zzibVar.zzb, zzibVar.zzl, zzlpVar.zzc(), zzlpVar.zzd(), j, j2, zzlpVar.zzb());
        zzky zzkyVar = new zzky(zzgxVar, new zzhc(1, -1, null, 0, null, zzadx.zza(zzibVar.zzk), zzadx.zza(this.zzz)), iOException, i);
        Throwable cause = zzkyVar.zzc;
        if ((cause instanceof zzaha) || (cause instanceof FileNotFoundException) || (cause instanceof zzas) || (cause instanceof zzlg)) {
            jMin = -9223372036854775807L;
            break;
        }
        while (true) {
            if (cause == null) {
                jMin = Math.min((zzkyVar.zzd - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof zzak) && ((zzak) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzlaVarZze = zzlh.zzd;
        } else {
            int iZzU = zzU();
            boolean z = iZzU > this.zzJ;
            if (this.zzF != -1 || ((zzotVar = this.zzy) != null && zzotVar.zzg() != -9223372036854775807L)) {
                this.zzJ = iZzU;
            } else if (!this.zzv || zzP()) {
                this.zzD = this.zzv;
                this.zzG = 0L;
                this.zzJ = 0;
                for (zzit zzitVar : this.zzs) {
                    zzitVar.zzb(false);
                }
                zzib.zzi(zzibVar, 0L, 0L);
            } else {
                this.zzI = true;
                zzlaVarZze = zzlh.zzc;
            }
            zzlaVarZze = zzlh.zze(z, jMin);
        }
        boolean z2 = !zzlaVarZze.zzc();
        this.zzg.zzj(zzgxVar, 1, -1, null, 0, null, zzibVar.zzk, this.zzz, iOException, z2);
        if (z2) {
            long unused = zzibVar.zzb;
        }
        return zzlaVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzkz
    public final /* bridge */ /* synthetic */ void zzI(zzlc zzlcVar, long j, long j2, boolean z) {
        zzib zzibVar = (zzib) zzlcVar;
        zzlp zzlpVar = zzibVar.zzd;
        zzgx zzgxVar = new zzgx(zzibVar.zzb, zzibVar.zzl, zzlpVar.zzc(), zzlpVar.zzd(), j, j2, zzlpVar.zzb());
        long unused = zzibVar.zzb;
        this.zzg.zzh(zzgxVar, 1, -1, null, 0, null, zzibVar.zzk, this.zzz);
        if (z) {
            return;
        }
        zzS(zzibVar);
        for (zzit zzitVar : this.zzs) {
            zzitVar.zzb(false);
        }
        if (this.zzE > 0) {
            zzhd zzhdVar = this.zzq;
            zzhdVar.getClass();
            zzhdVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkz
    public final /* bridge */ /* synthetic */ void zzJ(zzlc zzlcVar, long j, long j2) {
        zzot zzotVar;
        if (this.zzz == -9223372036854775807L && (zzotVar = this.zzy) != null) {
            boolean zZze = zzotVar.zze();
            long jZzV = zzV();
            long j3 = jZzV == Long.MIN_VALUE ? 0L : jZzV + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzz = j3;
            this.zzi.zzb(j3, zZze, this.zzA);
        }
        zzib zzibVar = (zzib) zzlcVar;
        zzlp zzlpVar = zzibVar.zzd;
        zzgx zzgxVar = new zzgx(zzibVar.zzb, zzibVar.zzl, zzlpVar.zzc(), zzlpVar.zzd(), j, j2, zzlpVar.zzb());
        long unused = zzibVar.zzb;
        this.zzg.zzf(zzgxVar, 1, -1, null, 0, null, zzibVar.zzk, this.zzz);
        zzS(zzibVar);
        this.zzK = true;
        zzhd zzhdVar = this.zzq;
        zzhdVar.getClass();
        zzhdVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzb(zzhd zzhdVar, long j) {
        this.zzq = zzhdVar;
        this.zzm.zza();
        zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzc() throws IOException {
        zzy();
        if (this.zzK && !this.zzv) {
            throw zzaha.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final zzs zzd() {
        zzX();
        return this.zzx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zze(long j, boolean z) {
        zzX();
        if (zzW()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            this.zzs[i].zzp(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final void zzf(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzg() {
        if (!this.zzD) {
            return -9223372036854775807L;
        }
        if (!this.zzK && zzU() <= this.zzJ) {
            return -9223372036854775807L;
        }
        this.zzD = false;
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzh() {
        long jZzV;
        zzX();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzK) {
            return Long.MIN_VALUE;
        }
        if (zzW()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            jZzV = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.zzs[i].zzj()) {
                    jZzV = Math.min(jZzV, this.zzs[i].zzi());
                }
            }
        } else {
            jZzV = Long.MAX_VALUE;
        }
        if (jZzV == Long.MAX_VALUE) {
            jZzV = zzV();
        }
        return jZzV == Long.MIN_VALUE ? this.zzG : jZzV;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzi(long j) {
        zzX();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zze()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzW()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            for (int i = 0; i < length; i++) {
                if (this.zzs[i].zzm(j, false) || (!zArr[i] && this.zzw)) {
                }
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
        this.zzK = false;
        if (this.zzk.zzi()) {
            for (zzit zzitVar : this.zzs) {
                zzitVar.zzq();
            }
            this.zzk.zzj();
        } else {
            this.zzk.zzg();
            for (zzit zzitVar2 : this.zzs) {
                zzitVar2.zzb(false);
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzj(long j, zzahz zzahzVar) {
        zzX();
        if (!this.zzy.zze()) {
            return 0L;
        }
        zzor zzorVarZzf = this.zzy.zzf(j);
        long j2 = zzorVarZzf.zza.zzb;
        long j3 = zzorVarZzf.zzb.zzb;
        long j4 = zzahzVar.zzf;
        if (j4 == 0 && zzahzVar.zzg == 0) {
            return j;
        }
        long jZzB = zzamq.zzB(j, j4, Long.MIN_VALUE);
        long jZzA = zzamq.zzA(j, zzahzVar.zzg, Long.MAX_VALUE);
        boolean z = jZzB <= j2 && j2 <= jZzA;
        boolean z2 = jZzB <= j3 && j3 <= jZzA;
        if (z && z2) {
            if (Math.abs(j2 - j) > Math.abs(j3 - j)) {
                return j3;
            }
        } else if (!z) {
            return z2 ? j3 : jZzB;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final long zzk() {
        if (this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzl(long j) {
        if (this.zzK || this.zzk.zzf() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zZza = this.zzm.zza();
        if (this.zzk.zzi()) {
            return zZza;
        }
        zzT();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhe, com.google.android.gms.internal.ads.zziw
    public final boolean zzm() {
        return this.zzk.zzi() && this.zzm.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final long zzq(zzjg[] zzjgVarArr, boolean[] zArr, zziu[] zziuVarArr, boolean[] zArr2, long j) {
        zzjg zzjgVar;
        zzX();
        zzif zzifVar = this.zzx;
        zzs zzsVar = zzifVar.zza;
        boolean[] zArr3 = zzifVar.zzc;
        int i = this.zzE;
        int i2 = 0;
        for (int i3 = 0; i3 < zzjgVarArr.length; i3++) {
            zziu zziuVar = zziuVarArr[i3];
            if (zziuVar != null && (zzjgVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((zzid) zziuVar).zzb;
                zzakt.zzd(zArr3[i4]);
                this.zzE--;
                zArr3[i4] = false;
                zziuVarArr[i3] = null;
            }
        }
        boolean z = !this.zzC ? j == 0 : i != 0;
        for (int i5 = 0; i5 < zzjgVarArr.length; i5++) {
            if (zziuVarArr[i5] == null && (zzjgVar = zzjgVarArr[i5]) != null) {
                zzakt.zzd(zzjgVar.zzc() == 1);
                zzakt.zzd(zzjgVar.zze(0) == 0);
                int iZzb = zzsVar.zzb(zzjgVar.zzb());
                zzakt.zzd(!zArr3[iZzb]);
                this.zzE++;
                zArr3[iZzb] = true;
                zziuVarArr[i5] = new zzid(this, iZzb);
                zArr2[i5] = true;
                if (!z) {
                    zzit zzitVar = this.zzs[iZzb];
                    z = (zzitVar.zzm(j, true) || zzitVar.zzg() == 0) ? false : true;
                }
            }
        }
        if (this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if (this.zzk.zzi()) {
                zzit[] zzitVarArr = this.zzs;
                int length = zzitVarArr.length;
                while (i2 < length) {
                    zzitVarArr[i2].zzq();
                    i2++;
                }
                this.zzk.zzj();
            } else {
                for (zzit zzitVar2 : this.zzs) {
                    zzitVar2.zzb(false);
                }
            }
        } else if (z) {
            j = zzi(j);
            while (i2 < zziuVarArr.length) {
                if (zziuVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzC = true;
        return j;
    }

    public final void zzu() {
        if (this.zzv) {
            for (zzit zzitVar : this.zzs) {
                zzitVar.zze();
            }
        }
        this.zzk.zzk(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzv() {
        for (zzit zzitVar : this.zzs) {
            zzitVar.zza();
        }
        this.zzl.zzb();
    }

    final boolean zzw(int i) {
        return !zzP() && this.zzs[i].zzk(this.zzK);
    }

    final void zzx(int i) throws IOException {
        this.zzs[i].zzf();
        zzy();
    }

    final void zzy() throws IOException {
        this.zzk.zzl(zzku.zza(this.zzB));
    }

    final int zzz(int i, zzafw zzafwVar, zzaf zzafVar, int i2) {
        if (zzP()) {
            return -3;
        }
        zzN(i);
        int iZzl = this.zzs[i].zzl(zzafwVar, zzafVar, i2, this.zzK);
        if (iZzl == -3) {
            zzO(i);
        }
        return iZzl;
    }

    final /* synthetic */ void zzK(zzot zzotVar) {
        this.zzy = this.zzr == null ? zzotVar : new zzos(-9223372036854775807L, 0L);
        this.zzz = zzotVar.zzg();
        boolean z = false;
        if (this.zzF == -1 && zzotVar.zzg() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        this.zzB = true == z ? 7 : 1;
        this.zzi.zzb(this.zzz, zzotVar.zze(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzM();
    }

    final /* synthetic */ void zzL() {
        if (this.zzL) {
            return;
        }
        zzhd zzhdVar = this.zzq;
        zzhdVar.getClass();
        zzhdVar.zzp(this);
    }
}
