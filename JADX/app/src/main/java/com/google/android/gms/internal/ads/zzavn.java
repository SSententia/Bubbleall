package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.work.WorkRequest;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzavn extends zzari {
    private int zzA;
    private final Context zzb;
    private final zzavp zzc;
    private final zzavx zzd;
    private final boolean zze;
    private final long[] zzf;
    private zzanm[] zzg;
    private zzavm zzh;
    private Surface zzi;
    private Surface zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private float zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private float zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private float zzy;
    private long zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzavn(Context context, zzark zzarkVar, long j, Handler handler, zzavy zzavyVar, int i) {
        super(2, zzarkVar, null, false);
        boolean z = false;
        this.zzb = context.getApplicationContext();
        this.zzc = new zzavp(context);
        this.zzd = new zzavx(handler, zzavyVar);
        if (zzave.zza <= 22 && "foster".equals(zzave.zzb) && "NVIDIA".equals(zzave.zzc)) {
            z = true;
        }
        this.zze = z;
        this.zzf = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        zzab();
    }

    private final boolean zzR(boolean z) {
        if (zzave.zza >= 23) {
            return !z || zzavk.zza(this.zzb);
        }
        return false;
    }

    private final void zzab() {
        this.zzv = -1;
        this.zzw = -1;
        this.zzy = -1.0f;
        this.zzx = -1;
    }

    private final void zzac() {
        int i = this.zzv;
        int i2 = this.zzr;
        if (i == i2 && this.zzw == this.zzs && this.zzx == this.zzt && this.zzy == this.zzu) {
            return;
        }
        this.zzd.zzf(i2, this.zzs, this.zzt, this.zzu);
        this.zzv = this.zzr;
        this.zzw = this.zzs;
        this.zzx = this.zzt;
        this.zzy = this.zzu;
    }

    private final void zzad() {
        if (this.zzv == -1 && this.zzw == -1) {
            return;
        }
        this.zzd.zzf(this.zzr, this.zzs, this.zzt, this.zzu);
    }

    private final void zzae() {
        if (this.zzn > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zzd.zze(this.zzn, jElapsedRealtime - this.zzm);
            this.zzn = 0;
            this.zzm = jElapsedRealtime;
        }
    }

    private static boolean zzaf(long j) {
        return j < -30000;
    }

    private static int zzag(zzanm zzanmVar) {
        int i = zzanmVar.zzm;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzanr
    public final boolean zzE() {
        Surface surface;
        if (super.zzE() && (this.zzk || (((surface = this.zzj) != null && this.zzi == surface) || zzW() == null))) {
            this.zzl = -9223372036854775807L;
            return true;
        }
        if (this.zzl == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.zzl) {
            return true;
        }
        this.zzl = -9223372036854775807L;
        return false;
    }

    protected final void zzH(MediaCodec mediaCodec, int i, long j) {
        zzavc.zza("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzavc.zzb();
        this.zza.zze++;
    }

    protected final void zzI(MediaCodec mediaCodec, int i, long j) {
        zzac();
        zzavc.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzavc.zzb();
        this.zza.zzd++;
        this.zzo = 0;
        zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final int zzJ(zzark zzarkVar, zzanm zzanmVar) throws zzarm {
        boolean z;
        String str = zzanmVar.zzf;
        if (!zzauu.zzb(str)) {
            return 0;
        }
        zzapk zzapkVar = zzanmVar.zzi;
        if (zzapkVar != null) {
            z = false;
            for (int i = 0; i < zzapkVar.zza; i++) {
                z |= zzapkVar.zza(i).zzc;
            }
        } else {
            z = false;
        }
        zzarg zzargVarZza = zzarr.zza(str, z);
        if (zzargVarZza == null) {
            return 1;
        }
        boolean zZzd = zzargVarZza.zzd(zzanmVar.zzc);
        if (zZzd && zzanmVar.zzj > 0 && zzanmVar.zzk > 0) {
            if (zzave.zza >= 21) {
                zZzd = zzargVarZza.zze(zzanmVar.zzj, zzanmVar.zzk, zzanmVar.zzl);
            } else {
                zZzd = zzanmVar.zzj * zzanmVar.zzk <= zzarr.zzc();
                if (!zZzd) {
                    int i2 = zzanmVar.zzj;
                    int i3 = zzanmVar.zzk;
                    String str2 = zzave.zze;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i2);
                    sb.append("x");
                    sb.append(i3);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
            }
        }
        return (true != zZzd ? 2 : 3) | (true != zzargVarZza.zzb ? 4 : 8) | (true == zzargVarZza.zzc ? 16 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    @Override // com.google.android.gms.internal.ads.zzari
    protected final void zzL(zzarg zzargVar, MediaCodec mediaCodec, zzanm zzanmVar, MediaCrypto mediaCrypto) throws zzarm {
        byte b;
        int iZze;
        zzanm[] zzanmVarArr = this.zzg;
        int i = zzanmVar.zzj;
        int i2 = zzanmVar.zzk;
        int i3 = zzanmVar.zzg;
        if (i3 == -1) {
            String str = zzanmVar.zzf;
            if (i == -1 || i2 == -1) {
                i3 = -1;
            } else {
                int i4 = 4;
                switch (str) {
                    case "video/3gpp":
                        b = 0;
                        break;
                    case "video/hevc":
                        b = 4;
                        break;
                    case "video/mp4v-es":
                        b = 1;
                        break;
                    case "video/avc":
                        b = 2;
                        break;
                    case "video/x-vnd.on2.vp8":
                        b = 3;
                        break;
                    case "video/x-vnd.on2.vp9":
                        b = 5;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0 || b == 1) {
                    iZze = i * i2;
                    i4 = 2;
                } else {
                    if (b != 2) {
                        if (b == 3) {
                            iZze = i * i2;
                            i4 = 2;
                        } else if (b == 4 || b == 5) {
                            iZze = i * i2;
                        }
                    } else if (!"BRAVIA 4K 2015".equals(zzave.zzd)) {
                        iZze = zzave.zze(i, 16) * zzave.zze(i2, 16) * 256;
                        i4 = 2;
                    }
                    i3 = -1;
                }
                i3 = (iZze * 3) / (i4 + i4);
            }
        }
        int length = zzanmVarArr.length;
        zzavm zzavmVar = new zzavm(i, i2, i3);
        this.zzh = zzavmVar;
        boolean z = this.zze;
        MediaFormat mediaFormatZzl = zzanmVar.zzl();
        mediaFormatZzl.setInteger("max-width", zzavmVar.zza);
        mediaFormatZzl.setInteger("max-height", zzavmVar.zzb);
        int i5 = zzavmVar.zzc;
        if (i5 != -1) {
            mediaFormatZzl.setInteger("max-input-size", i5);
        }
        if (z) {
            mediaFormatZzl.setInteger("auto-frc", 0);
        }
        if (this.zzi == null) {
            zzaup.zzd(zzR(zzargVar.zzd));
            if (this.zzj == null) {
                this.zzj = zzavk.zzb(this.zzb, zzargVar.zzd);
            }
            this.zzi = this.zzj;
        }
        mediaCodec.configure(mediaFormatZzl, this.zzi, (MediaCrypto) null, 0);
        int i6 = zzave.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final void zzM(String str, long j, long j2) {
        this.zzd.zzc(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final void zzN(zzanm zzanmVar) throws zzamy {
        super.zzN(zzanmVar);
        this.zzd.zzd(zzanmVar);
        float f = zzanmVar.zzn;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.zzq = f;
        this.zzp = zzag(zzanmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final void zzO(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.zzr = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        this.zzs = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.zzu = this.zzq;
        if (zzave.zza >= 21) {
            int i = this.zzp;
            if (i == 90 || i == 270) {
                int i2 = this.zzr;
                this.zzr = this.zzs;
                this.zzs = i2;
                this.zzu = 1.0f / this.zzu;
            }
        } else {
            this.zzt = this.zzp;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    protected final void zzP(MediaCodec mediaCodec, int i, long j, long j2) {
        zzac();
        zzavc.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzavc.zzb();
        this.zza.zzd++;
        this.zzo = 0;
        zzQ();
    }

    final void zzQ() {
        if (this.zzk) {
            return;
        }
        this.zzk = true;
        this.zzd.zzg(this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final boolean zzS(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        while (true) {
            int i3 = this.zzA;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.zzf;
            long j4 = jArr[0];
            if (j3 < j4) {
                break;
            }
            this.zzz = j4;
            int i4 = i3 - 1;
            this.zzA = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        long j5 = j3 - this.zzz;
        if (z) {
            zzH(mediaCodec, i, j5);
            return true;
        }
        long j6 = j3 - j;
        if (this.zzi == this.zzj) {
            if (!zzaf(j6)) {
                return false;
            }
            zzH(mediaCodec, i, j5);
            return true;
        }
        if (!this.zzk) {
            if (zzave.zza >= 21) {
                zzP(mediaCodec, i, j5, System.nanoTime());
            } else {
                zzI(mediaCodec, i, j5);
            }
            return true;
        }
        if (zze() != 2) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jNanoTime = System.nanoTime();
        long jZzc = this.zzc.zzc(j3, ((j6 - ((jElapsedRealtime * 1000) - j2)) * 1000) + jNanoTime);
        long j7 = (jZzc - jNanoTime) / 1000;
        if (!zzaf(j7)) {
            if (zzave.zza >= 21) {
                if (j7 < 50000) {
                    zzP(mediaCodec, i, j5, jZzc);
                    return true;
                }
            } else if (j7 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                zzI(mediaCodec, i, j5);
                return true;
            }
            return false;
        }
        zzavc.zza("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzavc.zzb();
        zzapf zzapfVar = this.zza;
        zzapfVar.zzf++;
        this.zzn++;
        int i5 = this.zzo + 1;
        this.zzo = i5;
        zzapfVar.zzg = Math.max(i5, zzapfVar.zzg);
        if (this.zzn == -1) {
            zzae();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final boolean zzV(zzarg zzargVar) {
        return this.zzi != null || zzR(zzargVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final void zzY() {
        try {
            super.zzY();
        } finally {
            Surface surface = this.zzj;
            if (surface != null) {
                if (this.zzi == surface) {
                    this.zzi = null;
                }
                surface.release();
                this.zzj = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final void zzZ(zzapg zzapgVar) {
        int i = zzave.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final boolean zzaa(MediaCodec mediaCodec, boolean z, zzanm zzanmVar, zzanm zzanmVar2) {
        if (!zzanmVar.zzf.equals(zzanmVar2.zzf) || zzag(zzanmVar) != zzag(zzanmVar2)) {
            return false;
        }
        if (!z && (zzanmVar.zzj != zzanmVar2.zzj || zzanmVar.zzk != zzanmVar2.zzk)) {
            return false;
        }
        int i = zzanmVar2.zzj;
        zzavm zzavmVar = this.zzh;
        return i <= zzavmVar.zza && zzanmVar2.zzk <= zzavmVar.zzb && zzanmVar2.zzg <= zzavmVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzamw, com.google.android.gms.internal.ads.zzana
    public final void zzr(int i, Object obj) throws zzamy {
        if (i == 1) {
            Surface surfaceZzb = (Surface) obj;
            if (surfaceZzb == null) {
                Surface surface = this.zzj;
                if (surface != null) {
                    surfaceZzb = surface;
                } else {
                    zzarg zzargVarZzX = zzX();
                    if (zzargVarZzX != null && zzR(zzargVarZzX.zzd)) {
                        surfaceZzb = zzavk.zzb(this.zzb, zzargVarZzX.zzd);
                        this.zzj = surfaceZzb;
                    }
                }
            }
            if (this.zzi == surfaceZzb) {
                if (surfaceZzb == null || surfaceZzb == this.zzj) {
                    return;
                }
                zzad();
                if (this.zzk) {
                    this.zzd.zzg(this.zzi);
                    return;
                }
                return;
            }
            this.zzi = surfaceZzb;
            int iZze = zze();
            if (iZze == 1 || iZze == 2) {
                MediaCodec mediaCodecZzW = zzW();
                if (zzave.zza < 23 || mediaCodecZzW == null || surfaceZzb == null) {
                    zzY();
                    zzU();
                } else {
                    mediaCodecZzW.setOutputSurface(surfaceZzb);
                }
            }
            if (surfaceZzb == null || surfaceZzb == this.zzj) {
                zzab();
                this.zzk = false;
                int i2 = zzave.zza;
            } else {
                zzad();
                this.zzk = false;
                int i3 = zzave.zza;
                if (iZze == 2) {
                    this.zzl = -9223372036854775807L;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzamw
    protected final void zzs(boolean z) throws zzamy {
        super.zzs(z);
        int i = zzy().zzb;
        this.zzd.zzb(this.zza);
        this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    protected final void zzt(zzanm[] zzanmVarArr, long j) throws zzamy {
        this.zzg = zzanmVarArr;
        if (this.zzz == -9223372036854775807L) {
            this.zzz = j;
            return;
        }
        int i = this.zzA;
        if (i == 10) {
            long j2 = this.zzf[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j2);
            Log.w("MediaCodecVideoRenderer", sb.toString());
        } else {
            this.zzA = i + 1;
        }
        this.zzf[this.zzA - 1] = j;
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzamw
    protected final void zzu(long j, boolean z) throws zzamy {
        super.zzu(j, z);
        this.zzk = false;
        int i = zzave.zza;
        this.zzo = 0;
        int i2 = this.zzA;
        if (i2 != 0) {
            this.zzz = this.zzf[i2 - 1];
            this.zzA = 0;
        }
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    protected final void zzv() {
        this.zzn = 0;
        this.zzm = SystemClock.elapsedRealtime();
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    protected final void zzw() {
        zzae();
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzamw
    protected final void zzx() {
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        this.zzz = -9223372036854775807L;
        this.zzA = 0;
        zzab();
        this.zzk = false;
        int i = zzave.zza;
        this.zzc.zzb();
        try {
            super.zzx();
        } finally {
            this.zza.zza();
            this.zzd.zzh(this.zza);
        }
    }
}
