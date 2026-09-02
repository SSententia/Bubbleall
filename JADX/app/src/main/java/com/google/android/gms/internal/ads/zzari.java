package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzari extends zzamw {
    private static final byte[] zzb = zzave.zzm("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    protected zzapf zza;
    private final zzark zzc;
    private final zzapg zzd;
    private final zzapg zze;
    private final zzann zzf;
    private final List<Long> zzg;
    private final MediaCodec.BufferInfo zzh;
    private zzanm zzi;
    private MediaCodec zzj;
    private zzarg zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private ByteBuffer[] zzu;
    private ByteBuffer[] zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    public zzari(int i, zzark zzarkVar, zzapl zzaplVar, boolean z) {
        super(i);
        zzaup.zzd(zzave.zza >= 16);
        this.zzc = zzarkVar;
        this.zzd = new zzapg(0);
        this.zze = new zzapg(0);
        this.zzf = new zzann();
        this.zzg = new ArrayList();
        this.zzh = new MediaCodec.BufferInfo();
        this.zzB = 0;
        this.zzC = 0;
    }

    private final boolean zzH() throws zzamy {
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec == null || this.zzC == 2 || this.zzF) {
            return false;
        }
        if (this.zzx < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.zzx = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            zzapg zzapgVar = this.zzd;
            zzapgVar.zzb = this.zzu[iDequeueInputBuffer];
            zzapgVar.zza();
        }
        if (this.zzC == 1) {
            if (!this.zzo) {
                this.zzE = true;
                this.zzj.queueInputBuffer(this.zzx, 0, 0, 0L, 4);
                this.zzx = -1;
            }
            this.zzC = 2;
            return false;
        }
        if (this.zzs) {
            this.zzs = false;
            ByteBuffer byteBuffer = this.zzd.zzb;
            byte[] bArr = zzb;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.zzj;
            int i = this.zzx;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i, 0, 38, 0L, 0);
            this.zzx = -1;
            this.zzD = true;
            return true;
        }
        if (this.zzB == 1) {
            for (int i2 = 0; i2 < this.zzi.zzh.size(); i2++) {
                this.zzd.zzb.put(this.zzi.zzh.get(i2));
            }
            this.zzB = 2;
        }
        int iPosition = this.zzd.zzb.position();
        int iZzA = zzA(this.zzf, this.zzd, false);
        if (iZzA == -3) {
            return false;
        }
        if (iZzA == -5) {
            if (this.zzB == 2) {
                this.zzd.zza();
                this.zzB = 1;
            }
            zzN(this.zzf.zza);
            return true;
        }
        if (this.zzd.zzc()) {
            if (this.zzB == 2) {
                this.zzd.zza();
                this.zzB = 1;
            }
            this.zzF = true;
            if (!this.zzD) {
                zzI();
                return false;
            }
            try {
                if (!this.zzo) {
                    this.zzE = true;
                    this.zzj.queueInputBuffer(this.zzx, 0, 0, 0L, 4);
                    this.zzx = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e) {
                throw zzamy.zza(e, zzz());
            }
        }
        if (this.zzH && !this.zzd.zzd()) {
            this.zzd.zza();
            if (this.zzB == 2) {
                this.zzB = 1;
            }
            return true;
        }
        this.zzH = false;
        boolean zZzi = this.zzd.zzi();
        if (this.zzl && !zZzi) {
            ByteBuffer byteBuffer2 = this.zzd.zzb;
            byte[] bArr2 = zzauv.zza;
            int iPosition2 = byteBuffer2.position();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3 + 1;
                if (i5 >= iPosition2) {
                    byteBuffer2.clear();
                    break;
                }
                int i6 = byteBuffer2.get(i3) & UByte.MAX_VALUE;
                if (i4 == 3) {
                    if (i6 == 1) {
                        if ((byteBuffer2.get(i5) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                            byteBufferDuplicate.position(i3 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer2.position(0);
                            byteBuffer2.put(byteBufferDuplicate);
                            break;
                        }
                        i6 = 1;
                    }
                } else if (i6 == 0) {
                    i4++;
                }
                if (i6 != 0) {
                    i4 = 0;
                }
                i3 = i5;
            }
            if (this.zzd.zzb.position() == 0) {
                return true;
            }
            this.zzl = false;
        }
        try {
            zzapg zzapgVar2 = this.zzd;
            long j = zzapgVar2.zzc;
            if (zzapgVar2.zzb()) {
                this.zzg.add(Long.valueOf(j));
            }
            this.zzd.zzb.flip();
            zzZ(this.zzd);
            if (zZzi) {
                MediaCodec.CryptoInfo cryptoInfoZzb = this.zzd.zza.zzb();
                if (iPosition != 0) {
                    if (cryptoInfoZzb.numBytesOfClearData == null) {
                        cryptoInfoZzb.numBytesOfClearData = new int[1];
                    }
                    int[] iArr = cryptoInfoZzb.numBytesOfClearData;
                    iArr[0] = iArr[0] + iPosition;
                }
                this.zzj.queueSecureInputBuffer(this.zzx, 0, cryptoInfoZzb, j, 0);
            } else {
                this.zzj.queueInputBuffer(this.zzx, 0, this.zzd.zzb.limit(), j, 0);
            }
            this.zzx = -1;
            this.zzD = true;
            this.zzB = 0;
            this.zza.zzc++;
            return true;
        } catch (MediaCodec.CryptoException e2) {
            throw zzamy.zza(e2, zzz());
        }
    }

    private final void zzI() throws zzamy {
        if (this.zzC == 2) {
            zzY();
            zzU();
        } else {
            this.zzG = true;
            zzT();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzD(long j, long j2) throws zzamy {
        boolean zZzS;
        int iDequeueOutputBuffer;
        boolean z;
        if (this.zzG) {
            zzT();
            return;
        }
        if (this.zzi == null) {
            this.zze.zza();
            int iZzA = zzA(this.zzf, this.zze, true);
            if (iZzA != -5) {
                if (iZzA == -4) {
                    zzaup.zzd(this.zze.zzc());
                    this.zzF = true;
                    zzI();
                    return;
                }
                return;
            }
            zzN(this.zzf.zza);
        }
        zzU();
        if (this.zzj != null) {
            zzavc.zza("drainAndFeed");
            while (true) {
                if (this.zzy < 0) {
                    if (this.zzq && this.zzE) {
                        try {
                            iDequeueOutputBuffer = this.zzj.dequeueOutputBuffer(this.zzh, 0L);
                            this.zzy = iDequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            zzI();
                            if (this.zzG) {
                                zzY();
                            }
                        }
                    } else {
                        iDequeueOutputBuffer = this.zzj.dequeueOutputBuffer(this.zzh, 0L);
                        this.zzy = iDequeueOutputBuffer;
                    }
                    if (iDequeueOutputBuffer < 0) {
                        if (iDequeueOutputBuffer != -2) {
                            if (iDequeueOutputBuffer != -3) {
                                if (!this.zzo || (!this.zzF && this.zzC != 2)) {
                                    break;
                                    break;
                                } else {
                                    zzI();
                                    break;
                                }
                            }
                            this.zzv = this.zzj.getOutputBuffers();
                        } else {
                            MediaFormat outputFormat = this.zzj.getOutputFormat();
                            if (this.zzn && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                                this.zzt = true;
                            } else {
                                if (this.zzr) {
                                    outputFormat.setInteger("channel-count", 1);
                                }
                                zzO(this.zzj, outputFormat);
                            }
                        }
                    } else if (this.zzt) {
                        this.zzt = false;
                        this.zzj.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        this.zzy = -1;
                    } else {
                        if ((this.zzh.flags & 4) != 0) {
                            zzI();
                            this.zzy = -1;
                            break;
                        }
                        ByteBuffer byteBuffer = this.zzv[this.zzy];
                        if (byteBuffer != null) {
                            byteBuffer.position(this.zzh.offset);
                            byteBuffer.limit(this.zzh.offset + this.zzh.size);
                        }
                        long j3 = this.zzh.presentationTimeUs;
                        int size = this.zzg.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                z = false;
                                break;
                            } else {
                                if (this.zzg.get(i).longValue() == j3) {
                                    this.zzg.remove(i);
                                    z = true;
                                    break;
                                }
                                i++;
                            }
                        }
                        this.zzz = z;
                    }
                }
                if (this.zzq && this.zzE) {
                    try {
                        MediaCodec mediaCodec = this.zzj;
                        ByteBuffer[] byteBufferArr = this.zzv;
                        int i2 = this.zzy;
                        zZzS = zzS(j, j2, mediaCodec, byteBufferArr[i2], i2, this.zzh.flags, this.zzh.presentationTimeUs, this.zzz);
                    } catch (IllegalStateException unused2) {
                        zzI();
                        if (this.zzG) {
                            zzY();
                        }
                    }
                } else {
                    MediaCodec mediaCodec2 = this.zzj;
                    ByteBuffer[] byteBufferArr2 = this.zzv;
                    int i3 = this.zzy;
                    zZzS = zzS(j, j2, mediaCodec2, byteBufferArr2[i3], i3, this.zzh.flags, this.zzh.presentationTimeUs, this.zzz);
                }
                if (!zZzS) {
                    break;
                }
                long j4 = this.zzh.presentationTimeUs;
                this.zzy = -1;
            }
            while (zzH()) {
            }
            zzavc.zzb();
        } else {
            zzB(j);
            this.zze.zza();
            int iZzA2 = zzA(this.zzf, this.zze, false);
            if (iZzA2 == -5) {
                zzN(this.zzf.zza);
            } else if (iZzA2 == -4) {
                zzaup.zzd(this.zze.zzc());
                this.zzF = true;
                zzI();
            }
        }
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public boolean zzE() {
        if (this.zzi == null) {
            return false;
        }
        if (zzC() || this.zzy >= 0) {
            return true;
        }
        return this.zzw != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public boolean zzF() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final int zzG(zzanm zzanmVar) throws zzamy {
        try {
            return zzJ(this.zzc, zzanmVar);
        } catch (zzarm e) {
            throw zzamy.zza(e, zzz());
        }
    }

    protected abstract int zzJ(zzark zzarkVar, zzanm zzanmVar) throws zzarm;

    protected zzarg zzK(zzark zzarkVar, zzanm zzanmVar, boolean z) throws zzarm {
        return zzarr.zza(zzanmVar.zzf, false);
    }

    protected abstract void zzL(zzarg zzargVar, MediaCodec mediaCodec, zzanm zzanmVar, MediaCrypto mediaCrypto) throws zzarm;

    protected void zzM(String str, long j, long j2) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    protected void zzN(zzanm zzanmVar) throws zzamy {
        boolean z;
        zzanm zzanmVar2 = this.zzi;
        this.zzi = zzanmVar;
        if (!zzave.zza(zzanmVar.zzi, zzanmVar2 == null ? null : zzanmVar2.zzi) && this.zzi.zzi != null) {
            throw zzamy.zza(new IllegalStateException("Media requires a DrmSessionManager"), zzz());
        }
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec == null || !zzaa(mediaCodec, this.zzk.zzb, zzanmVar2, this.zzi)) {
            if (this.zzD) {
                this.zzC = 1;
                return;
            } else {
                zzY();
                zzU();
                return;
            }
        }
        this.zzA = true;
        this.zzB = 1;
        if (this.zzn) {
            zzanm zzanmVar3 = this.zzi;
            z = zzanmVar3.zzj == zzanmVar2.zzj && zzanmVar3.zzk == zzanmVar2.zzk;
        }
        this.zzs = z;
    }

    protected void zzO(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzamy {
        throw null;
    }

    protected abstract boolean zzS(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzamy;

    protected void zzT() throws zzamy {
    }

    protected final void zzU() throws zzamy {
        zzanm zzanmVar;
        if (this.zzj != null || (zzanmVar = this.zzi) == null) {
            return;
        }
        zzarg zzargVarZzK = this.zzk;
        if (zzargVarZzK == null) {
            try {
                zzargVarZzK = zzK(this.zzc, zzanmVar, false);
                this.zzk = zzargVarZzK;
                if (zzargVarZzK == null) {
                    throw zzamy.zza(new zzarh(this.zzi, (Throwable) null, false, -49999), zzz());
                }
            } catch (zzarm e) {
                throw zzamy.zza(new zzarh(this.zzi, (Throwable) e, false, -49998), zzz());
            }
        }
        if (zzV(zzargVarZzK)) {
            String str = this.zzk.zza;
            this.zzl = zzave.zza < 21 && this.zzi.zzh.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.zzm = zzave.zza < 18 || (zzave.zza == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (zzave.zza == 19 && zzave.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            this.zzn = zzave.zza < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzave.zzb) || "flounder_lte".equals(zzave.zzb) || "grouper".equals(zzave.zzb) || "tilapia".equals(zzave.zzb));
            this.zzo = zzave.zza <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
            this.zzp = (zzave.zza <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (zzave.zza <= 19 && "hb2000".equals(zzave.zzb) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
            this.zzq = zzave.zza == 21 && "OMX.google.aac.decoder".equals(str);
            this.zzr = zzave.zza <= 18 && this.zzi.zzr == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String strValueOf = String.valueOf(str);
                zzavc.zza(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
                this.zzj = MediaCodec.createByCodecName(str);
                zzavc.zzb();
                zzavc.zza("configureCodec");
                zzL(this.zzk, this.zzj, this.zzi, null);
                zzavc.zzb();
                zzavc.zza("startCodec");
                this.zzj.start();
                zzavc.zzb();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                zzM(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                this.zzu = this.zzj.getInputBuffers();
                this.zzv = this.zzj.getOutputBuffers();
                this.zzw = zze() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                this.zzx = -1;
                this.zzy = -1;
                this.zzH = true;
                this.zza.zza++;
            } catch (Exception e2) {
                throw zzamy.zza(new zzarh(this.zzi, (Throwable) e2, false, str), zzz());
            }
        }
    }

    protected boolean zzV(zzarg zzargVar) {
        return true;
    }

    protected final MediaCodec zzW() {
        return this.zzj;
    }

    protected final zzarg zzX() {
        return this.zzk;
    }

    protected void zzY() {
        this.zzw = -9223372036854775807L;
        this.zzx = -1;
        this.zzy = -1;
        this.zzz = false;
        this.zzg.clear();
        this.zzu = null;
        this.zzv = null;
        this.zzk = null;
        this.zzA = false;
        this.zzD = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = false;
        this.zzp = false;
        this.zzr = false;
        this.zzs = false;
        this.zzt = false;
        this.zzE = false;
        this.zzB = 0;
        this.zzC = 0;
        this.zzd.zzb = null;
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec != null) {
            this.zza.zzb++;
            try {
                mediaCodec.stop();
                try {
                    this.zzj.release();
                } finally {
                    this.zzj = null;
                }
            } catch (Throwable th) {
                try {
                    this.zzj.release();
                    throw th;
                } finally {
                    this.zzj = null;
                }
            }
        }
    }

    protected void zzZ(zzapg zzapgVar) {
    }

    protected boolean zzaa(MediaCodec mediaCodec, boolean z, zzanm zzanmVar, zzanm zzanmVar2) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzamw, com.google.android.gms.internal.ads.zzans
    public final int zzq() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    protected void zzs(boolean z) throws zzamy {
        this.zza = new zzapf();
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    protected void zzu(long j, boolean z) throws zzamy {
        this.zzF = false;
        this.zzG = false;
        if (this.zzj != null) {
            this.zzw = -9223372036854775807L;
            this.zzx = -1;
            this.zzy = -1;
            this.zzH = true;
            this.zzz = false;
            this.zzg.clear();
            this.zzs = false;
            this.zzt = false;
            if (this.zzm || ((this.zzp && this.zzE) || this.zzC != 0)) {
                zzY();
                zzU();
            } else {
                this.zzj.flush();
                this.zzD = false;
            }
            if (!this.zzA || this.zzi == null) {
                return;
            }
            this.zzB = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    protected void zzx() {
        this.zzi = null;
        zzY();
    }
}
