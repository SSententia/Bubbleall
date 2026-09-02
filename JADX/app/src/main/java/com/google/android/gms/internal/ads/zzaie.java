package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaie extends zzadu implements zzahp {
    private float zzA;
    private boolean zzB;
    private List zzC;
    private boolean zzD;
    private boolean zzE;
    private zzaee zzF;
    private zzy zzG;
    protected final zzahv[] zzb;
    private final zzakw zzc;
    private final Context zzd;
    private final zzafe zze;
    private final zzaib zzf;
    private final zzaic zzg;
    private final CopyOnWriteArraySet<zzahl> zzh;
    private final zzcy zzi;
    private final zzadp zzj;
    private final zzadt zzk;
    private final zzaij zzl;
    private final zzair zzm;
    private final zzais zzn;
    private zzafv zzo;
    private zzafv zzp;
    private AudioTrack zzq;
    private Object zzr;
    private Surface zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private zzaz zzw;
    private zzaz zzx;
    private int zzy;
    private zzg zzz;

    protected zzaie(zzaia zzaiaVar) throws Throwable {
        zzaie zzaieVar;
        zzakw zzakwVar = new zzakw(zzaku.zza);
        this.zzc = zzakwVar;
        try {
            Context applicationContext = zzaiaVar.zza.getApplicationContext();
            this.zzd = applicationContext;
            zzcy zzcyVar = zzaiaVar.zzh;
            this.zzi = zzcyVar;
            this.zzz = zzaiaVar.zzj;
            this.zzt = 1;
            this.zzB = false;
            zzaid zzaidVar = null;
            zzaib zzaibVar = new zzaib(this, zzaidVar);
            this.zzf = zzaibVar;
            zzaic zzaicVar = new zzaic(zzaidVar);
            this.zzg = zzaicVar;
            this.zzh = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(zzaiaVar.zzi);
            zzahv[] zzahvVarArrZza = zzaiaVar.zzb.zza(handler, zzaibVar, zzaibVar, zzaibVar, zzaibVar);
            this.zzb = zzahvVarArrZza;
            this.zzA = 1.0f;
            if (zzamq.zza < 21) {
                AudioTrack audioTrack = this.zzq;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.zzq.release();
                    this.zzq = null;
                }
                if (this.zzq == null) {
                    this.zzq = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzy = this.zzq.getAudioSessionId();
            } else {
                this.zzy = zzadx.zzc(applicationContext);
            }
            this.zzC = Collections.emptyList();
            this.zzD = true;
            zzahh zzahhVar = new zzahh();
            zzahhVar.zzc(20, 21, 22, 23, 24, 25, 26, 27);
            try {
                zzafe zzafeVar = new zzafe(zzahvVarArrZza, zzaiaVar.zzd, zzaiaVar.zze, zzaiaVar.zzf, zzaiaVar.zzg, zzcyVar, true, zzaiaVar.zzk, 5000L, 15000L, zzaiaVar.zzm, 500L, false, zzaiaVar.zzc, zzaiaVar.zzi, this, zzahhVar.zze(), null);
                zzaieVar = this;
                try {
                    zzaieVar.zze = zzafeVar;
                    zzafeVar.zzg(zzaibVar);
                    zzafeVar.zzh(zzaibVar);
                    zzaieVar.zzj = new zzadp(zzaiaVar.zza, handler, zzaibVar);
                    zzaieVar.zzk = new zzadt(zzaiaVar.zza, handler, zzaibVar);
                    zzamq.zzc(null, null);
                    zzaij zzaijVar = new zzaij(zzaiaVar.zza, handler, zzaibVar);
                    zzaieVar.zzl = zzaijVar;
                    int i = zzaieVar.zzz.zzb;
                    zzaijVar.zzb(3);
                    zzaieVar.zzm = new zzair(zzaiaVar.zza);
                    zzaieVar.zzn = new zzais(zzaiaVar.zza);
                    zzaieVar.zzF = zzah(zzaijVar);
                    zzaieVar.zzG = zzy.zza;
                    zzaieVar.zzag(1, 10, Integer.valueOf(zzaieVar.zzy));
                    zzaieVar.zzag(2, 10, Integer.valueOf(zzaieVar.zzy));
                    zzaieVar.zzag(1, 3, zzaieVar.zzz);
                    zzaieVar.zzag(2, 4, Integer.valueOf(zzaieVar.zzt));
                    zzaieVar.zzag(2, 5, 0);
                    zzaieVar.zzag(1, 9, Boolean.valueOf(zzaieVar.zzB));
                    zzaieVar.zzag(2, 7, zzaicVar);
                    zzaieVar.zzag(6, 8, zzaicVar);
                    zzakwVar.zza();
                } catch (Throwable th) {
                    th = th;
                    zzaieVar.zzc.zza();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zzaieVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            zzaieVar = this;
        }
    }

    static /* synthetic */ void zzS(zzaie zzaieVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzaieVar.zzab(surface);
        zzaieVar.zzs = surface;
    }

    static /* synthetic */ void zzW(zzaie zzaieVar) {
        zzaieVar.zzi.zzn(zzaieVar.zzB);
        Iterator<zzahl> it = zzaieVar.zzh.iterator();
        while (it.hasNext()) {
            it.next().zzn(zzaieVar.zzB);
        }
    }

    static /* synthetic */ void zzY(zzaie zzaieVar) {
        int iZzI = zzaieVar.zzI();
        if (iZzI == 2 || iZzI == 3) {
            zzaieVar.zzaf();
            zzaieVar.zze.zze();
            zzaieVar.zzM();
            zzaieVar.zzM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab(Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        zzahv[] zzahvVarArr = this.zzb;
        int length = zzahvVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            zzahv zzahvVar = zzahvVarArr[i];
            if (zzahvVar.zzac() == 2) {
                zzahs zzahsVarZzt = this.zze.zzt(zzahvVar);
                zzahsVarZzt.zzb(1);
                zzahsVarZzt.zzd(obj);
                zzahsVarZzt.zzg();
                arrayList.add(zzahsVarZzt);
            }
            i++;
        }
        Object obj2 = this.zzr;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzahs) it.next()).zzj(2000L);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.zzr;
            Surface surface = this.zzs;
            if (obj3 == surface) {
                surface.release();
                this.zzs = null;
            }
        }
        this.zzr = obj;
        if (z) {
            this.zze.zzr(false, zzaeg.zzc(new zzafr(3), PointerIconCompat.TYPE_HELP));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(int i, int i2) {
        if (i == this.zzu && i2 == this.zzv) {
            return;
        }
        this.zzu = i;
        this.zzv = i2;
        this.zzi.zzB(i, i2);
        Iterator<zzahl> it = this.zzh.iterator();
        while (it.hasNext()) {
            it.next().zzB(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad() {
        zzag(1, 2, Float.valueOf(this.zzA * this.zzk.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzae(boolean z, int i, int i2) {
        boolean z2 = z && i != -1;
        this.zze.zzl(z2, (!z2 || i == 1) ? 0 : 1, i2);
    }

    private final void zzaf() {
        this.zzc.zzd();
        if (Thread.currentThread() != this.zze.zzf().getThread()) {
            String strZzv = zzamq.zzv("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zze.zzf().getThread().getName());
            if (this.zzD) {
                throw new IllegalStateException(strZzv);
            }
            zzaln.zza("SimpleExoPlayer", strZzv, this.zzE ? null : new IllegalStateException());
            this.zzE = true;
        }
    }

    private final void zzag(int i, int i2, Object obj) {
        zzahv[] zzahvVarArr = this.zzb;
        int length = zzahvVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzahv zzahvVar = zzahvVarArr[i3];
            if (zzahvVar.zzac() == i) {
                zzahs zzahsVarZzt = this.zze.zzt(zzahvVar);
                zzahsVarZzt.zzb(i2);
                zzahsVarZzt.zzd(obj);
                zzahsVarZzt.zzg();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzaee zzah(zzaij zzaijVar) {
        return new zzaee(0, zzaijVar.zzc(), zzaijVar.zzd());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzai(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final boolean zzA() {
        zzaf();
        return this.zze.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzB() {
        zzaf();
        return this.zze.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzC() {
        zzaf();
        return this.zze.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzD() {
        zzaf();
        return this.zze.zzD();
    }

    public final void zzE(float f) {
        zzaf();
        float fZzz = zzamq.zzz(f, 0.0f, 1.0f);
        if (this.zzA == fZzz) {
            return;
        }
        this.zzA = fZzz;
        zzad();
        this.zzi.zzq(fZzz);
        Iterator<zzahl> it = this.zzh.iterator();
        while (it.hasNext()) {
            it.next().zzq(fZzz);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final zzaiq zzF() {
        zzaf();
        return this.zze.zzF();
    }

    public final void zzG(zzda zzdaVar) {
        this.zzi.zza(zzdaVar);
    }

    public final void zzH(zzda zzdaVar) {
        this.zzi.zzb(zzdaVar);
    }

    public final int zzI() {
        zzaf();
        return this.zze.zzi();
    }

    public final void zzJ() {
        zzaf();
        boolean zZzM = zzM();
        int iZzb = this.zzk.zzb(zZzM, 2);
        zzae(zZzM, iZzb, zzai(zZzM, iZzb));
        this.zze.zzj();
    }

    public final void zzK(zzhh zzhhVar) {
        zzaf();
        this.zze.zzk(Collections.singletonList(zzhhVar), true);
    }

    public final void zzL(boolean z) {
        zzaf();
        int iZzb = this.zzk.zzb(z, zzI());
        zzae(z, iZzb, zzai(z, iZzb));
    }

    public final boolean zzM() {
        zzaf();
        return this.zze.zzm();
    }

    public final void zzN() {
        AudioTrack audioTrack;
        zzaf();
        if (zzamq.zza < 21 && (audioTrack = this.zzq) != null) {
            audioTrack.release();
            this.zzq = null;
        }
        this.zzl.zze();
        this.zzk.zzc();
        this.zze.zzs();
        this.zzi.zzd();
        Surface surface = this.zzs;
        if (surface != null) {
            surface.release();
            this.zzs = null;
        }
        this.zzC = Collections.emptyList();
    }

    public final int zzO() {
        zzaf();
        this.zze.zzE();
        return 2;
    }

    public final long zzP() {
        zzaf();
        return this.zze.zzw();
    }

    public final long zzQ() {
        zzaf();
        return this.zze.zzy();
    }

    @Deprecated
    public final void zzR(boolean z) {
        this.zzD = false;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzn() {
        zzaf();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final boolean zzo() {
        zzaf();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final void zzp(int i, long j) {
        zzaf();
        this.zzi.zzf();
        this.zze.zzp(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    @Deprecated
    public final void zzq(boolean z) {
        zzaf();
        this.zzk.zzb(zzM(), 1);
        this.zze.zzr(false, null);
        this.zzC = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzu() {
        zzaf();
        return this.zze.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzv() {
        zzaf();
        return this.zze.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzx() {
        zzaf();
        return this.zze.zzx();
    }

    public final void zzy(Surface surface) {
        zzaf();
        zzab(surface);
        int i = surface == null ? 0 : -1;
        zzac(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzz() {
        zzaf();
        return this.zze.zzz();
    }
}
